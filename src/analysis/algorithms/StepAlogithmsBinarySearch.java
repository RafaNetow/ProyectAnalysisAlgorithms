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
public class StepAlogithmsBinarySearch extends StepAlgorithms {

  
    int indexLo;
    int indexHi;
    int mid;
    int compareWith;
    
            
    
    public StepAlogithmsBinarySearch(int[] array,int indexLo,int indexHi,int CompareWith, int mid) {
        super(array);
        this.indexLo = indexLo;
        this.indexHi = indexHi;
        this.compareWith = CompareWith;
        this.mid = mid;
     
    }

   
    
}
