package udc.edu.psw.dataHora;

import udc.edu.psw.dataHora.Data;
import udc.edu.psw.dataHora.Hora;

public class DataHora {
	private Data data;
	private Hora hora;
	
	public DataHora() {
		data = new Data();
		hora = new Hora();
		
	}
	public String toString() {
		return String.format("%s - %s", data, hora); //retorna data e hora separada por ifem, retorna como string
	}
}


//composta