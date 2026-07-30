package p153l;

import com.xiaomi.push.C14877c;
import com.xiaomi.push.C14878d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class gzq0 extends e0r0 {

    /* JADX INFO: renamed from: a */
    private boolean f107220a;

    /* JADX INFO: renamed from: c */
    private boolean f107222c;

    /* JADX INFO: renamed from: e */
    private boolean f107224e;

    /* JADX INFO: renamed from: g */
    private boolean f107226g;

    /* JADX INFO: renamed from: b */
    private boolean f107221b = false;

    /* JADX INFO: renamed from: d */
    private int f107223d = 0;

    /* JADX INFO: renamed from: f */
    private int f107225f = 0;

    /* JADX INFO: renamed from: h */
    private int f107227h = 0;

    /* JADX INFO: renamed from: i */
    private int f107228i = -1;

    /* JADX INFO: renamed from: m */
    public static gzq0 m133108m(byte[] bArr) {
        return (gzq0) new gzq0().m118918c(bArr);
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: a */
    public int mo118916a() {
        if (this.f107228i < 0) {
            mo118924i();
        }
        return this.f107228i;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: e */
    public void mo118920e(C14877c c14877c) throws IOException {
        if (m133114p()) {
            c14877c.m86682y(1, m133112n());
        }
        if (m133117s()) {
            c14877c.m86677t(3, m133115q());
        }
        if (m133119u()) {
            c14877c.m86677t(4, m133118t());
        }
        if (m133121w()) {
            c14877c.m86677t(5, m133120v());
        }
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: i */
    public int mo118924i() {
        int iM86649h = m133114p() ? C14877c.m86649h(1, m133112n()) : 0;
        if (m133117s()) {
            iM86649h += C14877c.m86644c(3, m133115q());
        }
        if (m133119u()) {
            iM86649h += C14877c.m86644c(4, m133118t());
        }
        if (m133121w()) {
            iM86649h += C14877c.m86644c(5, m133120v());
        }
        this.f107228i = iM86649h;
        return iM86649h;
    }

    /* JADX INFO: renamed from: j */
    public gzq0 m133109j(int i) {
        this.f107222c = true;
        this.f107223d = i;
        return this;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public gzq0 mo118917b(suq0 suq0Var) throws C14878d {
        while (true) {
            int iM188076b = suq0Var.m188076b();
            if (iM188076b == 0) {
                break;
            }
            if (iM188076b == 8) {
                m133111l(suq0Var.m188084l());
            } else if (iM188076b == 24) {
                m133109j(suq0Var.m188087p());
            } else if (iM188076b == 32) {
                m133113o(suq0Var.m188087p());
            } else if (iM188076b == 40) {
                m133116r(suq0Var.m188087p());
            } else if (!m118922g(suq0Var, iM188076b)) {
                break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: l */
    public gzq0 m133111l(boolean z) {
        this.f107220a = true;
        this.f107221b = z;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public boolean m133112n() {
        return this.f107221b;
    }

    /* JADX INFO: renamed from: o */
    public gzq0 m133113o(int i) {
        this.f107224e = true;
        this.f107225f = i;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public boolean m133114p() {
        return this.f107220a;
    }

    /* JADX INFO: renamed from: q */
    public int m133115q() {
        return this.f107223d;
    }

    /* JADX INFO: renamed from: r */
    public gzq0 m133116r(int i) {
        this.f107226g = true;
        this.f107227h = i;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public boolean m133117s() {
        return this.f107222c;
    }

    /* JADX INFO: renamed from: t */
    public int m133118t() {
        return this.f107225f;
    }

    /* JADX INFO: renamed from: u */
    public boolean m133119u() {
        return this.f107224e;
    }

    /* JADX INFO: renamed from: v */
    public int m133120v() {
        return this.f107227h;
    }

    /* JADX INFO: renamed from: w */
    public boolean m133121w() {
        return this.f107226g;
    }
}
