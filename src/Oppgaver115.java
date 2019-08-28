public class Oppgaver115 {

    public int maks(int[] a)  // versjon 3 av maks-metoden
    {
        int sist = a.length - 1;       // siste posisjon i tabellen
        int m = 0;                     // indeks til største verdi
        int maksverdi = a[0];          // største verdi
        int temp = a[sist];            // tar vare på siste verdi
        a[sist] = 0x7fffffff;          // legger tallet 2147483647 sist

        for (int i = 0; ; i++)         // i starter med 0
            if (a[i] >= maksverdi)       // denne blir sann til slutt
            {
                if (i == sist)             // sjekker om vi er ferdige
                {
                    a[sist] = temp;          // legger siste verdi tilbake
                    System.out.println(temp >= maksverdi ? a[sist] : a[m]);
                    return temp >= maksverdi ? sist : m;   // er siste størst?
                }
                else
                {
                    maksverdi = a[i];        // maksverdi oppdateres
                    m = i;                   // m oppdateres
                }
            }
    } // maks
    public int maks2(int[] a)
    {
        int m = a.length - 1;          // indeks til største verdi
        int maksverdi = a[m];          // største verdi
        int temp = a[0];               // tar vare på første verdi
        a[0] = 0x7fffffff;             // legger tallet 2147483647 først

        for (int i = m; ; i--)         // i starter bakerst
            if (a[i] >= maksverdi)       // denne blir sann for i = 0
            {
                if (i == 0)                // sjekker om vi er ferdige
                {
                    a[0] = temp;             // legger siste verdi tilbake
                    System.out.println(temp >= maksverdi ? a[0] : a[m]);
                    return temp >= maksverdi ? a[0] : a[m]; // er første størst?
                }
                else
                {
                    maksverdi = a[i];        // maksverdi oppdateres
                    m = i;                   // m oppdateres
                }
            }
    } // maks

    /*
    Oppgave 3

     */
    public int maks4(int[] a)
    {
        int sist = a.length - 1;       // siste posisjon i tabellen
        int m = 0;                     // indeks til største verdi
        int maksverdi = a[0];          // største verdi
        int temp = a[sist];            // tar vare på siste verdi
        a[sist] = maksverdi;           // maksverdi legges sist

        for (int i = 0; ; i++)         // i starter med 1
            if (a[i] >= maksverdi)       // denne blir sann til slutt
            {
                if (i == sist)             // sjekker om vi er ferdige
                {
                    a[sist] = temp;          // legger siste verdi tilbake
                    System.out.println(a[sist] > maksverdi ? a[sist] : a[m]);
                    return a[sist] > maksverdi ? sist : m; // er siste størst?
                }
                else if  (a[i] > maksverdi)
                {
                    maksverdi = a[i];        // maksverdi oppdateres
                    a[sist] = maksverdi;     // maksverdi legges sist
                    m = i;                   // m oppdateres
                }
            }
    } // maks

}
