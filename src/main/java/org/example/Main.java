package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 0, b = 0,c=0, Option = 0;

        int Can1 = 0,Can1internet=0,Can1radio=0,Can1TV=0,TotCan1=0;
        double Procan1=0,Procam1=0;
        int Can2 = 0,Can2internet=0,Can2radio=0,Can2TV=0,TotCan2=0;
        double Procan2=0,Procam2=0;
        int Can3 = 0,Can3internet=0,Can3radio=0,Can3TV=0,TotCan3=0;
        double Procan3=0,Procam3=0;
        int TV=600000,Radio=200000,Internet=700000;
        while (Option==0) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("+++++++++++++++Elecciones+++++++++++++++++++");
            System.out.println("Ingrese la opcion requerida");
            System.out.println("1.Votar por el candidato de su Eleccion");
            System.out.println("2.Calcular el costo de campaña de un candidato dependiendo de la influencia publicitaria de cada voto");
            System.out.println("3.Vaciar todas las urnas de la votación");
            System.out.println("4.Conocer el número total de votos.");
            System.out.println("5.Porcentaje de votos obtenidos por cada candidato");
            System.out.println("6.Costo promedio de campaña en las elecciones");
            System.out.println("7.Salir");
            a = teclado.nextInt();
            switch (a) {
                case 1: {
                    System.out.println("Seleecione el candidato por el cual desea votar");
                    System.out.println("1. Candidato #1");
                    System.out.println("2. Candidato #2");
                    System.out.println("3. Candidato #3");
                    b = teclado.nextInt();


                    switch (b) {
                        case 1: {
                            System.out.println("Candidato #" + b + "Seleccionad@");
                            Can1 = Can1 + 1;
                            System.out.println("Su  voto se influenciado por cual de las siguientes medios de comunicacion");
                            System.out.println("1.Internet");
                            System.out.println("2.Radio");
                            System.out.println("3.Television");
                            c = teclado.nextInt();
                            switch (c) {
                                case 1: {

                                    Can1internet = Can1internet + 1;
                                    System.out.println("Gracias por participar");

                                    break;
                                }
                                case 2: {

                                    Can1radio = Can1radio + 1;
                                    System.out.println("Gracias por participar");

                                    break;
                                }
                                case 3: {

                                    Can1TV = Can1TV + 1;
                                    System.out.println("Gracias por participar");

                                    break;
                                }
                                default: {
                                    System.out.println("Por favor seleccione una opcion valida");
                                    break;
                                }
                            }

                            break;
                        }
                        case 2: {
                            System.out.println("Candidato #" + b + "Seleccionad@");
                            Can2 = Can2 + 1;
                            System.out.println("Su  voto se influenciado por cual de las siguientes medios de comunicacion");
                            System.out.println("1.Internet");
                            System.out.println("2.Radio");
                            System.out.println("3.Television");
                            c = teclado.nextInt();
                            switch (c) {
                                case 1: {

                                    Can2internet = Can2internet + 1;
                                    System.out.println("Gracias por participar");

                                    break;
                                }
                                case 2: {

                                    Can2radio = Can2radio + 1;
                                    System.out.println("Gracias por participar");

                                    break;
                                }
                                case 3: {

                                    Can2TV = Can2TV + 1;
                                    System.out.println("Gracias por participar");

                                    break;
                                }
                                default: {
                                    System.out.println("Por favor seleccione una opcion valida");
                                    break;
                                }


                            }
                            break;
                        }

                        case 3: {
                            System.out.println("Candidato #" + b + "Seleccionad@");
                            Can3 = Can3 + 1;
                            System.out.println("Su  voto se influenciado por cual de las siguientes medios de comunicacion");
                            System.out.println("1.Internet");
                            System.out.println("2.Radio");
                            System.out.println("3.Television");
                            c = teclado.nextInt();
                            switch (c) {
                                case 1: {

                                    Can3internet = Can3internet + 1;
                                    System.out.println("Gracias por participar");

                                    break;
                                }
                                case 2: {

                                    Can3radio = Can3radio + 1;
                                    System.out.println("Gracias por participar");

                                    break;
                                }
                                case 3: {

                                    Can3TV = Can3TV + 1;
                                    System.out.println("Gracias por pariticipar");

                                    break;
                                }
                                default: {
                                    System.out.println("Por favor seleccione una opcion valida");
                                    break;
                                }
                            }
                            break;
                        }
                        default: {
                            System.out.println("Por favor seleccione una opcion valida");
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Seleecione el candidato  el cual desea calcular el coste de campaña");
                    System.out.println("1. Candidato #1");
                    System.out.println("2. Candidato #2");
                    System.out.println("2. Candidato #3");
                    b = teclado.nextInt();
                    switch (b) {
                        case 1: {
                            TotCan1 = (Can1internet * Internet) + (Can1radio * Radio) + (Can1TV * TV);
                            System.out.println("El total del costo de la campaña del Candidato # " + b + " es " + TotCan1);
                            break;
                        }
                        case 2: {
                            TotCan2 = (Can2internet * Internet) + (Can2radio * Radio) + (Can2TV * TV);
                            System.out.println("El total del costo de la campaña del Candidato # " + b + " es " + TotCan2);
                            break;
                        }
                        case 3: {
                            TotCan3 = (Can3internet * Internet) + (Can3radio * Radio) + (Can3TV * TV);
                            System.out.println("El total del costo de la campaña del Candidato # " + b + " es " + TotCan3);
                            break;
                        }
                        default: {
                            System.out.println("Por favor seleccione una opcion valida");
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("+++++++++++++++Vaciar Urnas+++++++++++++++++++");
                    Can1 = 0;
                    Can1internet = 0;
                    Can1radio = 0;
                    Can1TV = 0;
                    TotCan1 = 0;
                    Can2 = 0;
                    Can2internet = 0;
                    Can2radio = 0;
                    Can2TV = 0;
                    TotCan2 = 0;
                    Can3 = 0;
                    Can3internet = 0;
                    Can3radio = 0;
                    Can3TV = 0;
                    TotCan3 = 0;
                    System.out.println("Se han vaciado las urnas");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

                    break;
                }
                case 4: {
                    System.out.println("+++++++++++++++Total Votos+++++++++++++++++++");
                    System.out.println("Los votos por el Candidato # 1 fueron: " + Can1);
                    System.out.println("Los votos por el Candidato # 2 fueron: " + Can2);
                    System.out.println("Los votos por el Candidato # 3 fueron: " + Can3);
                    double TotVotos = Can1 + Can2 + Can3;
                    System.out.println("El total de votos registrados son: " + TotVotos);
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    break;
                }
                case 5: {
                    System.out.println("++++++++++++Porcentaje Por campaña+++++++++++++++++++");
                    double TotVotos = Can1 + Can2 + Can3;
                    Procan1 = Can1/TotVotos;
                    Procan2 = Can2/TotVotos;
                    Procan3 = Can3/TotVotos;
                    System.out.println("El procentaje de votos por el Candidato # 1 fueron: " + Procan1);
                    System.out.println("El procentaje de votos por el Candidato # 2 fueron: " + Procan2);
                    System.out.println("El procentaje de votos por el Candidato # 3 fueron: " + Procan3);
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    break;
                }
                case 6: {
                    System.out.println("++++++++++++Costo Promedio Por campaña+++++++++++++++++++");
                    TotCan1 = (Can1internet * Internet) + (Can1radio * Radio) + (Can1TV * TV);
                    TotCan2 = (Can2internet * Internet) + (Can2radio * Radio) + (Can2TV * TV);
                    TotCan3 = (Can3internet * Internet) + (Can3radio * Radio) + (Can3TV * TV);


                    Procam1 = TotCan1/Can1 ;
                    Procam2 = TotCan2/Can2;
                    Procam3 = TotCan3/Can3 ;
                    System.out.println("El costo promedio de la campaña del Candidato # 1 fue: " + Procam1);
                    System.out.println("El costo promedio de la campaña del Candidato # 2 fue: " + Procam2);
                    System.out.println("El costo promedio de la campaña del Candidato # 3 fue: " + Procam3);
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    break;
                }
                case 7: {
                    System.out.println("++++++++++++Adios+++++++++++++++++++");
                    Option = 1;

                    break;
                }
                default: {
                    System.out.println("Por favor seleccione una opcion valida");
                    break;
                }
            }

        }
    }


}



