package Vehicles;

abstract public class CVehicle {
    private String name;
    private int coorX;
    private int coorY;
    private int price;
    private int speed;
    private int year;
    CVehicle(){
        super();
    }
    CVehicle(String name, int coorX, int coorY, int price, int speed, int year){
        super();
        this.name=name;
        this.coorX=coorX;
        this.coorY=coorY;
        this.price=price;
        this.speed=speed;
        this.year=year;
    }
    @Override
    public String toString() {
        return "Name: "+name+"; Coordinates: "+coorX+", "+coorY+"; Price: "+price+
                "; Speed: "+speed+"; Year: "+year+";";
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public int getCoorX() {
        return this.coorX;
    }
    public void setCoorX(int coorX) {
        this.coorX=coorX;
    }
    public int getCoorY() {
        return this.coorY;
    }
    public void setCoorY(int coorY) {
        this.coorY=coorY;
    }
    public int getPrice() {
        return this.price;
    }
    public void setPrice(int price) {
        this.price=price;
    }
    public int getSpeed() {
        return this.speed;
    }
    public void setSpeed(int speed) {
        this.speed=speed;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year=year;
    }
    class interior {
        public String color;
        public String type;
        public String getColor() {
            return this.color;
        }
        public void setColor(String color){
            this.color=color;
        }
         public String getType() {
            return this.type;
        }
        public void setType(String color){
            this.color=color;
    }
    }
    static class engine{
        static int ID;
         public int getID() {
            return engine.ID;
        }
        public void setID(int ID){
            engine.ID=ID;
        }
    }
}
