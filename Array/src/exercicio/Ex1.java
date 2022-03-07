package exercicio;

public class Ex1 {
	
	
	public String mdf(double nf) {
		if(nf>7) {
			return "Aprovado:"+String.format("%.2f", nf);
		}else {
			return "Reprovado:"+String.format("%.2f", nf);
		}
	}
}
