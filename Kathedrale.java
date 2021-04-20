public class Kathedrale extends Kirche
{
    private int besucher;
    
    public Kathedrale(double pHoehe, int pBesucher)
    {
        super(pHoehe, pBesucher);
    }
    
    public int gibBesucher(){
        return besucher;
    }
}
