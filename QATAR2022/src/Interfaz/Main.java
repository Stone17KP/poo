package Interfaz;
import java.util.LinkedList;
import javax.swing.JOptionPane;

import Datos.Seleccion;
import Datos.Estadio;
import Datos.Encargado;
import Datos.Partido;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String goles[] = new String [8];
				
			LinkedList<Seleccion> grupo_a = new LinkedList<Seleccion>();
			
				grupo_a.add(new Seleccion (0,"Qatar ",0,true));
				grupo_a.add(new Seleccion (1,"Ecuador ",0,true));
				grupo_a.add(new Seleccion (2,"Senegal ",0,true));
				grupo_a.add(new Seleccion (3,"Paises Bajos ",0,true));
		
			LinkedList<Seleccion> grupo_b = new LinkedList<Seleccion>();
		
				grupo_b.add(new Seleccion (4,"Inglaterra ",0,true));
				grupo_b.add(new Seleccion (5,"Iran ",0,true));
				grupo_b.add(new Seleccion (6,"Estados Unidos ",0,true));
				grupo_b.add(new Seleccion (7,"Gales ",0,true));
		
			LinkedList<Seleccion> grupo_c = new LinkedList<Seleccion>();
			
				grupo_c.add(new Seleccion (8,"Argentina ",0,true));
				grupo_c.add(new Seleccion (9,"Arabia Saudita ",0,true));
				grupo_c.add(new Seleccion (10,"Mexico ",0,true));
				grupo_c.add(new Seleccion (11,"Polonia ",0,true));
				
			LinkedList<Seleccion> grupo_d = new LinkedList<Seleccion>();
			
				grupo_d.add(new Seleccion (12,"Francia ",0,true));
				grupo_d.add(new Seleccion (13,"Australia ",0,true));
				grupo_d.add(new Seleccion (14,"Dinamarca ",0,true));
				grupo_d.add(new Seleccion (15,"Tunez ",0,true));
				
			LinkedList<Seleccion> grupo_e = new LinkedList<Seleccion>();
				
				grupo_e.add(new Seleccion (16,"Espa�a ",0,true));
				grupo_e.add(new Seleccion (17,"Costa Rica ",0,true));
				grupo_e.add(new Seleccion (18,"Alemania ",0,true));
				grupo_e.add(new Seleccion (19,"Japon ",0,true));
				
			LinkedList<Seleccion> grupo_f = new LinkedList<Seleccion>();
			
				grupo_f.add(new Seleccion (20,"Belgica ",0,true));
				grupo_f.add(new Seleccion (21,"Canada ",0,true));
				grupo_f.add(new Seleccion (22,"Marruecos ",0,true));
				grupo_f.add(new Seleccion (23,"Croacia ",0,true));
		
				LinkedList<Seleccion> grupo_g = new LinkedList<Seleccion>();
		
				grupo_g.add(new Seleccion (24,"Brasil ",0,true));
				grupo_g.add(new Seleccion (25,"Serbia ",0,true));
				grupo_g.add(new Seleccion (26,"Suiza ",0,true));
				grupo_g.add(new Seleccion (27,"Camerun ",0,true));
		
				LinkedList<Seleccion> grupo_h = new LinkedList<Seleccion>();
			
				grupo_h.add(new Seleccion (28,"Portugal ",0,true));
				grupo_h.add(new Seleccion (29,"Ghana ",0,true));
				grupo_h.add(new Seleccion (30,"Uruguay ",0,true));
				grupo_h.add(new Seleccion (31,"Corea Del Sur ",0,true));	
				
		Encargado Pancho = new Encargado (1,"Pancho ");		
		
				LinkedList<Estadio> Estadios = new LinkedList<Estadio>();
		
				Estadios.add( new Estadio (0,"Estadio Al Bait "));
				Estadios.add( new Estadio (1,"Estadio Al Yanub "));
				Estadios.add( new Estadio (2,"Estadio Ahmad Bin Ali "));
				Estadios.add( new Estadio (3,"Estadio Al Zumama "));
				Estadios.add( new Estadio (4,"Estadio Ciudad de la Educaci�n "));
				Estadios.add( new Estadio (5,"Estadio Internacional Jalifa "));
				Estadios.add( new Estadio (6,"Estadio de Lusail "));
				Estadios.add( new Estadio (7,"Estadio 974 "));
		
		Partido Fecha1 = new Partido (1,"20 de Noviembre");
		Partido Fecha2 = new Partido (2,"21 de Noviembre");
		Partido Fecha3 = new Partido (3,"22 de Noviembre");
				
		int menu;
		menu:Integer.parseInt(JOptionPane.showInputDialog("~~Bienvenido a Qatar 2022~~ \n Elija una de las siguientes opciones \n1. Ver Fixture Principal \n2. Iniciar partidos de Fase de Grupos \n3. Salir del Menu "));
	}
	public static void CrearPartido(Encargado Pancho, Partido Fecha1 ) {
		
}
	public static void  EstadiosRandom(Encargado Pancho) {
		Estadio[] EstadioR = new Estadio[8];
		Estadio Estadio_0 = new Estadio (0,"Estadio Al Bait ");
		Estadio Estadio_1 = new Estadio (1,"Estadio Al Yanub ");
		Estadio Estadio_2 = new Estadio (2,"Estadio Ahmad Bin Ali ");
		Estadio Estadio_3 = new Estadio (3,"Estadio Al Zumama ");
		Estadio Estadio_4 = new Estadio (4,"Estadio Ciudad de la Educaci�n ");
		Estadio Estadio_5 = new Estadio (5,"Estadio Internacional Jalifa ");
		Estadio Estadio_6 = new Estadio (6,"Estadio de Lusail ");
		Estadio Estadio_7 = new Estadio (7,"Estadio 974 ");
		
	int s;
	//s=(int)(Math.random()*8)+EstadioR[i];
	
	for (int i = 0; i < 8; i++) {
		//EstadioR[i]=(Math.random()*7);
	}
	
	}

		/*public static void EstadioRandom(LinkedList<Estadio> lista, String nombre) {
			
			if(lista.isEmpty()) {
				System.out.println("La lista se encuentra vac�a");
			}else {
				for (Estadio elemento : lista)
					if(elemento.getNombre().equals(nombre)) {
						System.out.println("El estadio es  ");
						System.out.println(elemento);
						
					}
			}
		}*/
	}
	
