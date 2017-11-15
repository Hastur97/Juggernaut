/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit;

/**
 *
 * @author Roberto
 */
public abstract class Trasporto extends Vehicle{
    public abstract boolean canLoad();
    
    public abstract void load(Unit target);
    
    public abstract void unload(Unit target);
    
    public abstract boolean isEmpty();
    
}
