class Employee{
 private String name;
 private int age;
 private double salary;

 public Employee(String newName,int newAge,double newSalary){
	this(newAge,newSalary);
	System.out.println("���������Ĺ��췽��������");
	name=newName;
}
 public Employee(int newAge,double newSalary){
	this(newSalary);
	System.out.println("���������Ĺ��췽��������");
	age=newAge;
}
public Employee(double newSalary){
	this();
	System.out.println("һ�������Ĺ��췽��������");
	salary=newSalary;
}
public Employee(){
	System.out.println("û�в����Ĺ��췽��������");
}
void setAge(int newAge){
	int age=0;
	this.age=newAge;
}
int getAge(){
	return age;
}

public static void main(String[] args){
	Employee s1=new Employee("����",30,8000);
	s1.setAge(31);
	System.out.println("������"+s1.getAge());
}
}