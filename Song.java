// this class represents one song
public class Song
{
	private String title; // the title of the song
	private int runtime; // the runtime of the song in seconds

	// constructor method
	public Song(String title, int runtime)
	{
		this.title = title;
		this.runtime = runtime;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public double getRuntime()
	{
		return runtime;
	}

	public void setRuntime(int runtime)
	{
		this.runtime = runtime;
	}

	// method to return the song runtime in minutes and seconds
	public String getRuntimeString()
	{
		StringBuilder stringBuilder = new StringBuilder();
		int minutes = runtime / 60;
		int seconds = runtime % 60;
		if (minutes < 10)
		{
			stringBuilder.append("0");
		}
		stringBuilder.append(minutes + ":");
		if (seconds < 10)
		{
			stringBuilder.append("0");
		}
		stringBuilder.append(seconds);
		return stringBuilder.toString();
	}

	// method to return a String containing all the song information
	public String toString()
	{
		return "Song [" + title + "] Runtime [" + getRuntimeString() + "]";
	}

}
