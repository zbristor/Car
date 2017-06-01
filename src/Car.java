
public class Car extends Vehicle {
private String speed;
private String make;
private String color;
private int numTires;
public Car()
{
	System.out.println("A new car is created");
}
public Car(String speed, String make, String color, int numTires)
{
	this.speed = speed;
	this.make = make;
	this.color = color;
	this.numTires = numTires;
}
public String start()
{
	
	return "The "+color+" "+make+" starts";
}
public String accelerate()
{
	return "The "+color+" "+make+" is accelerating";
}
public String max()
{
	return "The "+color+" "+make+" is going "+speed+" mph";
}
public String stop()
{
	return "The "+color+" "+make+" stops";
}

public String tCount()
{
	return "The bodyshop switches the "+numTires+" tires";
}

public String getSpeed()
{
	return speed;
}
public void setSpeed(String speed)
{
	this.speed = speed;
}

public String getMake()
{
	return make;
}

public void setMake(String make)
{
	this.make=make;
}

public String getColor()
{
	return color;
}

public void setColor(String color)
{
	this.color=color;
}
public int getTires()
{
	return numTires;
}

public void setTires(int numTires)
{
	this.numTires=numTires;
}

}