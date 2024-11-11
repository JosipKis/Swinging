package Model;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DatabaseConfig {

    private final String DB_URL;
    private final String DB_USERNAME;
    private final String DB_PASSWORD;

    public DatabaseConfig() {
        Properties properties = new Properties();

        try (InputStream input = getClass().getClassLoader().getResourceAsStream("secret.properties")) {
            if (input == null) {
                throw new IOException("Unable to find secret.properties");
            }
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.DB_URL = properties.getProperty("DB_URL");
        this.DB_USERNAME = properties.getProperty("DB_USER");
        this.DB_PASSWORD = properties.getProperty("DB_PASS");
    }

    public String getDbUrl() {
        return DB_URL;
    }

    public String getDbUsername() {
        return DB_USERNAME;
    }

    public String getDbPassword() {
        return DB_PASSWORD;
    }
}