public class LeapYear {

  public boolean leapYear(int year) {
    boolean leapYear = year % 400 == 0;

    if (year % 100 == 0 && year % 400 != 0) {
      leapYear = false;
    }

    return leapYear;
  }
}
