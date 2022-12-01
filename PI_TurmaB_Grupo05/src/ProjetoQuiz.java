import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProjetoQuiz {
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
				+ "Leia as com atenção as alternativas, e escolha uma das alternativa,\n"
				+ "você terá 2 chances para acertar cada questão, no total de 11 perguntas \n"
				+ "E no final, uma pergunta Bônus que pode dobrar a sua pontuação. \n");
		controle();
	}

	public static void jogar() {
		Scanner entrada = new Scanner(System.in);
		String questao = ("Quem foi o criador do java?\n");
		Collection<String> alternativas = new ArrayList<>(); // Collection vai embaralhar as alternativas

		alternativas.add("Bill Gates");
		alternativas.add("James Gosling");
		alternativas.add("Steve jobs");
		alternativas.add("Elon Musk");

		String alternativaCorreta = "James Gosling";

		int i = 2;
		int p = 0; // pontos
		int tentativas = 1; // quantas chances

		while ((i <= 2) && (i > 0)) {

			System.out.println(questao);

			// cast - embaralhando a ordem das alterntivas
			Collections.shuffle((List<String>) alternativas);

			// Mostrar as alternativas na tela
			for (int x = 0; x < alternativas.size(); x++) {
				System.out.println("[" + x + "] " + ((List<String>) alternativas).get(x));
			}

			System.out.println("Digite sua Resposta: \n");
			String resposta = entrada.nextLine();

			switch (resposta) {

			case "0":
			case "1":
			case "2":
			case "3":

				int respostaInt = Integer.parseInt(resposta);

				String valorDaResposta = ((List<String>) alternativas).get(respostaInt);

				// if(resposta.equals("2")) {// a posiçao da resposta da collection no caso 2
				if (valorDaResposta.equals(alternativaCorreta)) {
					p = p + 10;
					System.out.println("Resposta Correta! " + p + " Pontos!!!\n");
					i = i + 4;
					

				} else {

					 System.out.println("Resposta errada! ");
                     if (i == 2) {
                         System.out.println("Você tem mais " + tentativas + " tentativa");
                     }
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

			} // FECHA QUESTAO 1-------------------------------

		} // QUESTÃO 2 ---------------------------------------------------------

		Scanner entrada2 = new Scanner(System.in);
		String questao2 = ("O que é Java? \n");
		Collection<String> alternativas2 = new ArrayList<>(); // Collection vai embarar as alternativas

		alternativas2.add("É uma caixa de dialogo");
		alternativas2.add("É o método utilizado pra fazer pesquisar");
		alternativas2.add("É uma linguagem de programação orientada a objeto");
		alternativas2.add("É um método pra criptografar objetos");

		String alternativaCorreta2 = "É uma linguagem de programação orienta a objeto";

		
		i = 2; //pontos 
		tentativas = 1; //quantas chance
		while ((i <= 2) && (i > 0)) {

			System.out.println(questao2);

			// cast - embaralhando a ordem das alterntivas
			Collections.shuffle((List<String>) alternativas2);

			// Mostrar as alternativas na tela
			for (int x = 0; x < alternativas2.size(); x++) {
				System.out.println("[" + x + "] " + ((List<String>) alternativas2).get(x));
			}

			System.out.println("Digite sua Resposta: \n");
			String resposta = entrada2.nextLine();

			switch (resposta) {

			case "0":
			case "1":
			case "2":
			case "3":

				int respostaInt = Integer.parseInt(resposta);

				String valorDaResposta = ((List<String>) alternativas2).get(respostaInt);

				// if(resposta.equals("2")) {// a posiçao da resposta da collection no caso 2
				if (valorDaResposta.equals(alternativaCorreta2)) {
					p = p + 10;
					System.out.println("Resposta Correta! " + p + " Pontos!!!\n");
					i = i + 4;
					
				} else {
					 System.out.println("Resposta errada! ");
                     if (i == 2) {
                         System.out.println("Você tem mais " + tentativas + " tentativa");
                     }
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

		} // FECHA QUESTÃO 2 --------------------------------------------------

		// QUESTÃO 3 -----------------------------------------------------------
		Scanner entrada3 = new Scanner(System.in);
		String questao3 = ("A linguagem Java apresenta uma sintaxe muito semelhante a qual linguagem? \n");
		Collection<String> alternativas3 = new ArrayList<>(); // Collection vai embarar as alternativas

		alternativas3.add("Python");
		alternativas3.add("JavaScript");
		alternativas3.add("C e C++");
		alternativas3.add("PHP");

		String alternativaCorreta3 = "C e C++";

		i = 2; // pontos
		tentativas = 1; //quantas chances 
		while ((i <= 2) && (i > 0)) {

			System.out.println(questao3);

			// cast - embaralhando a ordem das alterntivas
			Collections.shuffle((List<String>) alternativas3);

			// Mostrar as alternativas na tela
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

				// if(resposta.equals("2")) {// a posiçao da resposta da collection no caso 2
				if (valorDaResposta.equals(alternativaCorreta3)) {
					p = p + 10;
					System.out.println("Resposta Correta! " + p + " Pontos!!!\n");
					i = i + 4;
					

				} else {
					 System.out.println("Resposta errada! ");
                     if (i == 2) {
                         System.out.println("Você tem mais " + tentativas + " tentativa");
                     }
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

		} // FECHA QUESTÃO 3 --------------------------------------------------

		// QUESTÃO 4 -----------------------------------------------------------
		Scanner entrada4 = new Scanner(System.in);
		String questao4 = ("Quais são os pilares POO? \n");
		Collection<String> alternativas4 = new ArrayList<>(); // Collection vai embarar as alternativas

		alternativas4.add("Abstração, Herança, Polimorfismo e Encapsulamento");
		alternativas4.add("Classe, pacote, metodo e objeto");
		alternativas4.add("JDK, JVM, java SE e Java EE");
		alternativas4.add("Variaveis, Métodos, funções e bibliotecas");

		String alternativaCorreta4 = "Abstração, herança, polimorfismo e encapsulamento";

		i = 2; // pontos
		tentativas = 1; //quantas chances
		while ((i <= 2) && (i > 0)) {

			System.out.println(questao4);

			// cast - embaralhando a ordem das alterntivas
			Collections.shuffle((List<String>) alternativas4);

			// Mostrar as alternativas na tela
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

				// if(resposta.equals("2")) {// a posiçao da resposta da collection no caso 2
				if (valorDaResposta.equals(alternativaCorreta4)) {
					p = p + 10;
					System.out.println("Resposta Correta! " + p + " Pontos!!!\n");
					i = i + 4;
					
				} else {
					 System.out.println("Resposta errada! ");
                     if (i == 2) {
                         System.out.println("Você tem mais " + tentativas + " tentativa");
                     }
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

		} // FECHA QUESTÃO 4 --------------------------------------------------

		// QUESTÃO 5 -----------------------------------------------------------
		Scanner entrada5 = new Scanner(System.in);
		String questao5 = ("O que significa if ?\n");
		Collection<String> alternativas5 = new ArrayList<>(); // Collection vai embarar as alternativas

		alternativas5.add("Então");
		alternativas5.add("Se");
		alternativas5.add("Senão");
		alternativas5.add("Talvez");

		String alternativaCorreta5 = "Se";

		i = 2; //pontos
		tentativas = 1; //quantas chances
		while ((i <= 2) && (i > 0)) {

			System.out.println(questao5);

			// cast - embaralhando a ordem das alterntivas
			Collections.shuffle((List<String>) alternativas5);

			// Mostrar as alternativas na tela
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

				// if(resposta.equals("2")) {// a posiçao da resposta da collection no caso 2
				if (valorDaResposta.equals(alternativaCorreta5)) {
					p = p + 10;
					System.out.println("Resposta Correta! " + p + " Pontos!!!\n");
					i = i + 4;
					
				} else {
					 System.out.println("Resposta errada! ");
                     if (i == 2) {
                         System.out.println("Você tem mais " + tentativas + " tentativa");
                     }
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

		} // FECHA QUESTÃO 5 --------------------------------------------------

		// QUESTÃO 6 -----------------------------------------------------------
		Scanner entrada6 = new Scanner(System.in);
		String questao6 = ("O que significa Else ?\n");
		Collection<String> alternativas6 = new ArrayList<>(); // Collection vai embarar as alternativas

		alternativas6.add("Se");
		alternativas6.add("Ou");
		alternativas6.add("Senão");
		alternativas6.add("Enquanto");

		String alternativaCorreta6 = "Senão";

		i = 2; // pontos
		tentativas = 1; // quantas chances
		while ((i <= 2) && (i > 0)) {

			System.out.println(questao6);

			// cast - embaralhando a ordem das alterntivas
			Collections.shuffle((List<String>) alternativas6);

			// Mostrar as alternativas na tela
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

				// if(resposta.equals("2")) {// a posiçao da resposta da collection no caso 2
				if (valorDaResposta.equals(alternativaCorreta6)) {
					p = p + 10;
					System.out.println("Resposta Correta! " + p + " Pontos!!!\n");
					i = i + 4;
					
				} else {
					 System.out.println("Resposta errada! ");
                     if (i == 2) {
                         System.out.println("Você tem mais " + tentativas + " tentativa");
                     }
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

		} // FECHA QUESTÃO 6 --------------------------------------------------

		// QUESTÃO 7 -----------------------------------------------------------
		Scanner entrada7 = new Scanner(System.in);
		String questao7 = ("Para que serve Import Java.sql. ?\n");
		Collection<String> alternativas7 = new ArrayList<>(); // Collection vai embarar as alternativas

		alternativas7.add("Conexão com Banco de Dados");
		alternativas7.add("Conexão com Class");
		alternativas7.add("Conexão com mundo");
		alternativas7.add("Conexão com Package");

		String alternativaCorreta7 = "Conexão com Banco de Dados";

		i = 2; // pontos
		tentativas = 1; // quantas chances
		while ((i <= 2) && (i > 0)) {

			System.out.println(questao7);

			// cast - embaralhando a ordem das alterntivas
			Collections.shuffle((List<String>) alternativas7);

			// Mostrar as alternativas na tela
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

				// if(resposta.equals("2")) {// a posiçao da resposta da collection no caso 2
				if (valorDaResposta.equals(alternativaCorreta7)) {
					p = p + 10;
					System.out.println("Resposta Correta! " + p + " Pontos!!!\n");
					i = i + 4;
					
				} else {
					 System.out.println("Resposta errada! ");
                     if (i == 2) {
                         System.out.println("Você tem mais " + tentativas + " tentativa");
                     }
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

		} // FECHA QUESTÃO 7 --------------------------------------------------

		// QUESTÃO 8 -----------------------------------------------------------
		Scanner entrada8 = new Scanner(System.in);
		String questao8 = ("O que significa JDK ?\n");
		Collection<String> alternativas8 = new ArrayList<>(); // Collection vai embarar as alternativas

		alternativas8.add("Java Desenvolver kit");
		alternativas8.add("Java Developer kit");
		alternativas8.add("Java Development Kit");
		alternativas8.add("Java Disarranger Kit");

		String alternativaCorreta8 = "Java Development Kit";

		i = 2; // pontos
		tentativas = 1; // quantas chances
		while ((i <= 2) && (i > 0)) {

			System.out.println(questao8);

			// cast - embaralhando a ordem das alterntivas
			Collections.shuffle((List<String>) alternativas8);

			// Mostrar as alternativas na tela
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

				// if(resposta.equals("2")) {// a posiçao da resposta da collection no caso 2
				if (valorDaResposta.equals(alternativaCorreta8)) {
					p = p + 10;
					System.out.println("Resposta Correta! " + p + " Pontos!!!\n");
					i = i + 4;
					
				} else {
					 System.out.println("Resposta errada! ");
                     if (i == 2) {
                         System.out.println("Você tem mais " + tentativas + " tentativa");
                     }
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

		} // FECHA QUESTÃO 8 --------------------------------------------------

		// QUESTÃO 9 -----------------------------------------------------------
		Scanner entrada9 = new Scanner(System.in);
		String questao9 = ("Em que ano foi lançado o primeiro Iphone ?\n");
		Collection<String> alternativas9 = new ArrayList<>(); // Collection vai embarar as alternativas

		alternativas9.add("2008");
		alternativas9.add("2010");
		alternativas9.add("2005");
		alternativas9.add("2007");

		String alternativaCorreta9 = "2007";

		i = 2; // pontos
		tentativas = 1; // quantas chances
		while ((i <= 2) && (i > 0)) {

			System.out.println(questao9);

			// cast - embaralhando a ordem das alterntivas
			Collections.shuffle((List<String>) alternativas9);

			// Mostrar as alternativas na tela
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

				// if(resposta.equals("2")) {// a posiçao da resposta da collection no caso 2
				if (valorDaResposta.equals(alternativaCorreta9)) {
					p = p + 10;
					System.out.println("Resposta Correta! " + p + " Pontos!!!\n");
					i = i + 4;
					
				} else {
					 System.out.println("Resposta errada! ");
                     if (i == 2) {
                         System.out.println("Você tem mais " + tentativas + " tentativa");
                     }
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

		} // FECHA QUESTÃO 9 --------------------------------------------------

		// QUESTÃO 10 -----------------------------------------------------------
		Scanner entrada10 = new Scanner(System.in);
		String questao10 = ("Qual o valor Binário do Decimal 2022 ?\n");
		Collection<String> alternativas10 = new ArrayList<>(); // Collection vai embarar as alternativas

		alternativas10.add("10110110011");
		alternativas10.add("11111001100");
		alternativas10.add("10101010100");
		alternativas10.add("11111100110");

		String alternativaCorreta10 = "11111100110";

		i = 2; // pontos
		tentativas = 1; // quantas chances
		while ((i <= 2) && (i > 0)) {

			System.out.println(questao10);

			// cast - embaralhando a ordem das alterntivas
			Collections.shuffle((List<String>) alternativas10);

			// Mostrar as alternativas na tela
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

				// if(resposta.equals("2")) {// a posiçao da resposta da collection no caso 2
				if (valorDaResposta.equals(alternativaCorreta10)) {
					p = p + 10;
					System.out.println("Resposta Correta! " + p + " Pontos!!!\n");
					i = i + 4;
					
				} else {
					 System.out.println("Resposta errada! ");
                     if (i == 2) {
                         System.out.println("Você tem mais " + tentativas + " tentativa");
                     }
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

		} // FECHA QUESTÃO 10 --------------------------------------------------
			// QUESTÃO 11 -----------------------------------------------------------
		Scanner entrada11 = new Scanner(System.in);
		String questao11 = ("Pergunta BÔNUS! Essa pergunta pode dobrar a sua pontuação. \n"
				+ "Em que ano foi lançado o Java ?\n");
		Collection<String> alternativas11 = new ArrayList<>(); // Collection vai embarar as alternativas

		alternativas11.add("1992");
		alternativas11.add("1995");
		alternativas11.add("1993");
		alternativas11.add("1991");

		String alternativaCorreta11 = "1995";

		i = 1; //pontos
		tentativas = 1; //quantas chances
		while ((i <= 2) && (i > 0)) {

			System.out.println(questao11);

			// cast - embaralhando a ordem das alterntivas
			Collections.shuffle((List<String>) alternativas11);

			// Mostrar as alternativas na tela
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

				// if(resposta.equals("2")) {// a posiçao da resposta da collection no caso 2
				if (valorDaResposta.equals(alternativaCorreta11)) {
					p = p * 2;
					System.out.println("Resposta Correta! " + p + " Pontos!!!\n");
					i = i + 4;
					
				} else {
					 System.out.println("Resposta errada! ");
                     if (i == 2) {
                         System.out.println("Você tem mais " + tentativas + " tentativa");
                     }
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

		} // FECHA QUESTÃO 11 --------------------------------------------------

		System.out.println("Total de pontos " + p);
	}

	public static void creditos() {
		System.out.println("Esse jogo foi desenvolvido por: \n");
		System.out.println("Erik Rodrigues da Silva\n" + "Kleverton Patrick do Amaral Soares\n" + "Lucas Marques Pose\n"
				+ "Rafael Barbosa da Silva\n" + "Salomão Felipe Lima\n" + "Wesley Gomes Monteiro\n"

		);

		controle();
	}

	public static void sair() {
		//"**modulo sair**"
		System.out.println("Até logo! ");
	}

	public static void main(String[] args) {
		//"***modulo main***"
		controle();

	}
}
