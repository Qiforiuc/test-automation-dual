package org.example.commons;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private static Context instance; // Instanța unică a clasei
    private Map<String, Object> contextData; // Harta pentru stocarea datelor

    // Constructor privat pentru Singleton
    private Context() {
        contextData = new HashMap<>();
    }

    // Metodă pentru a obține instanța unică a clasei Context
    public static Context getInstance() {
        if (instance == null) {
            instance = new Context();
        }
        return instance;
    }

    // Metodă pentru a adăuga o valoare în contextData
    public void setValue(String key, Object value) {
        contextData.put(key, value);
    }

    // Metodă pentru a obține o valoare din contextData
    public Object getValue(String key) {
        return contextData.get(key);
    }
}
