public class LeapYear {

  public boolean leapYear(int year) {
    boolean leapYears = false;

    if (isDivisibleBy100(year) && !divisibleBy400(year) || !isDivisibleBy4(year)) {
      leapYears = false;
    }

    if (isDivisibleBy4(year) && !isDivisibleBy100(year) || divisibleBy400(year)) {
      leapYears = true;
    }

    return leapYears;
  }

  private boolean divisibleBy400(int year) {
    return year % 400 == 0;
  }

  private boolean isDivisibleBy100(int year) {
    return year % 100 == 0;
  }

  private boolean isDivisibleBy4(int year) {
    return year % 4 == 0;
  }
}
