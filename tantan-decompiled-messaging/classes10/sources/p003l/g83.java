package p003l;

import android.content.Context;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.c;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import l.j17;
import l.mqi0;
import l.u4e;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class g83 {

    /* JADX INFO: renamed from: a */
    public static boolean f4588a = false;

    /* JADX INFO: renamed from: b */
    public static int f4589b = 30;

    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m6608a() {
        Map<String, Object> mapD = u4e.d();
        mapD.put("is_privileged", Boolean.valueOf(!CoreModule.P().g().e2()));
        if (m6609b()) {
            mapD.put("message_see_boost_status", "boosting");
            return mapD;
        }
        if (CoreModule.P().g().e2()) {
            mapD.put("message_see_boost_status", "to_buy_boost");
            return mapD;
        }
        mapD.put("message_see_boost_status", "to_use_boost");
        return mapD;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6609b() {
        j17 j17Var;
        c cVar = CoreModule.c;
        return (cVar == null || (j17Var = cVar.J0) == null || !j17Var.F3()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m6610c(int i) {
        User userNa = CoreModule.c.e0.na();
        return NullChecker.a(userNa) && ((int) (((long) (((double) mqi0.o()) - userNa.createdTime)) / 86400000)) < i;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m6611d() {
        return !((Boolean) CoreModule.c.J0.j0.get()).booleanValue() && ((Long) CoreModule.c.e0.N0.get()).longValue() >= ((long) f4589b);
    }

    /* JADX INFO: renamed from: e */
    public static void m6612e() {
        CoreModule.c.J0.j0.put(Boolean.FALSE);
        f4589b = (int) (((Long) CoreModule.c.e0.N0.get()).longValue() + 3);
    }

    /* JADX INFO: renamed from: f */
    public static void m6613f(Context context, boolean z, String str) {
        if (m6609b()) {
            m73.m7995k((Act) context);
        } else {
            x93.m10707h((Act) context, false, null, z, str);
        }
    }
}
