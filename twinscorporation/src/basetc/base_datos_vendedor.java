package basetc;
import java.util.Scanner;
public class base_datos_vendedor extends base_datos_tc {
private static String nombreteg;
private String equiporeparar;
private static String materialuso;
private static String costott;
private static String registrarcliente;
private static String tiporeparacion;
public base_datos_vendedor(String reparar, String materialuso, String costott, String registrarcliente, String nombreteg) {
	super();
	base_datos_vendedor.nombreteg = nombreteg;
	this.setEquiporeparar(reparar);
	base_datos_vendedor.materialuso = materialuso;
	base_datos_vendedor.costott = costott;
	base_datos_vendedor.registrarcliente = registrarcliente;
	base_datos_vendedor.tiporeparacion = tiporeparacion;
}
public static void main (String[]args) {
	int vendedor = 0;
	int reparacion=0;
	int materialdeuso=0;
	int registrocliente=0;
	int costo=0;
	@SuppressWarnings("resource")
	Scanner nombres= new Scanner(System.in);
	System.out.print("ingrese su nombre de tegnico :");
	nombreteg = nombres.nextLine();
	System.out.print("ingrese el tipo de raparacion");
	tiporeparacion=nombres.nextLine();
	System.out.println("ingrese nombre de cliente : ");
	registrarcliente =nombres.nextLine();
	System.out.println("ingrese el material que usó : ");
	materialuso=nombres.nextLine();
	System.out.println("ingrese el costo total");
	costo=Integer.parseInt(costott,costo);
}
public String getEquiporeparar() {
	return equiporeparar;
}
public void setEquiporeparar(String equiporeparar) {
	this.equiporeparar = equiporeparar;
}
}
