package azc.uam.app.view;

import azc.uam.app.model.DatabaseConnection;
import java.util.Scanner;

public class ConsoleView {

    /**
     * Setup initial console
     */
    public void setupConsole(){
        System.out.println("================== MENU ==================");
        System.out.println(" 1 - MySQL");
        System.out.println(" 2 - PostGreSQL");
        System.out.println(" 3 - Salir");
        System.out.println("==========================================");
    }

    /**
     * Catch Console input from users, implemented to avoid non-numerical inputs
     * @return option
     */
    public int selectOption() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        }catch(Exception e) {
            //Avoid wrong inputs from users
            scanner.nextLine();
            return -1;
        }
    }

    /**
     * Database submenu
     * @param connection Database selected
     */
    public void databaseMenu(DatabaseConnection connection) {
        System.out.println("\n" + "================== MENU " + connection.getName() + " =================");
        System.out.println(" 1 - conectar");
        System.out.println(" 2 - consultar");
        System.out.println(" 3 - desconectar");
        System.out.println(" 4 - regresar");
        System.out.println("===============================================");
    }

    /**
     * Receive database consult from user (Console Input)
     * @return database consult
     */
    public String consult(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Consulta SQL: ");
        return scanner.nextLine();
    }
}
