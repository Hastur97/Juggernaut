package mappa;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import utility.Posizione;

public class Mappa {
	private final static int SIZE = 10;
	private final Casella[][] mappa = new Casella[SIZE][SIZE];
	
	public Casella[][] getMappa() {
		return mappa;
	}
	
	public void buildMap(Casella[][] mappa) throws IOException, EOFException, FileNotFoundException{
		FileReader f = null;
		try {
			f = new FileReader("/mapstobuild/mappa1.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader b=null;
		
		try{
			b = new BufferedReader(f);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		String s;
		
		for(int i=0; i<SIZE; i++){
			for(int j=0; j<SIZE; j++){
				try{
					s = b.readLine();
					if(s!=null){
						switch (s){
							case "A":{
								mappa[i][j] = new Acqua(new Posizione(i, j));
								break;
							}
							case "F":{
								mappa[i][j] = new Foresta(new Posizione(i, j));
								break;
							}
							case "M":{
								mappa[i][j] = new Montagna(new Posizione(i, j));
								break;
							}
							case "P":{
								mappa[i][j] = new Pianura(new Posizione(i, j));
								break;
							}
							case "T":{
								mappa[i][j] = new Town(new Posizione(i, j));
								break;
							}
							default:{ 
								mappa[i][j] = new Pianura(new Posizione(i, j));
								break;
							}
						}
					}else
						//TODO controlla questo throw!!
						throw new EOFException();
				}
				catch (EOFException e){
					e.printStackTrace();
				}
			}
		}
	}
	
}
