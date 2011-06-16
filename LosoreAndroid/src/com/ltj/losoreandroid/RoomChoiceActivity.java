package com.ltj.losoreandroid;

import java.util.List;

import org.xmlpull.v1.XmlPullParser;

import com.ltj.losoreandroid.helper.ParseRoomsXML;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class RoomChoiceActivity extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.roomchoice);
        parseRooms();
    }
	
	private boolean parseRooms() {
		XmlPullParser varselBatch = getResources().getXml(R.xml.rooms);
		ParseRoomsXML parser = new ParseRoomsXML();
		List<String> rooms = parser.Parse(varselBatch);
		if(rooms.size()<1) {
			return false;
		}
		
		TableLayout table = (TableLayout) findViewById(R.id.TableLayoutRooms);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(
        		this, R.array.noofrooms, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		for(String room:rooms) {
			TableRow row = new TableRow(this);
			TextView t = new TextView(this);
	        t.setText(room+":");
	        //t.setTypeface(Typeface.BOLD);
	        Spinner s = new Spinner(this);
	        s.setAdapter(adapter);
	        row.addView(t);
	        row.addView(s);
	        table.addView(
	        		row,new TableLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		}
		
		return true;
	}
	
}