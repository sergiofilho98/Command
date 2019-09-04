import java.util.Queue;
import java.util.Stack;

public class FachadaEscalonador {
	
	private Queue<String> listaProcesso;
	private int tick;
	private int gato;
	
	private String rodando;
	private Stack pilhaComandos = new Stack();
	
	public void executar(Comando c) {
			c.setFachada(this);
		    c.executar();
		    pilhaComandos.add(c);
	}

	public Queue<String> getListaProcesso() {
		return listaProcesso;
	}

	public int getGato() {
		return gato;
	}
	public void setGato(int gato) {
		this.gato = gato;
	}

	public int getTick() {
		return tick;
	}

	public String getRodando() {
		return rodando;
	}

}
