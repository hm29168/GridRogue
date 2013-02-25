import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IOGUI extends JFrame implements ActionListener{

	JPanel pane = new JPanel();
	JButton clear = new JButton("Clear Saved Text");
	JTextField input = new JTextField(40);
	JScrollPane scrollPane = new JScrollPane();
	JTextArea textArea = new JTextArea(14, 40);
	GridBagConstraints areaC = new GridBagConstraints();
	

	public static void main(){
		
	}
	
	IOGUI() // the frame constructor
	{
		super("Input/Output GUI");
		scrollPane.add(textArea);
		textArea.setEditable(false);
		textArea.setBounds(10,50,400,400);
		setResizable(false);
		input.addActionListener(this);
		areaC.fill = GridBagConstraints.VERTICAL;
		setBounds(550, 0, 500, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane(); // inherit main frame
		con.add(pane); // JPanel containers default to FlowLayout
		//pressme.setMnemonic('P'); // associate hotkey to button
		pane.add(input);
		pane.add(scrollPane);
		pane.add(textArea);
        pane.add(clear);
		clear.requestFocus();
		clear.addActionListener(this);
		setVisible(true); // make frame visible
	}
	
	public void actionPerformed(ActionEvent evt) {
        String text = input.getText();
        textArea.append(text + "\n");
        input.setText("");
        //Make sure the new text is visible, even if there
        //was a selection in the text area.
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }

}
