package Lesson7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public class WeatherResponse {
    private String weatherText;

    private List<String> value;
    private String unit;


    public WeatherResponse () {

    }
    public WeatherResponse(String weatherText, List<String> value, String unit) {
        this.weatherText = weatherText;
        this.value = value;
        this.unit = unit;
    }

    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }

    public void setValue(List<String> value) {
        this.value = value;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public List<String> getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }


    public String getWeatherText() {
        return weatherText;
    }

    @Override
    public String toString() {
        return "WeatherResponse{" +
                "weatherText='" + weatherText + '\'' +
                ", value=" + value +
                ", unit='" + unit + '\'' +
                '}';
    }
}
