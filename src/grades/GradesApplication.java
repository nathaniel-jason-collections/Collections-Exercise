package grades;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import util.Input;

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


        students.put("HotCajun7", crayfishCarl);
        students.put("LuckyBucky", buckyScarface);
        students.put("FallenAngel-Starfish", terribleTim);
        students.put("Meh6", timWhoIsOK);


//call the method that forces the user to choose a terrible GitHub user
        chooseGit(students);


    }

    //Jason wuz here

    //method takes in hashMap as only parameter so that you can display list of github user names, so user can choose one;
    public static void chooseGit(HashMap<String, Student> students){

        //import scanner for listening for user response
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey, I've got this list of usernames for you to choose from:\n" + students.keySet() + "\n or to view info for all students type 'all'");
        System.out.println("Any of these float your boat? (You have to pick one, case-sensitive: sorry.)");
        String response = scanner.nextLine();

        switch (response){
            case "HotCajun7":
                displayInfo(students, response);
                break;
            case "LuckyBucky":
                displayInfo(students, response);
                break;
            case "FallenAngel-Starfish":
                displayInfo(students, response);
                break;
            case "Meh6":
                displayInfo(students, response);
                break;
            case "all":
                seeAll(students);
                break;
            default:
                System.out.println("sorry, no student found with that username\nWould you like to see the options again? y/n");
                String yVn = scanner.nextLine();
                if(yVn.equalsIgnoreCase("y")) {
                    chooseGit(students);
                    break;
                } else{
                    System.out.println("goodbye");
                    break;
                }

        }
    }
    public static void displayInfo(HashMap<String, Student> students,String response){

        //students = hashmap; .get(response) = get the key (gitHub user name) and open the treasure box; .getName = pull the name info we want from the box
        System.out.println("Name: " + students.get(response).getName() + " - Github Username: " + response + "\nlist of grades thus far:\n" + students.get(response).getGrades() +"\nCurrent Average: " + students.get(response).getGradeAverage());
        System.out.println("Would you like to see another student? y/n");

        Scanner scanner = new Scanner(System.in);
        String yVn = scanner.nextLine();
        if(yVn.equalsIgnoreCase("y")) {
            chooseGit(students);
        } else{
            System.out.println("goodbye");
        }
    }
    public static void seeAll(HashMap<String, Student> students){
        Input input = new Input();
        int choice = input.getInt("What would you like to do?\n1. view all grades for all students\n2. overall class average\n3. display student info and average");
        if (choice == 1){
            for (String student: students.keySet()) {
                System.out.println(student + " grades: \n" + students.get(student).getGrades());
            }
        }
        else if (choice ==2){
            int sum = 0;
            for (String student: students.keySet()) {
                sum += students.get(student).gradeSum();
            }
            System.out.println("overall class average: " + sum/(students.size() * 4));
        }
        else if (choice == 3) {
            for (String student: students.keySet()) {
                System.out.println(students.get(student).getName() + ", " + student + ", " + students.get(student).getGradeAverage());
            }
        } else {
            System.out.println("that was not a valid entry");
            seeAll(students);
        }
        if (input.yesNo("would you like to continue displaying class info?")) {
            seeAll(students);
        }
        System.out.println("goodbye");
    }
}
