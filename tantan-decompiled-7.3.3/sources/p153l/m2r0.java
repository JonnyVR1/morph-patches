package p153l;

import com.xiaomi.push.C14933j;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
public class m2r0 {

    /* JADX INFO: renamed from: c */
    private static m2r0 f134606c;

    /* JADX INFO: renamed from: a */
    private Map<String, Object> f134607a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    private Map<String, Object> f134608b = new ConcurrentHashMap();

    private m2r0() throws Throwable {
        m156886d();
    }

    /* JADX INFO: renamed from: b */
    private String m156882b(String str, String str2) {
        StringBuilder sb = new StringBuilder("<");
        sb.append(str);
        sb.append("/>");
        if (str != null) {
            sb.append("<");
            sb.append(str2);
            sb.append("/>");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static synchronized m2r0 m156883c() {
        try {
            if (f134606c == null) {
                f134606c = new m2r0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f134606c;
    }

    /* JADX INFO: renamed from: f */
    private ClassLoader[] m156884f() {
        ClassLoader[] classLoaderArr = {m2r0.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            ClassLoader classLoader = classLoaderArr[i];
            if (classLoader != null) {
                arrayList.add(classLoader);
            }
        }
        return (ClassLoader[]) arrayList.toArray(new ClassLoader[arrayList.size()]);
    }

    /* JADX INFO: renamed from: a */
    public Object m156885a(String str, String str2) {
        return this.f134607a.get(m156882b(str, str2));
    }

    /* JADX INFO: renamed from: d */
    public void m156886d() throws Throwable {
        InputStream inputStreamOpenStream;
        try {
            for (ClassLoader classLoader : m156884f()) {
                Enumeration<URL> resources = classLoader.getResources("META-INF/smack.providers");
                while (resources.hasMoreElements()) {
                    try {
                        inputStreamOpenStream = resources.nextElement().openStream();
                        try {
                            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                            xmlPullParserNewPullParser.setInput(inputStreamOpenStream, "UTF-8");
                            int eventType = xmlPullParserNewPullParser.getEventType();
                            do {
                                if (eventType == 2) {
                                    if (xmlPullParserNewPullParser.getName().equals("iqProvider")) {
                                        xmlPullParserNewPullParser.next();
                                        xmlPullParserNewPullParser.next();
                                        String strNextText = xmlPullParserNewPullParser.nextText();
                                        xmlPullParserNewPullParser.next();
                                        xmlPullParserNewPullParser.next();
                                        String strNextText2 = xmlPullParserNewPullParser.nextText();
                                        xmlPullParserNewPullParser.next();
                                        xmlPullParserNewPullParser.next();
                                        String strNextText3 = xmlPullParserNewPullParser.nextText();
                                        String strM156882b = m156882b(strNextText, strNextText2);
                                        if (!this.f134608b.containsKey(strM156882b)) {
                                            try {
                                                Class<?> cls = Class.forName(strNextText3);
                                                if (k2r0.class.isAssignableFrom(cls)) {
                                                    this.f134608b.put(strM156882b, cls.newInstance());
                                                } else if (C14933j.class.isAssignableFrom(cls)) {
                                                    this.f134608b.put(strM156882b, cls);
                                                }
                                            } catch (ClassNotFoundException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                    } else if (xmlPullParserNewPullParser.getName().equals("extensionProvider")) {
                                        xmlPullParserNewPullParser.next();
                                        xmlPullParserNewPullParser.next();
                                        String strNextText4 = xmlPullParserNewPullParser.nextText();
                                        xmlPullParserNewPullParser.next();
                                        xmlPullParserNewPullParser.next();
                                        String strNextText5 = xmlPullParserNewPullParser.nextText();
                                        xmlPullParserNewPullParser.next();
                                        xmlPullParserNewPullParser.next();
                                        String strNextText6 = xmlPullParserNewPullParser.nextText();
                                        String strM156882b2 = m156882b(strNextText4, strNextText5);
                                        if (!this.f134607a.containsKey(strM156882b2)) {
                                            try {
                                                Class<?> cls2 = Class.forName(strNextText6);
                                                if (l2r0.class.isAssignableFrom(cls2)) {
                                                    this.f134607a.put(strM156882b2, cls2.newInstance());
                                                } else if (h2r0.class.isAssignableFrom(cls2)) {
                                                    this.f134607a.put(strM156882b2, cls2);
                                                }
                                            } catch (ClassNotFoundException e2) {
                                                e2.printStackTrace();
                                            }
                                        }
                                    }
                                }
                                eventType = xmlPullParserNewPullParser.next();
                            } while (eventType != 1);
                            inputStreamOpenStream.close();
                        } catch (Throwable th) {
                            th = th;
                            try {
                                inputStreamOpenStream.close();
                            } catch (Exception unused) {
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStreamOpenStream = null;
                    }
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m156887e(String str, String str2, Object obj) {
        if (!(obj instanceof l2r0) && !(obj instanceof Class)) {
            wg3.m206174a("Provider must be a PacketExtensionProvider or a Class instance.");
        } else {
            this.f134607a.put(m156882b(str, str2), obj);
        }
    }
}
