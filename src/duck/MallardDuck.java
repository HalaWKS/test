package duck;

/**
 * 绿头鸭类
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
		System.out.println("我是绿头鸭子");
	}

}
