
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> teachers = new ArrayList<String>();

        teachers.add("Anthony");
        teachers.add("Barto");
        teachers.add("Paul");
        teachers.add("John");
        teachers.add("Martin");
        teachers.add("Matt");
        teachers.toString();


        ArrayList<String> chocolates = new ArrayList<String>();
        chocolates.add("twix");
        chocolates.add("kitkat");
        chocolates.add("snickers");
        chocolates.add("milkyway");
        chocolates.add("hershey");
        chocolates.toString();

chocolates.remove("snickers");

        System.out.println("the number of choclates " + chocolates.size());


        System.out.println("the number of teachers " + teachers.size());

        System.out.println("first teacheron the list " + teachers.get(0));
        System.out.println("third teacher on the list " + teachers.get(2));

        teachers.remove("Barto");

        if (teachers.contains("Barto")) {
            System.out.println("Barto is on the theachers list");

        } else {
            System.out.println("Barto is not on the teachers list");

        }

        for (String teacher:teachers
             ) {
            System.out.println(teachers);
        }
        
        
    }

}

