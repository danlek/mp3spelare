import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

//import javax.swing.filechooser.FileFilter;
import javax.swing.JFileChooser;


public class Controller implements ActionListener
{
	private Model m;
	private Mp3Filter ff;
	private JFileChooser fc;
	private File f;
	public Controller(Model m)
	{
		this.m = m;
		ff = new Mp3Filter();
		fc = new JFileChooser();
		fc.addChoosableFileFilter(ff);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand() == "open")
		{
			fc.showOpenDialog(null);
			f = fc.getSelectedFile();
			if(m.isPlaying() == true)
			{
				m.stop();
				m.load(f.getPath());
				System.out.println(m.isLoaded());
			}
			else
			{
				m.load(f.getPath());
			}
			
		}
		else if(e.getActionCommand() == "play")
		{
			if(m.isLoaded() == true && m.isPlaying() == false)
			{
				m.play();
			}
		}
		else if(e.getActionCommand() == "stop")
		{
			if(m.isPlaying() == true)
			{
				m.stop();
			}
		}
		
	}
	public String getSongtitle()
	{
		String songTitle = f.getName();
		return songTitle;
	}

}
