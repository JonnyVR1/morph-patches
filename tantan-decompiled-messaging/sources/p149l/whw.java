package p149l;

/* JADX INFO: loaded from: classes2.dex */
public class whw extends bhw {

    /* JADX INFO: renamed from: p */
    private static final String f186471p = "whw";

    /* JADX INFO: renamed from: k */
    private long f186472k;

    /* JADX INFO: renamed from: l */
    private long f186473l;

    /* JADX INFO: renamed from: m */
    private boolean f186474m;

    /* JADX INFO: renamed from: n */
    private int f186475n;

    /* JADX INFO: renamed from: o */
    private String f186476o;

    /* JADX INFO: renamed from: u */
    private void m203244u(int i) {
        m101941j("ec", Integer.valueOf(i));
    }

    @Override // p149l.xul
    /* JADX INFO: renamed from: c */
    public String mo107257c() {
        return "OpenURL";
    }

    @Override // p149l.bhw
    /* JADX INFO: renamed from: f */
    public void mo101937f() {
        super.mo101937f();
        if (this.f186474m) {
            long j = this.f186472k;
            if (j > 0) {
                long j2 = this.f186473l;
                if (j2 > 0) {
                    m101941j("t_title", Long.valueOf(j2 - j));
                }
            }
            long j3 = this.f186473l;
            long j4 = this.f75679h;
            if (j3 > j4 && j4 > 0) {
                m101941j("t_white_screen", Long.valueOf(j3 - j4));
            }
        }
        m101941j("http_status", Integer.valueOf(this.f186475n));
        String str = this.f186476o;
        if (str != null) {
            m101941j("errorInfo", str);
        }
        m101941j("t_all", Long.valueOf(this.f75680i - this.f75679h));
    }

    /* JADX INFO: renamed from: n */
    public boolean m203245n(int i, String str) {
        if (!m101938g() || !this.f75681j) {
            mxv.m156927b(f186471p, "tang----onOpenError 日志统计错误：日志没有正在统计");
            this.f75681j = false;
            return false;
        }
        this.f186475n = i;
        this.f186476o = str;
        this.f186474m = false;
        m203244u(1);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public boolean m203246o() {
        if (m101938g() && this.f75681j) {
            this.f186474m = true;
            m203244u(0);
            return true;
        }
        mxv.m156927b(f186471p, "tang----onOpenSuccess 日志统计错误：日志没有正在统计");
        this.f75681j = false;
        return false;
    }

    /* JADX INFO: renamed from: p */
    public boolean m203247p() {
        if (m101938g() && this.f75681j) {
            m203244u(2);
            return true;
        }
        mxv.m156927b(f186471p, "tang----onRouterFailed 日志统计错误：日志没有正在统计");
        this.f75681j = false;
        return false;
    }

    /* JADX INFO: renamed from: q */
    public boolean m203248q() {
        if (m101938g() && this.f75681j) {
            m203244u(3);
            return true;
        }
        mxv.m156927b(f186471p, "tang----onVerifyFailed 日志统计错误：日志没有正在统计");
        this.f75681j = false;
        return false;
    }

    /* JADX INFO: renamed from: r */
    public void m203249r() {
        if (m101938g() && this.f75681j) {
            return;
        }
        mxv.m156927b(f186471p, "tang----setGetTitleTime 日志统计错误：日志没有正在统计");
        this.f75681j = false;
    }

    /* JADX INFO: renamed from: s */
    public void m203250s() {
        if (!m101938g() || !this.f75681j) {
            mxv.m156927b(f186471p, "tang----setGetTitleTime 日志统计错误：日志没有正在统计");
            this.f75681j = false;
        }
        this.f186472k = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: t */
    public void m203251t() {
        if (m101938g() && this.f75681j) {
            this.f186473l = System.currentTimeMillis();
        } else {
            mxv.m156927b(f186471p, "tang----setGetTitleTime 日志统计错误：日志没有正在统计");
            this.f75681j = false;
        }
    }

    /* JADX INFO: renamed from: v */
    public boolean m203252v(long j) {
        if (m101938g() && this.f75681j) {
            m101941j("t_verify", Long.valueOf(j));
            return true;
        }
        mxv.m156927b(f186471p, "tang----setVerifyTime 日志统计错误：日志没有正在统计");
        this.f75681j = false;
        return false;
    }
}
