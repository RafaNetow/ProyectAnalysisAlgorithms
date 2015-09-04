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
public class SetpAlgorithmsQuickSort extends StepAlgorithms {
    int begin;
    int end;
    int pivotIndex;
    boolean swap;
    public SetpAlgorithmsQuickSort(int begin,int end,int pivotIndex,int[] array,boolean swap) {
        super(array);
    this.begin = begin;
    this.end = end;
    this.pivotIndex = pivotIndex;
    this.swap = swap;
    
    }
    
}
