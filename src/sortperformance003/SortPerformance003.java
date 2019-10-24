package sortperformance003;

 

//M. en C. Paulo Máximo Gutiérrez González; Estructuras y Representación de Datos -UPIICSA IPN

//SortPerformance002.java genera un arreglo de números pseudoaleatorios, los ordena por QuickSort...

//... y toma el tiempo (en milisegundos) que lleva ordenarlos por este método...

import java.util.Random;

public class SortPerformance003 {

               private static int[] datos;                              // arreglo de valores
               private static final Random generador = new Random();

                // crea un arreglo de un tamaño dado y lo llena con enteros pseudoaleatorios
                public SortPerformance003( int tamanio ){
                              datos = new int[ tamanio ]; // crea espacio para el arreglo
                // llena el arreglo con enteros aleatorios en el rango de 10 a 99
                               for ( int i = 0; i < tamanio; i++ )
                                               datos[ i ] = 10 + generador.nextInt( 90 );              
                // fin del constructor de SortPerformance001
                }

/////////////////////////////77

                static void Burbuja(int [] b, int p){
                               int i, j, l, temp;
                               for(i = 0; i <= p; i++){
                                               for(j = 0; j < p - 1; j++){
                                                               if(b[j] > b[j + 1]){
                                                                               temp = b[j];
                                                                              b[j] = b[j + 1];
                                                                               b[j + 1] = temp;
                                                               }
                                               }
                               }
                }

               

                static void insercionDirecta(int [] b){

                               int i, j, k;

 

                               for(j = 1; j < b.length ; j++){

                                               i = j - 1;

                                               k = b[j];

                                               while(i >= 0)

                                                               if(k < b[i]){

                                                                               b[i + 1] = b[i];

                                                                               i = i - 1;

                                                               }

                                                               else

                                                                               break; 

                                               b[i + 1] = k;         

                               }

                }

 

                static void QuickSort(int [] b, int izq, int der){
                               int i, j, v, aux;
                               i = izq; j = der; v = b[(izq + der)/2];
                               do{
                                               while((b[i] < v) && (j <= der)) i++;
                                               while((v < b[j]) && (j > izq)) j--;
                                               if(i <= j){
                                                              aux = b[i]; b[i] = b[j]; b[j] = aux;
                                                               i++; j--;
                                               }
                               } while(i <= j);
                               if(izq < j) QuickSort(b, izq, j);
                               if(i < der) QuickSort(b, i, der);   

                }

               

                public static void main(String[] args){

                               int l;
                               SortPerformance003 arregloOrden = new SortPerformance003( 300000 );
                               long t1 = System.currentTimeMillis();
                               SortPerformance003.Burbuja(SortPerformance003.datos, datos.length);

                               //SortPerformance003.insercionDirecta(arregloOrden.datos);

                               //SortPerformance003.QuickSort(SortPerformance003.datos, 0, datos.length - 1);
                               long t2 = System.currentTimeMillis();
                               System.out.println((t2 - t1) + " milisegundos");
                               //for(l = 0; l < datos.length; l++)

                                               //System.out.print(arregloOrden.datos[l] + " ");

                               //System.out.println();

                }

}
