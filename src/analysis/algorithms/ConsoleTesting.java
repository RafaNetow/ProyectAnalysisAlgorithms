/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analysis.algorithms;

import java.util.Arrays;

/**
 *
 * @author Rafael
 */
public class ConsoleTesting {
  
   static QuickSort algorithmQuickSort = new QuickSort();  
   public static void main(String arg[]){
   int [] myIntArray = {3,1,2};  
      algorithmQuickSort.evaluateAlgorithm(myIntArray);
       printQuickSortStep(algorithmQuickSort);
   
   }

public static void printQuickSortStep(QuickSort algoritm){
    int i = 0;   
   
    while(i<algoritm.steps.size()){
 
        SetpAlgorithmsQuickSort stepsQuick = (SetpAlgorithmsQuickSort)algoritm.steps.get(i);        
//Object o = "str";
        //String str = (String)o;
        
            System.out.println("left: "+stepsQuick.begin);
            System.out.println("right: "+stepsQuick.end);
            System.out.println("pivot: "+stepsQuick.pivotIndex);
            System.out.println(Arrays.toString(stepsQuick.array));
            
        i++;
    }
}
}

    
