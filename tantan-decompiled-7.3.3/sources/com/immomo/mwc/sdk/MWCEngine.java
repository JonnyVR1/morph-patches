package com.immomo.mwc.sdk;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.immomo.mwc.sdk.MWCEngine;
import com.immomo.mwc.sdk.utils.thread.C4079b;
import com.quickjs.QuickJSException;
import org.eclipse.jetty.util.StringUtil;
import org.json.JSONObject;
import p153l.aqd;
import p153l.b6g0;
import p153l.byl;
import p153l.hrw;
import p153l.iml;
import p153l.klw;
import p153l.krq;
import p153l.rde0;
import p153l.ro5;
import p153l.rqw;
import p153l.sqw;
import p153l.tqw;
import p153l.uzv;
import p153l.xqw;
import p153l.yqw;
import p153l.yse0;
import p153l.z84;

/* JADX INFO: loaded from: classes7.dex */
public class MWCEngine implements byl {

    /* JADX INFO: renamed from: b */
    private static int f14689b = 0;

    /* JADX INFO: renamed from: c */
    private static volatile boolean f14690c = false;

    /* JADX INFO: renamed from: d */
    private static volatile boolean f14691d = false;

    /* JADX INFO: renamed from: e */
    private static Context f14692e;

    /* JADX INFO: renamed from: f */
    private static volatile byl f14693f;

    /* JADX INFO: renamed from: g */
    private static iml f14694g;

    /* JADX INFO: renamed from: h */
    private static rde0 f14695h;

    /* JADX INFO: renamed from: i */
    private static b6g0 f14696i;

    /* JADX INFO: renamed from: j */
    private static yse0 f14697j;

    /* JADX INFO: renamed from: k */
    private static krq f14698k;

    /* JADX INFO: renamed from: l */
    private static klw f14699l;

    /* JADX INFO: renamed from: m */
    private static uzv f14700m;

    /* JADX INFO: renamed from: a */
    private final C4071b f14701a = C4071b.m20407k();

    public enum CodeType {
        JS,
        BINARY
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public static String m20338A(String str, String str2, String str3, JSONObject jSONObject) {
        String str4 = null;
        if (!m20346I() && !TextUtils.isEmpty(str)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strM20386f = WebResourcePool.m20386f(str2, str3, jSONObject);
            try {
                WebResourcePool.AbstractC4069b abstractC4069bM20384d = WebResourcePool.m20384d(str, strM20386f);
                if (abstractC4069bM20384d != null) {
                    str4 = abstractC4069bM20384d.m20400h() == 1 ? (String) abstractC4069bM20384d.m20399g() : null;
                    m20341D("MWCEngine", str, "[MK请求命中容器缓存]request:hit:cache: @url=%s, @status=%d, @ts=%d %s", str2, Integer.valueOf(abstractC4069bM20384d.m20400h()), Long.valueOf(hrw.m136930a()), "[STYLE:006929,d5f0db,aee3ba]");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            m20360k("MWCEngine", str, "check webResource cache cast: %d, data: %s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), str4);
            if (str4 == null && m20345H(str, str2)) {
                m20341D("MWCEngine", str, "[MK请求没有命中容器缓存]request:no:hit:cache: @url=%s, @key=%s, @ts=%d %s", str2, strM20386f, Long.valueOf(hrw.m136930a()), "[STYLE:fc0006,feedec,fdcccd]");
            }
        }
        return str4;
    }

    /* JADX INFO: renamed from: B */
    public static C4072c m20339B(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return C4071b.m20408t(str);
    }

    /* JADX INFO: renamed from: C */
    public static void m20340C(String str, String str2, String str3) {
        m20369t().mo99449f(str, str2, str3);
    }

    /* JADX INFO: renamed from: D */
    public static void m20341D(String str, String str2, String str3, Object... objArr) {
        m20369t().mo99447d(str, str2, str3, objArr);
    }

    /* JADX INFO: renamed from: E */
    public static void m20342E(@NonNull Context context, @NonNull xqw xqwVar) {
        if (f14691d) {
            return;
        }
        rqw.m182679d(context);
        m20343F(context, xqwVar);
        f14691d = true;
        m20352O();
    }

    /* JADX INFO: renamed from: F */
    private static void m20343F(Context context, @NonNull xqw xqwVar) {
        f14692e = context.getApplicationContext();
        f14694g = xqwVar.m212743a();
        xqwVar.m212744b();
        f14695h = xqwVar.m212748f();
        f14697j = xqwVar.m212749g();
        f14696i = xqwVar.m212750h();
        f14698k = xqwVar.m212745c();
        f14699l = xqwVar.m212747e();
        f14700m = xqwVar.m212746d();
        m20359j("MWCEngine", null, "MWCEngine config completed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static void m20344G() {
        try {
            m20366q();
        } catch (Throwable th) {
            m20362m("MWCEngine", null, "MWCEngine start failed @error=%s", th);
        }
    }

    /* JADX INFO: renamed from: H */
    public static boolean m20345H(String str, String str2) {
        return tqw.m192365c() && WebResourcePool.m20383c(str, str2);
    }

    /* JADX INFO: renamed from: I */
    public static boolean m20346I() {
        return !f14690c;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m20347J() {
        return f14690c;
    }

    /* JADX INFO: renamed from: K */
    public static void m20348K(int i, String str, String str2, String str3) {
        m20369t().mo99450g(i, str, str2, str3);
    }

    /* JADX INFO: renamed from: L */
    public static synchronized String m20349L() {
        int i;
        i = f14689b + 1;
        f14689b = i;
        return String.valueOf(i);
    }

    /* JADX INFO: renamed from: M */
    private void m20350M(Runnable runnable) {
        if (m20346I()) {
            m20359j("MWCEngine", null, "MWCEngine disabled, ignore the MWCEngine post event");
            return;
        }
        if (m20370u().m20415u()) {
            m20359j("MWCEngine", null, "MWCRuntime isInterrupted, ignore the MWCEngine post event");
        } else if (Thread.currentThread() == m20370u().m20414q()) {
            runnable.run();
        } else {
            m20370u().m20416v(runnable);
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m20351N(boolean z) {
        f14690c = z;
    }

    /* JADX INFO: renamed from: O */
    private static void m20352O() {
        C4079b.m20450d(2, new Runnable() { // from class: l.vqw
            @Override // java.lang.Runnable
            public final void run() {
                MWCEngine.m20344G();
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public static void m20353P(String str, String str2, String str3) {
        m20369t().mo99451h(str, str2, str3);
    }

    /* JADX INFO: renamed from: Q */
    public static void m20354Q(String str, String str2, String str3, Object... objArr) {
        m20369t().mo99448e(str, str2, str3, objArr);
    }

    /* JADX INFO: renamed from: i */
    public static void m20358i(String str) {
        m20369t().mo99444a(str);
    }

    /* JADX INFO: renamed from: j */
    public static void m20359j(String str, String str2, String str3) {
        m20369t().mo99446c(str, str2, str3);
    }

    /* JADX INFO: renamed from: k */
    public static void m20360k(String str, String str2, String str3, Object... objArr) {
        m20369t().mo99452i(str, str2, str3, objArr);
    }

    /* JADX INFO: renamed from: l */
    public static void m20361l(String str, String str2, String str3) {
        m20369t().mo99445b(str, str2, str3);
    }

    /* JADX INFO: renamed from: m */
    public static void m20362m(String str, String str2, String str3, Object... objArr) {
        m20369t().mo99453j(str, str2, str3, objArr);
    }

    /* JADX INFO: renamed from: n */
    public static Context m20363n() {
        return f14692e;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m20364o() {
        return f14690c;
    }

    /* JADX INFO: renamed from: p */
    public static iml m20365p() {
        return f14694g;
    }

    /* JADX INFO: renamed from: q */
    public static byl m20366q() {
        if (!f14691d) {
            return new yqw();
        }
        if (f14693f == null) {
            synchronized (MWCEngine.class) {
                try {
                    if (f14693f == null) {
                        try {
                            f14693f = new MWCEngine();
                            m20359j("MWCEngine", null, "MWCEngine has started");
                        } catch (Throwable th) {
                            m20362m("MWCEngine", null, "MWCEngine start exception @instance=%s, @error=%s", "" + f14693f, th);
                            if (f14693f == null) {
                                f14693f = new yqw();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f14693f;
    }

    /* JADX INFO: renamed from: r */
    public static String m20367r() {
        String str = sqw.f170272a;
        krq krqVar = f14698k;
        if (krqVar != null) {
            try {
                String strMo112087a = krqVar.mo112087a();
                if (!TextUtils.isEmpty(strMo112087a)) {
                    str = strMo112087a;
                }
            } catch (Throwable th) {
                m20354Q("MWCEngine", null, "get:jsf:from:offline:package:exception @error=%s", th);
            }
        }
        m20360k("MWCEngine", null, "jsf:path @path=%s", str);
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    /* JADX INFO: renamed from: s */
    public static String m20368s() {
        String strMo112088b;
        krq krqVar = f14698k;
        if (krqVar != null) {
            strMo112088b = krqVar.mo112088b();
            if (TextUtils.isEmpty(strMo112088b)) {
                strMo112088b = StringUtil.ALL_INTERFACES;
            }
        } else {
            strMo112088b = StringUtil.ALL_INTERFACES;
        }
        m20360k("MWCEngine", null, "jsf:version @version=%s", strMo112088b);
        return strMo112088b;
    }

    /* JADX INFO: renamed from: t */
    private static uzv m20369t() {
        if (f14700m == null) {
            synchronized (MWCEngine.class) {
                f14700m = new aqd();
            }
        }
        return f14700m;
    }

    /* JADX INFO: renamed from: u */
    private C4071b m20370u() {
        return this.f14701a;
    }

    /* JADX INFO: renamed from: v */
    public static klw m20371v() {
        return f14699l;
    }

    /* JADX INFO: renamed from: w */
    public static rde0 m20372w() {
        return f14695h;
    }

    /* JADX INFO: renamed from: x */
    public static yse0 m20373x() {
        return f14697j;
    }

    /* JADX INFO: renamed from: y */
    public static b6g0 m20374y() {
        return f14696i;
    }

    /* JADX INFO: renamed from: z */
    public static String m20375z(String str) {
        C4072c c4072cM20339B = m20339B(str);
        String strM20425h = c4072cM20339B != null ? c4072cM20339B.m20425h() : StringUtil.ALL_INTERFACES;
        return "jsf:" + m20368s() + ",sw:" + strM20425h;
    }

    @Override // p153l.byl
    /* JADX INFO: renamed from: a */
    public Object mo20376a(String str) throws QuickJSException {
        return m20370u().m20413n(str);
    }

    @Override // p153l.byl
    /* JADX INFO: renamed from: b */
    public void mo20377b(final EventType eventType, final String str, final JSONObject jSONObject, @Nullable final z84 z84Var) {
        m20350M(new Runnable() { // from class: l.wqw
            @Override // java.lang.Runnable
            public final void run() {
                this.f190437a.m20370u().m20410H(eventType, str, jSONObject, z84Var);
            }
        });
    }

    @Override // p153l.byl
    /* JADX INFO: renamed from: c */
    public Object mo20378c(String str, String str2) throws QuickJSException {
        return m20370u().m20412m(str, str2);
    }

    @Override // p153l.byl
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public MWCEngine mo20379d(@NonNull final C4072c c4072c, final ro5 ro5Var) {
        m20350M(new Runnable() { // from class: l.uqw
            @Override // java.lang.Runnable
            public final void run() {
                this.f180513a.m20370u().m20411d(c4072c, ro5Var);
            }
        });
        return this;
    }
}
