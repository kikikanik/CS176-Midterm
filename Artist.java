import java.util.ArrayList;

// this class represents an artist who can have multiple albums each containing multiple sides and multiple songs
public class Artist
{
	private String name; // the artists's full name or stage name
	private String dateOfBirth; // the artists's date of birth
	private String placeOfBirth; // the artist's place of birth
	private ArrayList<Album> discography = new ArrayList<Album>(); // an ArrayList of the artist's albums

	// constructor method
	public Artist(String name, String dateOfBirth, String placeOfBirth)
	{
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDateOfBirth()
	{
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}

	public String getPlaceOfBirth()
	{
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth)
	{
		this.placeOfBirth = placeOfBirth;
	}

	public ArrayList<Album> getDiscography()
	{
		return discography;
	}

	public void setDiscography(ArrayList<Album> discography)
	{
		this.discography = discography;
	}

	// method to add a new album to the artist's discography
	public void addAlbum(Album newAlbum)
	{
		discography.add(newAlbum);
	}

	// method to return a String containing all the artist information
	public String toString()
	{
		StringBuilder stringBuilder = new StringBuilder(
				"---------------------------------------------------------------------------");
		stringBuilder.append(System.lineSeparator());
		stringBuilder.append("Artist [" + name + "] Born [" + dateOfBirth + "] in [" + placeOfBirth + "]");
		stringBuilder.append(System.lineSeparator());
		stringBuilder.append(
				"---------------------------------------------------------------------------");
		for (Album album : discography)
		{
			stringBuilder.append(System.lineSeparator());
			stringBuilder.append(album);
		}
		stringBuilder.append(System.lineSeparator());
		return stringBuilder.toString();
	}

}
