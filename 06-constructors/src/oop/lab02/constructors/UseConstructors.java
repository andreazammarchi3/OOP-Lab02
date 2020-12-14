package oop.lab02.constructors;

import javax.security.auth.callback.LanguageCallback;
import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class UseConstructors {

    public static void main(final String[] args) {
        /*
        * 1) Creare lo studente Mario Rossi, matricola 1014, anno
        * immatricolazione 2013
        * 
        * 2) Creare lo studente Luca Bianchi, matricola 1018, anno
        * immatricolazione 2010
        * 
        * 3) Creare lo studente Peppino Vitiello, matricola 1019, anno
        * immatricolazione 2012
        * 
        * 4) Creare lo studente Luca Verdi, matricola 1020, anno
        * immatricolazione 2013
        */
        final Student marioRossi = new Student("Mario", "Rossi", 1014, 2013);
        final Student lucaBianchi = new Student("Luca", "Bianchi", 1018, 2010);
        final Student peppinoVitiello = new Student("Peppino", "Vitiello", 1019, 2012);
        final Student lucaVerdi = new Student("Luca", "Verdi", 1020, 2013);

        marioRossi.printStudentInfo();
        lucaBianchi.printStudentInfo();
        peppinoVitiello.printStudentInfo();
        lucaVerdi.printStudentInfo();

        /*
         * 5) Creare un treno con 300 posti di cui 100 in prima classe 200 in
         * seconda classe
         * 
         * 6) Creare un treno con 1100 posti di cui 50 in prima classe 1050 in
         * seconda classe
         * 
         * 7) Creare un treno con 500 posti, tutti di seconda classe
         * 
         * 8) Creare un treno con numero di posti di default
         */
        final Train train300 = new Train(300, 100, 200);
        final Train train1100 = new Train(1100, 50, 1050);
        final Train train500 = new Train(500, 0, 500);
        final Train trainDefault = new Train();

        train300.printTrainInfo();
        train1100.printTrainInfo();
        train500.printTrainInfo();
        trainDefault.printTrainInfo();

        System.out.println(trainDefault.getTotalSeats() > 0 ? "OK" : "BUG.");
        System.out.println(trainDefault.getTotalSeats() == trainDefault.getFirstClassSeats()
            + trainDefault.getSecondClassSeats() ? "OK" : "BUG");
    }
}
