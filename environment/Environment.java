package environment;
public class Environment {
    private Weather currentWeather;

    public void changeWeather(Weather newWeather) {

        this.currentWeather = newWeather;
        System.out.println(currentWeather.showWeather());
    }
    public boolean checkWeather() {
        return currentWeather instanceof RainyWeather;
    }

}