package duckWorld;

public class WaterDuck extends Duck {

	public WaterDuck() {
		// �� �Ҹ����� Ŭ���� ������ ȣ��
		quackBehavior = new Quack();
		// ���� �ִ� ���� 
		flyBehavior = new FlyWithWings();
		// ���� �ϴ� ���� 
		swimBehavior = new Swimming();
		
	}
	
	@Override
	public void display() {
		System.out.println("��� �������Դϴ�.");
	}

}
