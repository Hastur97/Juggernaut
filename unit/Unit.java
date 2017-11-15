/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit;

import utility.Posizione;
/**
 *
 * @author Roberto
 */
public interface Unit {
    public double getLife();
    
    public Posizione getPosition();

    public boolean canMove();
    
    public void setLife(double newValue);
    
    public void move(Posizione newPosizione);
    
    public boolean shoot(Unit target);
    
    public double getCover();
    
    public boolean isBlue();
}
