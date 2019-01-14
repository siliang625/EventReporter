package liu.siliang.eventreporter;

import java.util.ArrayList;
import java.util.List;

//a list of data to be displayed
public class DataService {

    public static List<Event> getEventData() {
        List<Event> eventData = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            eventData.add(
                    new Event("Event",
                            "4406 w 7th ave",
                            "this is a huge event"));

        }
        return eventData;
    }
}
