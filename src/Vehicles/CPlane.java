package Vehicles;

public class CPlane extends CVehicle implements IFly{
    private int seats;
    private int height;
    public CPlane() {
        super();
    }
    public CPlane(String name, int coorX, int coorY, int price, int speed, int year,
            int seats, int height){
        super(name, coorX, coorY, price, speed, year);
        this.seats=seats;
        this.height=height;
    }
    @Override
    public String toString() {
       return "Name: "+getName()+"; Coordinates: "+getCoorX()+", "+getCoorY()+
               "; Price: "+getPrice()+"; Speed: "+getSpeed()+"; Year: "
               +getYear()+ "; Seats: "+getSeats()+"; Height: "+getHeight()+";"; 
    }
    public int getHeight() {
        return this.height;
    }
    public void setHeight(int height) {
        this.height=height;
    }
    public int getSeats() {
        return this.seats;
    }
    public void setSeats(int seats) {
        this.seats=seats;
    }

    @Override
    public void Fly() {
        System.out.println("I am flying");
    }
}