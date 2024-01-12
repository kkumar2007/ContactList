public class Athlete extends Person
{
    private int strength;
    public Athlete(String f, String l, String p, int strength)
    {
        super(f, l, p);
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    public String toString()
    {
        return super.toString() + " Strength: " + strength;
    }
}
