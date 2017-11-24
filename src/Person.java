


public class Person implements Comparable<Person> {
	
	String förnamn;
	String efternamn;
	
	public Person(String fulltnamn){
		
	}
	
	public String getFörnamn() {
		return förnamn;
	}

	public void setFörnamn(String förnamn) {
		this.förnamn = förnamn;
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
			return förnamn.compareTo(o.förnamn);
		}
		return (efternamn.compareTo(o.efternamn));
	}


}

