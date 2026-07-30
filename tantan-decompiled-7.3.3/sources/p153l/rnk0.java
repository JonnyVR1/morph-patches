package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.immomo.momosec.Coded;
import com.immomo.momosec.network.C4060a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class rnk0 {

    /* JADX INFO: renamed from: a */
    public static volatile String f164054a;

    /* JADX INFO: renamed from: c */
    public static final String f164056c = qmw.m177151a(new byte[]{99, 37, 94, 89, 7, 15, 87});

    /* JADX INFO: renamed from: d */
    private static final String f164057d = qmw.m177151a(new byte[]{68, 3, 66, 67, 37, 7, 68, 7, 2});

    /* JADX INFO: renamed from: i */
    private static final String f164062i = qmw.m177151a(new byte[]{88, 18, 69, 71, 18, 92, 31, 73, 80, 71, 17, 75, 92, 9, 86, 26, 14, Tnaf.POW_2_WIDTH, 85, 20, 66, 82, 0, 72, 89, 11, 92, 88, 12, 9, 30, 5, 94, 90, 78, Tnaf.POW_2_WIDTH, 3, 73, 93, 88, 6, 73, 69, 22, 93, 88, 0, 2, 111, 15, 95, 81, 14, 73, 67, 19, 65, 71, HttpTokens.CARRIAGE_RETURN, 3, 93, 3, 95, 67});

    /* JADX INFO: renamed from: j */
    private static final String f164063j = qmw.m177151a(new byte[]{88, 18, 69, 71, 18, 92, 31, 73, 80, 71, 17, 75, 92, 9, 86, 26, HttpTokens.CARRIAGE_RETURN, 7, 82, 72, 88, 90, 12, 9, 93, 9, 31, 84, 14, 11, 31, Tnaf.POW_2_WIDTH, 2, 24, HttpTokens.CARRIAGE_RETURN, 9, 87, 73, 68, 71, HttpTokens.CARRIAGE_RETURN, 9, 81, 2, 110, 94, 15, 0, 95, 73, 66, 66, 17, 22, 92, 3, 92, 82, 15, 18});

    /* JADX INFO: renamed from: k */
    private static final String f164064k = qmw.m177151a(new byte[]{88, 18, 69, 71, 18, 92, 31, 73, 80, 71, 17, 75, 92, 9, 86, 26, HttpTokens.CARRIAGE_RETURN, 7, 82, 75, 69, 82, 18, 18, 30, 17, 84, 90, 14, 11, 95, 72, 82, 88, 12, 73, 70, 85, 30, 91, 14, 1, 31, 19, 65, 91, 14, 7, 84, 57, 88, 89, 7, 9, 31, 21, 68, 71, 17, 10, 85, 11, 84, 89, 21});

    /* JADX INFO: renamed from: b */
    private static String f164055b = null;

    /* JADX INFO: renamed from: e */
    private static final Object f164058e = new Object();

    /* JADX INFO: renamed from: f */
    private static volatile boolean f164059f = false;

    /* JADX INFO: renamed from: g */
    private static final List<C19884b> f164060g = new ArrayList();

    /* JADX INFO: renamed from: h */
    private static final ExecutorService f164061h = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: l.rnk0$a */
    public static class C19883a implements pul {
        @Override // p153l.pul
        /* JADX INFO: renamed from: a */
        public void mo173888a(String str) {
            String unused = rnk0.f164055b = str;
        }

        @Override // p153l.pul
        /* JADX INFO: renamed from: b */
        public void mo173889b(Exception exc) {
            String unused = rnk0.f164055b = "";
        }
    }

    /* JADX INFO: renamed from: l.rnk0$b */
    public static class C19884b {

        /* JADX INFO: renamed from: a */
        rmw.InterfaceC19876b f164065a;

        /* JADX INFO: renamed from: b */
        String f164066b;

        public C19884b(rmw.InterfaceC19876b interfaceC19876b, String str) {
            this.f164065a = interfaceC19876b;
            this.f164066b = str;
        }
    }

    /* JADX INFO: renamed from: l.rnk0$c */
    @FunctionalInterface
    public interface InterfaceC19885c {
        /* JADX INFO: renamed from: a */
        Object mo98999a() throws Throwable;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m182241a() {
        return wsd0.m207749a().m207752b() + "";
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m182243c(C19884b c19884b) {
        try {
            m182255o(c19884b, new C4060a(f164063j, m182248h(c19884b.f164066b)).m20309e());
        } catch (Throwable th) {
            m182254n(c19884b, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m182244d(String str) {
        return TextUtils.isEmpty(str) ? "" : str;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m182245e() {
        return TextUtils.isEmpty(f164055b) ? "" : f164055b;
    }

    /* JADX INFO: renamed from: g */
    private static void m182247g(JSONObject jSONObject, String str, InterfaceC19885c interfaceC19885c) {
        try {
            try {
                Object objMo98999a = interfaceC19885c.mo98999a();
                if (objMo98999a instanceof JSONObject) {
                    jSONObject.put(str, objMo98999a);
                    return;
                }
                if (objMo98999a instanceof JSONArray) {
                    jSONObject.put(str, objMo98999a);
                } else if (objMo98999a instanceof String) {
                    jSONObject.put(str, objMo98999a);
                } else {
                    jSONObject.put(str, objMo98999a != null ? objMo98999a.toString() : "");
                }
            } catch (Throwable unused) {
                jSONObject.put(str, "");
            }
        } catch (JSONException unused2) {
        }
    }

    /* JADX INFO: renamed from: h */
    private static String m182248h(final String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        irw.m141850a();
        if (TextUtils.isEmpty(f164055b)) {
            try {
                u350.m194328a(new C19883a());
            } catch (Throwable unused) {
                f164055b = "";
            }
        }
        m182247g(jSONObject, qmw.m177151a(new byte[]{81, 8, 85, 69, 14, 15, 84, 57, 88, 83}), new InterfaceC19885c() { // from class: l.hnk0
            @Override // p153l.rnk0.InterfaceC19885c
            /* JADX INFO: renamed from: a */
            public final Object mo98999a() {
                return wn0.m207136a();
            }
        });
        m182247g(jSONObject, qmw.m177151a(new byte[]{89, 8, 66, 67, 0, 10, 92, 7, 69, 94, 14, 8, 111, 15, 85}), new InterfaceC19885c() { // from class: l.zmk0
            @Override // p153l.rnk0.InterfaceC19885c
            /* JADX INFO: renamed from: a */
            public final Object mo98999a() {
                return axm.m100777a();
            }
        });
        m182247g(jSONObject, qmw.m177151a(new byte[]{93, 7, 82, 104, 0, 2, 84, 20, 84, 68, 18}), new InterfaceC19885c() { // from class: l.bnk0
            @Override // p153l.rnk0.InterfaceC19885c
            /* JADX INFO: renamed from: a */
            public final Object mo98999a() {
                return krw.m151126a();
            }
        });
        m182247g(jSONObject, qmw.m177151a(new byte[]{84, 20, 92, 66, 8, 2}), new InterfaceC19885c() { // from class: l.ymk0
            @Override // p153l.rnk0.InterfaceC19885c
            /* JADX INFO: renamed from: a */
            public final Object mo98999a() {
                return msx.m159943b();
            }
        });
        m182247g(jSONObject, qmw.m177151a(new byte[]{82, 9, 94, 67, 62, 18, 89, 11, 84}), new InterfaceC19885c() { // from class: l.ank0
            @Override // p153l.rnk0.InterfaceC19885c
            /* JADX INFO: renamed from: a */
            public final Object mo98999a() {
                return fqh0.m126761a();
            }
        });
        m182247g(jSONObject, qmw.m177151a(new byte[]{86, 15, 67, 68, 21, 47, 94, 21, 69, 86, HttpTokens.CARRIAGE_RETURN, 10, 100, 15, 92, 82}), new InterfaceC19885c() { // from class: l.cnk0
            @Override // p153l.rnk0.InterfaceC19885c
            /* JADX INFO: renamed from: a */
            public final Object mo98999a() {
                return Long.valueOf(uw0.m198310a());
            }
        });
        m182247g(jSONObject, qmw.m177151a(new byte[]{92, 7, 66, 67, 52, 22, 84, 7, 69, 82, 53, 15, 93, 3}), new InterfaceC19885c() { // from class: l.dnk0
            @Override // p153l.rnk0.InterfaceC19885c
            /* JADX INFO: renamed from: a */
            public final Object mo98999a() {
                return Long.valueOf(uw0.m198311b());
            }
        });
        m182247g(jSONObject, qmw.m177151a(new byte[]{67, 5, 67, 82, 4, 8, 111, 21, 88, 77, 4}), new InterfaceC19885c() { // from class: l.enk0
            @Override // p153l.rnk0.InterfaceC19885c
            /* JADX INFO: renamed from: a */
            public final Object mo98999a() {
                return bde0.m103611d(eiw.m120945a());
            }
        });
        m182247g(jSONObject, qmw.m177151a(new byte[]{82, 19, 88, 91, 5, 15, 94, 0, 94}), new InterfaceC19885c() { // from class: l.fnk0
            @Override // p153l.rnk0.InterfaceC19885c
            /* JADX INFO: renamed from: a */
            public final Object mo98999a() {
                return rh3.m181513a();
            }
        });
        m182247g(jSONObject, qmw.m177151a(new byte[]{67, 2, 82, 86, 19, 2, 111, 18, 94, 67, 0, 10, 111, 21, 88, 77, 4}), new InterfaceC19885c() { // from class: l.gnk0
            @Override // p153l.rnk0.InterfaceC19885c
            /* JADX INFO: renamed from: a */
            public final Object mo98999a() {
                return rnk0.m182241a();
            }
        });
        m182247g(jSONObject, qmw.m177151a(new byte[]{114, 53, 98, 126, 37}), new InterfaceC19885c() { // from class: l.ink0
            @Override // p153l.rnk0.InterfaceC19885c
            /* JADX INFO: renamed from: a */
            public final Object mo98999a() {
                return bk20.m104786a();
            }
        });
        m182247g(jSONObject, qmw.m177151a(new byte[]{81, 22, 65, 104, 15, 7, 93, 3}), new InterfaceC19885c() { // from class: l.jnk0
            @Override // p153l.rnk0.InterfaceC19885c
            /* JADX INFO: renamed from: a */
            public final Object mo98999a() {
                return uw0.m198312c();
            }
        });
        m182247g(jSONObject, qmw.m177151a(new byte[]{64, 7, 82, 92, 0, 1, 85, 40, 80, 90, 4}), new InterfaceC19885c() { // from class: l.knk0
            @Override // p153l.rnk0.InterfaceC19885c
            /* JADX INFO: renamed from: a */
            public final Object mo98999a() {
                return uw0.m198315f();
            }
        });
        m182247g(jSONObject, qmw.m177151a(new byte[]{68, 15, 92, 82, 50, 18, 81, 11, 65}), new InterfaceC19885c() { // from class: l.lnk0
            @Override // p153l.rnk0.InterfaceC19885c
            /* JADX INFO: renamed from: a */
            public final Object mo98999a() {
                return fqh0.m126762b();
            }
        });
        m182247g(jSONObject, qmw.m177151a(new byte[]{69, 21, 84, 69, 40, 34}), new InterfaceC19885c() { // from class: l.mnk0
            @Override // p153l.rnk0.InterfaceC19885c
            /* JADX INFO: renamed from: a */
            public final Object mo98999a() {
                return rnk0.m182244d(str);
            }
        });
        m182247g(jSONObject, qmw.m177151a(new byte[]{84, 15, 67, 104, 7, 15, 94, 1, 84, 69, 17, 20, 89, 8, 69}), new InterfaceC19885c() { // from class: l.nnk0
            @Override // p153l.rnk0.InterfaceC19885c
            /* JADX INFO: renamed from: a */
            public final Object mo98999a() {
                return d3e.m113802c();
            }
        });
        m182247g(jSONObject, qmw.m177151a(new byte[]{86, 15, 93, 82, 62, 21, 68, 7, 69}), new InterfaceC19885c() { // from class: l.onk0
            @Override // p153l.rnk0.InterfaceC19885c
            /* JADX INFO: renamed from: a */
            public final Object mo98999a() {
                return yji.m216407a();
            }
        });
        m182247g(jSONObject, qmw.m177151a(new byte[]{95, 7, 88, 83}), new InterfaceC19885c() { // from class: l.pnk0
            @Override // p153l.rnk0.InterfaceC19885c
            /* JADX INFO: renamed from: a */
            public final Object mo98999a() {
                return rnk0.m182245e();
            }
        });
        m182247g(jSONObject, qmw.m177151a(new byte[]{70, 85, 110, 68, 5, HttpTokens.CARRIAGE_RETURN, 111, Tnaf.POW_2_WIDTH, 84, 69, 18, 15, 95, 8}), new InterfaceC19885c() { // from class: l.xmk0
            @Override // p153l.rnk0.InterfaceC19885c
            /* JADX INFO: renamed from: a */
            public final Object mo98999a() {
                return eiw.m120946b();
            }
        });
        if (TextUtils.isEmpty(jSONObject.getString(qmw.m177151a(new byte[]{84, 20, 92, 66, 8, 2})))) {
            m182247g(jSONObject, qmw.m177151a(new byte[]{84, 20, 92, 66, 8, 2}), new InterfaceC19885c() { // from class: l.ymk0
                @Override // p153l.rnk0.InterfaceC19885c
                /* JADX INFO: renamed from: a */
                public final Object mo98999a() {
                    return msx.m159943b();
                }
            });
        }
        if (TextUtils.isEmpty(jSONObject.getString(qmw.m177151a(new byte[]{89, 8, 66, 67, 0, 10, 92, 7, 69, 94, 14, 8, 111, 15, 85})))) {
            m182247g(jSONObject, qmw.m177151a(new byte[]{89, 8, 66, 67, 0, 10, 92, 7, 69, 94, 14, 8, 111, 15, 85}), new InterfaceC19885c() { // from class: l.zmk0
                @Override // p153l.rnk0.InterfaceC19885c
                /* JADX INFO: renamed from: a */
                public final Object mo98999a() {
                    return axm.m100777a();
                }
            });
        }
        if (TextUtils.isEmpty(jSONObject.getString(qmw.m177151a(new byte[]{82, 9, 94, 67, 62, 18, 89, 11, 84})))) {
            m182247g(jSONObject, qmw.m177151a(new byte[]{82, 9, 94, 67, 62, 18, 89, 11, 84}), new InterfaceC19885c() { // from class: l.ank0
                @Override // p153l.rnk0.InterfaceC19885c
                /* JADX INFO: renamed from: a */
                public final Object mo98999a() {
                    return fqh0.m126761a();
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
    public static String m182249i() {
        return TextUtils.isEmpty(f164055b) ? "" : f164055b;
    }

    /* JADX INFO: renamed from: j */
    public static String m182250j() {
        String strM207136a = wn0.m207136a();
        return TextUtils.isEmpty(strM207136a) ? "" : strM207136a;
    }

    /* JADX INFO: renamed from: k */
    public static void m182251k(String str, rmw.InterfaceC19876b interfaceC19876b) {
        if (!TextUtils.isEmpty(f164054a)) {
            interfaceC19876b.onMMUIDGetComplete(f164054a);
            return;
        }
        synchronized (f164058e) {
            try {
                if (!TextUtils.isEmpty(f164054a)) {
                    interfaceC19876b.onMMUIDGetComplete(f164054a);
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                if (f164059f) {
                    f164060g.add(new C19884b(interfaceC19876b, str));
                } else {
                    f164059f = true;
                    m182256p(new C19884b(interfaceC19876b, str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m182252l() {
        String strM151126a = krw.m151126a();
        return TextUtils.isEmpty(strM151126a) ? "" : strM151126a;
    }

    /* JADX INFO: renamed from: m */
    public static String m182253m(Context context) {
        if (TextUtils.isEmpty(f164054a)) {
            f164054a = g4f0.m128875a(context, f164056c, f164057d);
        }
        return TextUtils.isEmpty(f164054a) ? "" : f164054a;
    }

    /* JADX INFO: renamed from: n */
    private static void m182254n(C19884b c19884b, Throwable th) {
        synchronized (f164058e) {
            String strM128876b = g4f0.m128876b(f164056c, f164057d);
            if (!TextUtils.isEmpty(strM128876b)) {
                f164054a = strM128876b;
                m182255o(c19884b, f164054a);
                return;
            }
            try {
                c19884b.f164065a.onMMUIDGetError(th);
            } catch (Exception unused) {
                Log.e(qmw.m177151a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), qmw.m177151a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 9, 7, 94, 2, 93, 94, 15, 1, Tnaf.POW_2_WIDTH, 5, 80, 91, HttpTokens.CARRIAGE_RETURN, 4, 81, 5, 90, HttpTokens.CARRIAGE_RETURN, 65}) + th);
            }
            List<C19884b> list = f164060g;
            if (list.isEmpty()) {
                f164059f = false;
            } else {
                m182256p(list.remove(0));
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private static void m182255o(C19884b c19884b, String str) {
        synchronized (f164058e) {
            try {
                f164054a = str;
                g4f0.m128877c(f164056c, f164057d, f164054a);
                f164059f = false;
                try {
                    c19884b.f164065a.onMMUIDGetComplete(f164054a);
                    Iterator<C19884b> it = f164060g.iterator();
                    while (it.hasNext()) {
                        it.next().f164065a.onMMUIDGetComplete(f164054a);
                    }
                    f164060g.clear();
                } catch (Exception e) {
                    Log.e(qmw.m177151a(new byte[]{125, 43, 117, 82, 23, 15, 83, 3}), qmw.m177151a(new byte[]{117, 30, 82, 82, 17, 18, 89, 9, 95, 23, 22, 14, 89, 10, 84, 23, 9, 7, 94, 2, 93, 94, 15, 1, Tnaf.POW_2_WIDTH, 5, 80, 91, HttpTokens.CARRIAGE_RETURN, 4, 81, 5, 90, HttpTokens.CARRIAGE_RETURN, 65}) + e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private static void m182256p(final C19884b c19884b) {
        f164061h.submit(new Runnable() { // from class: l.umk0
            @Override // java.lang.Runnable
            public final void run() {
                rnk0.m182243c(c19884b);
            }
        });
    }
}
