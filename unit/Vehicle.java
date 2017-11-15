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
public abstract class Vehicle extends Unit{
    protected final VehicleType TYPE;
    protected int fuel;
    protected final int MAXFUEL;
    
    public VehicleType getType()
    {
        return TYPE;
    }
    
    public int getFuel()
    {
        return fuel;
    }
    
    public void setFuel(int fuel)
    {
        this.fuel = fuel;
    }
}
