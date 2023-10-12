package yc.java.airafrika.Controllers;


import yc.java.airafrika.Entities.Admin;
import yc.java.airafrika.Utils.PrintStatement;
import yc.java.airafrika.Utils.Validator;

public class AdminController extends Controller {
    private Admin admin;

    public AdminController() {
        if(!SESSION.has("Admin")){
           Navigator.INSTANCE().index();
        }else {
            this.admin = (Admin) SESSION.get("Admin");
        }
    }

    public  void index(){
        PrintStatement.opening("Admin Panel");
        try {

            boolean isRunning = true;

            while (isRunning){
                PrintStatement.adminOptions();
                String option = scanner.nextLine();
                if(Validator.validInteger(option)){
                    switch (Integer.parseInt(option)) {
                        case 0 -> {
                            isRunning = false;
                            SESSION.remove("Admin");
                        }
                        case 1 -> this.createAgent();
                        case 2 -> this.updateAgent();
                        case 3 -> this.getAgent();
                        case 4 -> this.getAllAgents();
                        case 5 -> this.deleteAgent();
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

    public void createAgent(){

    }

    public void updateAgent(){


    }

    public void getAgent(){


    }

    public void getAllAgents(){
    }

    public void deleteAgent() {

    }
}
