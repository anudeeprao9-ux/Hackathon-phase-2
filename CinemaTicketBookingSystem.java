import java.util.Scanner;

class MovieTicket {
    String movieName;
    double ticketPrice;
    int numberOfTickets;

    public MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    public double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    public double calculateDiscount() {
        double total = calculateTotal();
        if (numberOfTickets >= 5) {
            return total * 0.10;
        } else {
            return 0.0;
        }
    }

    public double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    public void displayBill() {
        System.out.println("\n--- Booking Bill ---");
        System.out.println("Movie Name     : " + movieName);
        System.out.printf("Ticket Price   : $%.2f\n", ticketPrice);
        System.out.println("Number of Seats: " + numberOfTickets);
        System.out.printf("Total Amount   : $%.2f\n", calculateTotal());
        System.out.printf("Discount       : $%.2f\n", calculateDiscount());
        System.out.printf("Final Amount   : $%.2f\n", calculateFinalAmount());
    }
}

public class CinemaTicketBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter movie name: ");
        String name = scanner.nextLine();

        System.out.print("Enter ticket price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter number of tickets: ");
        int tickets = scanner.nextInt();

      
        MovieTicket booking = new MovieTicket(name, price, tickets);

        booking.displayBill();

        scanner.close();
    }
}
