import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Main {

    /**
     * input file name from which to read data
     */
    public static String INPUT_FILENAME = "dictionary.txt";

    /**
     * true for different results every run; false for predictable results
     */
    public static final boolean RANDOM = false;

    /**
     * If not random, use this value to guide the sequence of numbers that will
     * be generated by the Random object.
     */
    public static final int SEED = 42;

    public static void main(String[] args) throws FileNotFoundException {
        System.out.print("Welcome to Word Ladder." + "\n" + "Please give me two English words, and I will change the" + "\n" + "first into the second by changing one letter at a time." + "\n");
        System.out.println("Dictionary file name? ");
       /*
       //Scanner input = new Scanner(System.in);
       Scanner input = new Scanner(System.in);
       File inputFile = new File(input.nextLine());

       if (!inputFile.canRead()) {
           System.out.println("Required input file not found; exiting.\n" + inputFile.getAbsolutePath());
           System.exit(1);
       }*/
        File inputFile = new File(INPUT_FILENAME);
        if (!inputFile.canRead()) {
            System.out.println("Required input file not found; exiting.\n" + inputFile.getAbsolutePath());
            System.exit(1);
        }
        Scanner input = new Scanner(inputFile);

        String alpha = ("abcdefghijklmnopqrstuvwxyz");


        HashSet<String> dictionary = new HashSet<String>();

        while (input.hasNextLine()) {
            String name = input.next().trim().intern();
            if (name.length() > 0) {
                dictionary.add(name);
            }
        }

        System.out.println("Word #1 (or Enter to quit): ");
        Scanner console = new Scanner(System.in);
        String word1 = console.nextLine().trim();
        while(!(dictionary.contains(word1)))
        {
            if(word1.length()<1)
            {
                System.out.println("Have a good day. \n");
                System.exit(0);
            }
            System.out.println("Required word not found; exiting.\n");
            System.out.println("Word #1 (or Enter to quit): ");
            word1 = console.nextLine().trim();
        }


        System.out.println("Word #2 (or Enter to quit): ");
        console = new Scanner(System.in);
        String word2 = console.nextLine().trim();
        while(!(dictionary.contains(word2)))
        {
            if(word2.length()<1)
            {
                System.out.println("Have a good day. \n");
                System.exit(0);
            }
            System.out.println("Required word not found; exiting.\n");
            System.out.println("Word #2 (or Enter to quit): ");
            word2 = console.nextLine().trim();
        }
        System.out.println("A ladder from " + word2 + " back to " + word1 + ":");
        Sarafini sini = new Sarafini(word2, word1, alpha, dictionary);
        System.out.println(sini.buildLadder());

       /*
       // read names into a Set to eliminate duplicates
       //File inputFile = new File(INPUT_FILENAME);


       Set<String> names = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
       while (input.hasNextLine()) {
           String name = input.nextLine().trim().intern();
           if (name.length() > 0) {
               names.add(name);
           }
       }

       // transfer to an ArrayList, shuffle and build an AssassinManager
       ArrayList<String> nameList = new ArrayList<>(names);
       Random rand = (RANDOM) ? new Random() : new Random(SEED);
       Collections.shuffle(nameList, rand);
*/






/*
       // prompt the user for victims until the game is over
       Scanner console = new Scanner(System.in);
       while (!sarafini.isGameOver()) {
           sarafini(console, manager);
       }

       // report who won
      /*System.out.println("Game was won by " + manager.winner());
       System.out.println("Final graveyard is as follows:");
       System.out.println(manager.graveyard());
   }

   /**
    * Handles the details of recording one victim. Shows the current kill ring
    * and graveyard to the user, prompts for a name and records the kill if the
    * name is legal.

   public static void oneKill(Scanner console, AssassinManager manager) {
       // print both linked lists
       System.out.println("Current kill ring:");
       System.out.println(manager.killRing());
       System.out.println("Current graveyard:");
       System.out.println(manager.graveyard());

       // prompt for next victim to kill
       System.out.println();
       System.out.print("next victim? ");
       String name = console.nextLine().trim();

       // kill the victim, if possible
       if (manager.graveyardContains(name)) {
           System.out.println(name + " is already dead.");
       } else if (!manager.killRingContains(name)) {
           System.out.println("Unknown person.");
       } else {
           manager.kill(name);
       }
       System.out.println();
   }

       */
    }
}

