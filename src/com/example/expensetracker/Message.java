package com.example.expensetracker;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Message extends Activity {
static TextView messageBox;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_message);
		messageBox=(TextView)findViewById(R.id.messageBox);
	}
	
	
	 public static void updateMessageBox(String msg)
	    {
	    	messageBox.append(msg);
	    }
}
