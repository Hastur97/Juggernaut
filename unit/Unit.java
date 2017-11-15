/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit;
import utility.Posizione;
import armi.*;

/**
 *
 * @author Roberto
 */
public abstract class Unit {
    protected double life;
    protected Posizione pos;
    protected Weapon firstWeapon;
    protected Weapon secondWeapon;
    protected int maxMovement;
    protected boolean isBlue;
    
    public boolean isBlue()
    {
        return isBlue;
    }
    
    public double getLife()
    {
        return life;
    }
    
    public Posizione getPosition()
    {
        return new Posizione(pos.getX(),pos.getY());
    }
    
    public boolean canMove()
    {
        return true;
    }
    
    public void setLife(double newLife)
    {
        life = newLife;
    }
    public boolean shoot(Unit target)
    {
        boolean result = singleShoot(target);
        if (!result)
            return false;
        if(target.getLife() > 0)
            target.singleShoot(this);
        else
        {
            //destroy
        }
        return true;
    }
    
    private boolean singleShoot(Unit target)
    {
        double weaponRatio = 0;
        Weapon weapon = null;
        if(firstWeapon == null)
            return false;
        else if(firstWeapon.getAmmo() != 0)
        {
            weaponRatio = firstWeapon.damageRatio(target);
            weapon = firstWeapon;
        }
        if(secondWeapon != null && secondWeapon.getAmmo() != 0 && weaponRatio < secondWeapon.damageRatio(target))
        {
            weaponRatio = secondWeapon.damageRatio(target);
            weapon = secondWeapon;
        }
        if(weapon == null)
            return false;
        weapon.setAmmo(weapon.getAmmo()-1);
        double terrainRatio = target.getCover();
        double newLife = target.getLife() - (double) getLife() * weaponRatio * terrainRatio;
        if(newLife > 0)
        {
            target.setLife(newLife);
        }
        else
        {
            target.setLife(0);
        }
        return true;
    }
    
    public double getCover()
    {
        return 0;
        // molto temporaneo
    }
    
    public abstract void move(Posizione pos);
}
