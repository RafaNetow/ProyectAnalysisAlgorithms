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
public class DrawAlgorithmSteps  {
    
    public DrawAlgorithmSteps(){}
    
    // begin;
    // end;
    // pivotIndex;
    // swap;
   public void drawQuickSort(QuickSort algoritm, int posStep){
      StepAlgorithmsQuickSort stepsQuick = (StepAlgorithmsQuickSort)algoritm.steps.get(posStep);     
           for(int o = 0; o<stepsQuick.array.length;o++){
       if(stepsQuick.begin == o){
       AddVisualElement add = new AddVisualElement(Integer.toString(stepsQuick.array[o]),50*o,110,"rectangle","green","green");  }
          
      else if(stepsQuick.end==o){
         AddVisualElement add = new AddVisualElement(Integer.toString(stepsQuick.array[o]),50*o,110,"rectangle","green","green");
       }
       else if(stepsQuick.pivotIndex==o){
        AddVisualElement add = new AddVisualElement(Integer.toString(stepsQuick.array[o]),50*o,110,"rectangle","green","blue");
        }else {
             AddVisualElement add = new AddVisualElement(Integer.toString(stepsQuick.array[o]),50*o,110,"rectangle","green","white");
        }
           }
    
    
    }
     
   }
    
    
    
    



