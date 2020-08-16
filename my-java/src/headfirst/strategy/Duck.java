public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public abstract void display();

	public void performeQuack() {
		quackBehavior.quack();
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void swim() {
		System.out.println("All ducks float, even decoys");
	}




}
