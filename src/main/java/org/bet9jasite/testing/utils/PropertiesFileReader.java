package org.bet9jasite.testing.utils;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesFileReader {

    /**
     * Reads a properties file from the classpath and returns it as a HashMap.
     *
     * @return a HashMap containing the properties, or null if an error occurs
     */
    public static Map<String, String> getProperties() {
        Map<String, String> propertiesMap = new HashMap<>();

        try (InputStream input = PropertiesFileReader.class.getClassLoader().getResourceAsStream("config/base.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find " + "config/base.properties");
                return null;
            }

            Properties prop = new Properties();
            prop.load(input);

            for (String key : prop.stringPropertyNames()) {
                propertiesMap.put(key, prop.getProperty(key));
            }

        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }

        return propertiesMap;
    }
}
