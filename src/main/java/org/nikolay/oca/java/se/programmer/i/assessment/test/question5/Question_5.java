/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nikolay.oca.java.se.programmer.i.assessment.test.question5;

/**
 *
 * @author Thomas
 */
public class Question_5 {
    
    public static void main(String[] args) {
        System.out.print("a");
        try{
            System.out.print("b");
            throw new IllegalArgumentException();
        
        }catch(RuntimeException e){
            System.out.print("c");
            
        }finally{
            System.out.print("d");
        }
        System.out.print("e");
    }
    
}
