import java.util.List;

public class Student {

    String name;
    List<ModuleMark> marks;

    public Student(String name) {
        this.name = name;
    }

    public void moduleMarks(List<ModuleMark> marks) {
        this.marks = marks;
    }

    public int calculateOverallScore() {
        int overallScore = 0;
        for (int i = 0; i < marks.size(); i++) {
            overallScore =+ marks.get(i).calculateUnitGrade();
        }
        return (overallScore / marks.size());
    }
}
