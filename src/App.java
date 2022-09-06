public class App {
    public static void main(String[] args) throws Exception {
        //#EJERCICIO LISTO PARA ENTREGAR 06/09/2022

        int numeroif = -0;

        //# SENTENCIA DE CONTROL if
        System.out.println("Sentencia de Control if...");

        if (numeroif < 0){
            System.out.println("El valor de la variable numeroif es negativo...");
        }else if (numeroif > 0){
            System.out.println("El valor de la variable numeroif es positivo...");
        }
        else{
            System.out.println("El valor de la variable numeroif es cero...");
        }

        //# BUCLE WHILE
        System.out.println("Bucle while...");

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile ++;
        }

        //# BUCLE DO
        System.out.println("Bucle Do...");

        do {
            System.out.println(numeroWhile);
            numeroWhile ++;
        } while (numeroWhile <= 3);

        //# BUCLE FOR
        System.out.println("Bucle for...");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor ++) {
            System.out.println(numeroFor);
        }

        //# Sentencia de Control Switch o Discentir
        System.out.println("Sentencia de Control Switch Case");

        var estacion = "OTO";

        switch (estacion) {
            case "PRIMAVERA":
                System.out.println("La estación es primavera.");
                break;
            case "VERANO":
                System.out.println("La estación es verano.");
                break;
            case "OTOÑO":
                System.out.println("La estación es otoño.");
                break;
            case "INVIERNO":
                System.out.println("La estación es invierno. ");
                break;
            default:
                System.out.println("Ése valor no es ninguna estación.");
        }
    }
}
