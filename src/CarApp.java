
public class CarApp {
public static void main(String[] args) {
	Car a = new Car("90","Porsche","Orange",10);
	Car b = new Car("120","Audi","Magenta",2);
	/*
	a.setSpeed("90");
	a.setMake("Porsche");
	a.setColor("Orange");
	a.setTires(10);
	b.setSpeed("120");
	b.setMake("Audi");
	b.setColor("Magenta");
	b.setTires(2);
	*/
	System.out.println(a.start());
	System.out.println(b.start());
	System.out.println(b.accelerate());
	System.out.println(a.accelerate());
	System.out.println(b.tCount());
	System.out.println(a.max());
	System.out.println(b.max());
	System.out.println(a.stop());
	System.out.println(b.stop());
	System.out.println(a.tCount());
}
}
