package p149l;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.beatles.NetConnectivityReceiver;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class nt2 {

    /* JADX INFO: renamed from: a */
    public static boolean f140309a = false;

    /* JADX INFO: renamed from: b */
    public static swv f140310b = null;

    /* JADX INFO: renamed from: c */
    public static w9k0 f140311c = null;

    /* JADX INFO: renamed from: d */
    public static boolean f140312d = false;

    /* JADX INFO: renamed from: e */
    public static Context f140313e = null;

    /* JADX INFO: renamed from: f */
    public static long f140314f = 0;

    /* JADX INFO: renamed from: g */
    public static int f140315g = 0;

    /* JADX INFO: renamed from: h */
    public static String f140316h = "";

    /* JADX INFO: renamed from: i */
    public static boolean f140317i;

    /* JADX INFO: renamed from: k */
    public static usl f140319k;

    /* JADX INFO: renamed from: l */
    public static String f140320l;

    /* JADX INFO: renamed from: m */
    public static nuj0 f140321m;

    /* JADX INFO: renamed from: o */
    public static volatile boolean f140323o;

    /* JADX INFO: renamed from: p */
    public static String f140324p;

    /* JADX INFO: renamed from: q */
    public static String f140325q;

    /* JADX INFO: renamed from: r */
    public static wod0 f140326r;

    /* JADX INFO: renamed from: j */
    public static ArrayList<Class> f140318j = new ArrayList<>();

    /* JADX INFO: renamed from: n */
    public static pif0<Object> f140322n = new C18764a();

    /* JADX INFO: renamed from: l.nt2$a */
    public class C18764a extends pif0<Object> {
    }

    /* JADX INFO: renamed from: A */
    public static void m160801A(Date date, String str, long j, @Nullable ytj0 ytj0Var) {
        swv swvVar = f140310b;
        if (swvVar == null) {
            vx00.m200472b("Please init Beatles!!!", new Object[0]);
        } else {
            swvVar.m186374m(date, str, j, ytj0Var);
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m160802B(List<Date> list, @Nullable String str, @Nullable long j, @Nullable ytj0 ytj0Var) {
        if (list == null || list.size() < 1) {
            return;
        }
        Iterator<Date> it = list.iterator();
        while (it.hasNext()) {
            m160801A(it.next(), str, j, ytj0Var);
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m160803C(boolean z) {
        f140323o = z;
    }

    /* JADX INFO: renamed from: D */
    public static void m160804D(usl uslVar) {
        f140319k = uslVar;
    }

    /* JADX INFO: renamed from: E */
    public static void m160805E(boolean z) {
        f140317i = z;
    }

    /* JADX INFO: renamed from: F */
    public static void m160806F(String str) {
        f140325q = str;
    }

    /* JADX INFO: renamed from: G */
    public static void m160807G(String str) {
        f140324p = str;
    }

    /* JADX INFO: renamed from: H */
    public static void m160808H(int i) {
        f140315g = i;
    }

    /* JADX INFO: renamed from: I */
    public static void m160809I(String str) {
        f140316h = str;
    }

    /* JADX INFO: renamed from: a */
    public static void m160810a(Class... clsArr) {
        if (clsArr != null) {
            f140318j.addAll(Arrays.asList(clsArr));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m160811b(ifi0... ifi0VarArr) {
        if (ifi0VarArr == null) {
            return;
        }
        if (!f140312d) {
            vx00.m200472b("Please init Beatles first!", new Object[0]);
            return;
        }
        for (ifi0 ifi0Var : ifi0VarArr) {
            f140311c.m202320k().add(ifi0Var);
            ifi0Var.m135925n(f140313e);
            zzb.m221009b().m221010a(ifi0Var.mo81142k());
        }
    }

    /* JADX INFO: renamed from: c */
    public static List<Date> m160812c() {
        swv swvVar = f140310b;
        if (swvVar != null) {
            return swvVar.m186371j();
        }
        vx00.m200472b("Please init Beatles and Enable log!!!", new Object[0]);
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m160813d() {
        return f140320l;
    }

    /* JADX INFO: renamed from: e */
    public static Context m160814e() {
        return f140313e;
    }

    /* JADX INFO: renamed from: f */
    public static String m160815f() {
        m3f m3fVarM202313d;
        return (f140312d && (m3fVarM202313d = f140311c.m202313d()) != null) ? m3fVarM202313d.mo152851c() : "";
    }

    /* JADX INFO: renamed from: g */
    public static ArrayList<Class> m160816g() {
        return f140318j;
    }

    /* JADX INFO: renamed from: h */
    public static k850 m160817h() {
        usl uslVar = f140319k;
        if (uslVar == null) {
            return null;
        }
        return uslVar.mo98939a();
    }

    /* JADX INFO: renamed from: i */
    public static usl m160818i() {
        return f140319k;
    }

    /* JADX INFO: renamed from: j */
    public static String m160819j() {
        return f140325q;
    }

    /* JADX INFO: renamed from: k */
    public static String m160820k() {
        return f140324p;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static sx00 m160821l(String str) {
        if (f140312d) {
            return f140311c.m202317h(str);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static <T> q2m<T> m160822m() {
        w9k0 w9k0Var = f140311c;
        if (w9k0Var.f185372j) {
            return w9k0Var.f185373k;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static wod0 m160823n() {
        return f140326r;
    }

    /* JADX INFO: renamed from: o */
    public static nuj0 m160824o() {
        return f140321m;
    }

    /* JADX INFO: renamed from: p */
    public static w9k0 m160825p() {
        return f140311c;
    }

    /* JADX INFO: renamed from: q */
    public static int m160826q() {
        return f140315g;
    }

    /* JADX INFO: renamed from: r */
    public static String m160827r() {
        return f140316h;
    }

    /* JADX INFO: renamed from: s */
    public static void m160828s(Context context, String str, @NonNull w9k0 w9k0Var, boolean z, wod0 wod0Var) {
        if (f140312d) {
            return;
        }
        f140326r = wod0Var;
        f140309a = z;
        f140320l = str;
        vx00.m200475e(z);
        if (context == null) {
            vx00.m200472b("[init] context of init() is null, check it.", new Object[0]);
            return;
        }
        if (w9k0Var == null) {
            vx00.m200472b("[init] userStrategy of init() is null, check it.", new Object[0]);
            return;
        }
        if (TextUtils.isEmpty(w9k0Var.m202314e())) {
            vx00.m200472b("[init] fileDir is invalid, check it.", new Object[0]);
            return;
        }
        f140313e = context;
        f140311c = w9k0Var;
        p460.m167371g(context);
        f140321m = new nuj0(w9k0Var.m202315f());
        sy0.m186558f((Application) context);
        for (sx00 sx00Var : w9k0Var.m202318i()) {
            sx00Var.mo81112g(context, w9k0Var.m202312c());
            m160833x(sx00Var);
        }
        if (f140311c.m202311b() && f140311c.m202316g() != null) {
            f140310b = new swv(context, f140311c);
            for (sx00 sx00Var2 : f140311c.m202318i()) {
                m160831v("[beatles]", sx00Var2.mo81107a() + " inited:" + sx00Var2.m186393h());
            }
        }
        w3f.m201297m().m201303l();
        NetConnectivityReceiver.registerConnectivityReceiver(context);
        f140312d = true;
        f140314f = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: t */
    public static boolean m160829t() {
        return f140323o;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m160830u() {
        return f140309a;
    }

    /* JADX INFO: renamed from: v */
    public static void m160831v(String str, String str2) {
        swv swvVar = f140310b;
        if (swvVar == null) {
            vx00.m200472b("Please init Beatles and Enable log!!!", new Object[0]);
        } else {
            swvVar.m186373l(str, str2);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m160832w() {
        if (f140312d) {
            w3f.m201297m().m201305o();
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m160833x(sx00 sx00Var) {
        s1f s1fVarMo81109d = sx00Var.mo81109d();
        if (s1fVarMo81109d != null) {
            r1f.m177462b(s1fVarMo81109d);
        }
        String eventType = sx00Var.getEventType();
        if (TextUtils.isEmpty(eventType)) {
            return;
        }
        f140321m.m161500n(eventType);
    }

    /* JADX INFO: renamed from: y */
    public static void m160834y(String str, long j) {
        if (str == null) {
            return;
        }
        ihi.m136203b(str, j);
    }

    /* JADX INFO: renamed from: z */
    public static void m160835z(List<File> list, @Nullable long j) {
        if (list == null) {
            return;
        }
        ihi.m136204c(list, j);
    }
}
