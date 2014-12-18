/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colleague;

import mediator.Mediator;

/**
 *
 * @author Jall
 */
public class Calendar extends Colleague{
    String date;

    public void setDate(String date) {
        this.date = date;
        notifyMediator();
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    
}
