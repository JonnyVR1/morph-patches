package p153l;

import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class tfj0 {

    /* JADX INFO: renamed from: l.tfj0$a */
    public static class C20302a {

        /* JADX INFO: renamed from: e */
        public static final Object f173969e = new Object();

        /* JADX INFO: renamed from: f */
        public static int f173970f;

        /* JADX INFO: renamed from: g */
        public static C20302a f173971g;

        /* JADX INFO: renamed from: a */
        public String f173972a;

        /* JADX INFO: renamed from: b */
        public Object f173973b;

        /* JADX INFO: renamed from: c */
        public C20302a f173974c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f173975d = false;

        /* JADX INFO: renamed from: e */
        public static C20302a m190947e() {
            synchronized (f173969e) {
                try {
                    if (!NullChecker.m82486a(f173971g)) {
                        return new C20302a();
                    }
                    C20302a c20302a = f173971g;
                    f173971g = c20302a.f173974c;
                    f173970f--;
                    c20302a.f173974c = null;
                    c20302a.f173975d = false;
                    return c20302a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public static C20302a m190948f(String str, int i) {
            return m190947e().m190950d(str).m190953j(i);
        }

        /* JADX INFO: renamed from: g */
        public static C20302a m190949g(String str, String str2) {
            return m190947e().m190950d(str).m190954k(str2);
        }

        /* JADX INFO: renamed from: d */
        public C20302a m190950d(String str) {
            this.f173972a = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final void m190951h() {
            if (this.f173975d) {
                return;
            }
            m190952i();
        }

        /* JADX INFO: renamed from: i */
        public final void m190952i() {
            synchronized (f173969e) {
                try {
                    if (this.f173975d) {
                        return;
                    }
                    this.f173975d = true;
                    int i = f173970f;
                    if (i < 10) {
                        this.f173972a = null;
                        this.f173973b = null;
                        this.f173974c = f173971g;
                        f173971g = this;
                        f173970f = i + 1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public C20302a m190953j(int i) {
            this.f173973b = Integer.valueOf(i);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C20302a m190954k(String str) {
            this.f173973b = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m190938a(C20302a... c20302aArr) {
        JSONObject jSONObject = new JSONObject();
        if (c20302aArr != null) {
            try {
                for (C20302a c20302a : c20302aArr) {
                    if (c20302a != null) {
                        jSONObject.put(c20302a.f173972a, c20302a.f173973b);
                        c20302a.m190951h();
                    }
                }
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public static void m190939b(String str, String str2, C20302a... c20302aArr) {
        if (NullChecker.m82486a(c20302aArr)) {
            i4g0.m138522t(str, str2, m190938a(c20302aArr));
        } else {
            i4g0.m138520r(str, str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m190940c(String str, String str2, pf60... pf60VarArr) {
        if (NullChecker.m82486a(pf60VarArr)) {
            i4g0.m138523u(str, str2, pf60VarArr);
        } else {
            i4g0.m138520r(str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m190941d(String str, String str2, C20302a... c20302aArr) {
        if (NullChecker.m82486a(c20302aArr)) {
            i4g0.m138528z(str, str2, m190938a(c20302aArr));
        } else {
            i4g0.m138526x(str, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m190942e(String str, String str2, pf60... pf60VarArr) {
        if (NullChecker.m82486a(pf60VarArr)) {
            i4g0.m138492A(str, str2, pf60VarArr);
        } else {
            i4g0.m138526x(str, str2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m190943f(String str, String str2, C20302a... c20302aArr) {
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        q4fVar.f155581s = str;
        q4fVar.f155576n = str2;
        if (NullChecker.m82486a(c20302aArr)) {
            q4fVar.f155585w = m190938a(c20302aArr);
        }
        i4g0.m138515m(q4fVar);
    }
}
