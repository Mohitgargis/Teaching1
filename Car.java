public class Car extends Vehicle
{
private int doorCount;
public Car(String name, String addr, int year, int doorCount)
{
super(name, addr, year);
this.doorCount = doorCount;
}
public void displayAll()
{
    super.displayAll();
    System.out.printf("Doors: %d \n", doorCount);
}
}