package hello;
import org.joda.time.LocalTime;
import thanks.Thanks;

public class HelloWorld {
  public static void main(final String[] args) {
    final Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  
    final LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);

    final Thanks thanks = new Thanks();
    System.out.println(thanks.sayThanks());
  
  }
}