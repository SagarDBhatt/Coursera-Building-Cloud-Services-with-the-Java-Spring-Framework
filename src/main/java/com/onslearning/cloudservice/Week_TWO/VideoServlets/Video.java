package com.onslearning.cloudservice.Week_TWO.VideoServlets;

public class Video {
    private String name;
    private String URL;
    private long duration;

    public Video(String name, String URL, long duration) {
        this.name = name;
        this.URL = URL;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }
}
