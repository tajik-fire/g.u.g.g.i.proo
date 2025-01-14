package environment;
import environment.Weather;
import java.util.Random;

public class SunnyWeather extends Weather {
    @Override
    public String showWeather() {
        return "The Weather is Sunny ";
    }
}