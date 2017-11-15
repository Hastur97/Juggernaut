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
    public int getLife();
    
    public Posizione getPosition();

    public boolean canMove();
    
    public boolean canReach(Posizione target);
    
    public void setLife(int newValue);
    
    public void move(Posizione newPosizione);
    
    public void shoot(Unit target);
}
