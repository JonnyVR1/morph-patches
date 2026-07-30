package p149l;

import com.xiaomi.push.C14729c;
import com.xiaomi.push.C14730d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class gqq0 extends yqq0 {

    /* JADX INFO: renamed from: a */
    private boolean f103971a;

    /* JADX INFO: renamed from: c */
    private boolean f103973c;

    /* JADX INFO: renamed from: b */
    private int f103972b = 0;

    /* JADX INFO: renamed from: d */
    private String f103974d = "";

    /* JADX INFO: renamed from: e */
    private int f103975e = -1;

    /* JADX INFO: renamed from: n */
    public static gqq0 m127622n(byte[] bArr) {
        return (gqq0) new gqq0().m215757c(bArr);
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: a */
    public int mo98326a() {
        if (this.f103975e < 0) {
            mo98329i();
        }
        return this.f103975e;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: e */
    public void mo98328e(C14729c c14729c) throws IOException {
        if (m127627o()) {
            c14729c.m85506t(1, m127629q());
        }
        if (m127628p()) {
            c14729c.m85508v(2, m127623j());
        }
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: i */
    public int mo98329i() {
        int iM85473c = m127627o() ? C14729c.m85473c(1, m127629q()) : 0;
        if (m127628p()) {
            iM85473c += C14729c.m85475e(2, m127623j());
        }
        this.f103975e = iM85473c;
        return iM85473c;
    }

    /* JADX INFO: renamed from: j */
    public String m127623j() {
        return this.f103974d;
    }

    /* JADX INFO: renamed from: k */
    public gqq0 m127624k(int i) {
        this.f103971a = true;
        this.f103972b = i;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public gqq0 m127625l(String str) {
        this.f103973c = true;
        this.f103974d = str;
        return this;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public gqq0 mo98327b(mlq0 mlq0Var) throws C14730d {
        while (true) {
            int iM155175b = mlq0Var.m155175b();
            if (iM155175b == 0) {
                break;
            }
            if (iM155175b == 8) {
                m127624k(mlq0Var.m155186p());
            } else if (iM155175b == 18) {
                m127625l(mlq0Var.m155178e());
            } else if (!m215760g(mlq0Var, iM155175b)) {
                break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: o */
    public boolean m127627o() {
        return this.f103971a;
    }

    /* JADX INFO: renamed from: p */
    public boolean m127628p() {
        return this.f103973c;
    }

    /* JADX INFO: renamed from: q */
    public int m127629q() {
        return this.f103972b;
    }
}
