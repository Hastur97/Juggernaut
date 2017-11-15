package armi;

import unit.Unit;

public abstract class Weapon{
	
	protected int maxAmmo;
	private int ammo;
	
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
	
	public abstract boolean canTarget(Unit target);
	
	public abstract double damageRatio(Unit target);
}
