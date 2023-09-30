package br.com.msnmessenger;

public class Telegram {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram...");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Telegram...");
    }
    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet...");
    }
    private void  salvarHistoricoMensagem(){
        System.out.println("Salvando histórico das mensagens...");
    }
}
