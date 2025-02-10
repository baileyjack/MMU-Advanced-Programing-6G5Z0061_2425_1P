import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        double age;
//        String name;
//        boolean partner;
//        boolean disabled;
//        boolean southeast;
//        boolean veteran;
//        boolean famandfriends;
//        Scanner scanner = new Scanner(System.in);
//        List<Railcards> railcards = new ArrayList<>();
//
//        System.out.println("Please enter your age: ");
//        age = scanner.nextDouble();
//
//        System.out.println("Please enter your name: ");
//        name = scanner.next();
//
//        System.out.println("Do you have a travel partner? true/false: ");
//        partner = Boolean.parseBoolean(scanner.next());
//
//        System.out.println("Are you disabled? true/false: ");
//        disabled = Boolean.parseBoolean(scanner.next());
//
//        System.out.println("Do you travel in the South East? true/false: ");
//        southeast = Boolean.parseBoolean(scanner.next());
//
//        System.out.println("Are you a veteran? true/false: ");
//        veteran = Boolean.parseBoolean(scanner.next());
//
//        System.out.println("Do you plan to travel with up to 4 adults / children at one time? true/false: ");
//        famandfriends = Boolean.parseBoolean(scanner.next());
//
//        // Calculate Railcard Eligibility:
//
//        // Non-Age Restricted
//        if (partner == true) {
//            railcards.add(Railcards.TWO_TOGETHER);
//        }
//        if (disabled == true) {
//            railcards.add(Railcards.DISABLED);
//        }
//        if (southeast == true) {
//            railcards.add(Railcards.NETWORK);
//        }
//        if (veteran == true) {
//            railcards.add(Railcards.VETERANS);
//        }
//        if (famandfriends == true) {
//            railcards.add(Railcards.FAMILY_AND_FRIENDS);
//        }
//
//        // Age Restricted
//        if (age >= 16 && age < 18) {
//            railcards.add(Railcards.SIXTEEN_TO_SEVENTEEN);
//        }
//        if (age >= 16 && age <= 25) {
//            railcards.add(Railcards.SIXTEEN_TO_TWENTYFIVE);
//        } else if (age >= 26 && age < 32) {
//            railcards.add(Railcards.TWENTYSIX_TO_THIRTY);
//        } else if (age >= 60) {
//            railcards.add(Railcards.SENIOR);
//        }
//
//        System.out.println("Hey " + name + " , Looks like you're eligible for the following Railcards: " + railcards);



        ModuleMark student1 = new ModuleMark(12, 12);
        ModuleMark student2 = new ModuleMark(89, 28);
        ModuleMark student3 = new ModuleMark(90, 99);
        ModuleMark student4 = new ModuleMark(100, 48);

        System.out.println(student1.getMocks());
        System.out.println(student2.getMocks());
        System.out.println(student3.getMocks());
        System.out.println(student4.getMocks());




        ModuleMark mod1s1 = new ModuleMark(12, 12);
        ModuleMark mod1s2 = new ModuleMark(89, 28);
        ModuleMark mod1s3 = new ModuleMark(90, 99);
        ModuleMark mod1s4 = new ModuleMark(100, 48);

        ModuleMark mod2s1 = new ModuleMark(100, 48);
        ModuleMark mod2s2 = new ModuleMark(01, 45);
        ModuleMark mod2s3 = new ModuleMark(24, 12);
        ModuleMark mod2s4 = new ModuleMark(92, 80);

        Student s1 = new Student("Dave");
        Student s2 = new Student("John");

        List<ModuleMark> s1marks = new ArrayList<>();
        List<ModuleMark> s2marks = new ArrayList<>();

        s1marks.add(mod1s1);
        s1marks.add(mod1s2);
        s1marks.add(mod1s3);
        s1marks.add(mod1s4);
        s2marks.add(mod2s1);
        s2marks.add(mod2s2);
        s1marks.add(mod2s3);
        s2marks.add(mod2s4);

        s1.moduleMarks(s1marks);
        s2.moduleMarks(s2marks);

        System.out.println(s1.calculateOverallScore());
        System.out.println(s2.calculateOverallScore());
        }
    }