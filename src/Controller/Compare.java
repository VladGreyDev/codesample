package Controller;

import Vehicles.*;
import java.util.Arrays;

public class Compare {
    public CVehicle highPrice(CVehicle[] arr) {
        return maxPriceSort(arr)[arr.length-1];
    }
    public CVehicle[] maxPriceSort(CVehicle [] arr){
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i]=arr[i].getPrice();
        }
        Arrays.sort(temp);
        CVehicle[] result = new CVehicle[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].getPrice()==temp[j]) result[j]=arr[i];
            }
        }
        return result;
    }
    public CVehicle lowPrice(CVehicle[] arr){
        return minPriceSort(arr)[arr.length-1];
    }
    public CVehicle[] minPriceSort(CVehicle[] arr){
      int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i]=arr[i].getPrice();
        }
        Arrays.sort(temp);
        int[] temp2 = new int[temp.length];
        for (int i = 0; i < temp2.length; i++) {
            temp2[i]=temp[temp.length-i-1];
        }
        CVehicle[] result = new CVehicle[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].getPrice()==temp2[j]) result[j]=arr[i];
            }
        }
        return result;  
    }
    public CVehicle[] getResult(CVehicle[] temp){
        int k = 0;
        int j = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i]!=null) k++;
        }
        CVehicle[] result = new CVehicle[k];
        for (int i = 0; i < temp.length; i++) {
                if (temp[i]!=null){
                    result[j]=temp[i];
                    j++;
                }
            }
        return result;
    }
    public CVehicle[] yearFiveCarArray(CVehicle [] arr) {
        CVehicle temp[] = new CCar[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (((2018-arr[i].getYear())<=5) && (arr[i] instanceof CCar))
                temp[i]=arr[i];
        }
        CVehicle[] res = getResult(temp);
        return res;
    }
    public CVehicle yearSpeedPrice (CVehicle[] arr) {
        CVehicle temp[] = new CVehicle[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].getYear()<=2005) && (arr[i].getYear()>=2000) 
                    && (arr[i].getSpeed()>=50))
                temp[i]=arr[i];
        }
        int k=0;
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (temp[i]!=null)
                k++;
        }
        CVehicle[] res = new CVehicle[k];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i]!=null){
                res[j]=temp[i];
                j++;
            }
        }
        return lowPrice(res);
    }
    public CVehicle[] speedShipArray(CVehicle[] arr){
       CVehicle temp[] = new CVehicle[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof CShip)
                temp[i]=arr[i];
        }
        CVehicle[] result=getResult(temp);
        return result;
    }
    public CVehicle[] iFlyArray(CVehicle[] arr) {
        CVehicle temp[] = new CVehicle[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (Arrays.asList(arr[i].getClass().getInterfaces()).indexOf(IFly.class)
                !=-1){
                temp[i]=arr[i];
            }
        }
        CVehicle[] result=getResult(temp);
        return result;
    }
    public CVehicle[] iSwimArray(CVehicle[] arr) {
        CVehicle temp[] = new CVehicle[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (Arrays.asList(arr[i].getClass().getInterfaces()).indexOf(ISwim.class)
                !=-1){
                temp[i]=arr[i];
            }
        }
        CVehicle[] result=getResult(temp);
        return result;
    }
    public CVehicle[] iMoveArray(CVehicle[] arr) {
        CVehicle temp[] = new CVehicle[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (Arrays.asList(arr[i].getClass().getInterfaces()).indexOf(IMove.class)
                !=-1){
                temp[i]=arr[i];
            }
        }
        CVehicle[] result=getResult(temp);
        return result;
    }
    public CVehicle iMoveMax(CVehicle[] arr){
        return highPrice(iMoveArray(arr));
    }
    public CVehicle iMoveMin(CVehicle[] arr){
        return lowPrice(iMoveArray(arr));
    }
    public CVehicle iSwimMax(CVehicle[] arr){
        return highPrice(iSwimArray(arr));
    }
    public CVehicle iSwimMin(CVehicle[] arr){
        return lowPrice(iSwimArray(arr));
    }
    public CVehicle iFlyMax(CVehicle[] arr){
        return highPrice(iFlyArray(arr));
    }
    public CVehicle iFlyMin(CVehicle[] arr){
        return lowPrice(iFlyArray(arr));
    }
}