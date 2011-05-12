import java.io.File;

import javax.swing.filechooser.FileFilter;
//import javax.swing.text.Utilities;


public class Mp3Filter extends FileFilter
{

	@Override
	public boolean accept(File f) 
	{
		boolean anwser = false;
		String fileName = f.getName();
		String fileExtension;
				
		int i = fileName.lastIndexOf('.');
		if(i == -1)
		{
			//Katalog, skippa kollen
			anwser = true;
		}
		else
		{
			fileExtension = fileName.substring(i + 1).toLowerCase();
			//System.out.println(fileExtension);
			if(fileExtension.equals("mp3"))
			{
				anwser = true;
			}
		}
		return anwser;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "mp3";
	}

}
