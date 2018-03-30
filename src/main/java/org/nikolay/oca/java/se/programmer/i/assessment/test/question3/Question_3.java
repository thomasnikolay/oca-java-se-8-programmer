/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nikolay.oca.java.se.programmer.i.assessment.test.question3;

interface HasTail {int getTailLength();}
abstract class Puma implements HasTail{
    //getTailLength() in Puma cannot implement getTailLength() in HasTail attempting to assign weaker access privileges; was public
//    protected int getTailLength(){ return 4;}
    
}

//public class Cougar extends Puma{
//    
//    public static void main(String[] args) {
//        Pump puma = new Puma();
//        System.out.println(pump.getTailLength());
//    }
//    
//    public int getTailLength(int length){return 2;}
//}