Revisado... 
package parcialjosesamayoa;

import java.util.Scanner;


public class ParcialJoseSamayoa {

   
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int CA1=0, CA2=0, CA3=0, CA4=0;
        int Notas[]={0,0,0,0};
        int Aux=0,Op;
        do{
        System.out.println("\t\t\t****MENU PRINCIPAL***");
        System.out.println("1. Ingresar notas \n2. Ordenar notas \n3. Ver notas \n4.Salir");
        Op = sc.nextInt();
        switch(Op){
            case 1:
                System.out.println("\t\tIngreso De Notas");
                System.out.println("Ingrese el carnet del primer alumno");
                CA1 = sc.nextInt();
                System.out.println("Ingrese la nota del primer alumno");
                Notas[0] = sc.nextInt();
                System.out.println("Ingrese el carnet del segundo alumno");
                CA2 = sc.nextInt();
                System.out.println("Ingrese la nota del segundo alumno");
                Notas[1] = sc.nextInt();
                System.out.println("Ingrese el carnet del tercer alumno");
                CA3 = sc.nextInt();
                System.out.println("Ingrese la nota del tercer alumno");
                Notas[2] = sc.nextInt();
                System.out.println("Ingrese el carnet del cuarto alumno");
                CA4 = sc.nextInt();
                System.out.println("Ingrese la nota del cuarto alumno");
                Notas[3] = sc.nextInt();
                break;
            case 3:
                System.out.println("\n\nMostar Notas");
                System.out.println("La nota mayor es: "+Notas[0]);
                System.out.println("La segunda nota mas grande es: "+Notas[1]);
                System.out.println("La tercer nota mas alta es: "+Notas[2]);
                System.out.println("La nota mas baja es: "+Notas[3]);
                break;
            case 2:
                System.out.println("ORDENANDO...");
                for(int i = 0; i < Notas.length - 1; i++)
                {
                    for(int j = 0; j < Notas.length - 1; j++)
                    {
                        if (Notas[j] < Notas[j + 1])
                        {
                            int tmp = Notas[j+1];
                            Notas[j+1] = Notas[j];
                            Notas[j] = tmp;
                        }
                    }
                }
                break;
            case 4:
               System.out.println("GRACIAS POR UTILIZAR NUESTRO PROGRAMA....");
               System.exit(-1);
               break;
        }
        }while(Op!=4);
    }
    
}
