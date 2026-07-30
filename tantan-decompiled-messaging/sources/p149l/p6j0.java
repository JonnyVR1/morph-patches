package p149l;

import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class p6j0 {

    /* JADX INFO: renamed from: l.p6j0$a */
    public static class C19147a {

        /* JADX INFO: renamed from: e */
        public static final Object f147409e = new Object();

        /* JADX INFO: renamed from: f */
        public static int f147410f;

        /* JADX INFO: renamed from: g */
        public static C19147a f147411g;

        /* JADX INFO: renamed from: a */
        public String f147412a;

        /* JADX INFO: renamed from: b */
        public Object f147413b;

        /* JADX INFO: renamed from: c */
        public C19147a f147414c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f147415d = false;

        /* JADX INFO: renamed from: e */
        public static C19147a m167676e() {
            synchronized (f147409e) {
                try {
                    if (!NullChecker.m81303a(f147411g)) {
                        return new C19147a();
                    }
                    C19147a c19147a = f147411g;
                    f147411g = c19147a.f147414c;
                    f147410f--;
                    c19147a.f147414c = null;
                    c19147a.f147415d = false;
                    return c19147a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public static C19147a m167677f(String str, int i) {
            return m167676e().m167679d(str).m167682j(i);
        }

        /* JADX INFO: renamed from: g */
        public static C19147a m167678g(String str, String str2) {
            return m167676e().m167679d(str).m167683k(str2);
        }

        /* JADX INFO: renamed from: d */
        public C19147a m167679d(String str) {
            this.f147412a = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final void m167680h() {
            if (this.f147415d) {
                return;
            }
            m167681i();
        }

        /* JADX INFO: renamed from: i */
        public final void m167681i() {
            synchronized (f147409e) {
                try {
                    if (this.f147415d) {
                        return;
                    }
                    this.f147415d = true;
                    int i = f147410f;
                    if (i < 10) {
                        this.f147412a = null;
                        this.f147413b = null;
                        this.f147414c = f147411g;
                        f147411g = this;
                        f147410f = i + 1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public C19147a m167682j(int i) {
            this.f147413b = Integer.valueOf(i);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C19147a m167683k(String str) {
            this.f147413b = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m167667a(C19147a... c19147aArr) {
        JSONObject jSONObject = new JSONObject();
        if (c19147aArr != null) {
            try {
                for (C19147a c19147a : c19147aArr) {
                    if (c19147a != null) {
                        jSONObject.put(c19147a.f147412a, c19147a.f147413b);
                        c19147a.m167680h();
                    }
                }
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public static void m167668b(String str, String str2, C19147a... c19147aArr) {
        if (NullChecker.m81303a(c19147aArr)) {
            zvf0.m220398t(str, str2, m167667a(c19147aArr));
        } else {
            zvf0.m220396r(str, str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m167669c(String str, String str2, j760... j760VarArr) {
        if (NullChecker.m81303a(j760VarArr)) {
            zvf0.m220399u(str, str2, j760VarArr);
        } else {
            zvf0.m220396r(str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m167670d(String str, String str2, C19147a... c19147aArr) {
        if (NullChecker.m81303a(c19147aArr)) {
            zvf0.m220404z(str, str2, m167667a(c19147aArr));
        } else {
            zvf0.m220402x(str, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m167671e(String str, String str2, j760... j760VarArr) {
        if (NullChecker.m81303a(j760VarArr)) {
            zvf0.m220368A(str, str2, j760VarArr);
        } else {
            zvf0.m220402x(str, str2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m167672f(String str, String str2, C19147a... c19147aArr) {
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        l3fVar.f125900s = str;
        l3fVar.f125895n = str2;
        if (NullChecker.m81303a(c19147aArr)) {
            l3fVar.f125904w = m167667a(c19147aArr);
        }
        zvf0.m220391m(l3fVar);
    }
}
