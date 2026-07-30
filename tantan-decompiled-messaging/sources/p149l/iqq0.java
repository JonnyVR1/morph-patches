package p149l;

import com.xiaomi.push.C14729c;
import com.xiaomi.push.C14730d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class iqq0 extends yqq0 {

    /* JADX INFO: renamed from: a */
    private boolean f114539a;

    /* JADX INFO: renamed from: c */
    private boolean f114541c;

    /* JADX INFO: renamed from: b */
    private viq0 f114540b = viq0.f181631c;

    /* JADX INFO: renamed from: d */
    private aqq0 f114542d = null;

    /* JADX INFO: renamed from: e */
    private int f114543e = -1;

    /* JADX INFO: renamed from: o */
    public static iqq0 m137784o(byte[] bArr) {
        return (iqq0) new iqq0().m215757c(bArr);
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: a */
    public int mo98326a() {
        if (this.f114543e < 0) {
            mo98329i();
        }
        return this.f114543e;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: e */
    public void mo98328e(C14729c c14729c) throws IOException {
        if (m137790p()) {
            c14729c.m85509w(1, m137785j());
        }
        if (m137791q()) {
            c14729c.m85510x(2, m137786k());
        }
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: i */
    public int mo98329i() {
        int iM85476f = m137790p() ? C14729c.m85476f(1, m137785j()) : 0;
        if (m137791q()) {
            iM85476f += C14729c.m85477g(2, m137786k());
        }
        this.f114543e = iM85476f;
        return iM85476f;
    }

    /* JADX INFO: renamed from: j */
    public viq0 m137785j() {
        return this.f114540b;
    }

    /* JADX INFO: renamed from: k */
    public aqq0 m137786k() {
        return this.f114542d;
    }

    /* JADX INFO: renamed from: l */
    public iqq0 m137787l(viq0 viq0Var) {
        this.f114539a = true;
        this.f114540b = viq0Var;
        return this;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public iqq0 mo98327b(mlq0 mlq0Var) throws C14730d {
        while (true) {
            int iM155175b = mlq0Var.m155175b();
            if (iM155175b == 0) {
                break;
            }
            if (iM155175b == 10) {
                m137787l(mlq0Var.m155179f());
            } else if (iM155175b == 18) {
                aqq0 aqq0Var = new aqq0();
                mlq0Var.m155182k(aqq0Var);
                m137789n(aqq0Var);
            } else if (!m215760g(mlq0Var, iM155175b)) {
                break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public iqq0 m137789n(aqq0 aqq0Var) {
        aqq0Var.getClass();
        this.f114541c = true;
        this.f114542d = aqq0Var;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public boolean m137790p() {
        return this.f114539a;
    }

    /* JADX INFO: renamed from: q */
    public boolean m137791q() {
        return this.f114541c;
    }
}
