package Utilities;
// Importing required external libraries
import org.apache.commons.lang3.StringUtils;
import java.io.FileInputStream;
import java.util.Properties;

// Utility class for reading properties from a configuration file
public class ReadProperties {

    // Static Properties object to store key-value pairs
    static Properties properties = new Properties();

    // Method to get the value associated with a given key from the properties file
    public static String getPropertyy(String key) throws Exception {
        // Constructing the file path to the properties file using the project directory
        String filePath = System.getProperty("user.dir") + "/src/test/resources/config.properties";
        FileInputStream fis = new FileInputStream(filePath);
        properties.load(fis);

        // Retrieving the value associated with the provided key
        String value = properties.get(key).toString();
        // Checking if the retrieved value is empty or null
        if (StringUtils.isEmpty(value)) {
            throw new Exception("Value us not specified for key: " + key + " in propertiesFile ");
        }
        return value;
    }

}
