package armi;

import unit.Fanteria;
import unit.Unit;
import unit.Vehicle;
import unit.VehicleType;

public class AssaultRifle extends Weapon{
	private double damTroops;
	private double damHearth;
	private double damWater;
	private double damAir;
	
	public AssaultRifle(){
		super();
		this.maxAmmo = 30;
	}
	
	@Override
	public boolean canTarget(Unit target) {
		if(target instanceof Fanteria && target instanceof Vehicle)
			return true;
	}
	
	@Override
	public double damageRatio(Unit target){
		if(target instanceof Fanteria)
			return damTroops;
		else if(target instanceof Vehicle)
			//TODO sistema sta cazzo di enum
			return damHearth;
		
	}
	
}
