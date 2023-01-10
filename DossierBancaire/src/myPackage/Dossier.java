package myPackage;

public class Dossier {
	
	public Compte compteCourant;
	public Compte compteEpargne;
	
    public Dossier()
    {
    	compteCourant = new Compte();
    	compteEpargne = new Compte();
    }

    public void crediter(double value) {
    	compteCourant.solde += (0.4 * value);
    	compteEpargne.solde += (0.6 * value);
    }
    public double getSolde() {
    	return (compteCourant.solde + compteEpargne.solde);
    }
    public void remunerer() {
    	compteEpargne.solde += (0.032 * compteEpargne.solde);
    }
}
