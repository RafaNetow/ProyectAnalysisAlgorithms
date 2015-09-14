

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
import java.util.logging.Level;
import java.util.logging.Logger;



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
    int [] currentArray ;
    int currentStep = -1;
    DrawAlgorithmSteps drawSteps = new DrawAlgorithmSteps();
    public static HashMap getHash(){
        return hashM;
    }
    public static mxGraph getGraph(){
        return graph;
    } 
 
    public static void drawArray(int currentArray[],JTextField texto){
                for(int i =0; i<texto.getText().length();i++){
                  currentArray[i] = Character.getNumericValue(texto.getText().charAt(i));
                  AddVisualElement add = new AddVisualElement(String.valueOf(texto.getText().charAt(i)),50*i,110,"rectangle","green","white");    
            //  Object v1 = this.getGraph().insertVertex(parent, null, number, 20, 110, 50, 50,"shape=rectangle;strokeColor=red;fillColor=white"); 
                } 
                
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
        
         buttonBack = new JButton("Add");
        getContentPane().add(buttonBack);
        
       
        buttonBack.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e) {
             
                currentArray = new int[texto.getText().length()];
                 
                drawArray(currentArray,texto);
            
                     }
        });
    
        buttonPlay = new JButton("Play");
        getContentPane().add(buttonPlay);
        buttonPlay.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              QuickSort currentQuickSort=  (QuickSort) currentAlgorithm;
                currentQuickSort.evaluateAlgorithm(currentArray);
                if(currentQuickSort instanceof QuickSort){
               int i = 0;
               while(i<5){
                   try {
                       drawSteps.drawQuickSort(currentQuickSort,i);
                       
                       Thread.sleep(100);
                       
                       i++;} catch (InterruptedException ex) {
                       Logger.getLogger(GraphicalMain.class.getName()).log(Level.SEVERE, null, ex);
                   }
               } 
               }
                }
        });
        
        buttonOnwards = new JButton("Back");
        getContentPane().add(buttonOnwards);
        buttonOnwards.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                QuickSort currentQuickSort=  (QuickSort) currentAlgorithm;
                currentQuickSort.evaluateAlgorithm(currentArray);
                        currentStep--;
                drawSteps.drawQuickSort(currentQuickSort,currentStep);
            }
        });
        buttonStepByStep = new JButton("Next");
        getContentPane().add(buttonStepByStep);
        buttonStepByStep.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
                 QuickSort currentQuickSort=  (QuickSort) currentAlgorithm;      
                currentQuickSort.evaluateAlgorithm(currentArray);
                  currentStep++;
                drawSteps.drawQuickSort(currentQuickSort,currentStep);
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
