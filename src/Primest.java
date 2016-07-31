import javax.swing.JOptionPane;

public class Primest {
public static void main(String[] args) {

	int Num = Integer.parseInt(JOptionPane.showInputDialog("GIVE ME A NUMBER!!!!"));
	for (int i = 2; i < 10; i++) {
		if (Num%i == 0){
			JOptionPane.showMessageDialog(null, "Not Prime");
			
			break;
		}
		else {
			JOptionPane.showMessageDialog(null, "Prime");
			break;
		} 
		
			}
	

	
}
}
