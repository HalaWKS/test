package duck;

public class MiniDuckStimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		mallard.display();
		mallard.swim();
	}

}
