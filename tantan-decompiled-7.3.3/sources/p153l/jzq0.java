package p153l;

import com.xiaomi.push.C14877c;
import com.xiaomi.push.C14878d;
import java.io.IOException;
import org.spongycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes2.dex */
public final class jzq0 extends e0r0 {

    /* JADX INFO: renamed from: A */
    private int f123285A;

    /* JADX INFO: renamed from: a */
    private boolean f123286a;

    /* JADX INFO: renamed from: c */
    private boolean f123288c;

    /* JADX INFO: renamed from: e */
    private boolean f123290e;

    /* JADX INFO: renamed from: g */
    private boolean f123292g;

    /* JADX INFO: renamed from: i */
    private boolean f123294i;

    /* JADX INFO: renamed from: k */
    private boolean f123296k;

    /* JADX INFO: renamed from: m */
    private boolean f123298m;

    /* JADX INFO: renamed from: o */
    private boolean f123300o;

    /* JADX INFO: renamed from: q */
    private boolean f123302q;

    /* JADX INFO: renamed from: s */
    private boolean f123304s;

    /* JADX INFO: renamed from: u */
    private boolean f123306u;

    /* JADX INFO: renamed from: v */
    private asq0 f123307v;

    /* JADX INFO: renamed from: w */
    private boolean f123308w;

    /* JADX INFO: renamed from: x */
    private asq0 f123309x;

    /* JADX INFO: renamed from: y */
    private boolean f123310y;

    /* JADX INFO: renamed from: z */
    private int f123311z;

    /* JADX INFO: renamed from: b */
    private int f123287b = 0;

    /* JADX INFO: renamed from: d */
    private String f123289d = "";

    /* JADX INFO: renamed from: f */
    private String f123291f = "";

    /* JADX INFO: renamed from: h */
    private String f123293h = "";

    /* JADX INFO: renamed from: j */
    private int f123295j = 0;

    /* JADX INFO: renamed from: l */
    private String f123297l = "";

    /* JADX INFO: renamed from: n */
    private String f123299n = "";

    /* JADX INFO: renamed from: p */
    private String f123301p = "";

    /* JADX INFO: renamed from: r */
    private gzq0 f123303r = null;

    /* JADX INFO: renamed from: t */
    private int f123305t = 0;

    public jzq0() {
        asq0 asq0Var = asq0.f73163c;
        this.f123307v = asq0Var;
        this.f123309x = asq0Var;
        this.f123311z = 0;
        this.f123285A = -1;
    }

    /* JADX INFO: renamed from: A */
    public jzq0 m147675A(int i) {
        this.f123304s = true;
        this.f123305t = i;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public jzq0 m147676B(String str) {
        this.f123292g = true;
        this.f123293h = str;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public boolean m147677C() {
        return this.f123290e;
    }

    /* JADX INFO: renamed from: D */
    public int m147678D() {
        return this.f123295j;
    }

    /* JADX INFO: renamed from: E */
    public String m147679E() {
        return this.f123297l;
    }

    /* JADX INFO: renamed from: F */
    public jzq0 m147680F(int i) {
        this.f123310y = true;
        this.f123311z = i;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public jzq0 m147681G(String str) {
        this.f123296k = true;
        this.f123297l = str;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public boolean m147682H() {
        return this.f123292g;
    }

    /* JADX INFO: renamed from: I */
    public int m147683I() {
        return this.f123305t;
    }

    /* JADX INFO: renamed from: J */
    public String m147684J() {
        return this.f123299n;
    }

    /* JADX INFO: renamed from: K */
    public jzq0 m147685K(String str) {
        this.f123298m = true;
        this.f123299n = str;
        return this;
    }

    /* JADX INFO: renamed from: L */
    public boolean m147686L() {
        return this.f123294i;
    }

    /* JADX INFO: renamed from: M */
    public int m147687M() {
        return this.f123311z;
    }

    /* JADX INFO: renamed from: N */
    public String m147688N() {
        return this.f123301p;
    }

    /* JADX INFO: renamed from: O */
    public jzq0 m147689O(String str) {
        this.f123300o = true;
        this.f123301p = str;
        return this;
    }

    /* JADX INFO: renamed from: P */
    public boolean m147690P() {
        return this.f123296k;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m147691Q() {
        return this.f123298m;
    }

    /* JADX INFO: renamed from: R */
    public boolean m147692R() {
        return this.f123300o;
    }

    /* JADX INFO: renamed from: S */
    public boolean m147693S() {
        return this.f123302q;
    }

    /* JADX INFO: renamed from: T */
    public boolean m147694T() {
        return this.f123304s;
    }

    /* JADX INFO: renamed from: U */
    public boolean m147695U() {
        return this.f123306u;
    }

    /* JADX INFO: renamed from: V */
    public boolean m147696V() {
        return this.f123308w;
    }

    /* JADX INFO: renamed from: W */
    public boolean m147697W() {
        return this.f123310y;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: a */
    public int mo118916a() {
        if (this.f123285A < 0) {
            mo118924i();
        }
        return this.f123285A;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: e */
    public void mo118920e(C14877c c14877c) throws IOException {
        if (m147706r()) {
            c14877c.m86666M(1, m147713y());
        }
        if (m147712x()) {
            c14877c.m86679v(2, m147698j());
        }
        if (m147677C()) {
            c14877c.m86679v(3, m147707s());
        }
        if (m147682H()) {
            c14877c.m86679v(4, m147714z());
        }
        if (m147686L()) {
            c14877c.m86677t(5, m147678D());
        }
        if (m147690P()) {
            c14877c.m86679v(6, m147679E());
        }
        if (m147691Q()) {
            c14877c.m86679v(7, m147684J());
        }
        if (m147692R()) {
            c14877c.m86679v(8, m147688N());
        }
        if (m147693S()) {
            c14877c.m86681x(9, m147700l());
        }
        if (m147694T()) {
            c14877c.m86677t(10, m147683I());
        }
        if (m147695U()) {
            c14877c.m86680w(11, m147699k());
        }
        if (m147696V()) {
            c14877c.m86680w(12, m147708t());
        }
        if (m147697W()) {
            c14877c.m86677t(13, m147687M());
        }
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: i */
    public int mo118924i() {
        int iM86636H = m147706r() ? C14877c.m86636H(1, m147713y()) : 0;
        if (m147712x()) {
            iM86636H += C14877c.m86646e(2, m147698j());
        }
        if (m147677C()) {
            iM86636H += C14877c.m86646e(3, m147707s());
        }
        if (m147682H()) {
            iM86636H += C14877c.m86646e(4, m147714z());
        }
        if (m147686L()) {
            iM86636H += C14877c.m86644c(5, m147678D());
        }
        if (m147690P()) {
            iM86636H += C14877c.m86646e(6, m147679E());
        }
        if (m147691Q()) {
            iM86636H += C14877c.m86646e(7, m147684J());
        }
        if (m147692R()) {
            iM86636H += C14877c.m86646e(8, m147688N());
        }
        if (m147693S()) {
            iM86636H += C14877c.m86648g(9, m147700l());
        }
        if (m147694T()) {
            iM86636H += C14877c.m86644c(10, m147683I());
        }
        if (m147695U()) {
            iM86636H += C14877c.m86647f(11, m147699k());
        }
        if (m147696V()) {
            iM86636H += C14877c.m86647f(12, m147708t());
        }
        if (m147697W()) {
            iM86636H += C14877c.m86644c(13, m147687M());
        }
        this.f123285A = iM86636H;
        return iM86636H;
    }

    /* JADX INFO: renamed from: j */
    public String m147698j() {
        return this.f123289d;
    }

    /* JADX INFO: renamed from: k */
    public asq0 m147699k() {
        return this.f123307v;
    }

    /* JADX INFO: renamed from: l */
    public gzq0 m147700l() {
        return this.f123303r;
    }

    /* JADX INFO: renamed from: m */
    public jzq0 m147701m(int i) {
        this.f123286a = true;
        this.f123287b = i;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public jzq0 m147702n(String str) {
        this.f123288c = true;
        this.f123289d = str;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public jzq0 m147703o(asq0 asq0Var) {
        this.f123306u = true;
        this.f123307v = asq0Var;
        return this;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public jzq0 mo118917b(suq0 suq0Var) throws C14878d {
        while (true) {
            int iM188076b = suq0Var.m188076b();
            switch (iM188076b) {
                case 0:
                    break;
                case 8:
                    m147701m(suq0Var.m188091u());
                    break;
                case 18:
                    m147702n(suq0Var.m188079e());
                    break;
                case 26:
                    m147710v(suq0Var.m188079e());
                    break;
                case 34:
                    m147676B(suq0Var.m188079e());
                    break;
                case 40:
                    m147709u(suq0Var.m188087p());
                    break;
                case 50:
                    m147681G(suq0Var.m188079e());
                    break;
                case 58:
                    m147685K(suq0Var.m188079e());
                    break;
                case 66:
                    m147689O(suq0Var.m188079e());
                    break;
                case 74:
                    gzq0 gzq0Var = new gzq0();
                    suq0Var.m188083k(gzq0Var);
                    m147705q(gzq0Var);
                    break;
                case 80:
                    m147675A(suq0Var.m188087p());
                    break;
                case 90:
                    m147703o(suq0Var.m188080f());
                    break;
                case EACTags.FCP_TEMPLATE /* 98 */:
                    m147711w(suq0Var.m188080f());
                    break;
                case 104:
                    m147680F(suq0Var.m188087p());
                    break;
                default:
                    if (!m118922g(suq0Var, iM188076b)) {
                    }
                    break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: q */
    public jzq0 m147705q(gzq0 gzq0Var) {
        gzq0Var.getClass();
        this.f123302q = true;
        this.f123303r = gzq0Var;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public boolean m147706r() {
        return this.f123286a;
    }

    /* JADX INFO: renamed from: s */
    public String m147707s() {
        return this.f123291f;
    }

    /* JADX INFO: renamed from: t */
    public asq0 m147708t() {
        return this.f123309x;
    }

    /* JADX INFO: renamed from: u */
    public jzq0 m147709u(int i) {
        this.f123294i = true;
        this.f123295j = i;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public jzq0 m147710v(String str) {
        this.f123290e = true;
        this.f123291f = str;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public jzq0 m147711w(asq0 asq0Var) {
        this.f123308w = true;
        this.f123309x = asq0Var;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public boolean m147712x() {
        return this.f123288c;
    }

    /* JADX INFO: renamed from: y */
    public int m147713y() {
        return this.f123287b;
    }

    /* JADX INFO: renamed from: z */
    public String m147714z() {
        return this.f123293h;
    }
}
