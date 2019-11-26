package principal;

import vehiculo.Auto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auto miAuto=new Auto("Chevrolet","Corsa",2012,4,"azul",140,0);
		Auto tuAuto=new Auto("Chevrolet","Corsa",2012,4,"azul",140,0);
		
		//miAuto.setMarca("Chevrolet");
		//miAuto.setModelo("Corsa");
		System.out.println(miAuto.getModelo());
		System.out.println(miAuto.getMarca());
		System.out.println(miAuto.getColor());
		System.out.println(miAuto.estaencendido() );
		miAuto.acelerar(20);
		System.out.println(miAuto.getVelocidadActual());
		miAuto.acelerar(121);
	}

}
