public class Book {
    String autor = "Jules Verne";
    String title = "Ocolul Pamantului in 80 de zile";
    double price = 50.00;

    public double getPrice(){
        return price;
    }

    public String showAuthorAndTitle(){
        return ("Book " + title + " is written by " + autor);
    }

    public static void showiLoveBooks(){
        System.out.println("I Love Books");
    }
}
