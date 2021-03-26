//package Td1;
import java.util.*;
import java.util.List;
import java.text.*;
import java.util.Scanner;

public class Exercice3 {
    public static boolean check(String date){
        //Def format de date
        SimpleDateFormat format= new SimpleDateFormat("dd-MM-yyyy");
        format.setLenient(false);
        try{
            Date d =format.parse(date);
            System.out.println(date+" est une date valide");
        }catch (ParseException e){
            System.out.println(date+" est une date invalide");
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("veuillez saisir la date au format jj-mm-aaaa: ");
        String Date= sc.nextLine();
        check(Date);
    /*
        String[] split =date.split("-");
        if(split.length==3){
            int jour = Integer.parseInt(split[0]);
            int mois = Integer.parseInt(split[1]);
            int annee = Integer.parseInt(split[2]);
            if (mois == 2 && jour > 29) {
                System.out.println("Erreur nombre de mois!!!");
            } else if (mois <= 12 && mois > 0) {
                if (jour < 0 || jour > 31) {
                    System.out.println("Erreur nombre de jour");
                } else {
                    System.out.println("Date correcte");
                }
            }
        }else{
            System.out.println("Erreur de format");
        }
        */

         
    }
}