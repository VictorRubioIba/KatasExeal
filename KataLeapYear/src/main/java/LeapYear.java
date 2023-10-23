public class LeapYear {

  public boolean leapYear(int year) {
    boolean leapYear = year % 400 == 0;

    return leapYear;
  }
}
