package p153l;

import com.alibaba.fastjson.asm.Opcodes;
import com.xiaomi.push.C14877c;
import com.xiaomi.push.C14878d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class fzq0 extends e0r0 {

    /* JADX INFO: renamed from: a */
    private boolean f101518a;

    /* JADX INFO: renamed from: c */
    private boolean f101520c;

    /* JADX INFO: renamed from: e */
    private boolean f101522e;

    /* JADX INFO: renamed from: g */
    private boolean f101524g;

    /* JADX INFO: renamed from: i */
    private boolean f101526i;

    /* JADX INFO: renamed from: k */
    private boolean f101528k;

    /* JADX INFO: renamed from: m */
    private boolean f101530m;

    /* JADX INFO: renamed from: o */
    private boolean f101532o;

    /* JADX INFO: renamed from: q */
    private boolean f101534q;

    /* JADX INFO: renamed from: s */
    private boolean f101536s;

    /* JADX INFO: renamed from: u */
    private boolean f101538u;

    /* JADX INFO: renamed from: w */
    private boolean f101540w;

    /* JADX INFO: renamed from: y */
    private boolean f101542y;

    /* JADX INFO: renamed from: b */
    private int f101519b = 0;

    /* JADX INFO: renamed from: d */
    private long f101521d = 0;

    /* JADX INFO: renamed from: f */
    private String f101523f = "";

    /* JADX INFO: renamed from: h */
    private String f101525h = "";

    /* JADX INFO: renamed from: j */
    private String f101527j = "";

    /* JADX INFO: renamed from: l */
    private String f101529l = "";

    /* JADX INFO: renamed from: n */
    private String f101531n = "";

    /* JADX INFO: renamed from: p */
    private int f101533p = 1;

    /* JADX INFO: renamed from: r */
    private int f101535r = 0;

    /* JADX INFO: renamed from: t */
    private int f101537t = 0;

    /* JADX INFO: renamed from: v */
    private String f101539v = "";

    /* JADX INFO: renamed from: x */
    private long f101541x = 0;

    /* JADX INFO: renamed from: z */
    private long f101543z = 0;

    /* JADX INFO: renamed from: A */
    private int f101517A = -1;

    /* JADX INFO: renamed from: A */
    public fzq0 m128235A(int i) {
        this.f101534q = true;
        this.f101535r = i;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public fzq0 m128236B(long j) {
        this.f101542y = true;
        this.f101543z = j;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public fzq0 m128237C(String str) {
        this.f101526i = true;
        this.f101527j = str;
        return this;
    }

    /* JADX INFO: renamed from: D */
    public boolean m128238D() {
        return this.f101522e;
    }

    /* JADX INFO: renamed from: E */
    public int m128239E() {
        return this.f101533p;
    }

    /* JADX INFO: renamed from: F */
    public String m128240F() {
        return this.f101529l;
    }

    /* JADX INFO: renamed from: G */
    public fzq0 m128241G(int i) {
        this.f101536s = true;
        this.f101537t = i;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public fzq0 m128242H(String str) {
        this.f101528k = true;
        this.f101529l = str;
        return this;
    }

    /* JADX INFO: renamed from: I */
    public boolean m128243I() {
        return this.f101524g;
    }

    /* JADX INFO: renamed from: J */
    public int m128244J() {
        return this.f101535r;
    }

    /* JADX INFO: renamed from: K */
    public String m128245K() {
        return this.f101531n;
    }

    /* JADX INFO: renamed from: L */
    public fzq0 m128246L(String str) {
        this.f101530m = true;
        this.f101531n = str;
        return this;
    }

    /* JADX INFO: renamed from: M */
    public boolean m128247M() {
        return this.f101526i;
    }

    /* JADX INFO: renamed from: N */
    public int m128248N() {
        return this.f101537t;
    }

    /* JADX INFO: renamed from: O */
    public String m128249O() {
        return this.f101539v;
    }

    /* JADX INFO: renamed from: P */
    public fzq0 m128250P(String str) {
        this.f101538u = true;
        this.f101539v = str;
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m128251Q() {
        return this.f101528k;
    }

    /* JADX INFO: renamed from: R */
    public boolean m128252R() {
        return this.f101530m;
    }

    /* JADX INFO: renamed from: S */
    public boolean m128253S() {
        return this.f101532o;
    }

    /* JADX INFO: renamed from: T */
    public boolean m128254T() {
        return this.f101534q;
    }

    /* JADX INFO: renamed from: U */
    public boolean m128255U() {
        return this.f101536s;
    }

    /* JADX INFO: renamed from: V */
    public boolean m128256V() {
        return this.f101538u;
    }

    /* JADX INFO: renamed from: W */
    public boolean m128257W() {
        return this.f101540w;
    }

    /* JADX INFO: renamed from: X */
    public boolean m128258X() {
        return this.f101542y;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: a */
    public int mo118916a() {
        if (this.f101517A < 0) {
            mo118924i();
        }
        return this.f101517A;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: e */
    public void mo118920e(C14877c c14877c) throws IOException {
        if (m128266q()) {
            c14877c.m86677t(1, m128273x());
        }
        if (m128272w()) {
            c14877c.m86667N(2, m128259j());
        }
        if (m128238D()) {
            c14877c.m86679v(3, m128260k());
        }
        if (m128243I()) {
            c14877c.m86679v(4, m128268s());
        }
        if (m128247M()) {
            c14877c.m86679v(5, m128275z());
        }
        if (m128251Q()) {
            c14877c.m86679v(6, m128240F());
        }
        if (m128252R()) {
            c14877c.m86679v(7, m128245K());
        }
        if (m128253S()) {
            c14877c.m86677t(8, m128239E());
        }
        if (m128254T()) {
            c14877c.m86677t(9, m128244J());
        }
        if (m128255U()) {
            c14877c.m86677t(10, m128248N());
        }
        if (m128256V()) {
            c14877c.m86679v(11, m128249O());
        }
        if (m128257W()) {
            c14877c.m86667N(12, m128267r());
        }
        if (m128258X()) {
            c14877c.m86667N(13, m128274y());
        }
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: i */
    public int mo118924i() {
        int iM86644c = m128266q() ? C14877c.m86644c(1, m128273x()) : 0;
        if (m128272w()) {
            iM86644c += C14877c.m86637I(2, m128259j());
        }
        if (m128238D()) {
            iM86644c += C14877c.m86646e(3, m128260k());
        }
        if (m128243I()) {
            iM86644c += C14877c.m86646e(4, m128268s());
        }
        if (m128247M()) {
            iM86644c += C14877c.m86646e(5, m128275z());
        }
        if (m128251Q()) {
            iM86644c += C14877c.m86646e(6, m128240F());
        }
        if (m128252R()) {
            iM86644c += C14877c.m86646e(7, m128245K());
        }
        if (m128253S()) {
            iM86644c += C14877c.m86644c(8, m128239E());
        }
        if (m128254T()) {
            iM86644c += C14877c.m86644c(9, m128244J());
        }
        if (m128255U()) {
            iM86644c += C14877c.m86644c(10, m128248N());
        }
        if (m128256V()) {
            iM86644c += C14877c.m86646e(11, m128249O());
        }
        if (m128257W()) {
            iM86644c += C14877c.m86637I(12, m128267r());
        }
        if (m128258X()) {
            iM86644c += C14877c.m86637I(13, m128274y());
        }
        this.f101517A = iM86644c;
        return iM86644c;
    }

    /* JADX INFO: renamed from: j */
    public long m128259j() {
        return this.f101521d;
    }

    /* JADX INFO: renamed from: k */
    public String m128260k() {
        return this.f101523f;
    }

    /* JADX INFO: renamed from: l */
    public fzq0 m128261l() {
        this.f101528k = false;
        this.f101529l = "";
        return this;
    }

    /* JADX INFO: renamed from: m */
    public fzq0 m128262m(int i) {
        this.f101518a = true;
        this.f101519b = i;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public fzq0 m128263n(long j) {
        this.f101520c = true;
        this.f101521d = j;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public fzq0 m128264o(String str) {
        this.f101522e = true;
        this.f101523f = str;
        return this;
    }

    @Override // p153l.e0r0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public fzq0 mo118917b(suq0 suq0Var) throws C14878d {
        while (true) {
            int iM188076b = suq0Var.m188076b();
            switch (iM188076b) {
                case 0:
                    break;
                case 8:
                    m128262m(suq0Var.m188087p());
                    break;
                case 16:
                    m128263n(suq0Var.m188088q());
                    break;
                case 26:
                    m128264o(suq0Var.m188079e());
                    break;
                case 34:
                    m128271v(suq0Var.m188079e());
                    break;
                case 42:
                    m128237C(suq0Var.m188079e());
                    break;
                case 50:
                    m128242H(suq0Var.m188079e());
                    break;
                case 58:
                    m128246L(suq0Var.m188079e());
                    break;
                case 64:
                    m128269t(suq0Var.m188087p());
                    break;
                case 72:
                    m128235A(suq0Var.m188087p());
                    break;
                case 80:
                    m128241G(suq0Var.m188087p());
                    break;
                case 90:
                    m128250P(suq0Var.m188079e());
                    break;
                case Opcodes.IADD /* 96 */:
                    m128270u(suq0Var.m188088q());
                    break;
                case 104:
                    m128236B(suq0Var.m188088q());
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
    public boolean m128266q() {
        return this.f101518a;
    }

    /* JADX INFO: renamed from: r */
    public long m128267r() {
        return this.f101541x;
    }

    /* JADX INFO: renamed from: s */
    public String m128268s() {
        return this.f101525h;
    }

    /* JADX INFO: renamed from: t */
    public fzq0 m128269t(int i) {
        this.f101532o = true;
        this.f101533p = i;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public fzq0 m128270u(long j) {
        this.f101540w = true;
        this.f101541x = j;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public fzq0 m128271v(String str) {
        this.f101524g = true;
        this.f101525h = str;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public boolean m128272w() {
        return this.f101520c;
    }

    /* JADX INFO: renamed from: x */
    public int m128273x() {
        return this.f101519b;
    }

    /* JADX INFO: renamed from: y */
    public long m128274y() {
        return this.f101543z;
    }

    /* JADX INFO: renamed from: z */
    public String m128275z() {
        return this.f101527j;
    }
}
