package BorderLayoutJFrame;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExercicioBorderLayout extends JFrame {

    
    public ExercicioBorderLayout() {
        
	//Paineis
	JPanel A = new JPanel();
        JPanel B = new JPanel();
        JPanel C = new JPanel();
        JPanel D = new JPanel();
        JPanel E = new JPanel();
        
	//Botoes
	JButton B1 = new JButton ("Botão 1");
        JButton B2 = new JButton ("Botão 2");
        JButton B3 = new JButton ("Botão 3");
        JButton B4 = new JButton ("Botão 4");
        JButton B5 = new JButton ("           Botão 5           ");
        JButton B6 = new JButton ("           Botão 6           ");
        JButton B7 = new JButton ("           Botão 7           ");
        JButton B8 = new JButton ("           Botão 8           ");
        JButton B9 = new JButton ("Botão 9");
        JButton B0 = new JButton ("Botão 0");
        
	//Localização de cada Painel
	JLabel L1 = new JLabel("                                                                        Parte Sul");
        JLabel L2 = new JLabel("                     Parte Central");
        JLabel L3 = new JLabel("            Parte Oeste");
        JLabel L4 = new JLabel("            Parte Leste");
        JLabel L5 = new JLabel("                                                                      Parte Norte");
        
	//Layouts
	BorderLayout N = new BorderLayout();
        BorderLayout S = new BorderLayout();
        BorderLayout L = new BorderLayout();
        BorderLayout O = new BorderLayout();
        BorderLayout CENTRO = new BorderLayout();
        
	//Propriedades
        super.setTitle("Exercicio Programação ");
        
        A.setLayout(N);
        A.add(B1, N.NORTH);
        A.add(B2, N.SOUTH);
        A.add(L5, N.CENTER);
        add(A, N.NORTH);//Norte
        
        B.setLayout(S);
        B.add(B3, S.NORTH);
        B.add(B4, S.SOUTH);
        B.add(L1, S.CENTER);
        add(B, S.SOUTH);//Sul
        
        C.setLayout(L);
        C.add(B5, L.NORTH);
        C.add(B6, L.SOUTH);
        C.add(L4, L.CENTER);
        add(C, L.EAST);//Leste
        
        D.setLayout(O);
        D.add(B7, O.NORTH);
        D.add(B8, O.SOUTH);
        D.add(L3, O.CENTER);
        add(D, O.WEST);//Oeste
        
        E.setLayout(CENTRO);
        E.add(B9, CENTRO.NORTH);
        E.add(B0, CENTRO.SOUTH);
        E.add(L2, CENTRO.CENTER);
        add(E, CENTRO.CENTER);//Centro
        
        
        
   }
	//Execução do Aplicativo java
      public static void main(String args[]) {
        ExercicioBorderLayout B = new ExercicioBorderLayout();
        B.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        B.setSize(500,250); 
        B.setVisible(true);
    }

}
