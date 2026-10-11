class Ticket {
    void getPrice() {
        System.out.println("Ticket Price is: 100");
    }
}
class MovieTicket extends Ticket {
    void getPrice() {
        System.out.println("Movie Ticket Price is: 500");
    }
}
class TrainTicket extends Ticket {
    void getPrice() {
        System.out.println("Train Ticket Price is: 1000");
    }
}
class FlightTicket extends Ticket {
    void getPrice() {
        System.out.println("Flight Ticket Price is: 5000");
    }
    public static void main(String args[]) {
        Ticket t1 = new MovieTicket();
        t1.getPrice();
        Ticket t2 = new TrainTicket();
        t2.getPrice();
        Ticket t3 = new FlightTicket();
        t3.getPrice();
    }
}
