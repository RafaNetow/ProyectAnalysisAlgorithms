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
   int [] myIntArray = {1,3,2,10,15,16};  
      algorithmQuickSort.evaluateAlgorithm(myIntArray);
    java.util.Arrays.toString(myIntArray);
       System.out.println(Arrays.toString(myIntArray));
    }
}
