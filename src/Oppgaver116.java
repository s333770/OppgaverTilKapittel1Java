public class Oppgaver116 {
    /*
    Oppgave 1

    Permutasjonene der 5 står på fast plass	Sum antall
5 står først	0
            5 står på andre plass	24
            5 står på tredje plass	36
            5 står nest sist	44
            5 står sist	50
    Gjennomsnittet:  (0 + 24 + 36 + 44 + 50)/120 = 154/120 = 77/60 = 1/2 + 1/3 + 1/4 + 1/5.

    Her kommer forøvrig alle de 120 permutasjonene og i hver permutasjon er de tallene som er større enn alle foran markert med fet type:

            1 2 3 4 5    1 2 3 5 4    1 2 4 3 5    1 2 4 5 3
            1 2 5 3 4    1 2 5 4 3    1 3 2 4 5    1 3 2 5 4
            1 3 4 2 5    1 3 4 5 2    1 3 5 2 4    1 3 5 4 2
            1 4 2 3 5    1 4 2 5 3    1 4 3 2 5    1 4 3 5 2
            1 4 5 2 3    1 4 5 3 2    1 5 2 3 4    1 5 2 4 3
            1 5 3 2 4    1 5 3 4 2    1 5 4 2 3    1 5 4 3 2
            2 1 3 4 5    2 1 3 5 4    2 1 4 3 5    2 1 4 5 3
            2 1 5 3 4    2 1 5 4 3    2 3 1 4 5    2 3 1 5 4
            2 3 4 1 5    2 3 4 5 1    2 3 5 1 4    2 3 5 4 1
            2 4 1 3 5    2 4 1 5 3    2 4 3 1 5    2 4 3 5 1
            2 4 5 1 3    2 4 5 3 1    2 5 1 3 4    2 5 1 4 3
            2 5 3 1 4    2 5 3 4 1    2 5 4 1 3    2 5 4 3 1
            3 1 2 4 5    3 1 2 5 4    3 1 4 2 5    3 1 4 5 2
            3 1 5 2 4    3 1 5 4 2    3 2 1 4 5    3 2 1 5 4
            3 2 4 1 5    3 2 4 5 1    3 2 5 1 4    3 2 5 4 1
            3 4 1 2 5    3 4 1 5 2    3 4 2 1 5    3 4 2 5 1
            3 4 5 1 2    3 4 5 2 1    3 5 1 2 4    3 5 1 4 2
            3 5 2 1 4    3 5 2 4 1    3 5 4 1 2    3 5 4 2 1
            4 1 2 3 5    4 1 2 5 3    4 1 3 2 5    4 1 3 5 2
            4 1 5 2 3    4 1 5 3 2    4 2 1 3 5    4 2 1 5 3
            4 2 3 1 5    4 2 3 5 1    4 2 5 1 3    4 2 5 3 1
            4 3 1 2 5    4 3 1 5 2    4 3 2 1 5    4 3 2 5 1
            4 3 5 1 2    4 3 5 2 1    4 5 1 2 3    4 5 1 3 2
            4 5 2 1 3    4 5 2 3 1    4 5 3 1 2    4 5 3 2 1
            5 1 2 3 4    5 1 2 4 3    5 1 3 2 4    5 1 3 4 2
            5 1 4 2 3    5 1 4 3 2    5 2 1 3 4    5 2 1 4 3
            5 2 3 1 4    5 2 3 4 1    5 2 4 1 3    5 2 4 3 1
            5 3 1 2 4    5 3 1 4 2    5 3 2 1 4    5 3 2 4 1
            5 3 4 1 2    5 3 4 2 1    5 4 1 2 3    5 4 1 3 2
            5 4 2 1 3    5 4 2 3 1    5 4 3 1 2    5 4 3 2 1
            */
     /*
    //Oppgave 2

    a(3,0) = 2	3 1 2, 3 2 1
    a(3,1) = 3	1 3 2, 2 1 3, 2 3 1
    a(3,2) = 1	1 2 3
    a(4,0) = 6	4 1 2 3, 4 1 3 2, 4 2 1 3, 4 2 3 1, 4 3 1 2, 4 3 2 1
    a(4,1) = 11	1 4 2 3, 1 4 3 2, 2 1 4 3, 2 4 1 3, 2 4 3 1, 3 1 2 4,
            3 1 4 2, 3 2 1 4, 3 2 4 1, 3 4 1 2, 3 4 2 1
    a(4,2) = 6	1 2 4 3, 1 3 2 4, 1 3 4 2, 2 1 3 4, 2 3 1 4, 2 3 4 1
    a(4,3) = 1	1 2 3 4
    */

    //Oppgave 3

    public static double harmonisk(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) sum += 1.0 / i;
        return sum;
    }
    //Oppgave 4

    public static double euler(int n) {
        return harmonisk(n) - Math.log(n);
    }
    /*
    n = 637 gir euler(n) = 0.5780003888865783
    n = 638 gir euler(n) = 0.577999159233074
*/
    //  Oppgave 5

public void oppgave5(){
        int n = 10;
        for(int i = 0; i < 7; i++) // utføres 7 ganger
        {
            double x = Math.log(n) - 0.423;
            System.out.printf("n = %-8d   ln(n)-0.423 = %4.1f\n",n,x);
            n *= 10;
        }
    }

}
