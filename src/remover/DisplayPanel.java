package remover;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DisplayPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel title;
	private JLabel input;
	private JLabel inputsuffix;
	private JLabel outputsuffixL;
	private JButton comfirm;
	private JTextField inputpath;
	private JTextField sourcesuffix;
	private JTextField outputsuffix;
	
	public DisplayPanel() {
		setLayout(null);
		
		this.title = new JLabel("File replacer");
		this.title.setLocation(320,50);
		this.title.setSize(640,150);
		this.title.setFont(new Font("Arial",1,45));
		this.title.setVisible(true);
		this.add(this.title);
		
		this.input = new JLabel("Input the path you want to replace:");
		this.input.setLocation(50,250);
		this.input.setSize(350,50);
		this.input.setFont(new Font("Arial",1,20));
		this.input.setVisible(true);
		this.add(this.input);
		
		this.inputsuffix = new JLabel("Input your target file path:");
		this.inputsuffix.setLocation(50,350);
		this.inputsuffix.setSize(450,50);
		this.inputsuffix.setFont(new Font("Arial",1,20));
		this.inputsuffix.setVisible(true);
		this.add(this.inputsuffix);
		
//		this.outputsuffixL = new JLabel("Please input your target suffix:");
//		this.outputsuffixL.setLocation(50,450);
//		this.outputsuffixL.setSize(450,50);
//		this.outputsuffixL.setFont(new Font("Arial",1,25));
//		this.outputsuffixL.setVisible(true);
//		this.add(this.outputsuffixL);
		
		this.inputpath = new JTextField("");
		this.inputpath.setLocation(640,250);
		this.inputpath.setSize(500,50);
		this.inputpath.setFont(new Font("Arial",1,20));
		this.inputpath.setVisible(true);
		this.add(this.inputpath);
		
		this.sourcesuffix = new JTextField("");
		this.sourcesuffix.setLocation(640,350);
		this.sourcesuffix.setSize(350,50);
		this.sourcesuffix.setFont(new Font("Arial",1,20));
		this.sourcesuffix.setVisible(true);
		this.add(this.sourcesuffix);
		
//		this.outputsuffix = new JTextField(" ");
//		this.outputsuffix.setLocation(640,450);
//		this.outputsuffix.setSize(350,50);
//		this.outputsuffix.setFont(new Font("Arial",1,50));
//		this.outputsuffix.setVisible(true);
//		this.add(this.outputsuffix);
		
		this.comfirm = new JButton("Comfirm");
		this.comfirm.setLocation(500,550);
		this.comfirm.setSize(280, 100);
		this.comfirm.setVisible(true);
		this.add(this.comfirm);
		
		setSize(1280,720);
	}

	public JLabel getTitle() {
		return title;
	}

	public JLabel getInput() {
		return input;
	}

	public JLabel getInputsuffix() {
		return inputsuffix;
	}

	public JLabel getOutputsuffixL() {
		return outputsuffixL;
	}

	public JButton getComfirm() {
		return comfirm;
	}

	public JTextField getInputpath() {
		return inputpath;
	}

	public JTextField getSourcesuffix() {
		return sourcesuffix;
	}

	public JTextField getOutputsuffix() {
		return outputsuffix;
	}
	
}
