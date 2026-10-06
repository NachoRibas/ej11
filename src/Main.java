import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        double nota_exercicis, nota_pous, nota_examen, nota_practica, mitjana;

        System.out.println("Introdueix la nota dels Exercicis entregables:");
        nota_exercicis = llegir.nextDouble();

        System.out.println("Introdueix la nota dels POUs avaluables:");
        nota_pous = llegir.nextDouble();

        System.out.println("Introdueix la nota de l'Examen final:");
        nota_examen = llegir.nextDouble();

        System.out.println("Introdueix la nota de la Pràctica final:");
        nota_practica = llegir.nextDouble();

        mitjana = (nota_exercicis + nota_pous + nota_examen + nota_practica) / 4;

        if (mitjana >= 5) {
            System.out.println("APROVAT");
        } else {
            System.out.println("NO APROVAT");
        }

        llegir.close();
    }
}