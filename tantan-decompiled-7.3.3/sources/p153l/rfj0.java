package p153l;

import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class rfj0 {

    /* JADX INFO: renamed from: l.rfj0$a */
    public static class C19825a {

        /* JADX INFO: renamed from: e */
        public static final Object f162800e = new Object();

        /* JADX INFO: renamed from: f */
        public static int f162801f;

        /* JADX INFO: renamed from: g */
        public static C19825a f162802g;

        /* JADX INFO: renamed from: a */
        public String f162803a;

        /* JADX INFO: renamed from: b */
        public Object f162804b;

        /* JADX INFO: renamed from: c */
        public C19825a f162805c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f162806d = false;

        /* JADX INFO: renamed from: e */
        public static C19825a m181220e() {
            synchronized (f162800e) {
                try {
                    if (!NullChecker.m82486a(f162802g)) {
                        return new C19825a();
                    }
                    C19825a c19825a = f162802g;
                    f162802g = c19825a.f162805c;
                    f162801f--;
                    c19825a.f162805c = null;
                    c19825a.f162806d = false;
                    return c19825a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public static C19825a m181221f(String str, String str2) {
            return m181220e().m181222d(str).m181225i(str2);
        }

        /* JADX INFO: renamed from: d */
        public C19825a m181222d(String str) {
            this.f162803a = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public final void m181223g() {
            if (this.f162806d) {
                return;
            }
            m181224h();
        }

        /* JADX INFO: renamed from: h */
        public final void m181224h() {
            synchronized (f162800e) {
                try {
                    if (this.f162806d) {
                        return;
                    }
                    this.f162806d = true;
                    int i = f162801f;
                    if (i < 10) {
                        this.f162803a = null;
                        this.f162804b = null;
                        this.f162805c = f162802g;
                        f162802g = this;
                        f162801f = i + 1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: i */
        public C19825a m181225i(String str) {
            this.f162804b = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m181213a(C19825a... c19825aArr) {
        JSONObject jSONObject = new JSONObject();
        if (c19825aArr != null) {
            try {
                for (C19825a c19825a : c19825aArr) {
                    if (c19825a != null) {
                        jSONObject.put(c19825a.f162803a, c19825a.f162804b);
                        c19825a.m181223g();
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
    public static void m181214b(String str, String str2, C19825a... c19825aArr) {
        if (NullChecker.m82486a(c19825aArr)) {
            i4g0.m138522t(str, str2, m181213a(c19825aArr));
        } else {
            i4g0.m138520r(str, str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m181215c(String str, String str2, C19825a... c19825aArr) {
        if (NullChecker.m82486a(c19825aArr)) {
            i4g0.m138528z(str, str2, m181213a(c19825aArr));
        } else {
            i4g0.m138526x(str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m181216d(String str, String str2, C19825a... c19825aArr) {
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.SYS_CHECK;
        q4fVar.f155581s = str;
        q4fVar.f155576n = str2;
        if (NullChecker.m82486a(c19825aArr)) {
            q4fVar.f155585w = m181213a(c19825aArr);
        }
        i4g0.m138515m(q4fVar);
    }
}
