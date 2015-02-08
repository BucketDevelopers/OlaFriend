package com.androidhive.pushnotifications;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
 
public class shareFare extends Activity {
 
  private CheckBox chkIos, chkAndroid, chkWindows;
  private Button btnDisplay;
 
  @Override
  public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main2);
 
	addListenerOnChkIos();
	addListenerOnButton();
  }
 
  public void addListenerOnChkIos() {
 
	chkIos = (CheckBox) findViewById(R.id.chkIos);
 
	chkIos.setOnClickListener(new OnClickListener() {
 
	  @Override
	  public void onClick(View v) {
                //is chkIos checked?
		if (((CheckBox) v).isChecked()) {
			Toast.makeText(getApplicationContext(),
		 	   "Added", Toast.LENGTH_SHORT).show();
		}
 
	  }
	});
 
  }
 
  public void addListenerOnButton() {
 
	chkIos = (CheckBox) findViewById(R.id.chkIos);
	chkAndroid = (CheckBox) findViewById(R.id.chkAndroid);
	chkWindows = (CheckBox) findViewById(R.id.chkWindows);
	btnDisplay = (Button) findViewById(R.id.btnDisplay);
 
	btnDisplay.setOnClickListener(new OnClickListener() {
 
          //Run when button is clicked
	  @Override
	  public void onClick(View v) {
 
		StringBuffer result = new StringBuffer("Added friends to split cost!!!!");
		//result="Added friends to split cost!!!!";
		Toast.makeText(getApplicationContext(), result.toString(),
				Toast.LENGTH_SHORT).show();
		Intent intent=new Intent(getApplicationContext(),SplitActivity.class);
		startActivity(intent);
 
	  }
	});
 
  }
}