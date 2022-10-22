/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplechoicewecs;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daniela
 */
public class MultipleChoiceWECS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Random rand = new Random(); //instance of random class
        //int upperbound = 25;
        //int int_random = rand.nextInt(upperbound);
       // System.out.println("Random integer value from 0 to" + (upperbound - 1) + " : " + int_random);
       
        Test test = new Test(5);
        test.add_question(q_1());
        test.add_question(q_2());
        test.add_question(q_3());
        test.add_question(q_4());
        test.add_question(q_5());
        test.run_test();
    }

 /* --------------------------------------------------------------------
    WRITE YOUR QUESTIONS
  ---------------------------------------------------------------------*/
    /**
     * Explanation: Java is called ‘Platform Independent Language’ as it 
     * primarily works on the principle of ‘compile once, run everywhere’.
     * @return 
     */
    public static MC_question q_1() {
        String question = "Which statement is true about Java?";
        String answer = "Java is a platform-independent programming language";
        String o1 = "Java is a code dependent programming language"; // o is short for option
        String o2 = "Java is a sequence-dependent programming language";
        String o3 = "Java is a platform-dependent programming language";

        MC_question q = new MC_question(question, 4);
        q.add_answer(answer);
        q.add_option(o1);
        q.add_option(o2);
        q.add_option(o3);
        return q;
    }
     /**
     * Explanation: JDK is a core component of Java Environment and provides all
     * the tools, executables and binaries required to compile, 
     * debug and execute a Java Program.
     * @return 
     */
    public static MC_question q_2() {
        String question = "Which component is used to compile, debug and execute the java programs?";
        String answer = "JDK";
        String o1 = "JVM"; // o is sort for option
        String o2 = "JDB";
        String o3 = "JUnit";

        MC_question q = new MC_question(question, 4);
        q.add_answer(answer);
        q.add_option(o1);
        q.add_option(o2);
        q.add_option(o3);
        return q;
    }
    
     /**
     * Explanation: Pointers is not a Java feature. Java provides an efficient
     * abstraction layer for developing without using a pointer in Java. 
     * Features of Java Programming are Portable, Architectural Neutral,
     * Object-Oriented, Robust, Secure, Dynamic and Extensible, etc.
     * @return 
     */
    public static MC_question q_3() {
        String question = "Which one of the following is not a Java feature?";
        String answer = "Use of pointers";
        String o1 = "Portable"; // o is sort for option
        String o2 = "Dynamic and Extensible";
        String o3 = "Object-oriented";

        MC_question q = new MC_question(question, 4);
        q.add_answer(answer);
        q.add_option(o1);
        q.add_option(o2);
        q.add_option(o3);
        return q;
    }
    
     /**
     * Explanation: Operator ++ has more preference than *, thus g becomes 4 
     * and when multiplied by 8 gives 32.
     * @return 
     */
    public static MC_question q_4() {
        String question = "What does this output? \n\n\tint g = 3;\n" +
             "\tSystem.out.print(++g * 8);\n";
        String answer = "32";
        String o1 = "25"; // o is sort for option
        String o2 = "24";
        String o3 = "33";

        MC_question q = new MC_question(question, 4);
        q.add_answer(answer);
        q.add_option(o1);
        q.add_option(o2);
        q.add_option(o3);
        return q;
    }
    
     /**
     * Explanation: String(chars) is a constructor of class string, 
     * it initializes string s with the values stored in character array chars,
     * therefore s contains “abc”.
     * @return 
     */
    public static MC_question q_5() {
        String question = "What will be the output of the following Java code?/n"
                + "\n\n\tchar chars[] = {'a', 'b', 'c'};\n" +
            "\tString s = new String(chars);\n" +
            "\tSystem.out.println(s);\n";
        String answer = "abc";
        String o1 = "error"; // o is sort for option
        String o2 = "[chars]";
        String o3 = "a";

        MC_question q = new MC_question(question, 4);
        q.add_answer(answer);
        q.add_option(o1);
        q.add_option(o2);
        q.add_option(o3);
        return q;
    }

    public static void MC_rep(MC_question q) {
        boolean isCorrect = false;
        while (!isCorrect) {
            String mc = q.formatQ();
            System.out.println(mc);
            String content = "";
            Scanner userIn = new Scanner(System.in);
            content = content + userIn.nextLine();
            char a = content.charAt(0);
            isCorrect = q.is_correct(a);
            System.out.println(isCorrect);
        }
    }

}

/* --------------------------------------------------------------------
    
  ---------------------------------------------------------------------*/
