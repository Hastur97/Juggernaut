package utility;

public class Posizione{
	//@public invariant
	//@getX()>=0 && getY()>=0
	private final int x;
	private final int y;
	
	//@ensures \result == x && \old(x) == x && \old(y) == y
	public int getX(){
		return this.x;
	}
	
	//@ensures \result == y && \old(x) == x && \old(y) == y
	public int getY(){
		return this.y;
	}
	
	public Posizione(){
		this.x = 0;
		this.y = 0;
	}
	
	public Posizione(int x, int y){
		this.x = x; 
		this.y = y;
	}
	
	//@requires pos1!=null
	//@ensures \old(x) == x && \old(y) == y
	public int distanza (Posizione pos1){
		return Math.abs(pos1.getX()- this.getX()) + Math.abs(pos1.getY() - this.getY());
	}
}
