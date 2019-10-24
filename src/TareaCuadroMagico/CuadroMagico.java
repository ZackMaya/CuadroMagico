package TareaCuadroMagico;

import java.util.Scanner;

public class CuadroMagico {
	public static void main(String[] args) {
	    
		//Tiempo de ejecución
		 long TInicio, TFin, tiempo;           //Para determinar el tiempo
		 TInicio = System.currentTimeMillis(); //de ejecución
		
		
		System.out.print("Dame un número: ");
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[][] magicSquare = new int[n][n];

	    int number = 1;
	    int row = 0;
	    int column = n / 2;
	    
	    while (number <= n * n) {
	        magicSquare[row][column] = number;
	        number++;
	        row -= 1;
	        column += 1;
	        if (row == -1) {
	            row = n - 1;
	        }
	        if (column == n) {
	            column = 0;
	        }
	        if (row == 0 && column == n - 1) {
	            column = n - 1;
	            row += 1;
	        } else if (magicSquare[row][column] != 0) {
	            row += 1;
	        }
	    }

	    for (int i = 0; i < magicSquare.length; i++) {
	        for (int j = 0; j < magicSquare.length; j++) {
	            System.out.print(magicSquare[i][j] + " ");
	        }
	        System.out.println();
	    }
	    
	    
	    //1 minuto 60000 milisegundos
	    TFin = System.currentTimeMillis();
	    tiempo = TFin - TInicio;
	    
	    if(tiempo<60000) {
	    	System.out.printf("\n\n El tiempo de ejecución es menor a un minuto\n");
	    }
	    else {
	    	System.out.printf("\n\n el tiempo de ejecución sobrepasa el minuto en la matriz n : %d", n);
	    }
	    
	    System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
	}
}
