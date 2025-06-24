package azc.uam.app.model.adapter;

import azc.uam.app.model.DatabaseConnection;
import azc.uam.app.model.driver.PostGreSQLDriver;

public class PostGreSQLAdapter implements DatabaseConnection {
    private final PostGreSQLDriver driver = new PostGreSQLDriver();

    @Override
    public String getName() {
        return "PostGreSQL";
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
