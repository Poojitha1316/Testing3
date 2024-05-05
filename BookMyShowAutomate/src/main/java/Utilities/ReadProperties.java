package Utilities;

import org.apache.commons.lang3.StringUtils;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {
    static Properties properties = new Properties();

    public static String getPropertyy(String key) throws Exception {

        String filePath = System.getProperty("user.dir") + "/src/test/resources/config.properties";
        FileInputStream fis = new FileInputStream(filePath);
        properties.load(fis);

        String value = properties.get(key).toString();
        if (StringUtils.isEmpty(value)) {
            throw new Exception("Value us not specified for key: " + key + " in propertiesFile ");
        }
        return value;
    }


}
