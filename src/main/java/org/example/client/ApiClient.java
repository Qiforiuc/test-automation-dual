package org.example.client;

import org.example.commons.Context;

public class ApiClient {
    private final String baseUrl; // URL-ul de bază pentru API
    private final Context context; // Instanța Singleton a Contextului

    // Constructor pentru a inițializa baseUrl și context
    public ApiClient(String baseUrl) {
        this.baseUrl = baseUrl;
        this.context = Context.getInstance(); // Obține instanța Singleton a Contextului
    }

    // Metodă pentru a obține URL-ul de bază
    public String getBaseUrl() {
        return baseUrl;
    }

    // Metodă pentru a obține instanța Contextului
    public Context getContext() {
        return context;
    }
}
