package armi;

import unit.Fanteria;
import unit.Unit;
import unit.VehicleType;

public class Weapon{
	private double damTroops;
	private double damEarth;
	private double damWater;
	private double damAir;
	
	protected int maxAmmo;
	private int ammo;
	
	public Weapon(int maxAmmo, double fanti, double terra, double acqua, double aria){
		this.maxAmmo = maxAmmo;
		this.damTroops = fanti;
		this.damEarth = terra;
		this.damWater = acqua;
		this.damAir = aria;
	}
	
	//@ensures \old(ammo)==ammo && \old(maxAmmo) == maxAmmo
	public int getAmmo(){
		return this.ammo;
	}
	
	public void setAmmo(int ammo){
		if(this.ammo + ammo <= maxAmmo && this.ammo + ammo >=0)
			this.ammo += ammo;
		else if(this.ammo + ammo > maxAmmo)
			this.ammo = this.maxAmmo;
		else if(this.ammo + ammo < 0)
			this.ammo = 0;
	}
	
	public double damageRatio(Unit target){
		if(target instanceof Fanteria)
			return damTroops;
		else if(target.getType().equals("E"))
			return damEarth;
		else if(target.getType().equals("A"))
			return damAir;
		else if(target.getType().equals("W"))
			return damWater;
	}
}
