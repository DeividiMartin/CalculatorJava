package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Calculate extends JFrame {

	private JPanel contentPane;
	private JTextField jTFTela;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculate frame = new Calculate();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculate() {
		CalculadoraProgram  calculadoraPrograma = new CalculadoraProgram();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 293, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnButton_0 = new JButton("0");
		btnButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTFTela.setText(jTFTela.getText() + "0" );
			}
		});
		
		jTFTela = new JTextField();
		jTFTela.setBounds(18, 24, 253, 47);
		contentPane.add(jTFTela);
		jTFTela.setColumns(10);
		btnButton_0.setBounds(12, 340, 120, 53);
		contentPane.add(btnButton_0);
		
		JButton btnButton_1 = new JButton("1");
		btnButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTFTela.setText(jTFTela.getText() + "1" );
	
			}
		});
		btnButton_1.setBounds(12, 275, 54, 53);
		contentPane.add(btnButton_1);
		
		JButton btnButton_2 = new JButton("2");
		btnButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTFTela.setText(jTFTela.getText() + "2" );
			}
		});
		btnButton_2.setBounds(78, 275, 54, 53);
		contentPane.add(btnButton_2);
		
		JButton btnButton_3 = new JButton("3");
		btnButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTFTela.setText(jTFTela.getText() + "3" );
			}
		});
		btnButton_3.setBounds(144, 275, 54, 53);
		contentPane.add(btnButton_3);
		
		JButton btnButton_4 = new JButton("4");
		btnButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTFTela.setText(jTFTela.getText() + "4" );
			}
		});
		btnButton_4.setBounds(12, 216, 54, 53);
		contentPane.add(btnButton_4);
		
		JButton btnButton_5 = new JButton("5");
		btnButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTFTela.setText(jTFTela.getText() + "5" );
			}
		});
		btnButton_5.setBounds(78, 216, 54, 53);
		contentPane.add(btnButton_5);
		
		JButton btnButton_6 = new JButton("6");
		btnButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTFTela.setText(jTFTela.getText() + "6" );
			}
		});
		btnButton_6.setBounds(144, 216, 54, 53);
		contentPane.add(btnButton_6);
		
		JButton btnButton_7 = new JButton("7");
		btnButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTFTela.setText(jTFTela.getText() + "7" );
			}
		});
		btnButton_7.setBounds(12, 151, 54, 53);
		contentPane.add(btnButton_7);
		
		JButton btnButton_8 = new JButton("8");
		btnButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTFTela.setText(jTFTela.getText() + "8" );
			}
		});
		btnButton_8.setBounds(78, 151, 54, 53);
		contentPane.add(btnButton_8);
		
		JButton btnButton_9 = new JButton("9");
		btnButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTFTela.setText(jTFTela.getText() + "9" );
			}
		});
		btnButton_9.setBounds(144, 151, 54, 53);
		contentPane.add(btnButton_9);
		
		JButton btnButton = new JButton(",");
		btnButton.setBounds(144, 340, 54, 53);
		contentPane.add(btnButton);
		
		JButton btnButton_igual =new JButton("=");
		btnButton_igual.setBounds(217, 275, 54, 118);
		contentPane.add(btnButton_igual);
		
		JButton btnButton_Soma = new JButton("+");
		btnButton_Soma.setBounds(218, 216, 53, 53);
		contentPane.add(btnButton_Soma);
		
		JButton btnButton_sub = new JButton("-");
		btnButton_sub.setBounds(218, 151, 53, 53);
		contentPane.add(btnButton_sub);
		
		JButton btnButton_mult = new JButton("*");
		btnButton_mult.setBounds(217, 83, 53, 53);
		contentPane.add(btnButton_mult);
		
		JButton btnButton_div = new JButton("/");
		btnButton_div.setBounds(144, 83, 54, 56);
		contentPane.add(btnButton_div);
		
		JButton btnButton_del = new JButton("c");
		btnButton_del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTFTela.setText("" );
			}
		});
		btnButton_del.setBounds(78, 83, 54, 56);
		contentPane.add(btnButton_del);
		
		JButton btnButton_10_5 = new JButton("");
		btnButton_10_5.setBounds(12, 83, 54, 56);
		contentPane.add(btnButton_10_5);
	}

}
