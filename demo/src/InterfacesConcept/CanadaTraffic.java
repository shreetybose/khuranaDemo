package InterfacesConcept;

public class CanadaTraffic implements CentralTraffic, ContinentTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CanadaTraffic c = new CanadaTraffic();
		c.walkSymbol();

		CentralTraffic c1 = new CanadaTraffic();
		c1.redStop();

		c1.greenGo();
		c1.yellowWait();
		
		
		ContinentTraffic c2 = new CanadaTraffic();
		c2.TrainSymbol();
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("This is redStop implementation");
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("This is greenGo implementation");
	}

	@Override
	public void yellowWait() {
		// TODO Auto-generated method stub
		System.out.println("This is yellowWait implementation");
	}

	public void walkSymbol() {
		System.out.println("This is walk symbol implementation");
	}

	@Override
	public void TrainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("This is train symbol implementation");
	}

}
