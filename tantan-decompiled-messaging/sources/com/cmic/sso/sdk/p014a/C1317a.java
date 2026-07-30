package com.cmic.sso.sdk.p014a;

/* JADX INFO: renamed from: com.cmic.sso.sdk.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C1317a implements Cloneable {

    /* JADX INFO: renamed from: a */
    private String f5477a;

    /* JADX INFO: renamed from: b */
    private String f5478b;

    /* JADX INFO: renamed from: c */
    private String f5479c;

    /* JADX INFO: renamed from: d */
    private String f5480d;

    /* JADX INFO: renamed from: e */
    private boolean f5481e;

    /* JADX INFO: renamed from: f */
    private boolean f5482f;

    /* JADX INFO: renamed from: g */
    private boolean f5483g;

    /* JADX INFO: renamed from: h */
    private boolean f5484h;

    /* JADX INFO: renamed from: i */
    private boolean f5485i;

    /* JADX INFO: renamed from: j */
    private boolean f5486j;

    /* JADX INFO: renamed from: k */
    private int f5487k;

    /* JADX INFO: renamed from: l */
    private int f5488l;

    private C1317a() {
        this.f5477a = "rcs.cmpassport.com";
        this.f5478b = "rcs.cmpassport.com";
        this.f5479c = "config2.cmpassport.com";
        this.f5480d = "log2.cmpassport.com:9443";
        this.f5481e = false;
        this.f5482f = false;
        this.f5483g = false;
        this.f5484h = false;
        this.f5485i = false;
        this.f5486j = false;
        this.f5487k = 3;
        this.f5488l = 1;
    }

    /* JADX INFO: renamed from: g */
    public boolean m6990g() {
        return this.f5483g;
    }

    /* JADX INFO: renamed from: h */
    public boolean m6991h() {
        return this.f5484h;
    }

    /* JADX INFO: renamed from: i */
    public boolean m6992i() {
        return this.f5485i;
    }

    /* JADX INFO: renamed from: j */
    public boolean m6993j() {
        return this.f5486j;
    }

    /* JADX INFO: renamed from: k */
    public int m6994k() {
        return this.f5487k;
    }

    /* JADX INFO: renamed from: l */
    public int m6995l() {
        return this.f5488l;
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C1317a clone() throws CloneNotSupportedException {
        return (C1317a) super.clone();
    }

    public String toString() {
        return "UmcConfigBean{mHttpsGetTokenHost='" + this.f5477a + "', mHttpsGetPhoneScripHost='" + this.f5478b + "', mConfigHost='" + this.f5479c + "', mLogHost='" + this.f5480d + "', mCloseCtccWork=" + this.f5481e + ", mCloseCuccWort=" + this.f5482f + ", mCloseM008Business=" + this.f5483g + ", mCloseGetPhoneIpv4=" + this.f5484h + ", mCloseGetPhoneIpv6=" + this.f5485i + ", mCloseLog=" + this.f5486j + ", mMaxFailedLogTimes=" + this.f5487k + ", mLogSuspendTime=" + this.f5488l + '}';
    }

    /* JADX INFO: renamed from: e */
    public boolean m6988e() {
        return this.f5481e;
    }

    /* JADX INFO: renamed from: f */
    public boolean m6989f() {
        return this.f5482f;
    }

    /* JADX INFO: renamed from: c */
    public String m6986c() {
        return this.f5479c;
    }

    /* JADX INFO: renamed from: d */
    public String m6987d() {
        return this.f5480d;
    }

    /* JADX INFO: renamed from: com.cmic.sso.sdk.a.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final C1317a f5489a = new C1317a();

        /* JADX INFO: renamed from: a */
        public a m6998a(String str) {
            this.f5489a.f5477a = str;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m7002b(String str) {
            this.f5489a.f5478b = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m7004c(String str) {
            this.f5489a.f5479c = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m7006d(String str) {
            this.f5489a.f5480d = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m7008e(boolean z) {
            this.f5489a.f5485i = z;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m7009f(boolean z) {
            this.f5489a.f5486j = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m6999a(boolean z) {
            this.f5489a.f5481e = z;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m7003b(boolean z) {
            this.f5489a.f5482f = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m7005c(boolean z) {
            this.f5489a.f5483g = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m7007d(boolean z) {
            this.f5489a.f5484h = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m6997a(int i) {
            this.f5489a.f5487k = i;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m7001b(int i) {
            this.f5489a.f5488l = i;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C1317a m7000a() {
            return this.f5489a;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m6984a() {
        return this.f5477a;
    }

    /* JADX INFO: renamed from: b */
    public String m6985b() {
        return this.f5478b;
    }
}
