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
	try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Mp3Spelare mp3 = new Mp3Spelare();
	}

}
