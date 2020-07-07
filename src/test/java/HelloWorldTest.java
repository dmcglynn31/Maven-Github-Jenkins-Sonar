import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

import thanks.Thanks;

public class HelloWorldTest {

  private final Thanks thanks = new Thanks();

  @Test
  public void HelloWorldSaysThanks() {
  try {
    assertThat(thanks.sayThanks(), containsString("Thanks!"));
  } catch (Exception e) {
    System.out.println("There's a missing string in the message");
    e.printStackTrace();
  }  
  }

}