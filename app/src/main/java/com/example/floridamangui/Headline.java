package com.example.floridamangui;
import java.util.ArrayList;
import java.util.List;
public  class Headline {
    private String story;
    private String keyword;
    public static List<String[]> answersChoices = new ArrayList<String[]>();
    private String array;
    private String array2;
    private String array3;
    private String array4;


    /*public Headline(String story, String keyword, List<String[]> answers) {
        this.story = story;
        this.keyword = keyword;
        this.answers = answers;
    }*/

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public List<String[]> getanswersChoices() {
        return answersChoices;
    }

    public void setanswersChoices(List<String[]> answersChoices) {
        this.answersChoices = answersChoices;
    }

    public String replacement() {
        HeadlineBank hb = new HeadlineBank();
        hb.shuffle();
        for(int i=0;i<answersChoices.size();i++) {
            keyword = answersChoices.get(i)[1];
            story = answersChoices.get(i)[0];
            story = story.replace(answersChoices.get(i)[1],"_________");
            array = answersChoices.get(i)[1];
            array2 = answersChoices.get(i)[2];
            array3 = answersChoices.get(i)[3];
            array4 = answersChoices.get(i)[4];
        }

        return story + "\n" + "AnswerChoices: " +array +" " +array2 +" " +array3 +" "+ array4;
    }
//testing
}
