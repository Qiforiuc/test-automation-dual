package org.example.commons;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Context {
    // Private static instance of the same class that will hold the single instance
    private static Context instance;

    // Map to store context data
    private Map<String, Object> contextData;

    // Private constructor to prevent instantiation from other classes
    private Context() {
        contextData = new HashMap<>();
        loadPropertiesFromFile();
    }

    // Public method to create or return the existing instance (Singleton)
    public static Context getInstance() {
        if (instance == null) {
            instance = new Context();
        }
        return instance;
    }

    // Public method to get a value from the context by key
    public Object getValue(String key) {
        return contextData.get(key);
    }

    // Public method to set a value in the context
    public void setValue(String key, Object value) {
        contextData.put(key, value);
    }

    private void loadPropertiesFromFile() {
        Properties properties = new Properties();
        try (InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("api.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find api.properties");
                return;
            }
            properties.load(input);

            // Store all properties in the contextData map
            for (String key : properties.stringPropertyNames()) {
                contextData.put(key, properties.getProperty(key));
            }

            System.out.println("Properties loaded successfully from api.properties");
        } catch (IOException ex) {
            System.err.println("Error loading properties from api.properties: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
