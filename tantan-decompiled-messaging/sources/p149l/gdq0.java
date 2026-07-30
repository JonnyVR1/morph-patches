package p149l;

import androidx.annotation.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class gdq0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static String m125583a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static String m125584b(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (m125590h(xmlPullParser.getAttributeName(i)).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m125585c(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m125586d(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m125585c(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m125587e(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m125588f(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m125587e(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m125589g(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m125587e(xmlPullParser) && m125590h(xmlPullParser.getName()).equals(str);
    }

    /* JADX INFO: renamed from: h */
    public static String m125590h(String str) {
        int iIndexOf = str.indexOf(58);
        return iIndexOf == -1 ? str : str.substring(iIndexOf + 1);
    }
}
