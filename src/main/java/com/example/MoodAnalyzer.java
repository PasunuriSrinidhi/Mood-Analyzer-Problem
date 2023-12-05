package com.example;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() {
        try {
            // UC2: handle null message
            if (this.message == null) {
                throw new NullPointerException("Invlid Mood: message is null");
            } else if (message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException exception) {
            return "HAPPY"; // return happy if null
        }
    }
}