
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto producto = new Producto (0,"cactus");
		Producto producto1 = new Producto (1,"manzana");
		Producto producto2 = new Producto (2,"naranja");
		
		LinkedList<Producto> stock = new LinkedList<Producto>();
		
		stock.add(producto);
		stock.add(producto1);
		stock.add(producto2);
		//imprimir(stock);	//buscar
		
		 BuscarxNombre(stock,"cactus");
		
		
		String aux =  "Clean code";
		System.out.println("");
				//reemplazar
		Producto producto3  = new Producto(3,"Gaturro");
		CambiarElemento(stock,producto2,0);
		
		imprimir(stock);
		
		
		//System.out.println("El Stock tiene: "+stock.size()+ " productos");
	}
	
	public static void imprimir(LinkedList<Producto> lista) {
		
		if (lista.isEmpty()) {
			System.out.println("la lista se encuentra vacia ");
		}else {
			for(Producto elemento : lista) {
			System.out.print(elemento.getNombre()+ " - ");
			}
		}
		
	
	}
	public static void BuscarxNombre(LinkedList<Producto> lista,String nombre) {
		
		if(lista.isEmpty()) {
			System.out.println("La lista se encuentra vacía");
		}else {
	    for (Producto elemento : lista)
	        if(elemento.getNombre().equals(nombre)) {
	        	System.out.println("encontre el producto ");
	        	System.out.println(elemento);
	 
	        }
		}
	}
	public static void CambiarElemento(LinkedList<Producto> lista,Producto Producto,int indice) {
		
		if(lista.isEmpty()) {
			System.out.println("La lista se encuentra vacía");
		}else {
			lista.set(indice, Producto);
	        }
		}
	
	public static void Borrar(LinkedList<Producto> lista,String nombre) {
		if(lista.isEmpty()) {
			System.out.println("La lista se encuentra vacía");
		}else {
	    for (Producto elemento : lista)
	        if(elemento.getNombre().equals(nombre)) {
	        	System.out.println("removio el elemento: "+elemento.getNombre());        	
	        	lista.remove(lista.indexOf(elemento));
	        }
		}
	}
	
}	
	

