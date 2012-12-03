package SW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Label;

public class SoftwareEng extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SoftwareEng frame = new SoftwareEng();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SoftwareEng() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JFrame frame = new JFrame();
		frame.getContentPane()
				.setLayout(new MigLayout("", "[grow]", "[grow]"));

		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();

		JTabbedPane tpane = new JTabbedPane();
		tpane.addTab("True or False", null, panel, "This is enable.");
		panel.setLayout(new MigLayout("", "[fill][grow][][][][][]", "[][20px:n][][][grow][][10px:n][][]"));
		
		JLabel label = new JLabel("Question Title (Optional)");
		panel.add(label, "cell 0 0");
		
		textField = new JTextField();
		panel.add(textField, "cell 1 0,growx");
		textField.setColumns(10);
		
		Label label_1 = new Label("Question");
		panel.add(label_1, "cell 1 3");
		
		JTextArea textArea = new JTextArea();
		panel.add(textArea, "cell 1 4,grow");
		
		JTextArea textArea_1 = new JTextArea();
		panel.add(textArea_1, "cell 1 6 1 3,grow");
		tpane.addTab("Multiple Choice", null, panel2, "This is enable.");
		tpane.addTab("Fill In the Blanks", null, panel3, "This is enable.");
		tpane.addTab("Matching", null, panel4, "This is enable.");
		
		
	
		//tpane.addTab("Fill In the Blanks", null, panel, "This is disable.");
		
		frame.getContentPane().add(tpane, "grow");
		frame.setSize(500, 500);
		frame.setVisible(true);
	}

}
