package p153l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

/* JADX INFO: renamed from: l.n1 */
/* JADX INFO: loaded from: classes7.dex */
public class C18758n1 implements oi80 {

    /* JADX INFO: renamed from: a */
    public long f139692a;

    /* JADX INFO: renamed from: b */
    public long f139693b;

    /* JADX INFO: renamed from: c */
    public long f139694c;

    /* JADX INFO: renamed from: d */
    public long f139695d;

    /* JADX INFO: renamed from: f */
    public int f139697f;

    /* JADX INFO: renamed from: g */
    public bq80 f139698g;

    /* JADX INFO: renamed from: e */
    public long f139696e = 0;

    /* JADX INFO: renamed from: h */
    public Vector<String> f139699h = new Vector<>();

    /* JADX INFO: renamed from: i */
    public Vector<String> f139700i = new Vector<>();

    /* JADX INFO: renamed from: j */
    public Vector<Long> f139701j = new Vector<>();

    public C18758n1(Context context, w850 w850Var) {
        bq80 bq80Var = new bq80(context.getSharedPreferences("com.android.vending.licensing.APKExpansionPolicy", 0), w850Var);
        this.f139698g = bq80Var;
        this.f139697f = Integer.parseInt(bq80Var.m105885b("lastResponse", Integer.toString(291)));
        this.f139692a = Long.parseLong(this.f139698g.m105885b("validityTimestamp", "0"));
        this.f139693b = Long.parseLong(this.f139698g.m105885b("retryUntil", "0"));
        this.f139694c = Long.parseLong(this.f139698g.m105885b("maxRetries", "0"));
        this.f139695d = Long.parseLong(this.f139698g.m105885b("retryCount", "0"));
    }

    @Override // p153l.oi80
    /* JADX INFO: renamed from: a */
    public void mo161039a(int i, l5d0 l5d0Var) {
        if (i != 291) {
            m161051m(0L);
        } else {
            m161051m(this.f139695d + 1);
        }
        if (i == 256) {
            Map<String, String> mapM161041c = m161041c(l5d0Var.f130102g);
            this.f139697f = i;
            m161053o(Long.toString(System.currentTimeMillis() + Constants.ONE_MIN_IN_MILLIS));
            for (String str : mapM161041c.keySet()) {
                if (str.equals("VT")) {
                    m161053o(mapM161041c.get(str));
                } else if (str.equals("GT")) {
                    m161052n(mapM161041c.get(str));
                } else if (str.equals("GR")) {
                    m161050l(mapM161041c.get(str));
                } else if (str.startsWith("FILE_URL")) {
                    m161048j(Integer.parseInt(str.substring(8)) - 1, mapM161041c.get(str));
                } else if (str.startsWith("FILE_NAME")) {
                    m161046h(Integer.parseInt(str.substring(9)) - 1, mapM161041c.get(str));
                } else if (str.startsWith("FILE_SIZE")) {
                    m161047i(Integer.parseInt(str.substring(9)) - 1, Long.parseLong(mapM161041c.get(str)));
                }
            }
        } else if (i == 561) {
            m161053o("0");
            m161052n("0");
            m161050l("0");
        }
        m161049k(i);
        this.f139698g.m105884a();
    }

    @Override // p153l.oi80
    /* JADX INFO: renamed from: b */
    public boolean mo161040b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = this.f139697f;
        if (i == 256) {
            if (jCurrentTimeMillis <= this.f139692a) {
                return true;
            }
        } else if (i == 291 && jCurrentTimeMillis < this.f139696e + Constants.ONE_MIN_IN_MILLIS) {
            return jCurrentTimeMillis <= this.f139693b || this.f139695d <= this.f139694c;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, String> m161041c(String str) {
        HashMap map = new HashMap();
        try {
            for (NameValuePair nameValuePair : URLEncodedUtils.parse(new URI("?" + str), "UTF-8")) {
                String name = nameValuePair.getName();
                int i = 0;
                while (map.containsKey(name)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(nameValuePair.getName());
                    i++;
                    sb.append(i);
                    name = sb.toString();
                }
                map.put(name, nameValuePair.getValue());
            }
        } catch (URISyntaxException unused) {
        }
        return map;
    }

    /* JADX INFO: renamed from: d */
    public String m161042d(int i) {
        if (i < this.f139700i.size()) {
            return this.f139700i.elementAt(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public String m161043e(int i) {
        if (i < this.f139699h.size()) {
            return this.f139699h.elementAt(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public int m161044f() {
        return this.f139699h.size();
    }

    /* JADX INFO: renamed from: g */
    public void m161045g() {
        this.f139698g.m105886c("lastResponse", Integer.toString(291));
        m161052n("0");
        m161050l("0");
        m161051m(Long.parseLong("0"));
        m161053o("0");
        this.f139698g.m105884a();
    }

    /* JADX INFO: renamed from: h */
    public void m161046h(int i, String str) {
        if (i >= this.f139700i.size()) {
            this.f139700i.setSize(i + 1);
        }
        this.f139700i.set(i, str);
    }

    /* JADX INFO: renamed from: i */
    public void m161047i(int i, long j) {
        if (i >= this.f139701j.size()) {
            this.f139701j.setSize(i + 1);
        }
        this.f139701j.set(i, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: j */
    public void m161048j(int i, String str) {
        if (i >= this.f139699h.size()) {
            this.f139699h.setSize(i + 1);
        }
        this.f139699h.set(i, str);
    }

    /* JADX INFO: renamed from: k */
    public final void m161049k(int i) {
        this.f139696e = System.currentTimeMillis();
        this.f139697f = i;
        this.f139698g.m105886c("lastResponse", Integer.toString(i));
    }

    /* JADX INFO: renamed from: l */
    public final void m161050l(String str) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            lValueOf = 0L;
            str = "0";
        }
        this.f139694c = lValueOf.longValue();
        this.f139698g.m105886c("maxRetries", str);
    }

    /* JADX INFO: renamed from: m */
    public final void m161051m(long j) {
        this.f139695d = j;
        this.f139698g.m105886c("retryCount", Long.toString(j));
    }

    /* JADX INFO: renamed from: n */
    public final void m161052n(String str) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            lValueOf = 0L;
            str = "0";
        }
        this.f139693b = lValueOf.longValue();
        this.f139698g.m105886c("retryUntil", str);
    }

    /* JADX INFO: renamed from: o */
    public final void m161053o(String str) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            long jCurrentTimeMillis = System.currentTimeMillis() + Constants.ONE_MIN_IN_MILLIS;
            Long lValueOf2 = Long.valueOf(jCurrentTimeMillis);
            String string = Long.toString(jCurrentTimeMillis);
            lValueOf = lValueOf2;
            str = string;
        }
        this.f139692a = lValueOf.longValue();
        this.f139698g.m105886c("validityTimestamp", str);
    }
}
