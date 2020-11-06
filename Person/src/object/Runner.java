package object;
import main.Person;
import java.util.ArrayList;

public class Runner {

	public static void main(String[] args){
		ArrayList<Person> peopleList = new ArrayList<>();
		peopleList.add(new Person("Bob", 25));
		peopleList.add(new Person("Barbara", 34));
		peopleList.add(new Person("John John", 53));
		peopleList.add(new Person("Ben Johnson", 23));
		peopleList.add(new Person("David Johns", 21));
		peopleList.add(new Person("Nijo John", 22));
		peopleList.add(new Person("Jennifer", 46));
		
		for (Person handler: peopleList){
			System.out.println(handler.getName());
			System.out.println(handler.getAge());
		}
		
	}
	
}
