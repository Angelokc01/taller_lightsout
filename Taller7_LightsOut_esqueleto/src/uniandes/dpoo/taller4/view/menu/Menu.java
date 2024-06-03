package uniandes.dpoo.taller4.view.menu;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import uniandes.dpoo.taller4.view.Game;
import uniandes.dpoo.taller4.view.LightsOut;

@SuppressWarnings("serial")
public class Menu extends JPanel implements ActionListener {
	private static final String[] KEYS = { "NUEVO", "REINICIAR","               ", "TOP 10", "CAMBIAR JUGADOR", "JUGADA GLOBAL"};
	private Game parent;
	private int jugadaReinicio;

	public Menu(Game game) {
		this.parent = game;
		JComponent[] menuBtn = new JComponent[6];
		

		for (int i = 0; i < 6; i++) {
			if(i==2) {
				menuBtn[i] = new JTextField(KEYS[i]);
			}
			else {
				menuBtn[i] = new JButton(KEYS[i]);
				menuBtn[i].setForeground(LightsOut.BASECOL);
				menuBtn[i].setFont(LightsOut.FONT);
				menuBtn[i].setBackground(Color.WHITE);
				((AbstractButton) menuBtn[i]).addActionListener(this);
			}
			
			add(menuBtn[i]);
		}
		setBackground(LightsOut.BASECOL);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String lbl = e.getActionCommand();
		if (KEYS[0].equals(lbl)) {
			parent.newGame();
		} else if (KEYS[1].equals(lbl)) {
			parent.restart( 2 );
		} else if (KEYS[2].equals(lbl)) {
			parent.top10();
		} else if (KEYS[4].equals(lbl)) {
			parent.change();
		} 
		else if (KEYS[5].equals(lbl)) {
			parent.global();
		} 
	}

}
