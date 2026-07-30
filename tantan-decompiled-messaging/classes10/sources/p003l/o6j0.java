package p003l;

import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import l.j760;
import l.l3f;
import l.mqi0;
import l.sm80;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class o6j0 {

    /* JADX INFO: renamed from: a */
    public static LinkedHashMap<String, Long> f6607a = new LinkedHashMap<>(128);

    /* JADX INFO: renamed from: b */
    public static long f6608b = 0;

    /* JADX INFO: renamed from: c */
    public static boolean f6609c = false;

    /* JADX INFO: renamed from: l.o6j0$a */
    public static class C3390a {

        /* JADX INFO: renamed from: e */
        public static final Object f6610e = new Object();

        /* JADX INFO: renamed from: f */
        public static int f6611f;

        /* JADX INFO: renamed from: g */
        public static C3390a f6612g;

        /* JADX INFO: renamed from: a */
        public String f6613a;

        /* JADX INFO: renamed from: b */
        public Object f6614b;

        /* JADX INFO: renamed from: c */
        public C3390a f6615c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f6616d = false;

        /* JADX INFO: renamed from: e */
        public static C3390a m8419e() {
            synchronized (f6610e) {
                try {
                    if (!NullChecker.a(f6612g)) {
                        return new C3390a();
                    }
                    C3390a c3390a = f6612g;
                    f6612g = c3390a.f6615c;
                    f6611f--;
                    c3390a.f6615c = null;
                    c3390a.f6616d = false;
                    return c3390a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public static C3390a m8420f(String str, int i) {
            return m8419e().m8424d(str).m8427l(i);
        }

        /* JADX INFO: renamed from: g */
        public static C3390a m8421g(String str, long j) {
            return m8419e().m8424d(str).m8428m(j);
        }

        /* JADX INFO: renamed from: h */
        public static C3390a m8422h(String str, String str2) {
            return m8419e().m8424d(str).m8429n(str2);
        }

        /* JADX INFO: renamed from: i */
        public static C3390a m8423i(String str, boolean z) {
            return m8419e().m8424d(str).m8430o(z);
        }

        /* JADX INFO: renamed from: d */
        public C3390a m8424d(String str) {
            this.f6613a = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public final void m8425j() {
            if (this.f6616d) {
                return;
            }
            m8426k();
        }

        /* JADX INFO: renamed from: k */
        public final void m8426k() {
            synchronized (f6610e) {
                try {
                    if (this.f6616d) {
                        return;
                    }
                    this.f6616d = true;
                    int i = f6611f;
                    if (i < 10) {
                        this.f6613a = null;
                        this.f6614b = null;
                        this.f6615c = f6612g;
                        f6612g = this;
                        f6611f = i + 1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: l */
        public C3390a m8427l(int i) {
            this.f6614b = Integer.valueOf(i);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C3390a m8428m(long j) {
            this.f6614b = Long.valueOf(j);
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C3390a m8429n(String str) {
            this.f6614b = str;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C3390a m8430o(boolean z) {
            this.f6614b = Boolean.valueOf(z);
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m8401a(Map<String, Object> map) {
        JSONObject jSONObject = null;
        if (map != null) {
            try {
                if (map.keySet().size() > 0) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        for (Map.Entry<String, Object> entry : map.entrySet()) {
                            jSONObject2.put(entry.getKey(), entry.getValue());
                        }
                        return jSONObject2;
                    } catch (Exception e) {
                        e = e;
                        jSONObject = jSONObject2;
                        sm80.b(e);
                        return jSONObject;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m8402b(C3390a... c3390aArr) {
        JSONObject jSONObject = new JSONObject();
        if (c3390aArr != null) {
            try {
                for (C3390a c3390a : c3390aArr) {
                    if (c3390a != null) {
                        jSONObject.put(c3390a.f6613a, c3390a.f6614b);
                        c3390a.m8425j();
                    }
                }
            } catch (JSONException e) {
                CrashHelper.c(e);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static void m8403c(String str, String str2, C3390a... c3390aArr) {
        if (NullChecker.a(c3390aArr)) {
            zvf0.t(str, str2, m8402b(c3390aArr));
        } else {
            zvf0.r(str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m8404d(String str, String str2, Map<String, Object> map) {
        if (NullChecker.a(map)) {
            zvf0.s(str, str2, map);
        } else {
            zvf0.r(str, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m8405e(String str, String str2, j760... j760VarArr) {
        if (NullChecker.a(j760VarArr)) {
            zvf0.u(str, str2, j760VarArr);
        } else {
            zvf0.r(str, str2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m8406f(String str, String str2, Map<String, Object> map) {
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.MODULE_SLIDER;
        l3fVar.s = str;
        l3fVar.n = str2;
        if (NullChecker.a(map)) {
            l3fVar.w = m8401a(map);
        }
        zvf0.m(l3fVar);
    }

    /* JADX INFO: renamed from: g */
    public static void m8407g(String str, String str2, C3390a... c3390aArr) {
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.MODULE_SLIDER;
        l3fVar.s = str;
        l3fVar.n = str2;
        if (NullChecker.a(c3390aArr)) {
            l3fVar.w = m8402b(c3390aArr);
        }
        zvf0.m(l3fVar);
    }

    /* JADX INFO: renamed from: h */
    public static void m8408h(String str, String str2, C3390a... c3390aArr) {
        if (NullChecker.a(c3390aArr)) {
            zvf0.z(str, str2, m8402b(c3390aArr));
        } else {
            zvf0.x(str, str2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m8409i(String str, String str2) {
        m8410j(str, str2, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0062  */
    /* JADX INFO: renamed from: j */
    public static void m8410j(String str, String str2, Map<String, Object> map) {
        String str3;
        long jO = mqi0.o() - 500;
        if (jO > f6608b) {
            f6607a.clear();
        }
        if (f6607a.size() > 94) {
            Iterator<String> it = f6607a.keySet().iterator();
            if (it.hasNext() && f6607a.size() > 50) {
                it.remove();
                f6607a.size();
            }
        }
        if (NullChecker.a(map)) {
            JSONObject jSONObjectM8401a = m8401a(map);
            if (NullChecker.a(jSONObjectM8401a)) {
                str3 = str + jSONObjectM8401a.toString();
            } else {
                str3 = str;
            }
        } else {
            str3 = str;
        }
        Long l2 = f6607a.get(str3);
        if (l2 != null && l2.longValue() > jO) {
            mqi0.o();
            return;
        }
        long jO2 = mqi0.o();
        f6608b = jO2;
        f6607a.put(str3, Long.valueOf(jO2));
        m8411k(str, str2, map);
    }

    /* JADX INFO: renamed from: k */
    public static void m8411k(String str, String str2, Map<String, Object> map) {
        if (NullChecker.a(map)) {
            zvf0.y(str, str2, map);
        } else {
            zvf0.x(str, str2);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m8412l(String str, String str2, j760... j760VarArr) {
        if (NullChecker.a(j760VarArr)) {
            zvf0.A(str, str2, j760VarArr);
        } else {
            zvf0.x(str, str2);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m8413m(String str, String str2, C3390a... c3390aArr) {
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.SYS_CHECK;
        l3fVar.s = str;
        l3fVar.n = str2;
        if (NullChecker.a(c3390aArr)) {
            l3fVar.w = m8402b(c3390aArr);
        }
        zvf0.m(l3fVar);
    }

    /* JADX INFO: renamed from: n */
    public static void m8414n(String str, String str2, C3390a... c3390aArr) {
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        l3fVar.s = str;
        l3fVar.n = str2;
        if (NullChecker.a(c3390aArr)) {
            l3fVar.w = m8402b(c3390aArr);
        }
        zvf0.m(l3fVar);
    }

    /* JADX INFO: renamed from: o */
    public static void m8415o(String str, String str2, Map<String, Object> map) {
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        l3fVar.s = str;
        l3fVar.n = str2;
        if (NullChecker.a(map)) {
            l3fVar.w = new JSONObject(map);
        }
        zvf0.m(l3fVar);
    }
}
