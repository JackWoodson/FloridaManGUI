package com.example.floridamangui;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;

public class HeadlineBank {
    HashMap<Object, Object> hashmap = new HashMap<Object, Object>();
    public static List<String[]> headlineObjects = new ArrayList<String[]>();
    Headline hL = new Headline();
public void assign() {
    String[] closet = {"Florida Man trapped in unlocked closet for two days", "closet", "car", "vault", "store"};
    headlineObjects.add(closet);
    String[] alligator = {"Florida Man survives alligator attack by pocking at its eyes","alligator","iguana","bird","snail"};
    headlineObjects.add(alligator);
    String[] shark = {"Florida Man names pet shark after wife for Valentines Day", "wife", "son", "daughter", "dog"};
    headlineObjects.add(shark);
    String[] mayor = {"Florida man once arrested for fighting drag queen with tiki torch runs for mayor", "mayor","president","governor","Senator"};
    headlineObjects.add(mayor);
    String[] cops = {"Florida man killed by alligator while hiding from cops", "alligator","car","neighbor","snake"};
    headlineObjects.add(cops);
    String[] kitchen = {"Florida man protects car from Hurricane Dorian by parking it in kitchen","kitchen","garage","family room","neighbors yard"};
    headlineObjects.add(kitchen);
    String[] cartwheeling = {"Florida man tries to evade arrest by cartwheeling away from cops","cartwheeling","car","bicycle","skateboard"};
    headlineObjects.add(cartwheeling);
    String[] playstation = {"Florida man calls 911 after playstation stops working","playstation","xbox","iphone","internet"};
    headlineObjects.add(playstation);
    String[] evidence = {"Florida man facing two weeks in jail for eating evidence in court","evidence","sandwich","chicken nuggets","handcuffs"};
    headlineObjects.add(evidence);
    String[] cat = {"Florida man arresting for calling 911 after his cat was denied entry into strip club","cat","dog","parrot","pet rock"};
    headlineObjects.add(cat);

    }

    public void createHashMap() {
        for(int i=0;i<headlineObjects.size();i++) { // i is the key
            String[] array = headlineObjects.get(i);
            hashmap.put(i,array[0]); // headline
            hashmap.put(i,array[1]); // keyword
            hashmap.put(i,array[1] + array[2] + array[3] + array[4]); // answer choices

        }
    }
        public void shuffle() {
                Collections.shuffle(headlineObjects);
            for(int i=0;i<headlineObjects.size();i++) {
                Headline.answersChoices.add(headlineObjects.get(i));
            }
        }

}
