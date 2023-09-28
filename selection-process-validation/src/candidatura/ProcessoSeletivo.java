package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for(String candidato:candidatos){
            entrandoEmContado(candidato);
        }
    }

    static void entrandoEmContado(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuaTentando = !atendeu;
            if(continuaTentando) {
                tentativasRealizadas ++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO!!");
            }
        }while (continuaTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguimos com contato com " + candidato + " na " + tentativasRealizadas + "ª tentativa!!");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ". Foram realizadas " + tentativasRealizadas + " tentativas!!");
        }
    }

    //Método Auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento!!");

        for(int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de nº" + (i + 1) + " é o " + candidatos[i]);
        }

        System.out.println("Forma abreviada da iteração foreach\n");

        for(String candidato:candidatos) {
            System.out.println("O candidato selecionado é o " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {
                "FELIPE", "MARCIA", "JULIA", "PAULO", "MÔNICA", "FABRICIO", "MIRELLA", "DANIELA", "JORGE"
        };

        int selectedCandidates = 0;
        double baseSalary = 2000.0;
        int currentCandidates = 0;
        while(selectedCandidates < 5) {
            String candidate = candidatos[currentCandidates];
            double desiredSalary = intendedValue();

            System.out.println("O candidato" + candidate + " solicitou R$" + desiredSalary + " como salário pretendido!!");
            if (baseSalary >= desiredSalary){
                System.out.println("O candidato " + candidate + " foi selecionado para a vaga");
            }
        }
    }

    static double intendedValue() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");

        }
    }
}
