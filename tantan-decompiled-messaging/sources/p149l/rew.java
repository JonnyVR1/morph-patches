package p149l;

import android.text.TextUtils;
import android.util.Xml;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcBean;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcWrapperBean;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public class rew {

    /* JADX INFO: renamed from: l.rew$a */
    public static class C19685a {

        /* JADX INFO: renamed from: a */
        public List<LrcBean> f159090a;
    }

    /* JADX INFO: renamed from: l.rew$b */
    public static class C19686b {

        /* JADX INFO: renamed from: a */
        public C19687c f159091a;

        /* JADX INFO: renamed from: b */
        public C19688d f159092b;
    }

    /* JADX INFO: renamed from: l.rew$c */
    public static class C19687c {

        /* JADX INFO: renamed from: a */
        public String f159093a;

        /* JADX INFO: renamed from: b */
        public String f159094b;
    }

    /* JADX INFO: renamed from: l.rew$d */
    public static class C19688d {

        /* JADX INFO: renamed from: a */
        public List<C19685a> f159095a;
    }

    /* JADX INFO: renamed from: a */
    public static LrcWrapperBean m179061a(File file) {
        C19688d c19688d;
        if (file != null && file.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                    xmlPullParserNewPullParser.setInput(fileInputStream, null);
                    xmlPullParserNewPullParser.nextTag();
                    C19686b c19686bM179063c = m179063c(xmlPullParserNewPullParser);
                    if (c19686bM179063c != null && (c19688d = c19686bM179063c.f159092b) != null && c19688d.f159095a != null) {
                        LrcWrapperBean lrcWrapperBean = new LrcWrapperBean(LrcWrapperBean.LrcWrapperType.LrcWrapperType_Migu);
                        ArrayList arrayList = new ArrayList();
                        Iterator<C19685a> it = c19686bM179063c.f159092b.f159095a.iterator();
                        while (it.hasNext()) {
                            arrayList.addAll(it.next().f159090a);
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
    public static void m179062b(XmlPullParser xmlPullParser, C19687c c19687c) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "general");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                    c19687c.f159093a = m179067g(xmlPullParser);
                } else if (name.equals("singer")) {
                    c19687c.f159094b = m179067g(xmlPullParser);
                } else {
                    m179069i(xmlPullParser);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static C19686b m179063c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        C19686b c19686b = new C19686b();
        xmlPullParser.require(2, null, MessageType.song);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("general")) {
                    C19687c c19687c = new C19687c();
                    c19686b.f159091a = c19687c;
                    m179062b(xmlPullParser, c19687c);
                } else if (name.equals("midi_lrc")) {
                    C19688d c19688d = new C19688d();
                    c19686b.f159092b = c19688d;
                    m179064d(xmlPullParser, c19688d);
                } else {
                    m179069i(xmlPullParser);
                }
            }
        }
        return c19686b;
    }

    /* JADX INFO: renamed from: d */
    public static void m179064d(XmlPullParser xmlPullParser, C19688d c19688d) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "midi_lrc");
        c19688d.f159095a = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("paragraph")) {
                    C19685a c19685a = new C19685a();
                    c19688d.f159095a.add(c19685a);
                    m179065e(xmlPullParser, c19685a);
                } else {
                    m179069i(xmlPullParser);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m179065e(XmlPullParser xmlPullParser, C19685a c19685a) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "paragraph");
        c19685a.f159090a = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("sentence")) {
                    LrcBean lrcBean = new LrcBean(new ArrayList());
                    c19685a.f159090a.add(lrcBean);
                    m179066f(xmlPullParser, lrcBean);
                } else {
                    m179069i(xmlPullParser);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m179066f(XmlPullParser xmlPullParser, LrcBean lrcBean) throws XmlPullParserException, IOException {
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
                    m179068h(xmlPullParser, tone);
                } else {
                    m179069i(xmlPullParser);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m179067g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.next() != 4) {
            return "";
        }
        String text = xmlPullParser.getText();
        xmlPullParser.nextTag();
        return text;
    }

    /* JADX INFO: renamed from: h */
    public static void m179068h(XmlPullParser xmlPullParser, LrcBean.Tone tone) throws XmlPullParserException, IOException {
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
                    tone.word = m179067g(xmlPullParser);
                } else {
                    m179069i(xmlPullParser);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m179069i(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
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
