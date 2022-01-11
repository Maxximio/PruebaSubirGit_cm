package cm.com.ec.edu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estudiante estu=new Estudiante();
		
		estu.llenarDatos("Carlos", "Montalvo");
		
		System.out.println(estu.getNombre());
		
		//Estudiante estu2=new Estudiante();
		//System.err.println(estu2.getNombre());
		
		//Estudiante estu2 = estu;
		Estudiante estu2 =new Estudiante();
		estu2.setNombre("Dennis");
		
		System.out.println("Estudiante2: "+estu2.getNombre());
		System.out.println("Estudiante1: "+estu.getNombre());
		
		Estudiante estu3=estu2;
		Estudiante estu4=estu3;
	}

}
