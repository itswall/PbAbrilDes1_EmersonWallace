package application;

import analyzer.MoodAnalyzer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        MoodAnalyzer analyzer = new MoodAnalyzer();
        String mood = analyzer.moodAnalyzer(text);
        System.out.println(mood);
    }
}