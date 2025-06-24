package azc.uam.app.controller;

import azc.uam.app.model.DatabaseConnection;
import azc.uam.app.model.adapter.MySQLAdapter;
import azc.uam.app.model.adapter.PostGreSQLAdapter;
import azc.uam.app.view.ConsoleView;

public class DatabaseController {
    private final ConsoleView view;

    public DatabaseController(ConsoleView view) {
        this.view = view;
    }

    public int start(){
        boolean exit = false;
        while (!exit) {
            view.setupConsole();
            int option = view.selectOption();
            DatabaseConnection connection;
            switch (option) {
                case 1 -> {
                    connection = new MySQLAdapter();
                    databaseMenu(connection);
                }
                case 2 -> {
                    connection = new PostGreSQLAdapter();
                    databaseMenu(connection);
                }
                case 3 -> {
                    System.out.println("Ten un buen dia!");
                    exit = true;
                }
                case -1 -> {
                    System.out.println("Opcion no valida.");
                    return start();
                }
                default -> System.out.println("Opción invalida.");
            }
        }
        return 0;
    }

    public int databaseMenu(DatabaseConnection connection){
        boolean connected = false;
        boolean exit = false;
        while (!exit) {
            view.databaseMenu(connection);
            int option = view.selectOption();
            switch (option) {
                case 1 -> {
                    if (connected) {
                        System.out.println("Ya estas conectado a la Base de Datos.");
                    }
                    else {
                        connected = true;
                        connection.connect();
                    }
                }
                case 2 -> {
                    if(!connected) {
                        System.out.println("Primero debes conectarte a la Base de Datos (Opcion 1)");
                    }
                    else{
                        connection.execute(view.consult());
                    }
                }
                case 3 -> {
                    if(connected) {
                        connected = false;
                        connection.disconnect();
                    }
                    else{
                        System.out.println("Desconectado Base de Datos correctamente.");
                    }
                }
                case -1 -> {
                    System.out.println("Opcion no valida.");
                    return databaseMenu(connection);
                }
                case 4 -> {
                    exit = true;
                    connected = false;
                }
                default -> System.out.println("Opcion invalida.");
            }
        }
        return 0;
    }
}
