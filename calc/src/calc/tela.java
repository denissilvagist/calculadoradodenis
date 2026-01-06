package calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela {

	private JFrame frmCalculadoraDoDenis;
	private JTextField txtField;
	double numero1;
	double numero2;
	double resultado;
	String operacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frmCalculadoraDoDenis.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraDoDenis = new JFrame();
		frmCalculadoraDoDenis.getContentPane().setBackground(new Color(128, 255, 128));
		frmCalculadoraDoDenis.setIconImage(Toolkit.getDefaultToolkit().getImage(tela.class.getResource("/imagens/1176238.png")));
		frmCalculadoraDoDenis.setTitle("CalcD");
		frmCalculadoraDoDenis.setBounds(100, 100, 233, 366);
		frmCalculadoraDoDenis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraDoDenis.getContentPane().setLayout(null);
		
		txtField = new JTextField();
		txtField.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtField.setBounds(10, 11, 202, 32);
		frmCalculadoraDoDenis.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
			}
		});
		btnC.setFont(new Font("Arial Black", Font.PLAIN, 10));
		btnC.setBounds(170, 54, 42, 43);
		frmCalculadoraDoDenis.getContentPane().add(btnC);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "+";
			}
		});
		btnSoma.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnSoma.setBounds(170, 104, 42, 43);
		frmCalculadoraDoDenis.getContentPane().add(btnSoma);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn9.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn9.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btn9.setBounds(114, 104, 42, 43);
		frmCalculadoraDoDenis.getContentPane().add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn8.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn8.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btn8.setBounds(62, 104, 42, 43);
		frmCalculadoraDoDenis.getContentPane().add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn7.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn7.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btn7.setBounds(10, 104, 42, 43);
		frmCalculadoraDoDenis.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn4.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn4.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btn4.setBounds(10, 158, 42, 43);
		frmCalculadoraDoDenis.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn5.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn5.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btn5.setBounds(62, 158, 42, 43);
		frmCalculadoraDoDenis.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn6.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn6.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btn6.setBounds(114, 158, 42, 43);
		frmCalculadoraDoDenis.getContentPane().add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "-";
			}
		});
		btnSub.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnSub.setBounds(170, 158, 42, 43);
		frmCalculadoraDoDenis.getContentPane().add(btnSub);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn1.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btn1.setBounds(10, 212, 42, 43);
		frmCalculadoraDoDenis.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn2.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btn2.setBounds(62, 212, 42, 43);
		frmCalculadoraDoDenis.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn3.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn3.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btn3.setBounds(114, 212, 42, 43);
		frmCalculadoraDoDenis.getContentPane().add(btn3);
		
		JButton btnMult = new JButton("X");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "x";
			}
		});
		btnMult.setFont(new Font("Arial Black", Font.PLAIN, 10));
		btnMult.setBounds(170, 212, 42, 43);
		frmCalculadoraDoDenis.getContentPane().add(btnMult);
		
		JButton btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btnPonto.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btnPonto.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnPonto.setBounds(10, 266, 42, 43);
		frmCalculadoraDoDenis.getContentPane().add(btnPonto);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn0.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn0.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btn0.setBounds(62, 266, 42, 43);
		frmCalculadoraDoDenis.getContentPane().add(btn0);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero2 = Double.parseDouble(txtField.getText());
				if(operacao.equals("+")) {
					resultado = numero1+numero2;
					txtField.setText(String.valueOf(resultado));
				}else if(operacao.equals("-")) {
					resultado = numero1-numero2;
					txtField.setText(String.valueOf(resultado));
				}else if(operacao.equals("x")) {
					resultado = numero1*numero2;
					txtField.setText(String.valueOf(resultado));
				}else if(operacao.equals("/")) {
					resultado = numero1/numero2;
					txtField.setText(String.valueOf(resultado));
				}
			}
		});
		btnIgual.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnIgual.setBounds(114, 266, 42, 43);
		frmCalculadoraDoDenis.getContentPane().add(btnIgual);
		
		JButton btnDiv = new JButton("÷");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "/";
			}
		});
		btnDiv.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnDiv.setBounds(170, 266, 42, 43);
		frmCalculadoraDoDenis.getContentPane().add(btnDiv);
	}
}
