//package Td1;
import java.util.*;
import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Combien de valeur voulez vous ajouter: ");
        int n= sc.nextInt(); 
        List<Integer> Liste= new LinkedList<Integer>();
        int i=0;
        int j;
        while (n>0){
            j= i+1;
            System.out.println("saisir valeur positive "+j+": ");
            int x= sc.nextInt();
            while (x<0){
                System.out.println("saisir valeur correcte "+j+": ");
                x = sc.nextInt();
            }
            Liste.add(x);
            i++;
            n--;
        }
        int S=0;
        int P=1;
        List<Integer> Premier= new LinkedList<Integer>();
        List<Integer> Parfait= new LinkedList<Integer>();
        for(int V: Liste){
            //Determinations des nombres premiers
            int c=0;
            int a=1;
            while(a<=V){
                if(V%a==0){
                    c++;
                }
                a++;
            }
            if(c==2){
                S+=V;
                Premier.add(V);
            }
            //Determination des nombres parfaits
            int S1=0;
            int a1=1;
            while (a1 < V){
                if (V % a1 == 0) {
                    S1+=a1;
                }
                a1++;
            }
            if(V==S1){
                P*=V;
                Parfait.add(V);
            }
        }
        System.out.println(Liste);
        System.out.println("Le nombre minimum premier est: "+Collections.min(Premier));
        System.out.println("Le nombre maximum parfait est: " + Collections.max(Parfait));
        System.out.println("La somme des nombres premiers est "+S);
        System.out.println("Le produit des nombres parfaits est " + P);
        int max= Collections.max(Liste);
        int min= Collections.min(Liste);
        System.out.println("Le maximum est "+max);
        System.out.println("Le minimum est " + min);
        Liste.remove(Liste.indexOf(max));
        Liste.remove(Liste.indexOf(min));
        int max2= Collections.max(Liste);
        int min2= Collections.min(Liste);
        System.out.println("Les deux maximums sont: "+max+" et "+max2);
        System.out.println("Les deux minimums sont: " + min + " et " + min2);
    }
}