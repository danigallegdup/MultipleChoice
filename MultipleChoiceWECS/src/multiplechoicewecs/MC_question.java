/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplechoicewecs;

import java.util.Random;

/**
 *
 * @author daniela
 */
public class MC_question {

    MC_validity[] options;
    String question;
    private int index = 0;

    public MC_question(String q, int n) {
        options = new MC_validity[n];
        question = q;
    }

    private boolean checkIndex() {
        if (index > options.length - 1) {
            System.out.println("array is Full");
            return false;
        }
        return true;
    }

    public void add_answer(String a) {
        if (checkIndex()) {
            MC_validity answer = new MC_validity(a, 'C');
            options[index] = answer;
            index++;
        }
    }

    public void add_option(String a) {
        if (checkIndex()) {
            MC_validity answer = new MC_validity(a, 'X');
            options[index] = answer;
            index++;
        }
    }
    
    
    private void flip(int i1,int i2){
     MC_validity temp = options[i1];
     options[i1] = options[i2];
     options[i2] = temp;
    }
    
    private void cycle(){
       MC_validity temp = options[0];
         for (int j=0; j < options.length-1; j++){
             options[j] = options[j+1];
         }
         options[options.length-1] = temp;
         temp = options[0];
    
    }
    
    public void shuffle(){
        Random rand = new Random(); //instance of random class
        int int_random = rand.nextInt( options.length);
        int int_random2 = rand.nextInt( options.length);
        flip(int_random,int_random2);
         for(int i = 0; i < int_random2; i++){
             cycle();
         }
    }
    
    public String formatQ(){
      shuffle();
       String letters = "abcdefghijklmnopqestuvwxyz";
       String MC =  question ;
       for ( int i =0; i < options.length; i++){
           options[i].add_letter(letters.charAt(i));
           MC = MC + "\n\t" + options[i].letter + ".) " +options[i].option;
       } 
       return MC + "\n";
    }
   
    
    public boolean valid_entry(String content){
        if (content.length() == 0){
                 System.out.println("no entry, try again");
            return false;
        }
        char a = content.charAt(0);
        for (MC_validity option : options) {
            if (a == option.letter) {
                return true ;
            }
        }
     System.out.println("Oh No, no Valid Letter in Input, try again!");
    return false;
    }
    
     public boolean is_correct(char a){
        for (MC_validity option : options) {
            if (a == option.letter) {
                return option.validity == 'C';
            }
        }
         return false;
    }

    
}
