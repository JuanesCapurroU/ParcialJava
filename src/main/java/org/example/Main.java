package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<CabinaTelefonica> listCabina = new ArrayList<>();
        int opcion =0;
        CabinaTelefonica cabinas;

        do {
            System.out.println("Menu de Cabina Telefonica");
            System.out.println("""
                    1. Registrar Cabinas
                    2. Hacer Llamada en una Cabina
                    3. Mostrar informacion por Cabina
                    4. Mostrar informacion de todas las Cabinas
                    5. Reiniciar Cabinas
                    6. Salir""");
            opcion = input.nextInt();
            switch (opcion){
                case 1->{
                    cabinas=new CabinaTelefonica();
                    System.out.println("Ingrese el Codigo de la cabina nueva: ");
                    cabinas.setCodigoCabina(input.nextInt());
                    cabinas.setDuracionLlamadas(0);
                    cabinas.setCostoLlamadas(0.0);
                    cabinas.setNumeroDeLlamadas(0);

                    listCabina.add(cabinas);
                    System.out.println("Cabina agregada exitosamente..");
                }
                case 2->{
                    if (listCabina.isEmpty()){
                        System.out.println("No hay cabinas registradas..");
                    }else {

                        System.out.println("Ingrese el codigo de la cabina para hacer la llamada: ");
                        int codigo = input.nextInt();

                        for (int i =0; i<listCabina.size();i++){
                            CabinaTelefonica cabinaBusqueda = listCabina.get(i);
                            if (codigo == cabinaBusqueda.getCodigoCabina()){
                                System.out.println("Ingrese la opcion que desee para llamar: \n");
                                System.out.println("""
                        1. Llamadas Locales
                        2. Llamadas largas Distancias
                        3. Llamadas a Celulares""");
                                int opcionCall =  input.nextInt();

                                if (opcionCall==1){
                                    System.out.println("Llamando...\n");
                                    System.out.println("Ingrese cuantos minutos duro la llamada: ");
                                    int duracion =  input.nextInt();
                                    cabinaBusqueda.hacerLlamadaLocal(duracion);
                                    break;
                                } else if (opcionCall==2) {
                                    System.out.println("Llamando....\n");
                                    System.out.println("Ingrese cuantos minutos duro la llamada Larga Distancia: ");
                                    int duracion = input.nextInt();
                                    cabinaBusqueda.hacerLlamadaLargaDistancia(duracion);
                                    break;
                                } else if (opcionCall==3) {
                                    System.out.println("Llamando....\n");
                                    System.out.println("Ingrese cuantos minutos duro la llamada a celular: ");
                                    int duracion = input.nextInt();
                                    cabinaBusqueda.hacerLlamadaCelular(duracion);
                                    break;

                                }else {
                                    System.out.println("Opcion incorrecta");
                                    break;
                                }
                            }else {
                                System.out.println("Cabina no encontrada ");
                                break;
                            }
                        }

                    }
                }case 3->{
                    System.out.println("Ingrese el codigo de la cabina para revisar datos.. ");
                    int codigo = input.nextInt();

                    for (int i = 0; i<listCabina.size();i++){
                        CabinaTelefonica cabinaBusqueda = listCabina.get(i);

                        if (codigo == cabinaBusqueda.getCodigoCabina()){
                            cabinaBusqueda.mostrarInfo();
                        }else {
                            System.out.println("Codigo de cabina no existe");
                            break;
                        }
                    }
                }case 4->{
                    int numeroLlamadasTotal=0;
                    int duracionLlamadasTotal=0;
                    int costoLlamadasTotal=0;

                    for (int i=0; i<listCabina.size();i++){
                        CabinaTelefonica cabinaBusqueda = listCabina.get(i);
                        //System.out.println(cabinaBusqueda);
                        numeroLlamadasTotal += cabinaBusqueda.getNumeroDeLlamadas();
                        duracionLlamadasTotal += cabinaBusqueda.getDuracionLlamadas();
                        costoLlamadasTotal += cabinaBusqueda.getCostoLlamadas();

                    }
                    System.out.println("TOTAL DE TODAS LAS CABINAS: ");
                    System.out.println("Numero de Llamadas Total: "+ numeroLlamadasTotal);
                    System.out.println("Duracion de Llamadas Total: "+ duracionLlamadasTotal);
                    System.out.println("Costo de Llamadas Total: "+ costoLlamadasTotal);

                }
                case 5->{
                    System.out.println("Ingrese el codigo de la cabina para REINICIAR datos.. ");
                    int codigo = input.nextInt();

                    for (int i = 0; i<listCabina.size();i++){
                        CabinaTelefonica cabinaBusqueda = listCabina.get(i);

                        if (codigo == cabinaBusqueda.getCodigoCabina()){
                            cabinaBusqueda.reiniciarCabina();
                            System.out.println("\nDATOS REINICIADOSSSS DE LA CABINA CODIGO: " + cabinaBusqueda.getCodigoCabina());
                        }else {
                            System.out.println("Codigo de cabina no existe");
                            break;
                        }
                    }
                }
            }

        }while (opcion!=6);
    }
}