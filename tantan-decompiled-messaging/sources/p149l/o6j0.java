package p149l;

import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class o6j0 {

    /* JADX INFO: renamed from: a */
    public static LinkedHashMap<String, Long> f142353a = new LinkedHashMap<>(128);

    /* JADX INFO: renamed from: b */
    public static long f142354b = 0;

    /* JADX INFO: renamed from: c */
    public static boolean f142355c = false;

    /* JADX INFO: renamed from: l.o6j0$a */
    public static class C18854a {

        /* JADX INFO: renamed from: e */
        public static final Object f142356e = new Object();

        /* JADX INFO: renamed from: f */
        public static int f142357f;

        /* JADX INFO: renamed from: g */
        public static C18854a f142358g;

        /* JADX INFO: renamed from: a */
        public String f142359a;

        /* JADX INFO: renamed from: b */
        public Object f142360b;

        /* JADX INFO: renamed from: c */
        public C18854a f142361c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f142362d = false;

        /* JADX INFO: renamed from: e */
        public static C18854a m162875e() {
            synchronized (f142356e) {
                try {
                    if (!NullChecker.m81303a(f142358g)) {
                        return new C18854a();
                    }
                    C18854a c18854a = f142358g;
                    f142358g = c18854a.f142361c;
                    f142357f--;
                    c18854a.f142361c = null;
                    c18854a.f142362d = false;
                    return c18854a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public static C18854a m162876f(String str, int i) {
            return m162875e().m162880d(str).m162883l(i);
        }

        /* JADX INFO: renamed from: g */
        public static C18854a m162877g(String str, long j) {
            return m162875e().m162880d(str).m162884m(j);
        }

        /* JADX INFO: renamed from: h */
        public static C18854a m162878h(String str, String str2) {
            return m162875e().m162880d(str).m162885n(str2);
        }

        /* JADX INFO: renamed from: i */
        public static C18854a m162879i(String str, boolean z) {
            return m162875e().m162880d(str).m162886o(z);
        }

        /* JADX INFO: renamed from: d */
        public C18854a m162880d(String str) {
            this.f142359a = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public final void m162881j() {
            if (this.f142362d) {
                return;
            }
            m162882k();
        }

        /* JADX INFO: renamed from: k */
        public final void m162882k() {
            synchronized (f142356e) {
                try {
                    if (this.f142362d) {
                        return;
                    }
                    this.f142362d = true;
                    int i = f142357f;
                    if (i < 10) {
                        this.f142359a = null;
                        this.f142360b = null;
                        this.f142361c = f142358g;
                        f142358g = this;
                        f142357f = i + 1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: l */
        public C18854a m162883l(int i) {
            this.f142360b = Integer.valueOf(i);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C18854a m162884m(long j) {
            this.f142360b = Long.valueOf(j);
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C18854a m162885n(String str) {
            this.f142360b = str;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C18854a m162886o(boolean z) {
            this.f142360b = Boolean.valueOf(z);
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m162857a(Map<String, Object> map) {
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
                        sm80.m184942b(e);
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
    public static JSONObject m162858b(C18854a... c18854aArr) {
        JSONObject jSONObject = new JSONObject();
        if (c18854aArr != null) {
            try {
                for (C18854a c18854a : c18854aArr) {
                    if (c18854a != null) {
                        jSONObject.put(c18854a.f142359a, c18854a.f142360b);
                        c18854a.m162881j();
                    }
                }
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static void m162859c(String str, String str2, C18854a... c18854aArr) {
        if (NullChecker.m81303a(c18854aArr)) {
            zvf0.m220398t(str, str2, m162858b(c18854aArr));
        } else {
            zvf0.m220396r(str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m162860d(String str, String str2, Map<String, Object> map) {
        if (NullChecker.m81303a(map)) {
            zvf0.m220397s(str, str2, map);
        } else {
            zvf0.m220396r(str, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m162861e(String str, String str2, j760... j760VarArr) {
        if (NullChecker.m81303a(j760VarArr)) {
            zvf0.m220399u(str, str2, j760VarArr);
        } else {
            zvf0.m220396r(str, str2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m162862f(String str, String str2, Map<String, Object> map) {
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.MODULE_SLIDER;
        l3fVar.f125900s = str;
        l3fVar.f125895n = str2;
        if (NullChecker.m81303a(map)) {
            l3fVar.f125904w = m162857a(map);
        }
        zvf0.m220391m(l3fVar);
    }

    /* JADX INFO: renamed from: g */
    public static void m162863g(String str, String str2, C18854a... c18854aArr) {
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.MODULE_SLIDER;
        l3fVar.f125900s = str;
        l3fVar.f125895n = str2;
        if (NullChecker.m81303a(c18854aArr)) {
            l3fVar.f125904w = m162858b(c18854aArr);
        }
        zvf0.m220391m(l3fVar);
    }

    /* JADX INFO: renamed from: h */
    public static void m162864h(String str, String str2, C18854a... c18854aArr) {
        if (NullChecker.m81303a(c18854aArr)) {
            zvf0.m220404z(str, str2, m162858b(c18854aArr));
        } else {
            zvf0.m220402x(str, str2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m162865i(String str, String str2) {
        m162866j(str, str2, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0062  */
    /* JADX INFO: renamed from: j */
    public static void m162866j(String str, String str2, Map<String, Object> map) {
        String str3;
        long jM155944o = mqi0.m155944o() - 500;
        if (jM155944o > f142354b) {
            f142353a.clear();
        }
        if (f142353a.size() > 94) {
            Iterator<String> it = f142353a.keySet().iterator();
            if (it.hasNext() && f142353a.size() > 50) {
                it.remove();
                f142353a.size();
            }
        }
        if (NullChecker.m81303a(map)) {
            JSONObject jSONObjectM162857a = m162857a(map);
            if (NullChecker.m81303a(jSONObjectM162857a)) {
                str3 = str + jSONObjectM162857a.toString();
            } else {
                str3 = str;
            }
        } else {
            str3 = str;
        }
        Long l2 = f142353a.get(str3);
        if (l2 != null && l2.longValue() > jM155944o) {
            mqi0.m155944o();
            return;
        }
        long jM155944o2 = mqi0.m155944o();
        f142354b = jM155944o2;
        f142353a.put(str3, Long.valueOf(jM155944o2));
        m162867k(str, str2, map);
    }

    /* JADX INFO: renamed from: k */
    public static void m162867k(String str, String str2, Map<String, Object> map) {
        if (NullChecker.m81303a(map)) {
            zvf0.m220403y(str, str2, map);
        } else {
            zvf0.m220402x(str, str2);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m162868l(String str, String str2, j760... j760VarArr) {
        if (NullChecker.m81303a(j760VarArr)) {
            zvf0.m220368A(str, str2, j760VarArr);
        } else {
            zvf0.m220402x(str, str2);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m162869m(String str, String str2, C18854a... c18854aArr) {
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.SYS_CHECK;
        l3fVar.f125900s = str;
        l3fVar.f125895n = str2;
        if (NullChecker.m81303a(c18854aArr)) {
            l3fVar.f125904w = m162858b(c18854aArr);
        }
        zvf0.m220391m(l3fVar);
    }

    /* JADX INFO: renamed from: n */
    public static void m162870n(String str, String str2, C18854a... c18854aArr) {
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        l3fVar.f125900s = str;
        l3fVar.f125895n = str2;
        if (NullChecker.m81303a(c18854aArr)) {
            l3fVar.f125904w = m162858b(c18854aArr);
        }
        zvf0.m220391m(l3fVar);
    }

    /* JADX INFO: renamed from: o */
    public static void m162871o(String str, String str2, Map<String, Object> map) {
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        l3fVar.f125900s = str;
        l3fVar.f125895n = str2;
        if (NullChecker.m81303a(map)) {
            l3fVar.f125904w = new JSONObject(map);
        }
        zvf0.m220391m(l3fVar);
    }
}
