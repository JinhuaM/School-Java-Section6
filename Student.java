class Student{
	String name;
	int age;
 public Student(){
	System.out.println("Student()���췽��������");
}
 public Student(String newName){
	name=newName;
	System.out.println("Student(String newName)���췽��������");
}
 public Student(String newName,int newAge){
	name=newName;
	age=newAge;
	System.out.println("Student(String newName,int newAge)���췽��������");
}
 public static void main(String[] agrs){
	Student s1=new Student();
	Student s2=new Student("����");
	Student s3=new Student("����",15);
}
}