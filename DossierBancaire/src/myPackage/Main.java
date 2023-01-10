package myPackage;

public class Main {
    public static void main(String[] args) 
    {
        Dossier obj=new Dossier();
        GUI g = new GUI(obj);
        System.out.println("Solde: " + obj.getSolde());             
    }

}
