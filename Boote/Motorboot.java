Public Class Motorboot extends Boot
{
    Integer Leistung;

    public Motorboot(String Modell, Float Gewicht, Float Maximalgewicht, Float Laenge, Float Breite, String[] Antriebsart, Integer Leistung)
    {
        super(Modell, Gewicht, Maximalgewicht, Laenge, Breite, Antriebsart);
        this.Leistung=Leistung;
    }


}