/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjava03hernandez17;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;
/**
 *
 * @author ubu1
 */
public class Prjava03hernandez17 extends Frame
    implements ActionListener, WindowListener {

    private TextField tfCount;
    private int count = 0;
    
    public Prjava03hernandez17() {
        setLayout(new FlowLayout());
        add(new Label("Counter"));
        tfCount = new TextField("0", 10);
        tfCount.setEditable(false);
        add(tfCount);
        
        Button btnCount = new Button("Count");
        add(btnCount);
        
        btnCount.addActionListener(this);
        addWindowListener(this);
        
        setTitle("nova finestra prjava03hernandez17");
        setSize(450, 100);
        setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Prjava03hernandez17();
    }
    
    @Override
    public void actionPerformed(ActionEvent evt){
        ++count;
        tfCount.setText(count + "");
    }
    
    @Override
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
    
    @Override
    public void windowOpened(WindowEvent e){}
    @Override
    public void windowClosed(WindowEvent e){}
    @Override
    public void windowIconified(WindowEvent e){}
    @Override
    public void windowDeiconified(WindowEvent e){}
    @Override
    public void windowActivated(WindowEvent e){}
    @Override
    public void windowDeactivated(WindowEvent e){}
    
}
