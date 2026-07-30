package p153l;

import com.xiaomi.push.C14877c;
import com.xiaomi.push.C14878d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class hzq0 extends e0r0 {

    /* JADX INFO: renamed from: a */
    private boolean f112287a;

    /* JADX INFO: renamed from: c */
    private boolean f112289c;

    /* JADX INFO: renamed from: e */
    private boolean f112291e;

    /* JADX INFO: renamed from: g */
    private boolean f112293g;

    /* JADX INFO: renamed from: i */
    private boolean f112295i;

    /* JADX INFO: renamed from: k */
    private boolean f112297k;

    /* JADX INFO: renamed from: b */
    private String f112288b = "";

    /* JADX INFO: renamed from: d */
    private String f112290d = "";

    /* JADX INFO: renamed from: f */
    private String f112292f = "";

    /* JADX INFO: renamed from: h */
    private String f112294h = "";

    /* JADX INFO: renamed from: j */
    private String f112296j = "";

    /* JADX INFO: renamed from: l */
    private String f112298l = "";

    /* JADX INFO: renamed from: m */
    private int f112299m = -1;

    /* JADX INFO: renamed from: A */
    public hzq0 m137917A(String str) {
        this.f112297k = true;
        this.f112298l = str;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public boolean m137918B() {
        return this.f112297k;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: a */
    public int mo118916a() {
        if (this.f112299m < 0) {
            mo118924i();
        }
        return this.f112299m;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: e */
    public void mo118920e(C14877c c14877c) throws IOException {
        if (m137922m()) {
            c14877c.m86679v(1, m137919j());
        }
        if (m137925p()) {
            c14877c.m86679v(2, m137923n());
        }
        if (m137928s()) {
            c14877c.m86679v(3, m137926q());
        }
        if (m137931v()) {
            c14877c.m86679v(4, m137929t());
        }
        if (m137934y()) {
            c14877c.m86679v(5, m137932w());
        }
        if (m137918B()) {
            c14877c.m86679v(6, m137935z());
        }
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: i */
    public int mo118924i() {
        int iM86646e = m137922m() ? C14877c.m86646e(1, m137919j()) : 0;
        if (m137925p()) {
            iM86646e += C14877c.m86646e(2, m137923n());
        }
        if (m137928s()) {
            iM86646e += C14877c.m86646e(3, m137926q());
        }
        if (m137931v()) {
            iM86646e += C14877c.m86646e(4, m137929t());
        }
        if (m137934y()) {
            iM86646e += C14877c.m86646e(5, m137932w());
        }
        if (m137918B()) {
            iM86646e += C14877c.m86646e(6, m137935z());
        }
        this.f112299m = iM86646e;
        return iM86646e;
    }

    /* JADX INFO: renamed from: j */
    public String m137919j() {
        return this.f112288b;
    }

    /* JADX INFO: renamed from: k */
    public hzq0 m137920k(String str) {
        this.f112287a = true;
        this.f112288b = str;
        return this;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public hzq0 mo118917b(suq0 suq0Var) throws C14878d {
        while (true) {
            int iM188076b = suq0Var.m188076b();
            if (iM188076b == 0) {
                break;
            }
            if (iM188076b == 10) {
                m137920k(suq0Var.m188079e());
            } else if (iM188076b == 18) {
                m137924o(suq0Var.m188079e());
            } else if (iM188076b == 26) {
                m137927r(suq0Var.m188079e());
            } else if (iM188076b == 34) {
                m137930u(suq0Var.m188079e());
            } else if (iM188076b == 42) {
                m137933x(suq0Var.m188079e());
            } else if (iM188076b == 50) {
                m137917A(suq0Var.m188079e());
            } else if (!m118922g(suq0Var, iM188076b)) {
                break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: m */
    public boolean m137922m() {
        return this.f112287a;
    }

    /* JADX INFO: renamed from: n */
    public String m137923n() {
        return this.f112290d;
    }

    /* JADX INFO: renamed from: o */
    public hzq0 m137924o(String str) {
        this.f112289c = true;
        this.f112290d = str;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public boolean m137925p() {
        return this.f112289c;
    }

    /* JADX INFO: renamed from: q */
    public String m137926q() {
        return this.f112292f;
    }

    /* JADX INFO: renamed from: r */
    public hzq0 m137927r(String str) {
        this.f112291e = true;
        this.f112292f = str;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public boolean m137928s() {
        return this.f112291e;
    }

    /* JADX INFO: renamed from: t */
    public String m137929t() {
        return this.f112294h;
    }

    /* JADX INFO: renamed from: u */
    public hzq0 m137930u(String str) {
        this.f112293g = true;
        this.f112294h = str;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public boolean m137931v() {
        return this.f112293g;
    }

    /* JADX INFO: renamed from: w */
    public String m137932w() {
        return this.f112296j;
    }

    /* JADX INFO: renamed from: x */
    public hzq0 m137933x(String str) {
        this.f112295i = true;
        this.f112296j = str;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public boolean m137934y() {
        return this.f112295i;
    }

    /* JADX INFO: renamed from: z */
    public String m137935z() {
        return this.f112298l;
    }
}
