package org.example.commons;

import java.util.HashMap;
import java.util.Map;

public class Context {
    // Private static instance of the same class that will hold the single instance
    private static Context instance;

    // Map to store context data
    private Map<String, Object> contextData;

    // Private constructor to prevent instantiation from other classes
    private Context() {
        contextData = new HashMap<>();
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
}