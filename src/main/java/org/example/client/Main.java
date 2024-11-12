package org.example.client;

public class Main {
    public static void main(String[] args) {
        // Initialize ApiClient with a base URL
        ApiClient apiClient = new ApiClient("https://api.example.com");

        // Post some data to a simulated endpoint
        apiClient.post("/user", "JohnDoe");

        // Retrieve data from the same endpoint
        String response = apiClient.get("/user");
        System.out.println(response);  // Output: Response from https://api.example.com/user: JohnDoe

        // Try to retrieve data from a different endpoint (should return "No data found")
        String missingDataResponse = apiClient.get("/nonexistent");
        System.out.println(missingDataResponse);  // Output: No data found at https://api.example.com/nonexistent
    }
}

