/**
 * 
 * @author Kevin
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Cycle {
	static double numberOfWheels;
	static double weight;
		
	public Cycle(double numberOfWheels,  double weight) { // constructor
			this.numberOfWheels=numberOfWheels;
			this.weight=weight;
	}
		
	public String toString() { // to string
		return "Cycle [numberOfWheels=" + numberOfWheels + ", weight=" + weight + "]";
	}

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		String fileName = "Cycle.txt";
		File file = new File(fileName);

		PrintWriter output = null;
		
		try { // try catch methods
			output = new PrintWriter(fileName);
			}
		catch(FileNotFoundException e){
			System.out.println("File not exists");
			throw e;
		}
		
		JTextField NumberOfWheels = new JTextField(10); // set up panel and textfields
		JTextField Weight = new JTextField(10);
		JLabel label = new JLabel("Please enter the number of wheels and weight of cycle.");
		JPanel panel = new JPanel();

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // sets layout
		panel.add(label);
		panel.add(NumberOfWheels);
		panel.add(Weight);
		
		JOptionPane.showMessageDialog(null, panel); //prompts user to enter the number of wheels and weight
		numberOfWheels = Double.parseDouble(NumberOfWheels.getText());
		weight = Double.parseDouble(Weight.getText());
		Cycle c = new Cycle(numberOfWheels, weight); //sets new cycle
		
		output.println(c.toString());
		output.close(); //closes file
		
		}
	}