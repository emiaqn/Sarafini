import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Sarafini {

    String w1;
    String w2;
    Queue<Stack> seeni = new LinkedList<Stack>();
    String alpha;
    List<String> dict;



    public Sarafini(String word1, String word2, String a, List<String> d){
        w1 = word1;
        w2 = word2;
        alpha = a;
        dict = d;
    }

    public String ladder() {

        boolean sus = false;
        String answa = "";

        seeni.offer(new Stack<String>());
        seeni.peek().push(w1);

        while (!seeni.isEmpty()) {
            Stack tempStack = seeni.poll();
            String tempWord = (String) tempStack.pop();

            for (int j = 0; j < tempWord.length(); j++) {
                {
                    for (int i = 0; i < alpha.length(); i++) {
                        String temp = tempWord.substring(0, j) + alpha.substring(i, i+1) + tempWord.substring(j+1);
                        System.out.println(temp);
                        if(dict.contains(temp))
                        {
                            System.out.println("chicken");
                            for(Stack<String> s : seeni)
                            {
                                for(String teeni : s)
                                {
                                    if(teeni.equals(temp))
                                    {
                                        sus = true;

                                    }
                                }
                            }

                            if(sus == false) {

                                if (temp.equals(w2)) {
                                    for (Object lol : seeni.peek()) {
                                        answa += lol + " ";
                                    }
                                    return answa;
                                }
                                else{
                                    Stack<String> teepi = tempStack;
                                    //for(String s:teepi)
                                    //System.out.println(s);
                                    teepi.push(temp);
                                    seeni.offer(teepi);
                                }
                            }

                        }
                    }

                }
            }

        }
        return "chicken";


    }
}
