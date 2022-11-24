package Java;

public class TaskPriority implements PriorityExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskPriority tp =new TaskPriority();
		Priority pe =new PriorityExample();
		tp.Onesevere();
		tp.TwoModerate();
		tp.ThreeLow();
		pe.f
		 

	}
	
public void FourVerySevere()
{
	System.out.println("First");
	
}

	@Override
	public void Onesevere() {
		// TODO Auto-generated method stub
		System.out.println("High severity");
		
	}

	@Override
	public void TwoModerate() {
		// TODO Auto-generated method stub
		System.out.println("Medium severity");
		
		
	}

	@Override
	public void ThreeLow() {
		// TODO Auto-generated method stub
		System.out.println("Less severity");
		
		
	}

}
