import net.editorial.publications.magazines.Magazine;
import net.editorial.publications.textBooks.TextBook;
import net.editorial.publications.novel.Novel;
import net.editorial.taxes.TypeOfTaxes;

import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int option = -1;
        final Scanner keyboard = new Scanner(System.in);
        final Magazine[] magazines = new Magazine[100];
        int countMagazines = 0;
        final Novel[] novels = new Novel[100];
        int countNovels = 0;
        final TextBook[] textBooks = new TextBook[100];
        int countTextbooks = 0;

        while (option != 6) {
            System.out.println("Write down the number according to the next summary: ");
            System.out.println("1. Add a new magazine");
            System.out.println("2. Add a new textbook");
            System.out.println("3. Add a new novel");
            System.out.println("4. Show all publications");
            System.out.println("5. Select a publication and calculate its price on Canary Islands and mainland Spain");
            option = keyboard.nextInt();
            switch (option) {
                case 1:
                    addMagazine(magazines, countMagazines);
                    countMagazines++;
                    break;
                case 2:
                    addTextBook(textBooks, countTextbooks);
                    countTextbooks++;
                    break;
                case 3:
                    addNovel(novels, countNovels);
                    countNovels++;
                    break;
                case 4:
                    showPublications(magazines, novels, textBooks);
                    break;
                case 5:
                    calcPrice(magazines, novels, textBooks);
                    break;
                case 6:
                    System.out.println("Chao");
                    break;
                default:
                    System.out.println("Select an option");
            }
        }
    }
    public static void addMagazine(Magazine[] magazines, int count){
        int i = 0;
        System.out.println("Tell me the name of the Magazine: ");
        String title = keyboard.nextLine();
        System.out.println("¿How many pages does it have?: ");
        int pageNumber = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Write down the ISBN please: ");
        String isbn = keyboard.nextLine();
        System.out.println("Write down the distribution price of the Magazine: ");
        double distributionPrice = keyboard.nextDouble();
        System.out.println("Write down the public sell price of the Magazine: ");
        double publicSellPrice = keyboard.nextDouble();
        System.out.println("Write the year of the magazine (on a DD/MM/YYYY format): ");
        String year = keyboard.nextLine();
        System.out.println("Write down the magazine number: ");
        int magazineNumber = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("How many articles does the Magazine have: ");
        i = keyboard.nextInt();
        keyboard.nextLine();
        String[] articleName = new String[i];
        for (int j = 0; j < i; j++) {
            System.out.println("Write down the article name: ");
            String aName = keyboard.nextLine();
            articleName[j] = aName;
        }
        Magazine magazine = new Magazine(title, pageNumber, isbn, distributionPrice, publicSellPrice, year, magazineNumber, articleName);
        magazines[count] = magazine;
    }
    public static void addNovel(Novel[] novels, int count){
        int i = 0;
        System.out.println("Tell me the name of the Magazine: ");
        String title = keyboard.nextLine();
        System.out.println("¿How many pages does it have?: ");
        int pageNumber = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Write down the ISBN please: ");
        String isbn = keyboard.nextLine();
        System.out.println("Write down the distribution price of the Magazine: ");
        double distributionPrice = keyboard.nextDouble();
        System.out.println("Write down the public sell price of the Magazine: ");
        double publicSellPrice = keyboard.nextDouble();
        System.out.println("Write the year of the magazine (on a DD/MM/YYYY format): ");
        String year = keyboard.nextLine();
        System.out.println("Write down the author: ");
        String author = keyboard.nextLine();
        System.out.println("Whats the subject of the Novel: ");
        System.out.println("1. Thriller");
        System.out.println("2. Historical Novel");
        System.out.println("3. Juvenile Novel");
        i = keyboard.nextInt() - 1;
        keyboard.nextLine();
        String[] subject = {"Thriller", "Historical Novel", "Juvenile Novel"};
        Novel novel = new Novel(title, pageNumber, isbn, distributionPrice, publicSellPrice, year, author, subject[i]);
        novels[count] = novel;
    }
    public static void addTextBook(TextBook[] textBooks, int count){
        int i = 0;
        System.out.println("Tell me the name of the Textbook: ");
        String title = keyboard.nextLine();
        keyboard.nextLine();
        System.out.println("¿How many pages does it have?: ");
        int pageNumber = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Write down the ISBN please: ");
        String isbn = keyboard.nextLine();
        System.out.println("Write down the distribution price of the Magazine: ");
        double distributionPrice = keyboard.nextDouble();
        System.out.println("Write down the public sell price of the Magazine: ");
        double publicSellPrice = keyboard.nextDouble();
        System.out.println("Write the year of the magazine (on a DD/MM/YYYY format): ");
        String year = keyboard.nextLine();
        keyboard.nextLine();
        System.out.println("Write down the subject: ");
        String subject = keyboard.nextLine();
        System.out.println("How many themes: ");
        i = keyboard.nextInt();
        keyboard.nextLine();
        String[] theme = new String[i];
        for (int j = 0; j < i; j++) {
            System.out.println("Write down the theme name: ");
            String aName = keyboard.nextLine();
            theme[j] = aName;
        }
        TextBook textBook = new TextBook(title, pageNumber, isbn, distributionPrice, publicSellPrice, year, subject, theme);
        textBooks[count] = textBook;
    }
    public static void showPublications(Magazine[] magazines, Novel[] novels, TextBook[] textBooks){
        System.out.println("What publications do you want to show: ");
        int option = -1;
        while(option != 4){
            System.out.println("1. Magazines");
            System.out.println("2. Novels");
            System.out.println("3. Textbooks");
            System.out.println("4. Return to previous menu");
            option = keyboard.nextInt();
            switch (option){
                case 1:
                    for (int i = 0; i < magazines.length; i++) {
                        if (magazines[i]!= null){
                            System.out.println(magazines[i].toString());
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < novels.length; i++) {
                        if (novels[i]!= null){
                            System.out.println(novels[i].toString());
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < textBooks.length; i++) {
                        if (textBooks[i]!= null){
                            System.out.println(textBooks[i].toString());
                        }
                    }
                    break;
            }
        }
    }
    public static void calcPrice(Magazine[] magazines, Novel[] novels, TextBook[] textBooks){
        int option = -1;
        String checker;
        System.out.println("Is it a Magazine, a Novel or a Textbook?");
        System.out.println("1. Magazine");
        System.out.println("2. Novel");
        System.out.println("3. Textbook");
        option = keyboard.nextInt();
        keyboard.nextLine();
        switch (option){
            case 1:
                String msg= "The magazine you are trying to find doesn't exist, try again.";
                System.out.println("Write down the name of the magazine: ");
                checker = keyboard.nextLine();
                for (int i = 0; i < magazines.length; i++) {
                    if (magazines[i] != null && checker.equals(magazines[i].title)){
                        msg="Taxes on Canary Islands: " + TypeOfTaxes.taxesCalcCan(magazines[i].getPublicSellPrice());
                        msg+="\nTaxes on mainland Spain: " + TypeOfTaxes.taxesCalcEsp(magazines[i].getPublicSellPrice());
                    }
                }
                System.out.println(msg);
                break;
            case 2:
                msg= "The novel you are trying to find doesn't exist, try again.";
                System.out.println("Write down the name of the novel: ");
                checker = keyboard.nextLine();
                for (int i = 0; i < novels.length; i++) {
                    if (novels[i] != null && checker.equals(novels[i].title)){
                        msg="Taxes on Canary Islands: " + TypeOfTaxes.taxesCalcCan(novels[i].getPublicSellPrice());
                        msg+="\nTaxes on mainland Spain: " + TypeOfTaxes.taxesCalcEsp(novels[i].getPublicSellPrice());
                    }
                }
                System.out.println(msg);
                break;
            case 3:
                msg="The textbook you are trying to find doesn't exist, try again.";
                System.out.println("Write down the name of the textbook: ");
                checker = keyboard.nextLine();
                for (int i = 0; i < textBooks.length; i++) {
                    if (textBooks[i] != null && checker.equals(textBooks[i].title)){
                        msg="Taxes on Canary Islands: " + TypeOfTaxes.taxesCalcCan(textBooks[i].getPublicSellPrice());
                        msg+="\nTaxes on mainland Spain: " + TypeOfTaxes.taxesCalcEsp(textBooks[i].getPublicSellPrice());
                    }
                }
                System.out.println(msg);
                break;
            default:
                System.out.println("Select one you moron");
        }

    }
}