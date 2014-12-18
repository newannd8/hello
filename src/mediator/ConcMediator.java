/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import colleague.Alarm;
import colleague.Calendar;
import colleague.CoffeePot;
import colleague.Colleague;

/**
 *
 * @author Jall
 */
public class ConcMediator implements Mediator {

    Alarm alarm;
    Calendar calendar;
    CoffeePot coffeePot;

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public void setCoffeePot(CoffeePot coffeePot) {
        this.coffeePot = coffeePot;
    }

    @Override
    public void colleagueEvent(Colleague colleague) {
        if (colleague instanceof Calendar) {
            calendar=(Calendar) colleague;
            alarm.setAlarm("6.00");
        }
        if (colleague instanceof Alarm) {
            alarm = (Alarm) colleague;
            coffeePot.turnOn();
        }
        if (colleague instanceof CoffeePot) {
            
        }
        
    }
}
