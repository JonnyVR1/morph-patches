package p153l;

import com.xiaomi.push.C14877c;
import com.xiaomi.push.C14878d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class mzq0 extends e0r0 {

    /* JADX INFO: renamed from: a */
    private boolean f139545a;

    /* JADX INFO: renamed from: c */
    private boolean f139547c;

    /* JADX INFO: renamed from: b */
    private int f139546b = 0;

    /* JADX INFO: renamed from: d */
    private String f139548d = "";

    /* JADX INFO: renamed from: e */
    private int f139549e = -1;

    /* JADX INFO: renamed from: n */
    public static mzq0 m160920n(byte[] bArr) {
        return (mzq0) new mzq0().m118918c(bArr);
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: a */
    public int mo118916a() {
        if (this.f139549e < 0) {
            mo118924i();
        }
        return this.f139549e;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: e */
    public void mo118920e(C14877c c14877c) throws IOException {
        if (m160925o()) {
            c14877c.m86677t(1, m160927q());
        }
        if (m160926p()) {
            c14877c.m86679v(2, m160921j());
        }
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: i */
    public int mo118924i() {
        int iM86644c = m160925o() ? C14877c.m86644c(1, m160927q()) : 0;
        if (m160926p()) {
            iM86644c += C14877c.m86646e(2, m160921j());
        }
        this.f139549e = iM86644c;
        return iM86644c;
    }

    /* JADX INFO: renamed from: j */
    public String m160921j() {
        return this.f139548d;
    }

    /* JADX INFO: renamed from: k */
    public mzq0 m160922k(int i) {
        this.f139545a = true;
        this.f139546b = i;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public mzq0 m160923l(String str) {
        this.f139547c = true;
        this.f139548d = str;
        return this;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public mzq0 mo118917b(suq0 suq0Var) throws C14878d {
        while (true) {
            int iM188076b = suq0Var.m188076b();
            if (iM188076b == 0) {
                break;
            }
            if (iM188076b == 8) {
                m160922k(suq0Var.m188087p());
            } else if (iM188076b == 18) {
                m160923l(suq0Var.m188079e());
            } else if (!m118922g(suq0Var, iM188076b)) {
                break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: o */
    public boolean m160925o() {
        return this.f139545a;
    }

    /* JADX INFO: renamed from: p */
    public boolean m160926p() {
        return this.f139547c;
    }

    /* JADX INFO: renamed from: q */
    public int m160927q() {
        return this.f139546b;
    }
}
