/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nikolay.oca.java.se.programmer.i.assessment.test.question2;

/**
 *
 * @author Thomas
 */
public class Question_2 {
    
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        // is true because the string is stored in the String pool   
        System.out.println(s1 == s2);
        // is true because the String are equals
        System.out.println(s1.equals(s2));
        //is false because to String creates a new Object
        System.out.println(sb1.toString() == s1);
        // is true because the String are equals
        System.out.println(sb1.toString().equals(s1));
    }
    
}
