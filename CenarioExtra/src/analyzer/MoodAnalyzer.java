package analyzer;

public class MoodAnalyzer {

    private int countEmote(String text, String emoji) {
        int count = 0;
        int index = text.indexOf(emoji);

        while (index != -1) {
            count++;
            index = text.indexOf(emoji, index + 1);
        }
        return count;
    }

    public String moodAnalyzer(String text) {
        int happy = countEmote(text, ":-)");
        int sadness = countEmote(text, ":-(");

        if (happy == sadness){
            return "Neutral";
        }
        else if (happy > sadness){
            return "Happy";
        }
        else {
            return "Sad";
        }
    }
}
