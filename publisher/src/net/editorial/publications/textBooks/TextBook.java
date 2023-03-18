package net.editorial.publications.textBooks;

import net.editorial.publications.Publication;
import net.editorial.taxes.TypeOfTaxes;

public class TextBook extends Publication {
    private String subject;
    private String[] theme;
    public TextBook(String title, int pageNumber, String ISBN, double distributionPrice, double publicSellPrice, String year, String subject, String[] theme) {
        super(title, pageNumber, ISBN, distributionPrice, publicSellPrice, year);
        this.subject = subject;
        this.theme = theme;
    }

    @Override
    public String toString(){
        String msg = "____________===" + this.title + "===____________";
        msg+= "\n Subject: " + this.subject;
        for (int i = 0; i < this.theme.length; i++) {
            msg+= "\n Theme "+ (i+1) +": " + this.theme[i];
        }
        msg+= "\n Distribution price: " + this.distributionPrice;
        msg+= "\n Price to sell to public: " + (this.distributionPrice + 4);
        msg+= "\n =========================================================";
        return msg;
    }
}
