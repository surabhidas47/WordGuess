package com.github.zipcodewilmington;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {

    int element =0;
    private Random random;
    private ArrayList<String> words;


    public Hangman () {
        this.random = new Random();
        this.words= new ArrayList<>();

        words.add("Giraffe");
        words.add("Peach");
        words.add("Cheese");
        words.add("Vice");
        words.add("Heist");
        //want call a method that picks a random word
        wordPicked();

    }

    void wordPicked(){
        //words.size refers to number of elements in the ArrayList...
        //if 3 elements, words.size = 3
        //however elements start counting at index 0 per usual
        int element = random.nextInt(words.size());
        String pickedWord = words.get(element);
        System.out.println(pickedWord);
    }

}
