class Person{
	String name;
 private int age;
 public boolean setAge(int newAge){
	if (newAge>=5 && newAge<=20){
	age=newAge;
	return true;
	}
	else
	return false;
}
 public int getAge(){
	return age;
}
}

public class App{
 public static void main(String args[]){
	Person s1=new Person();
	s1.name="����";
	if(s1.setAge(25))
	System.out.println("����"+s1.name+"����"+s1.getAge()+"��");
	else
	System.out.println("�������");
}
}