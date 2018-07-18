package Vehicles;

public class CCar extends CVehicle implements IMove{
    public CCar(){
        super();
    }
    public CCar(String name, int coorX, int coorY, int price, int speed,
            int year){
        super(name, coorX, coorY, price, speed, year);
    }

    @Override
    public void Move() {
        System.out.println("I am moving");
    }
}
