


public class Person implements Comparable<Person> {
	
	String f�rnamn;
	String efternamn;
	
	public Person(String fulltnamn){
		
	}
	
	public String getF�rnamn() {
		return f�rnamn;
	}

	public void setF�rnamn(String f�rnamn) {
		this.f�rnamn = f�rnamn;
	}

	public String getEfternamn() {
		return efternamn;
	}

	public void setEfternamn(String efternamn) {
		this.efternamn = efternamn;
	}

	@Override
	public int compareTo(Person o) {
		if(efternamn.compareTo(o.efternamn) == 0) {
			return f�rnamn.compareTo(o.f�rnamn);
		}
		return (efternamn.compareTo(o.efternamn));
	}


}

