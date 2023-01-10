package myPackage;

public class CompteCourantSeulement extends Dossier{
	@Override
	public void crediter(double value) {
    	compteCourant.solde += value;
    }
	
	@Override
    public double getSolde() {
    	return compteCourant.solde;
    }
	
	@Override
    public void remunerer() {}
}
