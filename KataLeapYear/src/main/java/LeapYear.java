public class LeapYear {

  public boolean leapYear(int year) {
    boolean leapYear = divisibleBy400(year);

    if (year % 100 == 0 && !divisibleBy400(year)) {
      leapYear = false;
    }

    return leapYear;
  }

  private boolean divisibleBy400(int year) {
    return year % 400 == 0;
  }
}
