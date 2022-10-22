package AplicacaoCliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
                Autores
        Pedro Henrique Carneiro de Araújo 22108287
        
 */


public class Cliente  {

	public static void main(String[] args) {
		Socket socketCliente;
		Scanner leitorTeclado;
		PrintStream mensagemEnviar=null;
		String textoEnviar;
		int porta=8080;
		leitorTeclado=new Scanner(System.in);
		
		try {
			socketCliente=new Socket("localhost",porta);
			mensagemEnviar=new PrintStream(socketCliente.getOutputStream());
		}catch(IOException e) {
			System.out.println("ERRO DE ENTRADA OU SAÍDA!!");
			e.printStackTrace();
		}
		
		
		System.out.println("Digite uma palavra para mandarmos no servidor");
		textoEnviar=leitorTeclado.nextLine();
		//textoEnviar="Frase teste";
		mensagemEnviar.println(textoEnviar);
		
		
		
	}

}

/*
* SOCKET
Utiilizando o modelo cliente/servidor (Socket) criar um MVP de um chatbot.

SERVIDOR

O servidor deverá ter um pequeno dicionário que responderá perguntas de acordo com a mensagem enviada pelos clientes. Caso a mensagem não seja reconhecida, o servidor apresentará uma mensagem solicitando que o cliente escreva o questionamento novamente
e guardará a informação que ele não conseguiu responder de acordo com os critérios definidos mais abaixo.

CLIENTE
O cliente deve ter a possibilidade de encaminhar perguntas quantas forem necessárias.

Para finalizar a conversa, o cliente deve encaminhar a mensagem SAIR. O servidor irá reconhecer o comando e encerrará o conexão entre as partes.
 
Ao final da execução, além de responder as questões mapeadas, o servidor deverá emitir o relatório de questões não respondidas com as informações solicitadas. As informações são: a questão não respondida, o cliente que solicitou a informação, o ip da máquina que mandou o questionamento.

Além disso, deverá contabilizar quantas perguntas ele conseguiu responder.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/

