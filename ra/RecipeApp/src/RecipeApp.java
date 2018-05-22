import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class RecipeApp {

	private JFrame frame;
	private JTextField txtSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecipeApp window = new RecipeApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RecipeApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 702, 645);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 684, 598);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnMenu = new JButton("menu");
		btnMenu.setBounds(12, 13, 97, 25);
		panel.add(btnMenu);
		
		txtSearch = new JTextField();
		txtSearch.setText("search");
		txtSearch.setBounds(499, 14, 116, 22);
		panel.add(txtSearch);
		txtSearch.setColumns(10);
		
		JLabel lblRecipes = new JLabel("Recipes!");
		lblRecipes.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblRecipes.setBounds(271, 42, 265, 99);
		panel.add(lblRecipes);
		
		JButton btnPancakes = new JButton("pancakes");
		btnPancakes.setBounds(435, 316, 237, 282);
		panel.add(btnPancakes);
		
		JButton btnMashedPotatoes = new JButton("mashed potatoes");
		btnMashedPotatoes.setBounds(0, 342, 245, 256);
		panel.add(btnMashedPotatoes);
		
		JButton btnPasta = new JButton("pasta");
		btnPasta.setBounds(240, 293, 200, 305);
		panel.add(btnPasta);
		
		JButton btnSaladDressing = new JButton("salad dressing");
		btnSaladDressing.setBounds(435, 154, 237, 162);
		panel.add(btnSaladDressing);
		
		JButton btnSauces = new JButton("sauces");
		btnSauces.setBounds(0, 151, 239, 189);
		panel.add(btnSauces);
		
		JButton btnSalad = new JButton("salad");
		btnSalad.setBounds(240, 175, 200, 121);
		panel.add(btnSalad);
	}
}
