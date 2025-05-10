class Student{
    String name;
    float marks;

    //constructor
    public Student(String name, float marks){
        this.name = name;
        this.marks = marks;
    }

    //method
    void calculateGrade(){
      char grade;

      switch((int)marks/10){
        case 9: 
        grade = 'A';
        break;

        case 8:
        grade = 'B';
        break;

        case 7:
        grade = 'C';
        break;

        case 6:
        grade = 'D';
        break;

        default :
        grade = 'F';
        break;
      }

      System.out.println(name + " scored " + marks + " and recieved grade: " + grade);
    }
  }
   public class QnoThree {
        public static void main(String[] args) {
            Student s1 = new Student("John", 92);
            Student s2 = new Student("Jane", 74);
            Student s3 = new Student("Tom", 56);
            
            s1.calculateGrade();
            s2.calculateGrade();
            s3.calculateGrade();
}
}