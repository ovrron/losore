package com.ltj.losoreandroid.helper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import android.content.res.XmlResourceParser;

public class ParseRoomsXML {

	public List<String> Parse(XmlPullParser roomsBatch) {
		ArrayList<String> rooms = new ArrayList<String>();
		int eventType = -1;
		
		//TODO rensk tabellen
		
		while (eventType != XmlResourceParser.END_DOCUMENT) { 
	    	 if (eventType == XmlResourceParser.START_TAG) { 
	    		 String strName = roomsBatch.getName();
	    		 if (strName.equals("Room")) {
	    			 try {
						String room = roomsBatch.nextText().trim();
						rooms.add(room);
						
					} catch (XmlPullParserException e) {
						// TODO skriv til logg
						e.printStackTrace();
					} catch (IOException e) {
						// TODO skriv til logg
						e.printStackTrace();
					}
	    		 }
	    	 }
	    	 try {
				eventType = roomsBatch.next();
			} catch (XmlPullParserException e) {
				// TODO skriv til logg
				e.printStackTrace();
			} catch (IOException e) {
				// TODO skriv til logg
				e.printStackTrace();
			} 
	     }
		return rooms;
	}
}
