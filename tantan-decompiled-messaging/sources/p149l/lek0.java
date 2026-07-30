package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.immomo.momosec.Coded;
import com.immomo.momosec.network.C3917a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class lek0 {

    /* JADX INFO: renamed from: a */
    public static volatile String f127708a;

    /* JADX INFO: renamed from: c */
    public static final String f127710c = rjw.m179664a(new byte[]{99, 37, 94, 89, 7, 15, 87});

    /* JADX INFO: renamed from: d */
    private static final String f127711d = rjw.m179664a(new byte[]{68, 3, 66, 67, 37, 7, 68, 7, 2});

    /* JADX INFO: renamed from: i */
    private static final String f127716i = rjw.m179664a(new byte[]{88, 18, 69, 71, 18, 92, 31, 73, 80, 71, 17, 75, 92, 9, 86, 26, 14, Tnaf.POW_2_WIDTH, 85, 20, 66, 82, 0, 72, 89, 11, 92, 88, 12, 9, 30, 5, 94, 90, 78, Tnaf.POW_2_WIDTH, 3, 73, 93, 88, 6, 73, 69, 22, 93, 88, 0, 2, 111, 15, 95, 81, 14, 73, 67, 19, 65, 71, HttpTokens.CARRIAGE_RETURN, 3, 93, 3, 95, 67});

    /* JADX INFO: renamed from: j */
    private static final String f127717j = rjw.m179664a(new byte[]{88, 18, 69, 71, 18, 92, 31, 73, 80, 71, 17, 75, 92, 9, 86, 26, HttpTokens.CARRIAGE_RETURN, 7, 82, 72, 88, 90, 12, 9, 93, 9, 31, 84, 14, 11, 31, Tnaf.POW_2_WIDTH, 2, 24, HttpTokens.CARRIAGE_RETURN, 9, 87, 73, 68, 71, HttpTokens.CARRIAGE_RETURN, 9, 81, 2, 110, 94, 15, 0, 95, 73, 66, 66, 17, 22, 92, 3, 92, 82, 15, 18});

    /* JADX INFO: renamed from: k */
    private static final String f127718k = rjw.m179664a(new byte[]{88, 18, 69, 71, 18, 92, 31, 73, 80, 71, 17, 75, 92, 9, 86, 26, HttpTokens.CARRIAGE_RETURN, 7, 82, 75, 69, 82, 18, 18, 30, 17, 84, 90, 14, 11, 95, 72, 82, 88, 12, 73, 70, 85, 30, 91, 14, 1, 31, 19, 65, 91, 14, 7, 84, 57, 88, 89, 7, 9, 31, 21, 68, 71, 17, 10, 85, 11, 84, 89, 21});

    /* JADX INFO: renamed from: b */
    private static String f127709b = null;

    /* JADX INFO: renamed from: e */
    private static final Object f127712e = new Object();

    /* JADX INFO: renamed from: f */
    private static volatile boolean f127713f = false;

    /* JADX INFO: renamed from: g */
    private static final List<C18206b> f127714g = new ArrayList();

    /* JADX INFO: renamed from: h */
    private static final ExecutorService f127715h = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: l.lek0$a */
    public static class C18205a implements bsl {
        @Override // p149l.bsl
        /* JADX INFO: renamed from: a */
        public void mo103720a(String str) {
            String unused = lek0.f127709b = str;
        }

        @Override // p149l.bsl
        /* JADX INFO: renamed from: b */
        public void mo103721b(Exception exc) {
            String unused = lek0.f127709b = "";
        }
    }

    /* JADX INFO: renamed from: l.lek0$b */
    public static class C18206b {

        /* JADX INFO: renamed from: a */
        sjw.InterfaceC19968b f127719a;

        /* JADX INFO: renamed from: b */
        String f127720b;

        public C18206b(sjw.InterfaceC19968b interfaceC19968b, String str) {
            this.f127719a = interfaceC19968b;
            this.f127720b = str;
        }
    }

    /* JADX INFO: renamed from: l.lek0$c */
    @FunctionalInterface
    public interface InterfaceC18207c {
        /* JADX INFO: renamed from: a */
        Object mo96114a() throws Throwable;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m149567a() {
        return tkd0.m189471a().m189474b() + "";
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m149569c(C18206b c18206b) {
        try {
            m149581o(c18206b, new C3917a(f127717j, m149574h(c18206b.f127720b)).m19329e());
        } catch (Throwable th) {
            m149580n(c18206b, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m149570d(String str) {
        return TextUtils.isEmpty(str) ? "" : str;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m149571e() {
        return TextUtils.isEmpty(f127709b) ? "" : f127709b;
    }

    /* JADX INFO: renamed from: g */
    private static void m149573g(JSONObject jSONObject, String str, InterfaceC18207c interfaceC18207c) {
        try {
            try {
                Object objMo96114a = interfaceC18207c.mo96114a();
                if (objMo96114a instanceof JSONObject) {
                    jSONObject.put(str, objMo96114a);
                    return;
                }
                if (objMo96114a instanceof JSONArray) {
                    jSONObject.put(str, objMo96114a);
                } else if (objMo96114a instanceof String) {
                    jSONObject.put(str, objMo96114a);
                } else {
                    jSONObject.put(str, objMo96114a != null ? objMo96114a.toString() : "");
                }
            } catch (Throwable unused) {
                jSONObject.put(str, "");
            }
        } catch (JSONException unused2) {
        }
    }

    /* JADX INFO: renamed from: h */
    private static String m149574h(final String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jow.m142535a();
        if (TextUtils.isEmpty(f127709b)) {
            try {
                fv40.m123272a(new C18205a());
            } catch (Throwable unused) {
                f127709b = "";
            }
        }
        m149573g(jSONObject, rjw.m179664a(new byte[]{81, 8, 85, 69, 14, 15, 84, 57, 88, 83}), new InterfaceC18207c() { // from class: l.bek0
            @Override // p149l.lek0.InterfaceC18207c
            /* JADX INFO: renamed from: a */
            public final Object mo96114a() {
                return ao0.m97838a();
            }
        });
        m149573g(jSONObject, rjw.m179664a(new byte[]{89, 8, 66, 67, 0, 10, 92, 7, 69, 94, 14, 8, 111, 15, 85}), new InterfaceC18207c() { // from class: l.tdk0
            @Override // p149l.lek0.InterfaceC18207c
            /* JADX INFO: renamed from: a */
            public final Object mo96114a() {
                return zum.m220233a();
            }
        });
        m149573g(jSONObject, rjw.m179664a(new byte[]{93, 7, 82, 104, 0, 2, 84, 20, 84, 68, 18}), new InterfaceC18207c() { // from class: l.vdk0
            @Override // p149l.lek0.InterfaceC18207c
            /* JADX INFO: renamed from: a */
            public final Object mo96114a() {
                return low.m150814a();
            }
        });
        m149573g(jSONObject, rjw.m179664a(new byte[]{84, 20, 92, 66, 8, 2}), new InterfaceC18207c() { // from class: l.sdk0
            @Override // p149l.lek0.InterfaceC18207c
            /* JADX INFO: renamed from: a */
            public final Object mo96114a() {
                return pjx.m169964b();
            }
        });
        m149573g(jSONObject, rjw.m179664a(new byte[]{82, 9, 94, 67, 62, 18, 89, 11, 84}), new InterfaceC18207c() { // from class: l.udk0
            @Override // p149l.lek0.InterfaceC18207c
            /* JADX INFO: renamed from: a */
            public final Object mo96114a() {
                return yhh0.m214824a();
            }
        });
        m149573g(jSONObject, rjw.m179664a(new byte[]{86, 15, 67, 68, 21, 47, 94, 21, 69, 86, HttpTokens.CARRIAGE_RETURN, 10, 100, 15, 92, 82}), new InterfaceC18207c() { // from class: l.wdk0
            @Override // p149l.lek0.InterfaceC18207c
            /* JADX INFO: renamed from: a */
            public final Object mo96114a() {
                return Long.valueOf(nw0.m161766a());
            }
        });
        m149573g(jSONObject, rjw.m179664a(new byte[]{92, 7, 66, 67, 52, 22, 84, 7, 69, 82, 53, 15, 93, 3}), new InterfaceC18207c() { // from class: l.xdk0
            @Override // p149l.lek0.InterfaceC18207c
            /* JADX INFO: renamed from: a */
            public final Object mo96114a() {
                return Long.valueOf(nw0.m161767b());
            }
        });
        m149573g(jSONObject, rjw.m179664a(new byte[]{67, 5, 67, 82, 4, 8, 111, 21, 88, 77, 4}), new InterfaceC18207c() { // from class: l.ydk0
            @Override // p149l.lek0.InterfaceC18207c
            /* JADX INFO: renamed from: a */
            public final Object mo96114a() {
                return x4e0.m206972d(ggw.m126041a());
            }
        });
        m149573g(jSONObject, rjw.m179664a(new byte[]{82, 19, 88, 91, 5, 15, 94, 0, 94}), new InterfaceC18207c() { // from class: l.zdk0
            @Override // p149l.lek0.InterfaceC18207c
            /* JADX INFO: renamed from: a */
            public final Object mo96114a() {
                return dh3.m111779a();
            }
        });
        m149573g(jSONObject, rjw.m179664a(new byte[]{67, 2, 82, 86, 19, 2, 111, 18, 94, 67, 0, 10, 111, 21, 88, 77, 4}), new InterfaceC18207c() { // from class: l.aek0
            @Override // p149l.lek0.InterfaceC18207c
            /* JADX INFO: renamed from: a */
            public final Object mo96114a() {
                return lek0.m149567a();
            }
        });
        m149573g(jSONObject, rjw.m179664a(new byte[]{114, 53, 98, 126, 37}), new InterfaceC18207c() { // from class: l.cek0
            @Override // p149l.lek0.InterfaceC18207c
            /* JADX INFO: renamed from: a */
            public final Object mo96114a() {
                return sb20.m183196a();
            }
        });
        m149573g(jSONObject, rjw.m179664a(new byte[]{81, 22, 65, 104, 15, 7, 93, 3}), new InterfaceC18207c() { // from class: l.dek0
            @Override // p149l.lek0.InterfaceC18207c
            /* JADX INFO: renamed from: a */
            public final Object mo96114a() {
                return nw0.m161768c();
            }
        });
        m149573g(jSONObject, rjw.m179664a(new byte[]{64, 7, 82, 92, 0, 1, 85, 40, 80, 90, 4}), new InterfaceC18207c() { // from class: l.eek0
            @Override // p149l.lek0.InterfaceC18207c
            /* JADX INFO: renamed from: a */
            public final Object mo96114a() {
                return nw0.m161771f();
            }
        });
        m149573g(jSONObject, rjw.m179664a(new byte[]{68, 15, 92, 82, 50, 18, 81, 11, 65}), new InterfaceC18207c() { // from class: l.fek0
            @Override // p149l.lek0.InterfaceC18207c
            /* JADX INFO: renamed from: a */
            public final Object mo96114a() {
                return yhh0.m214825b();
            }
        });
        m149573g(jSONObject, rjw.m179664a(new byte[]{69, 21, 84, 69, 40, 34}), new InterfaceC18207c() { // from class: l.gek0
            @Override // p149l.lek0.InterfaceC18207c
            /* JADX INFO: renamed from: a */
            public final Object mo96114a() {
                return lek0.m149570d(str);
            }
        });
        m149573g(jSONObject, rjw.m179664a(new byte[]{84, 15, 67, 104, 7, 15, 94, 1, 84, 69, 17, 20, 89, 8, 69}), new InterfaceC18207c() { // from class: l.hek0
            @Override // p149l.lek0.InterfaceC18207c
            /* JADX INFO: renamed from: a */
            public final Object mo96114a() {
                return p1e.m167055c();
            }
        });
        m149573g(jSONObject, rjw.m179664a(new byte[]{86, 15, 93, 82, 62, 21, 68, 7, 69}), new InterfaceC18207c() { // from class: l.iek0
            @Override // p149l.lek0.InterfaceC18207c
            /* JADX INFO: renamed from: a */
            public final Object mo96114a() {
                return bhi.m101844a();
            }
        });
        m149573g(jSONObject, rjw.m179664a(new byte[]{95, 7, 88, 83}), new InterfaceC18207c() { // from class: l.jek0
            @Override // p149l.lek0.InterfaceC18207c
            /* JADX INFO: renamed from: a */
            public final Object mo96114a() {
                return lek0.m149571e();
            }
        });
        m149573g(jSONObject, rjw.m179664a(new byte[]{70, 85, 110, 68, 5, HttpTokens.CARRIAGE_RETURN, 111, Tnaf.POW_2_WIDTH, 84, 69, 18, 15, 95, 8}), new InterfaceC18207c() { // from class: l.rdk0
            @Override // p149l.lek0.InterfaceC18207c
            /* JADX INFO: renamed from: a */
            public final Object mo96114a() {
                return ggw.m126042b();
            }
        });
        if (TextUtils.isEmpty(jSONObject.getString(rjw.m179664a(new byte[]{84, 20, 92, 66, 8, 2})))) {
            m149573g(jSONObject, rjw.m179664a(new byte[]{84, 20, 92, 66, 8, 2}), new InterfaceC18207c() { // from class: l.sdk0
                @Override // p149l.lek0.InterfaceC18207c
                /* JADX INFO: renamed from: a */
                public final Object mo96114a() {
                    return pjx.m169964b();
                }
            });
        }
        if (TextUtils.isEmpty(jSONObject.getString(rjw.m179664a(new byte[]{89, 8, 66, 67, 0, 10, 92, 7, 69, 94, 14, 8, 111, 15, 85})))) {
            m149573g(jSONObject, rjw.m179664a(new byte[]{89, 8, 66, 67, 0, 10, 92, 7, 69, 94, 14, 8, 111, 15, 85}), new InterfaceC18207c() { // from class: l.tdk0
                @Override // p149l.lek0.InterfaceC18207c
                /* JADX INFO: renamed from: a */
                public final Object mo96114a() {
                    return zum.m220233a();
                }
            });
        }
        if (TextUtils.isEmpty(jSONObject.getString(rjw.m179664a(new byte[]{82, 9, 94, 67, 62, 18, 89, 11, 84})))) {
            m149573g(jSONObject, rjw.m179664a(new byte[]{82, 9, 94, 67, 62, 18, 89, 11, 84}), new InterfaceC18207c() { // from class: l.udk0
                @Override // p149l.lek0.InterfaceC18207c
                /* JADX INFO: renamed from: a */
                public final Object mo96114a() {
                    return yhh0.m214824a();
                }
            });
        }
        try {
            return new String(Coded.doCommand(jSONObject.toString().getBytes(), 102));
        } catch (Throwable unused2) {
            return new String(Coded.doCommand(jSONObject.toString().getBytes(), 102));
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m149575i() {
        return TextUtils.isEmpty(f127709b) ? "" : f127709b;
    }

    /* JADX INFO: renamed from: j */
    public static String m149576j() {
        String strM97838a = ao0.m97838a();
        return TextUtils.isEmpty(strM97838a) ? "" : strM97838a;
    }

    /* JADX INFO: renamed from: k */
    public static void m149577k(String str, sjw.InterfaceC19968b interfaceC19968b) {
        if (!TextUtils.isEmpty(f127708a)) {
            interfaceC19968b.onMMUIDGetComplete(f127708a);
            return;
        }
        synchronized (f127712e) {
            try {
                if (!TextUtils.isEmpty(f127708a)) {
                    interfaceC19968b.onMMUIDGetComplete(f127708a);
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                if (f127713f) {
                    f127714g.add(new C18206b(interfaceC19968b, str));
                } else {
                    f127713f = true;
                    m149582p(new C18206b(interfaceC19968b, str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m149578l() {
        String strM150814a = low.m150814a();
        return TextUtils.isEmpty(strM150814a) ? "" : strM150814a;
    }

    /* JADX INFO: renamed from: m */
    public static String m149579m(Context context) {
        if (TextUtils.isEmpty(f127708a)) {
            f127708a = zve0.m220363a(context, f127710c, f127711d);
        }
        return TextUtils.isEmpty(f127708a) ? "" : f127708a;
    }

    /* JADX INFO: renamed from: n */
    private static void m149580n(C18206b c18206b, Throwable th) {
        synchronized (f127712e) {
            String strM220364b = zve0.m220364b(f127710c, f127711d);
            if (!TextUtils.isEmpty(strM220364b)) {
                f127708a = strM220364b;
                m149581o(c18206b, f127708a);
                return;
            }
            try {
                c18206b.f127719a.onMMUIDGetError(th);
            } catch (Exception unused) {
                Log.e(rjw.m179664a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), rjw.m179664a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 9, 7, 94, 2, 93, 94, 15, 1, Tnaf.POW_2_WIDTH, 5, 80, 91, HttpTokens.CARRIAGE_RETURN, 4, 81, 5, 90, HttpTokens.CARRIAGE_RETURN, 65}) + th);
            }
            List<C18206b> list = f127714g;
            if (list.isEmpty()) {
                f127713f = false;
            } else {
                m149582p(list.remove(0));
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private static void m149581o(C18206b c18206b, String str) {
        synchronized (f127712e) {
            try {
                f127708a = str;
                zve0.m220365c(f127710c, f127711d, f127708a);
                f127713f = false;
                try {
                    c18206b.f127719a.onMMUIDGetComplete(f127708a);
                    Iterator<C18206b> it = f127714g.iterator();
                    while (it.hasNext()) {
                        it.next().f127719a.onMMUIDGetComplete(f127708a);
                    }
                    f127714g.clear();
                } catch (Exception e) {
                    Log.e(rjw.m179664a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), rjw.m179664a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 9, 7, 94, 2, 93, 94, 15, 1, Tnaf.POW_2_WIDTH, 5, 80, 91, HttpTokens.CARRIAGE_RETURN, 4, 81, 5, 90, HttpTokens.CARRIAGE_RETURN, 65}) + e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private static void m149582p(final C18206b c18206b) {
        f127715h.submit(new Runnable() { // from class: l.odk0
            @Override // java.lang.Runnable
            public final void run() {
                lek0.m149569c(c18206b);
            }
        });
    }
}
