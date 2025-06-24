package azc.uam.app;

import azc.uam.app.controller.DatabaseController;
import azc.uam.app.view.ConsoleView;

/**
 * @author Christian Aguilera - 2203032706
 */
public class Main {
    public static void main(String[] args) {
        ConsoleView view = new ConsoleView();
        DatabaseController controller = new DatabaseController(view);
        controller.start();
    }
}