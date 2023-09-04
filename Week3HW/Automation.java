package Week3HW;

public class Automation extends MultipleLanguage implements TestTool,Language{

	public Automation auto;
	@Override
	public void Java() {
		auto=new Automation();
		System.out.println("The language chosen is java");
		
	}

	@Override
	public void ruby() {
		System.out.println("The language chosen is Ruby");
		
	}

	@Override
	public void Selenium() {
		//auto.getname("Selenium");
		// TODO Auto-generated method stub
		System.out.println("The language chosen is Selenium");
		
	}
	public static void main(String[] args) {
		Automation auto=new Automation();
		auto.Java();
		auto.ruby();
		auto.Selenium();
	}

	//private void getname(String string) {
		// TODO Auto-generated method stub
		
	}

