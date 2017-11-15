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
public abstract class Unit_Abs implements Unit{
    protected double life;
    protected Posizione pos;
    protected Weapon firstWeapon;
    protected Weapon secondWeapon;
    protected int maxMovement;
    protected boolean isBlue;
    
    @Override
    public boolean isBlue()
    {
        return isBlue;
    }
    
    @Override
    public double getLife()
    {
        return life;
    }
    
    @Override
    public Posizione getPosition()
    {
        return new Posizione(pos.getX(),pos.getY());
    }
    
    @Override
    public boolean canMove()
    {
        return true;
    }
    
    @Override
    public void setLife(double newLife)
    {
        life = newLife;
    }
    
    private boolean shootOrRespond(Unit target, boolean attacking)
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
            if(attacking)
                target.shootOrRespond((Unit)this, false);
        }
        else
        {
            //destroy
        }
        return true;
    }
    
    
}
