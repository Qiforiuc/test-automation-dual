package org.example.client;

import org.example.commons.Context;

public class ApiClient {
    // Private final properties for baseUrl and context instance
    private final String baseUrl;
    private final Context contextInstance;

    // Constructor to initialize baseUrl and Context instance
    public ApiClient(String baseUrl) {
        this.baseUrl = baseUrl;
        this.contextInstance = Context.getInstance();  // Retrieves the single instance of Context
    }

    // Method to simulate an API call that retrieves data from the Context
    public String get(String endpoint) {
        // Simulate constructing a full URL with the base URL and endpoint
        String url = baseUrl + endpoint;

        // Simulate getting data associated with the endpoint from Context
        Object responseData = contextInstance.getValue(endpoint);

        if (responseData != null) {
            return "Response from " + url + ": " + responseData.toString();
        } else {
            return "No data found at " + url;
        }
    }

    // Method to simulate storing data in Context for a specific endpoint
    public void post(String endpoint, Object data) {
        // Simulate posting data to the endpoint by storing it in Context
        contextInstance.setValue(endpoint, data);
        System.out.println("Posted data to " + baseUrl + endpoint + ": " + data.toString());
    }

    // Getter for baseUrl
    public String getBaseUrl() {
        return baseUrl;
    }

    // Getter for Context instance (not usually exposed but here for example purposes)
    public Context getContextInstance() {
        return contextInstance;
    }
}