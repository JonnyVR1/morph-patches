package p153l;

import com.xiaomi.push.C14877c;
import com.xiaomi.push.C14878d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class nzq0 extends e0r0 {

    /* JADX INFO: renamed from: a */
    private boolean f144466a;

    /* JADX INFO: renamed from: b */
    private asq0 f144467b = asq0.f73163c;

    /* JADX INFO: renamed from: c */
    private int f144468c = -1;

    /* JADX INFO: renamed from: m */
    public static nzq0 m165392m(byte[] bArr) {
        return (nzq0) new nzq0().m118918c(bArr);
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: a */
    public int mo118916a() {
        if (this.f144468c < 0) {
            mo118924i();
        }
        return this.f144468c;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: e */
    public void mo118920e(C14877c c14877c) throws IOException {
        if (m165396n()) {
            c14877c.m86680w(1, m165393j());
        }
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: i */
    public int mo118924i() {
        int iM86647f = m165396n() ? C14877c.m86647f(1, m165393j()) : 0;
        this.f144468c = iM86647f;
        return iM86647f;
    }

    /* JADX INFO: renamed from: j */
    public asq0 m165393j() {
        return this.f144467b;
    }

    /* JADX INFO: renamed from: k */
    public nzq0 m165394k(asq0 asq0Var) {
        this.f144466a = true;
        this.f144467b = asq0Var;
        return this;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public nzq0 mo118917b(suq0 suq0Var) throws C14878d {
        while (true) {
            int iM188076b = suq0Var.m188076b();
            if (iM188076b == 0) {
                break;
            }
            if (iM188076b == 10) {
                m165394k(suq0Var.m188080f());
            } else if (!m118922g(suq0Var, iM188076b)) {
                break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public boolean m165396n() {
        return this.f144466a;
    }
}
