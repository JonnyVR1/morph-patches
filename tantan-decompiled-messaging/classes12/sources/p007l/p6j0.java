package p007l;

import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import l.j760;
import l.l3f;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class p6j0 {

    /* JADX INFO: renamed from: l.p6j0$a */
    public static class C2456a {

        /* JADX INFO: renamed from: e */
        public static final Object f11706e = new Object();

        /* JADX INFO: renamed from: f */
        public static int f11707f;

        /* JADX INFO: renamed from: g */
        public static C2456a f11708g;

        /* JADX INFO: renamed from: a */
        public String f11709a;

        /* JADX INFO: renamed from: b */
        public Object f11710b;

        /* JADX INFO: renamed from: c */
        public C2456a f11711c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f11712d = false;

        /* JADX INFO: renamed from: e */
        public static C2456a m12920e() {
            synchronized (f11706e) {
                try {
                    if (!NullChecker.a(f11708g)) {
                        return new C2456a();
                    }
                    C2456a c2456a = f11708g;
                    f11708g = c2456a.f11711c;
                    f11707f--;
                    c2456a.f11711c = null;
                    c2456a.f11712d = false;
                    return c2456a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public static C2456a m12921f(String str, int i) {
            return m12920e().m12923d(str).m12926j(i);
        }

        /* JADX INFO: renamed from: g */
        public static C2456a m12922g(String str, String str2) {
            return m12920e().m12923d(str).m12927k(str2);
        }

        /* JADX INFO: renamed from: d */
        public C2456a m12923d(String str) {
            this.f11709a = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final void m12924h() {
            if (this.f11712d) {
                return;
            }
            m12925i();
        }

        /* JADX INFO: renamed from: i */
        public final void m12925i() {
            synchronized (f11706e) {
                try {
                    if (this.f11712d) {
                        return;
                    }
                    this.f11712d = true;
                    int i = f11707f;
                    if (i < 10) {
                        this.f11709a = null;
                        this.f11710b = null;
                        this.f11711c = f11708g;
                        f11708g = this;
                        f11707f = i + 1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public C2456a m12926j(int i) {
            this.f11710b = Integer.valueOf(i);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C2456a m12927k(String str) {
            this.f11710b = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m12911a(C2456a... c2456aArr) {
        JSONObject jSONObject = new JSONObject();
        if (c2456aArr != null) {
            try {
                for (C2456a c2456a : c2456aArr) {
                    if (c2456a != null) {
                        jSONObject.put(c2456a.f11709a, c2456a.f11710b);
                        c2456a.m12924h();
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
    public static void m12912b(String str, String str2, C2456a... c2456aArr) {
        if (NullChecker.a(c2456aArr)) {
            zvf0.t(str, str2, m12911a(c2456aArr));
        } else {
            zvf0.r(str, str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m12913c(String str, String str2, j760... j760VarArr) {
        if (NullChecker.a(j760VarArr)) {
            zvf0.u(str, str2, j760VarArr);
        } else {
            zvf0.r(str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m12914d(String str, String str2, C2456a... c2456aArr) {
        if (NullChecker.a(c2456aArr)) {
            zvf0.z(str, str2, m12911a(c2456aArr));
        } else {
            zvf0.x(str, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m12915e(String str, String str2, j760... j760VarArr) {
        if (NullChecker.a(j760VarArr)) {
            zvf0.A(str, str2, j760VarArr);
        } else {
            zvf0.x(str, str2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m12916f(String str, String str2, C2456a... c2456aArr) {
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        l3fVar.s = str;
        l3fVar.n = str2;
        if (NullChecker.a(c2456aArr)) {
            l3fVar.w = m12911a(c2456aArr);
        }
        zvf0.m(l3fVar);
    }
}
