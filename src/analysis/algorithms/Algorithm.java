/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analysis.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public abstract class Algorithm {
    
    
    
    List<StepAlgorithms> steps;

    public void setSteps(List<StepAlgorithms> steps) {
        this.steps = steps;
    }
    
public Algorithm(){
    steps = new ArrayList<StepAlgorithms>();
}   
    abstract void evaluateAlgorithm(int array[]);
    
}
