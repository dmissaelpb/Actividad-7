

class Main {
	public static void main(String[] args) {

		System.out.println("jjjj");

		Primos primo = new Primos();
		primo.setDatos();
		primo.esPrimo(1);



		

		Fibonacci f2 = new Fibonacci();
		f2.setTamaño(Primos.fin);
		f2.mostrarSerie();

		f2.printDataMasMenor();
		f2.printDataMayorMenor();




		
	}
	

	
}