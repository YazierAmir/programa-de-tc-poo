package basetc;

public class usuario extends base_datos_tc {
private int registrodepago ;
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

}
