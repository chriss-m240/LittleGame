/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package littlegame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Chris
 */
public class Panel extends JPanel implements ActionListener {

    private Timer timer;
    private int xBuddy = 0;
    private int sequence = 0;
    private Thread t = new Thread();

    public Panel() {
        setBackground(Color.WHITE);
        initBoard();

    }

    private void initBoard() {
        addKeyListener(new TAdapter());
        setFocusable(true);
        timer = new Timer(200,this);
        timer.start();
    }
    
    @Override
     protected void paintComponent(Graphics g) {
       super.paintComponent(g);
        Image backGround = loadImage("blue_background.png");
        
         for (int j = 0; j < 800; j+=22) {
            g.drawImage(backGround,j,0,null);
         }
         
         Image buddy = loadImage("walking.png");
         g.drawImage(buddy, xBuddy +50, 60,xBuddy+50+116, 60+134, sequence*116, 0, (sequence*116)+116, 134, this);
        
         
     }

    
     
    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {

        }
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_RIGHT) {
                
            }
            if (key == KeyEvent.VK_LEFT) {
                
            }
        }
    }
    
    public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image Image = ii.getImage();
        return Image;
    }
    
    
    public void actionPerformed(ActionEvent e) {
        sequence +=1;
        if (sequence == 4) {
            sequence = 0;
        }
        xBuddy += 30;
      
         System.out.println("Hey");
        repaint();
        
    }
}
