package comp5216.sydney.edu.au.todolist;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends ListActivity {

    // Define variables
    ListView listView;
    ArrayList<String> items;
    ArrayAdapter<String> itemsAdapter;
    EditText addItemEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Calendar calendar = Calendar.getInstance();

        super.onCreate(savedInstanceState);

        // Use "activity_main.xml" as the layout
//        setContentView(R.layout.activity_main);

        // Reference the "listView" variable to the id "lstView" in the layout
//        listView = (ListView) findViewById(R.id.edit_list);
//        addItemEditText = (EditText) findViewById(R.id.txtNewItem);
//
//        // Create an ArrayList of String
//        items = new ArrayList<String>();
//        items.add("item one");
//        items.add("item two");
//
//        // Create an adapter for the list view using Android's built-in item layout
//        itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
//
//        // Connect the listView and the adapter
//        listView.setAdapter(itemsAdapter);
        SimpleAdapter adapter = new SimpleAdapter(
                this,
                this.getData(),
                R.layout.edit_list,
                new String[]{"edit_content","date","time"},
                new int[]{R.id.edit_content, R.id.date, R.id.time});
        setListAdapter(adapter);
    }

//    private void setListAdapter(SimpleAdapter adapter) {
//    }

//    public void onAddItemClick(View view) {
//        String toAddString = addItemEditText.getText().toString();
//        if (toAddString != null && toAddString.length() > 0) {
//            itemsAdapter.add(toAddString); // Add text to list view adapter
//            System.out.print(itemsAdapter);
//            addItemEditText.setText("");
//        }
//    }


    // for test
    private List<Map<String,String>> getData(){
        List<Map<String,String>> list = new ArrayList<Map<String, String>>();

        Map<String,String> edititem = new HashMap<String, String>();
        edititem.put("edit_content", "hello world");
        edititem.put("date", "2019-5-3");
        edititem.put("time", "11.30");

        list.add(edititem);

        edititem = new HashMap<String, String>();
        edititem.put("edit_content", "hello world2");
        edititem.put("date", "2019-5-3");
        edititem.put("time", "11.60");

        list.add(edititem);
        return list;
    }
}
