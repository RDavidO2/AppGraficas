package datos;

import java.io.Reader;
import java.io.StringReader;

import analizador.Lexico;
import analizador.Sintactico;

public class EvaluaTexto {
    String textIn;
    private Lexico lexico;
    private Sintactico sintactico;
    Reader reader;

    public EvaluaTexto(String textIn){
        this.textIn = textIn;
        init();
    }

    /**
     * Metodo que inicializa los elementos de la ventana principal, asi como el analizador
     */
    private void init() {

        reader = new StringReader(textIn);
        System.out.println("reader"+ textIn);
        lexico = new Lexico(reader);
        sintactico = new Sintactico(lexico);

        try {
            sintactico.parse();
        } catch (Exception e) {
            //Aqui se maneja el error
            System.out.println("Encontre un error OMEGA");
        }

    }


}
