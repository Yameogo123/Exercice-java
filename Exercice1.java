//package Td1 ;
import java.util.Scanner;

public class Exercice1{
    public static void main(String[] args){
        Scanner clavier= new Scanner( System.in);
        System.out.println("Veuillez saisir une année: ");
        int annee = clavier.nextInt();
        while (annee < 0){
            System.out.println("Veuillez saisir une année: ");
            annee = clavier.nextInt();
        }
        if (annee%4==0){
            System.out.println("L'année saisie est bissextile");
        }else{
            System.out.println("L'année n'est pas bissextile");
        }

    }
}