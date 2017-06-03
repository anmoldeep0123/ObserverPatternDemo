/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anmol.sample;

/**
 *
 * @author ADEE
 */
public class Member {

    private String name;
    private Double expenditure;

    public Member(String name, Double expenditure) {
        this.name = name;
        this.expenditure = expenditure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(Double expenditure) {
        this.expenditure = expenditure;
    }
}
