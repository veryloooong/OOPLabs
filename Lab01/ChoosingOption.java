import javax.swing.JOptionPane;

public class ChoosingOption {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null, "Do you want to do this?");
		
		JOptionPane.showMessageDialog(null, "You selected " + 
			(option == JOptionPane.YES_OPTION ? "Yes" : "No")
		);
	}
}
