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
public class CoffeePot extends Colleague {

    String type;

    public void setType(String type) {
        this.type = type;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void turnOn() {
        System.out.println("Кофеварка включена. Готовим "+type+".");
        System.out.println("Прошло 5 минут...");
        turnOff();
        
    }

    public void turnOff() {
         System.out.println("Кофеварка выключена. Ваш "+type+" готов.");
        
    }
}
