package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class vkw extends djw {

    /* JADX INFO: renamed from: o */
    private static final String f184522o = "vkw";

    /* JADX INFO: renamed from: j */
    private long f184523j;

    /* JADX INFO: renamed from: k */
    private long f184524k;

    /* JADX INFO: renamed from: l */
    private boolean f184525l;

    /* JADX INFO: renamed from: m */
    private int f184526m;

    /* JADX INFO: renamed from: n */
    private String f184527n;

    /* JADX INFO: renamed from: q */
    private void m201582q(int i) {
        m116158h("ec", Integer.valueOf(i));
    }

    @Override // p153l.pxl
    /* JADX INFO: renamed from: c */
    public String mo105270c() {
        return "OpenURL";
    }

    @Override // p153l.djw
    /* JADX INFO: renamed from: e */
    public void mo105271e() {
        super.mo105271e();
        if (this.f184525l) {
            long j = this.f184523j;
            if (j > 0) {
                long j2 = this.f184524k;
                if (j2 > 0) {
                    m116158h("t_title", Long.valueOf(j2 - j));
                }
            }
            long j3 = this.f184524k;
            long j4 = this.f88949g;
            if (j3 > j4 && j4 > 0) {
                m116158h("t_white_screen", Long.valueOf(j3 - j4));
            }
        }
        m116158h("http_status", Integer.valueOf(this.f184526m));
        String str = this.f184527n;
        if (str != null) {
            m116158h("errorInfo", str);
        }
        m116158h("t_all", Long.valueOf(this.f88950h - this.f88949g));
    }

    /* JADX INFO: renamed from: l */
    public boolean m201583l(int i, String str) {
        if (!m116156f() || !this.f88951i) {
            jzv.m147729b(f184522o, "tang----onOpenError 日志统计错误：日志没有正在统计");
            this.f88951i = false;
            return false;
        }
        this.f184526m = i;
        this.f184527n = str;
        this.f184525l = false;
        m201582q(1);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public boolean m201584m() {
        if (m116156f() && this.f88951i) {
            this.f184525l = true;
            m201582q(0);
            return true;
        }
        jzv.m147729b(f184522o, "tang----onOpenSuccess 日志统计错误：日志没有正在统计");
        this.f88951i = false;
        return false;
    }

    /* JADX INFO: renamed from: n */
    public void m201585n() {
        if (m116156f() && this.f88951i) {
            return;
        }
        jzv.m147729b(f184522o, "tang----setGetTitleTime 日志统计错误：日志没有正在统计");
        this.f88951i = false;
    }

    /* JADX INFO: renamed from: o */
    public void m201586o() {
        if (!m116156f() || !this.f88951i) {
            jzv.m147729b(f184522o, "tang----setGetTitleTime 日志统计错误：日志没有正在统计");
            this.f88951i = false;
        }
        this.f184523j = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: p */
    public void m201587p() {
        if (m116156f() && this.f88951i) {
            this.f184524k = System.currentTimeMillis();
        } else {
            jzv.m147729b(f184522o, "tang----setGetTitleTime 日志统计错误：日志没有正在统计");
            this.f88951i = false;
        }
    }
}
