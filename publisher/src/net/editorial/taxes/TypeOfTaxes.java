package net.editorial.taxes;

public class TypeOfTaxes {

    public static double taxesCalcCan(double noTaxesPrice){
        return (noTaxesPrice * 0.06) + noTaxesPrice;
    }
    public static double taxesCalcEsp(double noTaxesPrice){
        return (noTaxesPrice * 0.21) + noTaxesPrice;
    }

}
