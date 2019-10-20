public class Heater
{
    // instance variables - replace the example below with your own
    private int temperature;
    private int min;
    private int max;
    private int increment;
    
    public Heater(int minHeat, int maxHeat)
    {
        // constructor for heater class 
        min = minHeat; //lowest temperature
        max = maxHeat; // highest temperature
        increment = 1; // change temperate by...
        temperature = min; // starting temperature
    }
    
    public void warmer() // raise temperature
    {
        if(temperature < max)
        {
        temperature += increment;
        }
    }
    
    public void cooler() // lower temperature
    {
        if(temperature > min)
        {
        temperature -= increment;
        }
    }
    
    public int getTemperature() // get temperature
    {
        return temperature;
    }
    
    public void setIncrement(int value) // set temp change value 
    {
        if(value > 0)
        {
        increment = value;
        }
    }
    
}
