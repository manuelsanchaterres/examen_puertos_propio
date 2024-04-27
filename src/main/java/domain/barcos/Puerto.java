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
        ArrayList<Amarre> amarresUno = new ArrayList<Amarre>();
        amarresUno.add(amarreUno);
        amarresUno.add(amarreDos);
        Pantalan pantalanUno = new Pantalan("Comercial", amarresUno);

        // PANTALAN DOS

        Amarre amarreTres = new Amarre(50,true, new Recreo("5678", "Berberecho", 4, "Permiso internacional"));
        Amarre amarreCuatro = new Amarre(300,true, new Recreo("6789", "Mejillon", 3, "Permiso recreativo"));
        ArrayList<Amarre> amarresDos = new ArrayList<Amarre>();
        amarresDos.add(amarreTres);
        amarresDos.add(amarreCuatro);
        Pantalan pantalanDos = new Pantalan("Recreo", amarresDos);

        //TODO ¿PORQUE LA ID AUTOINCREMENTAL DE AMARRRE SÓLO SE MANTIENE DENTRO DE LA MISMA ESTANCIA DE PANTALAN Y NO SI CREAMOS NUEVAS ESTANCIAS DE PANTALAN ?
//        Pantalan{id=1, listaAmarres=[Amarre{id=2, tamaño=110.0, ocupado=true, barco=Comercial{carga='Carga Textil', matricula='4567', nombre='Tsunami', tamaño=110.0}}, Amarre{id=2, tamaño=100.0, ocupado=true, barco=Comercial{carga='Teléfonos', matricula='2345', nombre='Triton', tamaño=30.0}}], tipo='Comercial'}
//        Pantalan{id=2, listaAmarres=[Amarre{id=4, tamaño=50.0, ocupado=true, barco=Recreo{permiso='Permiso internacional', matricula='5678', nombre='Berberecho', tamaño=4.0}}, Amarre{id=4, tamaño=300.0, ocupado=true, barco=Recreo{permiso='Permiso recreativo', matricula='6789', nombre='Mejillon', tamaño=3.0}}], tipo='Recreo'}

        listadoPantalanes.add(pantalanUno);
        listadoPantalanes.add(pantalanDos);
    }
}
