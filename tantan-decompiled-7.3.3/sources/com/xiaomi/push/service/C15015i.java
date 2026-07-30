package com.xiaomi.push.service;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p153l.e2r0;
import p153l.l2r0;
import p153l.m2r0;
import p153l.n2r0;

/* JADX INFO: renamed from: com.xiaomi.push.service.i */
/* JADX INFO: loaded from: classes2.dex */
public class C15015i implements l2r0 {
    /* JADX INFO: renamed from: a */
    public static e2r0 m87839a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
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
                strArr4[i] = n2r0.m161252e(xmlPullParser.getAttributeValue(i));
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
                return new e2r0(name, namespace, strArr, strArr2, strTrim, arrayList);
            }
            if (next == 4) {
                strTrim = xmlPullParser.getText().trim();
            } else if (next == 2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                e2r0 e2r0VarM87839a = m87839a(xmlPullParser);
                if (e2r0VarM87839a != null) {
                    arrayList.add(e2r0VarM87839a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public e2r0 m87841b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1 && eventType != 2) {
            eventType = xmlPullParser.next();
        }
        if (eventType == 2) {
            return m87839a(xmlPullParser);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m87840a() {
        m2r0.m156883c().m156887e("all", "xm:chat", this);
    }
}
