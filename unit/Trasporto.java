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
public interface Trasporto extends Unit{
    public boolean canLoad();
    
    public void load(Unit target);
    
    public void unload(Unit target);
    
    public boolean isEmpty();
    
}
