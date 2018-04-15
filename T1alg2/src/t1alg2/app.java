package t1alg2;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;



public class app {
	
	public static void main(String[] args) {
		
	Texto.carregaTestes();
	GerenciadorQuadrados.criaQuadrados();
	System.out.println(GerenciadorQuadrados.listartodas());
	GerenciadorQuadrados.contaCores();
		

		
	}

	
		
	
}
