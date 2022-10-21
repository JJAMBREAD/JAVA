package duckWorld;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	SwimBehavior swimBehavior;
	
	public Duck() {}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performSwim() {
		swimBehavior.swim();
	}
	
	public void swim () {
		System.out.println("��� ������ ���� ��ϴ�. ��¥ ������ ����");
	}

}
