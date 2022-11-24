package Java;

public class AustralianTraffic implements CentralTRaffic { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTRaffic a=new AustralianTraffic();
		AustralianTraffic aus =new AustralianTraffic();
		a.RedStop();
		a.GreenGo();
		a.FlashYellow();
		aus.walkonsymbol();  
		
		

	}
	
public void walkonsymbol()
{
	System.out.println("Walking");
}

	@Override
	public void GreenGo() {

		// TODO Auto-generated method stub
		System.out.println(" Green Go indication");
		
	}

	@Override
	public void RedStop() {
		
		// TODO Auto-generated method stub
		System.out.println("Red Stop indication");
		
		
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow flash indication");
		
		
	}

}
