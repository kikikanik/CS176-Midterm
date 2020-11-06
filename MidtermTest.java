// this class contains the main method for testing the Song, Album, and Artist classes
public class MidtermTest
{
	public static void main(String[] args)
	{
		// songs on side 1 of Born to Run album
		Song btrSide1Song1 = new Song("Thunder Road", 289);
		Song btrSide1Song2 = new Song("Tenth Avenue Freeze-Out", 191);
		Song btrSide1Song3 = new Song("Night", 180);
		Song btrSide1Song4 = new Song("Backstreets", 390);

		// array of songs on side 1 of Born to Run album
		Song[] btrSide1 =
			{ btrSide1Song1, btrSide1Song2, btrSide1Song3, btrSide1Song4 };

		// songs on side 2 of Born to Run album
		Song btrSide2Song1 = new Song("Born to Run", 271);
		Song btrSide2Song2 = new Song("She's the One", 270);
		Song btrSide2Song3 = new Song("Meeting Across the River", 198);
		Song btrSide2Song4 = new Song("Jungleland", 574);

		// array of songs on Side 2 of Born to Run album
		Song[] btrSide2 =
			{ btrSide2Song1, btrSide2Song2, btrSide2Song3, btrSide2Song4 };

		// 2D array containing all songs on Born to Run Album (side 1 and side 2)
		Song[][] btr2DArray =
			{ btrSide1, btrSide2 };

		// Born to Run album
		Album btrAlbum = new Album("Born to Run", 1975, btr2DArray);

		// songs on side 1 of The River album
		Song trSide1Song1 = new Song("The Ties That Bind", 214);
		Song trSide1Song2 = new Song("Sherry Darling", 243);
		Song trSide1Song3 = new Song("Jackson Cage", 184);
		Song trSide1Song4 = new Song("Two Hearts", 165);
		Song trSide1Song5 = new Song("Independence Day", 290);

		// array of songs on side 1 of The River album
		Song[] trSide1 =
			{ trSide1Song1, trSide1Song2, trSide1Song3, trSide1Song4, trSide1Song5 };

		// songs on side 2 of The River album
		Song trSide2Song1 = new Song("Hungry Heart", 199);
		Song trSide2Song2 = new Song("Out in the Street", 257);
		Song trSide2Song3 = new Song("Crush on You", 190);
		Song trSide2Song4 = new Song("You Can Look (But You Better Not Touch)", 157);
		Song trSide2Song5 = new Song("I Wanna Marry You", 210);
		Song trSide2Song6 = new Song("The River", 301);

		// array of songs on side 2 of The River album
		Song[] trSide2 =
			{ trSide2Song1, trSide2Song2, trSide2Song3, trSide2Song4, trSide2Song5, trSide2Song6 };

		// songs on side 3 of The River album
		Song trSide3Song1 = new Song("Point Blank", 366);
		Song trSide3Song2 = new Song("Cadillac Ranch", 183);
		Song trSide3Song3 = new Song("I'm a Rocker", 216);
		Song trSide3Song4 = new Song("Fade Away", 286);
		Song trSide3Song5 = new Song("Stolen Car", 234);

		// array of songs on side 3 of The River album
		Song[] trSide3 =
			{ trSide3Song1, trSide3Song2, trSide3Song3, trSide3Song4, trSide3Song5 };

		// songs on side 4 of The River album
		Song trSide4Song1 = new Song("Ramrod", 245);
		Song trSide4Song2 = new Song("The Price You Pay", 329);
		Song trSide4Song3 = new Song("Drive All Night", 513);
		Song trSide4Song4 = new Song("Wreck on the Highway", 234);

		// array of songs on side 4 of The River album
		Song[] trSide4 =
			{ trSide4Song1, trSide4Song2, trSide4Song3, trSide4Song4 };

		// 2D array containing all songs on The River Album (side 1, side 2, side 3, and side 4)
		Song[][] songArray2 =
			{ trSide1, trSide2, trSide3, trSide4 };

		// The River album
		Album trAlbum = new Album("The River", 1980, songArray2);

		// songs on side 1 of High Hopes album
		Song hhSide1Song1 = new Song("High Hopes", 297);
		Song hhSide1Song2 = new Song("Harry's Place", 243);
		Song hhSide1Song3 = new Song("American Skin", 442);
		Song hhSide1Song4 = new Song("Just Like Fire Would", 233);
		Song hhSide1Song5 = new Song("Hunter of Invisiable Game", 250);
		Song hhSide1Song6 = new Song("the Ghost of Tom Joad", 449);

		// array of songs on side 1 of High Hopes album
		Song[] hhSide1 =
			{ hhSide1Song1, hhSide1Song2, hhSide1Song3, hhSide1Song4, hhSide1Song5, hhSide1Song6 };

		// songs on side 2 of Born to Run album
		Song hhSide2Song1 = new Song("Down in the Hole", 297);
		Song hhSide2Song2 = new Song("Heaven's Wall", 228);
		Song hhSide2Song3 = new Song("Frankie Fell in Love", 165);
		Song hhSide2Song4 = new Song("This is your Sword", 170);
		Song hhSide2Song5 = new Song("The Wall", 270);
		Song hhSide2Song6 = new Song("Dream Baby Dream", 250);

		// array of songs on Side 2 of High Hopes album
		Song[] hhSide2 =
			{ hhSide2Song1, hhSide2Song2, hhSide2Song3, hhSide2Song4, hhSide2Song5, hhSide2Song6 };

		// 2D array containing all songs on High Hopes Album (side 1 and side 2)
		Song[][] hh2DArray =
			{ hhSide1, hhSide2 };

		// Random album
		Album hhAlbum = new Album("!!!!!!!!", 20!1, hh2DArray);

		// Bruce Springsteen artist
		Artist boss = new Artist("Bruce Springsteen", "September 23, 1949", "Long Branch, NJ, USA");

		// add all three albums to the Bruce Springsteen artist
		boss.addAlbum(btrAlbum);
		boss.addAlbum(trAlbum);
		boss.addAlbum(hhAlbum);


		// print all info about Bruce Springsteen
		System.out.println(boss);
	}
}