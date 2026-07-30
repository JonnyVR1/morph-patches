package p153l;

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
public abstract class jr2 {

    /* JADX INFO: renamed from: a */
    protected Map<String, rg50> f122274a;

    /* JADX INFO: renamed from: l.jr2$a */
    public class C18010a extends AbstractVerifier {
        public C18010a() {
        }

        @Override // org.apache.http.conn.ssl.X509HostnameVerifier
        public void verify(String str, String[] strArr, String[] strArr2) throws SSLException {
            verify(str, strArr, strArr2, true);
        }
    }

    public jr2() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f122274a = concurrentHashMap;
        concurrentHashMap.put("REQUEST_INSTANCE", m146676d());
        this.f122274a.put("REQUEST_DOWNLOAD", m146676d());
        if (ut0.m197956a().m197960e()) {
            this.f122274a.put("OKHTTP_REFEREE", m146677e());
        }
    }

    /* JADX INFO: renamed from: c */
    private rg50.C19837b m146673c() {
        rg50.C19837b c19837bM181372j = new rg50.C19837b().m181384v(true).m181372j(new C18011b(this, null));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        rg50.C19837b c19837bM181377o = c19837bM181372j.m181368f(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, timeUnit).m181383u(15000L, timeUnit).m181387y(15000L, timeUnit).m181377o(new C18010a());
        Iterator<azm> it = ut0.m197956a().m197957b().iterator();
        while (it.hasNext()) {
            c19837bM181377o.m181363a(it.next());
        }
        return c19837bM181377o;
    }

    /* JADX INFO: renamed from: a */
    public ry3 mo146674a(String str, h2d0 h2d0Var, x1d0 x1d0Var) throws IOException {
        rg50 rg50VarM146676d = this.f122274a.get(str);
        if (rg50VarM146676d == null) {
            rg50VarM146676d = m146676d();
            this.f122274a.put(str, rg50VarM146676d);
        }
        return rg50VarM146676d.mo181341a(x1d0Var);
    }

    /* JADX INFO: renamed from: b */
    public abstract epf0 mo146675b();

    /* JADX INFO: renamed from: d */
    public rg50 m146676d() {
        return m146673c().m181365c();
    }

    /* JADX INFO: renamed from: e */
    public rg50 m146677e() {
        rg50.C19837b c19837bM146673c = m146673c();
        c19837bM146673c.m181385w(ut0.m197956a().m197958c());
        return c19837bM146673c.m181365c();
    }

    /* JADX INFO: renamed from: l.jr2$b */
    public class C18011b implements o6e {
        private C18011b() {
        }

        @Override // p153l.o6e
        public List<InetAddress> lookup(String str) throws UnknownHostException {
            String[] strArrMo117513c;
            try {
                if (jr2.this.mo146675b().mo117514d(str)) {
                    ArrayList<String> arrayList = new ArrayList();
                    if (e4m.m119450c().m119452a() == CheckerStatus.AVAILABLE && (strArrMo117513c = jr2.this.mo146675b().mo117513c(str, true)) != null && strArrMo117513c.length > 0) {
                        arrayList.add(strArrMo117513c[0]);
                    }
                    String strMo117512b = jr2.this.mo146675b().mo117512b(str);
                    if (TextUtils.isEmpty(strMo117512b)) {
                        arrayList.add(str);
                    } else {
                        arrayList.add(strMo117512b);
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
            return o6e.f145159a.lookup(str);
        }

        public /* synthetic */ C18011b(jr2 jr2Var, C18010a c18010a) {
            this();
        }
    }
}
