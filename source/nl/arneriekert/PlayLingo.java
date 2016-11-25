package nl.arneriekert;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PlayLingo {

	private JFrame mainFrame;
	private Color mainBG;

	public static void main(String[] args) {
		new PlayLingo().go();
	}

	public void go() {
		setUpGui();
	}

	public void setUpGui() {
		mainFrame = new JFrame("Lingo");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setUndecorated(true);
		mainFrame.setSize(500,500);
		mainBG = new Color(0, 0, 150, 200);
		mainFrame.setBackground(mainBG);
		mainFrame.setVisible(true);
	}
}