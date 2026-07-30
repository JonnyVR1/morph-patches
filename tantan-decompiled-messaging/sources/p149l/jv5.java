package p149l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class jv5 {

    /* JADX INFO: renamed from: a */
    private boolean f119857a = true;

    /* JADX INFO: renamed from: b */
    private String f119858b = "https://apmplus.volces.com/monitor/collect/c/crash";

    /* JADX INFO: renamed from: c */
    private String f119859c = "https://apmplus.volces.com/monitor/collect/c/exception/dump_collection";

    /* JADX INFO: renamed from: d */
    private String f119860d = "https://apmplus.volces.com/monitor/collect/c/exception";

    /* JADX INFO: renamed from: e */
    private String f119861e = "https://apmplus.volces.com/monitor/collect/c/session";

    /* JADX INFO: renamed from: f */
    private String f119862f = "https://apmplus.volces.com/settings/get";

    /* JADX INFO: renamed from: g */
    private String f119863g = "https://apmplus.volces.com/monitor/collect/c/native_bin_crash";

    /* JADX INFO: renamed from: h */
    private String f119864h = "https://apmplus.volces.com/monitor/collect/c/cloudcontrol/file";

    /* JADX INFO: renamed from: i */
    private String f119865i = "https://apmplus.volces.com/monitor/collect/c/logcollect";

    /* JADX INFO: renamed from: j */
    private long f119866j = 8000;

    /* JADX INFO: renamed from: k */
    private int f119867k = 512;

    /* JADX INFO: renamed from: l */
    private int f119868l = 1;

    /* JADX INFO: renamed from: m */
    private boolean f119869m = true;

    /* JADX INFO: renamed from: n */
    private boolean f119870n = true;

    /* JADX INFO: renamed from: o */
    private boolean f119871o = false;

    /* JADX INFO: renamed from: p */
    private boolean f119872p = false;

    /* JADX INFO: renamed from: q */
    private boolean f119873q = true;

    /* JADX INFO: renamed from: r */
    private boolean f119874r = true;

    /* JADX INFO: renamed from: s */
    private boolean f119875s = true;

    /* JADX INFO: renamed from: t */
    private boolean f119876t = true;

    /* JADX INFO: renamed from: l.jv5$a */
    public class C17869a extends ksq0 {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f119877c;

        public C17869a(String str) {
            this.f119877c = str;
        }

        @Override // p149l.ksq0
        /* JADX INFO: renamed from: a */
        public Object mo143420a(String str) {
            return str.equals("md5") ? this.f119877c : super.mo143420a(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public String m143397a() {
        return this.f119864h;
    }

    /* JADX INFO: renamed from: b */
    public String m143398b() {
        return this.f119862f;
    }

    /* JADX INFO: renamed from: c */
    public String m143399c() {
        return this.f119858b;
    }

    /* JADX INFO: renamed from: d */
    public long m143400d() {
        return this.f119866j;
    }

    /* JADX INFO: renamed from: e */
    public String m143401e() {
        return this.f119859c;
    }

    /* JADX INFO: renamed from: f */
    public int m143402f() {
        return this.f119867k;
    }

    /* JADX INFO: renamed from: g */
    public int m143403g() {
        return this.f119868l;
    }

    /* JADX INFO: renamed from: h */
    public String m143404h() {
        return this.f119863g;
    }

    /* JADX INFO: renamed from: i */
    public String m143405i() {
        return this.f119861e;
    }

    /* JADX INFO: renamed from: j */
    public boolean m143406j() {
        return this.f119875s;
    }

    /* JADX INFO: renamed from: k */
    public boolean m143407k(String str) {
        try {
            C17869a c17869a = new C17869a(str);
            if (hvq0.m133200b("java_crash_ignore", c17869a)) {
                return true;
            }
            if (fwq0.m123554c(hrq0.m132700i())) {
                return hvq0.m133200b("java_crash_ignore", c17869a);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m143408l() {
        return this.f119871o;
    }

    /* JADX INFO: renamed from: m */
    public boolean m143409m() {
        return this.f119873q;
    }

    /* JADX INFO: renamed from: n */
    public boolean m143410n() {
        return this.f119874r;
    }

    /* JADX INFO: renamed from: o */
    public boolean m143411o() {
        return this.f119872p;
    }

    /* JADX INFO: renamed from: p */
    public boolean m143412p() {
        return this.f119876t;
    }

    /* JADX INFO: renamed from: q */
    public void m143413q(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f119864h = str;
    }

    /* JADX INFO: renamed from: r */
    public void m143414r(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f119862f = str;
    }

    /* JADX INFO: renamed from: s */
    public void m143415s(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f119865i = str;
    }

    /* JADX INFO: renamed from: t */
    public void m143416t(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f119858b = str;
    }

    /* JADX INFO: renamed from: u */
    public void m143417u(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f119860d = str;
        int iIndexOf = str.indexOf("//");
        this.f119859c = str.substring(0, (iIndexOf == -1 ? str.indexOf("/") : str.indexOf("/", iIndexOf + 2)) + 1).concat("monitor/collect/c/exception/dump_collection");
    }

    /* JADX INFO: renamed from: v */
    public void m143418v(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f119863g = str;
    }

    /* JADX INFO: renamed from: w */
    public void m143419w(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f119861e = str;
    }
}
