package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes7.dex */
public class DefaultsXmlParser {
    private static final String XML_TAG_ENTRY = "entry";
    private static final String XML_TAG_KEY = "key";
    private static final String XML_TAG_VALUE = "value";

    public static Map<String, String> getDefaultsFromXml(Context context, int i) {
        HashMap map = new HashMap();
        try {
            Resources resources = context.getResources();
            if (resources == null) {
                Log.e(FirebaseRemoteConfig.TAG, "Could not find the resources of the current context while trying to set defaults from an XML.");
                return map;
            }
            XmlResourceParser xml = resources.getXml(i);
            String name = null;
            String text = null;
            String text2 = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    name = xml.getName();
                } else if (eventType == 3) {
                    if (xml.getName().equals(XML_TAG_ENTRY)) {
                        if (text != null && text2 != null) {
                            map.put(text, text2);
                        }
                        text = null;
                        text2 = null;
                    }
                    name = null;
                } else if (eventType == 4 && name != null) {
                    int iHashCode = name.hashCode();
                    if (iHashCode != 106079) {
                        if (iHashCode == 111972721 && name.equals("value")) {
                            text2 = xml.getText();
                        }
                    } else if (name.equals("key")) {
                        text = xml.getText();
                    }
                }
            }
            return map;
        } catch (IOException e) {
            e = e;
            Log.e(FirebaseRemoteConfig.TAG, "Encountered an error while parsing the defaults XML file.", e);
            return map;
        } catch (XmlPullParserException e2) {
            e = e2;
            Log.e(FirebaseRemoteConfig.TAG, "Encountered an error while parsing the defaults XML file.", e);
            return map;
        }
    }
}
