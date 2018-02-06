package com.mariako.android.helloandroid;

import android.app.Activity;
import android.text.method.LinkMovementMethod;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

/**
 * Created by Mariia on 13/12/2017.
 */

public class Link extends Activity {
    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        TextView t1 = (TextView) findViewById(R.id.more);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
    }
}//endclass

