


public class Person implements Comparable<Person> {
	
	String förnamn;
	String efternamn;
	
	public Person(String fulltnamn){
		int idx = fulltnamn.lastIndexOf(' ');
		this.efternamn = fulltnamn.substring(0, idx);
		this.förnamn  = fulltnamn.substring(idx + 1);
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

