/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import view.MainPanelView;

/**
 *
 * @author Rocio Ramirez
 */
public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SwingUtilities.invokeLater(() -> {
            MainPanelView mainPanelMenu = new MainPanelView();
            frame.getContentPane().add(mainPanelMenu);
            frame.setSize(750, 550);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
