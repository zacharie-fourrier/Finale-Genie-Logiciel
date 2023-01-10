package myPackage;

public class Dossier {
	
	public Compte compteCourant;
	public CompteEpargne compteEpargne;
	
    public Dossier()
    {
    	compteCourant = new Compte();
    	compteEpargne = new CompteEpargne();
    }

    public void crediter(double val) {
    	compteCourant.solde += (0.4 * val);
    	compteEpargne.solde += (0.6 * val);
    }
    public double getSolde() {
    	return (compteCourant.solde + compteEpargne.solde);
    }
    public void remunerer() {
    	compteEpargne.remunerer();
    }
}
