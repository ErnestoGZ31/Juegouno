import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean activo = false;
        while (!activo) {
            System.out.println("inicio, desea jugar con amigos o con bots");
            System.out.println("1 jugar con amigos");
            System.out.println("2 jugar con bots ");
            System.out.println("3  salir de las opciones ");

            Scanner leer = new Scanner(System.in);
            int opcion = leer.nextInt();

            if (opcion == 1) {
                boolean jugadores = false;
                while (!jugadores) {
                    System.out.println("con cuantos amigos deasea jugar");
                    int personas = leer.nextInt();
                    if (personas == 1) {
                        jugadores = true;
                    } else if (personas == 2) {
                        jugadores = true;
                    } else if (personas == 3) {
                        jugadores = true;
                    } else if (personas == 4) {
                        jugadores = true;
                    } else if (personas > 4 || personas <= 0) {
                        System.out.println("El numero de personas es invaido vuelva a intentar");

                    }

                }
            } else if (opcion == 2) {
                boolean jugadores = false;
                while (!jugadores) {
                    System.out.println("con cuantos bots desea jugar");
                    int bots = leer.nextInt();
                    if (bots == 1) {
                        jugadores = true;
                    } else if (bots == 2) {
                        jugadores = true;
                    } else if (bots == 3) {
                        jugadores = true;
                    } else if (bots == 4) {
                        jugadores = true;
                    } else if (bots > 4 || bots <= 0) {
                        System.out.println("El numero de bots es invalido vuelva a intentar ");
                    }

                }
            }
            else if (opcion == 3) {
                activo = true;
                System.out.println("Adios");
            } else {
                System.out.println("Acccion invalida vuelve a intentarlo");
            }
            int Baraja_En_Juego[];
            Baraja_En_Juego = new int[140];
            int cara_carta = 0, activacion_reversa =  0;


            int jugador_1[];
            jugador_1 = new int [8];

            for (int aux=1; aux <= 120; aux++ ) {
                Baraja_En_Juego[aux] = cara_carta ;    																		// llenamos el arreglo de puros 0`s
                System.out.println("Arreglo en posicion: " + aux + "  Tiene un:" + Baraja_En_Juego[aux]);				//imprimimos la posi y aparte lo que tiene el arreglo
                if (cara_carta == 9) {
                    cara_carta = 0;
                }else{
                    if(cara_carta != 9)
                        cara_carta++;
                }
            }


        }

        int Baraja_En_Juego[];  //DECLARAMOS EL ARREGLO
        Baraja_En_Juego=new int[129]; //DECLARACION DEL PROYECTO
        int cara_carta = 0, reversa= 0; //0 es que reversa esta desactivada
        int jugador_1[];
        jugador_1 = new int[8];
        int jugador_2[];
        jugador_2 = new int[8];
        int jugador_3[];
        jugador_3 = new int[8];
        int jugador_4[];
        jugador_4 = new int[8];
        //cara de las cartas, cartas normales
        for (int aux=1; aux<=120; aux++){
            Baraja_En_Juego[aux]=cara_carta;
            System.out.println("Arreglo en posición: "+aux+" tiene un: "+Baraja_En_Juego[aux]);
            if (cara_carta==9){
                cara_carta=0;
            }else{
                if(cara_carta !=9)
                    cara_carta++;
            }
        }
        for (int aux=121; aux<=124;aux++){
            Baraja_En_Juego[aux]=10;
        }
        for (int aux=125; aux<=128;aux++){
            Baraja_En_Juego[aux]=11;
        }

        //Termina de llenarse el arreglo
        //baraja de jugador 1 empieza
        int a=0;
        System.out.println("Baraja jugador 1");
        for (int b=1; b<=7 ; b++){ //llenar baraja jugador 1
            a = (int) (Math.random()*128+1); //numero aleatorio
            if (Baraja_En_Juego[a] == 70){
                b--;
            }
            jugador_1[b]=Baraja_En_Juego[a];
            Baraja_En_Juego[a] = 70; //CARTA OCUPADA
            System.out.println("Carta: "+b+" :::::"+jugador_1[b]+" posicion de baraja "+a);
        }

        for (int aux=1; aux <= 128; aux++){
            if (Baraja_En_Juego[aux]!=70){
                System.out.println(Baraja_En_Juego[aux]);
                System.out.println("CARTA: "+aux+" :::: la posicion de la carta es: "+Baraja_En_Juego[aux]);
            }else{
                System.out.println("Carta: "+aux+ " OCUPADA");
            }
        }
        // baraja jugador 2
        a=0;
        System.out.println("Baraja jugador 2");
        for (int b=1; b<=7 ; b++){ //llenar baraja jugador 2
            a = (int) (Math.random()*128+1); //numero aleatorio
            if (Baraja_En_Juego[a] == 70){
                b--;
            }
            jugador_2[b]=Baraja_En_Juego[a];
            Baraja_En_Juego[a] = 70; //CARTA OCUPADA
            System.out.println("Carta: "+b+" :::::"+jugador_2[b]+" posicion de baraja "+a);
        }

        for (int aux=1; aux <= 128; aux++){
            if (Baraja_En_Juego[aux]!=70){
                System.out.println(Baraja_En_Juego[aux]);
                //System.out.println("CARTA: "+aux+" :::: la posicion de la carta es: "+Baraja_En_Juego[aux]);
            }else{
                System.out.println("Carta: "+aux+ " OCUPADA");
            }
        }
        //baraja jugador 3
         a=0;
        System.out.println("Baraja jugador 3");
        for (int b=1; b<=7 ; b++){ //llenar baraja jugador 3
            a = (int) (Math.random()*128+1); //numero aleatorio
            if (Baraja_En_Juego[a] == 70){
                b--;
            }
            jugador_3[b]=Baraja_En_Juego[a];
            Baraja_En_Juego[a] = 70; //CARTA OCUPADA
            System.out.println("Carta: "+b+" :::::"+jugador_3[b]+" posicion de baraja "+a);
        }

        for (int aux=1; aux <= 128; aux++){
            if (Baraja_En_Juego[aux]!=70){
                System.out.println(Baraja_En_Juego[aux]);
                System.out.println("CARTA: "+aux+" :::: la posicion de la carta es: "+Baraja_En_Juego[aux]);
            }else{
                System.out.println("Carta: "+aux+ " OCUPADA");
            }
        }
       //baraja jugador 4
        a=0;
        System.out.println("Baraja jugador 4");
        for (int b=1; b<=7 ; b++){ //llenar baraja jugador 4
            a = (int) (Math.random()*128+1); //numero aleatorio
            if (Baraja_En_Juego[a] == 70){
                b--;
            }
            jugador_4[b]=Baraja_En_Juego[a];
            Baraja_En_Juego[a] = 70; //CARTA OCUPADA
            System.out.println("Carta: "+b+" :::::"+jugador_4[b]+" posicion de baraja "+a);
        }

        for (int aux=1; aux <= 128; aux++){
            if (Baraja_En_Juego[aux]!=70){
                System.out.println(Baraja_En_Juego[aux]);
                System.out.println("CARTA: "+aux+" :::: la posicion de la carta es: "+Baraja_En_Juego[aux]);
            }else{
                System.out.println("Carta: "+aux+ " OCUPADA");
            }
        }
        //orientacion de jugadores
        Scanner leer = new Scanner(System.in);
        //int leer_dato = leer.nextInt();
        reversa=0; //va a ser reversa desactivada y el 1 va a ser la reversa activada
        int turno_jugador=1;  //80 es reversa y y 90 bloqueo
        while (reversa == 0){
            if (turno_jugador == 8){ //
                turno_jugador =1;
            }else{
                System.out.println("Turno del jugador: "+turno_jugador);
                int leer_dato = leer.nextInt();
                if (leer_dato == 10){
                    System.out.println("Metiste una reversa");
                    turno_jugador= turno_jugador-2;
                    reversa=1;
                }
                if  (leer_dato==11){
                    System.out.println("Metiste un bloqueo");
                    turno_jugador++;
                }
                turno_jugador++;
            }
            while (reversa==1){
                if (turno_jugador==0){
                    turno_jugador=7;
                }else{
                    System.out.println("Turno del jugador: "+turno_jugador);
                    int leer_dato = leer.nextInt();
                    if (leer_dato==10){
                        System.out.println("Metiste una reversa");
                        turno_jugador=turno_jugador+2;
                        reversa=0;
                    }
                    if (leer_dato==11){
                        System.out.println("Metiste un bloqueo");
                        turno_jugador--;
                    }
                    turno_jugador--;
                }
            }
        }
    }
}
