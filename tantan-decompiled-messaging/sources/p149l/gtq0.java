package p149l;

import com.xiaomi.push.C14785j;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
public class gtq0 {

    /* JADX INFO: renamed from: c */
    private static gtq0 f104341c;

    /* JADX INFO: renamed from: a */
    private Map<String, Object> f104342a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    private Map<String, Object> f104343b = new ConcurrentHashMap();

    private gtq0() throws Throwable {
        m128002d();
    }

    /* JADX INFO: renamed from: b */
    private String m127998b(String str, String str2) {
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
    public static synchronized gtq0 m127999c() {
        try {
            if (f104341c == null) {
                f104341c = new gtq0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f104341c;
    }

    /* JADX INFO: renamed from: f */
    private ClassLoader[] m128000f() {
        ClassLoader[] classLoaderArr = {gtq0.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
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
    public Object m128001a(String str, String str2) {
        return this.f104342a.get(m127998b(str, str2));
    }

    /* JADX INFO: renamed from: d */
    public void m128002d() throws Throwable {
        InputStream inputStreamOpenStream;
        try {
            for (ClassLoader classLoader : m128000f()) {
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
                                        String strM127998b = m127998b(strNextText, strNextText2);
                                        if (!this.f104343b.containsKey(strM127998b)) {
                                            try {
                                                Class<?> cls = Class.forName(strNextText3);
                                                if (etq0.class.isAssignableFrom(cls)) {
                                                    this.f104343b.put(strM127998b, cls.newInstance());
                                                } else if (C14785j.class.isAssignableFrom(cls)) {
                                                    this.f104343b.put(strM127998b, cls);
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
                                        String strM127998b2 = m127998b(strNextText4, strNextText5);
                                        if (!this.f104342a.containsKey(strM127998b2)) {
                                            try {
                                                Class<?> cls2 = Class.forName(strNextText6);
                                                if (ftq0.class.isAssignableFrom(cls2)) {
                                                    this.f104342a.put(strM127998b2, cls2.newInstance());
                                                } else if (btq0.class.isAssignableFrom(cls2)) {
                                                    this.f104342a.put(strM127998b2, cls2);
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
    public void m128003e(String str, String str2, Object obj) {
        if (!(obj instanceof ftq0) && !(obj instanceof Class)) {
            ig3.m135964a("Provider must be a PacketExtensionProvider or a Class instance.");
        } else {
            this.f104342a.put(m127998b(str, str2), obj);
        }
    }
}
