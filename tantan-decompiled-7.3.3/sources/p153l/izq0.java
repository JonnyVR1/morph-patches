package p153l;

import com.xiaomi.push.C14877c;
import com.xiaomi.push.C14878d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class izq0 extends e0r0 {

    /* JADX INFO: renamed from: a */
    private boolean f117736a;

    /* JADX INFO: renamed from: c */
    private boolean f117738c;

    /* JADX INFO: renamed from: e */
    private boolean f117740e;

    /* JADX INFO: renamed from: g */
    private boolean f117742g;

    /* JADX INFO: renamed from: b */
    private boolean f117737b = false;

    /* JADX INFO: renamed from: d */
    private String f117739d = "";

    /* JADX INFO: renamed from: f */
    private String f117741f = "";

    /* JADX INFO: renamed from: h */
    private String f117743h = "";

    /* JADX INFO: renamed from: i */
    private int f117744i = -1;

    /* JADX INFO: renamed from: n */
    public static izq0 m142817n(byte[] bArr) {
        return (izq0) new izq0().m118918c(bArr);
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: a */
    public int mo118916a() {
        if (this.f117744i < 0) {
            mo118924i();
        }
        return this.f117744i;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: e */
    public void mo118920e(C14877c c14877c) throws IOException {
        if (m142825r()) {
            c14877c.m86682y(1, m142822o());
        }
        if (m142828u()) {
            c14877c.m86679v(2, m142818j());
        }
        if (m142829v()) {
            c14877c.m86679v(3, m142823p());
        }
        if (m142830w()) {
            c14877c.m86679v(4, m142826s());
        }
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: i */
    public int mo118924i() {
        int iM86649h = m142825r() ? C14877c.m86649h(1, m142822o()) : 0;
        if (m142828u()) {
            iM86649h += C14877c.m86646e(2, m142818j());
        }
        if (m142829v()) {
            iM86649h += C14877c.m86646e(3, m142823p());
        }
        if (m142830w()) {
            iM86649h += C14877c.m86646e(4, m142826s());
        }
        this.f117744i = iM86649h;
        return iM86649h;
    }

    /* JADX INFO: renamed from: j */
    public String m142818j() {
        return this.f117739d;
    }

    /* JADX INFO: renamed from: k */
    public izq0 m142819k(String str) {
        this.f117738c = true;
        this.f117739d = str;
        return this;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public izq0 mo118917b(suq0 suq0Var) throws C14878d {
        while (true) {
            int iM188076b = suq0Var.m188076b();
            if (iM188076b == 0) {
                break;
            }
            if (iM188076b == 8) {
                m142821m(suq0Var.m188084l());
            } else if (iM188076b == 18) {
                m142819k(suq0Var.m188079e());
            } else if (iM188076b == 26) {
                m142824q(suq0Var.m188079e());
            } else if (iM188076b == 34) {
                m142827t(suq0Var.m188079e());
            } else if (!m118922g(suq0Var, iM188076b)) {
                break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: m */
    public izq0 m142821m(boolean z) {
        this.f117736a = true;
        this.f117737b = z;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public boolean m142822o() {
        return this.f117737b;
    }

    /* JADX INFO: renamed from: p */
    public String m142823p() {
        return this.f117741f;
    }

    /* JADX INFO: renamed from: q */
    public izq0 m142824q(String str) {
        this.f117740e = true;
        this.f117741f = str;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public boolean m142825r() {
        return this.f117736a;
    }

    /* JADX INFO: renamed from: s */
    public String m142826s() {
        return this.f117743h;
    }

    /* JADX INFO: renamed from: t */
    public izq0 m142827t(String str) {
        this.f117742g = true;
        this.f117743h = str;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public boolean m142828u() {
        return this.f117738c;
    }

    /* JADX INFO: renamed from: v */
    public boolean m142829v() {
        return this.f117740e;
    }

    /* JADX INFO: renamed from: w */
    public boolean m142830w() {
        return this.f117742g;
    }
}
