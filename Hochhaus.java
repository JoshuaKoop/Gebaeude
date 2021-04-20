public class Hochhaus extends Haus
{
    private int stockwerke;
    private int besucher;
    
    public Hochhaus( double pHoeheProStockwerk, int pStockwerke, int pBesucherProStockwerk )
    {
        super(pHoeheProStockwerk, pStockwerke, pBesucherProStockwerk);
    }
    
    public int anzahlBesucher() {
        return stockwerke * besucher;
    }
}
