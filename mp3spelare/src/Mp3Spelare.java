
public class Mp3Spelare 
{
	private Model m;
	private Controller c;
	private Viewer v;
	public Mp3Spelare()
	{
		m = new Model();
		c = new Controller(m);
		v = new Viewer(m, c);
	}
	public static void main(String[] args) 
	{
		Mp3Spelare mp3 = new Mp3Spelare();
	}

}
