package p006l;

import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import l.l3f;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class n6j0 {

    /* JADX INFO: renamed from: l.n6j0$a */
    public static class C1041a {

        /* JADX INFO: renamed from: e */
        public static final Object f17510e = new Object();

        /* JADX INFO: renamed from: f */
        public static int f17511f;

        /* JADX INFO: renamed from: g */
        public static C1041a f17512g;

        /* JADX INFO: renamed from: a */
        public String f17513a;

        /* JADX INFO: renamed from: b */
        public Object f17514b;

        /* JADX INFO: renamed from: c */
        public C1041a f17515c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f17516d = false;

        /* JADX INFO: renamed from: e */
        public static C1041a m19695e() {
            synchronized (f17510e) {
                try {
                    if (!NullChecker.a(f17512g)) {
                        return new C1041a();
                    }
                    C1041a c1041a = f17512g;
                    f17512g = c1041a.f17515c;
                    f17511f--;
                    c1041a.f17515c = null;
                    c1041a.f17516d = false;
                    return c1041a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public static C1041a m19696f(String str, String str2) {
            return m19695e().m19697d(str).m19700i(str2);
        }

        /* JADX INFO: renamed from: d */
        public C1041a m19697d(String str) {
            this.f17513a = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public final void m19698g() {
            if (this.f17516d) {
                return;
            }
            m19699h();
        }

        /* JADX INFO: renamed from: h */
        public final void m19699h() {
            synchronized (f17510e) {
                try {
                    if (this.f17516d) {
                        return;
                    }
                    this.f17516d = true;
                    int i = f17511f;
                    if (i < 10) {
                        this.f17513a = null;
                        this.f17514b = null;
                        this.f17515c = f17512g;
                        f17512g = this;
                        f17511f = i + 1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: i */
        public C1041a m19700i(String str) {
            this.f17514b = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m19688a(C1041a... c1041aArr) {
        JSONObject jSONObject = new JSONObject();
        if (c1041aArr != null) {
            try {
                for (C1041a c1041a : c1041aArr) {
                    if (c1041a != null) {
                        jSONObject.put(c1041a.f17513a, c1041a.f17514b);
                        c1041a.m19698g();
                    }
                }
            } catch (JSONException e) {
                CrashHelper.c(e);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public static void m19689b(String str, String str2, C1041a... c1041aArr) {
        if (NullChecker.a(c1041aArr)) {
            zvf0.t(str, str2, m19688a(c1041aArr));
        } else {
            zvf0.r(str, str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m19690c(String str, String str2, C1041a... c1041aArr) {
        if (NullChecker.a(c1041aArr)) {
            zvf0.z(str, str2, m19688a(c1041aArr));
        } else {
            zvf0.x(str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m19691d(String str, String str2, C1041a... c1041aArr) {
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.SYS_CHECK;
        l3fVar.s = str;
        l3fVar.n = str2;
        if (NullChecker.a(c1041aArr)) {
            l3fVar.w = m19688a(c1041aArr);
        }
        zvf0.m(l3fVar);
    }
}
