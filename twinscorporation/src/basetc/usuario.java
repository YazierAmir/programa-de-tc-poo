package basetc;

public class usuario extends base_datos_tc {
private String registrodepago ;
private String registroclientes;
private String controlvenderores;
  
 public boolean insertarusuiario (String sentenciaSQL) {
	 
	 if (sentenciaSQL.length()<10) {
		 return false;
	 } else {
		 System.out.println("se ejecuto la sentencia " +sentenciaSQL);
		 return true; 
	 }
	
	 
 }

public String getControlvenderores() {
	return controlvenderores;
}

public void setControlvenderores(String controlvenderores) {
	this.controlvenderores = controlvenderores;
}

public String getRegistroclientes() {
	return registroclientes;
}

public void setRegistroclientes(String registroclientes) {
	this.registroclientes = registroclientes;
}

public String getRegistrodepago() {
	return registrodepago;
}

public void setRegistrodepago(String registropago) {
	this.registrodepago = registropago;
}
public static void main (String [] args) {
	usuario usuario1 = new usuario();
	usuario1.setRegistrodepago("pago del empleado");
	usuario1.setRegistroclientes("el registro de clientes");
	usuario1.setControlvenderores("registro de empleado");
}
}
