package p149l;

import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class n6j0 {

    /* JADX INFO: renamed from: l.n6j0$a */
    public static class C18629a {

        /* JADX INFO: renamed from: e */
        public static final Object f137409e = new Object();

        /* JADX INFO: renamed from: f */
        public static int f137410f;

        /* JADX INFO: renamed from: g */
        public static C18629a f137411g;

        /* JADX INFO: renamed from: a */
        public String f137412a;

        /* JADX INFO: renamed from: b */
        public Object f137413b;

        /* JADX INFO: renamed from: c */
        public C18629a f137414c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f137415d = false;

        /* JADX INFO: renamed from: e */
        public static C18629a m158054e() {
            synchronized (f137409e) {
                try {
                    if (!NullChecker.m81303a(f137411g)) {
                        return new C18629a();
                    }
                    C18629a c18629a = f137411g;
                    f137411g = c18629a.f137414c;
                    f137410f--;
                    c18629a.f137414c = null;
                    c18629a.f137415d = false;
                    return c18629a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public static C18629a m158055f(String str, String str2) {
            return m158054e().m158056d(str).m158059i(str2);
        }

        /* JADX INFO: renamed from: d */
        public C18629a m158056d(String str) {
            this.f137412a = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public final void m158057g() {
            if (this.f137415d) {
                return;
            }
            m158058h();
        }

        /* JADX INFO: renamed from: h */
        public final void m158058h() {
            synchronized (f137409e) {
                try {
                    if (this.f137415d) {
                        return;
                    }
                    this.f137415d = true;
                    int i = f137410f;
                    if (i < 10) {
                        this.f137412a = null;
                        this.f137413b = null;
                        this.f137414c = f137411g;
                        f137411g = this;
                        f137410f = i + 1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: i */
        public C18629a m158059i(String str) {
            this.f137413b = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m158047a(C18629a... c18629aArr) {
        JSONObject jSONObject = new JSONObject();
        if (c18629aArr != null) {
            try {
                for (C18629a c18629a : c18629aArr) {
                    if (c18629a != null) {
                        jSONObject.put(c18629a.f137412a, c18629a.f137413b);
                        c18629a.m158057g();
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
    public static void m158048b(String str, String str2, C18629a... c18629aArr) {
        if (NullChecker.m81303a(c18629aArr)) {
            zvf0.m220398t(str, str2, m158047a(c18629aArr));
        } else {
            zvf0.m220396r(str, str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m158049c(String str, String str2, C18629a... c18629aArr) {
        if (NullChecker.m81303a(c18629aArr)) {
            zvf0.m220404z(str, str2, m158047a(c18629aArr));
        } else {
            zvf0.m220402x(str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m158050d(String str, String str2, C18629a... c18629aArr) {
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.SYS_CHECK;
        l3fVar.f125900s = str;
        l3fVar.f125895n = str2;
        if (NullChecker.m81303a(c18629aArr)) {
            l3fVar.f125904w = m158047a(c18629aArr);
        }
        zvf0.m220391m(l3fVar);
    }
}
