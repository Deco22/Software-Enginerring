package SW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

<<<<<<< HEAD
import java.io.BufferedWriter;
=======
>>>>>>> a2b29113f2051f498585d8eeeec94e077570fb1b
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SoftwareEng extends JFrame {

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
	private JTextField textField_TitleFIB;
	private JTextField textField_Question;
	private JTextField textField_AnsFIB;
	private JTextField textField_FinishFIB;
	List<JTextField> fields = new ArrayList<JTextField>();
	private JTextField textField_FBA;
	private JTextField textField_FBB;
	private JTextField textField_FBC;
	private JTextField textField_FBD;
	private JTextField textField_MC_Q;
	private JTextField textField_MC_T;
	private JTextField textField_MC_CFA;
	private JTextField textField_MC_CFB;
	private JTextField textField_MC_CFC;
	private JTextField textField_MC_CFD;
	private JTextField textField_FEEDBACKA;
	private JTextField textField_FEEDBACKB;
	private JTextField textField_FEEDBACKC;
	private JTextField textField_FEEDBACKD;
<<<<<<< HEAD
	private JTextField Essay_Title;
	private JTextField Essay_Question;
	String fileName = "C:\\Users\\Declan\\Desktop\\SW.txt";
=======
	private JTextField textField_2;
	private JTextField textField_3;
>>>>>>> a2b29113f2051f498585d8eeeec94e077570fb1b

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//
					for (LookAndFeelInfo info : UIManager
							.getInstalledLookAndFeels()) {
						if ("Nimbus".equals(info.getName())) {
							UIManager.setLookAndFeel(info.getClassName());
							break;
						}
					}
				} catch (Exception e) {
					// If Nimbus is not available, you can set the GUI to
					// another look and feel.
				}
				try {
					SoftwareEng frame = new SoftwareEng();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// } catch (Exception e) {
				// e.printStackTrace();
				// }
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
		JFrame frmDeclanMcgrathGift = new JFrame();
		frmDeclanMcgrathGift.setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\Declan\\Desktop\\moodle-logo-huge (1).png"));
		frmDeclanMcgrathGift.setTitle("Declan McGrath GIFT Editor");
		frmDeclanMcgrathGift.getContentPane().setLayout(
				new MigLayout("", "[grow]", ""));

		final JPanel panel = new JPanel();
		final JPanel panel3 = new JPanel();

		JTabbedPane tpane = new JTabbedPane();
		tpane.addTab("True or False", null, panel, "This is enable.");
		panel.setLayout(new MigLayout("", "[grow][grow]", "[][][][][][]"));

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
		final JRadioButton rdbtnNewRadioButton = new JRadioButton("True");
		panel.add(rdbtnNewRadioButton, "flowx,cell 1 4");

		final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("False");
		panel.add(rdbtnNewRadioButton_1, "cell 1 4");

		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton);
		textArea.setRows(5);
		final JPanel panel2 = new JPanel();

		tpane.addTab("Multiple Choice", null, panel2, "This is enable.");
		panel2.setLayout(new MigLayout("", "[grow][grow][][grow]",
				"[][][][][][][][][][][][][][]"));

		JLabel lblMc = new JLabel("Title");
		panel2.add(lblMc, "cell 0 0");

		txtTitleMC = new JTextField();
		panel2.add(txtTitleMC, "cell 1 1 3 1,growx");
		txtTitleMC.setColumns(10);

		JLabel lblNewLabel_Mc = new JLabel("Question");
		panel2.add(lblNewLabel_Mc, "cell 0 2");

		final JTextArea txtQuestionMC = new JTextArea();
		txtQuestionMC.setRows(5);

		panel2.add(txtQuestionMC, "cell 1 3 3 1,grow");

		JLabel lblAnswerA = new JLabel("Answer A");
		panel2.add(lblAnswerA, "cell 0 5,alignx trailing");

		txtCorrectAnsMC = new JTextField();
		panel2.add(txtCorrectAnsMC, "cell 1 5,growx");
		txtCorrectAnsMC.setColumns(10);

		JLabel lblFeedback = new JLabel("Feedback:");
		panel2.add(lblFeedback, "cell 2 5,alignx trailing");

		textField_FBA = new JTextField();
		panel2.add(textField_FBA, "cell 3 5,growx");
		textField_FBA.setColumns(10);

		JLabel lblAnswerB = new JLabel("Answer B");
		panel2.add(lblAnswerB, "cell 0 6,alignx trailing");

		txtAnswer2MC = new JTextField();
		panel2.add(txtAnswer2MC, "cell 1 6,growx");
		txtAnswer2MC.setColumns(10);

		JLabel lblFeedback2 = new JLabel("Feddback");
		panel2.add(lblFeedback2, "cell 2 6,alignx trailing,growy");

		textField_FBB = new JTextField();
		panel2.add(textField_FBB, "cell 3 6,growx");
		textField_FBB.setColumns(10);

		JLabel lblAnswerC = new JLabel("Answer C");
		panel2.add(lblAnswerC, "cell 0 7,alignx trailing");

		txtAnswer3MC = new JTextField();
		panel2.add(txtAnswer3MC, "cell 1 7,growx");
		txtAnswer3MC.setColumns(10);

		JLabel lblFeedback3 = new JLabel("Feedback");
		panel2.add(lblFeedback3, "cell 2 7,alignx trailing");

		textField_FBC = new JTextField();
		panel2.add(textField_FBC, "cell 3 7,growx");
		textField_FBC.setColumns(10);

		JLabel lblAnswerD = new JLabel("Answer D");
		panel2.add(lblAnswerD, "cell 0 8,alignx trailing");

		txtAnswer4MC = new JTextField();
		panel2.add(txtAnswer4MC, "cell 1 8,growx");
		txtAnswer4MC.setColumns(10);

		JButton btnSaveFileMC = new JButton("Save to file");
		btnSaveFileMC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				try {

					BufferedWriter outFile = new BufferedWriter(new FileWriter(
							fileName, true));
					outFile.write("\r\n");
					outFile.write("::" + txtTitleMC.getText() + "::");
					outFile.write(txtQuestionMC.getText());
					outFile.write("{" + " " + "=" + txtCorrectAnsMC.getText()
							+ " " + "#" + " " + textField_FBA.getText() + " "
							+ "~" + txtAnswer2MC.getText() + " " + "#" + " "
							+ textField_FBB.getText() + " " + "~"
							+ txtAnswer3MC.getText() + " " + "#" + " "
							+ textField_FBC.getText() + " " + "~"
							+ txtAnswer4MC.getText() + " " + "#" + " "
							+ textField_FBD.getText() + " " + "}");
					// outFile.append( ""+Ans1MC.getValue() );

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

		JLabel lblFeddback4 = new JLabel("Feedback");
		panel2.add(lblFeddback4, "cell 2 8,alignx trailing");

		textField_FBD = new JTextField();
		panel2.add(textField_FBD, "cell 3 8,growx");
		textField_FBD.setColumns(10);
		panel2.add(btnSaveFileMC, "cell 0 13");

		JButton btnDeleteMC = new JButton("Delete");
		btnDeleteMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				textField_FBA.setText("");
				textField_FBB.setText("");
				textField_FBC.setText("");
				textField_FBD.setText("");

			}
		});
		btnDeleteMC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtAnswer2MC.setText("");
				txtAnswer3MC.setText("");
				txtAnswer4MC.setText("");
				txtCorrectAnsMC.setText("");
				txtQuestionMC.setText("");
				txtTitleMC.setText("");
			}
		});
		panel2.add(btnDeleteMC, "cell 3 13");
		final JPanel panel4 = new JPanel();
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

		JCheckBox chckbxDeleteA = new JCheckBox("Delete");
		chckbxDeleteA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField_MatchingA.setText("");
				textField_MatchingA1.setText("");
			}
		});
		panel4.add(chckbxDeleteA, "cell 10 3");

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

		JCheckBox chckbxDeleteB = new JCheckBox("Delete");
		chckbxDeleteB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField_MatchingB.setText("");
				textField_MatchingB1.setText("");
			}
		});
		panel4.add(chckbxDeleteB, "cell 10 5");

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

					BufferedWriter outFile = new BufferedWriter(new FileWriter(
							fileName, true));
					outFile.write("\r\n");
					outFile.write("::" + textField_MatchingQT.getText() + "::");
					outFile.write(textField_MatchingQuestion.getText());
					outFile.write("\n" + "{=" + textField_MatchingA.getText()
							+ " " + "->" + " " + textField_MatchingA1.getText()
							+ " =" + textField_MatchingB.getText() + "-> "
							+ textField_MatchingB1.getText() + "="
							+ textField_MatchingC.getText() + "->"
							+ textField_MatchingC1.getText() + " =" + "}");

					// textArea.write(outFile);
					outFile.close();

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}

			}
		});

		JCheckBox chckbxDeleteC = new JCheckBox("Delete");
		chckbxDeleteC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField_MatchingC.setText("");
				textField_MatchingC1.setText("");
			}
		});
		panel4.add(chckbxDeleteC, "cell 10 7");
		panel4.add(btnMatchingSaveBtn, "cell 1 10");

		tpane.addTab("Fill In the Blanks", null, panel3, "This is enable.");
		panel3.setLayout(new MigLayout("", "[grow][grow][grow]",
				"[][][][][][][][][]"));

		final JLabel lblTitleFIB = new JLabel("Title");
		panel3.add(lblTitleFIB, "cell 0 0");

		JButton btnSavetoTextFIB = new JButton("Save to file");
		btnSavetoTextFIB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {

					// String fileName = "C:\\Users\\Declan\\Desktop\\SW";

					BufferedWriter outFile = new BufferedWriter(new FileWriter(
							fileName, true));
					outFile.write("\r\n");
					outFile.write("::" + textField_TitleFIB.getText() + "::");
					outFile.write(textField_Question.getText());
					outFile.write("\n" + "{=" + textField_AnsFIB.getText()
							+ " =" + textField_FinishFIB.getText() + "}");

					// textArea.write(outFile);
					outFile.close();

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}

			}
		});

		textField_TitleFIB = new JTextField();
		panel3.add(textField_TitleFIB, "cell 0 1 2 1,growx");
		textField_TitleFIB.setColumns(10);

		JLabel lblQuestionFIB = new JLabel("Question");
		lblQuestionFIB.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		panel3.add(lblQuestionFIB, "cell 1 3,alignx center");

		textField_Question = new JTextField();
		panel3.add(textField_Question, "cell 0 5,growx");
		textField_Question.setColumns(10);

		textField_AnsFIB = new JTextField();
		panel3.add(textField_AnsFIB, "cell 1 5,growx");
		textField_AnsFIB.setColumns(10);

		textField_FinishFIB = new JTextField();
		panel3.add(textField_FinishFIB, "cell 2 5,growx");
		textField_FinishFIB.setColumns(10);

		panel3.add(btnSavetoTextFIB, "cell 0 8");

		final JButton btnDeleteAllFIB = new JButton("Delete ");
		btnDeleteAllFIB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				textField_TitleFIB.setText("");
				textField_AnsFIB.setText("");
				textField_FinishFIB.setText("");
				textField_Question.setText("");

			}
		});
		panel3.add(btnDeleteAllFIB, "cell 2 8,alignx right");
		frmDeclanMcgrathGift.getContentPane().add(tpane, "grow");
		textArea.setRows(5);

		JButton btnSaveTrueOrFalse = new JButton("Save to file");
		btnSaveTrueOrFalse.addMouseListener(new MouseAdapter() {
			// final JTextArea textArea = new JTextArea();
			public void mouseClicked(MouseEvent arg0) {
				// BufferedWriter outFile = null;

				try {
					String text = "";
					if (rdbtnNewRadioButton.isEnabled()) {
						text = "T";
					} else if (rdbtnNewRadioButton_1.isEnabled()) {
						text = "F";
					} else
						text = "";

					// String fileName = "C:\\Users\\Declan\\Desktop\\SW";

					BufferedWriter outFile = new BufferedWriter(new FileWriter(
							fileName, true));
					outFile.write("\r\n");
					outFile.write("::" + textField_1.getText() + "::");
					outFile.write(textArea.getText());
					outFile.write("{" + text + "}");

					// textArea.write(outFile);
					outFile.close();

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}
			}
		});
		panel.add(btnSaveTrueOrFalse, "cell 0 5");

		JButton btnAddQuestion = new JButton("Delete All");
		btnAddQuestion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textArea.setText("");
				textField_1.setText("");

			}
		});
		panel.add(btnAddQuestion, "cell 1 5,alignx right");

		final JPanel panel6 = new JPanel();
		tpane.addTab("Essay", null, panel6, "This is enable.");
		panel6.setLayout(new MigLayout("", "[][][][][grow][][][][][grow][]",
				"[][][][][][][][][][][]"));

		JLabel lblNewLabel = new JLabel("Title");
		panel6.add(lblNewLabel, "cell 0 0");

<<<<<<< HEAD
		Essay_Title = new JTextField();
		panel6.add(Essay_Title, "cell 4 1 3 1,growx");
		Essay_Title.setColumns(10);
=======
		textField_2 = new JTextField();
		panel6.add(textField_2, "cell 4 1 3 1,growx");
		textField_2.setColumns(10);
>>>>>>> a2b29113f2051f498585d8eeeec94e077570fb1b

		JLabel lblNewLabel_2 = new JLabel("Question");
		panel6.add(lblNewLabel_2, "cell 0 3");

<<<<<<< HEAD
		Essay_Question = new JTextField();
		panel6.add(Essay_Question, "cell 4 3 3 2,growx");
		Essay_Question.setColumns(10);
=======
		textField_3 = new JTextField();
		panel6.add(textField_3, "cell 4 3 3 2,growx");
		textField_3.setColumns(10);
>>>>>>> a2b29113f2051f498585d8eeeec94e077570fb1b

		JButton btnNewButton = new JButton("Save to file");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				try {

<<<<<<< HEAD
					BufferedWriter outFile = new BufferedWriter(new FileWriter(
							fileName, true));
					outFile.write("\r\n");
					outFile.write("::" + Essay_Title.getText() + "::");
					outFile.write(Essay_Question.getText());
=======
					String fileName = "C:\\Users\\Declan\\Desktop\\SW";
					PrintWriter outFile = new PrintWriter(fileName + ".txt");
					outFile.write("::" + textField_2.getText() + "::" + " ");
					outFile.write(textField_3.getText());
>>>>>>> a2b29113f2051f498585d8eeeec94e077570fb1b
					outFile.write("{}");

					// textArea.write(outFile);
					outFile.close();

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

<<<<<<< HEAD
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
=======
>>>>>>> a2b29113f2051f498585d8eeeec94e077570fb1b
				}
			}
		});
		panel6.add(btnNewButton, "cell 0 7");

		JButton btnNewButton_1 = new JButton("Delete All");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
<<<<<<< HEAD
				Essay_Title.setText("");
				Essay_Question.setText("");
=======
				textField_2.setText("");
				textField_3.setText("");
>>>>>>> a2b29113f2051f498585d8eeeec94e077570fb1b

			}
		});
		panel6.add(btnNewButton_1, "cell 7 7");

		final JPanel panel5 = new JPanel();

		tpane.addTab("Multiple Choice 2", null, panel5, "This is enable.");
		panel5.setLayout(new MigLayout("", "[grow][grow][][grow][][]",
				"[][][][][][][][][][][][]"));

		JLabel lblTitleMC_CF = new JLabel("Title");
		panel5.add(lblTitleMC_CF, "cell 0 0");

		textField_MC_Q = new JTextField();
		panel5.add(textField_MC_Q, "cell 1 1 3 1,growx");
		textField_MC_Q.setColumns(10);

		JLabel lblQuestion_MC_CF = new JLabel("Question");
		panel5.add(lblQuestion_MC_CF, "cell 0 2");

		textField_MC_T = new JTextField();
		panel5.add(textField_MC_T, "cell 1 3 3 1,growx");
		textField_MC_T.setColumns(10);

		JLabel lblAnswerA_MC_CF = new JLabel("Answer A");
		panel5.add(lblAnswerA_MC_CF, "cell 0 6,alignx trailing");

		textField_MC_CFA = new JTextField();
		panel5.add(textField_MC_CFA, "cell 1 6,growx");
		textField_MC_CFA.setColumns(10);

		JLabel lblNewLabel_FeedBack_A = new JLabel("Feedback");
		panel5.add(lblNewLabel_FeedBack_A, "cell 2 6,alignx trailing");

		textField_FEEDBACKA = new JTextField();
		panel5.add(textField_FEEDBACKA, "cell 3 6,growx");
		textField_FEEDBACKA.setColumns(10);

		final JSpinner spinner_MC_A = new JSpinner();
		panel5.add(spinner_MC_A, "cell 5 6");

		JLabel lblAnswerB_MC_CF = new JLabel("Answer B");
		panel5.add(lblAnswerB_MC_CF, "cell 0 7,alignx trailing");

		textField_MC_CFB = new JTextField();
		panel5.add(textField_MC_CFB, "cell 1 7,growx");
		textField_MC_CFB.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Feedback");
		panel5.add(lblNewLabel_6, "cell 2 7,alignx trailing");

		textField_FEEDBACKB = new JTextField();
		panel5.add(textField_FEEDBACKB, "cell 3 7,growx");
		textField_FEEDBACKB.setColumns(10);

		final JSpinner spinner_MC_B = new JSpinner();
		panel5.add(spinner_MC_B, "cell 5 7");

		JLabel lblAnswerC_MC_CF = new JLabel("Answer C");
		panel5.add(lblAnswerC_MC_CF, "cell 0 8,alignx trailing");

		textField_MC_CFC = new JTextField();
		panel5.add(textField_MC_CFC, "cell 1 8,growx");
		textField_MC_CFC.setColumns(10);

		JLabel lblNewLabel_FeedBack_C = new JLabel("Feedback");
		panel5.add(lblNewLabel_FeedBack_C, "cell 2 8,alignx trailing");

		textField_FEEDBACKC = new JTextField();
		panel5.add(textField_FEEDBACKC, "cell 3 8,growx");
		textField_FEEDBACKC.setColumns(10);

		final JSpinner spinner_MC_C = new JSpinner();
		panel5.add(spinner_MC_C, "cell 5 8");

		JLabel lblAnswerD_MC_CF = new JLabel("Answer D");
		panel5.add(lblAnswerD_MC_CF, "cell 0 9,alignx trailing");

		textField_MC_CFD = new JTextField();
		panel5.add(textField_MC_CFD, "cell 1 9,growx");
		textField_MC_CFD.setColumns(10);

		JLabel lblNewLabel_FeedBack_D = new JLabel("Feedback");
		panel5.add(lblNewLabel_FeedBack_D, "cell 2 9,alignx trailing");

		textField_FEEDBACKD = new JTextField();
		panel5.add(textField_FEEDBACKD, "cell 3 9,growx");
		textField_FEEDBACKD.setColumns(10);

		final JSpinner spinner_MC_D = new JSpinner();
		panel5.add(spinner_MC_D, "cell 5 9");

		JButton btnMC_FC = new JButton("Save to file");
		btnMC_FC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {

					// String fileName = "C:\\Users\\Declan\\Desktop\\SW";

					BufferedWriter outFile = new BufferedWriter(new FileWriter(
							fileName, true));
					outFile.write("\r\n");
					outFile.write("::" + textField_MC_Q.getText() + "::" + " ");
					outFile.write(textField_MC_T.getText());
					outFile.write("\n" + "{#" + " \r" + "\n " + "="
							+ textField_MC_CFA.getText() + ":" + "%"
							+ spinner_MC_A.getValue() + "%" + "\t" + "#" + " "
							+ textField_FEEDBACKA.getText() + "\r" + "\n"
							+ " =" + "%" + spinner_MC_B.getValue() + "%"
							+ textField_MC_CFB.getText() + "\t" + "#" + " "
							+ textField_FEEDBACKB.getText() + "\r" + "\n"
							+ " =" + "%" + spinner_MC_C.getValue() + "%"
							+ textField_MC_CFC.getText() + "\t" + "#" + " "
							+ textField_FEEDBACKC.getText() + "\r" + "\n" + "="
							+ "%" + spinner_MC_D.getValue() + "%"
							+ textField_MC_CFD.getText() + "\t" + "#"
							+ textField_FEEDBACKD.getText() + "\r" + "\n" + "}");

					// textArea.write(outFile);
					outFile.close();

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}
			}
		});
		panel5.add(btnMC_FC, "cell 0 11");

		JButton btnDeletALLMC = new JButton("Delete All");
		btnDeletALLMC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				textField_MC_Q.setText("");
				textField_MC_T.setText("");
				textField_FEEDBACKA.setText("");
				textField_FEEDBACKB.setText("");
				textField_FEEDBACKC.setText("");
				textField_FEEDBACKD.setText("");
				textField_MC_CFA.setText("");
				textField_MC_CFB.setText("");
				textField_MC_CFC.setText("");
				textField_MC_CFD.setText("");

			}
		});
		panel5.add(btnDeletALLMC, "cell 5 11");

		frmDeclanMcgrathGift.setSize(600, 600);
		frmDeclanMcgrathGift.setVisible(true);
	}

}
