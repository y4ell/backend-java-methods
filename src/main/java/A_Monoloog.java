public class A_Monoloog {

    public static void main(String[] args) {
       greeting();
       smallTalk();
       goodbye();
    }

    // nieuwe methods komen hier

    private static void greeting() {
        System.out.println("Hey");
        System.out.println("Welcome to this wonderful conversation");
    }

    private static void smallTalk() {
        System.out.println("How about this weather?");
        System.out.println("And did you see that random program on that random channel?");
    }

    private static void goodbye() {
        System.out.println("Thank you for a wonderful conversation!");
        System.out.println("Cya");
    }
}
