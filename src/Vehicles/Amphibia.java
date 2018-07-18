package Vehicles;

public class Amphibia extends CCar implements ISwim, IMove {
    public Amphibia(){
        super();
    }
    public Amphibia(String name, int coorX, int coorY, int price, int speed,
            int year) {
        super(name, coorX, coorY, price, speed, year);
    }
    public double getSwimmingSpeed() {
        return this.getSpeed() * 0.5;
    }
    @Override
    public void Swim() {
        System.out.println("I am swimming");
    }
    
}
