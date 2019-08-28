import java.util.Random;

public class Oppgaver112 {
    int lengde=10;
    int arrayForskjellig[]= new int [lengde];
    int arrayIkkeForskjellig[]=new int[lengde];


    Random rand=new Random();
    int r=rand.nextInt(10);
    public void printArrayMedindex(int array[]){
        for(int i=0; i<lengde; i++) {
            System.out.printf("%5s", i);
        }
        System.out.println();
        for (int j = 0; j <array.length; j++){
            System.out.printf("%5s",array[j]);

        }
        System.out.println();
        System.out.println();
    }

    public int[] heltallsTabell() {
        for(int i=0; i<lengde; i++){
            arrayForskjellig[i]=rand.nextInt(10);
            if(i>0){
                for(int j=0;j<i; j++){
                    if(arrayForskjellig[i]==arrayForskjellig[j]){
                        i--;
                    }
                }
            }

        }
        return arrayForskjellig;
    }
    public int[] standardArray(){
        for (int i=0; i<lengde; i++){
            arrayIkkeForskjellig[i]=rand.nextInt(10);
        }
        return arrayIkkeForskjellig;
    }


    /*
    Til fasit  Oppgaver til Avsnitt 1.1.2
1.	Anta at vi har en min-metode, dvs. en metode som finner (og returnerer) posisjonen til den minste verdien i en tabell. Hva ville metodekallet min(a) returnere med hvis a er tabellen i Figur 1.1.2?
2.	Lag en min-metode på samme måte som maks-metoden i Programkode 1.1.2, dvs. en metode som finner (og returnerer) posisjonen til den minste verdien i en tabell.
3.	Hvis den største verdien forekommer flere ganger, vil maks-metoden returnere posisjonen til den første av dem. Hva må endres for at den skal returnere posisjonen til den siste?
     */

    /*Oppgave 1*/
    // Den returnere 6 siden den siste verdien ligger i posisjon 6

    /*Oppgave 2 */

    public String min(int [] a){
        if(a.length<1){
            throw new java.util.NoSuchElementException("Tabellen er tom ");
        }
        int min=a[0];
        for(int i=1; i<a.length-1; i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println();
        System.out.print(min+" er den minste verdien");
        return min+" er den minste verdien";
    }

    /*Oppgave 3, måten vi gjør det på er at vi leser fra motsatt vei*/
    public String minVersjon2 (int[] a){
        if(a.length<1){
            throw new java.util.NoSuchElementException("Tabellen er tom ");
        }
        int min=a[a.length-1];
        for(int i=a.length-1; i>=0; i--){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println();
        System.out.print(min+" er den minste verdien");
        return min+" er den minste verdien";
    }



}
