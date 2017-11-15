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
public enum VehicleType {
    TERRA("E"), ARIA("A"), ACQUA("W");
    private final String id;
    VehicleType(String id)
    {
        this.id = id;
    }
    public String getType()
    {
        return this.id;
    }
}
