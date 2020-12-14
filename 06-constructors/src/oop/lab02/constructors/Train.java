package oop.lab02.constructors;

public class Train {

    public static final int DEFAULT_N_TOT_SEATS = 100;
    public static final int DEFAULT_N_FC_SEATS = 40;
    public static final int DEAFULT_N_SC_SEATS = 60;
    private final int seats;
    private final int firstClassSeats;
    private final int secondClassSeats;
    private int firstClassReserved;
    private int secondClassReserved;

    public Train() {
        this.seats = DEFAULT_N_TOT_SEATS;
        this.firstClassSeats = DEFAULT_N_FC_SEATS;
        this.secondClassSeats = DEAFULT_N_SC_SEATS;
        this.firstClassReserved = 0;
        this.secondClassReserved = 0;
    }

    public Train(final int nTotSeats, final int nFCSeats, final int nSCSeats) {
        this.seats = nTotSeats;
        this.firstClassSeats = nFCSeats;
        this.secondClassSeats = nSCSeats;
        this.firstClassReserved = 0;
        this.secondClassReserved = 0;
    }

    public void deleteAllReservations() {
        this.firstClassReserved = 0;
        this.secondClassReserved = 0;
    }

    public double getFirstClassOccupancyRatio() {
        return this.firstClassReserved * 100d / this.firstClassSeats;
    }

    public double getSecondClassOccupancyRatio() {
        return this.secondClassReserved * 100d / this.secondClassSeats;
    }

    public double getOccupancyRatio() {
        return (this.firstClassReserved + this.secondClassReserved) * 100d / this.seats;
    }

    public int getFirstClassSeats() {
        return this.firstClassSeats;
    }

    public int getSecondClassSeats() {
        return this.secondClassSeats;
    }

    public int getTotalSeats() {
        return this.seats;
    }

    public void printTrainInfo() {
        System.out.println("Train info:\n\t- nTotSeats: " + this.seats);
        System.out.println("\t- nFCSeats: " + this.firstClassSeats);
        System.out.println("\t- nSCSeats: " + this.secondClassSeats);
        System.out.println("\t- nFCReservedSeats: " + this.firstClassReserved);
        System.out.println("\t- nSCReservedSeats: " + this.secondClassReserved + "\n");
    }

    public void reserveFirstClassSeats(final int n) {
        this.firstClassReserved += n;
    }

    public void reserveSecondClassSeats(final int n) {
        this.secondClassReserved += n;
    }
}
