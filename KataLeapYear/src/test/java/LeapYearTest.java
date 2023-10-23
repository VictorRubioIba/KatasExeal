import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

public class LeapYearTest {

  @Test
  public void isLeapYearIfIsDivisibleBy400() {
    LeapYear leap = new LeapYear();
    assertThat(leap.leapYear(2000));
  }
}
