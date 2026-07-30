package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
public class vdj {
    /* JADX INFO: renamed from: a */
    public static boolean m197999a() {
        return !m198000b();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m198000b() {
        if (ogl0.f143878a == 0) {
            User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
            if (userM169520na == null) {
                ogl0.f143878a = -1;
            } else {
                ogl0.f143878a = mqi0.m155931F((long) userM169520na.createdTime, TimeZone.getTimeZone("Asia/Shanghai")) ? 1 : -1;
            }
        }
        return ogl0.f143878a > 0;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m198001c() {
        return m197999a() || CoreModule.f17545c.f19639e0.m169520na().isVIP();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m198002d() {
        return m197999a() || nkp.m159986e();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m198003e() {
        return CoreModule.f17545c.f19639e0.m169520na().isVIP();
    }
}
