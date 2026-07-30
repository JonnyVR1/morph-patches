package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
public class pgj {
    /* JADX INFO: renamed from: a */
    public static boolean m172244a() {
        return !m172245b();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m172245b() {
        if (spl0.f170059a == 0) {
            User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
            if (userM116593na == null) {
                spl0.f170059a = -1;
            } else {
                spl0.f170059a = pzi0.m174441F((long) userM116593na.createdTime, TimeZone.getTimeZone("Asia/Shanghai")) ? 1 : -1;
            }
        }
        return spl0.f170059a > 0;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m172246c() {
        return m172244a() || CoreModule.f18264c.f20381e0.m116593na().isVIP();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m172247d() {
        return m172244a() || nmp.m163836e();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m172248e() {
        return CoreModule.f18264c.f20381e0.m116593na().isVIP();
    }
}
