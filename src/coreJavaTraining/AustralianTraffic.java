package coreJavaTraining;

public class AustralianTraffic implements CentralTraffic,ContinentalTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void GreenGo() {

		//CentralTraffic a=new AustralianTraffic();
		AustralianTraffic a=new AustralianTraffic();
		a.RedStop();

		a.GreenGo();
		a.RedStop();
		a.FlashingYellow();
		
		ContinentalTraffic at= new AustralianTraffic();
		at.TraintrafficSignal();

	}

	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void FlashingYellow() {
		// TODO Auto-generated method stub
	}

	@Override
	public void TraintrafficSignal() {
		// TODO Auto-generated method stub
		
	}

}
