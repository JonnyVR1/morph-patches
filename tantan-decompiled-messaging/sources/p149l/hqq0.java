package p149l;

import com.xiaomi.push.C14729c;
import com.xiaomi.push.C14730d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class hqq0 extends yqq0 {

    /* JADX INFO: renamed from: a */
    private boolean f109092a;

    /* JADX INFO: renamed from: b */
    private viq0 f109093b = viq0.f181631c;

    /* JADX INFO: renamed from: c */
    private int f109094c = -1;

    /* JADX INFO: renamed from: m */
    public static hqq0 m132500m(byte[] bArr) {
        return (hqq0) new hqq0().m215757c(bArr);
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: a */
    public int mo98326a() {
        if (this.f109094c < 0) {
            mo98329i();
        }
        return this.f109094c;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: e */
    public void mo98328e(C14729c c14729c) throws IOException {
        if (m132504n()) {
            c14729c.m85509w(1, m132501j());
        }
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: i */
    public int mo98329i() {
        int iM85476f = m132504n() ? C14729c.m85476f(1, m132501j()) : 0;
        this.f109094c = iM85476f;
        return iM85476f;
    }

    /* JADX INFO: renamed from: j */
    public viq0 m132501j() {
        return this.f109093b;
    }

    /* JADX INFO: renamed from: k */
    public hqq0 m132502k(viq0 viq0Var) {
        this.f109092a = true;
        this.f109093b = viq0Var;
        return this;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public hqq0 mo98327b(mlq0 mlq0Var) throws C14730d {
        while (true) {
            int iM155175b = mlq0Var.m155175b();
            if (iM155175b == 0) {
                break;
            }
            if (iM155175b == 10) {
                m132502k(mlq0Var.m155179f());
            } else if (!m215760g(mlq0Var, iM155175b)) {
                break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public boolean m132504n() {
        return this.f109092a;
    }
}
