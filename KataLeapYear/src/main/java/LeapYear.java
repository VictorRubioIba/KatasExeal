public class LeapYear {

  public boolean leapYear(int year) {
   boolean leapYear =isDivisibleBy4(year) && !isDivisibleBy100(year) || divisibleBy400(year);
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
