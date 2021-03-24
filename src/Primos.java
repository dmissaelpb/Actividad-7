
import java.util.Scanner;

public class Primos {

        static  int inicio, fin, contador = 0;
		Scanner sc = new Scanner(System.in);
        
void setDatos(){
    System.out.println("Escribe el inicio:");
    inicio = sc.nextInt();
    
    System.out.println("Escribe el fin:");
    fin = sc.nextInt();
    for (int x = inicio; x <= fin; x++) {
        if (esPrimo(x)) {
            contador++;
            System.out.print(String.valueOf(x) + ",");
        }
    }


    System.out.printf("\nTotal: %d", contador + '\n');
    sc.close();
       
  }
  
  public boolean esPrimo(int numero) {
      if (numero == 0 || numero == 1 || numero == 4) {
          return false;
		}
		for (int x = 2; x < numero / 2; x++) {
			if (numero % x == 0)
            return false;
		}
		return true;
	}
    
    
    
}
