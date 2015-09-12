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
public class GraphicalMain extends JFrame {
   
    protected static mxGraph graph = new mxGraph();
    protected static HashMap hashM = new HashMap();
   private mxGraphComponent graphComponent;
    private JTextField texto; 
   String[] algorithmsStrings = { "QuickSort", "BinarySearch"};
    JComboBox algorithmList = new JComboBox(algorithmsStrings);
    private Object cell;
    Algorithm currentAlgorithm;
    private JButton buttonBack;
    private JButton buttonPlay;
    private JButton buttonOnwards;
    private JButton buttonStepByStep;
    
    public static HashMap getHash(){
        return hashM;
    }
    public static mxGraph getGraph(){
        return graph;
    } 

    public GraphicalMain(){
        super("Algorithms");
        initGUI();
    
    }
    
    private void initGUI(){
        setSize(700,500);
        setLocationRelativeTo(null);
      
        graphComponent = new mxGraphComponent(graph);
        graphComponent.setPreferredSize(new Dimension(670, 300));
        
        getContentPane().add(graphComponent);
        algorithmList.setMaximumSize( algorithmList.getPreferredSize() );
        getContentPane().add(algorithmList);
        
        texto = new JTextField();
        getContentPane().add(texto);
        texto.setPreferredSize(new Dimension(420, 21));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
         buttonBack = new JButton("Back");
        getContentPane().add(buttonBack);
        buttonBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("");
                JOptionPane.showMessageDialog(null, "Button Back Presionado");
            }
        });
    
        buttonPlay = new JButton("Play");
        getContentPane().add(buttonPlay);
        buttonPlay.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                texto.setText("");
                 JOptionPane.showMessageDialog(null,"Button Play Pressionado");
            }
        });
        
        buttonOnwards = new JButton("Onward");
        getContentPane().add(buttonOnwards);
        buttonOnwards.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                texto.setText("");
                JOptionPane.showMessageDialog(null,"Button Onwards Presionado");
            }
        });
        buttonStepByStep = new JButton("StepByStep");
        getContentPane().add(buttonStepByStep);
        buttonStepByStep.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
                texto.setText("");
                JOptionPane.showMessageDialog(null,"Button StepBySep");
            }
        });
        
        algorithmList.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox) e.getSource();
                String AutomatonName = (String) cb.getSelectedItem();
                 switch (AutomatonName) {
                     case "QuickSort":
                         currentAlgorithm = new QuickSort();
                         JOptionPane.showMessageDialog(null, "Current Algorithm is QuickSort");
                         break;
                     case "BinarySearch":
                         currentAlgorithm = new BinarySearch();
                          JOptionPane.showMessageDialog(null, "Current Algorithm is BinarySearch");
                            break;
                 }
            }
        
        });
        
        
    }

}
