public class Time
{
  private int hours;
  private int mins;
  private int secs;

  public Time(int hr, int min, int sec)
  {
    hours = hr;
    mins = min;
    secs = sec;
  }

  public Time()
  {
    this(0,0,0);
  }


  // TODO: Part D - complete the documentation for the pad method
  /**
  * Description: returns input value in 2 digit format (thanks Justin!)
  * Precondition: The value is greater than 0.
  */
  private String pad(int value)
  {
    String output = "";
    if (value < 10)
    {
      return output + "0" + value;
    }
    return output + value;
  }

  // TODO: Part E - complete the toString method; use the pad method as part of your solution
  public String toString()
  {
    return pad(hours) + ":" + pad(mins) + ":" + pad(secs);
  }

  // TODO: Part F - write the tick method
  public void tick()
  {
    this.secs++;
  }

  // TODO: Part G - write the add method
  /**
  * Precondition: The variable offset is non-null
  */
  public void add(Time offset)
  {

  }
}
