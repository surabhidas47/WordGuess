package com.github.zipcodewilmington;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        //System.out.println("Enter a single letter:  ");
        // String userInput =scanner.next();

        String[] wordList = {"giraffe", "cheese", "peach", "vice", "heist"};
        Random random = new Random();
        int randomIndex = random.nextInt(wordList.length);

        String randomWord = wordList[randomIndex];
        int life = randomWord.length();
        guess(randomWord,life);


        System.out.println(randomWord);



           }

           static public void guess(String randomWord, int life) {

            char [] filler = new char[randomWord.length()];
            int i=0;
            while(i< randomWord.length()) {
                filler[i] = '_';
                if (randomWord.charAt(i)==' ') {
                    filler[i]= ' ';
                }
                i++;
            }
            System.out.println(filler);
            System.out.println("Life remaining= "+ life);

            Scanner scanner = new Scanner(System.in);
            ArrayList<Character> dupe= new ArrayList<Character>();

            while(life>0) {
                char letter = scanner.next().charAt(0);

                if(dupe.contains(letter+"")){
                    System.out.println("Already entered letter!");
                    continue;
                }
                dupe.add(letter);

                if(randomWord.contains(letter+"")){
                    for(int j=0;j<randomWord.length();j++){
                        if(randomWord.charAt(j)==letter){
                            filler[j]=letter;
                        }
                    }
                }
                else {
                   life--;
                }

                if(randomWord.equals(String.valueOf(filler))){
                    System.out.println(filler);
                    System.out.println("You win!!");
                    break;
                }
                System.out.println(filler);
                System.out.println("Life remaining= "+ life);
            }
            if(life==0){
                System.out.println("You lose :(");
            }
           }


       }




