public class ModuleMark {

    int mock1;
    int mock2;

    public ModuleMark(int mock1, int mock2) {
        this.mock1 = mock1;
        this.mock2 = mock2;
    }

    public int calculateUnitGrade() {
        return ((mock1 + mock2) / 2);
    }

    public String calculateUnitClassificaiton() {
        if (calculateUnitGrade() >= 70) {
            return "I";
        } else if (calculateUnitGrade() >= 60) {
            return "II(I)";
        } else if (calculateUnitGrade() >= 50) {
            return "II(II)";
        } else if (calculateUnitGrade() >= 40) {
            return "III";
        } else {
            return "Fail";
        }
    }

    public String getMocks() {
        return calculateUnitGrade() + " // " + calculateUnitClassificaiton();
    }

}
