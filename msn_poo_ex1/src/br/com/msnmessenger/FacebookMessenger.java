package br.com.msnmessenger;

public class FacebookMessenger {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem Facebook");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook");
    }
    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet...");
    }
    private void  salvarHistoricoMensagem(){
        System.out.println("Salvando histórico das mensagens...");
    }
}
