package basetc;

import java.util.Scanner;

public class base_datos_cursos {
	public static void main (String [] args) { 
		Scanner p = new Scanner(System.in);
        boolean salir = false;
        int opcion = 0; 
        
        while (salir) {
        	System.out.println("1.microsoft office");
        	System.out.println("2.windows");
        	System.out.println("3.macOS");
        	System.out.println("4.linux");
        	System.out.println("5.reparacioncelulares");
        	System.out.println("6.reparacioncomputadoras");
        	System.out.println("7.salir \n ");
        	switch (opcion) {
        	case 1:
        		System.out.println("estos son los cursos de office : ");
        		       System.out.println("word");
        		       System.out.println("excel");
        		       System.out.println("powerpoint");
        		       System.out.println("teclado y/o atajos");
        		       break;
        	case 2:
        		System.out.println("lo que conforma el curso de windows");
        		       System.out.println("escritorio");
        		       System.out.println("explorador de archivos");
        		       System.out.println("navegadores");
        		       System.out.println("descargar imagenes,musica y archivos");
        		       break;
        	case 3:
        		System.out.println("los temas que conforman mac OS");
        		        System.out.println("configurar el equipo");
        		        System.out.println("aplicaciones de mac");
        		        System.out.println("migracion de archivos:");
        		        break;
        	case 4:
        		System.out.println("temas para aprender linux");
        		       System.out.println("terminal");
        		       System.out.println("aplicaciones");
        		       System.out.println("ubuntu");
        		       System.out.println("linux mint");
        		       break;
        	case 5:
        		System.out.println("temas para aprender repacion de celulares");
        		        System.out.println("hardware:");
        		        System.out.println("electronica basica");
        		        System.out.println("fallas comunes");
        		        System.out.println("herramienta");
        		        System.out.println("soldar y desoldar");
        		        System.out.println("diagnosticos");
        		        break;
        	case 6:
        		System.out.println("temas para reparacion de computadoras:");
        		      System.out.println("para hardware:");
        		      System.out.println("mantenimiento preventivo");
        		      System.out.println("mantenimiento correctivo");
        		      System.out.println("diagnostico");
        		      System.out.println("armado correcto");
        		      break;
        	case 7:
        		salir=true;
        		break;
        	}
        }
	}
        
}
