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
   static BinarySearch algorithmBinarySearch = new BinarySearch();
   public static void main(String arg[]){
   int [] myIntArray = {3,1,2};  
      algorithmQuickSort.evaluateAlgorithm(myIntArray);
       printQuickSortStep(algorithmQuickSort);
   int [] ArrayToBinarySearch = {1,2,3,4,5,6,7,8,9,10};
    algorithmBinarySearch.setKey(2);
    algorithmBinarySearch.evaluateAlgorithm(ArrayToBinarySearch);
    printBinarySearch(algorithmBinarySearch);
    System.out.println("Binary Encontrado: " +algorithmBinarySearch.numFound);
    
       
   }
public static void printBinarySearch(BinarySearch algorithm){
  int i = 0;
  while(i<algorithm.steps.size()){
      StepAlgorithmsBinarySearch stepBinary = (StepAlgorithmsBinarySearch)algorithm.steps.get(i);
      System.out.println("IndiexHi: "+stepBinary.indexHi);
      System.out.println("IndexLo: "+stepBinary.indexLo);
      System.out.println("Mid: "+stepBinary.mid);
      
      i++;
  }
}
public static void printQuickSortStep(QuickSort algoritm){
    int i = 0;   
   
    while(i<algoritm.steps.size()){
 
        StepAlgorithmsQuickSort stepsQuick = (StepAlgorithmsQuickSort)algoritm.steps.get(i);        
//Object o = "str";
        //String str = (String)o;
        
            System.out.println("left: "+stepsQuick.begin);
            System.out.println("right: "+stepsQuick.end);
            System.out.println("pivot: "+stepsQuick.pivotIndex);
            System.out.println(Arrays.toString(stepsQuick.array));
            System.out.println("Swap: "+stepsQuick.swap);
            i++;
        
    }
}
    
}

    
