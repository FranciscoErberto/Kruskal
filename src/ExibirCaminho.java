
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erberto Sousa
 */
public class ExibirCaminho extends JFrame {
    private static final long serialVersionUID = 1L;
	
	ArrayList<Aresta> menorGrafo = new ArrayList<Aresta>();
	
	public ExibirCaminho(ArrayList<Aresta> arrayList) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Algoritmo de Kruskal");
		setSize(900,600);
		setLocationRelativeTo(null);
		setVisible(true);
		setBackground(Color.WHITE);
		setResizable(false);
		this.menorGrafo = arrayList;
		
	}

	public void paint(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		
		for (int i = 0; i < 90; i++) {		
			g.drawLine(i*50, 0, i*50, 600);
		}
		
		for (int i = 0; i < 90; i++) {		
			g.drawLine(0, i*50, 900, i*50);
		}
		
		g.setColor(Color.RED);
		
		for (Aresta aresta : menorGrafo) {
			int x1 = aresta.getU().getX()*50;
			int y1 = aresta.getU().getY()*50;
			
			int x2 = aresta.getV().getX()*50;	
			int y2 = aresta.getV().getY()*50;
			
			g.drawLine(x1, y1, x2, y2);
			
		}
	}
    
}
