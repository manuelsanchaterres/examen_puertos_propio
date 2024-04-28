package domain.barcos;

import java.util.ArrayList;

public class Puerto {

    public ArrayList<Barco> barcosEntrantes = new ArrayList<Barco>();
    public ArrayList<Pantalan> listadoPantalanes = new ArrayList<Pantalan>();

    public Puerto () {


    }

    public static void verAmarre(ArrayList<Pantalan> listadoPantalanes) {

        for (Pantalan pantalan: listadoPantalanes) {

            for (Amarre amarre: pantalan.listaAmarres) {

                if (amarre.ocupado) {

                    System.out.println(amarre.barco.matricula + " - Barco amarrado");
                }
            }
        }
    }

    public static void simular (ArrayList<Pantalan> listadoPantalanes) {

        // PANTALAN UNO
        Amarre amarreUno = new Amarre(110,true, new Comercial("4567", "Tsunami", 110, "Carga Textil"));
        Amarre amarreDos = new Amarre(100,true, new Comercial("2345", "Triton", 30, "Teléfonos"));
        // AMARRE COMERCIAL VACÍO
        Amarre amarreTres = new Amarre(100,false, null);
        ArrayList<Amarre> amarresUno = new ArrayList<Amarre>();
        amarresUno.add(amarreUno);
        amarresUno.add(amarreDos);
        amarresUno.add(amarreTres);
        Pantalan pantalanUno = new Pantalan("Comercial", amarresUno);

        // PANTALAN DOS

        Amarre amarreCuatro = new Amarre(50,true, new Recreo("5678", "Berberecho", 4, "Permiso internacional"));
        Amarre amarreCinco = new Amarre(300,true, new Recreo("6789", "Mejillon", 3, "Permiso recreativo"));
        Amarre amarreSeis = new Amarre(100,false, null);
        ArrayList<Amarre> amarresDos = new ArrayList<Amarre>();
        amarresDos.add(amarreCuatro);
        amarresDos.add(amarreCinco);
        amarresDos.add(amarreSeis);
        Pantalan pantalanDos = new Pantalan("Recreo", amarresDos);

        //TODO ¿PORQUE LA ID AUTOINCREMENTAL DE AMARRRE SÓLO SE MANTIENE DENTRO DE LA MISMA ESTANCIA DE PANTALAN Y NO SI CREAMOS NUEVAS ESTANCIAS DE PANTALAN ?
//        Pantalan{id=1, listaAmarres=[Amarre{id=2, tamaño=110.0, ocupado=true, barco=Comercial{carga='Carga Textil', matricula='4567', nombre='Tsunami', tamaño=110.0}}, Amarre{id=2, tamaño=100.0, ocupado=true, barco=Comercial{carga='Teléfonos', matricula='2345', nombre='Triton', tamaño=30.0}}], tipo='Comercial'}
//        Pantalan{id=2, listaAmarres=[Amarre{id=4, tamaño=50.0, ocupado=true, barco=Recreo{permiso='Permiso internacional', matricula='5678', nombre='Berberecho', tamaño=4.0}}, Amarre{id=4, tamaño=300.0, ocupado=true, barco=Recreo{permiso='Permiso recreativo', matricula='6789', nombre='Mejillon', tamaño=3.0}}], tipo='Recreo'}

        listadoPantalanes.add(pantalanUno);
        listadoPantalanes.add(pantalanDos);

    }

    public static void buscarAmarre (ArrayList<Barco> barcosEntrantes, ArrayList<Pantalan> listadoPantalanes) {

        // BUSCAR COINCIDENCIA TIPO DE BARCO Y TIPO DE PANTALÁN
        System.out.println(barcosEntrantes);
        for (Pantalan pantalan: listadoPantalanes) {

            for (Barco barco: barcosEntrantes) {

                if (barco.getClass().getSimpleName().equals(pantalan.tipo)) {

                    for (Amarre amarre : pantalan.listaAmarres) {
                        /* SI EL TAMAÑO DEL AMARRE ES MAYOR O IGUAL AL TAMAÑO DEL BARCO Y EL AMARRE NO ESTÁ OCUPADO,
                        ENTONCES ASIGNAMOS EL BARCO AL AMARRE  Y SACAMOS EL BARCO DE LISTADO BARCOSENTRANTES */

                        if (amarre.tamaño >= barco.tamaño && !amarre.ocupado) {

                            amarre.barco = barco;
                            amarre.ocupado = true;
                            /* TODO CONSULTAR ESTA SOLUCIÓN DE STACKOVERFLOW PARA RESOLVER LA EXCEPCIÓN ConcurrentModificationException
                            AL REMOVER UN ITEM DEL ARRAYLIST MIENTRAS ITERAS SOBRE ÉL*/
                            //https://stackoverflow.com/questions/223918/iterating-through-a-collection-avoiding-concurrentmodificationexception-when-re
                            barcosEntrantes.remove(barco);
                            System.out.println(barcosEntrantes);

                        }
                    }
                }
            }
        }
    }
}
