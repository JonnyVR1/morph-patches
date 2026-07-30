package p153l;

import com.xiaomi.push.C14877c;
import com.xiaomi.push.C14878d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ozq0 extends e0r0 {

    /* JADX INFO: renamed from: a */
    private boolean f149942a;

    /* JADX INFO: renamed from: c */
    private boolean f149944c;

    /* JADX INFO: renamed from: b */
    private asq0 f149943b = asq0.f73163c;

    /* JADX INFO: renamed from: d */
    private gzq0 f149945d = null;

    /* JADX INFO: renamed from: e */
    private int f149946e = -1;

    /* JADX INFO: renamed from: o */
    public static ozq0 m169990o(byte[] bArr) {
        return (ozq0) new ozq0().m118918c(bArr);
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: a */
    public int mo118916a() {
        if (this.f149946e < 0) {
            mo118924i();
        }
        return this.f149946e;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: e */
    public void mo118920e(C14877c c14877c) throws IOException {
        if (m169996p()) {
            c14877c.m86680w(1, m169991j());
        }
        if (m169997q()) {
            c14877c.m86681x(2, m169992k());
        }
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: i */
    public int mo118924i() {
        int iM86647f = m169996p() ? C14877c.m86647f(1, m169991j()) : 0;
        if (m169997q()) {
            iM86647f += C14877c.m86648g(2, m169992k());
        }
        this.f149946e = iM86647f;
        return iM86647f;
    }

    /* JADX INFO: renamed from: j */
    public asq0 m169991j() {
        return this.f149943b;
    }

    /* JADX INFO: renamed from: k */
    public gzq0 m169992k() {
        return this.f149945d;
    }

    /* JADX INFO: renamed from: l */
    public ozq0 m169993l(asq0 asq0Var) {
        this.f149942a = true;
        this.f149943b = asq0Var;
        return this;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ozq0 mo118917b(suq0 suq0Var) throws C14878d {
        while (true) {
            int iM188076b = suq0Var.m188076b();
            if (iM188076b == 0) {
                break;
            }
            if (iM188076b == 10) {
                m169993l(suq0Var.m188080f());
            } else if (iM188076b == 18) {
                gzq0 gzq0Var = new gzq0();
                suq0Var.m188083k(gzq0Var);
                m169995n(gzq0Var);
            } else if (!m118922g(suq0Var, iM188076b)) {
                break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public ozq0 m169995n(gzq0 gzq0Var) {
        gzq0Var.getClass();
        this.f149944c = true;
        this.f149945d = gzq0Var;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public boolean m169996p() {
        return this.f149942a;
    }

    /* JADX INFO: renamed from: q */
    public boolean m169997q() {
        return this.f149944c;
    }
}
