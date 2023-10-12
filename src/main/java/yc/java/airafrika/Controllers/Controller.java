package yc.java.airafrika.Controllers;


import yc.java.airafrika.Utils.Session;

import java.util.Scanner;

public abstract class Controller {

    protected static Scanner scanner = new Scanner(System.in);

    protected Session SESSION = Session.getInstance();

}
