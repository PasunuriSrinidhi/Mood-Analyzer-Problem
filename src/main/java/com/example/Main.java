package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to mood analyzer.");

        // Creating mood analyzer object
        MoodAnalyzer analyzer = new MoodAnalyzer();

        // checking moods
        System.out.println("Mood is " + analyzer.analyzeMood("I am in Sad Mood"));
        System.out.println("Mood is " + analyzer.analyzeMood("I am in Any Mood"));
    }
}