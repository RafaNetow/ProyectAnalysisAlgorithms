/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analysis.algorithms;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.HashMap;
import javax.swing.*;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;



/**
 *
 * @author Rafael
 */
public class Principal extends JFrame {
    protected static mxGraph graph = new mxGraph();
    protected static HashMap hashM = new HashMap();
   private mxGraphComponent graphComponent;
       private JTextField texto; 
   String[] algorithmsStrings = { "QuickSort", "BinarySearch"};
    JComboBox algorithmList = new JComboBox(algorithmsStrings);
    private Object cell;
    Algorithm currentAlgorithm;
    private JButton bottomEvaluate;

    public Principal(){
        super("Algorithms");
        initGUI();
    
    }
    
    private void initGUI(){
        setSize(700,500);
        setLocationRelativeTo(null);
      
        graphComponent = new mxGraphComponent(graph);
        graphComponent.setPreferredSize(new Dimension(200, 200));
        
        getContentPane().add(graphComponent);
        algorithmList.setMaximumSize( algorithmList.getPreferredSize() );
        getContentPane().add(algorithmList);
        
        texto = new JTextField();
        getContentPane().add(texto);
        texto.setPreferredSize(new Dimension(420, 21));
        setLayout(new FlowLayout(FlowLayout.LEFT));
    }

}
