package views;
import javax.swing.*;
import java.awt.*;

import java.util.Map;


public class MyFrame {


    private JFrame frame;
    private JTabbedPane panel;
    private JPanel panel1;


    public MyFrame() {
        this.frame =  new JFrame("JTableExample");
        this.frame.getContentPane().setLayout(new FlowLayout());
        this.frame.setSize(1400, 500);
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.panel = new JTabbedPane();
        this.panel.setPreferredSize(new Dimension(1420,800));
        this.panel1= new JPanel();
        panel1.setPreferredSize(new Dimension(1420, 800));


    }




    public void show(Map<String, Map<String, String>> relations){


        JTable jTab1 = new JTable(new RelationsTableView(relations));
        jTab1.getColumnModel().getColumn(1).setMaxWidth(20);
        jTab1.setPreferredScrollableViewportSize(new Dimension(1400, 800));

        for (int i =10 ; i<jTab1.getColumnCount();i++) {
            jTab1.getColumnModel().getColumn(i).setPreferredWidth(20);
        }
        panel1.removeAll();



        panel1.add(jTab1);
        panel1.add(new JScrollPane(jTab1));
//        this.frame.add(new JScrollPane(jTab1));



        this.panel.addTab("Relations", this.panel1);
//        this.panel.addTab("Relations", this.panel1);

        this.frame.add(panel);
        this.frame.setVisible(true);

    }
}
