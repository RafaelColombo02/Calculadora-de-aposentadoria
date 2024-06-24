import javax.swing.JOptionPane;

public class CalculadoraAposentadoria {
    public static void main(String[] args) {
        // Receber idade, sexo e anos de contribuição usando JOptionPane
        String idadeInput = JOptionPane.showInputDialog(null, "Digite sua idade:");
        int idade = Integer.parseInt(idadeInput);

        String sexoInput = JOptionPane.showInputDialog(null, "Digite seu sexo (M para masculino, F para feminino):");
        char sexo = sexoInput.toUpperCase().charAt(0);

        String anosContribuicaoInput = JOptionPane.showInputDialog(null, "Digite seus anos de contribuição:");
        int anosContribuicao = Integer.parseInt(anosContribuicaoInput);

        // Verificar se a pessoa pode se aposentar e calcular os anos que faltam para aposentadoria
        String mensagem;
        if (sexo == 'M') { // Aposentadoria por idade para homens
            if (idade >= 65) {
                mensagem = "Você pode se aposentar por idade.";
            } else {
                int anosFaltantes = 65 - idade;
                mensagem = "Faltam " + anosFaltantes + " anos para você se aposentar por idade.";
            }
        } else if (sexo == 'F') { // Aposentadoria por idade para mulheres
            if (idade >= 62) {
                mensagem = "Você pode se aposentar por idade.";
            } else {
                int anosFaltantes = 62 - idade;
                mensagem = "Faltam " + anosFaltantes + " anos para você se aposentar por idade.";
            }
        } else { // Aposentadoria por tempo de contribuição para ambos os sexos
            if (anosContribuicao >= 35) {
                mensagem = "Você pode se aposentar por tempo de contribuição.";
            } else {
                int anosFaltantes = 35 - anosContribuicao;
                mensagem = "Faltam " + anosFaltantes + " anos para você se aposentar por tempo de contribuição.";
            }
        }

        // Exibir o resultado usando JOptionPane
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
