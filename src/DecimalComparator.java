public class DecimalComparator {

    //Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

    //The method should return boolean and it needs to return true if two double numbers are
    //the same up to three decimal places. Otherwise, return false

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));


        
    }




    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo)
    {

        return (long)(numOne * 1000) == (long)(numTwo * 1000);




    }






}
