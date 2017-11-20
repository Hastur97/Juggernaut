package armi;

import unit.Fanteria;
import unit.Unit;
import unit.Vehicle;

//TODO completa JML funzione setAmmo!

public class Weapon{
	private double damTroops;
	private double damEarth;
	private double damWater;
	private double damAir;
	
	protected int maxAmmo;
	private int ammo;
	
	//@requires maxAmmo>=0 && fanti>=0 && fanti<=1 && terra>=0 && terra<=1 && acqua>=0 && acqua<=1 && aria>=0 && aria<=1
	//@ensures \old(maxAmmo)== newMaxAmmo && \old(damTroops)== fanti && \old(damEarth)==terra && \old(damWater)==acqua && \old(damAir)==aria
	public Weapon(int newMaxAmmo, double fanti, double terra, double acqua, double aria){
		//TODO caso di if per controllare? O bastano le condizioni JML?
		this.maxAmmo = newMaxAmmo;
		this.damTroops = fanti;
		this.damEarth = terra;
		this.damWater = acqua;
		this.damAir = aria;
	}
	
	//@ensures \old(damTroops)==damTroops && \old(damEarth)==damEarth && \old(damAir)==damAir && \old(damWater)==damWater && \old(ammo)==ammo && \old(maxAmmo) == maxAmmo
	public int getAmmo(){
		return this.ammo;
	}
	
	//@requires ammo
	//@ensures
	public void setAmmo(int ammo){
		if(this.ammo + ammo <= maxAmmo && this.ammo + ammo >=0)
			this.ammo += ammo;
		else if(this.ammo + ammo > maxAmmo)
			this.ammo = this.maxAmmo;
		else if(this.ammo + ammo < 0)
			this.ammo = 0;
	}

	//@requires target!=null
	//@ensures \old(damTroops)==damTroops && \old(damEarth)==damEarth && \old(damAir)==damAir && \old(damWater)==damWater && \old(ammo)==ammo && \old(maxAmmo) == maxAmmo
	public double damageRatio(Unit target){
		if(target instanceof Fanteria)
			return damTroops;
        else return damageRatioVehicle((Vehicle)target);	
	}
	
	//@requires target!=null
	//@ensures \old(damTroops)==damTroops && \old(damEarth)==damEarth && \old(damAir)==damAir && \old(damWater)==damWater && \old(ammo)==ammo && \old(maxAmmo) == maxAmmo
	private double damageRatioVehicle(Vehicle target){
        if(target.getType().equals("E"))
        	return damEarth;
        else if(target.getType().equals("A"))
        	return damAir;
        else
        	return damWater;
    }
}
