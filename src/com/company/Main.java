package com.company;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int size = 0;
        while (size == 0) {
            try {
                size = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the size of the Square"));
            } catch (Exception ex) {
                if (ex.toString().equals("java.lang.NumberFormatException: null")) {
                    System.exit(0);
                }
            }
        }
        JFrame frame = new JFrame();
        Apanel p = new Apanel(size);
        frame.add(p);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.repaint();
    }
}

class Apanel extends JPanel {

    private int squareSize;
    private Color c;

    public Apanel(int size) {
        super();
        squareSize = size;
        c = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D.Double sq = new Rectangle2D.Double(20,20, squareSize, squareSize);
        g2.setColor(c);
        g2.fill(sq);
    }
}