package p009l;

import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.remote_config.C0500a;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import l.e30;
import l.f30;
import l.mkd0;
import org.json.JSONException;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class iv5 {

    /* JADX INFO: renamed from: d */
    public static final Charset f14829d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: e */
    public static final Pattern f14830e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* JADX INFO: renamed from: f */
    public static final Pattern f14831f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* JADX INFO: renamed from: g */
    public static final Map<String, iv5> f14832g = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Set<f30<String, C0500a>> f14833a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final xu5 f14834b;

    /* JADX INFO: renamed from: c */
    public final xu5 f14835c;

    public iv5(xu5 xu5Var, xu5 xu5Var2) {
        this.f14834b = xu5Var;
        this.f14835c = xu5Var2;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized iv5 m16746c(xu5 xu5Var, xu5 xu5Var2) {
        String str;
        Map<String, iv5> map;
        try {
            str = xu5Var.m24997g() + "-" + xu5Var2.m24997g();
            map = f14832g;
            if (!map.containsKey(str)) {
                map.put(str, new iv5(xu5Var, xu5Var2));
            }
        } catch (Throwable th) {
            throw th;
        }
        return map.get(str);
    }

    /* JADX INFO: renamed from: g */
    public static iv5 m16747g(String str, String str2) {
        return f14832g.get(str + "-" + str2);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static C0500a m16748h(xu5 xu5Var) {
        return xu5Var.m24995d();
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static Double m16749k(xu5 xu5Var, String str) {
        C0500a c0500aM16748h = m16748h(xu5Var);
        if (c0500aM16748h == null) {
            return null;
        }
        try {
            return Double.valueOf(c0500aM16748h.m9664d().getDouble(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static Integer m16750o(xu5 xu5Var, String str) {
        C0500a c0500aM16748h = m16748h(xu5Var);
        if (c0500aM16748h == null) {
            return null;
        }
        try {
            return Integer.valueOf(c0500aM16748h.m9664d().getInt(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static Set<String> m16751p(xu5 xu5Var) {
        HashSet hashSet = new HashSet();
        C0500a c0500aM16748h = m16748h(xu5Var);
        if (c0500aM16748h != null) {
            Iterator<String> itKeys = c0500aM16748h.m9664d().keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public static Long m16752s(xu5 xu5Var, String str) {
        C0500a c0500aM16748h = m16748h(xu5Var);
        if (c0500aM16748h == null) {
            return null;
        }
        try {
            return Long.valueOf(c0500aM16748h.m9664d().getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public static String m16753u(xu5 xu5Var, String str) {
        C0500a c0500aM16748h = m16748h(xu5Var);
        if (c0500aM16748h == null) {
            return null;
        }
        try {
            return c0500aM16748h.m9664d().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m16754w(String str, String str2) {
        String.format("No value of type '%s' exists for parameter key '%s'.", str2, str);
    }

    /* JADX INFO: renamed from: b */
    public final void m16755b(final String str, final C0500a c0500a) {
        if (c0500a == null) {
            return;
        }
        synchronized (this.f14833a) {
            try {
                for (final f30<String, C0500a> f30Var : this.f14833a) {
                    c.empty().compose(mkd0.Q()).subscribe(mkd0.G(new e30() { // from class: l.gv5
                        public final void call(Object obj) {
                            f30Var.call(str, c0500a);
                        }
                    }));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public xu5 m16756d() {
        return this.f14834b;
    }

    /* JADX INFO: renamed from: e */
    public Map<String, cqc0> m16757e() {
        HashMap map = new HashMap();
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(m16751p(this.f14834b));
        for (String str : hashSet) {
            map.put(str, m16767v(str));
        }
        return map;
    }

    /* JADX INFO: renamed from: f */
    public boolean m16758f(String str) {
        String strM16753u = m16753u(this.f14834b, str);
        if (strM16753u != null) {
            if (f14830e.matcher(strM16753u).matches()) {
                m16755b(str, m16748h(this.f14834b));
                return true;
            }
            if (f14831f.matcher(strM16753u).matches()) {
                m16755b(str, m16748h(this.f14834b));
                return false;
            }
        }
        m16754w(str, "Boolean");
        return false;
    }

    /* JADX INFO: renamed from: i */
    public double m16759i(String str) {
        return m16760j(str, 0.0d);
    }

    /* JADX INFO: renamed from: j */
    public double m16760j(String str, double d) {
        Double dM16749k = m16749k(this.f14834b, str);
        if (dM16749k != null) {
            m16755b(str, m16748h(this.f14834b));
            return dM16749k.doubleValue();
        }
        m16754w(str, "Double");
        return d;
    }

    /* JADX INFO: renamed from: l */
    public xu5 m16761l() {
        return this.f14835c;
    }

    /* JADX INFO: renamed from: m */
    public int m16762m(String str) {
        return m16763n(str, 0);
    }

    /* JADX INFO: renamed from: n */
    public int m16763n(String str, int i) {
        Integer numM16750o = m16750o(this.f14834b, str);
        if (numM16750o != null) {
            m16755b(str, m16748h(this.f14834b));
            return numM16750o.intValue();
        }
        m16754w(str, "Integer");
        return i;
    }

    /* JADX INFO: renamed from: q */
    public long m16764q(String str) {
        return m16765r(str, 0L);
    }

    /* JADX INFO: renamed from: r */
    public long m16765r(String str, long j) {
        Long lM16752s = m16752s(this.f14834b, str);
        if (lM16752s != null) {
            m16755b(str, m16748h(this.f14834b));
            return lM16752s.longValue();
        }
        m16754w(str, "Long");
        return j;
    }

    /* JADX INFO: renamed from: t */
    public String m16766t(String str) {
        String strM16753u = m16753u(this.f14834b, str);
        if (strM16753u != null) {
            m16755b(str, m16748h(this.f14834b));
            return strM16753u;
        }
        m16754w(str, "String");
        return "";
    }

    /* JADX INFO: renamed from: v */
    public cqc0 m16767v(String str) {
        String strM16753u = m16753u(this.f14834b, str);
        if (strM16753u != null) {
            m16755b(str, m16748h(this.f14834b));
            return new dqc0(strM16753u, 2);
        }
        m16754w(str, " RemoteConfigValue");
        return new dqc0("", 0);
    }
}
