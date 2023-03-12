public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService ();
       long bonus = service.calculate (15_000, false);
       System.out.println(bonus);
    }
}
