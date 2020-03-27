package EX2;

public class ClasseProduto {
	
	
	//atributos 
	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;
	
	
	
	//métodos construtores
	
	
	public ClasseProduto(){
	this(" ",1.2 , 3.4 , 5.5);
	}
	
	public ClasseProduto(String nome, double precoCusto, double precoVenda, double margemLucro){
		this.nome=nome;
		this.precoCusto=precoCusto;
		this.precoVenda=precoVenda;
		this.margemLucro=margemLucro;
		
	}
	
	
	
	//métodos get e set
	
	public String getnome() {
		return nome;
	}
	
	public void setnome(String nome) {
		this.nome=nome;
	}
	
	
	
	public double getprecoCusto() {
		return precoCusto;
	}
	
	public void setprecoCusto(double precoCusto) {
		this.precoCusto=precoCusto;
	}
	
	
	public double getprecoVenda() {
		return precoVenda;
	}
	
	public void setprecoVenda(double precoVenda) {
		//this.precoVenda=precoVenda;
		
	if(precoVenda<precoCusto) {
		System.out.println("ATENÇÃO: PREÇO DA VENDA É MENOR QUE O PREÇO DA COMPRA!!!");
		
	}else 
		this.precoVenda=precoVenda;
	}
	
	
	public double getmargemLucro() {
		return margemLucro;
	}
	
	public void setmargemLucro(double margemLucro) {
		this.margemLucro=margemLucro;
	}
	
	
	public void calcularMargemLucro() {
		margemLucro=precoVenda/precoCusto*100;
		
	}
	
	public double getcalcularMargemLucro(){
		return margemLucro;
	}
	
	
}
