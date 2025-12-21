package com.example;

import com.google.gson.annotations.SerializedName;

public class Event {
    @SerializedName("type")
    public String type1;
    public Actor actor;
    public Repo repo;
    public String created_at;
}
