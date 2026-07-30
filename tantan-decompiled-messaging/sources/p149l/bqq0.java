package p149l;

import com.xiaomi.push.C14729c;
import com.xiaomi.push.C14730d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class bqq0 extends yqq0 {

    /* JADX INFO: renamed from: a */
    private boolean f76799a;

    /* JADX INFO: renamed from: c */
    private boolean f76801c;

    /* JADX INFO: renamed from: e */
    private boolean f76803e;

    /* JADX INFO: renamed from: g */
    private boolean f76805g;

    /* JADX INFO: renamed from: i */
    private boolean f76807i;

    /* JADX INFO: renamed from: k */
    private boolean f76809k;

    /* JADX INFO: renamed from: b */
    private String f76800b = "";

    /* JADX INFO: renamed from: d */
    private String f76802d = "";

    /* JADX INFO: renamed from: f */
    private String f76804f = "";

    /* JADX INFO: renamed from: h */
    private String f76806h = "";

    /* JADX INFO: renamed from: j */
    private String f76808j = "";

    /* JADX INFO: renamed from: l */
    private String f76810l = "";

    /* JADX INFO: renamed from: m */
    private int f76811m = -1;

    /* JADX INFO: renamed from: A */
    public bqq0 m103391A(String str) {
        this.f76809k = true;
        this.f76810l = str;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public boolean m103392B() {
        return this.f76809k;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: a */
    public int mo98326a() {
        if (this.f76811m < 0) {
            mo98329i();
        }
        return this.f76811m;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: e */
    public void mo98328e(C14729c c14729c) throws IOException {
        if (m103396m()) {
            c14729c.m85508v(1, m103393j());
        }
        if (m103399p()) {
            c14729c.m85508v(2, m103397n());
        }
        if (m103402s()) {
            c14729c.m85508v(3, m103400q());
        }
        if (m103405v()) {
            c14729c.m85508v(4, m103403t());
        }
        if (m103408y()) {
            c14729c.m85508v(5, m103406w());
        }
        if (m103392B()) {
            c14729c.m85508v(6, m103409z());
        }
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: i */
    public int mo98329i() {
        int iM85475e = m103396m() ? C14729c.m85475e(1, m103393j()) : 0;
        if (m103399p()) {
            iM85475e += C14729c.m85475e(2, m103397n());
        }
        if (m103402s()) {
            iM85475e += C14729c.m85475e(3, m103400q());
        }
        if (m103405v()) {
            iM85475e += C14729c.m85475e(4, m103403t());
        }
        if (m103408y()) {
            iM85475e += C14729c.m85475e(5, m103406w());
        }
        if (m103392B()) {
            iM85475e += C14729c.m85475e(6, m103409z());
        }
        this.f76811m = iM85475e;
        return iM85475e;
    }

    /* JADX INFO: renamed from: j */
    public String m103393j() {
        return this.f76800b;
    }

    /* JADX INFO: renamed from: k */
    public bqq0 m103394k(String str) {
        this.f76799a = true;
        this.f76800b = str;
        return this;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public bqq0 mo98327b(mlq0 mlq0Var) throws C14730d {
        while (true) {
            int iM155175b = mlq0Var.m155175b();
            if (iM155175b == 0) {
                break;
            }
            if (iM155175b == 10) {
                m103394k(mlq0Var.m155178e());
            } else if (iM155175b == 18) {
                m103398o(mlq0Var.m155178e());
            } else if (iM155175b == 26) {
                m103401r(mlq0Var.m155178e());
            } else if (iM155175b == 34) {
                m103404u(mlq0Var.m155178e());
            } else if (iM155175b == 42) {
                m103407x(mlq0Var.m155178e());
            } else if (iM155175b == 50) {
                m103391A(mlq0Var.m155178e());
            } else if (!m215760g(mlq0Var, iM155175b)) {
                break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: m */
    public boolean m103396m() {
        return this.f76799a;
    }

    /* JADX INFO: renamed from: n */
    public String m103397n() {
        return this.f76802d;
    }

    /* JADX INFO: renamed from: o */
    public bqq0 m103398o(String str) {
        this.f76801c = true;
        this.f76802d = str;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public boolean m103399p() {
        return this.f76801c;
    }

    /* JADX INFO: renamed from: q */
    public String m103400q() {
        return this.f76804f;
    }

    /* JADX INFO: renamed from: r */
    public bqq0 m103401r(String str) {
        this.f76803e = true;
        this.f76804f = str;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public boolean m103402s() {
        return this.f76803e;
    }

    /* JADX INFO: renamed from: t */
    public String m103403t() {
        return this.f76806h;
    }

    /* JADX INFO: renamed from: u */
    public bqq0 m103404u(String str) {
        this.f76805g = true;
        this.f76806h = str;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public boolean m103405v() {
        return this.f76805g;
    }

    /* JADX INFO: renamed from: w */
    public String m103406w() {
        return this.f76808j;
    }

    /* JADX INFO: renamed from: x */
    public bqq0 m103407x(String str) {
        this.f76807i = true;
        this.f76808j = str;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public boolean m103408y() {
        return this.f76807i;
    }

    /* JADX INFO: renamed from: z */
    public String m103409z() {
        return this.f76810l;
    }
}
