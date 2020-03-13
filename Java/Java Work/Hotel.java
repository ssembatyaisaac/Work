import java.util.Scanner;
/**
 * Hotel
 */
public class Hotel {

    String Name;
    String Location;
    int Rooms;
    Scanner enter = new Scanner(System.in);
    

    public void details(){
        System.out.println("\nName: "+this.Name);
        System.out.println("Location: "+this.Location);
        System.out.println("Number Of Rooms: "+this.Rooms+"\n");
    }

    private static void Suites() {
        System.out.println("Different hotels have different kinds of suites");
    }

    protected void enterHotel() {
        System.out.println("");
        System.out.print("Enter Hotel Name: ");
        Name = enter.nextLine();
        System.out.print("Enter Hotel Location: ");
        Location = enter.nextLine();
        System.out.print("Enter Numer Of Rooms: ");
        Rooms = enter.nextInt();
        System.out.println("");
    }

    public static void main(String[] args) {
        Hotel A[] = new Hotel[2];
        int i = 0;
        while (i < A.length) {
            A[i] = new Hotel();
            A[i].enterHotel();
        }
        Suites();
    }
    
}
