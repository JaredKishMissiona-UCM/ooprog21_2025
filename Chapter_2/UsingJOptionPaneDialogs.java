import javax.swing.JOptionPane;

class UsingJOptionPaneDialogs {

    public static void main(String[] args) {
    
        while (true) {
        
            String name = JOptionPane.showInputDialog(null, "What is your name?");

            if (name != null && !name.isEmpty()) {
               
                int confirm = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
                
               
                if (confirm == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
                    break;  
                }
            } else {
                JOptionPane.showMessageDialog(null, "You didn't provide a name!");
                break;  
            }
        }
    }
}
