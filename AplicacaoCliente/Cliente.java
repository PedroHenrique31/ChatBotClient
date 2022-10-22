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
		mensagemEnviar.println(textoEnviar);
		
		
		
	}

}
