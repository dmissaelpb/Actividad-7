public class Fibonacci {
    static int[] cantidad = new int[Primos.fin];
    public int tamaño;
    int fibonacci(int n)
{
    if (n>1){
       return fibonacci(n-1) + fibonacci(n-2); 
    }
    else if (n==1) { 
        return 1;
    }
    else if (n==0){ 
        return 0;
    }
    else{ 
        System.out.println("ingresa un numero igual o mayor a 0 ");
        return -1; 
    }
}


public Fibonacci() { 
}

public Fibonacci( int tamaño){
    this.tamaño = tamaño;
}

public void mostrarSerie(){


    System.out.println("\nfii "+" de tamaño "+ this.tamaño+":");
    for (int i = 0; i < tamaño; i++) {

        cantidad[i]=fibonacci(i);
    }
   // System.out.println( " ok ");
}

public int getTamaño() {
    return tamaño;
}

public void setTamaño(int tamaño) {
    this.tamaño = tamaño;
}

public void printDataMasMenor(){

    System.out.print("Vector Original:  " );

    for (int i = 0; i < cantidad.length; i++) {
        System.out.print(cantidad[i] +" ");
        
    }
    
}

public void printDataMayorMenor(){

    System.out.print("\n" +"Vector Inverso :  " );
    System.out.print(cantidad[tamaño-1] +" ");

    for (int i = tamaño-1; i > 0; i--) {
        System.out.print(cantidad[i] +" " );
        }
    }

}
