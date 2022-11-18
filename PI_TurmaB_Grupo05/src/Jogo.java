import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Jogo {
    public static void opcao() {
        System.out.println("----------Bem Vindo!-----------");
        System.out.println("-------------------------------");
        System.out.println("|Escolha as sua Opção abaixo: |");
        System.out.println("|       1 - Instruções        |");
        System.out.println("|         2 - Jogar           |");
        System.out.println("|        3 - Créditos         |");
        System.out.println("|         4 - Sair            |");
        System.out.println("-------------------------------");
    }

    public static void controle() {
        opcao();
        char opcao;
        Scanner menu = new Scanner(System.in);
        System.out.println("      Escolha uma opção:   ");
        opcao = menu.next().charAt(0);
        switch (opcao) {
            case '1' -> {
                System.out.println("     Você escolheu Instruções   \n");
                instrucoes();
                break;
            }
            case '2' -> {
                System.out.println("     Você escolheu Jogar    \n");
                jogar();
                break;
            }
            case '3' -> {
                System.out.println("      Você escolheu Créditos    \n");
                creditos();
                break;
            }
            case '4' -> {
                System.out.println("    Você escolheu sair do Jogo  \n");
                sair();
                break;
            }
            default -> {
                System.out.println("         Opção inválida!     \n");
                controle();
                break;
            }
        }
    }

    public static void instrucoes() {

            System.out.println("Bem Vindo! \r\n"
                    + "O nosso jogo foi desenvolvido para testar os seus conhecimentos na área de tecnologia!\n"
                    + "Leia as com atenção as questões, e escolha uma das alternativas,\n"
                    + "São 11 perguntas e você terá 2 chances para acertar cada questão \n"
                    + "No final, temos uma pergunta Bônus que pode dobrar a sua pontuação. \n");
                    controle();
            }

    public static void jogar() {
        Scanner entrada = new Scanner(System.in);
        Scanner leitor = new Scanner(System.in);
        String questao = ("Quem foi o criador do java?");
        Collection<String> alternativas = new ArrayList<>(); //Collection vai embaralhar as alternativas 

        alternativas.add("Bill Gates");
        alternativas.add("James Gosling");
        alternativas.add("Steve jobs");
        alternativas.add("Elon Musk");

        String alternativaCorreta = "James Gosling";

        boolean respostaCerta = false;

        int i = 2;
        int p = 0; //pontos
        int tentativas = 1; // quantas chances

        while ((i <= 2) && (i > 0)) {

            System.out.println(questao);

            //cast - embaralhando a ordem das alterntivas
            Collections.shuffle((List<String>) alternativas);

            //Mostrar as alternativas na tela 
            for (int x = 0; x < alternativas.size(); x++) {
                System.out.println("[" + x + "] " + ((List<String>) alternativas).get(x));
            }

            System.out.println("Digite sua Resposta: ");
            String resposta = entrada.nextLine();

            switch (resposta) {

                case "0":
                case "1":
                case "2":
                case "3":

                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas).get(respostaInt);

                    //if(resposta.equals("2")) {// a posiçao da resposta da collection no caso 2
                    if (valorDaResposta.equals(alternativaCorreta)) {
                        p = p + 10;
                        System.out.println("Resposta Correta! " + p + " Pontos!!!\n");
                        i = i + 4;
                        respostaCerta = true;

                    } else {

                        System.out.println("Resposta errada! " + "você tem mais " + tentativas + " tentativas\n");
                        tentativas = tentativas - 1;

                        i--;
                        System.out.println("");

                    }
                    break;

                default:
                    System.out.println("Opção invalida. \n");
                    if (i == 2) {
                        System.out.println("Você tem mais uma tentativa \n");
                    }
                    i--;
                    break;

            } //FECHA QUESTAO 1-------------------------------

        } // QUESTÃO 2 ---------------------------------------------------------

        Scanner entrada2 = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);
        String questao2 = ("Qual o valor em Binário do Decimal 42? ");
        Collection<String> alternativas2 = new ArrayList<>(); //Collection vai embarar as alternativas 

        alternativas2.add("101010");
        alternativas2.add("101011");
        alternativas2.add("111010");
        alternativas2.add("101111");

        String alternativaCorreta2 = "101010";

        boolean respostaCerta2 = false;

        i = 2;
        tentativas = 1;
        while ((i <= 2) && (i > 0)) {

            System.out.println(questao2);

            //cast - embaralhando a ordem das alterntivas
            Collections.shuffle((List<String>) alternativas2);

            //Mostrar as alternativas na tela 
            for (int x = 0; x < alternativas2.size(); x++) {
                System.out.println("[" + x + "] " + ((List<String>) alternativas2).get(x));
            }

            System.out.println("Digite sua Resposta: ");
            String resposta = entrada2.nextLine();

            switch (resposta) {

                case "0":
                case "1":
                case "2":
                case "3":

                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas2).get(respostaInt);

                    //if(resposta.equals("2")) {// a posiçao da resposta da collection no caso 2
                    if (valorDaResposta.equals(alternativaCorreta2)) {
                        p = p + 10;
                        System.out.println("Resposta Correta! " + p + " Pontos!!!\n");
                        i = i + 4;
                        respostaCerta2 = true;

                    } else {
                        System.out.println("Resposta errada! " + "você tem mais " + tentativas + " tentativas\n");
                        tentativas = tentativas - 1;

                        i--;
                        System.out.println("");

                    }
                    break;

                default:
                    System.out.println("Opção invalida. \n");
                    if (i == 2) {
                        System.out.println("Você tem mais uma tentativa \n");
                    }
                    i--;
                    break;
            }

        }  // FECHA QUESTÃO 2 --------------------------------------------------

        // QUESTÃO 3 -----------------------------------------------------------
        Scanner entrada3 = new Scanner(System.in);
        Scanner leitor3 = new Scanner(System.in);
        String questao3 = ("Qual o valor Hexadecimal do numero decimal 1231");
        Collection<String> alternativas3 = new ArrayList<>(); //Collection vai embarar as alternativas 

        alternativas3.add("4D1");
        alternativas3.add("4CE");
        alternativas3.add("4CF");
        alternativas3.add("4D3");

        String alternativaCorreta3 = "4CF";

        boolean respostaCerta3 = false;

        i = 2;
        tentativas = 1;
        while ((i <= 2) && (i > 0)) {

            System.out.println(questao3);

            //cast - embaralhando a ordem das alterntivas
            Collections.shuffle((List<String>) alternativas3);

            //Mostrar as alternativas na tela 
            for (int x = 0; x < alternativas3.size(); x++) {
                System.out.println("[" + x + "] " + ((List<String>) alternativas3).get(x));
            }

            System.out.println("Digite sua Resposta: ");
            String resposta = entrada3.nextLine();

            switch (resposta) {

                case "0":
                case "1":
                case "2":
                case "3":

                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas3).get(respostaInt);

                    //if(resposta.equals("2")) {// a posiçao da resposta da collection no caso 2
                    if (valorDaResposta.equals(alternativaCorreta3)) {
                        p = p + 10;
                        System.out.println("Resposta Correta! " + p + " Pontos!!!\n");
                        i = i + 4;
                        respostaCerta3 = true;

                    } else {
                        System.out.println("Resposta errada! " + "você tem mais " + tentativas + " tentativas\n");
                        tentativas = tentativas - 1;
                        i--;
                        System.out.println("");

                    }
                    break;

                default:
                    System.out.println("Opção invalida. \n");
                    if (i == 2) {
                        System.out.println("Você tem mais uma tentativa \n");
                    }
                    i--;
                    break;
            }

        }  // FECHA QUESTÃO 3 --------------------------------------------------

        // QUESTÃO 4 -----------------------------------------------------------
        Scanner entrada4 = new Scanner(System.in);
        Scanner leitor4 = new Scanner(System.in);
        String questao4 = ("Qual o valor Decimal do Hexadecimal ED ?");
        Collection<String> alternativas4 = new ArrayList<>(); //Collection vai embarar as alternativas 

        alternativas4.add("230");
        alternativas4.add("233");
        alternativas4.add("235");
        alternativas4.add("237");

        String alternativaCorreta4 = "237";

        boolean respostaCerta4 = false;

        i = 2;
        tentativas = 1;
        while ((i <= 2) && (i > 0)) {

            System.out.println(questao4);

            //cast - embaralhando a ordem das alterntivas
            Collections.shuffle((List<String>) alternativas4);

            //Mostrar as alternativas na tela 
            for (int x = 0; x < alternativas4.size(); x++) {
                System.out.println("[" + x + "] " + ((List<String>) alternativas4).get(x));
            }

            System.out.println("Digite sua Resposta: ");
            String resposta = entrada4.nextLine();

            switch (resposta) {

                case "0":
                case "1":
                case "2":
                case "3":

                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas4).get(respostaInt);

                    //if(resposta.equals("2")) {// a posiçao da resposta da collection no caso 2
                    if (valorDaResposta.equals(alternativaCorreta4)) {
                        p = p + 10;
                        System.out.println("Resposta Correta! " + p + " Pontos!!!\n");
                        i = i + 4;
                        respostaCerta4 = true;

                    } else {
                        System.out.println("Resposta errada! " + "você tem mais " + tentativas + " tentativas\n");
                        tentativas = tentativas - 1;
                        i--;
                        System.out.println("");

                    }
                    break;

                default:
                    System.out.println("Opção invalida. \n");
                    if (i == 2) {
                        System.out.println("Você tem mais uma tentativa \n");
                    }
                    i--;
                    break;
            }

        }  // FECHA QUESTÃO 4 --------------------------------------------------

        // QUESTÃO 5 -----------------------------------------------------------
        Scanner entrada5 = new Scanner(System.in);
        Scanner leitor5 = new Scanner(System.in);
        String questao5 = ("O que significa if ?");
        Collection<String> alternativas5 = new ArrayList<>(); //Collection vai embarar as alternativas 

        alternativas5.add("Então");
        alternativas5.add("Se");
        alternativas5.add("Se não");
        alternativas5.add("Talvez");

        String alternativaCorreta5 = "Se";

        boolean respostaCerta5 = false;

        i = 2;
        tentativas = 1;
        while ((i <= 2) && (i > 0)) {

            System.out.println(questao5);

            //cast - embaralhando a ordem das alterntivas
            Collections.shuffle((List<String>) alternativas5);

            //Mostrar as alternativas na tela 
            for (int x = 0; x < alternativas5.size(); x++) {
                System.out.println("[" + x + "] " + ((List<String>) alternativas5).get(x));
            }

            System.out.println("Digite sua Resposta: ");
            String resposta = entrada5.nextLine();

            switch (resposta) {

                case "0":
                case "1":
                case "2":
                case "3":

                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas5).get(respostaInt);

                    //if(resposta.equals("2")) {// a posiçao da resposta da collection no caso 2
                    if (valorDaResposta.equals(alternativaCorreta5)) {
                        p = p + 10;
                        System.out.println("Resposta Correta! " + p + " Pontos!!!\n");
                        i = i + 4;
                        respostaCerta5 = true;

                    } else {
                        System.out.println("Resposta errada! " + "você tem mais " + tentativas + " tentativas\n");
                        tentativas = tentativas - 1;
                        i--;
                        System.out.println("");

                    }
                    break;

                default:
                    System.out.println("Opção invalida. \n");
                    if (i == 2) {
                        System.out.println("Você tem mais uma tentativa \n");
                    }
                    i--;
                    break;
            }

        }  // FECHA QUESTÃO 5 --------------------------------------------------

        // QUESTÃO 6 -----------------------------------------------------------
        Scanner entrada6 = new Scanner(System.in);
        Scanner leitor6 = new Scanner(System.in);
        String questao6 = ("O que significa Else ?");
        Collection<String> alternativas6 = new ArrayList<>(); //Collection vai embarar as alternativas 

        alternativas6.add("Se");
        alternativas6.add("Ou");
        alternativas6.add("Se não");
        alternativas6.add("Enquanto");

        String alternativaCorreta6 = "Se não";

        boolean respostaCerta6 = false;

        i = 2;
        tentativas = 1;
        while ((i <= 2) && (i > 0)) {

            System.out.println(questao6);

            //cast - embaralhando a ordem das alterntivas
            Collections.shuffle((List<String>) alternativas6);

            //Mostrar as alternativas na tela 
            for (int x = 0; x < alternativas6.size(); x++) {
                System.out.println("[" + x + "] " + ((List<String>) alternativas6).get(x));
            }

            System.out.println("Digite sua Resposta: ");
            String resposta = entrada6.nextLine();

            switch (resposta) {

                case "0":
                case "1":
                case "2":
                case "3":

                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas6).get(respostaInt);

                    //if(resposta.equals("2")) {// a posiçao da resposta da collection no caso 2
                    if (valorDaResposta.equals(alternativaCorreta6)) {
                        p = p + 10;
                        System.out.println("Resposta Correta! " + p + " Pontos!!!\n");
                        i = i + 4;
                        respostaCerta6 = true;

                    } else {
                        System.out.println("Resposta errada! " + "você tem mais " + tentativas + " tentativas\n");
                        tentativas = tentativas - 1;
                        i--;
                    }
                    break;

                default:
                    System.out.println("Opção invalida. \n");
                    if (i == 2) {
                        System.out.println("Você tem mais uma tentativa \n");
                    }
                    i--;
                    break;
            }

        }  // FECHA QUESTÃO 6 --------------------------------------------------

        // QUESTÃO 7 -----------------------------------------------------------
        Scanner entrada7 = new Scanner(System.in);
        Scanner leitor7 = new Scanner(System.in);
        String questao7 = ("Para que serve Import Java.sql. ?");
        Collection<String> alternativas7 = new ArrayList<>(); //Collection vai embarar as alternativas 

        alternativas7.add("Conexão com Banco de Dados");
        alternativas7.add("Conexão com Class");
        alternativas7.add("Conexão com mundo");
        alternativas7.add("Conexão com Package");

        String alternativaCorreta7 = "Conexão com Banco de Dados";

        boolean respostaCerta7 = false;

        i = 2;
        tentativas = 1;
        while ((i <= 2) && (i > 0)) {

            System.out.println(questao7);

            //cast - embaralhando a ordem das alterntivas
            Collections.shuffle((List<String>) alternativas7);

            //Mostrar as alternativas na tela 
            for (int x = 0; x < alternativas7.size(); x++) {
                System.out.println("[" + x + "] " + ((List<String>) alternativas7).get(x));
            }

            System.out.println("Digite sua Resposta: ");
            String resposta = entrada7.nextLine();

            switch (resposta) {

                case "0":
                case "1":
                case "2":
                case "3":

                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas7).get(respostaInt);

                    //if(resposta.equals("2")) {// a posiçao da resposta da collection no caso 2
                    if (valorDaResposta.equals(alternativaCorreta7)) {
                        p = p + 10;
                        System.out.println("Resposta Correta! " + p + " Pontos!!!\n");
                        i = i + 4;
                        respostaCerta7 = true;

                    } else {
                        System.out.println("Resposta errada! " + "você tem mais " + tentativas + " tentativas\n");
                        tentativas = tentativas - 1;
                        i--;
                        System.out.println("");

                    }
                    break;

                default:
                    System.out.println("Opção invalida. \n");
                    if (i == 2) {
                        System.out.println("Você tem mais uma tentativa \n");
                    }
                    i--;
                    break;
            }

        }  // FECHA QUESTÃO 7 --------------------------------------------------

        // QUESTÃO 8 -----------------------------------------------------------
        Scanner entrada8 = new Scanner(System.in);
        Scanner leitor8 = new Scanner(System.in);
        String questao8 = ("Qual o valor Decimal do Hexadecimal ABC ?");
        Collection<String> alternativas8 = new ArrayList<>(); //Collection vai embarar as alternativas 

        alternativas8.add("2648");
        alternativas8.add("2828");
        alternativas8.add("2748");
        alternativas8.add("2658");

        String alternativaCorreta8 = "2748";

        boolean respostaCerta8 = false;

        i = 2;
        tentativas = 1;
        while ((i <= 2) && (i > 0)) {

            System.out.println(questao8);

            //cast - embaralhando a ordem das alterntivas
            Collections.shuffle((List<String>) alternativas8);

            //Mostrar as alternativas na tela 
            for (int x = 0; x < alternativas8.size(); x++) {
                System.out.println("[" + x + "] " + ((List<String>) alternativas8).get(x));
            }

            System.out.println("Digite sua Resposta: ");
            String resposta = entrada8.nextLine();

            switch (resposta) {

                case "0":
                case "1":
                case "2":
                case "3":

                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas8).get(respostaInt);

                    //if(resposta.equals("2")) {// a posiçao da resposta da collection no caso 2
                    if (valorDaResposta.equals(alternativaCorreta8)) {
                        p = p + 10;
                        System.out.println("Resposta Correta! " + p + " Pontos!!!\n");
                        i = i + 4;
                        respostaCerta8 = true;

                    } else {
                        System.out.println("Resposta errada! " + "você tem mais " + tentativas + " tentativas\n");
                        tentativas = tentativas - 1;
                        i--;
                        System.out.println("");

                    }
                    break;

                default:
                    System.out.println("Opção invalida. \n");
                    if (i == 2) {
                        System.out.println("Você tem mais uma tentativa \n");
                    }
                    i--;
                    break;
            }

        }  // FECHA QUESTÃO 8 --------------------------------------------------

        // QUESTÃO 9 -----------------------------------------------------------
        Scanner entrada9 = new Scanner(System.in);
        Scanner leitor9 = new Scanner(System.in);
        String questao9 = ("O Valor  Decimal para Hexadecimal de 450 ?");
        Collection<String> alternativas9 = new ArrayList<>(); //Collection vai embarar as alternativas 

        alternativas9.add("1C4");
        alternativas9.add("1C2");
        alternativas9.add("1D4");
        alternativas9.add("1D2");

        String alternativaCorreta9 = "1C2";

        boolean respostaCerta9 = false;

        i = 2;
        tentativas = 1;
        while ((i <= 2) && (i > 0)) {

            System.out.println(questao9);

            //cast - embaralhando a ordem das alterntivas
            Collections.shuffle((List<String>) alternativas9);

            //Mostrar as alternativas na tela 
            for (int x = 0; x < alternativas9.size(); x++) {
                System.out.println("[" + x + "] " + ((List<String>) alternativas9).get(x));
            }

            System.out.println("Digite sua Resposta: ");
            String resposta = entrada9.nextLine();

            switch (resposta) {

                case "0":
                case "1":
                case "2":
                case "3":

                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas9).get(respostaInt);

                    //if(resposta.equals("2")) {// a posiçao da resposta da collection no caso 2
                    if (valorDaResposta.equals(alternativaCorreta9)) {
                        p = p + 10;
                        System.out.println("Resposta Correta! " + p + " Pontos!!!\n");
                        i = i + 4;
                        respostaCerta9 = true;

                    } else {
                        System.out.println("Resposta errada! " + "você tem mais " + tentativas + " tentativas\n");
                        tentativas = tentativas - 1;
                        i--;
                        System.out.println("");

                    }
                    break;

                default:
                    System.out.println("Opção invalida. \n");
                    if (i == 2) {
                        System.out.println("Você tem mais uma tentativa \n");
                    }
                    i--;
                    break;
            }

        }  // FECHA QUESTÃO 9 --------------------------------------------------

        // QUESTÃO 10 -----------------------------------------------------------
        Scanner entrada10 = new Scanner(System.in);
        Scanner leitor10 = new Scanner(System.in);
        String questao10 = ("Qual o valor Binário do Decimal 2022 ?");
        Collection<String> alternativas10 = new ArrayList<>(); //Collection vai embarar as alternativas 

        alternativas10.add("10110110011");
        alternativas10.add("11111001100");
        alternativas10.add("10101010100");
        alternativas10.add("11111100110");

        String alternativaCorreta10 = "11111100110";

        boolean respostaCerta10 = false;

        i = 2;
        tentativas = 1;
        while ((i <= 2) && (i > 0)) {

            System.out.println(questao10);

            //cast - embaralhando a ordem das alterntivas
            Collections.shuffle((List<String>) alternativas10);

            //Mostrar as alternativas na tela 
            for (int x = 0; x < alternativas10.size(); x++) {
                System.out.println("[" + x + "] " + ((List<String>) alternativas10).get(x));
            }

            System.out.println("Digite sua Resposta: ");
            String resposta = entrada10.nextLine();

            switch (resposta) {

                case "0":
                case "1":
                case "2":
                case "3":

                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas10).get(respostaInt);

                    //if(resposta.equals("2")) {// a posiçao da resposta da collection no caso 2
                    if (valorDaResposta.equals(alternativaCorreta10)) {
                        p = p + 10;
                        System.out.println("Resposta Correta! " + p + " Pontos!!!\n");
                        i = i + 4;
                        respostaCerta10 = true;

                    } else {
                        System.out.println("Resposta errada! " + "você tem mais " + tentativas + " tentativas\n");
                        tentativas = tentativas - 1;
                        i--;
                        System.out.println("");

                    }
                    break;

                default:
                    System.out.println("Opção invalida. \n");
                    if (i == 2) {
                        System.out.println("Você tem mais uma tentativa \n");
                    }
                    i--;
                    break;
            }

        }  // FECHA QUESTÃO 10 --------------------------------------------------
        // QUESTÃO 11 -----------------------------------------------------------
        Scanner entrada11 = new Scanner(System.in);
        Scanner leitor11 = new Scanner(System.in);
        String questao11 = ("Pergunta BÔNUS! Essa pergunta pode dobrar a sua pontuação. \n"
                + "Em que ano foi lançado o Java ?");
        Collection<String> alternativas11 = new ArrayList<>(); //Collection vai embarar as alternativas 

        alternativas11.add("1992");
        alternativas11.add("1995");
        alternativas11.add("1993");
        alternativas11.add("1991");

        String alternativaCorreta11 = "1995";

        boolean respostaCerta11 = false;

        i = 1;
        tentativas = 1;
        while ((i <= 2) && (i > 0)) {

            System.out.println(questao11);

            //cast - embaralhando a ordem das alterntivas
            Collections.shuffle((List<String>) alternativas11);

            //Mostrar as alternativas na tela 
            for (int x = 0; x < alternativas11.size(); x++) {
                System.out.println("[" + x + "] " + ((List<String>) alternativas11).get(x));
            }

            System.out.println("Digite sua Resposta: ");
            String resposta = entrada11.nextLine();

            switch (resposta) {

                case "0":
                case "1":
                case "2":
                case "3":

                    int respostaInt = Integer.parseInt(resposta);

                    String valorDaResposta = ((List<String>) alternativas11).get(respostaInt);

                    //if(resposta.equals("2")) {// a posiçao da resposta da collection no caso 2
                    if (valorDaResposta.equals(alternativaCorreta11)) {
                        p = p * 2;
                        System.out.println("Resposta Correta! " + p + " Pontos!!!\n");
                        i = i + 4;
                        respostaCerta11 = true;

                    } else {
                        System.out.println("Resposta errada! " + "você tem mais " + tentativas + " tentativas\n");
                        tentativas = tentativas - 1;
                        i--;
                        System.out.println("");

                    }
                    break;

                default:
                    System.out.println("Opção invalida. \n");
                    if (i == 2) {
                        System.out.println("Você tem mais uma tentativa \n");
                    }
                    i--;
                    break;
            }

        }  // FECHA QUESTÃO 11 --------------------------------------------------

        System.out.println("Total de pontos " + p);
    }

    public static void creditos() {
        System.out.println("Esse jogo foi desenvolvido por: \n");    
    	System.out.println("Erik Rodrigues da Silva\n"
            					+"Kleverton Patrick do Amaral Soares\n"
            					+"Lucas Marques Pose\n"
            					+"Rafael Barbosa da Silva\n"
            					+"Salomão Felipe Lima\n"
            					+"Wesley Gomes Monteiro\n"
            					
            					);
    	
            controle();
            }

    public static void sair() {
        
        System.out.println("Até logo! ");
    }

    public static void main(String[] args) {
        controle();

    }
}
