package OOP.Zadanie2;

public class Student extends Person{
    String typeOfStudy;
    int yearsOfStudy;
    double priceOfStudy;

    public Student(String typeOfStudy, int yearsOfStudy, double priceOfStudy) {
        this.typeOfStudy = typeOfStudy;
        this.yearsOfStudy = yearsOfStudy;
        this.priceOfStudy = priceOfStudy;
    }

    public String getTypeOfStudy() {
        return typeOfStudy;
    }

    public void setTypeOfStudy(String typeOfStudy) {
        this.typeOfStudy = typeOfStudy;
    }

    public int getYearsOfStudy() {
        return yearsOfStudy;
    }

    public void setYearsOfStudy(int yearsOfStudy) {
        this.yearsOfStudy = yearsOfStudy;
    }

    public double getPriceOfStudy() {
        return priceOfStudy;
    }

    public void setPriceOfStudy(double priceOfStudy) {
        this.priceOfStudy = priceOfStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "typeOfStudy='" + typeOfStudy + '\'' +
                ", yearsOfStudy=" + yearsOfStudy +
                ", priceOfStudy=" + priceOfStudy +
                '}';
    }
}
