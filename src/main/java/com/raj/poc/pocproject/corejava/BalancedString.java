package com.raj.poc.pocproject.corejava;
import java.util.*;

public class BalancedString {
    
    public static void main(String s[]){
        BalancedString balancedString = new BalancedString();
        int count = 0;
        Scanner scanner = null;
        do {
            scanner = new Scanner(System.in);
            boolean balanced = balancedString.balanced(scanner.nextLine());
            System.out.println("balnaced >> " + balanced);
            count++;
        } while (count < 5);
        
        scanner.close();
    }


    public boolean balanced(String input) {
        int brackets = 0;
        for(char c : input.toCharArray()){      
        
            switch(c) {              
                case '(' :
                    brackets++;
                    break;
                case ')' :                    
                    if(brackets == 0) {
                        return false;
                    }
                    brackets--;
                    break;              
                default :                    
                    break;
            }            
        }
        return brackets == 0;
    }

    // public boolean balanced(String input) {

    //     boolean balanced = false;
    //     boolean opened = false;
    //     boolean closed = false;
    //     for(char c : input.toCharArray()){      
        
    //         switch(c) {              
    //             case '(' :
    //                 opened = true;
    //                 balanced = false;
    //                 break;
    //             case ')' :                    
    //                 if(opened){
    //                     closed = true;
    //                     balanced = true;
    //                 }
    //                 break;              
    //             default :
    //                 if(!opened && !closed) {
    //                     balanced = true;
    //                 }
    //                 break;
    //         }            
    //     }
    //     return balanced;
    // }
}
