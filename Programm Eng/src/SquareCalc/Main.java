package SquareCalc;


import java.util.Scanner;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;


public class Main {

    private static Object MissingFormatArgumentException;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 пары координат точек через пробел");
        try
        {
        double[] coords = new double[6];
            for (int i = 0 ; i<6; i++){
                coords[i]=scanner.nextDouble();
            }
        System.out.println(calculateSquare(calculateLengthsOfSides(coords)));
        }
        catch (Exception e) {
          System.out.println("Неверный ввод"); ;
        }


    }
    public static String calculateSquare(double[] lengths){
        String res;
        double p;
        if (isCorrect(lengths[0],lengths[1],lengths[2])) {

             p = (lengths[0] + lengths[1] + lengths[2]) / 2;
             res = String.format( "%.3f" , Math.sqrt(p * (p - lengths[0]) * (p - lengths[1]) * (p - lengths[2])));
        }
        else
           res = "Такого треугольника не существует";


        return res;
    }
     static boolean isCorrect(double a, double b, double c)
    {
        if (a>0&&b>0&&c>0){
            if (a<(b+c)&&b<(a+c)&&c<(a+b)){
                return true;
            }
        }
        return false;
    }
     static double[] calculateLengthsOfSides(double[] coords){
        double[] res = new double[3];
        res[0]=Math.sqrt(((coords[2]-coords[0])*(coords[2]-coords[0]))+((coords[3]-coords[1])*(coords[3]-coords[1])));
        res[1]=Math.sqrt(((coords[4]-coords[0])*(coords[4]-coords[0]))+((coords[5]-coords[1])*(coords[5]-coords[1])));
        res[2]=Math.sqrt(((coords[4]-coords[2])*(coords[4]-coords[2]))+((coords[5]-coords[3])*(coords[5]-coords[3])));
        return res;
    }

}
