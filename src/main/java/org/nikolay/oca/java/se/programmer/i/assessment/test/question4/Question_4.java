/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nikolay.oca.java.se.programmer.i.assessment.test.question4;

/**
 *
 * @author Thomas
 */
public class Question_4 {
    public static void main (String args[]){
        boolean keepGoing =true;
        int count =0;
        int x = 3;
        while(count++ < 3 ){
            
            int y = (1+2*count)%3;
            
            switch(y){
                default: 
                case 0: x -=1;break;
                case 1: x +=5;
            }
        }
        System.out.println(x);
        }
    }
   
