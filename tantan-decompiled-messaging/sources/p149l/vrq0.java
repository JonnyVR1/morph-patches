package p149l;

import com.cosmos.photon.push.service.PushService;
import com.xiaomi.push.C14737fi;
import com.xiaomi.push.C14787l;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
public class vrq0 {

    /* JADX INFO: renamed from: a */
    private XmlPullParser f182744a;

    public vrq0() {
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            this.f182744a = xmlPullParserNewPullParser;
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        } catch (XmlPullParserException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public atq0 m199749a(byte[] bArr, osq0 osq0Var) throws XmlPullParserException, C14737fi, IOException {
        this.f182744a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
        this.f182744a.next();
        int eventType = this.f182744a.getEventType();
        String name = this.f182744a.getName();
        if (eventType != 2) {
            return null;
        }
        if (name.equals("message")) {
            return C14787l.m86269f(this.f182744a);
        }
        if (name.equals("iq")) {
            return C14787l.m86264a(this.f182744a, osq0Var);
        }
        boolean zEquals = name.equals("presence");
        XmlPullParser xmlPullParser = this.f182744a;
        if (zEquals) {
            return C14787l.m86265b(xmlPullParser);
        }
        if (xmlPullParser.getName().equals("stream")) {
            return null;
        }
        if (this.f182744a.getName().equals("error")) {
            throw new C14737fi(C14787l.m86270g(this.f182744a));
        }
        boolean zEquals2 = this.f182744a.getName().equals("warning");
        XmlPullParser xmlPullParser2 = this.f182744a;
        if (!zEquals2) {
            xmlPullParser2.getName().equals(PushService.COMMAND_BIND);
            return null;
        }
        xmlPullParser2.next();
        this.f182744a.getName().equals("multi-login");
        return null;
    }
}
