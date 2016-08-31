package lp2_2;

import java.util.HashSet;

public class PratoPersonalizado {
	
	private double precoBase;
	private HashSet<Personalizacao> listaPersonalizacao;


	public PratoPersonalizado(double precoBase, HashSet<Personalizacao> personalizacao ) throws Exception{
		if(precoBase < 0){
			throw new Exception("Insira um preco maior que zero");
		}
		else{
			this.precoBase = precoBase;
		}
		if(personalizacao.equals("Estampa") || personalizacao.equals("Foto") || personalizacao.equals("Pintura")){
			this.listaPersonalizacao = new HashSet<>();
		}
		else{
			throw new Exception("Só pode ser Estampa, Foto ou Pintura");
		}
		
		
	}


	public double getPrecoBase() {
		return precoBase;
	}


	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}


	public HashSet<Personalizacao> getPersonalizacao() {
		return listaPersonalizacao;
	}


	public void setPersonalizacao(HashSet<Personalizacao> personalizacao) {
		this.listaPersonalizacao = personalizacao;
	}

	public boolean addPersonalizacao(Personalizacao personalizacao){
		return this.listaPersonalizacao.add(personalizacao);
		
	}

	public String toString(){
		return "Prato com "+ this.getPersonalizacao() + "custa R$ " + this.getPrecoBase() +"." ;
		
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listaPersonalizacao == null) ? 0 : listaPersonalizacao.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof PratoPersonalizado))
			return false;
		PratoPersonalizado other = (PratoPersonalizado) obj;
		if (listaPersonalizacao == null) {
			if (other.listaPersonalizacao != null)
				return false;
		} else if (!listaPersonalizacao.equals(other.listaPersonalizacao))
			return false;
		return true;
	}
	
	
	
	
	
	

	 	





}


