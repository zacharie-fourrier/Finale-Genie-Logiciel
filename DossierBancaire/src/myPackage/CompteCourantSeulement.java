package myPackage;

public class CompteCourantSeulement extends Dossier{
	@Override
	public void crediter(double val) {
    	compteCourant.solde += val;
    }
	
	@Override
    public double getSolde() {
    	return compteCourant.solde;
    }
	
	@Override
    public void remunerer() {}
}
