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

    public void setKey(int key) {
        this.key = key;
    }
    
    @Override
    void evaluateAlgorithm(int[] array) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
 public boolean binarySearch(int[] data,int key,int size) 
    {
         int low = 0;
         int high = size - 1;
          
         while(high >= low) {
             int middle = (low + high) / 2;
             if(data[middle] == key) {
                 return true;
             }
             if(data[middle] < key) {
                 low = middle + 1;
             }
             if(data[middle] > key) {
                 high = middle - 1;
             }
        }
        return false;
   }
    
    
    
}
