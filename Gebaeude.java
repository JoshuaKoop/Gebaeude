public class Gebaeude
{
    private double hoehe;
    private int besucher;
    
    public Gebaeude(double pHoehe, int pBesucher )
    {
        hoehe = pHoehe;
        besucher = pBesucher;
    }

    public double getHoehe()
    {
        return hoehe;
    }
    
    public int gibBesucher(){
        return besucher;
    }
}
