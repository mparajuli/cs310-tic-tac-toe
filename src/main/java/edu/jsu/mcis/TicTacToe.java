package edu.jsu.mcis;

import javax.swing.*;

public class TicTacToe {

    public static final int DEFAULT_WIDTH = 3;

    public static void main(String[] args) {
       
        /* Set initial size of game board to the default (which is 3 x 3) */

        int size = DEFAULT_WIDTH;
        
        /* If a different size is provided as a command-line argument, use 
           this size instead of the default */
        
        if ( args.length > 0 ) {
            try {
                size = Integer.parseInt( args[0] );
            } catch ( NumberFormatException e ) {
                System.exit(1);
            }
        }

        /* Create Controller */

        TicTacToeController controller = new TicTacToeController( size );
        
        /* Start GUI */

        JFrame win = new JFrame( "Tic-Tac-Toe" );
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        win.add( controller.getView() );
        win.pack();
        win.setVisible( true );
        
    }
    
}