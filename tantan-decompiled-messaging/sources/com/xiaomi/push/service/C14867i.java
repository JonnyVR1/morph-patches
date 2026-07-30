package com.xiaomi.push.service;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p149l.ftq0;
import p149l.gtq0;
import p149l.htq0;
import p149l.ysq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.i */
/* JADX INFO: loaded from: classes2.dex */
public class C14867i implements ftq0 {
    /* JADX INFO: renamed from: a */
    public static ysq0 m86668a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String[] strArr;
        String[] strArr2;
        String strTrim;
        ArrayList arrayList;
        if (xmlPullParser.getEventType() != 2) {
            return null;
        }
        String name = xmlPullParser.getName();
        String namespace = xmlPullParser.getNamespace();
        if (xmlPullParser.getAttributeCount() > 0) {
            String[] strArr3 = new String[xmlPullParser.getAttributeCount()];
            String[] strArr4 = new String[xmlPullParser.getAttributeCount()];
            for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                strArr3[i] = xmlPullParser.getAttributeName(i);
                strArr4[i] = htq0.m132936e(xmlPullParser.getAttributeValue(i));
            }
            strArr = strArr3;
            strTrim = null;
            arrayList = null;
            strArr2 = strArr4;
        } else {
            strArr = null;
            strArr2 = null;
            strTrim = null;
            arrayList = null;
        }
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3) {
                return new ysq0(name, namespace, strArr, strArr2, strTrim, arrayList);
            }
            if (next == 4) {
                strTrim = xmlPullParser.getText().trim();
            } else if (next == 2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                ysq0 ysq0VarM86668a = m86668a(xmlPullParser);
                if (ysq0VarM86668a != null) {
                    arrayList.add(ysq0VarM86668a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public ysq0 m86670b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && eventType != 2) {
            eventType = xmlPullParser.next();
        }
        if (eventType == 2) {
            return m86668a(xmlPullParser);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m86669a() {
        gtq0.m127999c().m128003e("all", "xm:chat", this);
    }
}
