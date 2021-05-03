public class Dorf
{
    private Gebaeude dorfgebaeude[] = new Gebaeude[7];
    private int besucher = 0;
    
    public Dorf(){
        dorfgebaeude[0] = new Einfamilienhaus(2.5,2,5);
        dorfgebaeude[1] = new Einfamilienhaus(2.8,4,7);
        dorfgebaeude[2] = new Einfamilienhaus(2.3,3,10);
        dorfgebaeude[3] = new Einfamilienhaus(2.4,5,14);
        dorfgebaeude[4] = new Einfamilienhaus(2.6,3,8);
        dorfgebaeude[5] = new Einfamilienhaus(2.7,8,9);
        dorfgebaeude[6] = new Kathedrale(20,150);
    }
    
    public int gibBesucher(){
        besucher = 0;
        for(int i = 0; i < dorfgebaeude.length;i++){
            besucher = besucher + dorfgebaeude[i].gibBesucher();
        }
        return besucher;
    }
    
    public void gebaeudeHinzufuegen(Gebaeude pGebaeude){
        Gebaeude[] dorfgebaeudeNeu = new Gebaeude[dorfgebaeude.length+1];
        for(int i = 0; i < dorfgebaeude.length; i++){
            dorfgebaeudeNeu[i] = dorfgebaeude[i];
        }
        dorfgebaeudeNeu[dorfgebaeudeNeu.length-1] = pGebaeude;
        dorfgebaeude = dorfgebaeudeNeu;
    }
    
    public void ersteVeränderung(){
        gebaeudeHinzufuegen(new Einfamilienhaus(2.5,2,7));
        gebaeudeHinzufuegen(new Kathedrale(30,120));
    }
    
    public void zweiteVeränderung(){
        gebaeudeHinzufuegen(new Dom(20,120));
    }
}