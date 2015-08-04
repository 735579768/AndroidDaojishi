package com.demo.androiddaojishi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity{  
    private TextView txtView;  
	 AndroidDaojishi daojishi;
    public void onCreate(Bundle savedInstanceState) {    
        super.onCreate(savedInstanceState);    
        setContentView(R.layout.activity_main);   
        txtView = (TextView)findViewById(R.id.tv);  
        new  AndroidDaojishi(this,txtView,"2015-08-05 12:00:00");
    }
}  
