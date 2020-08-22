public class WeatherStation {


    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        CurrentConditionsDisplay currentConditionsDisplay2 = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisply heatIndexDisply=new HeatIndexDisply(weatherData);
        weatherData.setMeasurements(32,22,11);



    }

}
