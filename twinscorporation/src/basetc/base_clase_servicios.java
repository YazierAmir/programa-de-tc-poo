package basetc;

import java.util.Scanner;

public class base_clase_servicios {
	public static void main (String [] args) {
		Scanner p = new Scanner(System.in);
        boolean salir = false;
        int opcion = 0; 
        
        while (salir) {
        	 System.out.println("1.reparacion de celulares");
        	 System.out.println("2.reparacion de computadoras");
        	 System.out.println("3.instalacion de redes");
        	 System.out.println("4.instalacion de cctv");
        	 System.out.println("5.instalacion de software");
        	 System.out.println("6.instalaciones electricas");
        	 System.out.println("7.salir \n");
        	 switch (opcion) {
        	 case 1:
        		 System.out.println("de reparacion de celulares");
        		 System.out.println("cambio de pila");
        		 System.out.println("cambio de pantalla");
        		 System.out.println("cambio de centro de carga");
        		 System.out.println("formateos");
        		 break;
        	 case 2: 
        		 System.out.println("de reparacion de computadoras");
        		 System.out.println("manteninimiento preventivo");
        		 System.out.println("mantenimiento correctivo");
        		 System.out.println("limpieza de virus");
        		 System.out.println("formateo");
        		break;
        	 case 3:
        	 System.out.println("de instalacion de redes");
        	 System.out.println("de arbol");
        	 System.out.println("de anillo");
        	 System.out.println("estrella");
        	 System.out.println("malla");
        	 break;
        	 case 4:
        		 System.out.println("instalacion de circuito cerrado de televicion");
        		 System.out.println("camaras inalambricas");
        		 System.out.println("camaras alambricas");
        		 System.out.println("sensor de movimento");
        	 case 5:
        		 System.out.println("instalacion de software");
        		 System.out.println("software de sistemas");
        		 System.out.println("software de software de aplicacion");
        		 System.out.println("software de diseño");
        	 case 6:
        		 System.out.println("instalaciones electricas");
        		 System.out.println("cambio total");
        		 System.out.println("cambios de switch");
        		 System.out.println("añadir instalacion");
        	 case 7:
        		 salir=true;
         		break;
        	 }
        	 
        	   
        	 
        }
	}
}
