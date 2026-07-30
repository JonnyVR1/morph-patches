package p153l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class ow5 {

    /* JADX INFO: renamed from: a */
    private boolean f149432a = true;

    /* JADX INFO: renamed from: b */
    private String f149433b = "https://apmplus.volces.com/monitor/collect/c/crash";

    /* JADX INFO: renamed from: c */
    private String f149434c = "https://apmplus.volces.com/monitor/collect/c/exception/dump_collection";

    /* JADX INFO: renamed from: d */
    private String f149435d = "https://apmplus.volces.com/monitor/collect/c/exception";

    /* JADX INFO: renamed from: e */
    private String f149436e = "https://apmplus.volces.com/monitor/collect/c/session";

    /* JADX INFO: renamed from: f */
    private String f149437f = "https://apmplus.volces.com/settings/get";

    /* JADX INFO: renamed from: g */
    private String f149438g = "https://apmplus.volces.com/monitor/collect/c/native_bin_crash";

    /* JADX INFO: renamed from: h */
    private String f149439h = "https://apmplus.volces.com/monitor/collect/c/cloudcontrol/file";

    /* JADX INFO: renamed from: i */
    private String f149440i = "https://apmplus.volces.com/monitor/collect/c/logcollect";

    /* JADX INFO: renamed from: j */
    private long f149441j = 8000;

    /* JADX INFO: renamed from: k */
    private int f149442k = 512;

    /* JADX INFO: renamed from: l */
    private int f149443l = 1;

    /* JADX INFO: renamed from: m */
    private boolean f149444m = true;

    /* JADX INFO: renamed from: n */
    private boolean f149445n = true;

    /* JADX INFO: renamed from: o */
    private boolean f149446o = false;

    /* JADX INFO: renamed from: p */
    private boolean f149447p = false;

    /* JADX INFO: renamed from: q */
    private boolean f149448q = true;

    /* JADX INFO: renamed from: r */
    private boolean f149449r = true;

    /* JADX INFO: renamed from: s */
    private boolean f149450s = true;

    /* JADX INFO: renamed from: t */
    private boolean f149451t = true;

    /* JADX INFO: renamed from: l.ow5$a */
    public class C19233a extends q1r0 {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f149452c;

        public C19233a(String str) {
            this.f149452c = str;
        }

        @Override // p153l.q1r0
        /* JADX INFO: renamed from: a */
        public Object mo169541a(String str) {
            return str.equals("md5") ? this.f149452c : super.mo169541a(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public String m169518a() {
        return this.f149439h;
    }

    /* JADX INFO: renamed from: b */
    public String m169519b() {
        return this.f149437f;
    }

    /* JADX INFO: renamed from: c */
    public String m169520c() {
        return this.f149433b;
    }

    /* JADX INFO: renamed from: d */
    public long m169521d() {
        return this.f149441j;
    }

    /* JADX INFO: renamed from: e */
    public String m169522e() {
        return this.f149434c;
    }

    /* JADX INFO: renamed from: f */
    public int m169523f() {
        return this.f149442k;
    }

    /* JADX INFO: renamed from: g */
    public int m169524g() {
        return this.f149443l;
    }

    /* JADX INFO: renamed from: h */
    public String m169525h() {
        return this.f149438g;
    }

    /* JADX INFO: renamed from: i */
    public String m169526i() {
        return this.f149436e;
    }

    /* JADX INFO: renamed from: j */
    public boolean m169527j() {
        return this.f149450s;
    }

    /* JADX INFO: renamed from: k */
    public boolean m169528k(String str) {
        try {
            C19233a c19233a = new C19233a(str);
            if (n4r0.m161583b("java_crash_ignore", c19233a)) {
                return true;
            }
            if (l5r0.m152978c(n0r0.m161022i())) {
                return n4r0.m161583b("java_crash_ignore", c19233a);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m169529l() {
        return this.f149446o;
    }

    /* JADX INFO: renamed from: m */
    public boolean m169530m() {
        return this.f149448q;
    }

    /* JADX INFO: renamed from: n */
    public boolean m169531n() {
        return this.f149449r;
    }

    /* JADX INFO: renamed from: o */
    public boolean m169532o() {
        return this.f149447p;
    }

    /* JADX INFO: renamed from: p */
    public boolean m169533p() {
        return this.f149451t;
    }

    /* JADX INFO: renamed from: q */
    public void m169534q(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f149439h = str;
    }

    /* JADX INFO: renamed from: r */
    public void m169535r(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f149437f = str;
    }

    /* JADX INFO: renamed from: s */
    public void m169536s(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f149440i = str;
    }

    /* JADX INFO: renamed from: t */
    public void m169537t(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f149433b = str;
    }

    /* JADX INFO: renamed from: u */
    public void m169538u(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f149435d = str;
        int iIndexOf = str.indexOf("//");
        this.f149434c = str.substring(0, (iIndexOf == -1 ? str.indexOf("/") : str.indexOf("/", iIndexOf + 2)) + 1).concat("monitor/collect/c/exception/dump_collection");
    }

    /* JADX INFO: renamed from: v */
    public void m169539v(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f149438g = str;
    }

    /* JADX INFO: renamed from: w */
    public void m169540w(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f149436e = str;
    }
}
