package p149l;

import com.xiaomi.push.C14729c;
import com.xiaomi.push.C14730d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class jqq0 extends yqq0 {

    /* JADX INFO: renamed from: a */
    private boolean f119309a;

    /* JADX INFO: renamed from: c */
    private boolean f119311c;

    /* JADX INFO: renamed from: e */
    private boolean f119313e;

    /* JADX INFO: renamed from: g */
    private boolean f119315g;

    /* JADX INFO: renamed from: i */
    private boolean f119317i;

    /* JADX INFO: renamed from: k */
    private boolean f119319k;

    /* JADX INFO: renamed from: b */
    private String f119310b = "";

    /* JADX INFO: renamed from: d */
    private String f119312d = "";

    /* JADX INFO: renamed from: f */
    private long f119314f = 0;

    /* JADX INFO: renamed from: h */
    private long f119316h = 0;

    /* JADX INFO: renamed from: j */
    private boolean f119318j = false;

    /* JADX INFO: renamed from: l */
    private int f119320l = 0;

    /* JADX INFO: renamed from: m */
    private int f119321m = -1;

    /* JADX INFO: renamed from: q */
    public static jqq0 m142831q(byte[] bArr) {
        return (jqq0) new jqq0().m215757c(bArr);
    }

    /* JADX INFO: renamed from: A */
    public boolean m142832A() {
        return this.f119318j;
    }

    /* JADX INFO: renamed from: B */
    public boolean m142833B() {
        return this.f119317i;
    }

    /* JADX INFO: renamed from: C */
    public boolean m142834C() {
        return this.f119319k;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: a */
    public int mo98326a() {
        if (this.f119321m < 0) {
            mo98329i();
        }
        return this.f119321m;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: e */
    public void mo98328e(C14729c c14729c) throws IOException {
        if (m142842r()) {
            c14729c.m85508v(1, m142836k());
        }
        if (m142847w()) {
            c14729c.m85508v(2, m142844t());
        }
        if (m142849y()) {
            c14729c.m85507u(3, m142835j());
        }
        if (m142850z()) {
            c14729c.m85507u(4, m142843s());
        }
        if (m142833B()) {
            c14729c.m85511y(5, m142832A());
        }
        if (m142834C()) {
            c14729c.m85506t(6, m142848x());
        }
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: i */
    public int mo98329i() {
        int iM85475e = m142842r() ? C14729c.m85475e(1, m142836k()) : 0;
        if (m142847w()) {
            iM85475e += C14729c.m85475e(2, m142844t());
        }
        if (m142849y()) {
            iM85475e += C14729c.m85474d(3, m142835j());
        }
        if (m142850z()) {
            iM85475e += C14729c.m85474d(4, m142843s());
        }
        if (m142833B()) {
            iM85475e += C14729c.m85478h(5, m142832A());
        }
        if (m142834C()) {
            iM85475e += C14729c.m85473c(6, m142848x());
        }
        this.f119321m = iM85475e;
        return iM85475e;
    }

    /* JADX INFO: renamed from: j */
    public long m142835j() {
        return this.f119314f;
    }

    /* JADX INFO: renamed from: k */
    public String m142836k() {
        return this.f119310b;
    }

    /* JADX INFO: renamed from: l */
    public jqq0 m142837l(int i) {
        this.f119319k = true;
        this.f119320l = i;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public jqq0 m142838m(long j) {
        this.f119313e = true;
        this.f119314f = j;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public jqq0 m142839n(String str) {
        this.f119309a = true;
        this.f119310b = str;
        return this;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public jqq0 mo98327b(mlq0 mlq0Var) throws C14730d {
        while (true) {
            int iM155175b = mlq0Var.m155175b();
            if (iM155175b == 0) {
                break;
            }
            if (iM155175b == 10) {
                m142839n(mlq0Var.m155178e());
            } else if (iM155175b == 18) {
                m142846v(mlq0Var.m155178e());
            } else if (iM155175b == 24) {
                m142838m(mlq0Var.m155177d());
            } else if (iM155175b == 32) {
                m142845u(mlq0Var.m155177d());
            } else if (iM155175b == 40) {
                m142841p(mlq0Var.m155183l());
            } else if (iM155175b == 48) {
                m142837l(mlq0Var.m155186p());
            } else if (!m215760g(mlq0Var, iM155175b)) {
                break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: p */
    public jqq0 m142841p(boolean z) {
        this.f119317i = true;
        this.f119318j = z;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public boolean m142842r() {
        return this.f119309a;
    }

    /* JADX INFO: renamed from: s */
    public long m142843s() {
        return this.f119316h;
    }

    /* JADX INFO: renamed from: t */
    public String m142844t() {
        return this.f119312d;
    }

    /* JADX INFO: renamed from: u */
    public jqq0 m142845u(long j) {
        this.f119315g = true;
        this.f119316h = j;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public jqq0 m142846v(String str) {
        this.f119311c = true;
        this.f119312d = str;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public boolean m142847w() {
        return this.f119311c;
    }

    /* JADX INFO: renamed from: x */
    public int m142848x() {
        return this.f119320l;
    }

    /* JADX INFO: renamed from: y */
    public boolean m142849y() {
        return this.f119313e;
    }

    /* JADX INFO: renamed from: z */
    public boolean m142850z() {
        return this.f119315g;
    }
}
