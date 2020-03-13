//import java.util.Scanner;

/**
 * Star5
 */
public class Star5 extends Hotel {

    static int pres_suites;
    static int honey_suites;
    int pool_no;

    public void EnterSuites() {
        System.out.print("Enter the number of Presidential Suites: ");
        pres_suites = enter.nextInt();
        System.out.print("Enter the number of Honey Moon Suites: ");
        honey_suites = enter.nextInt();
    }

    public void Suites(int pres_suites, int honey_suites) {
        System.out.printf("\n%s has %d presidential suites and %d honey moon suites\n", Name, pres_suites, honey_suites);
    }

    public void pools(int pool) {
        pool_no = pool;
    }

    public static void main(String[] args) {
        Star5 A[] = new Star5[2];
        int i = 0;
        while (i < A.length) {
            A[i] = new Star5();
            A[i].enterHotel();
            A[i].details();
            A[i].EnterSuites();
            A[i].Suites(pres_suites, honey_suites);
            i++;
	}

    }
    
    
    }
