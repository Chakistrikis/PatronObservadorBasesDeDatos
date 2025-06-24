package azc.uam.app.model.driver;

public class MySQLDriver {
    public MySQLDriver() {}

    public void connect() {
        System.out.println("Conectando a MySQL...");
    }

    public void execute(String sql) {
        System.out.println("Ejecutando consulta: " + sql);
    }

    public void disconnect() {
        System.out.println("Desconectando de MySQL...");
    }
}
