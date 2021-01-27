import com.yassine.basic.Train;

public class Application {

	public static void main(String[] args) {
    	    
//		ITrain train2 = new Cargo(new Passenger(new Restaurant(new Train())));
//		
//		System.out.println(train2.print());

        Train train = new Train("HPPCPH");
        System.out.println(train.print());
        	
	}

}
