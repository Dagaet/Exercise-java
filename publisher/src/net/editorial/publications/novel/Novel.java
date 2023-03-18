package net.editorial.publications.novel;

import net.editorial.publications.Publication;
import net.editorial.taxes.TypeOfTaxes;

public class Novel extends Publication {
    private String author;
    private String subject;

    public Novel(String title, int pageNumber, String isbn, double distributionPrice, double publicSellPrice, String year, String author, String subject) {
        super(title, pageNumber, isbn, distributionPrice, publicSellPrice, year);
        this.subject = subject;
        this.author = author;
    }

    @Override
    public String toString(){
        String msg = "____________===" + this.title + "===____________";
        msg+="\n Subject: " + this.subject;
        msg+= "\n Author: " + this.author;
        msg+= "\n Page number: " + this.pageNumber;
        msg+= "\n Distribution price: " + this.distributionPrice;
        msg+= "\n Price to sell to public: " + (this.distributionPrice + 4);
        msg+= "\n =========================================================";
        return msg;
    }
}
