package basetc;

public class vendedor extends base_datos_tc {
	private static int ID=1;
	int IDvendedor;
	public vendedor() {
		IDvendedor = vendedor.ID++;
	}
	public void mostrarID() {
		System.out.println("id vendedor =" + IDvendedor);
		
	}
	public static void main(String[] args) {
		vendedor vendedor1 = new vendedor();
		vendedor vendedor2 = new vendedor();
		vendedor vendedor3 = new vendedor();
		vendedor vendedor4 = new vendedor();
		vendedor vendedor5 = new vendedor();
		
		    vendedor1.mostrarID();
		    vendedor2.mostrarID();
		    vendedor3.mostrarID();
		    vendedor4.mostrarID();
		    vendedor5.mostrarID();
		
	}
}

