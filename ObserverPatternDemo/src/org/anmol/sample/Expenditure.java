/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anmol.sample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADEE
 */
public class Expenditure {

    private List<Member> members;
    private List<Observer> observers = new ArrayList<Observer>();

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void addExpenditure(Member member, double spends) {
        Member memberFromList = members.get(members.indexOf(member));
        double currentExpense = memberFromList.getExpenditure();
        currentExpense = currentExpense + spends;
        memberFromList.setExpenditure(currentExpense);
        notifyAllObservers();
    }

    public void notifyAllObservers() {
        observers.forEach(observer -> observer.update());
    }

    public Double totalExpenses() {
        double sum = 0.0;
        for (Member member : members) {
            sum = sum + member.getExpenditure();
        }
        return sum;
    }
}
