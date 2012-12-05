package SW;

import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Label;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JSpinner;

public class SoftwareEng extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtTitleMC;
	private JTextField txtCorrectAnsMC;
	private JTextField txtAnswer2MC;
	private JTextField txtAnswer3MC;
	private JTextField txtAnswer4MC;
	private JTextField textField_MatchingA;
	private JTextField textField_MatchingA1;
	private JTextField textField_MatchingB;
	private JTextField textField_MatchingB1;
	private JTextField textField_MatchingC;
	private JTextField textField_MatchingC1;
	private JTextField textField_MatchingQT;
	private JTextField textField_MatchingQuestion;

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
	 * 
	 * @throws FileNotFoundException
	 */
	public SoftwareEng() throws FileNotFoundException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JFrame frame = new JFrame();
		frame.getContentPane().setLayout(new MigLayout("", "[grow]", "[grow]"));

		JPanel panel = new JPanel();
		JPanel panel3 = new JPanel();

		JTabbedPane tpane = new JTabbedPane();
		tpane.addTab("True or False", null, panel, "This is enable.");
		panel.setLayout(new MigLayout("", "[grow][grow]", "[][][][][]"));

		JLabel lblQuestion = new JLabel("Title");
		panel.add(lblQuestion, "cell 0 0");

		textField_1 = new JTextField();
		panel.add(textField_1, "cell 1 1,growx");
		textField_1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Question");
		panel.add(lblNewLabel_1, "cell 0 2");

		final JTextArea textArea = new JTextArea();
		textArea.setRows(5);
		panel.add(textArea, "cell 1 3,grow");

		ButtonGroup group = new ButtonGroup();

		JButton btnSaveTrueOrFalse = new JButton("Save to file");
		final JRadioButton rdbtnNewRadioButton = new JRadioButton("True");
		panel.add(rdbtnNewRadioButton, "flowx,cell 1 4");

		final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("False");
		panel.add(rdbtnNewRadioButton_1, "cell 1 4");

		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton);
		btnSaveTrueOrFalse.addMouseListener(new MouseAdapter() {
			// final JTextArea textArea = new JTextArea();
			public void mouseClicked(MouseEvent arg0) {
				// BufferedWriter outFile = null;

				try {
					String shit = "";
					if (rdbtnNewRadioButton.isEnabled()) {
						shit = "T";
					} else if (rdbtnNewRadioButton_1.isEnabled()) {
						shit = "F";
					} else
						shit = "F";

					String fileName = "C:\\Users\\Declan\\Desktop\\SW";
					PrintWriter outFile = new PrintWriter(fileName + ".txt");
					outFile.write("::" + textField_1.getText() + "::");
					outFile.write(textArea.getText());
					outFile.write("{" + shit + "}");

					// textArea.write(outFile);
					outFile.close();

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		panel.add(btnSaveTrueOrFalse, "cell 0 4");
		textArea.setRows(5);
		JPanel panel4 = new JPanel();
		tpane.addTab("Matching", null, panel4, "This is enable.");
		panel4.setLayout(new MigLayout("", "[][][][][grow][][][][][grow][]",
				"[][][][][][][][][][][]"));

		JLabel lblMatchingQT = new JLabel("Question Title");
		panel4.add(lblMatchingQT, "cell 1 0");

		textField_MatchingQT = new JTextField();
		panel4.add(textField_MatchingQT, "cell 4 0 6 1,growx");
		textField_MatchingQT.setColumns(10);

		JLabel lblMatchingQuestion = new JLabel("Question");
		panel4.add(lblMatchingQuestion, "cell 1 1");

		textField_MatchingQuestion = new JTextField();
		panel4.add(textField_MatchingQuestion, "cell 4 1 6 1,growx");
		textField_MatchingQuestion.setColumns(10);

		JLabel lblMatchingA = new JLabel("A");
		panel4.add(lblMatchingA, "cell 2 3,alignx trailing");

		textField_MatchingA = new JTextField();
		panel4.add(textField_MatchingA, "cell 4 3,growx");
		textField_MatchingA.setColumns(10);

		JLabel lblMatchingA1 = new JLabel("A");
		panel4.add(lblMatchingA1, "cell 7 3");

		textField_MatchingA1 = new JTextField();
		panel4.add(textField_MatchingA1, "cell 9 3,growx");
		textField_MatchingA1.setColumns(10);

		JLabel lblBMatching = new JLabel("B");
		panel4.add(lblBMatching, "cell 2 5");

		textField_MatchingB = new JTextField();
		panel4.add(textField_MatchingB, "cell 4 5,growx");
		textField_MatchingB.setColumns(10);

		JLabel lblB1Matching = new JLabel("B");
		panel4.add(lblB1Matching, "cell 7 5");

		textField_MatchingB1 = new JTextField();
		panel4.add(textField_MatchingB1, "cell 9 5,growx");
		textField_MatchingB1.setColumns(10);

		JLabel lblCMatching = new JLabel("C");
		panel4.add(lblCMatching, "cell 2 7");

		textField_MatchingC = new JTextField();
		panel4.add(textField_MatchingC, "cell 4 7,growx");
		textField_MatchingC.setColumns(10);

		JLabel lblC1Matching = new JLabel("C");
		panel4.add(lblC1Matching, "cell 7 7");

		textField_MatchingC1 = new JTextField();
		panel4.add(textField_MatchingC1, "cell 9 7,growx");
		textField_MatchingC1.setColumns(10);

		JButton btnMatchingSaveBtn = new JButton("Save to file");
		btnMatchingSaveBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {

					String fileName = "C:\\Users\\Declan\\Desktop\\SW";
					PrintWriter outFile = new PrintWriter(fileName + ".txt");
					outFile.write("::" + textField_MatchingQT.getText() + "::");
					outFile.write(textField_MatchingQuestion.getText());
					outFile.write("\n" + "{=" + textField_MatchingA.getText()
							+ "->" + textField_MatchingA1.getText() + " ="
							+ textField_MatchingB.getText() + "-> "
							+ textField_MatchingB1.getText() + "="
							+ textField_MatchingC.getText() + "->"
							+ textField_MatchingC1.getText() + " =" + "}");

					// textArea.write(outFile);
					outFile.close();

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		panel4.add(btnMatchingSaveBtn, "cell 1 10");

		tpane.addTab("Fill In the Blanks", null, panel3, "This is enable.");
		frame.getContentPane().add(tpane, "grow");
		JPanel panel2 = new JPanel();

		tpane.addTab("Multiple Choice", null, panel2, "This is enable.");
		panel2.setLayout(new MigLayout("", "[grow][grow][]",
				"[][][][][][][][][][]"));

		JLabel lblMc = new JLabel("Title");
		panel2.add(lblMc, "cell 0 0");

		txtTitleMC = new JTextField();
		panel2.add(txtTitleMC, "cell 1 1,growx");
		txtTitleMC.setColumns(10);

		JLabel lblNewLabel_Mc = new JLabel("Question");
		panel2.add(lblNewLabel_Mc, "cell 0 2");

		final JTextArea txtQuestionMC = new JTextArea();
		txtQuestionMC.setRows(5);
		textArea.setRows(5);
		panel2.add(txtQuestionMC, "cell 1 3,grow");

		JLabel lblCorrect = new JLabel("CORRECT");
		panel2.add(lblCorrect, "cell 0 5,alignx trailing");

		txtCorrectAnsMC = new JTextField();
		panel2.add(txtCorrectAnsMC, "cell 1 5,growx");
		txtCorrectAnsMC.setColumns(10);

		JLabel lblIncorrect = new JLabel("INCORRECT");
		panel2.add(lblIncorrect, "cell 0 6,alignx trailing");

		txtAnswer2MC = new JTextField();
		panel2.add(txtAnswer2MC, "cell 1 6,growx");
		txtAnswer2MC.setColumns(10);

		txtAnswer3MC = new JTextField();
		panel2.add(txtAnswer3MC, "cell 1 7,growx");
		txtAnswer3MC.setColumns(10);

		txtAnswer4MC = new JTextField();
		panel2.add(txtAnswer4MC, "cell 1 8,growx");
		txtAnswer4MC.setColumns(10);

		final JSpinner Ans1MC = new JSpinner();
		panel2.add(Ans1MC, "cell 2 5");
		final JSpinner Ans2MC = new JSpinner();
		panel2.add(Ans2MC, "cell 2 6");
		final JSpinner Ans3MC = new JSpinner();
		panel2.add(Ans3MC, "cell 2 7");
		final JSpinner Ans4MC = new JSpinner();
		panel2.add(Ans4MC, "cell 2 8");

		JButton btnSaveFileMC = new JButton("Save to file");
		btnSaveFileMC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				try {
					// String shit = "";
					// if (rdbtnNewRadioButton.isEnabled()) {
					// shit = "T";
					// } else if (rdbtnNewRadioButton_1.isEnabled()) {
					// shit = "F";
					// } else
					// shit = "F";

					String fileName = "C:\\Users\\Declan\\Desktop\\SW";
					PrintWriter outFile = new PrintWriter(fileName + ".txt");
					outFile.write("::" + txtTitleMC.getText() + "::");
					outFile.write(txtQuestionMC.getText());
					outFile.write("\n" + "{=%" + Ans1MC.getValue() + "%"
							+ txtCorrectAnsMC.getText() + " " + "~" + "%"
							+ Ans2MC.getValue() + "%" + txtAnswer2MC.getText()
							+ " " + "~" + "%" + Ans3MC.getValue() + "%"
							+ txtAnswer3MC.getText() + " " + "~" + "%"
							+ Ans4MC.getValue() + "%" + txtAnswer4MC.getText()
							+ " \n" + "}");
					// outFile.append( ""+Ans1MC.getValue() );

					// textArea.write(outFile);
					outFile.close();

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}
			}
		});
		panel2.add(btnSaveFileMC, "cell 0 9");

		frame.setSize(500, 500);
		frame.setVisible(true);
	}

}
