package net.editorial.publications;

import java.time.LocalDate;

public class Publication {

    public String title;
    protected int pageNumber;
    protected String isbn;
    protected double distributionPrice;
    protected double publicSellPrice;
    protected String year;

    public Publication(String title, int pageNumber, String isbn, double distributionPrice, double publicSellPrice, String year) {
        this.title = title;
        this.pageNumber = pageNumber;
        this.isbn = isbn;
        this.distributionPrice = distributionPrice;
        this.publicSellPrice = publicSellPrice;
        this.year = year;
    }

    public double getPublicSellPrice() {
        return publicSellPrice;
    }


}
