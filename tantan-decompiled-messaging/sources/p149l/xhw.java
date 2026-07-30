package p149l;

/* JADX INFO: loaded from: classes2.dex */
public class xhw extends bhw {

    /* JADX INFO: renamed from: m */
    private static final String f192921m = "xhw";

    /* JADX INFO: renamed from: k */
    private int f192922k = 0;

    /* JADX INFO: renamed from: l */
    private boolean f192923l = true;

    /* JADX INFO: renamed from: B */
    private boolean m208831B(int i) {
        if (!m101938g() || !this.f75681j) {
            mxv.m156927b(f192921m, "tang-----log统计废弃，没有在统计");
            this.f75681j = false;
            return false;
        }
        if (i != 0) {
            this.f192923l = false;
        }
        m101941j("ec", Integer.valueOf(i));
        return true;
    }

    /* JADX INFO: renamed from: A */
    public boolean m208832A(long j) {
        if (m101938g() && this.f75681j) {
            m101941j("t_extract", Long.valueOf(j));
            return true;
        }
        mxv.m156927b(f192921m, "tang-----log setDownloadTime 统计废弃，没有在统计");
        this.f75681j = false;
        return false;
    }

    @Override // p149l.xul
    /* JADX INFO: renamed from: c */
    public String mo107257c() {
        return "DownloadPackage";
    }

    @Override // p149l.bhw
    /* JADX INFO: renamed from: f */
    public void mo101937f() {
        super.mo101937f();
        m101941j("t_all", Long.valueOf(this.f75680i - this.f75679h));
    }

    /* JADX INFO: renamed from: n */
    public void m208833n() {
        m208831B(3);
    }

    /* JADX INFO: renamed from: o */
    public void m208834o() {
        m208831B(1);
    }

    /* JADX INFO: renamed from: p */
    public void m208835p() {
        m208831B(4);
    }

    /* JADX INFO: renamed from: q */
    public void m208836q() {
        if (m208831B(0)) {
            this.f192923l = true;
        }
    }

    /* JADX INFO: renamed from: r */
    public void m208837r() {
        m208831B(5);
    }

    /* JADX INFO: renamed from: s */
    public void m208838s() {
        m208831B(6);
    }

    /* JADX INFO: renamed from: t */
    public void m208839t() {
        m208831B(7);
    }

    /* JADX INFO: renamed from: u */
    public boolean m208840u(long j) {
        if (m101938g() && this.f75681j) {
            m101941j("t_check", Long.valueOf(j));
            return true;
        }
        mxv.m156927b(f192921m, "tang-----log setCheckUpdateTime 统计废弃，没有在统计");
        this.f75681j = false;
        return false;
    }

    /* JADX INFO: renamed from: v */
    public boolean m208841v(long j) {
        if (m101938g() && this.f75681j) {
            m101941j("t_download", Long.valueOf(j));
            return true;
        }
        mxv.m156927b(f192921m, "tang-----log setDownloadTime 统计废弃，没有在统计");
        this.f75681j = false;
        return false;
    }

    /* JADX INFO: renamed from: w */
    public void m208842w(boolean z) {
        if (m101938g() && this.f75681j) {
            m101941j("is_patch", Integer.valueOf(z ? 1 : 0));
        } else {
            mxv.m156927b(f192921m, "tang-----log统计废弃，没有在统计");
        }
    }

    /* JADX INFO: renamed from: x */
    public void m208843x(long j) {
        if (m101938g() && this.f75681j) {
            m101941j("v_local", Long.valueOf(j));
        } else {
            mxv.m156927b(f192921m, "tang-----log统计废弃，没有在统计");
            this.f75681j = false;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m208844y(long j) {
        if (m101938g() && this.f75681j) {
            m101941j("size", Long.valueOf(j));
        } else {
            mxv.m156927b(f192921m, "tang-----log统计废弃，没有在统计");
            this.f75681j = false;
        }
    }

    /* JADX INFO: renamed from: z */
    public boolean m208845z(long j) {
        if (m101938g() && this.f75681j) {
            m101941j("t_patch", Long.valueOf(j));
            return true;
        }
        mxv.m156927b(f192921m, "tang-----log setDownloadTime 统计废弃，没有在统计");
        this.f75681j = false;
        return false;
    }
}
