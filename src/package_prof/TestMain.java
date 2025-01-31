package package_prof;

public class TestMain{
	public static void main(String[] args) {
	    // Test constructor and toString()
	    Personne p1 = new Personne("Laurence", "Ago");
	    Personne p2 = new Personne("Lolo");
	    System.out.println(p1.toString());  // toString();
	    System.out.println(p2.toString());
	    
	    // Test Setters and Getters
	    System.out.println(p1);
	    System.out.println(p2);// toString();
	    System.out.println("last name is: " + p1.getNom());
	    System.out.println("firstname is: " + p1.getPrenom());
	    
	    System.out.println("firstname is: " + p2.getPrenom());
		}
}