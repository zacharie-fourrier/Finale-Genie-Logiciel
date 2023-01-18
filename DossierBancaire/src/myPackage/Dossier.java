package myPackage;

//Dossier Bancaire
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
    public void retirer(double val) throws Exception {
		compteCourant.solde -= val;
		if(compteCourant.solde < 0) {
			compteCourant.solde += val;
			throw new Exception("Le compte courant n'est pas suffisament approvisionné");
		}
    }
}
