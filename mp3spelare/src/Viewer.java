import java.awt.Font;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;



public class Viewer extends JPanel implements Observer 
{
	private Model m;
	private Controller c;
	private JFrame frame;
	private JPanel panel;
	private JLabel info;
	private JButton open, play, stop;
	private Font minFont;
	public Viewer(Model m, Controller c)
	{
		super(new GridLayout(2, 0));
				
		this.m = m;
		this.c = c;
		
		minFont = new Font("SANS_SERIF", Font.PLAIN, 12);
		
		frame = new JFrame("Zomg MP3spelare");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 100);
		frame.setResizable(false);
		
		info = new JLabel();
		info.setForeground(java.awt.Color.WHITE);
		
		open = new JButton("Open");
		open.setActionCommand("open");
		open.addActionListener(c);
		
		play = new JButton("Play");
		play.setActionCommand("play");
		play.addActionListener(c);
		
		stop = new JButton("Stop");
		stop.setActionCommand("stop");
		stop.addActionListener(c);
		
		panel = new JPanel(new GridLayout(0, 3));
		panel.add(open);
		panel.add(play);
		panel.add(stop);
		
		
		this.add(info);
		this.add(panel);
		this.setBackground(java.awt.Color.BLACK);
		frame.add(this);
		frame.setVisible(true);
		
		m.addObserver(this);
	}

	@Override
	public void update(Observable arg0, Object arg1) 
	{
		info.setText(c.getSongtitle() + "    " + m.getPosition());
	}
}
