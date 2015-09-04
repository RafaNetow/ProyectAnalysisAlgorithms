/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analysis.algorithms;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rafael
 */
public class QuickSortTest {
    
    public QuickSortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of evaluateAlgorithm method, of class QuickSort.
     */
    @Test
    public void testEvaluateAlgorithm() {
        System.out.println("evaluateAlgorithm");
        int[] arr = null;
        QuickSort instance = new QuickSort();
        instance.evaluateAlgorithm(arr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of partition method, of class QuickSort.
     */
    @Test
    public void testPartition() {
        System.out.println("partition");
        int[] arr = null;
        int left = 0;
        int right = 0;
        QuickSort instance = new QuickSort();
        int expResult = 0;
        int result = instance.partition(arr, left, right);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quickSort method, of class QuickSort.
     */
    @Test
    public void testQuickSort() {
        System.out.println("quickSort");
        int[] arr = null;
        int left = 0;
        int right = 0;
        QuickSort instance = new QuickSort();
        instance.quickSort(arr, left, right);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
