package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.xiaomi.mipush.sdk.C14867c;
import com.xiaomi.mipush.sdk.C14870f;
import com.xiaomi.push.C14911hb;
import com.xiaomi.push.C14914he;
import com.xiaomi.push.EnumC14888gf;
import com.xiaomi.push.EnumC14898gp;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class k4r0 {

    /* JADX INFO: renamed from: b */
    private static volatile k4r0 f123917b;

    /* JADX INFO: renamed from: a */
    private final Context f123918a;

    private k4r0(Context context) {
        this.f123918a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    private static k4r0 m148286a(Context context) {
        if (f123917b == null) {
            synchronized (k4r0.class) {
                try {
                    if (f123917b == null) {
                        f123917b = new k4r0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f123917b;
    }

    /* JADX INFO: renamed from: b */
    public static void m148287b(Context context, C14911hb c14911hb) {
        m148286a(context).m148289d(c14911hb, 0, true);
    }

    /* JADX INFO: renamed from: c */
    public static void m148288c(Context context, C14911hb c14911hb, boolean z) {
        m148286a(context).m148289d(c14911hb, 1, z);
    }

    /* JADX INFO: renamed from: d */
    private void m148289d(C14911hb c14911hb, int i, boolean z) {
        if (l4r0.m152825j(this.f123918a) || !l4r0.m152824i() || c14911hb == null || c14911hb.f63193a != EnumC14888gf.SendMessage || c14911hb.m87077a() == null || !z) {
            return;
        }
        ouq0.m169393m("click to start activity result:" + String.valueOf(i));
        C14914he c14914he = new C14914he(c14911hb.m87077a().m86899a(), false);
        c14914he.m87131c(EnumC14898gp.SDK_START_ACTIVITY.f62957a);
        c14914he.m87127b(c14911hb.m87084a());
        c14914he.m87135d(c14911hb.f63200b);
        HashMap map = new HashMap();
        c14914he.f63229a = map;
        map.put(LovePlanetStage.result, String.valueOf(i));
        C14870f.m86573h(this.f123918a).m86582D(c14914he, EnumC14888gf.Notification, false, false, null, true, c14911hb.f63200b, c14911hb.f63196a, true, false);
    }

    /* JADX INFO: renamed from: e */
    public static void m148290e(Context context, C14911hb c14911hb, boolean z) {
        m148286a(context).m148289d(c14911hb, 2, z);
    }

    /* JADX INFO: renamed from: f */
    public static void m148291f(Context context, C14911hb c14911hb, boolean z) {
        m148286a(context).m148289d(c14911hb, 3, z);
    }

    /* JADX INFO: renamed from: g */
    public static void m148292g(Context context, C14911hb c14911hb, boolean z) {
        m148286a(context).m148289d(c14911hb, 4, z);
    }

    /* JADX INFO: renamed from: h */
    public static void m148293h(Context context, C14911hb c14911hb, boolean z) {
        C14867c c14867cM86499c = C14867c.m86499c(context);
        if (TextUtils.isEmpty(c14867cM86499c.m86515q()) || TextUtils.isEmpty(c14867cM86499c.m86517t())) {
            m148286a(context).m148289d(c14911hb, 6, z);
        } else if (c14867cM86499c.m86522y()) {
            m148286a(context).m148289d(c14911hb, 7, z);
        } else {
            m148286a(context).m148289d(c14911hb, 5, z);
        }
    }
}
