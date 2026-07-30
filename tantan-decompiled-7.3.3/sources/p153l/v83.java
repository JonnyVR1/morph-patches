package p153l;

import android.content.Context;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.data.NavigationCardIntent;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class v83 {

    /* JADX INFO: renamed from: a */
    public static boolean f182846a = false;

    /* JADX INFO: renamed from: b */
    public static int f182847b = 30;

    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m200281a() {
        Map<String, Object> mapM138812d = i6e.m138812d();
        mapM138812d.put("is_privileged", Boolean.valueOf(!CoreModule.m30933P().m143410g().mo36060e2()));
        if (m200282b()) {
            mapM138812d.put("message_see_boost_status", NavigationCardIntent.boosting);
            return mapM138812d;
        }
        if (CoreModule.m30933P().m143410g().mo36060e2()) {
            mapM138812d.put("message_see_boost_status", "to_buy_boost");
            return mapM138812d;
        }
        mapM138812d.put("message_see_boost_status", "to_use_boost");
        return mapM138812d;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m200282b() {
        m27 m27Var;
        C4883c c4883c = CoreModule.f18264c;
        return (c4883c == null || (m27Var = c4883c.f20318J0) == null || !m27Var.m156766F3()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m200283c(int i) {
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        return NullChecker.m82486a(userM116593na) && ((int) (((long) (((double) pzi0.m174454o()) - userM116593na.createdTime)) / 86400000)) < i;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m200284d() {
        return !CoreModule.f18264c.f20318J0.f134520j0.get().booleanValue() && CoreModule.f18264c.f20381e0.f89081N0.get().longValue() >= ((long) f182847b);
    }

    /* JADX INFO: renamed from: e */
    public static void m200285e() {
        CoreModule.f18264c.f20318J0.f134520j0.put(Boolean.FALSE);
        f182847b = (int) (CoreModule.f18264c.f20381e0.f89081N0.get().longValue() + 3);
    }

    /* JADX INFO: renamed from: f */
    public static void m200286f(Context context, boolean z, String str) {
        if (m200282b()) {
            b83.m102909k((Act) context);
        } else {
            ma3.m157625h((Act) context, false, null, z, str);
        }
    }
}
