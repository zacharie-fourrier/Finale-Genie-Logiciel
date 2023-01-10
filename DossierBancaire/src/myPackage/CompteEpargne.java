package myPackage;

public class CompteEpargne extends Compte {

	public void remunerer() {
		solde += (0.032 * solde);
	}
}
