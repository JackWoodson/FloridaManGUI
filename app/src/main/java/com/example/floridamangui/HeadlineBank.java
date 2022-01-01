package com.example.floridamangui;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;

public class HeadlineBank {
    public HashMap<Integer, String[]> hashmap = new HashMap<Integer, String[]>();
    public static List<String[]> headlineObjects = new ArrayList<String[]>();
    public static HashMap<Integer, Object[]> players = new HashMap<Integer, Object[]>();
    Headline hL = new Headline();
    ArrayList<String[]> playerInfo = new ArrayList<>();
    int highscore = 0;

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
    String[] Squirrel = {"FLorida man attacked by squirrel while taking selfie","squirrel","cat" ,"alligator","iguana"};
    headlineObjects.add(Squirrel);

    String[] plane = {"Florida man arrested for making a radar penis","penis","alligator","butt","McDonalds Logo"};

    headlineObjects.add(plane);

    String[] wendy = {"Florida man arrested after throwing alligator into wendy's drive thru","alligator","bomb","stink bomb","skunk"};
    headlineObjects.add(wendy);
    String[] baby = {"Florida man steals a car and after realizing a baby is inside returns it", "baby", "gun","cop badge","lolly pops"
    };
    headlineObjects.add(baby);

    String[] dirt = {"Florida man claims there to be dirt in his burger but turns out to be seasoning","dirt","flies","alligator meat","technology"};
    headlineObjects.add(dirt);
    String[] gun = {"FLorida man claims to shoot down hurrican Irma","wrestle","drive","fight"};
    headlineObjects.add(gun);

    String[] ambulance = {"FLorida man gets tired of waiting at hospital and steals ambulance","ambulance","cop car","wheelchair","car"};
    headlineObjects.add(ambulance);
     String[] bubble = {"FLorida man tries to run to bermuda in bubble","car","hiking Shoes","cop car"};
     headlineObjects.add(bubble);

    String[] chicken = {"FLorida man arrested after assaulting women with chicken","chicken","gun","cop car","alligator",};
    headlineObjects.add(chicken);
    String[] babies = {"Florida man climbs on swingset to tell children where babies come from","babies","alligators","reindeer","Santa"};
    headlineObjects.add(babies);

    //Pre populating players
    String[] player1 = {"Jack","helloworld"};
    playerInfo.add(player1);

    String[] player2 = {"dog","cat"};
    playerInfo.add(player2);

    String[] player3 = {"cat","dog"};
    playerInfo.add(player3);

    for(int i=0;i<playerInfo.size();i++){
        players.put(i,playerInfo.get(i));
    }
            //
}

    public void createHashMap() {
        for(int i=0;i<headlineObjects.size();i++) { // i is the key

            hashmap.put(i,headlineObjects.get(i)); // headline
            // answer choices

        }
    }
    public static void SerializableParceable(EditText something,EditText something2) {

        EditText[] something0 = {something,something2};
        players.put(players.size(),something0 );

    }

    public void shuffle() {
                Collections.shuffle(headlineObjects);
            for(int i=0;i<headlineObjects.size();i++) {
                Headline.answersChoices.add(headlineObjects.get(i));
            }
        }

}
