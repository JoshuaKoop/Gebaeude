public class Dorf extends Haus
{
	private Einfamilienhaus dorfgebaeude[] = new Einfamilienhaus[6];
	private Kathedrale dorf[] = new Kathedrale[1];
	private int besucher = 0;
	
	public Dorf(){
		dorfgebaeude[0] = new Einfamilienhaus(2.5,2,5);
		dorfgebaeude[1] = new Einfamilienhaus(2.8,4,7);
		dorfgebaeude[2] = new Einfamilienhaus(2.3,3,10);
		dorfgebaeude[3] = new Einfamilienhaus(2.4,5,14);
		dorfgebaeude[4] = new Einfamilienhaus(2.6,3,8);
		dorfgebaeude[5] = new Einfamilienhaus(2.7,8,9);
		dorf[0] = new Kathedrale();
	
	public int besucher(){
		for(int i = 0; i < dorfgebaeude.length;i++){
			besucher = besucher + dorfgebaeude[i].gibBesucher();
		}
		besucher = besucher + dorf[0].gibBesucher();
	}
}