package p153l;

import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.remote_config.C13261a;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONException;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class nw5 {

    /* JADX INFO: renamed from: d */
    public static final Charset f143916d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: e */
    public static final Pattern f143917e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* JADX INFO: renamed from: f */
    public static final Pattern f143918f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* JADX INFO: renamed from: g */
    public static final Map<String, nw5> f143919g = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Set<z20<String, C13261a>> f143920a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final bw5 f143921b;

    /* JADX INFO: renamed from: c */
    public final bw5 f143922c;

    public nw5(bw5 bw5Var, bw5 bw5Var2) {
        this.f143921b = bw5Var;
        this.f143922c = bw5Var2;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized nw5 m164941c(bw5 bw5Var, bw5 bw5Var2) {
        String str;
        Map<String, nw5> map;
        try {
            str = bw5Var.m106642g() + "-" + bw5Var2.m106642g();
            map = f143919g;
            if (!map.containsKey(str)) {
                map.put(str, new nw5(bw5Var, bw5Var2));
            }
        } catch (Throwable th) {
            throw th;
        }
        return map.get(str);
    }

    /* JADX INFO: renamed from: g */
    public static nw5 m164942g(String str, String str2) {
        return f143919g.get(str + "-" + str2);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static C13261a m164943h(bw5 bw5Var) {
        return bw5Var.m106640d();
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static Double m164944k(bw5 bw5Var, String str) {
        C13261a c13261aM164943h = m164943h(bw5Var);
        if (c13261aM164943h == null) {
            return null;
        }
        try {
            return Double.valueOf(c13261aM164943h.m80526d().getDouble(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static Integer m164945o(bw5 bw5Var, String str) {
        C13261a c13261aM164943h = m164943h(bw5Var);
        if (c13261aM164943h == null) {
            return null;
        }
        try {
            return Integer.valueOf(c13261aM164943h.m80526d().getInt(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static Set<String> m164946p(bw5 bw5Var) {
        HashSet hashSet = new HashSet();
        C13261a c13261aM164943h = m164943h(bw5Var);
        if (c13261aM164943h != null) {
            Iterator<String> itKeys = c13261aM164943h.m80526d().keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public static Long m164947s(bw5 bw5Var, String str) {
        C13261a c13261aM164943h = m164943h(bw5Var);
        if (c13261aM164943h == null) {
            return null;
        }
        try {
            return Long.valueOf(c13261aM164943h.m80526d().getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public static String m164948u(bw5 bw5Var, String str) {
        C13261a c13261aM164943h = m164943h(bw5Var);
        if (c13261aM164943h == null) {
            return null;
        }
        try {
            return c13261aM164943h.m80526d().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m164949w(String str, String str2) {
        String.format("No value of type '%s' exists for parameter key '%s'.", str2, str);
    }

    /* JADX INFO: renamed from: b */
    public final void m164950b(final String str, final C13261a c13261a) {
        if (c13261a == null) {
            return;
        }
        synchronized (this.f143920a) {
            try {
                for (final z20<String, C13261a> z20Var : this.f143920a) {
                    C22421c.empty().compose(psd0.m173606Q()).subscribe(psd0.m173596G(new y20() { // from class: l.lw5
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            z20Var.call(str, c13261a);
                        }
                    }));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public bw5 m164951d() {
        return this.f143921b;
    }

    /* JADX INFO: renamed from: e */
    public Map<String, hyc0> m164952e() {
        HashMap map = new HashMap();
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(m164946p(this.f143921b));
        for (String str : hashSet) {
            map.put(str, m164962v(str));
        }
        return map;
    }

    /* JADX INFO: renamed from: f */
    public boolean m164953f(String str) {
        String strM164948u = m164948u(this.f143921b, str);
        if (strM164948u != null) {
            if (f143917e.matcher(strM164948u).matches()) {
                m164950b(str, m164943h(this.f143921b));
                return true;
            }
            if (f143918f.matcher(strM164948u).matches()) {
                m164950b(str, m164943h(this.f143921b));
                return false;
            }
        }
        m164949w(str, "Boolean");
        return false;
    }

    /* JADX INFO: renamed from: i */
    public double m164954i(String str) {
        return m164955j(str, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    /* JADX INFO: renamed from: j */
    public double m164955j(String str, double d) {
        Double dM164944k = m164944k(this.f143921b, str);
        if (dM164944k != null) {
            m164950b(str, m164943h(this.f143921b));
            return dM164944k.doubleValue();
        }
        m164949w(str, "Double");
        return d;
    }

    /* JADX INFO: renamed from: l */
    public bw5 m164956l() {
        return this.f143922c;
    }

    /* JADX INFO: renamed from: m */
    public int m164957m(String str) {
        return m164958n(str, 0);
    }

    /* JADX INFO: renamed from: n */
    public int m164958n(String str, int i) {
        Integer numM164945o = m164945o(this.f143921b, str);
        if (numM164945o != null) {
            m164950b(str, m164943h(this.f143921b));
            return numM164945o.intValue();
        }
        m164949w(str, "Integer");
        return i;
    }

    /* JADX INFO: renamed from: q */
    public long m164959q(String str) {
        return m164960r(str, 0L);
    }

    /* JADX INFO: renamed from: r */
    public long m164960r(String str, long j) {
        Long lM164947s = m164947s(this.f143921b, str);
        if (lM164947s != null) {
            m164950b(str, m164943h(this.f143921b));
            return lM164947s.longValue();
        }
        m164949w(str, "Long");
        return j;
    }

    /* JADX INFO: renamed from: t */
    public String m164961t(String str) {
        String strM164948u = m164948u(this.f143921b, str);
        if (strM164948u != null) {
            m164950b(str, m164943h(this.f143921b));
            return strM164948u;
        }
        m164949w(str, "String");
        return "";
    }

    /* JADX INFO: renamed from: v */
    public hyc0 m164962v(String str) {
        String strM164948u = m164948u(this.f143921b, str);
        if (strM164948u != null) {
            m164950b(str, m164943h(this.f143921b));
            return new iyc0(strM164948u, 2);
        }
        m164949w(str, " RemoteConfigValue");
        return new iyc0("", 0);
    }
}
