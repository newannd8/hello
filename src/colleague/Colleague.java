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
public abstract class Colleague {

    Mediator mediator;

    public void notifyMediator() {
        mediator.colleagueEvent(this);
    }
}
