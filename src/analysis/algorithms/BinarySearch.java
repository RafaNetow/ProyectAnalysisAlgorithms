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
public class BinarySearch extends Algorithm {

    int key;
    boolean numFound = false;

    public void setNumFound(boolean numFound) {
        this.numFound = numFound;
    }
    public void setKey(int key) {
        this.key = key;
    }
    
    @Override
    void evaluateAlgorithm(int[] array) {
      this.numFound =   binarySearch(array,this.key,array.length);
    }

    
 public boolean binarySearch(int[] data,int key,int size) 
    {
         int low = 0;
         int high = size - 1;
         int []currentArray = data;
         while(high >= low) {
             int middle = (low + high) / 2;
            steps.add(new StepAlgorithmsBinarySearch(currentArray,low,high,middle));
             if(data[middle] == key) {
                 return true;
             }
             if(data[middle] < key) {
                 low = middle + 1;
               steps.add(new StepAlgorithmsBinarySearch(currentArray,low,high,middle));
             }
             if(data[middle] > key) {
                 high = middle - 1;
                   steps.add(new StepAlgorithmsBinarySearch(currentArray,low,high,middle));
             }
        }
        return false;
   }
    
    
    
}
