import java.util.ArrayList;
import java.util.List;


public class Main {

    // https://stackoverflow.com/questions/11638123/how-to-add-an-element-to-array-and-shift-indexes
    public static List<Slogan> slogans = new ArrayList<Slogan>();


    public static int getCount(){
        return slogans.size();
    }

    public static void loopThrough(){
        // HAHAHAHHAHAHA
        for (int i = 0; i < slogans.size(); i++) {
            System.out.println(i + ": " + slogans.get(i).toString());
        }
    }


    public static void main(String[] args) {
        Slogan a = new Slogan("O'Riley");
        Slogan b = new Slogan("I don't know any slogans.");
        Slogan c = new Slogan("Sigh.");
        Slogan d = new Slogan("All this takes time to describe but it actually happened within a sigh.");

        slogans.add(a);
        slogans.add(b);
        slogans.add(c);
        slogans.add(d);

        loopThrough();
        System.out.println("This is the size of the thing... " + getCount());
    }
}