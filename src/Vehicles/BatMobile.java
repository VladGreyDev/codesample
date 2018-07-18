package Vehicles;

public class BatMobile extends Amphibia implements ISwim, IFly, IMove {
    public BatMobile(){
        super();
    }
    public BatMobile(String name, int coorX, int coorY, int price, int speed, int year) {
        super(name, coorX, coorY, price, speed, year);
    }
    public int getFlyingSpeed() {
        return this.getSpeed() * 2;
    }
    @Override
    public void Swim() {
        System.out.println("I am swimming");
    }

    @Override
    public void Fly() {
        System.out.println("I am flying");
    }
    @Override
    public void Move(){
        System.out.println("I am moving");
    }
    
    
}
