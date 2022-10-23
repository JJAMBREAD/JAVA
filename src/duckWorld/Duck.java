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
	
	//�޼ҵ� 2�� �߰�. fly �ൿ �������̽�, quack �ൿ �������̽� �Ű������� �޾� �����ϴ� 
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
		
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
		
	}
	
	public void swim () {
		System.out.println("��� ������ ���� ��ϴ�. ��¥ ������ ����");
	}

}
