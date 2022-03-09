public class Discount {
    public static void main(String[] args) {

        boolean isDiscount;
        boolean isSenior = false;
        boolean isDog = true;
        boolean isStudent = false;

        if (isSenior == true) {
            isDiscount = true;
        }
            else if (isDog == true) {
            isDiscount = true;
        }
            else if (isStudent == true) {
            isDiscount = true;
        }
            else {
            isDiscount = false;
        }

        System.out.println("You receive a discount: " + isDiscount);


    }
}


