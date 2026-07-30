package p149l;

import com.xiaomi.push.C14729c;
import com.xiaomi.push.C14730d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class eqq0 extends yqq0 {

    /* JADX INFO: renamed from: a */
    private boolean f92833a;

    /* JADX INFO: renamed from: c */
    private boolean f92835c;

    /* JADX INFO: renamed from: e */
    private boolean f92837e;

    /* JADX INFO: renamed from: b */
    private String f92834b = "";

    /* JADX INFO: renamed from: d */
    private String f92836d = "";

    /* JADX INFO: renamed from: f */
    private aqq0 f92838f = null;

    /* JADX INFO: renamed from: g */
    private int f92839g = -1;

    /* JADX INFO: renamed from: o */
    public static eqq0 m117761o(byte[] bArr) {
        return (eqq0) new eqq0().m215757c(bArr);
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: a */
    public int mo98326a() {
        if (this.f92839g < 0) {
            mo98329i();
        }
        return this.f92839g;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: e */
    public void mo98328e(C14729c c14729c) throws IOException {
        if (m117767p()) {
            c14729c.m85508v(1, m117762j());
        }
        if (m117770s()) {
            c14729c.m85508v(2, m117768q());
        }
        if (m117771t()) {
            c14729c.m85510x(3, m117763k());
        }
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: i */
    public int mo98329i() {
        int iM85475e = m117767p() ? C14729c.m85475e(1, m117762j()) : 0;
        if (m117770s()) {
            iM85475e += C14729c.m85475e(2, m117768q());
        }
        if (m117771t()) {
            iM85475e += C14729c.m85477g(3, m117763k());
        }
        this.f92839g = iM85475e;
        return iM85475e;
    }

    /* JADX INFO: renamed from: j */
    public String m117762j() {
        return this.f92834b;
    }

    /* JADX INFO: renamed from: k */
    public aqq0 m117763k() {
        return this.f92838f;
    }

    /* JADX INFO: renamed from: l */
    public eqq0 m117764l(String str) {
        this.f92833a = true;
        this.f92834b = str;
        return this;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public eqq0 mo98327b(mlq0 mlq0Var) throws C14730d {
        while (true) {
            int iM155175b = mlq0Var.m155175b();
            if (iM155175b == 0) {
                break;
            }
            if (iM155175b == 10) {
                m117764l(mlq0Var.m155178e());
            } else if (iM155175b == 18) {
                m117769r(mlq0Var.m155178e());
            } else if (iM155175b == 26) {
                aqq0 aqq0Var = new aqq0();
                mlq0Var.m155182k(aqq0Var);
                m117766n(aqq0Var);
            } else if (!m215760g(mlq0Var, iM155175b)) {
                break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public eqq0 m117766n(aqq0 aqq0Var) {
        aqq0Var.getClass();
        this.f92837e = true;
        this.f92838f = aqq0Var;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public boolean m117767p() {
        return this.f92833a;
    }

    /* JADX INFO: renamed from: q */
    public String m117768q() {
        return this.f92836d;
    }

    /* JADX INFO: renamed from: r */
    public eqq0 m117769r(String str) {
        this.f92835c = true;
        this.f92836d = str;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public boolean m117770s() {
        return this.f92835c;
    }

    /* JADX INFO: renamed from: t */
    public boolean m117771t() {
        return this.f92837e;
    }
}
