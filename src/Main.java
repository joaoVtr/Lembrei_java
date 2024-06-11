import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int a = 1;

        int b = 2;

        float c = (float) a/b;
        System.out.println(c);
        System.out.println("teste");
        System.out.println("teste1");
        System.out.println(" ");
        teste();
        System.out.println(" ");
        datas();
        System.out.println(" ");
        lacosNumericos();

        System.out.println(" ");
        vetores();
        System.out.println(" ");
        tratnado_vetores();
    }

    private static void teste() {
        String teste = "aaaaa";
        System.out.println(teste);
    }
    private static void datas(){
        //Local Date
        String nome = "João Vitor";
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR" );
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        String saudacao;
        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour() < 12 ){
            saudacao = "Bom dia";
        }else if (agora.getHour() >=12  && agora.getHour() <= 18 ){
            saudacao = "Boa tarde";
        }else if (agora.getHour() >=18  && agora.getHour() <= 24){
            saudacao = "Boa noite";
        }else {
            saudacao = "Error";
        }
        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toLowerCase());
    }

    public static void lacosNumericos() {
        for (int i = 1; i<=10; i++){
            System.out.println(i);
        }
    }

    public static void vetores(){
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }

    public static void tratnado_vetores(){
        int[] numeros = {1,3,4,1,10};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for (int i = 0; i < numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
            if(numeros[i] < menor ){
                menor = numeros[i];
            }
            media += numeros[i];
        }
        System.out.println("Maior :" + maior + " Menor: " + menor + " Soma: " + media +" Média: " + (float) media/numeros.length );

    }


}