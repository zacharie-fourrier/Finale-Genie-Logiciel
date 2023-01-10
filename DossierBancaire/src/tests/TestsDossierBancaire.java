package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import myPackage.Compte;
import myPackage.CompteCourantSeulement;
import myPackage.CompteEpargne;
import myPackage.Dossier;

public class TestsDossierBancaire {
	
	@Test 
	public void test1() 
	{
		Dossier dossier=new Dossier();
		assertEquals(0,dossier.getSolde(),0);
	}

	@Test  
	public void test2()
	{
		Dossier dossier=new Dossier();
		dossier.crediter(100);
		assertEquals(100,dossier.getSolde(),0);
	}
	
	@Test  
	public void test3() 
	{
		Dossier dossier=new Dossier();
		dossier.crediter(100);
		dossier.remunerer();
		System.out.println(dossier.getSolde());
		assertEquals(101.92,dossier.getSolde(),0);
	}
	
	@Test 
	public void test4() 
	{
		Dossier dossier=new CompteCourantSeulement();
		assertEquals(0,dossier.getSolde(),0);
	}

	@Test  
	public void test5()
	{
		Dossier dossier=new CompteCourantSeulement();
		dossier.crediter(100);
		assertEquals(100,dossier.getSolde(),0);
	}
	
	@Test  
	public void test6()
	{
		CompteEpargne compte=new CompteEpargne();
		compte.solde = 100;
		compte.remunerer();
		assertEquals(103.2,compte.solde,0);
	}
}
