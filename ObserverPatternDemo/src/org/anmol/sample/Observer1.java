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
public class Observer1 extends Observer {

    private Member memberObserver;

    public Observer1(Member memberObserver, Expenditure expenditure) {
        this.memberObserver = memberObserver;
        this.expenditure = expenditure;
        this.expenditure.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("----------Notification ----------- " + memberObserver.getName() + " -------------");
        this.expenditure.getMembers().forEach(member -> {
            System.out.println(member.getName() + " --- expenses --- " + member.getExpenditure());
        });
        System.out.println("--Total Expense-- " + this.expenditure.totalExpenses());
        System.out.println("------Notification Complete -------- ");
    }

}
