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
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

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
import java.util.ArrayList;
import java.util.List;

import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JCheckBox;

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
	private JTextField textField_TitleFIB;
	private JTextField textField_Question;
	private JTextField textField_AnsFIB;
	private JTextField textField_FinishFIB;
	List<JTextField> fields= new ArrayList<JTextField>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					
				    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				        if ("Nimbus".equals(info.getName())) {
				            UIManager.setLookAndFeel(info.getClassName());
				            break;
				        }
				    }
				} catch (Exception e) {
				    // If Nimbus is not available, you can set the GUI to another look and feel.
				}
					try {
						SoftwareEng frame = new SoftwareEng();
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

//				} catch (Exception e) {
//					e.printStackTrace();
//				}
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
		panel3.setLayout(new MigLayout("", "[grow][grow][grow]", "[][][][][][][][][]"));
		
		final JLabel lblTitleFIB = new JLabel("Title");
		panel3.add(lblTitleFIB, "cell 0 0");
		
		textField_TitleFIB = new JTextField();
		panel3.add(textField_TitleFIB, "cell 2 1,growx");
		textField_TitleFIB.setColumns(10);
		
		JButton btnSavetoTextFIB = new JButton("Save to file");
		btnSavetoTextFIB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {

					String fileName = "C:\\Users\\Declan\\Desktop\\SW";
					PrintWriter outFile = new PrintWriter(fileName + ".txt");
					outFile.write("::" + textField_TitleFIB.getText() + "::");
					outFile.write(textField_Question.getText());
					outFile.write("\n" + "{=" + textField_AnsFIB.getText()
							+ " =" + textField_FinishFIB.getText() + "}");

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
		frame.getContentPane().add(tpane, "grow");
		final JPanel panel2 = new JPanel();

		tpane.addTab("Multiple Choice", null, panel2, "This is enable.");
		panel2.setLayout(new MigLayout("", "[grow][grow][]", "[][][][][][][][][][][][]"));

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
								text = "F";

							String fileName = "C:\\Users\\Declan\\Desktop\\SW";
							PrintWriter outFile = new PrintWriter(fileName + ".txt");
							outFile.write("::" + textField_1.getText() + "::");
							outFile.write(textArea.getText());
							outFile.write("{" + text + "}");

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

			
					
				
		panel2.add(txtQuestionMC, "cell 1 3,grow");

		txtCorrectAnsMC = new JTextField();
		panel2.add(txtCorrectAnsMC, "cell 1 5,growx");
		txtCorrectAnsMC.setColumns(10);

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
				panel2.add(btnSaveFileMC, "cell 0 11");
				
				
				JButton btnNewButton = new JButton("New button");
				btnNewButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						JTextField newTextField = new JTextField();
					    // add it to the container
					    panel2.add(newTextField);
					    newTextField.setSize(10, 10);
					   panel2.updateUI();
					}
				});
				
				
				
	
				
				panel2.add(btnNewButton, "cell 1 11,alignx center");
				
				JButton btnDeleteMC = new JButton("Delete");
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
				panel2.add(btnDeleteMC, "cell 2 11");

		frame.setSize(500, 500);
		frame.setVisible(true);
	}

}
