package duckWorld;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
<<<<<<< Upstream, based on branch 'master' of https://github.com/lsy3709/java_sample_test.git
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
=======
	
	public Duck() {}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
>>>>>>> 80c4737 Merge branch 'main' of https://github.com/lsy3709/java_sample_test.git into main
	}
	
	public void swim () {
		System.out.println("��� ������ ���� ��ϴ�. ��¥ ������ ����");
	}

}
