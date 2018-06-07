package com.marrzrpg.ide;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;

public class BasicGUI extends JFrame {
	public static void main(String[] args) {
		new BasicGUI();
	}
	
	public BasicGUI() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		JSplitPane sp1 = new JSplitPane();
		JSplitPane sp2 = new JSplitPane();
		sp2.setOrientation(JSplitPane.VERTICAL_SPLIT);
		sp1.setLeftComponent(sp2);
		sp1.setRightComponent(new MainPanel());
		add(sp1);
		setVisible(true);
	}
	
	public class MainPanel extends JPanel {
		public MainPanel() {
			setLayout(new BorderLayout());
			JToolBar tb = new JToolBar();
			tb.add(new JButton("LOL"));
			tb.setFloatable(false);
			tb.setBackground(Color.white);
			tb.setMargin(new Insets(0, 0, 0, 0));
			add(tb, BorderLayout.NORTH);
		}
	}
}
