import java.util.Scanner;

public class projp2 {
    public static void main(String[] args) throws Exception {
        String varcap1;
        String escolha2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Era uma vez um velho senhor chamado Arlindo. \nVivia em uma cidade pacata chamada lindocity,\ncidade essa que ele gostava muito,\n principalmente pela beleza do local e das pessoas.\nPorém em um dia de verão, ele estava mais feliz\ndo que de costume, pois estava na praia com\na sua amada família. Mas derrepente ele avistou na beira\nda praia o ser humano mais feio que ele já viu na vida.\nSeu nome era Jubiscreldo. Homem de pouca beleza, mas de\nmuita personalidade. Daí o nosso amado herói Arlindo pergunta a\n Jubiscreldo o seguinte:\n ");
        System.out.println("====Escolha1==== : 'Nossa!!! Você nasceu assim mesmo ou foi degradando-se ao longo do tempo?'\n");
        System.out.println("====Escolha2==== : 'Olá, caro jovem. Tudo bem? Posso ficar aqui ao seu lado admirando o mar?'\n");
        System.out.println("====Escolha3==== :'Olá, caro jovem. Eu poderia te contar uma piada que tenho preparado há dias. Prepare-se, pois ela é muito boa e criativa.'\n");
        String escolha1 = scanner.nextLine();

        if (escolha1.equals("Escolha1") ) {
            System.out.println("Jubiscrealdo responde:\n-Eu realmente sou um destaque perante essas grandes\natrações que são os indivíduos de lindociy.\n Porém apenas estou aqui a passeio com a minha amada e igualmente \nfeia família. Mas reaelmente, aqui só existem belas pessoas.\n Arlindo se senta ao lado de Jubiscreldo e diz:\n");
            System.out.println("====Escolha1==== : 'Ah, mas está tudo bem ser feio.\n Eu só estou impressionado, porque em todos os meus anos\n de vida eu nunca vi alguém com extrema falta\n de beleza nessa cidade belíssima'\n");
            System.out.println("====Escolha2==== : 'Nunca me impressionei com as pessoas\n que moram aqui, mas sempre fui apaixonado por essa cidade\n em si'\n");
            System.out.println("====Escolha3==== : 'Minha família foi uma das fundadoras\nda dessa cidade. Vem aqui, vou te apresentar a todos eles.'\n");
        }

        else if (escolha1.equals("Escolha2")) {
            System.out.println("Jubiscreldo responde:\n-É claro, caro senhor. Estou fazendo o mesmo. A\n grandeza do mar é realmente incrível.\n");
            System.out.println("====Escolha1==== : 'Há tempos que não venho a praia\n e admiro o mar, mesmo tendo tanta 'experiência' como pode ver. Para\n um velho homem que não tem mais tantas boas memórias... o movimento\n das águas muda me faz lembrar dos meus tempos de jovem.\n");
            System.out.println("====Escolha2==== : 'Vlw, cumpade. Como vai a onda?'\n");
            System.out.println("====Escolha3==== : 'O mar é bonito mesmo, mas você...'\n");
            
        }

        else
        {
            System.out.println("Jubiscreldo responde:\nÉ claro, nobre senhor. Estou um pouco desanimado há alguns \ndias, e com essa sua piada boa e criativa eu posso ficar mais\n animado, eu espero.\n");
            System.out.println("====Escolha1==== : 'Por que está tão desanimado, caro jovem?'\n");
            System.out.println("====Escolha2==== : 'Com a sua falta de belza é fácil de se desanimar, realmente. Não é de se admirar.'\n");
            System.out.println("====Escolha3==== : 'Vix!!! Agora me sinto muita respopnsabilidade em minhas costas, mas lá vai!!!\nPor que os fantasmas são péssimos para contar mentiras?\nPorque são transparentes.\n E aí?'\n");
        }

    
    }

}