package uniandes.dpoo.taller4.view.stats;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import uniandes.dpoo.taller4.view.LightsOut;

@SuppressWarnings("serial")
public class Stats extends JPanel {

	private JLabel[] values;
	private String nickname;
	private int play = 0;
	private String ultimaJugada;

	public Stats(String playerName) {
		this.nickname = playerName;
		setBorder(new EmptyBorder(0, 7, 0, 7));
		setBackground(LightsOut.BASECOL);
		setLayout(new GridLayout(1, 0, 0, 0));

		JLabel[] keys = new JLabel[3];
		String[] keysLbl = { "Jugadas", "Jugador", "ultima casilla jugada"};
		values = new JLabel[3];
		String[] valuesLbls = new String[] { "" + play, nickname, ultimaJugada };

		for (int i = 0; i < 3; i++) {
			keys[i] = new JLabel(keysLbl[i]);
			keys[i].setForeground(Color.WHITE);
			keys[i].setFont(LightsOut.FONT);
			values[i] = new JLabel(valuesLbls[i]);
			values[i].setForeground(Color.WHITE);
			values[i].setFont(LightsOut.FONT);
			add(keys[i]);
			add(values[i]);
		}
	}

	public void setJugadas(int i) {
		this.play = i;
		values[0].setText("" + i);
	}

	public void setPlayer(String name) {
		values[1].setText(name);
	}
	
	public void setUltimaJugada(String jugada) {
		values[2].setText(jugada);
	}

	public int getJugadas() {
		return this.play;
	}
}
