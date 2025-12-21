package com.example;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;



public class Main {
    public static void main(String[] args) {
        

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.github.com/users/SaintMortal/events"))
            
            .GET()
            .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            Gson gson = new Gson();
            Event[] events = gson.fromJson(response.body(), Event[].class);
            for (Event e : events) {
                System.out.println(e.type1 + " - " + e.repo.name + " - " + e.created_at + " " + e.repo.id + " " + e.actor.login);
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}