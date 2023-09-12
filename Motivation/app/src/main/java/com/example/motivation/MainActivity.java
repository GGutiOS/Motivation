package com.example.motivation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import android.content.res.Resources;
import android.content.res.TypedArray;


public class MainActivity extends AppCompatActivity {

    private String[] mensagens = {
            "Eu sei que má notícia gosta de companhia, mas as minhas andam de mutirão.",
            "Na mala da vida, eu sou o xampu que abre a tampa e sai sujando e estragando tudo.",
            "De longe você parecia feio, de perto você parece que está de longe.",
            "É por isso que ninguém sentava contigo no recreio!",
            "A mãe da frustração é você acreditar que pode realizar seus sonhos sem ser herdeiro.",
            "Está vendo o carro novo do seu chefe? Se você seguir trabalhando com todo esse empenho, em seis meses ou um ano, ele vai conseguir comprar outro.",
            "Tudo pode dar errado se você tentar. Mas se não fizer nada, tudo ficará igual.",
            "Tudo saindo conforme o não planejado.",
            "Vai dar certo! Errado já está dando.",
            "Veja pelo lado bom: não há!",
            "A vida é um pêndulo entre o 'me deu mal' e o 'me ferrei'.",
            "Na hora certa, tudo vai dar errado.",
            "Para quem já está humilhado, o que é mais uma derrota?",
            "Abandone antes de tentar e evite maiores frustrações.",
            "É por isso que, na hora de apresentar o trabalho, você só segurava a cartolina.",
            "Vamos nos desesperar com calma.",
            "Essa vergonha você vai passar no cartão ou no débito?",
            "(Ch)oremos!",
            "Tudo certo para dar errado!",
            "Vamos rir, porque chorar entope o nariz e sua voz fica muito feia.",
            "É um absurdo, mas faz sentido.",
            "Eu esperava o pior, mas isso foi bem pior do que eu esperava.",
            "O mérito da derrota é todo seu, orgulhe-se.",
            "Olha... sério... na moral... sinceramente... sem condições.",
            "Por causa de gente como você que na caixa de ovo vem escrito 'Contém ovo'.",
            "Na cozinha da vida eu só sei fritar ovo e, de vez em quando, ainda queimo.",
            "Eu até tento esquecer meus problemas, mas eles parecem que não se esquecem de mim.",
            "É como diz o ditado: agora deu ruim!",
            "Faça uma vez, erre uma vez. Faça de novo, erre de novo.",
            "Vocês são as amizades que minha mãe pediu para eu evitar.",
            "A vida é 10% o que acontece com você e 90% o que aconteceria se você tivesse dinheiro.",
            "Se alguém quiser me derrubar hoje, vai ter que me ajudar a levantar primeiro porque eu já estou no chão.",
            "Se minha vida fosse um dia da semana, eu seria uma segunda-feira pós feriadão.",
            "Sonhar e se frustrar porque alguém realizou seus sonhos mais rápido que você.",
            "Ouvi falar que cada um carregava sua cruz, mas a vida está achando que eu sou caminhão de frete e passando umas a mais para mim.",
            "Relaxe, está tudo absolutamente fora do seu controle.",
            "Estou doida para ganhar na loteria e poder postar foto com legenda sobre a felicidade estar nas coisas simples.",
            "Na subida para meu sucesso, o elevador está quebrado, a escada está escorregadia e, de vez em quando, passa alguém subindo apressado e quase me derrubando no caminho.",
            "Você não pode mudar o seu passado, mas pode estragar seu futuro.",
            "O cartão de crédito está aí para quebrar seu galho. Aí depois ele pega o galho e dá bem na sua cabeça.",
            "A cada dia que passa, está sobrando mais mês no fim do dinheiro.",
            "A recompensa pelo bom trabalho é mais trabalho.",
            "Nunca desista, faça até dar errado.",
            "A vida é um lindo conto de falhas.",
            "A inteligência artificial só não é mais incrível do que a burrice natural.",
            "Tudo aquilo que você passou até agora está te preparando para algo pior.",
            "Um dia você perde. No outro você não ganha.",
            "Ano novo, vida nova e mais 365 oportunidades de fazer besteira.",
            "Procrastinar é acreditar no potencial do seu 'eu' de amanhã e se enganar por vários dias seguidos.",
            "Errar uma vez é humano. Repetir o erro só eu mesmo.",
            "Na viagem da vida, meu GPS está quebrado, estou sem co-piloto e o carro bem que precisa de uma revisão.",
            "Pode ser que seu propósito na vida seja nunca vencer, apenas viver de tentativa.",
            "O importante é acreditar na derrota e talvez se surpreender com a vitória.",
            "Os que não param de lutar estão sempre em busca da sua próxima derrota.",
            "As piores coisas da sua vida podem acontecer se você decidir sair de onde está.",
            "A esperança já te fez fazer coisas doidas e que você se arrependeu. Então, não tenha esperança em nada.",
            "O desespero é o que move as pessoas, não a esperança.",
            "Você não é especial e os outros também não são. Somos todos pessoas normais em busca do fracasso.",
            "O empate é o melhor resultado porque ninguém sai perdendo.",
            "Todos esperam que você falhe. Então, lute até provar que eles estão certos.",
            "Acredite quando falarem que não vai dar certo porque as pessoas são mais inteligentes que você.",
            "Não tenho pressa porque vai dar errado se eu correr ou não. Indo devagar, pelo menos poupo energia.",
            "O caminho não fica mais difícil, você é que fica mais cansado e não aguenta mais.",
            "Nada nunca fica mais fácil. Apenas a dificuldade tem garantia de crescimento.",
            "A frustração me ensinou que fazer nada não gera sofrimento.",
            "Para não se decepcionar, apenas não confie em ninguém, nem em você mesmo.",
            "Não é falta de sorte, é incompetência.",
            "Desistindo de tentar e sendo vitorioso em desistir.",
            "Se você mudar de ângulo, vai perceber que não o outro lado também não é bom.",
            "Você pode trabalhar muito, mas a sua conta bancária continuará no vermelho.",
            "Haverá dias ruins e eles serão sempre maiores que os dias bons.",
            "A empolgação da sexta-feira jamais será igual a da segunda porque ninguém gosta de trabalhar.",
            "No tempo certo, as coisas se ajeitam. Elas dão errado todas de uma vez.",
            "Você é a razão pela qual não temos coisas boas.",
            "Nada é impossível, mas você torna tudo mais difícil.",
            "Se a vida fosse uma corrida, você estaria sempre em último lugar.",
            "Você é o mestre em tomar as decisões erradas no momento errado.",
            "Seu talento para fazer nada é verdadeiramente notável.",
            "As chances de você ser um sucesso são as mesmas de eu me tornar uma celebridade: praticamente zero.",
            "Você é como uma nuvem de tempestade em um dia ensolarado.",
            "Quando se trata de escolher a coisa errada, você é um especialista.",
            "O mundo está cheio de oportunidades, e você está aqui, perdendo todas elas.",
            "Você é o tipo de pessoa que faria uma laranja suco de maçãs.",
            "Sua falta de ambição é tão inspiradora quanto uma lâmpada quebrada.",
            "Você é um exemplo perfeito de como não fazer nada com sucesso.",
            "Seus sonhos são como unicórnios - bonitos, mas completamente inexistentes.",
            "Você é tão organizado quanto um tornado em um ferro-velho.",
            "Todas as manhãs, você se levanta com a missão de fazer tudo errado.",
            "Você é uma estrela, uma estrela cadente que caiu do céu.",
            "Se a mediocridade fosse uma competição, você estaria no topo.",
            "Você é um verdadeiro especialista em encontrar o lado negativo de tudo.",
            "Seus erros são tão consistentes que poderiam ser considerados uma forma de arte.",
            "Você é um ímã para problemas, e eles sempre encontram o caminho até você.",
            "Você é como um queimador de dinheiro profissional.",
            "Sua capacidade de criar confusão é impressionante.",
            "Você é a pessoa que as outras pessoas apontam como exemplo do que não fazer.",
            "Você é uma inspiração para todos aqueles que desejam falhar miseravelmente.",
            "Seu otimismo é tão raro quanto um unicórnio comendo pizza.",
            "Você é uma pérola - uma pérola perdida no fundo do oceano.",
            "Seu lema de vida é: 'Por que fazer hoje o que você pode adiar indefinidamente?'",
            "Você é como um raio de sol em um dia chuvoso - totalmente ausente.",
            "Seu senso de direção é tão ruim que até o Google Maps desistiria de você.",
            "Você é a pessoa que faz as outras pessoas agradecerem por não serem você.",
            "Ninguém faz um trabalho tão bom em não fazer nada quanto você.",
            "Você é tão lento que até mesmo as tartarugas riem de você.",
            "Seu talento para perder coisas é verdadeiramente impressionante.",
            "Você é uma das razões pelas quais o botão 'Cancelar' foi inventado.",
            "Sua habilidade de fazer as coisas darem errado é incomparável.",
            "Você é o mestre em encontrar a nuvem em cada raio de sol.",
            "Sua persistência em não alcançar nada é admirável.",
            "Você é uma obra de arte - uma obra-prima de desastres.",
            "Você é o rei ou rainha da procrastinação.",
            "Ninguém pode afundar um barco como você.",
            "Você é como um furacão destruindo tudo em seu caminho.",
            "Sua capacidade de cometer os mesmos erros repetidamente é notável.",
            "Você é o motivo pelo qual as máquinas têm botões de desligar.",
            "Você é o mestre em perder oportunidades.",
            "Sua falta de ambição é tão profunda quanto o oceano.",
            "Você é uma péssima influência em si mesmo.",
            "Ninguém pode arruinar um momento feliz como você.",
            "Você é uma verdadeira fábrica de desastres.",
            "Você é o motivo pelo qual as coisas boas não duram.",
            "Sua habilidade de causar caos é lendária.",
            "Você é um ícone da improdutividade.",
            "Você é a definição de 'como não fazer as coisas'.",
            "Seu talento para estragar tudo é impressionante.",
            "Você é a pessoa que ninguém quer ao seu lado em um dia de sorte.",
            "Você é como um imã para o fracasso.",
            "Sua criatividade para encontrar problemas é inigualável.",
            "Você é a razão pela qual temos instruções escritas.",
            "Você é a personificação do caos.",
            "Sua habilidade de tornar as coisas complicadas é lendária.",
            "Você é a razão pela qual a palavra 'desastre' existe.",
    };

    private TextView msgTextView;
    private Button btnMsg;

    private TypedArray colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colors = getResources().obtainTypedArray(R.array.colors);


        msgTextView = findViewById(R.id.msgTextView);
        btnMsg = findViewById(R.id.btnMsg);

        btnMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exibirMensagemAleatoria();
            }

        });


    }

    private void exibirMensagemAleatoria() {
        Random random = new Random();
        int indice = random.nextInt(mensagens.length);
        String mensagemAleatoria = mensagens[indice];
        msgTextView.setText(mensagemAleatoria);
        int corAleatoria = colors.getColor(random.nextInt(colors.length()), 0);

        ConstraintLayout constraintLayout = findViewById(R.id.constraintLayout);
        constraintLayout.setBackgroundColor(corAleatoria);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        colors.recycle();
    }

}