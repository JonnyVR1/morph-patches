package p149l;

import com.p046p1.mobile.putong.data.OMSData;
import com.vivo.push.PushClientConstants;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class usq0 {

    /* JADX INFO: renamed from: a */
    private static int f177998a = 5000;

    /* JADX INFO: renamed from: b */
    private static int f177999b = 330000;

    /* JADX INFO: renamed from: c */
    private static int f178000c = 600000;

    /* JADX INFO: renamed from: d */
    private static Vector<String> f178001d = new Vector<>();

    static {
        try {
            for (ClassLoader classLoader : m195231e()) {
                Enumeration<URL> resources = classLoader.getResources("META-INF/smack-config.xml");
                while (resources.hasMoreElements()) {
                    InputStream inputStreamOpenStream = null;
                    try {
                        try {
                            inputStreamOpenStream = resources.nextElement().openStream();
                            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                            xmlPullParserNewPullParser.setInput(inputStreamOpenStream, "UTF-8");
                            int eventType = xmlPullParserNewPullParser.getEventType();
                            do {
                                if (eventType == 2) {
                                    if (xmlPullParserNewPullParser.getName().equals(PushClientConstants.TAG_CLASS_NAME)) {
                                        m195230d(xmlPullParserNewPullParser);
                                    } else if (xmlPullParserNewPullParser.getName().equals("packetReplyTimeout")) {
                                        f177998a = m195228b(xmlPullParserNewPullParser, f177998a);
                                    } else if (xmlPullParserNewPullParser.getName().equals("keepAliveInterval")) {
                                        f177999b = m195228b(xmlPullParserNewPullParser, f177999b);
                                    } else if (xmlPullParserNewPullParser.getName().equals("mechName")) {
                                        f178001d.add(xmlPullParserNewPullParser.nextText());
                                    }
                                }
                                eventType = xmlPullParserNewPullParser.next();
                            } while (eventType != 1);
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenStream.close();
                            } catch (Exception unused) {
                            }
                            throw th;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        inputStreamOpenStream.close();
                    } catch (Exception unused2) {
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private usq0() {
    }

    /* JADX INFO: renamed from: a */
    public static int m195227a() {
        return f177999b;
    }

    /* JADX INFO: renamed from: b */
    private static int m195228b(XmlPullParser xmlPullParser, int i) {
        try {
            return Integer.parseInt(xmlPullParser.nextText());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return i;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m195229c() {
        return OMSData.OMS_CONFIG_VERSION;
    }

    /* JADX INFO: renamed from: d */
    private static void m195230d(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = xmlPullParser.nextText();
        try {
            Class.forName(strNextText);
        } catch (ClassNotFoundException unused) {
            System.err.println("Error! A startup class specified in smack-config.xml could not be loaded: " + strNextText);
        }
    }

    /* JADX INFO: renamed from: e */
    private static ClassLoader[] m195231e() {
        ClassLoader[] classLoaderArr = {usq0.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            ClassLoader classLoader = classLoaderArr[i];
            if (classLoader != null) {
                arrayList.add(classLoader);
            }
        }
        return (ClassLoader[]) arrayList.toArray(new ClassLoader[arrayList.size()]);
    }

    /* JADX INFO: renamed from: f */
    public static int m195232f() {
        return f178000c;
    }
}
