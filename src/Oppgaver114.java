public class Oppgaver114 {
    public static int maks(int[] a)   // versjon 2 av maks-metoden
    {
        int m = 0;               // indeks til største verdi
        int maksverdi = a[0];    // største verdi

        for (int i = 1; i < a.length; i++) if (a[i] > maksverdi)
        {
            maksverdi = a[i];     // største verdi oppdateres
            m = i;                // indeks til største verdi oppdateres
        }
        return m;   // returnerer indeks/posisjonen til største verdi

    } // maks
    /*
    Til fasit  Oppgaver til Avsnitt 1.1.4
1.	Hvor mange grunnleggende operasjoner utfører Programkode 1.1.4 hvis tabellen a inneholder i) 10, 5, 7, 2, 9, 1, 3, 8, 4, 6  ii) 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 og iii) 1, 3, 2, 7, 5, 9, 6, 8, 10, 4. Sammenlign med svarene i oppgave 2, 3 og 4 fra Avsnitt 1.1.3.

     */
    /*
    Regnskapet blir nå 1 + 2 + 1 + n + n−1 + 2(n−1) + 3x + 1 = 4n + 2 + 3x der x er antallet ganger sammenligningen a[i] > maksverdi er sann.

n = 10, x = 0, tilsammen 42
n = 10, x = 9, tilsammen 69
n = 10, x = 4, tilsammen 54
     */


}
