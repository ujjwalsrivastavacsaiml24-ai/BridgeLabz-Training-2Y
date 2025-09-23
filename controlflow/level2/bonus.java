import java.util.Scanner;
class bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount");
        int amt = sc.nextInt();
        System.out.println("enter the bonus");
        int bonus = sc.nextInt();
        int abonus= (amt / 100)*bonus;
        int tamt = amt + abonus;
        System.out.println("total amount after applying bonus is "+ tamt);
sc.close();
    }
}