package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import java.util.TimeZone;
import l.mqi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class vdj {
    /* JADX INFO: renamed from: a */
    public static boolean m25804a() {
        return !m25805b();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m25805b() {
        if (ogl0.f18231a == 0) {
            User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
            if (userM21483na == null) {
                ogl0.f18231a = -1;
            } else {
                ogl0.f18231a = mqi0.F((long) userM21483na.createdTime, TimeZone.getTimeZone("Asia/Shanghai")) ? 1 : -1;
            }
        }
        return ogl0.f18231a > 0;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m25806c() {
        return m25804a() || CoreModule.f1534c.f3628e0.m21483na().isVIP();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m25807d() {
        return m25804a() || nkp.m20159e();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m25808e() {
        return CoreModule.f1534c.f3628e0.m21483na().isVIP();
    }
}
