// Packages to import

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class GUI {
    JFrame f;
    JTable j;

    GUI(String[][] data) {
        f = new JFrame();
        f.setTitle("StarWarsApp");

        // Column Names
        String[] columnNames = {"Nombre", "Estatura", "Año de nacimiento"};

        // Initializing the JTable
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);

        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        // Frame Size
        f.setSize(550, 230);
        // Frame Visible = true
        f.setVisible(true);
        Logger.INFO("EVERYTHING IS WORKING");
    }
}
