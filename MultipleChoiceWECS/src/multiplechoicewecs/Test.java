/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplechoicewecs;

import java.util.Scanner;

/**
 *
 * @author daniela
 */
public class Test {

    MC_question[] questions;
    int i = 0;
    int score = 0;
    int q_num = 1;

    public Test(int n) {
        questions = new MC_question[n];
    }

    public void add_question(MC_question q) {
        questions[i] = q;
        i++;
    }

    public void run_test() {
        for (MC_question question : questions) {
            String mc = question.formatQ();
            System.out.println("\n" + q_num + ".) " + mc);
            String content = "";
            Scanner userIn = new Scanner(System.in);
            content = content + userIn.nextLine(); 
            content = content.toLowerCase();
            boolean isValid = question.valid_entry(content);
           
            if (!isValid) {
                mc = question.formatQ();
                System.out.println("\n" + q_num + ".) " + mc);
                content = "";
                userIn = new Scanner(System.in);
                content = content + userIn.nextLine();
                content = content.toLowerCase();
                char a = content.charAt(0);
            }
            char a = content.charAt(0);
            boolean isCorrect = question.is_correct(a);
            if (isCorrect) {
                score++;
            }
            q_num++;
        }
        // double percentage = (score/questions.length);
        System.out.println("YOUR SCORE IS: " + score + " out of "
                + questions.length);
    }

}
