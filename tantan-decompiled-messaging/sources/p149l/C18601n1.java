package p149l;

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
public class C18601n1 implements ia80 {

    /* JADX INFO: renamed from: a */
    public long f136598a;

    /* JADX INFO: renamed from: b */
    public long f136599b;

    /* JADX INFO: renamed from: c */
    public long f136600c;

    /* JADX INFO: renamed from: d */
    public long f136601d;

    /* JADX INFO: renamed from: f */
    public int f136603f;

    /* JADX INFO: renamed from: g */
    public wh80 f136604g;

    /* JADX INFO: renamed from: e */
    public long f136602e = 0;

    /* JADX INFO: renamed from: h */
    public Vector<String> f136605h = new Vector<>();

    /* JADX INFO: renamed from: i */
    public Vector<String> f136606i = new Vector<>();

    /* JADX INFO: renamed from: j */
    public Vector<Long> f136607j = new Vector<>();

    public C18601n1(Context context, h050 h050Var) {
        wh80 wh80Var = new wh80(context.getSharedPreferences("com.android.vending.licensing.APKExpansionPolicy", 0), h050Var);
        this.f136604g = wh80Var;
        this.f136603f = Integer.parseInt(wh80Var.m203115b("lastResponse", Integer.toString(291)));
        this.f136598a = Long.parseLong(this.f136604g.m203115b("validityTimestamp", "0"));
        this.f136599b = Long.parseLong(this.f136604g.m203115b("retryUntil", "0"));
        this.f136600c = Long.parseLong(this.f136604g.m203115b("maxRetries", "0"));
        this.f136601d = Long.parseLong(this.f136604g.m203115b("retryCount", "0"));
    }

    @Override // p149l.ia80
    /* JADX INFO: renamed from: a */
    public void mo135137a(int i, hxc0 hxc0Var) {
        if (i != 291) {
            m157313m(0L);
        } else {
            m157313m(this.f136601d + 1);
        }
        if (i == 256) {
            Map<String, String> mapM157303c = m157303c(hxc0Var.f109850g);
            this.f136603f = i;
            m157315o(Long.toString(System.currentTimeMillis() + Constants.ONE_MIN_IN_MILLIS));
            for (String str : mapM157303c.keySet()) {
                if (str.equals("VT")) {
                    m157315o(mapM157303c.get(str));
                } else if (str.equals("GT")) {
                    m157314n(mapM157303c.get(str));
                } else if (str.equals("GR")) {
                    m157312l(mapM157303c.get(str));
                } else if (str.startsWith("FILE_URL")) {
                    m157310j(Integer.parseInt(str.substring(8)) - 1, mapM157303c.get(str));
                } else if (str.startsWith("FILE_NAME")) {
                    m157308h(Integer.parseInt(str.substring(9)) - 1, mapM157303c.get(str));
                } else if (str.startsWith("FILE_SIZE")) {
                    m157309i(Integer.parseInt(str.substring(9)) - 1, Long.parseLong(mapM157303c.get(str)));
                }
            }
        } else if (i == 561) {
            m157315o("0");
            m157314n("0");
            m157312l("0");
        }
        m157311k(i);
        this.f136604g.m203114a();
    }

    @Override // p149l.ia80
    /* JADX INFO: renamed from: b */
    public boolean mo135138b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = this.f136603f;
        if (i == 256) {
            if (jCurrentTimeMillis <= this.f136598a) {
                return true;
            }
        } else if (i == 291 && jCurrentTimeMillis < this.f136602e + Constants.ONE_MIN_IN_MILLIS) {
            return jCurrentTimeMillis <= this.f136599b || this.f136601d <= this.f136600c;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, String> m157303c(String str) {
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
    public String m157304d(int i) {
        if (i < this.f136606i.size()) {
            return this.f136606i.elementAt(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public String m157305e(int i) {
        if (i < this.f136605h.size()) {
            return this.f136605h.elementAt(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public int m157306f() {
        return this.f136605h.size();
    }

    /* JADX INFO: renamed from: g */
    public void m157307g() {
        this.f136604g.m203116c("lastResponse", Integer.toString(291));
        m157314n("0");
        m157312l("0");
        m157313m(Long.parseLong("0"));
        m157315o("0");
        this.f136604g.m203114a();
    }

    /* JADX INFO: renamed from: h */
    public void m157308h(int i, String str) {
        if (i >= this.f136606i.size()) {
            this.f136606i.setSize(i + 1);
        }
        this.f136606i.set(i, str);
    }

    /* JADX INFO: renamed from: i */
    public void m157309i(int i, long j) {
        if (i >= this.f136607j.size()) {
            this.f136607j.setSize(i + 1);
        }
        this.f136607j.set(i, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: j */
    public void m157310j(int i, String str) {
        if (i >= this.f136605h.size()) {
            this.f136605h.setSize(i + 1);
        }
        this.f136605h.set(i, str);
    }

    /* JADX INFO: renamed from: k */
    public final void m157311k(int i) {
        this.f136602e = System.currentTimeMillis();
        this.f136603f = i;
        this.f136604g.m203116c("lastResponse", Integer.toString(i));
    }

    /* JADX INFO: renamed from: l */
    public final void m157312l(String str) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            lValueOf = 0L;
            str = "0";
        }
        this.f136600c = lValueOf.longValue();
        this.f136604g.m203116c("maxRetries", str);
    }

    /* JADX INFO: renamed from: m */
    public final void m157313m(long j) {
        this.f136601d = j;
        this.f136604g.m203116c("retryCount", Long.toString(j));
    }

    /* JADX INFO: renamed from: n */
    public final void m157314n(String str) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            lValueOf = 0L;
            str = "0";
        }
        this.f136599b = lValueOf.longValue();
        this.f136604g.m203116c("retryUntil", str);
    }

    /* JADX INFO: renamed from: o */
    public final void m157315o(String str) {
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
        this.f136598a = lValueOf.longValue();
        this.f136604g.m203116c("validityTimestamp", str);
    }
}
