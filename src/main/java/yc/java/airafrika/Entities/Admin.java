package yc.java.airafrika.Entities;

import yc.java.airafrika.Entities.Abstracts.User;

public class Admin extends User {


    private static Admin instance;

    private Admin(String id, String firstName, String lastName, String email, String password, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public static synchronized Admin getInstance(String id, String firstName, String lastName,
                                                 String email, String password, String phoneNumber){
        if(instance == null){
            instance = new Admin(id, firstName, lastName, email, password, phoneNumber);
        }
        return instance;
    }




    @Override
    public String toString() {
        return "Admin{" +
                "id =" + this.id +
                ", firstName = '" + this.firstName + '\'' +
                ", lastName = '" + this.lastName + '\'' +
                ", email = '" + this.email + '\'' +
                ", password = '" + this.password + '\'' +
                ", phoneNumber = '" + this.phoneNumber + '\'' +
                '}';
    }
}
