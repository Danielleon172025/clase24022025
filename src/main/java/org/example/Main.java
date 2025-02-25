package org.example;

import com.sun.source.tree.SwitchTree;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

/* Scanner teclado =new Scanner(System.in);
    int a,b, suma;

    System.out.println("Ingrese Primer valor");
    a=teclado.nextInt();
    System.out.println("Ingrese Segundo valor");
    b=teclado.nextInt();

        suma = a+b;
        System.out.println("La suma de: "+a+"Con" + b+"="+suma);
        */
        int Alcancia = 0, M20 = 0, M50 = 0, M100 = 0, M200 = 0, M500 = 0, a = 0, b = 0, Option = 0;
        while (Option==0) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("+++++++++++++++Alcancia+++++++++++++++++++");
            System.out.println("Ingrese la opcion requerida");
            System.out.println("1.Ingresar una Modena");
            System.out.println("2.Contar Monedas por denominacion");
            System.out.println("3.Calcular Total Dinero Almacenado");
            System.out.println("4.Romper Alcancia");
            System.out.println("5.Salir");
            a = teclado.nextInt();


            switch (a) {
                case 1: {
                    System.out.println("Ingrese el valor de la moneda a ingresar en la alcancia");
                    System.out.println("Valores Permitidos");
                    System.out.println("Monedas de $20,$50,$100,$200,$500");
                    b = teclado.nextInt();


                    switch (b) {
                        case 20: {
                            System.out.println("Moneda de" + b + "Seleccionada");
                            Alcancia = Alcancia + 20;
                            M20 = M20 + 1;
                            System.out.println("Moneda de" + b + "Ingresada Correctamente");
                            break;
                        }
                        case 50: {
                            System.out.println("Moneda de" + b + "Seleccionada");
                            Alcancia = Alcancia + 50;
                            M50 = M50 + 1;
                            System.out.println("Moneda de" + b + "Ingresada Correctamente");
                            break;

                        }
                        case 100: {
                            System.out.println("Moneda de" + b + "Seleccionada");
                            Alcancia = Alcancia + 50;
                            M100 = M100 + 1;
                            System.out.println("Moneda de" + b + "Ingresada Correctamente");
                            break;

                        }
                        case 200: {
                            System.out.println("Moneda de" + b + "Seleccionada");
                            Alcancia = Alcancia + 200;
                            M200 = M200 + 1;
                            System.out.println("Moneda de" + b + "Ingresada Correctamente");
                            break;

                        }
                        case 500: {
                            System.out.println("Moneda de" + b + "Seleccionada");
                            Alcancia = Alcancia + 500;
                            M500 = M500 + 1;
                            System.out.println("Moneda de" + b + "Ingresada Correctamente");
                            break;

                        }
                        default: {
                            System.out.println("Los valores a Ingresen deben ser $20,$50,$100,$200 o $500");
                            break;

                        }

                    }
                    break;

                }

                case 2: {
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("Conteo de Monedas por Denominacion");
                    System.out.println("Actualmente cuenta con " + M20 + " Monedas de $20");
                    System.out.println("Actualmente cuenta con " + M50 + " Monedas de $50");
                    System.out.println("Actualmente cuenta con " + M100 + " Monedas de $100");
                    System.out.println("Actualmente cuenta con " + M200 + " Monedas de $200");
                    System.out.println("Actualmente cuenta con " + M500 + " Monedas de $500");
                    break;
                }
                case 3: {
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("Conteo de Dinero Total");
                    System.out.println("El total del dinero Ahora hasta el momento es $  " + Alcancia);
                    break;
                }
                case 4: {
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("             Alcancia Rota      ");
                    System.out.println("El total del dinero recogio es $ " + Alcancia);
                    Alcancia = 0;
                    M20 = 0;
                    M50 = 0;
                    M100 = 0;
                    M200 = 0;
                    M500 = 0;
                    Option=1;
                    break;

                }
                case 5: {
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("Adios");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
                    Option=1;
                    break;

                }
            }


        }

    }


}
