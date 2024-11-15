package org.example.commons;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Context {
    private static Context instance; // Instanța unică a clasei
    private Map<String, Object> contextData; // Harta pentru stocarea datelor
    private static final Properties properties = new Properties();

    // Constructor privat pentru Singleton
    private Context() {
        contextData = new HashMap<>();
        // Încărcăm proprietățile din fișierul api.properties
        loadPropertiesFromFile();
    }

    // Metodă pentru a încărca proprietățile din fișierul api.properties
    private void loadPropertiesFromFile() {
        try (FileInputStream inputStream = new FileInputStream("src/main/resources/api.properties")) {
            properties.load(inputStream); // Încarcă proprietățile
            // Salvează proprietățile în contextData
            for (String key : properties.stringPropertyNames()) {
                contextData.put(key, properties.getProperty(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Metodă pentru a obține instanța unică a clasei Context
    public static Context getInstance() {
        if (instance == null) {
            instance = new Context(); // Constructorul va încărca acum proprietățile
        }
        return instance;
    }

    // Metodă pentru a obține o valoare din contextData
    public Object getData(String key) {
        return contextData.get(key); // Obține valoarea asociată cu cheia din contextData
    }

    // Metodă pentru a adăuga o valoare în contextData
    public void setValue(String key, Object value) {
        contextData.put(key, value);
    }
}
