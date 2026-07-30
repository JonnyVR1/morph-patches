package p149l;

import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.remote_config.C13098a;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONException;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class iv5 {

    /* JADX INFO: renamed from: d */
    public static final Charset f115088d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: e */
    public static final Pattern f115089e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* JADX INFO: renamed from: f */
    public static final Pattern f115090f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* JADX INFO: renamed from: g */
    public static final Map<String, iv5> f115091g = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Set<f30<String, C13098a>> f115092a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final xu5 f115093b;

    /* JADX INFO: renamed from: c */
    public final xu5 f115094c;

    public iv5(xu5 xu5Var, xu5 xu5Var2) {
        this.f115093b = xu5Var;
        this.f115094c = xu5Var2;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized iv5 m138510c(xu5 xu5Var, xu5 xu5Var2) {
        String str;
        Map<String, iv5> map;
        try {
            str = xu5Var.m211086g() + "-" + xu5Var2.m211086g();
            map = f115091g;
            if (!map.containsKey(str)) {
                map.put(str, new iv5(xu5Var, xu5Var2));
            }
        } catch (Throwable th) {
            throw th;
        }
        return map.get(str);
    }

    /* JADX INFO: renamed from: g */
    public static iv5 m138511g(String str, String str2) {
        return f115091g.get(str + "-" + str2);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static C13098a m138512h(xu5 xu5Var) {
        return xu5Var.m211084d();
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static Double m138513k(xu5 xu5Var, String str) {
        C13098a c13098aM138512h = m138512h(xu5Var);
        if (c13098aM138512h == null) {
            return null;
        }
        try {
            return Double.valueOf(c13098aM138512h.m79343d().getDouble(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static Integer m138514o(xu5 xu5Var, String str) {
        C13098a c13098aM138512h = m138512h(xu5Var);
        if (c13098aM138512h == null) {
            return null;
        }
        try {
            return Integer.valueOf(c13098aM138512h.m79343d().getInt(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static Set<String> m138515p(xu5 xu5Var) {
        HashSet hashSet = new HashSet();
        C13098a c13098aM138512h = m138512h(xu5Var);
        if (c13098aM138512h != null) {
            Iterator<String> itKeys = c13098aM138512h.m79343d().keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public static Long m138516s(xu5 xu5Var, String str) {
        C13098a c13098aM138512h = m138512h(xu5Var);
        if (c13098aM138512h == null) {
            return null;
        }
        try {
            return Long.valueOf(c13098aM138512h.m79343d().getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public static String m138517u(xu5 xu5Var, String str) {
        C13098a c13098aM138512h = m138512h(xu5Var);
        if (c13098aM138512h == null) {
            return null;
        }
        try {
            return c13098aM138512h.m79343d().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m138518w(String str, String str2) {
        String.format("No value of type '%s' exists for parameter key '%s'.", str2, str);
    }

    /* JADX INFO: renamed from: b */
    public final void m138519b(final String str, final C13098a c13098a) {
        if (c13098a == null) {
            return;
        }
        synchronized (this.f115092a) {
            try {
                for (final f30<String, C13098a> f30Var : this.f115092a) {
                    C22306c.empty().compose(mkd0.m154965Q()).subscribe(mkd0.m154955G(new e30() { // from class: l.gv5
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            f30Var.call(str, c13098a);
                        }
                    }));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public xu5 m138520d() {
        return this.f115093b;
    }

    /* JADX INFO: renamed from: e */
    public Map<String, cqc0> m138521e() {
        HashMap map = new HashMap();
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(m138515p(this.f115093b));
        for (String str : hashSet) {
            map.put(str, m138531v(str));
        }
        return map;
    }

    /* JADX INFO: renamed from: f */
    public boolean m138522f(String str) {
        String strM138517u = m138517u(this.f115093b, str);
        if (strM138517u != null) {
            if (f115089e.matcher(strM138517u).matches()) {
                m138519b(str, m138512h(this.f115093b));
                return true;
            }
            if (f115090f.matcher(strM138517u).matches()) {
                m138519b(str, m138512h(this.f115093b));
                return false;
            }
        }
        m138518w(str, "Boolean");
        return false;
    }

    /* JADX INFO: renamed from: i */
    public double m138523i(String str) {
        return m138524j(str, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    /* JADX INFO: renamed from: j */
    public double m138524j(String str, double d) {
        Double dM138513k = m138513k(this.f115093b, str);
        if (dM138513k != null) {
            m138519b(str, m138512h(this.f115093b));
            return dM138513k.doubleValue();
        }
        m138518w(str, "Double");
        return d;
    }

    /* JADX INFO: renamed from: l */
    public xu5 m138525l() {
        return this.f115094c;
    }

    /* JADX INFO: renamed from: m */
    public int m138526m(String str) {
        return m138527n(str, 0);
    }

    /* JADX INFO: renamed from: n */
    public int m138527n(String str, int i) {
        Integer numM138514o = m138514o(this.f115093b, str);
        if (numM138514o != null) {
            m138519b(str, m138512h(this.f115093b));
            return numM138514o.intValue();
        }
        m138518w(str, "Integer");
        return i;
    }

    /* JADX INFO: renamed from: q */
    public long m138528q(String str) {
        return m138529r(str, 0L);
    }

    /* JADX INFO: renamed from: r */
    public long m138529r(String str, long j) {
        Long lM138516s = m138516s(this.f115093b, str);
        if (lM138516s != null) {
            m138519b(str, m138512h(this.f115093b));
            return lM138516s.longValue();
        }
        m138518w(str, "Long");
        return j;
    }

    /* JADX INFO: renamed from: t */
    public String m138530t(String str) {
        String strM138517u = m138517u(this.f115093b, str);
        if (strM138517u != null) {
            m138519b(str, m138512h(this.f115093b));
            return strM138517u;
        }
        m138518w(str, "String");
        return "";
    }

    /* JADX INFO: renamed from: v */
    public cqc0 m138531v(String str) {
        String strM138517u = m138517u(this.f115093b, str);
        if (strM138517u != null) {
            m138519b(str, m138512h(this.f115093b));
            return new dqc0(strM138517u, 2);
        }
        m138518w(str, " RemoteConfigValue");
        return new dqc0("", 0);
    }
}
