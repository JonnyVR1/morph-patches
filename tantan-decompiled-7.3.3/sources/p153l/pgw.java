package p153l;

import android.text.TextUtils;
import android.util.Xml;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcBean;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcWrapperBean;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class pgw {

    /* JADX INFO: renamed from: l.pgw$a */
    public static class C19365a {

        /* JADX INFO: renamed from: a */
        public List<LrcBean> f152344a;
    }

    /* JADX INFO: renamed from: l.pgw$b */
    public static class C19366b {

        /* JADX INFO: renamed from: a */
        public C19367c f152345a;

        /* JADX INFO: renamed from: b */
        public C19368d f152346b;
    }

    /* JADX INFO: renamed from: l.pgw$c */
    public static class C19367c {

        /* JADX INFO: renamed from: a */
        public String f152347a;

        /* JADX INFO: renamed from: b */
        public String f152348b;
    }

    /* JADX INFO: renamed from: l.pgw$d */
    public static class C19368d {

        /* JADX INFO: renamed from: a */
        public List<C19365a> f152349a;
    }

    /* JADX INFO: renamed from: a */
    public static LrcWrapperBean m172273a(File file) {
        C19368d c19368d;
        if (file != null && file.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                    xmlPullParserNewPullParser.setInput(fileInputStream, null);
                    xmlPullParserNewPullParser.nextTag();
                    C19366b c19366bM172275c = m172275c(xmlPullParserNewPullParser);
                    if (c19366bM172275c != null && (c19368d = c19366bM172275c.f152346b) != null && c19368d.f152349a != null) {
                        LrcWrapperBean lrcWrapperBean = new LrcWrapperBean(LrcWrapperBean.LrcWrapperType.LrcWrapperType_Migu);
                        ArrayList arrayList = new ArrayList();
                        Iterator<C19365a> it = c19366bM172275c.f152346b.f152349a.iterator();
                        while (it.hasNext()) {
                            arrayList.addAll(it.next().f152344a);
                        }
                        lrcWrapperBean.setLrcBeans(arrayList);
                        fileInputStream.close();
                        return lrcWrapperBean;
                    }
                    fileInputStream.close();
                    return null;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m172274b(XmlPullParser xmlPullParser, C19367c c19367c) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "general");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                    c19367c.f152347a = m172279g(xmlPullParser);
                } else if (name.equals("singer")) {
                    c19367c.f152348b = m172279g(xmlPullParser);
                } else {
                    m172281i(xmlPullParser);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static C19366b m172275c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        C19366b c19366b = new C19366b();
        xmlPullParser.require(2, null, MessageType.song);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("general")) {
                    C19367c c19367c = new C19367c();
                    c19366b.f152345a = c19367c;
                    m172274b(xmlPullParser, c19367c);
                } else if (name.equals("midi_lrc")) {
                    C19368d c19368d = new C19368d();
                    c19366b.f152346b = c19368d;
                    m172276d(xmlPullParser, c19368d);
                } else {
                    m172281i(xmlPullParser);
                }
            }
        }
        return c19366b;
    }

    /* JADX INFO: renamed from: d */
    public static void m172276d(XmlPullParser xmlPullParser, C19368d c19368d) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "midi_lrc");
        c19368d.f152349a = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("paragraph")) {
                    C19365a c19365a = new C19365a();
                    c19368d.f152349a.add(c19365a);
                    m172277e(xmlPullParser, c19365a);
                } else {
                    m172281i(xmlPullParser);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m172277e(XmlPullParser xmlPullParser, C19365a c19365a) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "paragraph");
        c19365a.f152344a = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("sentence")) {
                    LrcBean lrcBean = new LrcBean(new ArrayList());
                    c19365a.f152344a.add(lrcBean);
                    m172278f(xmlPullParser, lrcBean);
                } else {
                    m172281i(xmlPullParser);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m172278f(XmlPullParser xmlPullParser, LrcBean lrcBean) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "sentence");
        String attributeValue = xmlPullParser.getAttributeValue(null, "mode");
        if (attributeValue != null) {
            attributeValue.equals("man");
        }
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("tone")) {
                    LrcBean.Tone tone = new LrcBean.Tone();
                    lrcBean.tones.add(tone);
                    m172280h(xmlPullParser, tone);
                } else {
                    m172281i(xmlPullParser);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m172279g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.next() != 4) {
            return "";
        }
        String text = xmlPullParser.getText();
        xmlPullParser.nextTag();
        return text;
    }

    /* JADX INFO: renamed from: h */
    public static void m172280h(XmlPullParser xmlPullParser, LrcBean.Tone tone) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "tone");
        tone.begin = (long) (Float.parseFloat(xmlPullParser.getAttributeValue(null, "begin")) * 1000.0f);
        tone.end = (long) (Float.parseFloat(xmlPullParser.getAttributeValue(null, "end")) * 1000.0f);
        String attributeValue = xmlPullParser.getAttributeValue(null, "pitch");
        tone.pitch = (TextUtils.isEmpty(attributeValue) || !attributeValue.matches("[0-9]+")) ? 0 : Integer.parseInt(attributeValue);
        xmlPullParser.getAttributeValue(null, "pronounce");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "lang");
        if (attributeValue2 == null || "1".equals(attributeValue2)) {
            tone.lang = LrcBean.Lang.Chinese;
        } else {
            tone.lang = LrcBean.Lang.English;
        }
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("word")) {
                    tone.word = m172279g(xmlPullParser);
                } else {
                    m172281i(xmlPullParser);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m172281i(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            return;
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
