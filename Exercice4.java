//package Td1;

import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("veuillez saisir la date au format jj-mm-aaaa: ");
        String Date = sc.nextLine();
        String L[]= Date.split("-");
        int jourS;
        int moisP;
        int moisS;
        int jourP;
        int anneeP=0;
        int anneeS=0;
        if(L.length!=3){
            System.out.println("Erreur de Format");
        }else{
            int jour= Integer.parseInt(L[0]);
            int mois = Integer.parseInt(L[1]);
            int annee = Integer.parseInt(L[2]);
            if(jour<=31 & mois<=12 & jour>0 & mois>0){
                anneeP=annee;
                anneeS=annee;
                if (jour==31 & (mois==3 || mois == 5 || mois == 7 || mois == 8 || mois == 10)){
                    jourS= 01;
                    moisS= mois;
                    jourP= 30;
                    moisP= mois;
                }else if(jour==30 & (mois == 4 || mois == 6 || mois == 9 || mois == 11)){
                    jourS = 01;
                    moisS = mois + 1;
                    jourP = 29;
                    moisP = mois;
                }else if(mois==1 & jour==1){
                    jourS=jour+1;
                    moisS=mois;
                    anneeP=annee-1;
                    moisP=12;
                    jourP=31; 
                }else if(mois==12 & jour==31){
                    moisS= 01;
                    jourS= 01;
                    jourP= jour-1;
                    moisP=mois;
                    anneeS= annee+1;
                }else{
                    anneeS= annee;
                    anneeP= annee;
                    jourS= jour+1;
                    jourP= jour-1;
                    moisS= mois;
                    moisP= mois;
                }
                String anneS = String.valueOf(anneeS);
                String anneP = String.valueOf(anneeP);
                String joursS = String.valueOf(jourS);
                String joursP = String.valueOf(jourP);
                String moiS = String.valueOf(moisS);
                String moiP = String.valueOf(moisP);
                System.out.println("La date qui précède est "+joursP+"-"+moiP+"-"+anneP);
                System.out.println("La date qui suit est " + joursS + "-" + moiS + "-" + anneS);
            }else{
                System.out.println("Erreur de saisi de date");
            }
        }
    }
}