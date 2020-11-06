// this class represents one album which can have multiple sides containing multiple songs
public class Album
{
	private String title; // the title of the album
	private int releaseYear; // the year the album was released
	private Song[][] trackList;	// a two dimensional array (an array of arrays) containing one array of songs per album side
	int AlbumRuntime;
	// constructor methods
	public Album(String title, int releaseYear, Song[][] trackList)
	{
		this.title = title;
		this.releaseYear = releaseYear;
		this.trackList = trackList;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public int getReleaseYear()
	{
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear)
	{
		this.releaseYear = releaseYear;
	}

	public Song[][] getTrackList()
	{
		return trackList;
	}

	public void setTrackList(Song[][] trackList)
	{
		this.trackList = trackList;
	}

	public int getAlbumRuntime()
	{	
		int AlbumRuntime = 0;
		for (Song[] side: trackList) {
			for (Song song:side) {
				AlbumRuntime += song.getRuntime();
			}
		}
		return AlbumRuntime;
	}

	public String getAlbumRuntimeString() 
	{
		StringBuilder stringBuilder = new StringBuilder();
		int hour = getAlbumRuntime() / 3600;
		int min = (getAlbumRuntime() % 3600) / 60;
		if (hour<10)
		{
			stringBuilder.append("0");
		}
		stringBuilder.append(hour + ":");
		if (min<10)
		{
			stringBuilder.append("0");
		}
		stringBuilder.append(min);
		return stringBuilder.toString();
	}

	public String toString() 
	{
		StringBuilder stringBuilder = new StringBuilder(
				"--------------------------------------");
		stringBuilder.append(System.lineSeparator());
		stringBuilder.append("Album [" + title + "] Release Year [" + releaseYear + "] Runtime [" + getAlbumRuntimeString() + "]");
		stringBuilder.append(System.lineSeparator());
		for (int i = 0; i < trackList.length; i++)
		{
			stringBuilder.append(System.lineSeparator() +"Side" + " [" + (i+1) + "]------------------");
			for (Song song:trackList[i])
			{
				stringBuilder.append(System.lineSeparator());
				stringBuilder.append(song.toString());
			}
		}
		stringBuilder.append(System.lineSeparator());
		stringBuilder.append(
				"--------------------------------------");
		stringBuilder.append(System.lineSeparator());
		return stringBuilder.toString();
	}
}
