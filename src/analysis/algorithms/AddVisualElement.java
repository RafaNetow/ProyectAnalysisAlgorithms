/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analysis.algorithms;

  import java.util.HashMap;

        import com.mxgraph.view.mxGraph;

/**
 *
 * @author Rafael
 */
public class AddVisualElement extends GraphicalMain {
    
    public AddVisualElement(String number){
        this.getGraph().getModel().beginUpdate();
         Object parent = this.getGraph().getDefaultParent();
           Object v1 = this.getGraph().insertVertex(parent, null, number, 330, 30, 100, 50,"shape=rectangle");   
           this.getHash().put(number, v1);
        this.getGraph().getModel().endUpdate();
    }
    
}
