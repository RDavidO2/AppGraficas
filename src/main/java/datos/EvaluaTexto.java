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

    }

    /**
     * Metodo que inicializa los elementos de la ventana principal, asi como el analizador
     */
    public boolean init() {
        boolean correcto = false;
        reader = new StringReader(textIn);
        System.out.println("reader"+ textIn);
        lexico = new Lexico(reader);
        sintactico = new Sintactico(lexico);

        try {
            sintactico.parse();
            correcto = true;
            System.out.println("Analisis completado correctamente");
        } catch (Exception e) {
            //Aqui se maneja el error

            System.out.println("Encontre un error OMEGA");
        }

        System.out.println("Regreasre un falso");
        return correcto;

    }


}
