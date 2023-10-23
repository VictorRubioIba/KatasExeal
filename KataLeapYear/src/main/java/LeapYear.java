public class LeapYear {

  public boolean leapYear(int year) {
    boolean leapYear = divisibleBy400(year);

    if (isDivisibleBy100(year) && !divisibleBy400(year)) {
      leapYear = false;
    }

    if (year % 4 == 0 && !isDivisibleBy100(year)) {
      leapYear = true;
    }

    return leapYear;
  }

  private boolean divisibleBy400(int year) {
    return year % 400 == 0;
  }

  private boolean isDivisibleBy100(int year) {
    return year % 100 == 0;
  }
}
