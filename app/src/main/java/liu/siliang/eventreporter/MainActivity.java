package liu.siliang.eventreporter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.e("life cycle test", "we are at onCreat()");
        //get ListView object from xml
        ListView eventListView = (ListView)findViewById(R.id.event_list);
        //initialize an adapter
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                this,
//                R.layout.event_item,
//                R.id.event_name,
//                getEventNames()
//        );
        //assign adapter to listView
       // eventListView.setAdapter(adapter);
        EventAdapter adapter = new EventAdapter(this);
    }
    //TODO1: get fake event names, return array of fake event names
//    private String[] getEventNames(){
//        String[] names = {"Event1", "Event2", "Event3"};
//        return names;
//    }




//    @Override
//    protected void onStart(){
//        super.onStart();
//        Log.e("life cycle test", "we are at onStart()");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.e("Life cycle test", "We are at onResume()");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.e("Life cycle test", "We are at onPause()");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.e("Life cycle test", "We are at onStop()");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.e("Life cycle test", "We are at onDestroy()");
//    }



}
