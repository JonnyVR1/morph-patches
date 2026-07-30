package p153l;

import androidx.annotation.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class lmq0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static String m154882a(XmlPullParser xmlPullParser, String str) {
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
    public static String m154883b(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (m154889h(xmlPullParser.getAttributeName(i)).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m154884c(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m154885d(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m154884c(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m154886e(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m154887f(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m154886e(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m154888g(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m154886e(xmlPullParser) && m154889h(xmlPullParser.getName()).equals(str);
    }

    /* JADX INFO: renamed from: h */
    public static String m154889h(String str) {
        int iIndexOf = str.indexOf(58);
        return iIndexOf == -1 ? str : str.substring(iIndexOf + 1);
    }
}
