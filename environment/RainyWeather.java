package environment;
import environment.Weather;

public class RainyWeather extends Weather {


    @Override
    public String showWeather() {
        return "The Weather is Rain";
    }
}