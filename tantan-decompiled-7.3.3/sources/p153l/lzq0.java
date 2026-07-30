package p153l;

import com.xiaomi.push.C14877c;
import com.xiaomi.push.C14878d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class lzq0 extends e0r0 {

    /* JADX INFO: renamed from: a */
    private boolean f134255a;

    /* JADX INFO: renamed from: c */
    private boolean f134257c;

    /* JADX INFO: renamed from: e */
    private boolean f134259e;

    /* JADX INFO: renamed from: b */
    private String f134256b = "";

    /* JADX INFO: renamed from: d */
    private String f134258d = "";

    /* JADX INFO: renamed from: f */
    private String f134260f = "";

    /* JADX INFO: renamed from: g */
    private int f134261g = -1;

    /* JADX INFO: renamed from: m */
    public static lzq0 m156465m(byte[] bArr) {
        return (lzq0) new lzq0().m118918c(bArr);
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: a */
    public int mo118916a() {
        if (this.f134261g < 0) {
            mo118924i();
        }
        return this.f134261g;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: e */
    public void mo118920e(C14877c c14877c) throws IOException {
        if (m156469n()) {
            c14877c.m86679v(1, m156466j());
        }
        if (m156472q()) {
            c14877c.m86679v(2, m156470o());
        }
        if (m156475t()) {
            c14877c.m86679v(3, m156473r());
        }
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: i */
    public int mo118924i() {
        int iM86646e = m156469n() ? C14877c.m86646e(1, m156466j()) : 0;
        if (m156472q()) {
            iM86646e += C14877c.m86646e(2, m156470o());
        }
        if (m156475t()) {
            iM86646e += C14877c.m86646e(3, m156473r());
        }
        this.f134261g = iM86646e;
        return iM86646e;
    }

    /* JADX INFO: renamed from: j */
    public String m156466j() {
        return this.f134256b;
    }

    /* JADX INFO: renamed from: k */
    public lzq0 m156467k(String str) {
        this.f134255a = true;
        this.f134256b = str;
        return this;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public lzq0 mo118917b(suq0 suq0Var) throws C14878d {
        while (true) {
            int iM188076b = suq0Var.m188076b();
            if (iM188076b == 0) {
                break;
            }
            if (iM188076b == 10) {
                m156467k(suq0Var.m188079e());
            } else if (iM188076b == 18) {
                m156471p(suq0Var.m188079e());
            } else if (iM188076b == 26) {
                m156474s(suq0Var.m188079e());
            } else if (!m118922g(suq0Var, iM188076b)) {
                break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public boolean m156469n() {
        return this.f134255a;
    }

    /* JADX INFO: renamed from: o */
    public String m156470o() {
        return this.f134258d;
    }

    /* JADX INFO: renamed from: p */
    public lzq0 m156471p(String str) {
        this.f134257c = true;
        this.f134258d = str;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public boolean m156472q() {
        return this.f134257c;
    }

    /* JADX INFO: renamed from: r */
    public String m156473r() {
        return this.f134260f;
    }

    /* JADX INFO: renamed from: s */
    public lzq0 m156474s(String str) {
        this.f134259e = true;
        this.f134260f = str;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public boolean m156475t() {
        return this.f134259e;
    }
}
