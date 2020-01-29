import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Botten extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Botten frame = new Botten();
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
	public Botten() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Botten = new JButton("終了");
		Botten.setBounds(265, 113, 126, 38);
		contentPane.add(Botten);
		
		JLabel label = new JLabel("");
		label.setBounds(5, 5, 0, 268);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("開始");
		btnNewButton.setBounds(85, 113, 117, 38);
		contentPane.add(btnNewButton);
		Botten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Time.Timeset();
			}
		});
	}
}
