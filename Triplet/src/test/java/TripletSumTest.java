
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class TripletSumTest {
	
	
	//Happy flow
	@Test
	public void happyFlowIndexNumber_4() {
		int arr[]= {1,2,3,4,5};
		TripletSum ts=new TripletSum();
		assertEquals(1,ts.triplet_sum(arr,5,7));
	}
	@Test
	public void Sum_notPossible() {
		int arr[]= {1,2,3,4,5};
		TripletSum ts=new TripletSum();
		assertEquals(-1,ts.triplet_sum(arr,5,0));
	}
	@Test
	public void NegativeFlowIndexNumber_4() {
		int arr[]= {1,2,3,4,5};
		TripletSum ts=new TripletSum();
		assertEquals(-1,ts.triplet_sum(arr,4,0));
	}
	
}
