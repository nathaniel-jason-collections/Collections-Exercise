package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    //constructor

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    //methods

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        int sum = 0;
        for (int i=0; i<grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum/grades.size();
    }

    public static void main(String[] args) {
        Student nathaniel = new Student("Nathnaiel Dowell", new ArrayList<>());
        nathaniel.addGrade(84);
        nathaniel.addGrade(97);
        nathaniel.addGrade(100);
        nathaniel.addGrade(97);
        System.out.println("nathaniel.getGradeAverage() = " + nathaniel.getGradeAverage());
    }
}
