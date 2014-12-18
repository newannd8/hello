/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorexample;

import colleague.Alarm;
import colleague.Calendar;
import colleague.CoffeePot;
import mediator.ConcMediator;

/**
 *
 * @author Jall
 */
public class MediatorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alarm a=new Alarm();
        a.setAlarm("7.00");
        Calendar c= new Calendar();
       
        CoffeePot cf=new CoffeePot();
        cf.setType("Экспрессо");
        ConcMediator mediator= new ConcMediator();
        mediator.setAlarm(a);
        mediator.setCalendar(c);
        mediator.setCoffeePot(cf);
        a.setMediator(mediator);
        c.setMediator(mediator);
        cf.setMediator(mediator);
        
         c.setDate("будни");
         a.ring();
        
    }
}
