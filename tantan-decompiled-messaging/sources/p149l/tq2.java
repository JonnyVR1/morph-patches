package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.immomo.network.bean.CheckerStatus;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ssl.AbstractVerifier;

/* JADX INFO: loaded from: classes7.dex */
public abstract class tq2 {

    /* JADX INFO: renamed from: a */
    protected Map<String, k850> f171542a;

    /* JADX INFO: renamed from: l.tq2$a */
    public class C20242a extends AbstractVerifier {
        public C20242a() {
        }

        @Override // org.apache.http.conn.ssl.X509HostnameVerifier
        public void verify(String str, String[] strArr, String[] strArr2) throws SSLException {
            verify(str, strArr, strArr2, true);
        }
    }

    public tq2() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f171542a = concurrentHashMap;
        concurrentHashMap.put("REQUEST_INSTANCE", m190081d());
        this.f171542a.put("REQUEST_DOWNLOAD", m190081d());
        if (ot0.m165919a().m165923e()) {
            this.f171542a.put("OKHTTP_REFEREE", m190082e());
        }
    }

    /* JADX INFO: renamed from: c */
    private k850.C17954b m190080c() {
        k850.C17954b c17954bM144889j = new k850.C17954b().m144900u(true).m144889j(new C20243b(this, null));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        k850.C17954b c17954bM144894o = c17954bM144889j.m144885f(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, timeUnit).m144899t(15000L, timeUnit).m144903x(15000L, timeUnit).m144894o(new C20242a());
        Iterator<axm> it = ot0.m165919a().m165920b().iterator();
        while (it.hasNext()) {
            c17954bM144894o.m144880a(it.next());
        }
        return c17954bM144894o;
    }

    /* JADX INFO: renamed from: a */
    public sx3 mo163106a(String str, euc0 euc0Var, stc0 stc0Var) throws IOException {
        k850 k850VarM190081d = this.f171542a.get(str);
        if (k850VarM190081d == null) {
            k850VarM190081d = m190081d();
            this.f171542a.put(str, k850VarM190081d);
        }
        return k850VarM190081d.mo144849a(stc0Var);
    }

    /* JADX INFO: renamed from: b */
    public abstract wgf0 mo163107b();

    /* JADX INFO: renamed from: d */
    public k850 m190081d() {
        return m190080c().m144882c();
    }

    /* JADX INFO: renamed from: e */
    public k850 m190082e() {
        k850.C17954b c17954bM190080c = m190080c();
        c17954bM190080c.m144901v(ot0.m165919a().m165921c());
        return c17954bM190080c.m144882c();
    }

    /* JADX INFO: renamed from: l.tq2$b */
    public class C20243b implements a5e {
        private C20243b() {
        }

        @Override // p149l.a5e
        public List<InetAddress> lookup(String str) throws UnknownHostException {
            String[] strArrMo203051c;
            try {
                if (tq2.this.mo163107b().mo203052d(str)) {
                    ArrayList<String> arrayList = new ArrayList();
                    if (l1m.m148196c().m148198a() == CheckerStatus.AVAILABLE && (strArrMo203051c = tq2.this.mo163107b().mo203051c(str, true)) != null && strArrMo203051c.length > 0) {
                        arrayList.add(strArrMo203051c[0]);
                    }
                    String strMo203050b = tq2.this.mo163107b().mo203050b(str);
                    if (TextUtils.isEmpty(strMo203050b)) {
                        arrayList.add(str);
                    } else {
                        arrayList.add(strMo203050b);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (String str2 : arrayList) {
                        if (!TextUtils.isEmpty(str2)) {
                            arrayList2.addAll(Arrays.asList(InetAddress.getAllByName(str2)));
                        }
                    }
                    return arrayList2;
                }
            } catch (UnknownHostException unused) {
            }
            return a5e.f67705a.lookup(str);
        }

        public /* synthetic */ C20243b(tq2 tq2Var, C20242a c20242a) {
            this();
        }
    }
}
