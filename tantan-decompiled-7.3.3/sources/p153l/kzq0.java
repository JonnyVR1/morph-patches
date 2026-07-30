package p153l;

import com.xiaomi.push.C14877c;
import com.xiaomi.push.C14878d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class kzq0 extends e0r0 {

    /* JADX INFO: renamed from: a */
    private boolean f129443a;

    /* JADX INFO: renamed from: c */
    private boolean f129445c;

    /* JADX INFO: renamed from: e */
    private boolean f129447e;

    /* JADX INFO: renamed from: b */
    private String f129444b = "";

    /* JADX INFO: renamed from: d */
    private String f129446d = "";

    /* JADX INFO: renamed from: f */
    private gzq0 f129448f = null;

    /* JADX INFO: renamed from: g */
    private int f129449g = -1;

    /* JADX INFO: renamed from: o */
    public static kzq0 m152213o(byte[] bArr) {
        return (kzq0) new kzq0().m118918c(bArr);
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: a */
    public int mo118916a() {
        if (this.f129449g < 0) {
            mo118924i();
        }
        return this.f129449g;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: e */
    public void mo118920e(C14877c c14877c) throws IOException {
        if (m152219p()) {
            c14877c.m86679v(1, m152214j());
        }
        if (m152222s()) {
            c14877c.m86679v(2, m152220q());
        }
        if (m152223t()) {
            c14877c.m86681x(3, m152215k());
        }
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: i */
    public int mo118924i() {
        int iM86646e = m152219p() ? C14877c.m86646e(1, m152214j()) : 0;
        if (m152222s()) {
            iM86646e += C14877c.m86646e(2, m152220q());
        }
        if (m152223t()) {
            iM86646e += C14877c.m86648g(3, m152215k());
        }
        this.f129449g = iM86646e;
        return iM86646e;
    }

    /* JADX INFO: renamed from: j */
    public String m152214j() {
        return this.f129444b;
    }

    /* JADX INFO: renamed from: k */
    public gzq0 m152215k() {
        return this.f129448f;
    }

    /* JADX INFO: renamed from: l */
    public kzq0 m152216l(String str) {
        this.f129443a = true;
        this.f129444b = str;
        return this;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public kzq0 mo118917b(suq0 suq0Var) throws C14878d {
        while (true) {
            int iM188076b = suq0Var.m188076b();
            if (iM188076b == 0) {
                break;
            }
            if (iM188076b == 10) {
                m152216l(suq0Var.m188079e());
            } else if (iM188076b == 18) {
                m152221r(suq0Var.m188079e());
            } else if (iM188076b == 26) {
                gzq0 gzq0Var = new gzq0();
                suq0Var.m188083k(gzq0Var);
                m152218n(gzq0Var);
            } else if (!m118922g(suq0Var, iM188076b)) {
                break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public kzq0 m152218n(gzq0 gzq0Var) {
        gzq0Var.getClass();
        this.f129447e = true;
        this.f129448f = gzq0Var;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public boolean m152219p() {
        return this.f129443a;
    }

    /* JADX INFO: renamed from: q */
    public String m152220q() {
        return this.f129446d;
    }

    /* JADX INFO: renamed from: r */
    public kzq0 m152221r(String str) {
        this.f129445c = true;
        this.f129446d = str;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public boolean m152222s() {
        return this.f129445c;
    }

    /* JADX INFO: renamed from: t */
    public boolean m152223t() {
        return this.f129447e;
    }
}
