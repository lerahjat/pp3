public class Student {
    String name;
    int age;
    String cardID;
    Boolean isCardValid;
    int semester;
    float averageGrade;

    public void sayHello() {
        System.out.printf("Hello from %s\n", this.name);
    }

    public void displayName() {
        System.out.println(this.name);
    }

    public void displayAge() {
        System.out.println(this.age);
    }

    public void displayBasicMetadata() {
        System.out.printf(
                "Name: %s\nSemester: %d\nAverage grade: %f\n",
                this.name,
                this.semester,
                this.averageGrade);
    }

    public void setValidity(Boolean valid) {
        this.isCardValid = valid;
    }

    public void displayIDStatus() {
        System.out.printf(
                "Name: %s\nCard ID: %s\nCard validity: %s\n",
                this.name,
                this.cardID,
                this.isCardValid ? "VALID" : "INVALID");
    }
}