package com.immomo.mwc.sdk;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.immomo.mmutil.task.C3804c;
import com.immomo.mwc.sdk.MWCEngine;
import com.quickjs.QuickJSException;
import org.eclipse.jetty.util.StringUtil;
import org.json.JSONObject;
import p149l.a84;
import p149l.iow;
import p149l.jvl;
import p149l.kpq;
import p149l.m5e0;
import p149l.nn5;
import p149l.piw;
import p149l.rjl;
import p149l.tke0;
import p149l.tnw;
import p149l.txf0;
import p149l.unw;
import p149l.vod;
import p149l.xxv;
import p149l.ynw;
import p149l.znw;

/* JADX INFO: loaded from: classes7.dex */
public class MWCEngine implements jvl {

    /* JADX INFO: renamed from: b */
    private static int f13995b = 0;

    /* JADX INFO: renamed from: c */
    private static volatile boolean f13996c = false;

    /* JADX INFO: renamed from: d */
    private static volatile boolean f13997d = false;

    /* JADX INFO: renamed from: e */
    private static Context f13998e;

    /* JADX INFO: renamed from: f */
    private static volatile jvl f13999f;

    /* JADX INFO: renamed from: g */
    private static rjl f14000g;

    /* JADX INFO: renamed from: h */
    private static m5e0 f14001h;

    /* JADX INFO: renamed from: i */
    private static txf0 f14002i;

    /* JADX INFO: renamed from: j */
    private static tke0 f14003j;

    /* JADX INFO: renamed from: k */
    private static kpq f14004k;

    /* JADX INFO: renamed from: l */
    private static piw f14005l;

    /* JADX INFO: renamed from: m */
    private static xxv f14006m;

    /* JADX INFO: renamed from: a */
    private final C3928b f14007a = C3928b.m19427k();

    public enum CodeType {
        JS,
        BINARY
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public static String m19358A(String str, String str2, String str3, JSONObject jSONObject) {
        String str4 = null;
        if (!m19366I() && !TextUtils.isEmpty(str)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strM19406f = WebResourcePool.m19406f(str2, str3, jSONObject);
            try {
                WebResourcePool.AbstractC3926b abstractC3926bM19404d = WebResourcePool.m19404d(str, strM19406f);
                if (abstractC3926bM19404d != null) {
                    str4 = abstractC3926bM19404d.m19420h() == 1 ? (String) abstractC3926bM19404d.m19419g() : null;
                    m19361D("MWCEngine", str, "[MK请求命中容器缓存]request:hit:cache: @url=%s, @status=%d, @ts=%d %s", str2, Integer.valueOf(abstractC3926bM19404d.m19420h()), Long.valueOf(iow.m137389a()), "[STYLE:006929,d5f0db,aee3ba]");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            m19380k("MWCEngine", str, "check webResource cache cast: %d, data: %s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), str4);
            if (str4 == null && m19365H(str, str2)) {
                m19361D("MWCEngine", str, "[MK请求没有命中容器缓存]request:no:hit:cache: @url=%s, @key=%s, @ts=%d %s", str2, strM19406f, Long.valueOf(iow.m137389a()), "[STYLE:fc0006,feedec,fdcccd]");
            }
        }
        return str4;
    }

    /* JADX INFO: renamed from: B */
    public static C3929c m19359B(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return C3928b.m19428t(str);
    }

    /* JADX INFO: renamed from: C */
    public static void m19360C(String str, String str2, String str3) {
        m19389t().mo122538f(str, str2, str3);
    }

    /* JADX INFO: renamed from: D */
    public static void m19361D(String str, String str2, String str3, Object... objArr) {
        m19389t().mo122536d(str, str2, str3, objArr);
    }

    /* JADX INFO: renamed from: E */
    public static void m19362E(@NonNull Context context, @NonNull ynw ynwVar) {
        if (f13997d) {
            return;
        }
        m19363F(context, ynwVar);
        f13997d = true;
        m19372O();
    }

    /* JADX INFO: renamed from: F */
    private static void m19363F(Context context, @NonNull ynw ynwVar) {
        f13998e = context.getApplicationContext();
        f14000g = ynwVar.m215443a();
        ynwVar.m215444b();
        f14001h = ynwVar.m215448f();
        f14003j = ynwVar.m215449g();
        f14002i = ynwVar.m215450h();
        f14004k = ynwVar.m215445c();
        f14005l = ynwVar.m215447e();
        f14006m = ynwVar.m215446d();
        m19379j("MWCEngine", null, "MWCEngine config completed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static void m19364G() {
        try {
            m19386q();
        } catch (Throwable th) {
            m19382m("MWCEngine", null, "MWCEngine start failed @error=%s", th);
        }
    }

    /* JADX INFO: renamed from: H */
    public static boolean m19365H(String str, String str2) {
        return unw.m194528c() && WebResourcePool.m19403c(str, str2);
    }

    /* JADX INFO: renamed from: I */
    public static boolean m19366I() {
        return !f13996c;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m19367J() {
        return f13996c;
    }

    /* JADX INFO: renamed from: K */
    public static void m19368K(int i, String str, String str2, String str3) {
        m19389t().mo122539g(i, str, str2, str3);
    }

    /* JADX INFO: renamed from: L */
    public static synchronized String m19369L() {
        int i;
        i = f13995b + 1;
        f13995b = i;
        return String.valueOf(i);
    }

    /* JADX INFO: renamed from: M */
    private void m19370M(Runnable runnable) {
        if (m19366I()) {
            m19379j("MWCEngine", null, "MWCEngine disabled, ignore the MWCEngine post event");
            return;
        }
        if (m19390u().m19435u()) {
            m19379j("MWCEngine", null, "MWCRuntime isInterrupted, ignore the MWCEngine post event");
        } else if (Thread.currentThread() == m19390u().m19434q()) {
            runnable.run();
        } else {
            m19390u().m19436v(runnable);
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m19371N(boolean z) {
        f13996c = z;
    }

    /* JADX INFO: renamed from: O */
    private static void m19372O() {
        C3804c.m18444d(2, new Runnable() { // from class: l.xnw
            @Override // java.lang.Runnable
            public final void run() {
                MWCEngine.m19364G();
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public static void m19373P(String str, String str2, String str3) {
        m19389t().mo122540h(str, str2, str3);
    }

    /* JADX INFO: renamed from: Q */
    public static void m19374Q(String str, String str2, String str3, Object... objArr) {
        m19389t().mo122537e(str, str2, str3, objArr);
    }

    /* JADX INFO: renamed from: i */
    public static void m19378i(String str) {
        m19389t().mo122533a(str);
    }

    /* JADX INFO: renamed from: j */
    public static void m19379j(String str, String str2, String str3) {
        m19389t().mo122535c(str, str2, str3);
    }

    /* JADX INFO: renamed from: k */
    public static void m19380k(String str, String str2, String str3, Object... objArr) {
        m19389t().mo122541i(str, str2, str3, objArr);
    }

    /* JADX INFO: renamed from: l */
    public static void m19381l(String str, String str2, String str3) {
        m19389t().mo122534b(str, str2, str3);
    }

    /* JADX INFO: renamed from: m */
    public static void m19382m(String str, String str2, String str3, Object... objArr) {
        m19389t().mo122542j(str, str2, str3, objArr);
    }

    /* JADX INFO: renamed from: n */
    public static Context m19383n() {
        return f13998e;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m19384o() {
        return f13996c;
    }

    /* JADX INFO: renamed from: p */
    public static rjl m19385p() {
        return f14000g;
    }

    /* JADX INFO: renamed from: q */
    public static jvl m19386q() {
        if (!f13997d) {
            return new znw();
        }
        if (f13999f == null) {
            synchronized (MWCEngine.class) {
                try {
                    if (f13999f == null) {
                        try {
                            f13999f = new MWCEngine();
                            m19379j("MWCEngine", null, "MWCEngine has started");
                        } catch (Throwable th) {
                            m19382m("MWCEngine", null, "MWCEngine start exception @instance=%s, @error=%s", "" + f13999f, th);
                            if (f13999f == null) {
                                f13999f = new znw();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f13999f;
    }

    /* JADX INFO: renamed from: r */
    public static String m19387r() {
        String str = tnw.f171288a;
        kpq kpqVar = f14004k;
        if (kpqVar != null) {
            try {
                String strMo112828a = kpqVar.mo112828a();
                if (!TextUtils.isEmpty(strMo112828a)) {
                    str = strMo112828a;
                }
            } catch (Throwable th) {
                m19374Q("MWCEngine", null, "get:jsf:from:offline:package:exception @error=%s", th);
            }
        }
        m19380k("MWCEngine", null, "jsf:path @path=%s", str);
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    /* JADX INFO: renamed from: s */
    public static String m19388s() {
        String strMo112829b;
        kpq kpqVar = f14004k;
        if (kpqVar != null) {
            strMo112829b = kpqVar.mo112829b();
            if (TextUtils.isEmpty(strMo112829b)) {
                strMo112829b = StringUtil.ALL_INTERFACES;
            }
        } else {
            strMo112829b = StringUtil.ALL_INTERFACES;
        }
        m19380k("MWCEngine", null, "jsf:version @version=%s", strMo112829b);
        return strMo112829b;
    }

    /* JADX INFO: renamed from: t */
    private static xxv m19389t() {
        if (f14006m == null) {
            synchronized (MWCEngine.class) {
                f14006m = new vod();
            }
        }
        return f14006m;
    }

    /* JADX INFO: renamed from: u */
    private C3928b m19390u() {
        return this.f14007a;
    }

    /* JADX INFO: renamed from: v */
    public static piw m19391v() {
        return f14005l;
    }

    /* JADX INFO: renamed from: w */
    public static m5e0 m19392w() {
        return f14001h;
    }

    /* JADX INFO: renamed from: x */
    public static tke0 m19393x() {
        return f14003j;
    }

    /* JADX INFO: renamed from: y */
    public static txf0 m19394y() {
        return f14002i;
    }

    /* JADX INFO: renamed from: z */
    public static String m19395z(String str) {
        C3929c c3929cM19359B = m19359B(str);
        String strM19445h = c3929cM19359B != null ? c3929cM19359B.m19445h() : StringUtil.ALL_INTERFACES;
        return "jsf:" + m19388s() + ",sw:" + strM19445h;
    }

    @Override // p149l.jvl
    /* JADX INFO: renamed from: a */
    public Object mo19396a(String str) throws QuickJSException {
        return m19390u().m19433n(str);
    }

    @Override // p149l.jvl
    /* JADX INFO: renamed from: b */
    public void mo19397b(final EventType eventType, final String str, final JSONObject jSONObject, @Nullable final a84 a84Var) {
        m19370M(new Runnable() { // from class: l.wnw
            @Override // java.lang.Runnable
            public final void run() {
                this.f187350a.m19390u().m19430H(eventType, str, jSONObject, a84Var);
            }
        });
    }

    @Override // p149l.jvl
    /* JADX INFO: renamed from: c */
    public Object mo19398c(String str, String str2) throws QuickJSException {
        return m19390u().m19432m(str, str2);
    }

    @Override // p149l.jvl
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public MWCEngine mo19399d(@NonNull final C3929c c3929c, final nn5 nn5Var) {
        m19370M(new Runnable() { // from class: l.vnw
            @Override // java.lang.Runnable
            public final void run() {
                this.f182286a.m19390u().m19431d(c3929c, nn5Var);
            }
        });
        return this;
    }
}
