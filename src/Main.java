public class Main {


    public static void main(String[] args) {
        Oppgaver112 oppgaver112=new Oppgaver112();
        int array1[]=oppgaver112.heltallsTabell();
        int array2[]=oppgaver112.standardArray();
        oppgaver112.printArrayMedindex(array1);
        oppgaver112.printArrayMedindex(array2);
        oppgaver112.min(array2);
        oppgaver112.minVersjon2(array2);
        Oppgaver113 oppgaver113=new Oppgaver113();
        oppgaver113.minMaks(array1);
        Oppgaver115 oppgaver115=new Oppgaver115();
        oppgaver112.printArrayMedindex(array2);
        oppgaver115.maks(array2);
        oppgaver115.maks2(array2);
        oppgaver115.maks4(array2);

    }


}

