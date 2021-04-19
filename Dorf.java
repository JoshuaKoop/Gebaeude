public class Dorf extends Haus
{
	private int dorfgebaeude;
	private int besucher;
	
	public Dorf(){
		dorfgebaeude = 6;
	}
	
	public int besucher(){
		besucher = dorfgebaeude*Random(10)+4;
	}
}