package Interfaz;
import java.util.LinkedList;
import javax.swing.JOptionPane;

import Datos.Seleccion;
import Datos.Estadio;
import Datos.Encargado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String goles[] = new String [8];
		
		Seleccion Qatar = new Seleccion (0,"Qatar ",0,true);
		Seleccion Ecuador = new Seleccion (1,"Ecuador ",0,true);
		Seleccion Senegal = new Seleccion (2,"Senegal ",0,true);
		Seleccion Paises_Bajos = new Seleccion (3,"Paises Bajos ",0,true);
				
			LinkedList<Seleccion> grupo_a = new LinkedList<Seleccion>();
			
				grupo_a.add(Qatar);
				grupo_a.add(Ecuador);
				grupo_a.add(Senegal);
				grupo_a.add(Paises_Bajos);
				
		Seleccion Inglaterra = new Seleccion (4,"Inglaterra ",0,true);
		Seleccion Iran = new Seleccion (5,"Iran ",0,true);
		Seleccion Estados_Unidos = new Seleccion (6,"Estados Unidos ",0,true);
		Seleccion Gales = new Seleccion (7,"Gales ",0,true);
		
			LinkedList<Seleccion> grupo_b = new LinkedList<Seleccion>();
		
				grupo_b.add(Inglaterra);
				grupo_b.add(Iran);
				grupo_b.add(Estados_Unidos);
				grupo_b.add(Gales);
				
		Seleccion Argentina = new Seleccion (8,"Argentina ",0,true);
		Seleccion Arabia_Saudita = new Seleccion (9,"Arabia Saudita ",0,true);
		Seleccion Mexico = new Seleccion (10,"Mexico ",0,true);
		Seleccion Polonia = new Seleccion (11,"Polonia ",0,true);
		
			LinkedList<Seleccion> grupo_c = new LinkedList<Seleccion>();
			
				grupo_c.add(Argentina);
				grupo_c.add(Arabia_Saudita);
				grupo_c.add(Mexico);
				grupo_c.add(Polonia);
				
		Seleccion Francia = new Seleccion (12,"Francia ",0,true);
		Seleccion Australia = new Seleccion (13,"Australia ",0,true);
		Seleccion Dinamarca = new Seleccion (14,"Dinamarca ",0,true);
		Seleccion Tunez = new Seleccion (15,"Tunez ",0,true);
				
			LinkedList<Seleccion> grupo_d = new LinkedList<Seleccion>();
			
				grupo_d.add(Francia);
				grupo_d.add(Australia);
				grupo_d.add(Dinamarca);
				grupo_d.add(Tunez);
				
		Seleccion España = new Seleccion (16,"España ",0,true);
		Seleccion Costa_Rica = new Seleccion (17,"Costa Rica ",0,true);
		Seleccion Alemania = new Seleccion (18,"Alemania ",0,true);
		Seleccion Japon = new Seleccion (19,"Japon ",0,true);
		
			LinkedList<Seleccion> grupo_e = new LinkedList<Seleccion>();
			
				grupo_e.add(España);
				grupo_e.add(Costa_Rica);
				grupo_e.add(Alemania);
				grupo_e.add(Japon);
				
		Seleccion Belgica = new Seleccion (20,"Belgica ",0,true);
		Seleccion Canada = new Seleccion (21,"Canada ",0,true);
		Seleccion Marruecos = new Seleccion (22,"Marruecos ",0,true);
		Seleccion Croacia = new Seleccion (23,"Croacia ",0,true);
				
			LinkedList<Seleccion> grupo_f = new LinkedList<Seleccion>();
			
				grupo_f.add(Belgica);
				grupo_f.add(Canada);
				grupo_f.add(Marruecos);
				grupo_f.add(Croacia);
				
		Seleccion Brasil = new Seleccion (24,"Brasil ",0,true);
		Seleccion Serbia = new Seleccion (25,"Serbia ",0,true);
		Seleccion Suiza = new Seleccion (26,"Suiza ",0,true);
		Seleccion Camerun = new Seleccion (27,"Camerun ",0,true);
		
			LinkedList<Seleccion> grupo_g = new LinkedList<Seleccion>();
		
				grupo_g.add(España);
				grupo_g.add(Costa_Rica);
				grupo_g.add(Alemania);
				grupo_g.add(Japon);
				
		Seleccion Portugal = new Seleccion (28,"Portugal ",0,true);
		Seleccion Ghana = new Seleccion (29,"Ghana ",0,true);
		Seleccion Uruguay = new Seleccion (30,"Uruguay ",0,true);
		Seleccion Corea_Del_Sur = new Seleccion (31,"Corea Del Sur ",0,true);
		
			LinkedList<Seleccion> grupo_h = new LinkedList<Seleccion>();
			
				grupo_h.add(Portugal);
				grupo_h.add(Ghana);
				grupo_h.add(Uruguay);
				grupo_h.add(Corea_Del_Sur);	
				
		Encargado Pancho = new Encargado (1,"Pancho ");		
				
		Estadio Estadio_0 = new Estadio (0,"Estadio Al Bait ");
		Estadio Estadio_1 = new Estadio (1,"Estadio Al Yanub ");
		Estadio Estadio_2 = new Estadio (2,"Estadio Ahmad Bin Ali ");
		Estadio Estadio_3 = new Estadio (3,"Estadio Al Zumama ");
		Estadio Estadio_4 = new Estadio (4,"Estadio Ciudad de la Educación ");
		Estadio Estadio_5 = new Estadio (5,"Estadio Internacional Jalifa ");
		Estadio Estadio_6 = new Estadio (6,"Estadio de Lusail ");
		Estadio Estadio_7 = new Estadio (7,"Estadio 974 ");
		
				
		int menu;
		menu:Integer.parseInt(JOptionPane.showInputDialog("~~Bienvenido a Qatar 2022~~ \n Elija una de las siguientes opciones \n1. Ver Fixture Principal \n2. Iniciar partidos de Fase de Grupos \n3. Salir del Menu "));
	}

}
