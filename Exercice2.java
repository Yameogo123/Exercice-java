//package Td1;
import java.time.Month;
import java.time.Year;
import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        /*
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez saisir une année: ");
        int annee = clavier.nextInt();
        while (annee < 0) {
            System.out.println("Veuillez saisir une année correcte: ");
            annee = clavier.nextInt();
        }
        System.out.println("Veuillez saisir un mois: ");
        int mois = clavier.nextInt();
        while (12< mois | mois< 1) {
            System.out.println("Veuillez saisir une mois correcte: ");
            mois = clavier.nextInt();
        }
        int j;
       if (mois==2 && annee % 4 == 0){
            j= 29;
        }else if(mois == 2 && annee % 4 != 0){
            j= 28;
        }else if(mois==1 | mois==3 | mois == 5 | mois == 7 | mois == 8 | mois == 10 | mois == 12){
            j= 31;
        }else{
            j=30;
        }
        System.out.println("La convertion du mois "+mois+" en jours est: "+j);    
        
        */

        Scanner sc= new Scanner(System.in);
        System.out.println("Veuillez entrer un mois: ");
        int mois2=sc.nextInt();
        while (12 < mois2 | mois2 < 1) {
            System.out.println("Veuillez saisir une mois correcte: ");
            mois2 = sc.nextInt();
        }
        System.out.println("Veuillez entrer un annee: ");
        int annee2 = sc.nextInt();
        while (annee2 < 0) {
            System.out.println("Veuillez saisir une année correcte: ");
            annee2 = sc.nextInt();
        }
        System.out.println("Le nombre de jour du mois "+mois2+" est "+Month.of(mois2).length(Year.isLeap(annee2)));

        
    }
}


