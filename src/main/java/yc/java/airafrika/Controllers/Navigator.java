package yc.java.airafrika.Controllers;

import yc.java.airafrika.Services.AdminService;
import yc.java.airafrika.Utils.PrintStatement;
import yc.java.airafrika.Utils.Session;
import yc.java.airafrika.Utils.Validator;


import java.sql.SQLException;


public class Navigator extends Controller {

    private static Navigator instance;
    private AdminController adminController;
    private final AdminService adminService = new AdminService();
    private Navigator(){
        if(SESSION.has("Admin")){
            adminController = new AdminController();
            adminController.index();
        }

    }

    public static synchronized Navigator INSTANCE(){
        if(instance == null){
            instance = new Navigator();
        }
        return instance;
    }

    public void index(){


            try {
                boolean isRunning = true;
                while (isRunning){
                    PrintStatement.opening("MaCnss Application");
                    PrintStatement.options();
                    String option = scanner.nextLine();

                    if(Validator.validInteger(option) && Integer.parseInt(option) < 5){
                        switch (Integer.parseInt(option)) {
                            case 0 -> {
                                isRunning = false;
                                SESSION.unset();
                            }
                            case 1 -> this.loginAsAdmin();
                        }
                    }
                    else{
                        System.out.println("\nInvalid Entry , Choose one of the following options: ");
                    }
                }

            }catch (Exception e){
                System.out.println("Crashed : "+e);
            }

    }

    public void loginAsAdmin(){
        System.out.println("\n");
        System.out.println("Login as admin , Enter your credentials :");
        System.out.print("-> Email : ");
        String email = scanner.nextLine();
        PrintStatement.validateEmailStatement(email);
        System.out.print("-> Password : ");
        String password = scanner.nextLine();
        PrintStatement.validatePasswordStatement(password);

        try {
            if(adminService.login(email, password) != null){
                SESSION.set("Admin", adminService.login(email, password));
                adminController = new AdminController();
                adminController.index();
            }else {
                System.out.println("Admin not found .");
                PrintStatement.backToMenu();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }




}
