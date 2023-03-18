package net.editorial.publications.magazines;

import net.editorial.publications.Publication;
import net.editorial.taxes.TypeOfTaxes;

import java.util.Scanner;

public class Magazine extends Publication {
    private final int magazineNumber;
    private final String[] articleName;

    public Magazine(String title, int pageNumber, String isbn, double distributionPrice, double publicSellPrice, String year, int magazineNumber, String[] articleName) {
        super(title, pageNumber, isbn, distributionPrice, publicSellPrice, year);
        this.magazineNumber = magazineNumber;
        this.articleName = articleName;
    }


@Override
    public String toString(){
        String msg = "____________===" + this.title + "===____________";
        msg+= "\n Magazine Number: " + this.magazineNumber;
        msg+= "\n Article list: ";
            for (int i = 0; i < this.articleName.length; i++) {
                msg+= this.articleName[i] + " || ";
            }
        msg+= "\n Distribution price: " + this.distributionPrice;
        msg+= "\n Price to sell to the public: " + (this.distributionPrice + 4);
        msg+= "\n =========================================================";
        return msg;
}
}
