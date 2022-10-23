package duckWorld;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		System.out.println("======û�տ���======");
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		mallard.swim();
		
		// ������ �����. 
		System.out.println("======������======");
		Duck swimDuck = new WaterDuck();
		swimDuck.performQuack();
		swimDuck.performFly();
		swimDuck.swim();
		swimDuck.performSwim();
		
		//�� ���� �����
		System.out.println("======���Ͽ���======");
		Duck model = new ModelDuck();
		System.out.println("======���� ���� ������===");
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		System.out.println("======���� ���� ������===");
		model.performFly();
		
		
	}

}
