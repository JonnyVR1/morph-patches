package p149l;

import android.content.Context;
import com.cosmos.mdlog.MDLog;
import com.google.gson.Gson;
import com.immomo.momo.mulog.exception.MULogIllegalStateException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class inw {

    /* JADX INFO: renamed from: a */
    private static volatile boolean f114058a;

    /* JADX INFO: renamed from: b */
    private static Context f114059b;

    /* JADX INFO: renamed from: c */
    private static boolean f114060c;

    /* JADX INFO: renamed from: d */
    static String f114061d;

    /* JADX INFO: renamed from: e */
    static String f114062e;

    /* JADX INFO: renamed from: f */
    private static gvl f114063f;

    /* JADX INFO: renamed from: g */
    private static mgf0 f114064g;

    /* JADX INFO: renamed from: h */
    private static Map<String, kul> f114065h = new HashMap();

    /* JADX INFO: renamed from: i */
    private static hnw.InterfaceC17360e f114066i;

    /* JADX INFO: renamed from: j */
    private static hnw.AbstractC17359d f114067j;

    /* JADX INFO: renamed from: k */
    private static fvl f114068k;

    /* JADX INFO: renamed from: l */
    private static Gson f114069l;

    /* JADX INFO: renamed from: a */
    public static boolean m137163a() {
        return f114066i.mo98252d();
    }

    /* JADX INFO: renamed from: b */
    public static Context m137164b() {
        return f114059b;
    }

    /* JADX INFO: renamed from: c */
    public static Map m137165c() {
        return f114065h;
    }

    /* JADX INFO: renamed from: d */
    public static mgf0 m137166d() {
        return f114064g;
    }

    /* JADX INFO: renamed from: e */
    public static int m137167e() {
        return f114067j.mo98250b();
    }

    /* JADX INFO: renamed from: f */
    public static int m137168f() {
        return f114066i.mo98249a();
    }

    /* JADX INFO: renamed from: g */
    public static int m137169g() {
        return f114066i.mo98251c();
    }

    /* JADX INFO: renamed from: h */
    public static int m137170h() {
        return f114066i.mo98250b();
    }

    /* JADX INFO: renamed from: i */
    public static String[] m137171i() {
        Map<String, kul> map = f114065h;
        if (map != null) {
            return (String[]) map.keySet().toArray(new String[0]);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static fvl m137172j() {
        return f114068k;
    }

    /* JADX INFO: renamed from: k */
    public static gvl m137173k() {
        return f114063f;
    }

    /* JADX INFO: renamed from: l */
    public static Gson m137174l() {
        if (f114069l == null) {
            f114069l = new Gson();
        }
        return f114069l;
    }

    /* JADX INFO: renamed from: m */
    public static synchronized boolean m137175m() {
        return f114058a;
    }

    /* JADX INFO: renamed from: n */
    public static void m137176n(Context context, hnw hnwVar) {
        if (f114058a) {
            throw new MULogIllegalStateException("method init couldn't be called twice");
        }
        f114059b = context.getApplicationContext();
        f114060c = hnwVar.f108722a;
        f114061d = hnwVar.f108723b;
        f114062e = hnwVar.f108724c;
        f114064g = hnwVar.f108728g;
        f114066i = hnwVar.f108726e;
        f114067j = hnwVar.f108727f;
        f114068k = hnwVar.f108725d;
        f114063f = new rsm();
        for (kul kulVar : hnwVar.f108729h) {
            if (kulVar != null) {
                f114065h.put(kulVar.mo129122b(), kulVar);
                m137181s(kulVar.mo129122b() + " registered realtimeEnable = " + kulVar.mo129121a());
            }
        }
        f114058a = true;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m137177o() {
        return f114060c;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m137178p() {
        return f114067j.mo98253e();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m137179q() {
        return f114066i.mo98253e();
    }

    /* JADX INFO: renamed from: r */
    public static boolean m137180r() {
        return f114067j.f108731a;
    }

    /* JADX INFO: renamed from: s */
    public static void m137181s(String str) {
        if (f114060c) {
            MDLog.m7389d("MULog", str);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m137182t(String str) {
        if (f114060c) {
            MDLog.m7391e("MULog", str);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m137183u(Throwable th) {
        if (f114060c) {
            MDLog.printErrStackTrace("MULog", th);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m137184v(String str) {
        if (f114060c) {
            MDLog.m7399w("MUBusinessLog", str);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m137185w(String str) {
        if (f114060c) {
            MDLog.m7399w("MULog", str);
        }
    }
}
