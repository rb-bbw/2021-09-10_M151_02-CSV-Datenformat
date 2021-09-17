package ch.bbw;

import java.util.Objects;

import static java.lang.Integer.parseInt;

public class Championship {
    public String blub_idfs, id, year, date_from, date_to, championship, city, country, event_date,
            event_time_from, event_time_to, event_title;

    public Championship(String[] fields){
        blub_idfs = fields[0];
        id = fields[1];
        year = fields[2];
        date_from = fields[3];
        date_to = fields[4];
        championship = fields[5];
        city = fields[6];
        country = fields[7];
        event_date = fields[8];
        event_time_from = fields[9];
        event_time_to = fields[10];
        event_title = fields[11];
    }

    public int getMonth(){
        return (event_date.length() >= 6) ? parseInt(event_date.substring(3, 5)) : 0;
    }
    public int getDay(){
        return (event_date.length() >= 6) ? parseInt(event_date.substring(0, 2)) : 0;
    }
    public String getAll(){ // debug
        return blub_idfs + id + year + date_from + date_to + championship + city + country + event_date +
                event_time_from + event_time_to + event_title;
    }
}
