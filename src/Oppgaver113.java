public class Oppgaver113 {
    /*Til fasit  Oppgaver til Avsnitt 1.1.3
1.	Et eksempel på en oppgave som kan løses på mange forskjellige måter er det å sortere verdiene i en tabell. Hvor mange sorteringsalgoritmer kjenner du til? På Wikipedia finner du en oversikt over sorteringsalgoritmer.
2.	Gitt en tabell med verdiene 10, 5, 7, 2, 9, 1, 3, 8, 4, 6. Hvor mange grunnleggende operasjoner vil algoritmen i Programkode 1.1.2 utføre på denne tabellen. Se regnskapet over og Eksempel 1.1.3.
3.	Som oppgave 2, men med verdiene 1, 2, 3, 4, 5, 6, 7, 8, 9, 10.
4.	Som oppgave 2, men med verdiene 1, 3, 2, 7, 5, 9, 6, 8, 10, 4.
5.	Lag en metode public static int[] minmaks(int[] a). Den skal ved hjelp av en int-tabell med lengde 2 returnere posisjonene til minste og største verdi i tabellen a. Hvis du har funnet at m1 er posisjonen til den minste og m2 til den største, kan du returnere tabellen b definert ved:   int[] b = {m1, m2}; Hvor mange sammenligninger bruker metoden din?
6.	Utrykket n! betyr n fakultet og er gitt ved n! = n · (n-1) ·  ·  · 2 · 1 . Lag en metode
long fak(int n) som regner ut n! . Hvor mange multiplikasjoner utføres i metoden?
*/
    //Oppgave 1
    /*
    Utvalgssortering (eng: selection sort)
Innsettingssortering (eng: insertion sort)
Boblesortering (eng: bubble sort)
Kvikksortering (eng: quick sort)
Flettesortering (eng: merge sort)
Heapsortering (eng: heap sort)
Grunntallssortering (eng: radix sort)
     */
    // Oppgave 2
    /*
    Regnskapet sier at antallet grunnleggende operasjoner er 5n + x der x er antallet ganger sammenligningen a[i] > a[m] er sann. Med de 10 verdiene 10, 5, 7, 2, 9, 1, 3, 8, 4, 6 vil sammenligningen aldri bli sann siden den største ligger først, dvs. x = 0. Dermed blir det utført 5·10 = 50 grunnleggende operasjoner.

     Oppgave 3

Her blir x = 9 og dermed 5·10 + 9 = 59 grunnleggende operasjoner.

Oppgave 4

Her blir x = 4 og dermed 5·10 + 4 = 54 grunnleggende operasjoner.
     */

    /*
    Oppgave 5
     */
    public int [] minMaks(int [] a){
        int  [] returnertArray=new int [2];
        int min=a[0];
        int max=a[0];
        for(int i=1; i<a.length-1;i++){
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }

        }
        returnertArray[0]=min;
        returnertArray[1]=max;
        System.out.println();
        System.out.println(min+" er minst \n"+max+" er maks" );
        return returnertArray;
        //return new int[]{min,max};

    }
    public long fak(int n)
    {
        if (n < 0)
            throw new IllegalArgumentException("n < 0");
        long fak = 1;

        for (int i = 2; i <= n; i++) fak *= i;

        return fak;
    }
}
