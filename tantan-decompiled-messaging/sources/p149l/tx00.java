package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.connect.common.Constants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class tx00 {

    /* JADX INFO: renamed from: a */
    k31 f172443a;

    /* JADX INFO: renamed from: d */
    C20306c f172446d;

    /* JADX INFO: renamed from: e */
    jlq0 f172447e;

    /* JADX INFO: renamed from: b */
    HashMap<String, String> f172444b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    HashMap<String, String> f172445c = new HashMap<>();

    /* JADX INFO: renamed from: f */
    private volatile boolean f172448f = false;

    /* JADX INFO: renamed from: l.tx00$a */
    public class RunnableC20304a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f172449a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f172450b;

        public RunnableC20304a(boolean z, Context context) {
            this.f172449a = z;
            this.f172450b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashMap map;
            if (tx00.this.f172448f) {
                return;
            }
            if (!zuq0.m220243e()) {
                zuq0.m220244f();
            }
            if (drq0.m113327n(tx00.this.f172446d.f172453a)) {
                tx00.this.f172448f = true;
                tx00 tx00Var = tx00.this;
                if (tx00Var.f172447e == null) {
                    tx00Var.f172447e = new jlq0();
                }
                if (this.f172449a) {
                    map = null;
                } else {
                    String strM170243b = plq0.m170243b(woq0.m204854a());
                    map = new HashMap();
                    map.put("host_app_id", strM170243b);
                    map.put(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, tx00.this.f172446d.f172457e);
                }
                tx00 tx00Var2 = tx00.this;
                tx00Var2.f172447e.m142106d(this.f172450b, tx00Var2.f172446d, map);
                tx00 tx00Var3 = tx00.this;
                tx00Var3.f172446d.f172462j = tx00Var3.f172447e;
            }
        }
    }

    /* JADX INFO: renamed from: l.tx00$b */
    public class RunnableC20305b implements Runnable {
        public RunnableC20305b(y4m y4mVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            tx00 tx00Var = tx00.this;
            jlq0 jlq0Var = tx00Var.f172447e;
            if (jlq0Var != null) {
                jlq0Var.m142108f(tx00Var.f172445c, null);
            }
        }
    }

    private tx00(C20306c c20306c) {
        this.f172446d = c20306c;
        this.f172443a = c20306c.f172460h;
    }

    /* JADX INFO: renamed from: f */
    private void m190917f(Context context, boolean z) {
        m190918g(context, z);
    }

    /* JADX INFO: renamed from: g */
    private void m190918g(Context context, boolean z) {
        wvq0.m205758b().m151993f(new RunnableC20304a(z, context), 5L);
    }

    /* JADX INFO: renamed from: h */
    public static synchronized tx00 m190919h(Context context, C20306c c20306c) {
        try {
            if (TextUtils.isEmpty(c20306c.f172454b)) {
                Log.e("MonitorCrash", c20306c.f172453a + " MonitorCrash init without token.");
            }
            tx00 tx00VarM204855b = woq0.m204855b(c20306c.f172453a);
            if (tx00VarM204855b != null) {
                Log.e("MonitorCrash", "Duplicate init MonitorCrash with same aid.");
                return tx00VarM204855b;
            }
            tx00 tx00Var = new tx00(c20306c);
            if (!TextUtils.isEmpty(c20306c.f172464l)) {
                tx00Var.m190921k(c20306c.f172464l);
            }
            Map<String, String> map = c20306c.f172466n;
            if (map != null) {
                tx00Var.f172445c.putAll(map);
                tx00Var.f172444b.putAll(tx00Var.f172445c);
            }
            mvq0.m156580c(context, mu40.m156372a().m143409m(), mu40.m156372a().m143409m(), mu40.m156372a().m143410n(), mu40.m156372a().m143406j(), 0L);
            tx00Var.m190917f(context, false);
            woq0.m204857i(tx00Var);
            return tx00Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    private tx00 m190921k(String str) {
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
        kwq0.m147628a("set url ".concat(str));
        hrq0.m132702k().m143417u(str.concat("/monitor/collect/c/exception"));
        hrq0.m132702k().m143416t(str.concat("/monitor/collect/c/crash"));
        hrq0.m132702k().m143418v(str.concat("/monitor/collect/c/native_bin_crash"));
        hrq0.m132702k().m143414r(str.concat("/settings/get"));
        hrq0.m132702k().m143413q(str.concat("/monitor/collect/c/cloudcontrol/file"));
        hrq0.m132702k().m143415s(str.concat("/monitor/collect/c/logcollect"));
        hrq0.m132702k().m143419w(str.concat("/monitor/collect/c/session"));
        return this;
    }

    /* JADX INFO: renamed from: c */
    public tx00 m190922c(String str, String str2) {
        this.f172445c.put(str, str2);
        this.f172444b.put(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public tx00 m190923d(String str, String str2) {
        this.f172444b.put(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C20306c m190924e() {
        return this.f172446d;
    }

    /* JADX INFO: renamed from: j */
    public void m190925j(y4m y4mVar) {
        wvq0.m205758b().m151993f(new RunnableC20305b(y4mVar), 10L);
    }

    /* JADX INFO: renamed from: l.tx00$c */
    public static class C20306c {

        /* JADX INFO: renamed from: a */
        String f172453a;

        /* JADX INFO: renamed from: b */
        String f172454b;

        /* JADX INFO: renamed from: c */
        String f172455c;

        /* JADX INFO: renamed from: d */
        long f172456d;

        /* JADX INFO: renamed from: e */
        String f172457e;

        /* JADX INFO: renamed from: f */
        String[] f172458f;

        /* JADX INFO: renamed from: g */
        String[] f172459g;

        /* JADX INFO: renamed from: h */
        k31 f172460h;

        /* JADX INFO: renamed from: i */
        private String f172461i;

        /* JADX INFO: renamed from: j */
        jlq0 f172462j;

        /* JADX INFO: renamed from: k */
        boolean f172463k;

        /* JADX INFO: renamed from: l */
        String f172464l;

        /* JADX INFO: renamed from: m */
        private a f172465m;

        /* JADX INFO: renamed from: n */
        Map<String, String> f172466n;

        /* JADX INFO: renamed from: l.tx00$c$a */
        public interface a {
            String getDid();

            String getUserId();
        }

        private C20306c() {
            this.f172456d = -1L;
            this.f172463k = false;
            this.f172466n = null;
        }

        /* JADX INFO: renamed from: d */
        public static b m190927d(String str) {
            return new b(str, null);
        }

        /* JADX INFO: renamed from: b */
        public String m190928b() {
            a aVar = this.f172465m;
            return aVar == null ? this.f172461i : aVar.getDid();
        }

        /* JADX INFO: renamed from: c */
        public String m190929c() {
            a aVar = this.f172465m;
            return aVar == null ? "" : aVar.getUserId();
        }

        @Deprecated
        /* JADX INFO: renamed from: e */
        public C20306c m190930e(String str, boolean z) {
            this.f172461i = str;
            jlq0 jlq0Var = this.f172462j;
            if (jlq0Var != null) {
                jlq0Var.m142107e(str);
            }
            if (z) {
                blq0.m102557e();
            }
            return this;
        }

        /* JADX INFO: renamed from: l.tx00$c$b */
        public static class b {

            /* JADX INFO: renamed from: a */
            private C20306c f172467a;

            private b(String str) {
                C20306c c20306c = new C20306c(null);
                this.f172467a = c20306c;
                c20306c.f172453a = str;
            }

            /* JADX INFO: renamed from: a */
            public C20306c m190931a() {
                return this.f172467a;
            }

            /* JADX INFO: renamed from: b */
            public b m190932b(String str) {
                this.f172467a.f172455c = str;
                return this;
            }

            /* JADX INFO: renamed from: c */
            public b m190933c(a aVar) {
                this.f172467a.f172465m = aVar;
                return this;
            }

            /* JADX INFO: renamed from: d */
            public b m190934d(String... strArr) {
                this.f172467a.f172458f = strArr;
                return this;
            }

            /* JADX INFO: renamed from: e */
            public b m190935e(String... strArr) {
                this.f172467a.f172459g = strArr;
                return this;
            }

            /* JADX INFO: renamed from: f */
            public b m190936f(String str) {
                this.f172467a.f172454b = str;
                return this;
            }

            /* JADX INFO: renamed from: g */
            public b m190937g(long j) {
                this.f172467a.f172456d = j;
                return this;
            }

            /* JADX INFO: renamed from: h */
            public b m190938h(String str) {
                this.f172467a.f172457e = str;
                return this;
            }

            public /* synthetic */ b(String str, RunnableC20304a runnableC20304a) {
                this(str);
            }
        }

        public /* synthetic */ C20306c(RunnableC20304a runnableC20304a) {
            this();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m190920i(String str) {
    }
}
