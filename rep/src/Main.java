import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables locales 
		//Son las variables que se ejecutaran en el ambito de esta funcion 
		//Cual es la funcion en este caso ?
		Autor sanderson = new Autor("brandon"," sanderson","19 de diciembre de 1975","masculino","brandonBoque@XDTaringa.net");
		Autor lucas = new Autor ("lucas","martinez","20 de febrero de 1985","masculino","lucasMartinez@gmail.com");
		Editorial planeta = new Editorial("Planeta","12345678","Venado tuerto","LaLibreriaReloca@gmail.com","20-12345678-2");
		Editorial keyboard = new Editorial("Keyboard", "87654321","La pampa","libreriacheap@gmail.com","20-87654321-1");
		Libro mistborn = new Libro("el imperio final", lucas,planeta, 100,2021,100);  
		Libro mistborn2 = new Libro("Juramentada", sanderson,planeta, 200,2015,50);
		
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("Ingrese datos de nuevo autor \n Ingrese nombre ");
		String nombre = Entrada.next();
		
		System.out.println("Ingrese apellido ");
		String apellido = Entrada.next();
		
		System.out.println("Ingrese fecha ");
		String fecha = Entrada.next();
		
		System.out.println("Ingrese sexo ");
		String sexo = Entrada.next();
		
		System.out.println("Ingrese eMail ");
		String eMail = Entrada.next();
		
		Autor nuevoautor = new Autor(nombre,apellido,fecha,sexo,eMail );		
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Elija uno de estos autores, para crear nuevo libro \n 1=Sanderson \n 2=Lucas "));
		
		if (a==1) {
			JOptionPane.showMessageDialog(null, "Ingreso sanderson");
			//Preguntar nombre 
			System.out.println("Ingresar nombre de libro");
			String nombrelibro = Entrada.next();			
			
			
			
			
			Libro libronuevo = new Libro(nombrelibro, sanderson,planeta, precio,año,cantidad);
		} else if (a==2) {
			JOptionPane.showMessageDialog(null, "Autor=" );
		} else {
			JOptionPane.showMessageDialog(null, "error no eligio, ningun autor.");
		}
		
		System.out.println("El libro nuevo es este " + libronuevo);
				
		
	}

}
