package p153l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class ajt {

    /* JADX INFO: renamed from: b */
    public String f71865b;

    /* JADX INFO: renamed from: c */
    public String f71866c;

    /* JADX INFO: renamed from: f */
    public String f71869f;

    /* JADX INFO: renamed from: a */
    public final C15728a f71864a = new C15728a(this);

    /* JADX INFO: renamed from: d */
    public String f71867d = "live";

    /* JADX INFO: renamed from: e */
    public boolean f71868e = false;

    /* JADX INFO: renamed from: g */
    public String f71870g = null;

    /* JADX INFO: renamed from: h */
    public long f71871h = 0;

    /* JADX INFO: renamed from: i */
    public long f71872i = 0;

    /* JADX INFO: renamed from: j */
    public int f71873j = 1;

    /* JADX INFO: renamed from: k */
    public String f71874k = "";

    /* JADX INFO: renamed from: l */
    public String f71875l = "";

    /* JADX INFO: renamed from: m */
    public boolean f71876m = false;

    /* JADX INFO: renamed from: l.ajt$a */
    public static final class C15728a {

        /* JADX INFO: renamed from: a */
        public final ajt f71877a;

        public C15728a(ajt ajtVar) {
            this.f71877a = ajtVar;
        }

        /* JADX INFO: renamed from: a */
        public String m98478a() {
            return this.f71877a.f71866c;
        }

        /* JADX INFO: renamed from: b */
        public String m98479b() {
            return this.f71877a.m98458e();
        }

        /* JADX INFO: renamed from: c */
        public String m98480c() {
            return this.f71877a.m98460g();
        }

        /* JADX INFO: renamed from: d */
        public String m98481d() {
            return this.f71877a.f71865b;
        }

        /* JADX INFO: renamed from: e */
        public long m98482e() {
            return this.f71877a.m98462i();
        }

        /* JADX INFO: renamed from: f */
        public long m98483f() {
            return this.f71877a.m98463j();
        }

        /* JADX INFO: renamed from: g */
        public boolean m98484g() {
            return this.f71877a.f71876m;
        }

        /* JADX INFO: renamed from: h */
        public boolean m98485h() {
            return this.f71877a.m98477x();
        }
    }

    public ajt(String str) {
        this.f71865b = str;
        this.f71866c = str;
    }

    /* JADX INFO: renamed from: c */
    public String m98456c() {
        return this.f71866c;
    }

    /* JADX INFO: renamed from: d */
    public String m98457d() {
        return this.f71875l;
    }

    /* JADX INFO: renamed from: e */
    public String m98458e() {
        return this.f71867d;
    }

    /* JADX INFO: renamed from: f */
    public String m98459f() {
        return this.f71869f;
    }

    /* JADX INFO: renamed from: g */
    public String m98460g() {
        String str = this.f71870g;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: h */
    public final C15728a m98461h() {
        return this.f71864a;
    }

    /* JADX INFO: renamed from: i */
    public long m98462i() {
        return this.f71872i;
    }

    /* JADX INFO: renamed from: j */
    public long m98463j() {
        return this.f71871h;
    }

    /* JADX INFO: renamed from: k */
    public String m98464k() {
        return this.f71874k;
    }

    /* JADX INFO: renamed from: l */
    public void m98465l() {
        this.f71873j++;
    }

    /* JADX INFO: renamed from: m */
    public void m98466m(String str) {
        this.f71866c = str;
    }

    /* JADX INFO: renamed from: n */
    public void m98467n(String str) {
        this.f71875l = str;
    }

    /* JADX INFO: renamed from: o */
    public void m98468o(String str) {
        this.f71867d = str;
    }

    /* JADX INFO: renamed from: p */
    public void m98469p(boolean z) {
        this.f71876m = z;
    }

    /* JADX INFO: renamed from: q */
    public void m98470q(String str) {
        this.f71869f = str;
    }

    /* JADX INFO: renamed from: r */
    public void m98471r(String str) {
        if (TextUtils.isEmpty(this.f71870g)) {
            this.f71870g = str;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m98472s(String str) {
        this.f71865b = str;
    }

    /* JADX INFO: renamed from: t */
    public void m98473t(boolean z) {
        this.f71868e = z;
    }

    /* JADX INFO: renamed from: u */
    public void m98474u(long j) {
        this.f71872i = j;
    }

    /* JADX INFO: renamed from: v */
    public void m98475v(long j) {
        this.f71871h = j;
    }

    /* JADX INFO: renamed from: w */
    public void m98476w(String str) {
        this.f71874k = str;
    }

    /* JADX INFO: renamed from: x */
    public boolean m98477x() {
        return this.f71868e;
    }
}
