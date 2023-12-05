package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to mood analyzer.");

        // Creating mood analyzer objects
        MoodAnalyzer analyzer1 = new MoodAnalyzer("I am in Sad Mood");
        MoodAnalyzer analyzer2 = new MoodAnalyzer("I am in Any Mood");
        MoodAnalyzer analyzer3 = new MoodAnalyzer(null);

        // checking moods
        System.out.println("Mood is " + analyzer1.analyzeMood());
        System.out.println("Mood is " + analyzer2.analyzeMood());
        System.out.println("Mood is " + analyzer3.analyzeMood());
    }
}