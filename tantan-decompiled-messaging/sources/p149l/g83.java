package p149l;

import android.content.Context;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.data.NavigationCardIntent;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class g83 {

    /* JADX INFO: renamed from: a */
    public static boolean f101470a = false;

    /* JADX INFO: renamed from: b */
    public static int f101471b = 30;

    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m124738a() {
        Map<String, Object> mapM191729d = u4e.m191729d();
        mapM191729d.put("is_privileged", Boolean.valueOf(!CoreModule.m29935P().m94656g().mo35057e2()));
        if (m124739b()) {
            mapM191729d.put("message_see_boost_status", NavigationCardIntent.boosting);
            return mapM191729d;
        }
        if (CoreModule.m29935P().m94656g().mo35057e2()) {
            mapM191729d.put("message_see_boost_status", "to_buy_boost");
            return mapM191729d;
        }
        mapM191729d.put("message_see_boost_status", "to_use_boost");
        return mapM191729d;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m124739b() {
        j17 j17Var;
        C4732c c4732c = CoreModule.f17545c;
        return (c4732c == null || (j17Var = c4732c.f19576J0) == null || !j17Var.m139254F3()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m124740c(int i) {
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        return NullChecker.m81303a(userM169520na) && ((int) (((long) (((double) mqi0.m155944o()) - userM169520na.createdTime)) / 86400000)) < i;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m124741d() {
        return !CoreModule.f17545c.f19576J0.f115758j0.get().booleanValue() && CoreModule.f17545c.f19639e0.f149224N0.get().longValue() >= ((long) f101471b);
    }

    /* JADX INFO: renamed from: e */
    public static void m124742e() {
        CoreModule.f17545c.f19576J0.f115758j0.put(Boolean.FALSE);
        f101471b = (int) (CoreModule.f17545c.f19639e0.f149224N0.get().longValue() + 3);
    }

    /* JADX INFO: renamed from: f */
    public static void m124743f(Context context, boolean z, String str) {
        if (m124739b()) {
            m73.m153331k((Act) context);
        } else {
            x93.m207472h((Act) context, false, null, z, str);
        }
    }
}
