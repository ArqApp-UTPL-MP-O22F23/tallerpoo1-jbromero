/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package num_complejos;

import java.util.Scanner;

/**
 *
 * @author jbromero
 */
public class ComplejoPrueba {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Texto = new Scanner(System.in);

        float RealNum;
        float ImaginarioNum;

        Num_Complejos Ecuacion1;
        Num_Complejos Ecuacion2;
        Num_Complejos res;

        System.out.print("Metematicas Numeros Complejos \n");
        System.out.print("Ingresar valor real de la ecuacion 1: \n");
        RealNum = Texto.nextFloat();
        System.out.print("Ingresar valor imaginario de la ecuacion 1: \n");
        ImaginarioNum = Texto.nextFloat();

        Ecuacion1 = new Num_Complejos(RealNum, ImaginarioNum);
        

        System.out.print("Ingresar valor real de la ecuacion 2: \n");
        RealNum = Texto.nextFloat();
        System.out.print("Ingresar valor imaginario de la ecuacion 2: \n");
        ImaginarioNum = Texto.nextFloat();

        Ecuacion2 = new Num_Complejos(RealNum, ImaginarioNum);

        int eleccion = Opciones();
        while (eleccion != 3) {
            switch (eleccion) {
                case 1:
                    res = Ecuacion1.Suma(Ecuacion2);
                    System.out.printf("a + b = %s\n",
                            res.toString());
                    break;
                case 2:
                    res = Ecuacion1.Resta(Ecuacion2);
                    System.out.printf("a - b = %s\n",
                            res.toString());
                    break;
            }
            eleccion = Opciones();
        }

    }

    private static int Opciones() {
        Scanner Texto = new Scanner(System.in);
        System.out.println("1. Suma\n2. Resta\n3. Terminar");
        System.out.print("Selecione alguna de las operacion o termine el programa: ");
        return Texto.nextInt();
    }
}
