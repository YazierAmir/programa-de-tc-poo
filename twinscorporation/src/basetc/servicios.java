package basetc;

public class servicios {
public String reparaciodecelulares;
public String reparacioncomputadoras;
public String instalacionderedes;
public String instalaciondecctv;
public String instalaciondesoftware;
public String instalacioneselectricas;
public String getReparaciodecelulares() {
	return reparaciodecelulares;  
}
public void setReparaciodecelulares(String reparaciodecelulares) {
	this.reparaciodecelulares = reparaciodecelulares;
}
public String getReparacioncomputadoras() {
	return reparacioncomputadoras;
}
public void setReparacioncomputadoras(String reparacioncomputadoras) {
	this.reparacioncomputadoras = reparacioncomputadoras;
}
public String getInstalacionderedes() {
	return instalacionderedes;
}
public void setInstalacionderedes(String instalacionderedes) {
	this.instalacionderedes = instalacionderedes;
}
public String getInstalaciondecctv() {
	return instalaciondecctv;
}
public void setInstalaciondecctv(String instalaciondecctv) {
	this.instalaciondecctv = instalaciondecctv;
}
public String getInstalaciondesoftware() {
	return instalaciondesoftware;
}
public void setInstalaciondesoftware(String instalaciondesoftware) {
	this.instalaciondesoftware = instalaciondesoftware;
}
public String getInstalacioneselectricas() {
	return instalacioneselectricas;
}
public void setInstalacioneselectricas(String instalacioneselectricas) {
	this.instalacioneselectricas = instalacioneselectricas;
}
public static void main (String [] args) {
	servicios servicios1 = new servicios();
	servicios1.setReparaciodecelulares("cambios de piezas,limpieza y formateo");
	servicios1.setReparacioncomputadoras("mantenimento,instalacion,cambio de piezas y formateo");
	servicios1.setInstalacionderedes("configuraciones y la instalacion");
	servicios1.setInstalaciondecctv("camaras de seguirdad alambrica e inalambricas");
	servicios1.setInstalaciondesoftware("instalaciones,desinstalar");
}

}
