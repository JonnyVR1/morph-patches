package com.cmic.sso.sdk.p015a;

/* JADX INFO: renamed from: com.cmic.sso.sdk.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C1340a implements Cloneable {

    /* JADX INFO: renamed from: a */
    private String f5514a;

    /* JADX INFO: renamed from: b */
    private String f5515b;

    /* JADX INFO: renamed from: c */
    private String f5516c;

    /* JADX INFO: renamed from: d */
    private String f5517d;

    /* JADX INFO: renamed from: e */
    private boolean f5518e;

    /* JADX INFO: renamed from: f */
    private boolean f5519f;

    /* JADX INFO: renamed from: g */
    private boolean f5520g;

    /* JADX INFO: renamed from: h */
    private boolean f5521h;

    /* JADX INFO: renamed from: i */
    private boolean f5522i;

    /* JADX INFO: renamed from: j */
    private boolean f5523j;

    /* JADX INFO: renamed from: k */
    private int f5524k;

    /* JADX INFO: renamed from: l */
    private int f5525l;

    private C1340a() {
        this.f5514a = "rcs.cmpassport.com";
        this.f5515b = "rcs.cmpassport.com";
        this.f5516c = "config2.cmpassport.com";
        this.f5517d = "log2.cmpassport.com:9443";
        this.f5518e = false;
        this.f5519f = false;
        this.f5520g = false;
        this.f5521h = false;
        this.f5522i = false;
        this.f5523j = false;
        this.f5524k = 3;
        this.f5525l = 1;
    }

    /* JADX INFO: renamed from: g */
    public boolean m7044g() {
        return this.f5520g;
    }

    /* JADX INFO: renamed from: h */
    public boolean m7045h() {
        return this.f5521h;
    }

    /* JADX INFO: renamed from: i */
    public boolean m7046i() {
        return this.f5522i;
    }

    /* JADX INFO: renamed from: j */
    public boolean m7047j() {
        return this.f5523j;
    }

    /* JADX INFO: renamed from: k */
    public int m7048k() {
        return this.f5524k;
    }

    /* JADX INFO: renamed from: l */
    public int m7049l() {
        return this.f5525l;
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C1340a clone() throws CloneNotSupportedException {
        return (C1340a) super.clone();
    }

    public String toString() {
        return "UmcConfigBean{mHttpsGetTokenHost='" + this.f5514a + "', mHttpsGetPhoneScripHost='" + this.f5515b + "', mConfigHost='" + this.f5516c + "', mLogHost='" + this.f5517d + "', mCloseCtccWork=" + this.f5518e + ", mCloseCuccWort=" + this.f5519f + ", mCloseM008Business=" + this.f5520g + ", mCloseGetPhoneIpv4=" + this.f5521h + ", mCloseGetPhoneIpv6=" + this.f5522i + ", mCloseLog=" + this.f5523j + ", mMaxFailedLogTimes=" + this.f5524k + ", mLogSuspendTime=" + this.f5525l + '}';
    }

    /* JADX INFO: renamed from: e */
    public boolean m7042e() {
        return this.f5518e;
    }

    /* JADX INFO: renamed from: f */
    public boolean m7043f() {
        return this.f5519f;
    }

    /* JADX INFO: renamed from: c */
    public String m7040c() {
        return this.f5516c;
    }

    /* JADX INFO: renamed from: d */
    public String m7041d() {
        return this.f5517d;
    }

    /* JADX INFO: renamed from: com.cmic.sso.sdk.a.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final C1340a f5526a = new C1340a();

        /* JADX INFO: renamed from: a */
        public a m7052a(String str) {
            this.f5526a.f5514a = str;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m7056b(String str) {
            this.f5526a.f5515b = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m7058c(String str) {
            this.f5526a.f5516c = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m7060d(String str) {
            this.f5526a.f5517d = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m7062e(boolean z) {
            this.f5526a.f5522i = z;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m7063f(boolean z) {
            this.f5526a.f5523j = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m7053a(boolean z) {
            this.f5526a.f5518e = z;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m7057b(boolean z) {
            this.f5526a.f5519f = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m7059c(boolean z) {
            this.f5526a.f5520g = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m7061d(boolean z) {
            this.f5526a.f5521h = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m7051a(int i) {
            this.f5526a.f5524k = i;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m7055b(int i) {
            this.f5526a.f5525l = i;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C1340a m7054a() {
            return this.f5526a;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m7038a() {
        return this.f5514a;
    }

    /* JADX INFO: renamed from: b */
    public String m7039b() {
        return this.f5515b;
    }
}
