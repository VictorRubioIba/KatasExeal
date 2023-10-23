public class LeapYear {

  public boolean leapYear(int year) {
    boolean leapYear = divisibleBy400(year);

    if (isDivisibleBy100(year) && !divisibleBy400(year) || !isDivisibleBy4(year)) {
      leapYear = false;
    }

    if (isDivisibleBy4(year) && !isDivisibleBy100(year)) {
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

  private boolean isDivisibleBy4(int year) {
    return year % 4 == 0;
  }
}
