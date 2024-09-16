public class B_Dialoog {

    public static void main(String[] args) {
        // In deze dialoog praten Bert en Ernie met elkaar.
        // Maak methode bertSays die "Bert says: " + de string print en een methode ernieSays die de string " says Ernie" print.
        // De methode heeft als parameter de tekst die gesproken moet worden.
        // De volgende zin wordt steeds door de ander gesproken.
        // Vervang System.out.println() steeds door je eigen method.
        bertSays("Hey"); //Bert
        ernieSays("Hey"); //Ernie
        bertSays("Welcome to this wonderful conversation");
        ernieSays("Thnx, I'm looking forward to it");
        ernieSays("How about this weather?");
        bertSays("I really don't mind the cold....");
        ernieSays("And did you see that random program on that random channel?");
        bertSays("Well... I did watch a random program on a random channel...");
        ernieSays("Thank you for a wonderful conversation!");
        bertSays("Cya");
    }

  private static void bertSays(String text){
        System.out.println("Bert says: " + text);
  }

  private static void ernieSays(String text){
      System.out.println("Ernie says: " + text);
  }
}
