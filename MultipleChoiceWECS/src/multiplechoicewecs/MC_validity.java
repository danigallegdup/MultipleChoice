/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplechoicewecs;

/**
 *
 * @author daniela
 */
public class MC_validity {
    protected String option;
    protected char validity;
    protected char letter;
    
    public MC_validity(String s, char v){
        option=s;
        validity = v;
    }
    
    public void add_letter(char c){
        letter = c;
    }
    
    private void printV(){
        System.out.println(option + " -> " + validity);
    } 
    
}
