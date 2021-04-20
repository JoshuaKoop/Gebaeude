public class Haus extends Gebaeude
{
    private int stockwerke;
    private int hoehe;
    
    public Haus( double pHoeheProStockwerk, int stockwerke, int pBesucher )
    {
        super(pHoeheProStockwerk, pBesucher);
        this.stockwerke = stockwerke;
    }
    
    public double getHoehe() {
        return hoehe * stockwerke;
    }
}
