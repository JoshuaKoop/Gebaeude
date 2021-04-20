/**
 * Der Klasse werden die Parameter Höhe pro Stockwerk, Anzahl Stockwerke und Anzahl der Besucher übergeben.
 * @author Joshua Koop
 * @version 0.1
 */
public class Einfamilienhaus extends Haus
{
    
    private int besucher;
    
    public Einfamilienhaus( double pHoeheProStockwerk, int pStockwerke, int pBesucher )
    {
        super(pHoeheProStockwerk, pStockwerke, pBesucher);
    }
    
    public int gibBesucher(){
        return besucher;
    }
}
