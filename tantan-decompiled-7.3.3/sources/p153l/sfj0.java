package p153l;

import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class sfj0 {

    /* JADX INFO: renamed from: a */
    public static LinkedHashMap<String, Long> f167714a = new LinkedHashMap<>(128);

    /* JADX INFO: renamed from: b */
    public static long f167715b = 0;

    /* JADX INFO: renamed from: c */
    public static boolean f167716c = false;

    /* JADX INFO: renamed from: l.sfj0$a */
    public static class C20032a {

        /* JADX INFO: renamed from: e */
        public static final Object f167717e = new Object();

        /* JADX INFO: renamed from: f */
        public static int f167718f;

        /* JADX INFO: renamed from: g */
        public static C20032a f167719g;

        /* JADX INFO: renamed from: a */
        public String f167720a;

        /* JADX INFO: renamed from: b */
        public Object f167721b;

        /* JADX INFO: renamed from: c */
        public C20032a f167722c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f167723d = false;

        /* JADX INFO: renamed from: e */
        public static C20032a m185612e() {
            synchronized (f167717e) {
                try {
                    if (!NullChecker.m82486a(f167719g)) {
                        return new C20032a();
                    }
                    C20032a c20032a = f167719g;
                    f167719g = c20032a.f167722c;
                    f167718f--;
                    c20032a.f167722c = null;
                    c20032a.f167723d = false;
                    return c20032a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public static C20032a m185613f(String str, int i) {
            return m185612e().m185617d(str).m185620l(i);
        }

        /* JADX INFO: renamed from: g */
        public static C20032a m185614g(String str, long j) {
            return m185612e().m185617d(str).m185621m(j);
        }

        /* JADX INFO: renamed from: h */
        public static C20032a m185615h(String str, String str2) {
            return m185612e().m185617d(str).m185622n(str2);
        }

        /* JADX INFO: renamed from: i */
        public static C20032a m185616i(String str, boolean z) {
            return m185612e().m185617d(str).m185623o(z);
        }

        /* JADX INFO: renamed from: d */
        public C20032a m185617d(String str) {
            this.f167720a = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public final void m185618j() {
            if (this.f167723d) {
                return;
            }
            m185619k();
        }

        /* JADX INFO: renamed from: k */
        public final void m185619k() {
            synchronized (f167717e) {
                try {
                    if (this.f167723d) {
                        return;
                    }
                    this.f167723d = true;
                    int i = f167718f;
                    if (i < 10) {
                        this.f167720a = null;
                        this.f167721b = null;
                        this.f167722c = f167719g;
                        f167719g = this;
                        f167718f = i + 1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: l */
        public C20032a m185620l(int i) {
            this.f167721b = Integer.valueOf(i);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C20032a m185621m(long j) {
            this.f167721b = Long.valueOf(j);
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C20032a m185622n(String str) {
            this.f167721b = str;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C20032a m185623o(boolean z) {
            this.f167721b = Boolean.valueOf(z);
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m185594a(Map<String, Object> map) {
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
                        wu80.m207938b(e);
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
    public static JSONObject m185595b(C20032a... c20032aArr) {
        JSONObject jSONObject = new JSONObject();
        if (c20032aArr != null) {
            try {
                for (C20032a c20032a : c20032aArr) {
                    if (c20032a != null) {
                        jSONObject.put(c20032a.f167720a, c20032a.f167721b);
                        c20032a.m185618j();
                    }
                }
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static void m185596c(String str, String str2, C20032a... c20032aArr) {
        if (NullChecker.m82486a(c20032aArr)) {
            i4g0.m138522t(str, str2, m185595b(c20032aArr));
        } else {
            i4g0.m138520r(str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m185597d(String str, String str2, Map<String, Object> map) {
        if (NullChecker.m82486a(map)) {
            i4g0.m138521s(str, str2, map);
        } else {
            i4g0.m138520r(str, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m185598e(String str, String str2, pf60... pf60VarArr) {
        if (NullChecker.m82486a(pf60VarArr)) {
            i4g0.m138523u(str, str2, pf60VarArr);
        } else {
            i4g0.m138520r(str, str2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m185599f(String str, String str2, Map<String, Object> map) {
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.MODULE_SLIDER;
        q4fVar.f155581s = str;
        q4fVar.f155576n = str2;
        if (NullChecker.m82486a(map)) {
            q4fVar.f155585w = m185594a(map);
        }
        i4g0.m138515m(q4fVar);
    }

    /* JADX INFO: renamed from: g */
    public static void m185600g(String str, String str2, C20032a... c20032aArr) {
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.MODULE_SLIDER;
        q4fVar.f155581s = str;
        q4fVar.f155576n = str2;
        if (NullChecker.m82486a(c20032aArr)) {
            q4fVar.f155585w = m185595b(c20032aArr);
        }
        i4g0.m138515m(q4fVar);
    }

    /* JADX INFO: renamed from: h */
    public static void m185601h(String str, String str2, C20032a... c20032aArr) {
        if (NullChecker.m82486a(c20032aArr)) {
            i4g0.m138528z(str, str2, m185595b(c20032aArr));
        } else {
            i4g0.m138526x(str, str2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m185602i(String str, String str2) {
        m185603j(str, str2, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0062  */
    /* JADX INFO: renamed from: j */
    public static void m185603j(String str, String str2, Map<String, Object> map) {
        String str3;
        long jM174454o = pzi0.m174454o() - 500;
        if (jM174454o > f167715b) {
            f167714a.clear();
        }
        if (f167714a.size() > 94) {
            Iterator<String> it = f167714a.keySet().iterator();
            if (it.hasNext() && f167714a.size() > 50) {
                it.remove();
                f167714a.size();
            }
        }
        if (NullChecker.m82486a(map)) {
            JSONObject jSONObjectM185594a = m185594a(map);
            if (NullChecker.m82486a(jSONObjectM185594a)) {
                str3 = str + jSONObjectM185594a.toString();
            } else {
                str3 = str;
            }
        } else {
            str3 = str;
        }
        Long l2 = f167714a.get(str3);
        if (l2 != null && l2.longValue() > jM174454o) {
            pzi0.m174454o();
            return;
        }
        long jM174454o2 = pzi0.m174454o();
        f167715b = jM174454o2;
        f167714a.put(str3, Long.valueOf(jM174454o2));
        m185604k(str, str2, map);
    }

    /* JADX INFO: renamed from: k */
    public static void m185604k(String str, String str2, Map<String, Object> map) {
        if (NullChecker.m82486a(map)) {
            i4g0.m138527y(str, str2, map);
        } else {
            i4g0.m138526x(str, str2);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m185605l(String str, String str2, pf60... pf60VarArr) {
        if (NullChecker.m82486a(pf60VarArr)) {
            i4g0.m138492A(str, str2, pf60VarArr);
        } else {
            i4g0.m138526x(str, str2);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m185606m(String str, String str2, C20032a... c20032aArr) {
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.SYS_CHECK;
        q4fVar.f155581s = str;
        q4fVar.f155576n = str2;
        if (NullChecker.m82486a(c20032aArr)) {
            q4fVar.f155585w = m185595b(c20032aArr);
        }
        i4g0.m138515m(q4fVar);
    }

    /* JADX INFO: renamed from: n */
    public static void m185607n(String str, String str2, C20032a... c20032aArr) {
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        q4fVar.f155581s = str;
        q4fVar.f155576n = str2;
        if (NullChecker.m82486a(c20032aArr)) {
            q4fVar.f155585w = m185595b(c20032aArr);
        }
        i4g0.m138515m(q4fVar);
    }

    /* JADX INFO: renamed from: o */
    public static void m185608o(String str, String str2, Map<String, Object> map) {
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        q4fVar.f155581s = str;
        q4fVar.f155576n = str2;
        if (NullChecker.m82486a(map)) {
            q4fVar.f155585w = new JSONObject(map);
        }
        i4g0.m138515m(q4fVar);
    }
}
