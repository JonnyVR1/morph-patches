package p149l;

import com.xiaomi.push.C14729c;
import com.xiaomi.push.C14730d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class cqq0 extends yqq0 {

    /* JADX INFO: renamed from: a */
    private boolean f82103a;

    /* JADX INFO: renamed from: c */
    private boolean f82105c;

    /* JADX INFO: renamed from: e */
    private boolean f82107e;

    /* JADX INFO: renamed from: g */
    private boolean f82109g;

    /* JADX INFO: renamed from: b */
    private boolean f82104b = false;

    /* JADX INFO: renamed from: d */
    private String f82106d = "";

    /* JADX INFO: renamed from: f */
    private String f82108f = "";

    /* JADX INFO: renamed from: h */
    private String f82110h = "";

    /* JADX INFO: renamed from: i */
    private int f82111i = -1;

    /* JADX INFO: renamed from: n */
    public static cqq0 m108290n(byte[] bArr) {
        return (cqq0) new cqq0().m215757c(bArr);
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: a */
    public int mo98326a() {
        if (this.f82111i < 0) {
            mo98329i();
        }
        return this.f82111i;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: e */
    public void mo98328e(C14729c c14729c) throws IOException {
        if (m108298r()) {
            c14729c.m85511y(1, m108295o());
        }
        if (m108301u()) {
            c14729c.m85508v(2, m108291j());
        }
        if (m108302v()) {
            c14729c.m85508v(3, m108296p());
        }
        if (m108303w()) {
            c14729c.m85508v(4, m108299s());
        }
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: i */
    public int mo98329i() {
        int iM85478h = m108298r() ? C14729c.m85478h(1, m108295o()) : 0;
        if (m108301u()) {
            iM85478h += C14729c.m85475e(2, m108291j());
        }
        if (m108302v()) {
            iM85478h += C14729c.m85475e(3, m108296p());
        }
        if (m108303w()) {
            iM85478h += C14729c.m85475e(4, m108299s());
        }
        this.f82111i = iM85478h;
        return iM85478h;
    }

    /* JADX INFO: renamed from: j */
    public String m108291j() {
        return this.f82106d;
    }

    /* JADX INFO: renamed from: k */
    public cqq0 m108292k(String str) {
        this.f82105c = true;
        this.f82106d = str;
        return this;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public cqq0 mo98327b(mlq0 mlq0Var) throws C14730d {
        while (true) {
            int iM155175b = mlq0Var.m155175b();
            if (iM155175b == 0) {
                break;
            }
            if (iM155175b == 8) {
                m108294m(mlq0Var.m155183l());
            } else if (iM155175b == 18) {
                m108292k(mlq0Var.m155178e());
            } else if (iM155175b == 26) {
                m108297q(mlq0Var.m155178e());
            } else if (iM155175b == 34) {
                m108300t(mlq0Var.m155178e());
            } else if (!m215760g(mlq0Var, iM155175b)) {
                break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: m */
    public cqq0 m108294m(boolean z) {
        this.f82103a = true;
        this.f82104b = z;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public boolean m108295o() {
        return this.f82104b;
    }

    /* JADX INFO: renamed from: p */
    public String m108296p() {
        return this.f82108f;
    }

    /* JADX INFO: renamed from: q */
    public cqq0 m108297q(String str) {
        this.f82107e = true;
        this.f82108f = str;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public boolean m108298r() {
        return this.f82103a;
    }

    /* JADX INFO: renamed from: s */
    public String m108299s() {
        return this.f82110h;
    }

    /* JADX INFO: renamed from: t */
    public cqq0 m108300t(String str) {
        this.f82109g = true;
        this.f82110h = str;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public boolean m108301u() {
        return this.f82105c;
    }

    /* JADX INFO: renamed from: v */
    public boolean m108302v() {
        return this.f82107e;
    }

    /* JADX INFO: renamed from: w */
    public boolean m108303w() {
        return this.f82109g;
    }
}
