import Controller.Compare;
import Vehicles.*;
import java.util.Arrays;
public class Lesson_3 {


    public static void main(String[] args) {
        Compare comp = new Compare();
        CVehicle car1 = new CCar("Volvo", 0, 0, 4000, 100, 2017);
        CVehicle car2 = new CCar("Toyota", 0, 0, 30000, 150, 2018);
        CVehicle car3 = new CCar("Ferrari", 0, 0, 100000, 250, 2015);
        CVehicle car4 = new CCar("Truck", 0, 0, 20000, 60, 2000);
        CVehicle ship1 = new CShip("Mani", 0, 0, 2000000, 50, 2005, 250, "New York");
        CVehicle ship2 = new CShip("Prichett", 0, 0, 120000, 80, 2010, 4, "LA");
        CVehicle ship3 = new CShip("Phil", 0, 0, 7000, 25, 2016, 5, "LA");
        CVehicle plane1 = new CPlane("Superfast", 0, 0, 2500000, 1200, 2018, 1, 1500);
        CVehicle plane2 = new CPlane("Passenger", 0, 0, 3000000, 800, 2010, 200, 1000);
        CVehicle plane3 = new CPlane("Handmade", 0, 0, 1500, 30, 2015, 2, 150);
        CVehicle amph1 = new Amphibia("Amphibia", 0, 0, 500000, 100, 2018);
        CVehicle bmb1 = new BatMobile("Batmobile", 0, 0, 50000000, 200, 2017);
        CVehicle[] arr = new CVehicle[12];
        arr[0]=car1;
        arr[1]=car2;
        arr[2]=car3;
        arr[3]=car4;
        arr[4]=ship1;
        arr[5]=ship2;
        arr[6]=ship3;
        arr[7]=plane1;
        arr[8]=plane2;
        arr[9]=plane3;
        arr[10]=amph1;
        arr[11]=bmb1;
        System.out.println(Arrays.toString(comp.minPriceSort(arr)));
        System.out.println(comp.lowPrice(arr));
        System.out.println(comp.iMoveMax(arr));
        System.out.println(comp.iMoveMin(arr));
    }
}
