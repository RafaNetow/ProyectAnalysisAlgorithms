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
      //(int begin,int end,int pivotIndex,int[] array,boolean swap)
  //    this.steps.add(new SetpAlgorithmsQuickSort(left,right,pivot,arr,false));
      while (i <= j) {
            while (arr[i] < pivot)
                  i++;
            while (arr[j] > pivot)
                  j--;
            if (i <= j) {
                  tmp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = tmp;
                  //Lista de pasos
                  i++;
                  j--;
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
}
