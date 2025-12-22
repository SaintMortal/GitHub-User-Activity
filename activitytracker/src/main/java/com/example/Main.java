package com.example;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import com.google.gson.Gson;



public class Main {
    public static void main(String[] args) {
        String username = "SaintMortal"; // Replace with desired GitHub username

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.github.com/users/" + username + "/events"))
            
            .GET()
            .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            //System.out.println(response.body());
            Gson gson = new Gson();
            Event[] events = gson.fromJson(response.body(), Event[].class);

            ArrayList<String> eventList = new ArrayList<String>();
            eventList.add(events[0].repo.id);
            int counter = 0;
            for (int i = 0; i < events.length; i++ ) {
                Event e = events[i];
                for (int j = 0 + counter; j < eventList.size(); j++) {
                    if (eventList.get(j).equals(e.repo.id)) {
                        System.out.println("Этот элемент уже есть");
                        break;
                    }else {
                        counter++;
                        eventList.add(e.repo.id);
                        break;
                    }
                }
            }
            //System.out.println(eventList);

            for (int i = 0; i < eventList.size(); i++) {
                String repoName = "";
                for (Event e : events) {
                    if(eventList.get(i).equals(e.repo.id)) {
                        repoName = e.repo.name;
                    }
                }
            show (events, eventList, i, repoName);
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

    }

    static void show(Event[] events, ArrayList<String> eventList, int i, String repoName) {
                int eventCount = 0;
                for (Event e : events) {
                    if (e.type1.equals("PushEvent") && e.repo.id.equals(eventList.get(i))) {
                        eventCount++;
                        // System.out.println(e.type1 + " - " + e.repo.name + " - " + e.created_at + " " + e.repo.id + " " + e.actor.login);
                    }
                }
                System.out.println("Pushed " + eventCount + " times to the " + repoName + " repository.");
    }
}