package p149l;

import com.xiaomi.push.C14729c;
import com.xiaomi.push.C14730d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class aqq0 extends yqq0 {

    /* JADX INFO: renamed from: a */
    private boolean f71190a;

    /* JADX INFO: renamed from: c */
    private boolean f71192c;

    /* JADX INFO: renamed from: e */
    private boolean f71194e;

    /* JADX INFO: renamed from: g */
    private boolean f71196g;

    /* JADX INFO: renamed from: b */
    private boolean f71191b = false;

    /* JADX INFO: renamed from: d */
    private int f71193d = 0;

    /* JADX INFO: renamed from: f */
    private int f71195f = 0;

    /* JADX INFO: renamed from: h */
    private int f71197h = 0;

    /* JADX INFO: renamed from: i */
    private int f71198i = -1;

    /* JADX INFO: renamed from: m */
    public static aqq0 m98325m(byte[] bArr) {
        return (aqq0) new aqq0().m215757c(bArr);
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: a */
    public int mo98326a() {
        if (this.f71198i < 0) {
            mo98329i();
        }
        return this.f71198i;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: e */
    public void mo98328e(C14729c c14729c) throws IOException {
        if (m98335p()) {
            c14729c.m85511y(1, m98333n());
        }
        if (m98338s()) {
            c14729c.m85506t(3, m98336q());
        }
        if (m98340u()) {
            c14729c.m85506t(4, m98339t());
        }
        if (m98342w()) {
            c14729c.m85506t(5, m98341v());
        }
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: i */
    public int mo98329i() {
        int iM85478h = m98335p() ? C14729c.m85478h(1, m98333n()) : 0;
        if (m98338s()) {
            iM85478h += C14729c.m85473c(3, m98336q());
        }
        if (m98340u()) {
            iM85478h += C14729c.m85473c(4, m98339t());
        }
        if (m98342w()) {
            iM85478h += C14729c.m85473c(5, m98341v());
        }
        this.f71198i = iM85478h;
        return iM85478h;
    }

    /* JADX INFO: renamed from: j */
    public aqq0 m98330j(int i) {
        this.f71192c = true;
        this.f71193d = i;
        return this;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public aqq0 mo98327b(mlq0 mlq0Var) throws C14730d {
        while (true) {
            int iM155175b = mlq0Var.m155175b();
            if (iM155175b == 0) {
                break;
            }
            if (iM155175b == 8) {
                m98332l(mlq0Var.m155183l());
            } else if (iM155175b == 24) {
                m98330j(mlq0Var.m155186p());
            } else if (iM155175b == 32) {
                m98334o(mlq0Var.m155186p());
            } else if (iM155175b == 40) {
                m98337r(mlq0Var.m155186p());
            } else if (!m215760g(mlq0Var, iM155175b)) {
                break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: l */
    public aqq0 m98332l(boolean z) {
        this.f71190a = true;
        this.f71191b = z;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public boolean m98333n() {
        return this.f71191b;
    }

    /* JADX INFO: renamed from: o */
    public aqq0 m98334o(int i) {
        this.f71194e = true;
        this.f71195f = i;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public boolean m98335p() {
        return this.f71190a;
    }

    /* JADX INFO: renamed from: q */
    public int m98336q() {
        return this.f71193d;
    }

    /* JADX INFO: renamed from: r */
    public aqq0 m98337r(int i) {
        this.f71196g = true;
        this.f71197h = i;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public boolean m98338s() {
        return this.f71192c;
    }

    /* JADX INFO: renamed from: t */
    public int m98339t() {
        return this.f71195f;
    }

    /* JADX INFO: renamed from: u */
    public boolean m98340u() {
        return this.f71194e;
    }

    /* JADX INFO: renamed from: v */
    public int m98341v() {
        return this.f71197h;
    }

    /* JADX INFO: renamed from: w */
    public boolean m98342w() {
        return this.f71196g;
    }
}
