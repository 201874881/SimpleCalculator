/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

import java.util.Scanner;

/**
 *
 * @author 201874881
 */
public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // input
        Scanner in=new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
   
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        
        //ADD
        System.out.println("num1 + num 2"+"="+(num1 + num2));
        
        //SUBTRACT
        System.out.println("num1- num2"+ "="+(num1-num2));
        
        //MULTIPLY
        System.out.println("num1*num2"+"="+(num1*num2));
        
        //DIVIDE
        System.out.println("num1/num2"+"="+(num1/num2));
    }
    
}
