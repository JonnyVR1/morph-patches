package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.xiaomi.mipush.sdk.C14719c;
import com.xiaomi.mipush.sdk.C14722f;
import com.xiaomi.push.C14763hb;
import com.xiaomi.push.C14766he;
import com.xiaomi.push.EnumC14740gf;
import com.xiaomi.push.EnumC14750gp;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class evq0 {

    /* JADX INFO: renamed from: b */
    private static volatile evq0 f93373b;

    /* JADX INFO: renamed from: a */
    private final Context f93374a;

    private evq0(Context context) {
        this.f93374a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    private static evq0 m118308a(Context context) {
        if (f93373b == null) {
            synchronized (evq0.class) {
                try {
                    if (f93373b == null) {
                        f93373b = new evq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f93373b;
    }

    /* JADX INFO: renamed from: b */
    public static void m118309b(Context context, C14763hb c14763hb) {
        m118308a(context).m118311d(c14763hb, 0, true);
    }

    /* JADX INFO: renamed from: c */
    public static void m118310c(Context context, C14763hb c14763hb, boolean z) {
        m118308a(context).m118311d(c14763hb, 1, z);
    }

    /* JADX INFO: renamed from: d */
    private void m118311d(C14763hb c14763hb, int i, boolean z) {
        if (fvq0.m123356j(this.f93374a) || !fvq0.m123355i() || c14763hb == null || c14763hb.f62346a != EnumC14740gf.SendMessage || c14763hb.m85906a() == null || !z) {
            return;
        }
        ilq0.m137040m("click to start activity result:" + String.valueOf(i));
        C14766he c14766he = new C14766he(c14763hb.m85906a().m85728a(), false);
        c14766he.m85960c(EnumC14750gp.SDK_START_ACTIVITY.f62110a);
        c14766he.m85956b(c14763hb.m85913a());
        c14766he.m85964d(c14763hb.f62353b);
        HashMap map = new HashMap();
        c14766he.f62382a = map;
        map.put(LovePlanetStage.result, String.valueOf(i));
        C14722f.m85402h(this.f93374a).m85411D(c14766he, EnumC14740gf.Notification, false, false, null, true, c14763hb.f62353b, c14763hb.f62349a, true, false);
    }

    /* JADX INFO: renamed from: e */
    public static void m118312e(Context context, C14763hb c14763hb, boolean z) {
        m118308a(context).m118311d(c14763hb, 2, z);
    }

    /* JADX INFO: renamed from: f */
    public static void m118313f(Context context, C14763hb c14763hb, boolean z) {
        m118308a(context).m118311d(c14763hb, 3, z);
    }

    /* JADX INFO: renamed from: g */
    public static void m118314g(Context context, C14763hb c14763hb, boolean z) {
        m118308a(context).m118311d(c14763hb, 4, z);
    }

    /* JADX INFO: renamed from: h */
    public static void m118315h(Context context, C14763hb c14763hb, boolean z) {
        C14719c c14719cM85328c = C14719c.m85328c(context);
        if (TextUtils.isEmpty(c14719cM85328c.m85344q()) || TextUtils.isEmpty(c14719cM85328c.m85346t())) {
            m118308a(context).m118311d(c14763hb, 6, z);
        } else if (c14719cM85328c.m85351y()) {
            m118308a(context).m118311d(c14763hb, 7, z);
        } else {
            m118308a(context).m118311d(c14763hb, 5, z);
        }
    }
}
