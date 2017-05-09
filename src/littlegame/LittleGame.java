/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package littlegame;

import javax.swing.JFrame;

/**
 *
 * @author Estudiante
 */
public class LittleGame extends JFrame {

  public LittleGame(){
        add(new Panel());
    }
    
    public static void main(String[] args) {
        LittleGame game = new LittleGame();
        game.setTitle("Game");
        game.setSize(800,1000);
        game.setLocationRelativeTo(null);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setVisible(true);

    }
    
}
