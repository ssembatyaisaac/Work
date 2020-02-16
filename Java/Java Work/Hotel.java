import java.util.Scanner;
/**
 * Hotel
 */
public class Hotel {

    String Name;
    String Location;
    int Rooms;

    public void details(){
        System.out.println("Name: "+this.Name);
        System.out.println("Location: "+this.Location);
        System.out.println("Number Of Rooms: "+this.Rooms);
    }

    public static void main(String[] args) {
        Hotel A[] = new Hotel[5];
        int i = 0;
        Scanner enter = new Scanner(System.in);
        while (i<A.length) {
            A[i] = new Hotel();

            System.out.print("Enter Hotel Name: ");
            A[i].Name = enter.nextLine();
            System.out.print("Enter Hotel Location: ");
            A[i].Location = enter.nextLine();
            System.out.print("Enter Numer Of Rooms: ");
            A[i].Rooms = enter.nextInt();
            enter.nextLine();
            A[i].details();
            i++;
        }
        enter.close();
    }
}