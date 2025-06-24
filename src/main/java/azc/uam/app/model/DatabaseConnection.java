package azc.uam.app.model;

public interface DatabaseConnection {

    void connect();
    void execute(String sql);
    void disconnect();
    String getName();
}
