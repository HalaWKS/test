package duck;

/**
 * ��ͷѼ��
 * @author RealWKS
 *
 */
public class MallardDuck extends Duck{

	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("������ͷѼ��");
	}

}
