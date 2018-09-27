
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erberto Sousa
 */
public class Principal {
    public static void main(String[] args) {
		
		int numeroPontos = 150;
		Kruskal k = new Kruskal(numeroPontos);	
		
		JFrame frame;
		frame=new ExibirCaminho(k.getMenorGrafo());
		frame.setVisible(true);
	}
}
