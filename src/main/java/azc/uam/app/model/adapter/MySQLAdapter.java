package azc.uam.app.model.adapter;

import azc.uam.app.model.DatabaseConnection;
import azc.uam.app.model.driver.MySQLDriver;

public class MySQLAdapter implements DatabaseConnection {
    private final MySQLDriver driver = new MySQLDriver();

    @Override
    public String getName(){
        return "MySQL";
    }

    @Override
    public void connect() {
        driver.connect();
    }

    @Override
    public void execute(String sql) {
        driver.execute(sql);
    }

    @Override
    public void disconnect() {
        driver.disconnect();
    }
}
