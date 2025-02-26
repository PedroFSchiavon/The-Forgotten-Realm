package xyz.aethelwood;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
    private static final long serialVersionUID = 1L;

    // SCREEN SETTINGS
    public int originalTileSize;
    public int scale;
    public final int tileSize;
    public final int maxScreenCol;
    public final int maxScreenRow;
    public final int screenWidth;
    public final int screenHeight;

    public GamePanel() {
        this.originalTileSize = 16;
        this.scale = 3;
        this.tileSize = originalTileSize * scale;
        this.maxScreenCol = 20;
        this.maxScreenRow = 15;
        this.screenWidth = tileSize * maxScreenCol;
        this.screenHeight = tileSize * maxScreenRow;
        
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
    }
}
