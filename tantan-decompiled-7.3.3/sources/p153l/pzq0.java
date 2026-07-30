package p153l;

import com.xiaomi.push.C14877c;
import com.xiaomi.push.C14878d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class pzq0 extends e0r0 {

    /* JADX INFO: renamed from: a */
    private boolean f154948a;

    /* JADX INFO: renamed from: c */
    private boolean f154950c;

    /* JADX INFO: renamed from: e */
    private boolean f154952e;

    /* JADX INFO: renamed from: g */
    private boolean f154954g;

    /* JADX INFO: renamed from: i */
    private boolean f154956i;

    /* JADX INFO: renamed from: k */
    private boolean f154958k;

    /* JADX INFO: renamed from: b */
    private String f154949b = "";

    /* JADX INFO: renamed from: d */
    private String f154951d = "";

    /* JADX INFO: renamed from: f */
    private long f154953f = 0;

    /* JADX INFO: renamed from: h */
    private long f154955h = 0;

    /* JADX INFO: renamed from: j */
    private boolean f154957j = false;

    /* JADX INFO: renamed from: l */
    private int f154959l = 0;

    /* JADX INFO: renamed from: m */
    private int f154960m = -1;

    /* JADX INFO: renamed from: q */
    public static pzq0 m174573q(byte[] bArr) {
        return (pzq0) new pzq0().m118918c(bArr);
    }

    /* JADX INFO: renamed from: A */
    public boolean m174574A() {
        return this.f154957j;
    }

    /* JADX INFO: renamed from: B */
    public boolean m174575B() {
        return this.f154956i;
    }

    /* JADX INFO: renamed from: C */
    public boolean m174576C() {
        return this.f154958k;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: a */
    public int mo118916a() {
        if (this.f154960m < 0) {
            mo118924i();
        }
        return this.f154960m;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: e */
    public void mo118920e(C14877c c14877c) throws IOException {
        if (m174584r()) {
            c14877c.m86679v(1, m174578k());
        }
        if (m174589w()) {
            c14877c.m86679v(2, m174586t());
        }
        if (m174591y()) {
            c14877c.m86678u(3, m174577j());
        }
        if (m174592z()) {
            c14877c.m86678u(4, m174585s());
        }
        if (m174575B()) {
            c14877c.m86682y(5, m174574A());
        }
        if (m174576C()) {
            c14877c.m86677t(6, m174590x());
        }
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: i */
    public int mo118924i() {
        int iM86646e = m174584r() ? C14877c.m86646e(1, m174578k()) : 0;
        if (m174589w()) {
            iM86646e += C14877c.m86646e(2, m174586t());
        }
        if (m174591y()) {
            iM86646e += C14877c.m86645d(3, m174577j());
        }
        if (m174592z()) {
            iM86646e += C14877c.m86645d(4, m174585s());
        }
        if (m174575B()) {
            iM86646e += C14877c.m86649h(5, m174574A());
        }
        if (m174576C()) {
            iM86646e += C14877c.m86644c(6, m174590x());
        }
        this.f154960m = iM86646e;
        return iM86646e;
    }

    /* JADX INFO: renamed from: j */
    public long m174577j() {
        return this.f154953f;
    }

    /* JADX INFO: renamed from: k */
    public String m174578k() {
        return this.f154949b;
    }

    /* JADX INFO: renamed from: l */
    public pzq0 m174579l(int i) {
        this.f154958k = true;
        this.f154959l = i;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public pzq0 m174580m(long j) {
        this.f154952e = true;
        this.f154953f = j;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public pzq0 m174581n(String str) {
        this.f154948a = true;
        this.f154949b = str;
        return this;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public pzq0 mo118917b(suq0 suq0Var) throws C14878d {
        while (true) {
            int iM188076b = suq0Var.m188076b();
            if (iM188076b == 0) {
                break;
            }
            if (iM188076b == 10) {
                m174581n(suq0Var.m188079e());
            } else if (iM188076b == 18) {
                m174588v(suq0Var.m188079e());
            } else if (iM188076b == 24) {
                m174580m(suq0Var.m188078d());
            } else if (iM188076b == 32) {
                m174587u(suq0Var.m188078d());
            } else if (iM188076b == 40) {
                m174583p(suq0Var.m188084l());
            } else if (iM188076b == 48) {
                m174579l(suq0Var.m188087p());
            } else if (!m118922g(suq0Var, iM188076b)) {
                break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: p */
    public pzq0 m174583p(boolean z) {
        this.f154956i = true;
        this.f154957j = z;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public boolean m174584r() {
        return this.f154948a;
    }

    /* JADX INFO: renamed from: s */
    public long m174585s() {
        return this.f154955h;
    }

    /* JADX INFO: renamed from: t */
    public String m174586t() {
        return this.f154951d;
    }

    /* JADX INFO: renamed from: u */
    public pzq0 m174587u(long j) {
        this.f154954g = true;
        this.f154955h = j;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public pzq0 m174588v(String str) {
        this.f154950c = true;
        this.f154951d = str;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public boolean m174589w() {
        return this.f154950c;
    }

    /* JADX INFO: renamed from: x */
    public int m174590x() {
        return this.f154959l;
    }

    /* JADX INFO: renamed from: y */
    public boolean m174591y() {
        return this.f154952e;
    }

    /* JADX INFO: renamed from: z */
    public boolean m174592z() {
        return this.f154954g;
    }
}
