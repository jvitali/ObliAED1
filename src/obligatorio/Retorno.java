package obligatorio;

public class Retorno {

	enum Resultado {
		OK, ERROR, NO_IMPLEMENTADA
	};
	int valorEntero;
	String valorString;
        boolean valorBoolean;
	Resultado resultado;

    public Retorno( Resultado resultado) {
        this.valorEntero = 0;
        this.valorString = "";
        this.valorBoolean = false;
        this.resultado = resultado;
    }

    public int getValorEntero() {
        return valorEntero;
    }

    public void setValorEntero(int valorEntero) {
        this.valorEntero = valorEntero;
    }

    public String getValorString() {
        return valorString;
    }

    public void setValorString(String valorString) {
        this.valorString = valorString;
    }

    public boolean isValorBoolean() {
        return valorBoolean;
    }

    public void setValorBoolean(boolean valorBoolean) {
        this.valorBoolean = valorBoolean;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }



        
        
}
