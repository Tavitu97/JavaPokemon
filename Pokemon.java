public class Pokemon
{
    protected int health;
    protected int power;
    protected double type;

    public Pokemon (int health,int power,double type)
    {
        this.health = health;
        this.power = power;
        this.type = type;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public void setPower(int power)
    {
        this.power = health;
    }

    public void setType(double type)
    {
        this.type = type;
    }

    public int getHealth()
    {
        return health;
    }

    public int getPower()
    {
        return power;
    }

    public double getType()
    {
        return type;
    }

}
