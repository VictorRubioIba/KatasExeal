import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

public class LeapYearTest {

  @Test
  public void isLeapYearIfIsDivisibleBy400() {
    LeapYear leap = new LeapYear();
    assertThat(leap.leapYear(2000));
  }

  @Test
  public void isNotLeapYearIfIsDivisibleBy100ButNotBy400() {
    LeapYear leap = new LeapYear();
    assertThat(leap.leapYear(1800)).isFalse();
  }

  @Test
  public void isLeapYearIfIsDivisibleBy4AndNotBy100() {
    LeapYear leap = new LeapYear();
    assertThat(leap.leapYear(1996)).isTrue();
  }

  @Test
  public void isNotLeapYearIfIsNotDivisibleBy4() {
    LeapYear leap = new LeapYear();
    assertThat(leap.leapYear(1997)).isFalse();
  }
}
