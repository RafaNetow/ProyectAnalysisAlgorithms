/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analysis.algorithms;

import java.util.List;

/**
 *
 * @author Rafael
 */
public class QuickSort extends Algorithm {

   
    
    
    @Override
   void evaluateAlgorithm(int[] arr) {
        quickSort(arr,0,arr.length-1);
    }

    
    int partition(int arr[], int left, int right)
{
      int i = left, j = right;
      int tmp;
      int pivot = arr[(left + right) / 2];
      int [] currentArray = arrayCopy(arr);
      //(int begin,int end,int pivotIndex,int[] array,boolean swap)
    this.steps.add(new StepAlgorithmsQuickSort(i,j,pivot,currentArray,false));
      
 
    while (i <= j) {
            while (arr[i] < pivot){
                  i++;
             this.steps.add(new StepAlgorithmsQuickSort(i,j,pivot,currentArray,false));
            }
             while (arr[j] > pivot){
                  j--;
               this.steps.add(new StepAlgorithmsQuickSort(i,j,pivot,currentArray,false));
             }
               if (i <= j) {
                  tmp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = tmp;
                  //Lista de pasos
                  currentArray = arrayCopy(arr);
                  this.steps.add(new StepAlgorithmsQuickSort(i,j,pivot,currentArray,true));
                  i++;
                  j--;
                 this.steps.add(new StepAlgorithmsQuickSort(i,j,pivot,currentArray,false));
                   System.out.println( System.identityHashCode(steps.get(0).array));
                    System.out.println(System.identityHashCode(steps.get(1).array));
             
               }
      };
     
      return i;
}
 
void quickSort(int arr[], int left, int right) {
    int index = partition(arr, left, right);
      if (left < index - 1)
            quickSort(arr, left, index - 1);
      if (index < right)
            quickSort(arr, index, right);
}


int[] arrayCopy(int[] arr)
{
    int[] newArr=new int[arr.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
    return newArr;
}
}
