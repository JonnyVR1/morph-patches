package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.connect.common.Constants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class d610 {

    /* JADX INFO: renamed from: a */
    r31 f85226a;

    /* JADX INFO: renamed from: d */
    C16462c f85229d;

    /* JADX INFO: renamed from: e */
    puq0 f85230e;

    /* JADX INFO: renamed from: b */
    HashMap<String, String> f85227b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    HashMap<String, String> f85228c = new HashMap<>();

    /* JADX INFO: renamed from: f */
    private volatile boolean f85231f = false;

    /* JADX INFO: renamed from: l.d610$a */
    public class RunnableC16460a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f85232a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f85233b;

        public RunnableC16460a(boolean z, Context context) {
            this.f85232a = z;
            this.f85233b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashMap map;
            if (d610.this.f85231f) {
                return;
            }
            if (!f4r0.m124030e()) {
                f4r0.m124031f();
            }
            if (j0r0.m142996n(d610.this.f85229d.f85236a)) {
                d610.this.f85231f = true;
                d610 d610Var = d610.this;
                if (d610Var.f85230e == null) {
                    d610Var.f85230e = new puq0();
                }
                if (this.f85232a) {
                    map = null;
                } else {
                    String strM202878b = vuq0.m202878b(cyq0.m113207a());
                    map = new HashMap();
                    map.put("host_app_id", strM202878b);
                    map.put(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, d610.this.f85229d.f85240e);
                }
                d610 d610Var2 = d610.this;
                d610Var2.f85230e.m173902d(this.f85233b, d610Var2.f85229d, map);
                d610 d610Var3 = d610.this;
                d610Var3.f85229d.f85245j = d610Var3.f85230e;
            }
        }
    }

    /* JADX INFO: renamed from: l.d610$b */
    public class RunnableC16461b implements Runnable {
        public RunnableC16461b(o7m o7mVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            d610 d610Var = d610.this;
            puq0 puq0Var = d610Var.f85230e;
            if (puq0Var != null) {
                puq0Var.m173904f(d610Var.f85228c, null);
            }
        }
    }

    private d610(C16462c c16462c) {
        this.f85229d = c16462c;
        this.f85226a = c16462c.f85243h;
    }

    /* JADX INFO: renamed from: f */
    private void m114343f(Context context, boolean z) {
        m114344g(context, z);
    }

    /* JADX INFO: renamed from: g */
    private void m114344g(Context context, boolean z) {
        c5r0.m108080b().m179946f(new RunnableC16460a(z, context), 5L);
    }

    /* JADX INFO: renamed from: h */
    public static synchronized d610 m114345h(Context context, C16462c c16462c) {
        try {
            if (TextUtils.isEmpty(c16462c.f85237b)) {
                Log.e("MonitorCrash", c16462c.f85236a + " MonitorCrash init without token.");
            }
            d610 d610VarM113208b = cyq0.m113208b(c16462c.f85236a);
            if (d610VarM113208b != null) {
                Log.e("MonitorCrash", "Duplicate init MonitorCrash with same aid.");
                return d610VarM113208b;
            }
            d610 d610Var = new d610(c16462c);
            if (!TextUtils.isEmpty(c16462c.f85247l)) {
                d610Var.m114347k(c16462c.f85247l);
            }
            Map<String, String> map = c16462c.f85249n;
            if (map != null) {
                d610Var.f85228c.putAll(map);
                d610Var.f85227b.putAll(d610Var.f85228c);
            }
            s4r0.m184574c(context, b350.m102269a().m169530m(), b350.m102269a().m169530m(), b350.m102269a().m169531n(), b350.m102269a().m169527j(), 0L);
            d610Var.m114343f(context, false);
            cyq0.m113210i(d610Var);
            return d610Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    private d610 m114347k(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        int iIndexOf = str.indexOf("://");
        if (iIndexOf < 0) {
            str = "https://".concat(str);
            i = 8;
        } else {
            i = iIndexOf + 3;
        }
        int iIndexOf2 = str.indexOf("/", i);
        if (iIndexOf2 >= 0) {
            str = str.substring(0, iIndexOf2);
        }
        q5r0.m175511a("set url ".concat(str));
        n0r0.m161024k().m169538u(str.concat("/monitor/collect/c/exception"));
        n0r0.m161024k().m169537t(str.concat("/monitor/collect/c/crash"));
        n0r0.m161024k().m169539v(str.concat("/monitor/collect/c/native_bin_crash"));
        n0r0.m161024k().m169535r(str.concat("/settings/get"));
        n0r0.m161024k().m169534q(str.concat("/monitor/collect/c/cloudcontrol/file"));
        n0r0.m161024k().m169536s(str.concat("/monitor/collect/c/logcollect"));
        n0r0.m161024k().m169540w(str.concat("/monitor/collect/c/session"));
        return this;
    }

    /* JADX INFO: renamed from: c */
    public d610 m114348c(String str, String str2) {
        this.f85228c.put(str, str2);
        this.f85227b.put(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public d610 m114349d(String str, String str2) {
        this.f85227b.put(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C16462c m114350e() {
        return this.f85229d;
    }

    /* JADX INFO: renamed from: j */
    public void m114351j(o7m o7mVar) {
        c5r0.m108080b().m179946f(new RunnableC16461b(o7mVar), 10L);
    }

    /* JADX INFO: renamed from: l.d610$c */
    public static class C16462c {

        /* JADX INFO: renamed from: a */
        String f85236a;

        /* JADX INFO: renamed from: b */
        String f85237b;

        /* JADX INFO: renamed from: c */
        String f85238c;

        /* JADX INFO: renamed from: d */
        long f85239d;

        /* JADX INFO: renamed from: e */
        String f85240e;

        /* JADX INFO: renamed from: f */
        String[] f85241f;

        /* JADX INFO: renamed from: g */
        String[] f85242g;

        /* JADX INFO: renamed from: h */
        r31 f85243h;

        /* JADX INFO: renamed from: i */
        private String f85244i;

        /* JADX INFO: renamed from: j */
        puq0 f85245j;

        /* JADX INFO: renamed from: k */
        boolean f85246k;

        /* JADX INFO: renamed from: l */
        String f85247l;

        /* JADX INFO: renamed from: m */
        private a f85248m;

        /* JADX INFO: renamed from: n */
        Map<String, String> f85249n;

        /* JADX INFO: renamed from: l.d610$c$a */
        public interface a {
            String getDid();

            String getUserId();
        }

        private C16462c() {
            this.f85239d = -1L;
            this.f85246k = false;
            this.f85249n = null;
        }

        /* JADX INFO: renamed from: d */
        public static b m114353d(String str) {
            return new b(str, null);
        }

        /* JADX INFO: renamed from: b */
        public String m114354b() {
            a aVar = this.f85248m;
            return aVar == null ? this.f85244i : aVar.getDid();
        }

        /* JADX INFO: renamed from: c */
        public String m114355c() {
            a aVar = this.f85248m;
            return aVar == null ? "" : aVar.getUserId();
        }

        @Deprecated
        /* JADX INFO: renamed from: e */
        public C16462c m114356e(String str, boolean z) {
            this.f85244i = str;
            puq0 puq0Var = this.f85245j;
            if (puq0Var != null) {
                puq0Var.m173903e(str);
            }
            if (z) {
                huq0.m137252e();
            }
            return this;
        }

        /* JADX INFO: renamed from: l.d610$c$b */
        public static class b {

            /* JADX INFO: renamed from: a */
            private C16462c f85250a;

            private b(String str) {
                C16462c c16462c = new C16462c(null);
                this.f85250a = c16462c;
                c16462c.f85236a = str;
            }

            /* JADX INFO: renamed from: a */
            public C16462c m114357a() {
                return this.f85250a;
            }

            /* JADX INFO: renamed from: b */
            public b m114358b(String str) {
                this.f85250a.f85238c = str;
                return this;
            }

            /* JADX INFO: renamed from: c */
            public b m114359c(a aVar) {
                this.f85250a.f85248m = aVar;
                return this;
            }

            /* JADX INFO: renamed from: d */
            public b m114360d(String... strArr) {
                this.f85250a.f85241f = strArr;
                return this;
            }

            /* JADX INFO: renamed from: e */
            public b m114361e(String... strArr) {
                this.f85250a.f85242g = strArr;
                return this;
            }

            /* JADX INFO: renamed from: f */
            public b m114362f(String str) {
                this.f85250a.f85237b = str;
                return this;
            }

            /* JADX INFO: renamed from: g */
            public b m114363g(long j) {
                this.f85250a.f85239d = j;
                return this;
            }

            /* JADX INFO: renamed from: h */
            public b m114364h(String str) {
                this.f85250a.f85240e = str;
                return this;
            }

            public /* synthetic */ b(String str, RunnableC16460a runnableC16460a) {
                this(str);
            }
        }

        public /* synthetic */ C16462c(RunnableC16460a runnableC16460a) {
            this();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m114346i(String str) {
    }
}
