package com.androidhive.pushnotifications;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
 
public class FriendsList extends Activity implements OnItemClickListener{
    ListView listView;
     
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friend_list);
         
        listView = (ListView) findViewById(R.id.friendList);
        listView.setOnItemClickListener(this);        
    }
 
    /*
     * Parameters:
        adapter - The AdapterView where the click happened.
        view - The view within the AdapterView that was clicked
        position - The position of the view in the adapter.
        id - The row id of the item that was clicked.
     */
    @Override
    public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
        Toast.makeText(getApplicationContext(), ((TextView) view).getText(),
                  Toast.LENGTH_SHORT).show();
        if(position == 0)
        {
        	String code="";
			try {
				code = URLEncoder.encode("{\"type\":\"query\",\"num\":\"9035777009\"}","UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
        	new RequestTask(view.getContext()).execute("http://olabuddy.freezoy.com/gcm_server_php/send_message.php?message="+code+"&phone=9035783776");

        }
    }
}