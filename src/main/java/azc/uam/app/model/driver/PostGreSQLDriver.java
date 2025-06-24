package azc.uam.app.model.driver;

public class PostGreSQLDriver {
    public PostGreSQLDriver() {}

    public void connect() {
        System.out.println("Conectando a PostGreSQL...");
    }

    public void execute(String sql) {
        System.out.println("Ejecutando consulta SQL: " + sql);
    }

    public void disconnect() {
        System.out.println("Desconectando de PostGreSQL...");
    }
}
