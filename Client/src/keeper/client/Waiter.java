//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package keeper.client;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Waiter extends JFrame {
//    public static void main(String[] args) {
//        new Waiter("keeper: Waiter");
//    }
    public void orderpanel(){
        JSplitPane split = new JSplitPane(1);
        split.setOneTouchExpandable(true);
        split.setDividerLocation(150);
        split.setPreferredSize(new Dimension(400, 200));

        JPanel leftPanel = new JPanel();
        JPanel rightPanel = new JPanel();
        JPanel botPanel = new JPanel();

        split.setLeftComponent(leftPanel);
        split.setRightComponent(rightPanel);

        JLabel testLabel = new JLabel("tree should be here");
        leftPanel.add(testLabel);

        rightPanel.setLayout(new BorderLayout());

        JLabel ord = new JLabel("Order1");
        JButton back = new JButton("BACK");
        JButton ok = new JButton("OK");
        botPanel.add(back, BorderLayout.EAST);
        botPanel.add(ok, BorderLayout.WEST);
        //split.setLayout(new BorderLayout());
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.add(ord);
        ord.setAlignmentX(Component.CENTER_ALIGNMENT);

        rightPanel.add(centerPanel, BorderLayout.CENTER);
        rightPanel.add(botPanel, BorderLayout.SOUTH);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remove(split);
                validate();
                repaint();
                new Waiter("r_keeper: Waiter");
                validate();
            }
        });
        add(split);
    }

    public void createorder () {
        final JSplitPane split = new JSplitPane(1);
        split.setOneTouchExpandable(true);
        split.setDividerLocation(150);
        split.setPreferredSize(new Dimension(400, 200));
        JPanel leftPanel = new JPanel();
        split.setLeftComponent(leftPanel);
        JLabel testLabel = new JLabel("tree should be here");
        leftPanel.add(testLabel);
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());
        JPanel centerPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        JButton back = new JButton("BACK");
        JButton ok = new JButton("OK");

        bottomPanel.add(back);
        bottomPanel.add(ok);
        split.setRightComponent(rightPanel);
        rightPanel.add(new JLabel(" "), "North");
        rightPanel.add(centerPanel, "Center");
        rightPanel.add(bottomPanel, "South");

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validate();
                repaint();
                new Waiter("r_keeper: Waiter");
                validate();
            }
        });

        add(split);
        pack();
    }


    public Waiter(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton createOrder = new JButton("Create order");
        JSplitPane split = new JSplitPane();
        split.setOneTouchExpandable(true);
        split.setDividerLocation(150);
        split.setPreferredSize(new Dimension(400, 200));

        JPanel leftPanel = new JPanel();
        JPanel rightPanel = new JPanel();

        split.setLeftComponent(leftPanel);
        split.setRightComponent(rightPanel);

//left panel

        leftPanel.setLayout(new BorderLayout());
        leftPanel.add(createOrder,BorderLayout.NORTH);

        //bottomPanel.add(updateSL, BorderLayout.SOUTH);

//right panel
        JButton ord1 = new JButton("order 1");
        JButton ord2 = new JButton("order 2");
        JButton ord3 = new JButton("order 3");
        JLabel order = new JLabel("ORDERS");
        rightPanel.setLayout(new BorderLayout());
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.add(order);
        //rightPanel.add(new JLabel("ORDERS"), BorderLayout.NORTH);
        rightPanel.add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(order);
        centerPanel.add(ord1);
        centerPanel.add(ord2);
        centerPanel.add(ord3);

        ord1.setAlignmentX(Component.CENTER_ALIGNMENT);
        ord2.setAlignmentX(Component.CENTER_ALIGNMENT);
        ord3.setAlignmentX(Component.CENTER_ALIGNMENT);
        order.setAlignmentX(Component.CENTER_ALIGNMENT);
        rightPanel.add(new JButton("OUT"), BorderLayout.SOUTH);

        ord1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remove(split);
                validate();
                repaint();
                orderpanel();
                validate();
            }
        });
        createOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remove(split);
                validate();
                repaint();
                createorder();
                validate();
            }
        });
        add(split);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
