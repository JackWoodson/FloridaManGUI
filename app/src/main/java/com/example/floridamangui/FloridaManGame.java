package com.example.floridamangui;
// import javax.swing.*;
import java.net.SocketTimeoutException;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class FloridaManGame {

    public static void game() {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Florida Man Game where you will be given four answer choices and you must identify the best fit answer to the headline!");
        System.out.println("Type Start To Begin");
        String answer =s.nextLine();
        int correctScore =0;
        int incorrectScore=0;
        int i=0;
                if (answer.equalsIgnoreCase("start")) {
                    while(i<=10) {
                        System.out.println("There are " + (10-i) + " questions remaining");
                    System.out.println("Correct " + correctScore + " Incorrect " + incorrectScore);
                    Headline hL = new Headline();
                    HeadlineBank hb = new HeadlineBank();
                    //System.out.println(hb.shuffle());
                    hb.assign();
                    //hb.shuffle();
                        System.out.println("Please select one of the four answer choices");
                    System.out.println(hL.replacement());

                    answer = s.nextLine();
                    if (answer.equalsIgnoreCase(hL.getKeyword())) {
                        System.out.println("Correct");
                        correctScore++;
                        i++;

                    } else {
                        System.out.println("Incorrect");
                        incorrectScore++;
                        i++;
                    }
                    if (i==11) {
                        System.out.println("Would you like to play again? (yes or no)");
                        answer = s.nextLine();
                        if (answer.equalsIgnoreCase("yes")) {
                            i=1;
                        }
                    }

                    }

                }

    }
}
