package p153l;

import com.cosmos.photon.push.service.PushService;
import com.xiaomi.push.C14885fi;
import com.xiaomi.push.C14935l;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
public class b1r0 {

    /* JADX INFO: renamed from: a */
    private XmlPullParser f74393a;

    public b1r0() {
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            this.f74393a = xmlPullParserNewPullParser;
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        } catch (XmlPullParserException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public g2r0 m101501a(byte[] bArr, u1r0 u1r0Var) throws XmlPullParserException, C14885fi, IOException {
        this.f74393a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
        this.f74393a.next();
        int eventType = this.f74393a.getEventType();
        String name = this.f74393a.getName();
        if (eventType != 2) {
            return null;
        }
        if (name.equals("message")) {
            return C14935l.m87440f(this.f74393a);
        }
        if (name.equals("iq")) {
            return C14935l.m87435a(this.f74393a, u1r0Var);
        }
        boolean zEquals = name.equals("presence");
        XmlPullParser xmlPullParser = this.f74393a;
        if (zEquals) {
            return C14935l.m87436b(xmlPullParser);
        }
        if (xmlPullParser.getName().equals("stream")) {
            return null;
        }
        if (this.f74393a.getName().equals("error")) {
            throw new C14885fi(C14935l.m87441g(this.f74393a));
        }
        boolean zEquals2 = this.f74393a.getName().equals("warning");
        XmlPullParser xmlPullParser2 = this.f74393a;
        if (!zEquals2) {
            xmlPullParser2.getName().equals(PushService.COMMAND_BIND);
            return null;
        }
        xmlPullParser2.next();
        this.f74393a.getName().equals("multi-login");
        return null;
    }
}
