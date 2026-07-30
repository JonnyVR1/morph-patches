package p149l;

import com.xiaomi.push.C14729c;
import com.xiaomi.push.C14730d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class fqq0 extends yqq0 {

    /* JADX INFO: renamed from: a */
    private boolean f98833a;

    /* JADX INFO: renamed from: c */
    private boolean f98835c;

    /* JADX INFO: renamed from: e */
    private boolean f98837e;

    /* JADX INFO: renamed from: b */
    private String f98834b = "";

    /* JADX INFO: renamed from: d */
    private String f98836d = "";

    /* JADX INFO: renamed from: f */
    private String f98838f = "";

    /* JADX INFO: renamed from: g */
    private int f98839g = -1;

    /* JADX INFO: renamed from: m */
    public static fqq0 m122730m(byte[] bArr) {
        return (fqq0) new fqq0().m215757c(bArr);
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: a */
    public int mo98326a() {
        if (this.f98839g < 0) {
            mo98329i();
        }
        return this.f98839g;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: e */
    public void mo98328e(C14729c c14729c) throws IOException {
        if (m122734n()) {
            c14729c.m85508v(1, m122731j());
        }
        if (m122737q()) {
            c14729c.m85508v(2, m122735o());
        }
        if (m122740t()) {
            c14729c.m85508v(3, m122738r());
        }
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: i */
    public int mo98329i() {
        int iM85475e = m122734n() ? C14729c.m85475e(1, m122731j()) : 0;
        if (m122737q()) {
            iM85475e += C14729c.m85475e(2, m122735o());
        }
        if (m122740t()) {
            iM85475e += C14729c.m85475e(3, m122738r());
        }
        this.f98839g = iM85475e;
        return iM85475e;
    }

    /* JADX INFO: renamed from: j */
    public String m122731j() {
        return this.f98834b;
    }

    /* JADX INFO: renamed from: k */
    public fqq0 m122732k(String str) {
        this.f98833a = true;
        this.f98834b = str;
        return this;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public fqq0 mo98327b(mlq0 mlq0Var) throws C14730d {
        while (true) {
            int iM155175b = mlq0Var.m155175b();
            if (iM155175b == 0) {
                break;
            }
            if (iM155175b == 10) {
                m122732k(mlq0Var.m155178e());
            } else if (iM155175b == 18) {
                m122736p(mlq0Var.m155178e());
            } else if (iM155175b == 26) {
                m122739s(mlq0Var.m155178e());
            } else if (!m215760g(mlq0Var, iM155175b)) {
                break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public boolean m122734n() {
        return this.f98833a;
    }

    /* JADX INFO: renamed from: o */
    public String m122735o() {
        return this.f98836d;
    }

    /* JADX INFO: renamed from: p */
    public fqq0 m122736p(String str) {
        this.f98835c = true;
        this.f98836d = str;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public boolean m122737q() {
        return this.f98835c;
    }

    /* JADX INFO: renamed from: r */
    public String m122738r() {
        return this.f98838f;
    }

    /* JADX INFO: renamed from: s */
    public fqq0 m122739s(String str) {
        this.f98837e = true;
        this.f98838f = str;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public boolean m122740t() {
        return this.f98837e;
    }
}
