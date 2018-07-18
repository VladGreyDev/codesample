package Vehicles;

public class CShip extends CVehicle implements ISwim {
    private String reg;
    private int seats;
    public CShip(){
        super();
    }
    public CShip(String name, int coorX, int coorY, int price, int speed,
            int year, int seats, String reg){
    super(name, coorX, coorY, price, speed, year);
        this.seats=seats;
        this.reg=reg;
    }
    @Override
    public String toString() {
       return "Name: "+getName()+"; Coordinates: "+getCoorX()+", "+getCoorY()+
               "; Price: "+getPrice()+"; Speed: "+getSpeed()+"; Year: "
               +getYear()+ "; Seats: "+getSeats()+"; Reg: "+getReg()+";"; 
    }
    public String getReg() {
        return this.reg;
    }
    public void setReg(String reg) {
        this.reg=reg;
    }
    public int getSeats() {
        return this.seats;
    }
    public void setSeats(int seats) {
        this.seats=seats;
    }

    @Override
    public void Swim() {
        System.out.println("I am swimming");
    }
}
