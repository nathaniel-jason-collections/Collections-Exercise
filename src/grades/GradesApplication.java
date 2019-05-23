package grades;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student crayfishCarl = new Student("Crayfish Carl", new ArrayList<>());
        crayfishCarl.addGrade(84);
        crayfishCarl.addGrade(54);
        crayfishCarl.addGrade(92);
        crayfishCarl.addGrade(32);

        Student buckyScarface = new Student("Bucky Scarface", new ArrayList<>());
        buckyScarface.addGrade(99);
        buckyScarface.addGrade(89);
        buckyScarface.addGrade(92);
        buckyScarface.addGrade(107);

        Student terribleTim = new Student("Terrible Tim", new ArrayList<>());
        terribleTim.addGrade(5);
        terribleTim.addGrade(16);
        terribleTim.addGrade(27);
        terribleTim.addGrade(0);

        Student timWhoIsOK = new Student("Tim Whois OK", new ArrayList<>());
        timWhoIsOK.addGrade(72);
        timWhoIsOK.addGrade(68);
        timWhoIsOK.addGrade(78);
        timWhoIsOK.addGrade(79);

        Scanner scanner = new Scanner(System.in);

        students.put("HotCajun7", crayfishCarl);
        students.put("LuckyBucky", buckyScarface);
        students.put("FallenAngel-Starfish", terribleTim);
        students.put("Meh6", timWhoIsOK);

        System.out.println("Hey, I've got this list of usernames for you to choose from: " + students.keySet());
        System.out.println("Any of these float your boat? (You have to pick one, sorry.)");
        String response =
    }
}
