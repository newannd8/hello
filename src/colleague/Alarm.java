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
public class Alarm extends Colleague {

    String time;

    public void setAlarm(String time) {
        this.time = time;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void ring() {
        System.out.println("Подъем! Уже "+time+".");
        notifyMediator();
    }
}
