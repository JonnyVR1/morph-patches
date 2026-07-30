package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.immomo.android.httpbase.R$string;
import com.immomo.http.exception.HttpResponseStatusErrorException;
import com.immomo.http.exception.NetworkUnavailableException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class q500 {

    /* JADX INFO: renamed from: a */
    @NonNull
    private final List<axm> f152692a;

    /* JADX INFO: renamed from: b */
    @NonNull
    private final List<o3f> f152693b;

    /* JADX INFO: renamed from: c */
    @Nullable
    private o3f.InterfaceC18833b f152694c;

    /* JADX INFO: renamed from: d */
    private final a5e f152695d;

    /* JADX INFO: renamed from: e */
    private final boolean f152696e;

    /* JADX INFO: renamed from: f */
    private final boolean f152697f;

    /* JADX INFO: renamed from: g */
    private final int f152698g;

    /* JADX INFO: renamed from: h */
    private final int f152699h;

    /* JADX INFO: renamed from: i */
    private final int f152700i;

    /* JADX INFO: renamed from: j */
    private int f152701j;

    /* JADX INFO: renamed from: k */
    @Nullable
    private final Map<String, String> f152702k;

    /* JADX INFO: renamed from: l */
    private final HostnameVerifier f152703l;

    /* JADX INFO: renamed from: m */
    private final SSLSocketFactory f152704m;

    /* JADX INFO: renamed from: n */
    private final X509TrustManager f152705n;

    /* JADX INFO: renamed from: o */
    @NonNull
    private final k850 f152706o;

    /* JADX INFO: renamed from: l.q500$a */
    public static final class C19428a {

        /* JADX INFO: renamed from: c */
        o3f.InterfaceC18833b f152709c;

        /* JADX INFO: renamed from: j */
        int f152716j;

        /* JADX INFO: renamed from: k */
        @Nullable
        private Map<String, String> f152717k;

        /* JADX INFO: renamed from: l */
        HostnameVerifier f152718l;

        /* JADX INFO: renamed from: m */
        SSLSocketFactory f152719m;

        /* JADX INFO: renamed from: n */
        X509TrustManager f152720n;

        /* JADX INFO: renamed from: a */
        final List<axm> f152707a = new ArrayList();

        /* JADX INFO: renamed from: b */
        List<o3f> f152708b = new ArrayList(1);

        /* JADX INFO: renamed from: d */
        a5e f152710d = new j500();

        /* JADX INFO: renamed from: e */
        boolean f152711e = true;

        /* JADX INFO: renamed from: f */
        boolean f152712f = true;

        /* JADX INFO: renamed from: g */
        int f152713g = 5000;

        /* JADX INFO: renamed from: h */
        int f152714h = 10000;

        /* JADX INFO: renamed from: i */
        int f152715i = 10000;

        public C19428a() {
            this.f152708b.add(new ztc0());
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ jsl m172986b(C19428a c19428a) {
            c19428a.getClass();
            return null;
        }

        /* JADX INFO: renamed from: c */
        public q500 m172987c() {
            return new q500(this, null);
        }

        /* JADX INFO: renamed from: d */
        public C19428a m172988d(int i) {
            this.f152713g = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C19428a m172989e(int i) {
            this.f152714h = i;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C19428a m172990f(int i) {
            this.f152715i = i;
            return this;
        }
    }

    private q500(C19428a c19428a) {
        List<axm> listM188019t = tck0.m188019t(c19428a.f152707a);
        this.f152692a = listM188019t;
        List<o3f> list = c19428a.f152708b;
        this.f152693b = list;
        a5e a5eVar = c19428a.f152710d;
        this.f152695d = a5eVar;
        boolean z = c19428a.f152711e;
        this.f152696e = z;
        boolean z2 = c19428a.f152712f;
        this.f152697f = z2;
        int i = c19428a.f152713g;
        this.f152698g = i;
        int i2 = c19428a.f152714h;
        this.f152699h = i2;
        int i3 = c19428a.f152715i;
        this.f152700i = i3;
        this.f152701j = c19428a.f152716j;
        this.f152702k = c19428a.f152717k;
        C19428a.m172986b(c19428a);
        this.f152694c = c19428a.f152709c;
        this.f152703l = c19428a.f152718l;
        this.f152704m = c19428a.f152719m;
        this.f152705n = c19428a.f152720n;
        if (listM188019t.contains(null)) {
            rkq0.m179764a("Null interceptor: ", listM188019t);
            throw null;
        }
        k850.C17954b c17954b = new k850.C17954b();
        long j = i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        k850.C17954b c17954bM144891l = c17954b.m144885f(j, timeUnit).m144903x(i3, timeUnit).m144899t(i2, timeUnit).m144892m(z).m144900u(z2).m144895p(this.f152701j, timeUnit).m144889j(a5eVar).m144891l(new q3f.C19421b(list, this.f152694c));
        Iterator<axm> it = listM188019t.iterator();
        while (it.hasNext()) {
            c17954bM144891l.m144880a(it.next());
        }
        HostnameVerifier hostnameVerifier = this.f152703l;
        if (hostnameVerifier != null) {
            c17954bM144891l.m144894o(hostnameVerifier);
        }
        SSLSocketFactory sSLSocketFactory = this.f152704m;
        if (sSLSocketFactory != null) {
            c17954bM144891l.m144902w(sSLSocketFactory, this.f152705n);
        }
        this.f152706o = c17954bM144891l.m144882c();
    }

    /* JADX INFO: renamed from: a */
    private stc0 m172980a(t500 t500Var) {
        HashMap map;
        Map<String, String> map2 = this.f152702k;
        if (map2 == null || map2.size() <= 0) {
            map = null;
        } else {
            map = new HashMap();
            map.putAll(this.f152702k);
        }
        return t500Var.m187235b(map);
    }

    /* JADX INFO: renamed from: b */
    private k850 m172981b(t500 t500Var) {
        boolean zM187238f = t500Var.m187238f();
        k850 k850Var = this.f152706o;
        if (!zM187238f) {
            return k850Var;
        }
        k850.C17954b c17954bM144867v = k850Var.m144867v();
        long jM187236d = t500Var.m187236d();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (jM187236d > 0) {
            c17954bM144867v.m144885f(t500Var.m187236d(), timeUnit);
        }
        if (t500Var.m187240h() > 0) {
            c17954bM144867v.m144903x(t500Var.m187240h(), timeUnit);
        }
        if (t500Var.m187239g() > 0) {
            c17954bM144867v.m144899t(t500Var.m187239g(), timeUnit);
        }
        if (t500Var.m187237e() != null) {
            Object[] objArrM117116a = eld0.m117116a(t500Var.m187237e());
            c17954bM144867v.m144902w((SSLSocketFactory) objArrM117116a[0], (X509TrustManager) objArrM117116a[1]);
        }
        return c17954bM144867v.m144882c();
    }

    /* JADX INFO: renamed from: d */
    private u500 m172982d(t500 t500Var) throws Exception {
        exc0 exc0VarExecute = m172981b(t500Var).mo144849a(m172980a(t500Var)).execute();
        int iM118609q = exc0VarExecute.m118609q();
        if (iM118609q < 200 || iM118609q > 299) {
            throw new HttpResponseStatusErrorException(iM118609q, m172983e(exc0VarExecute));
        }
        return new u500(exc0VarExecute);
    }

    /* JADX INFO: renamed from: e */
    private String m172983e(exc0 exc0Var) {
        String strOptString;
        String str = "";
        try {
            JSONObject jSONObject = new JSONObject(new u500(exc0Var).m191788t());
            strOptString = jSONObject.has("errmsg") ? jSONObject.optString("errmsg", "") : "";
            try {
                if (jSONObject.has("em")) {
                    strOptString = jSONObject.optString("em", "");
                }
            } catch (Throwable unused) {
                str = strOptString;
                strOptString = str;
            }
        } catch (Throwable unused2) {
        }
        return b0g0.m99770c(strOptString) ? ev0.m118233a().getString(R$string.f12833a) : strOptString;
    }

    /* JADX INFO: renamed from: c */
    public u500 m172984c(t500 t500Var) throws Exception {
        if (na20.m158575f()) {
            return m172982d(t500Var);
        }
        throw new NetworkUnavailableException();
    }

    public /* synthetic */ q500(C19428a c19428a, p500 p500Var) {
        this(c19428a);
    }
}
