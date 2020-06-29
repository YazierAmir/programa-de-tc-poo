package basetc;

public class cursos {
public String microsoftoffice;
public String windows;
public String macOS;
public String linux;
public String reparacioncelulares;
public String reparacioncomp;
public String getMicrosoftoffice() {
	return microsoftoffice;
}
public void setMicrosoftoffice(String microsoftoffice) {
	this.microsoftoffice = microsoftoffice;
}
public String getWindows() {
	return windows;
}
public void setWindows(String windows) {
	this.windows = windows;
}
public String getMacOS() {
	return macOS;
}
public void setMacOS(String macOS) {
	this.macOS = macOS;
}
public String getLinux() {
	return linux;
}
public void setLinux(String linux) {
	this.linux = linux;
}
public String getReparacioncelulares() {
	return reparacioncelulares;
}
public void setReparacioncelulares(String reparacioncelulares) {
	this.reparacioncelulares = reparacioncelulares;
}
public String getReparacioncomp() {
	return reparacioncomp;
}
public void setReparacioncomp(String reparacioncomp) {
	this.reparacioncomp = reparacioncomp;
}
public static void main (String [] args) {
	cursos cursos1 = new cursos();
	cursos1.setMicrosoftoffice("aplicacion de escritorio");
	cursos1.setWindows("sistema operativo para interfaz de usuario");
	cursos1.setMacOS("sistema operativo empresarial");
	cursos1.setLinux("sistema operativo para programadores");
	cursos1.setReparacioncelulares("mantenimiento y reparaciones");
	cursos1.setReparacioncomp("mantenimiento, instalaciones y reparaciones");
	
}
     
}
