/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evamonederoapi3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dam115
 */
public class Monedero3IT {
    
    public Monedero3IT() {
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
    @Test
    public void testMondedor3() throws ErrorCantidadInicialException{
        System.out.println("Constructor");
        System.out.println("Constructro sin datos");
        Monedero3 constructorSinDato = new Monedero3();
        assertNotNull(constructorSinDato);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Constructor con datos..... 20");
        Monedero3 constructorConDato = new Monedero3(20);
        assertEquals(20,constructorConDato.getSaldo(),0.0);
        
        System.out.println("Sacar dinero......");
        Monedero3 sacarDinero
    }
    
    /**
     * Test of ingreso method, of class Monedero3.
     */
    @Test
    public void testIngreso1() throws Exception {
        System.out.println("ingreso");
        Double ingreso = null;
        Monedero3 instance = new Monedero3();
        instance.ingreso(ingreso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of retirar method, of class Monedero3.
     */
    @Test
    public void testRetirar() throws Exception {
        System.out.println("retirar");
        Double sacarDinero = null;
        Monedero3 instance = new Monedero3();
        instance.retirar(sacarDinero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verSaldo method, of class Monedero3.
     */
    @Test
    public void testVerSaldo() {
        System.out.println("verSaldo");
        Monedero3 instance = new Monedero3();
        instance.verSaldo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
