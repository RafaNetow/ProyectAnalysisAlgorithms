/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analysis.algorithms;

/**
 *
 * @author Rafael
 */
public class StepAlgorithmsQuickSort extends StepAlgorithms {
    int begin;
    int end;
    int pivotIndex;
    boolean swap;
    public StepAlgorithmsQuickSort(int begin,int end,int pivotIndex,int[] array,boolean swap) {
    super(array);
    this.begin = begin;
    this.end = end;
    this.pivotIndex = pivotIndex;
    this.swap = swap;
    
    }
    
}
