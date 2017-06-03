/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anmol.sample;

import java.util.Arrays;

/**
 *
 * @author ADEE
 */
public class Driver {
    public static void main(String[] args) {
        Member anmol = new Member("Anmol", 0.0);
        Member wasif = new Member("Wasif", 0.0);
        Member swaroop = new Member("Swaroop", 0.0);
        
        Expenditure exp = new Expenditure();
        exp.setMembers(Arrays.asList(anmol , wasif , swaroop));
        
        new Observer1(anmol , exp);
        new Observer2(wasif ,exp);
        new Observer3(swaroop ,exp);
        
        exp.addExpenditure(anmol, 100);
        exp.addExpenditure(swaroop, 50);
        exp.addExpenditure(wasif, 300);
        
    }
}
