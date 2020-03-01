/**
 * Star3
 */
public class Star3 extends Hotel{
	int suite_no;
	public void sut(int suite){
	suite_no = suite;
	
	}
	public void Suites() {
        System.out.println("We only have "+ suite_no+" Honey moon Suits");
    	}
    	
    	public static void main(String[] args) {
	Star3 A[] = new Star3[3];
	int i=0;
	while(i<A.length){
        A[i] = new Star3();
        A[i].enterHotel();
        A[i].details();
        A[i].sut(2);
        A[i].Suites();	
	}
    
}

}
