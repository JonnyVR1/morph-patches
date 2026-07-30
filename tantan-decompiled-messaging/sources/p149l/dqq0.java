package p149l;

import com.xiaomi.push.C14729c;
import com.xiaomi.push.C14730d;
import java.io.IOException;
import org.spongycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes2.dex */
public final class dqq0 extends yqq0 {

    /* JADX INFO: renamed from: A */
    private int f87469A;

    /* JADX INFO: renamed from: a */
    private boolean f87470a;

    /* JADX INFO: renamed from: c */
    private boolean f87472c;

    /* JADX INFO: renamed from: e */
    private boolean f87474e;

    /* JADX INFO: renamed from: g */
    private boolean f87476g;

    /* JADX INFO: renamed from: i */
    private boolean f87478i;

    /* JADX INFO: renamed from: k */
    private boolean f87480k;

    /* JADX INFO: renamed from: m */
    private boolean f87482m;

    /* JADX INFO: renamed from: o */
    private boolean f87484o;

    /* JADX INFO: renamed from: q */
    private boolean f87486q;

    /* JADX INFO: renamed from: s */
    private boolean f87488s;

    /* JADX INFO: renamed from: u */
    private boolean f87490u;

    /* JADX INFO: renamed from: v */
    private viq0 f87491v;

    /* JADX INFO: renamed from: w */
    private boolean f87492w;

    /* JADX INFO: renamed from: x */
    private viq0 f87493x;

    /* JADX INFO: renamed from: y */
    private boolean f87494y;

    /* JADX INFO: renamed from: z */
    private int f87495z;

    /* JADX INFO: renamed from: b */
    private int f87471b = 0;

    /* JADX INFO: renamed from: d */
    private String f87473d = "";

    /* JADX INFO: renamed from: f */
    private String f87475f = "";

    /* JADX INFO: renamed from: h */
    private String f87477h = "";

    /* JADX INFO: renamed from: j */
    private int f87479j = 0;

    /* JADX INFO: renamed from: l */
    private String f87481l = "";

    /* JADX INFO: renamed from: n */
    private String f87483n = "";

    /* JADX INFO: renamed from: p */
    private String f87485p = "";

    /* JADX INFO: renamed from: r */
    private aqq0 f87487r = null;

    /* JADX INFO: renamed from: t */
    private int f87489t = 0;

    public dqq0() {
        viq0 viq0Var = viq0.f181631c;
        this.f87491v = viq0Var;
        this.f87493x = viq0Var;
        this.f87495z = 0;
        this.f87469A = -1;
    }

    /* JADX INFO: renamed from: A */
    public dqq0 m113098A(int i) {
        this.f87488s = true;
        this.f87489t = i;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public dqq0 m113099B(String str) {
        this.f87476g = true;
        this.f87477h = str;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public boolean m113100C() {
        return this.f87474e;
    }

    /* JADX INFO: renamed from: D */
    public int m113101D() {
        return this.f87479j;
    }

    /* JADX INFO: renamed from: E */
    public String m113102E() {
        return this.f87481l;
    }

    /* JADX INFO: renamed from: F */
    public dqq0 m113103F(int i) {
        this.f87494y = true;
        this.f87495z = i;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public dqq0 m113104G(String str) {
        this.f87480k = true;
        this.f87481l = str;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public boolean m113105H() {
        return this.f87476g;
    }

    /* JADX INFO: renamed from: I */
    public int m113106I() {
        return this.f87489t;
    }

    /* JADX INFO: renamed from: J */
    public String m113107J() {
        return this.f87483n;
    }

    /* JADX INFO: renamed from: K */
    public dqq0 m113108K(String str) {
        this.f87482m = true;
        this.f87483n = str;
        return this;
    }

    /* JADX INFO: renamed from: L */
    public boolean m113109L() {
        return this.f87478i;
    }

    /* JADX INFO: renamed from: M */
    public int m113110M() {
        return this.f87495z;
    }

    /* JADX INFO: renamed from: N */
    public String m113111N() {
        return this.f87485p;
    }

    /* JADX INFO: renamed from: O */
    public dqq0 m113112O(String str) {
        this.f87484o = true;
        this.f87485p = str;
        return this;
    }

    /* JADX INFO: renamed from: P */
    public boolean m113113P() {
        return this.f87480k;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m113114Q() {
        return this.f87482m;
    }

    /* JADX INFO: renamed from: R */
    public boolean m113115R() {
        return this.f87484o;
    }

    /* JADX INFO: renamed from: S */
    public boolean m113116S() {
        return this.f87486q;
    }

    /* JADX INFO: renamed from: T */
    public boolean m113117T() {
        return this.f87488s;
    }

    /* JADX INFO: renamed from: U */
    public boolean m113118U() {
        return this.f87490u;
    }

    /* JADX INFO: renamed from: V */
    public boolean m113119V() {
        return this.f87492w;
    }

    /* JADX INFO: renamed from: W */
    public boolean m113120W() {
        return this.f87494y;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: a */
    public int mo98326a() {
        if (this.f87469A < 0) {
            mo98329i();
        }
        return this.f87469A;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: e */
    public void mo98328e(C14729c c14729c) throws IOException {
        if (m113129r()) {
            c14729c.m85495M(1, m113136y());
        }
        if (m113135x()) {
            c14729c.m85508v(2, m113121j());
        }
        if (m113100C()) {
            c14729c.m85508v(3, m113130s());
        }
        if (m113105H()) {
            c14729c.m85508v(4, m113137z());
        }
        if (m113109L()) {
            c14729c.m85506t(5, m113101D());
        }
        if (m113113P()) {
            c14729c.m85508v(6, m113102E());
        }
        if (m113114Q()) {
            c14729c.m85508v(7, m113107J());
        }
        if (m113115R()) {
            c14729c.m85508v(8, m113111N());
        }
        if (m113116S()) {
            c14729c.m85510x(9, m113123l());
        }
        if (m113117T()) {
            c14729c.m85506t(10, m113106I());
        }
        if (m113118U()) {
            c14729c.m85509w(11, m113122k());
        }
        if (m113119V()) {
            c14729c.m85509w(12, m113131t());
        }
        if (m113120W()) {
            c14729c.m85506t(13, m113110M());
        }
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: i */
    public int mo98329i() {
        int iM85465H = m113129r() ? C14729c.m85465H(1, m113136y()) : 0;
        if (m113135x()) {
            iM85465H += C14729c.m85475e(2, m113121j());
        }
        if (m113100C()) {
            iM85465H += C14729c.m85475e(3, m113130s());
        }
        if (m113105H()) {
            iM85465H += C14729c.m85475e(4, m113137z());
        }
        if (m113109L()) {
            iM85465H += C14729c.m85473c(5, m113101D());
        }
        if (m113113P()) {
            iM85465H += C14729c.m85475e(6, m113102E());
        }
        if (m113114Q()) {
            iM85465H += C14729c.m85475e(7, m113107J());
        }
        if (m113115R()) {
            iM85465H += C14729c.m85475e(8, m113111N());
        }
        if (m113116S()) {
            iM85465H += C14729c.m85477g(9, m113123l());
        }
        if (m113117T()) {
            iM85465H += C14729c.m85473c(10, m113106I());
        }
        if (m113118U()) {
            iM85465H += C14729c.m85476f(11, m113122k());
        }
        if (m113119V()) {
            iM85465H += C14729c.m85476f(12, m113131t());
        }
        if (m113120W()) {
            iM85465H += C14729c.m85473c(13, m113110M());
        }
        this.f87469A = iM85465H;
        return iM85465H;
    }

    /* JADX INFO: renamed from: j */
    public String m113121j() {
        return this.f87473d;
    }

    /* JADX INFO: renamed from: k */
    public viq0 m113122k() {
        return this.f87491v;
    }

    /* JADX INFO: renamed from: l */
    public aqq0 m113123l() {
        return this.f87487r;
    }

    /* JADX INFO: renamed from: m */
    public dqq0 m113124m(int i) {
        this.f87470a = true;
        this.f87471b = i;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public dqq0 m113125n(String str) {
        this.f87472c = true;
        this.f87473d = str;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public dqq0 m113126o(viq0 viq0Var) {
        this.f87490u = true;
        this.f87491v = viq0Var;
        return this;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public dqq0 mo98327b(mlq0 mlq0Var) throws C14730d {
        while (true) {
            int iM155175b = mlq0Var.m155175b();
            switch (iM155175b) {
                case 0:
                    break;
                case 8:
                    m113124m(mlq0Var.m155190u());
                    break;
                case 18:
                    m113125n(mlq0Var.m155178e());
                    break;
                case 26:
                    m113133v(mlq0Var.m155178e());
                    break;
                case 34:
                    m113099B(mlq0Var.m155178e());
                    break;
                case 40:
                    m113132u(mlq0Var.m155186p());
                    break;
                case 50:
                    m113104G(mlq0Var.m155178e());
                    break;
                case 58:
                    m113108K(mlq0Var.m155178e());
                    break;
                case 66:
                    m113112O(mlq0Var.m155178e());
                    break;
                case 74:
                    aqq0 aqq0Var = new aqq0();
                    mlq0Var.m155182k(aqq0Var);
                    m113128q(aqq0Var);
                    break;
                case 80:
                    m113098A(mlq0Var.m155186p());
                    break;
                case 90:
                    m113126o(mlq0Var.m155179f());
                    break;
                case EACTags.FCP_TEMPLATE /* 98 */:
                    m113134w(mlq0Var.m155179f());
                    break;
                case 104:
                    m113103F(mlq0Var.m155186p());
                    break;
                default:
                    if (!m215760g(mlq0Var, iM155175b)) {
                    }
                    break;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: q */
    public dqq0 m113128q(aqq0 aqq0Var) {
        aqq0Var.getClass();
        this.f87486q = true;
        this.f87487r = aqq0Var;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public boolean m113129r() {
        return this.f87470a;
    }

    /* JADX INFO: renamed from: s */
    public String m113130s() {
        return this.f87475f;
    }

    /* JADX INFO: renamed from: t */
    public viq0 m113131t() {
        return this.f87493x;
    }

    /* JADX INFO: renamed from: u */
    public dqq0 m113132u(int i) {
        this.f87478i = true;
        this.f87479j = i;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public dqq0 m113133v(String str) {
        this.f87474e = true;
        this.f87475f = str;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public dqq0 m113134w(viq0 viq0Var) {
        this.f87492w = true;
        this.f87493x = viq0Var;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public boolean m113135x() {
        return this.f87472c;
    }

    /* JADX INFO: renamed from: y */
    public int m113136y() {
        return this.f87471b;
    }

    /* JADX INFO: renamed from: z */
    public String m113137z() {
        return this.f87477h;
    }
}
