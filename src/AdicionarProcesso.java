
public class AdicionarProcesso implements Comando{

	private String nomeProcesso;
	private FachadaEscalonador fachada;
	public AdicionarProcesso(String nomeProcesso) {
		this.nomeProcesso = nomeProcesso;
		
	}
	@Override
	public void executar() {
		
		if(this.fachada.getListaProcesso().contains(nomeProcesso) || this.fachada.getRodando() == nomeProcesso) {
			throw new EscalonadorException();
		}else {
			this.fachada.getListaProcesso().add(nomeProcesso);
			if(this.fachada.getTick() != 0) {
				this.fachada.setGato(this.fachada.getTick() + 1);
			}
		}
	}
	@Override
	public void setFachada(FachadaEscalonador f) {
		this.fachada = f;
	}
}
