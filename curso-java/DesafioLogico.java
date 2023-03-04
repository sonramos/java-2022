public class DesafioLogico {
    public static void main(String[] args) {
        // Trabalho na Terça (V ou F)
        // Trabalho na Quinta (V ou F)
        // Se Terça e Quinta, TV50
        // Se Terça ou Quinta, TV32
        // Se TV50 ou TV32, toma sorvete
        // Se !tomasorvete, !ficasaudavel

        boolean trabalhoTerca = false;
        boolean trabalhoQuinta = false;

        boolean comprouTV50 = trabalhoTerca && trabalhoQuinta;
        boolean comprouTV30 = trabalhoTerca ^ trabalhoQuinta;
        boolean comprouSorvete = trabalhoTerca || trabalhoQuinta;
        boolean familiaSaudavel = !comprouSorvete;

        System.out.println("Comprou TV50\"? "+comprouTV50);
        System.out.println("Comprou TV30\"? "+comprouTV30);
        System.out.println("Comprou Sorvete? "+comprouSorvete);
        System.out.println("Familia Saudavel? "+familiaSaudavel);

        }

    }
