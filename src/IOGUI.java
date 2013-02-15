import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IOGUI extends JFrame {

	JPanel pane = new JPanel();
	JButton pressme = new JButton("Press Me or hit P");
	JTextField input = new JTextField(40);
	JTextArea textArea = new JTextArea(14, 40);
	GridBagConstraints areaC = new GridBagConstraints();
	

	IOGUI() // the frame constructor
	{
		super("Input/Output GUI");
		textArea.setEditable(false);
		setResizable(false);
		areaC.fill = GridBagConstraints.VERTICAL;
		setBounds(550, 0, 500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane(); // inherit main frame
		con.add(pane); // JPanel containers default to FlowLayout
		//pressme.setMnemonic('P'); // associate hotkey to button
		//pane.add(pressme);
		pane.add(input);
        pane.add(textArea, areaC);
		//pressme.requestFocus();
		setVisible(true); // make frame visible
	}

}
