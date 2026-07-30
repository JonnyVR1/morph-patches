package p149l;

import com.alibaba.fastjson.asm.Opcodes;
import com.xiaomi.push.C14729c;
import com.xiaomi.push.C14730d;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zpq0 extends yqq0 {

    /* JADX INFO: renamed from: a */
    private boolean f204275a;

    /* JADX INFO: renamed from: c */
    private boolean f204277c;

    /* JADX INFO: renamed from: e */
    private boolean f204279e;

    /* JADX INFO: renamed from: g */
    private boolean f204281g;

    /* JADX INFO: renamed from: i */
    private boolean f204283i;

    /* JADX INFO: renamed from: k */
    private boolean f204285k;

    /* JADX INFO: renamed from: m */
    private boolean f204287m;

    /* JADX INFO: renamed from: o */
    private boolean f204289o;

    /* JADX INFO: renamed from: q */
    private boolean f204291q;

    /* JADX INFO: renamed from: s */
    private boolean f204293s;

    /* JADX INFO: renamed from: u */
    private boolean f204295u;

    /* JADX INFO: renamed from: w */
    private boolean f204297w;

    /* JADX INFO: renamed from: y */
    private boolean f204299y;

    /* JADX INFO: renamed from: b */
    private int f204276b = 0;

    /* JADX INFO: renamed from: d */
    private long f204278d = 0;

    /* JADX INFO: renamed from: f */
    private String f204280f = "";

    /* JADX INFO: renamed from: h */
    private String f204282h = "";

    /* JADX INFO: renamed from: j */
    private String f204284j = "";

    /* JADX INFO: renamed from: l */
    private String f204286l = "";

    /* JADX INFO: renamed from: n */
    private String f204288n = "";

    /* JADX INFO: renamed from: p */
    private int f204290p = 1;

    /* JADX INFO: renamed from: r */
    private int f204292r = 0;

    /* JADX INFO: renamed from: t */
    private int f204294t = 0;

    /* JADX INFO: renamed from: v */
    private String f204296v = "";

    /* JADX INFO: renamed from: x */
    private long f204298x = 0;

    /* JADX INFO: renamed from: z */
    private long f204300z = 0;

    /* JADX INFO: renamed from: A */
    private int f204274A = -1;

    /* JADX INFO: renamed from: A */
    public zpq0 m219700A(int i) {
        this.f204291q = true;
        this.f204292r = i;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public zpq0 m219701B(long j) {
        this.f204299y = true;
        this.f204300z = j;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public zpq0 m219702C(String str) {
        this.f204283i = true;
        this.f204284j = str;
        return this;
    }

    /* JADX INFO: renamed from: D */
    public boolean m219703D() {
        return this.f204279e;
    }

    /* JADX INFO: renamed from: E */
    public int m219704E() {
        return this.f204290p;
    }

    /* JADX INFO: renamed from: F */
    public String m219705F() {
        return this.f204286l;
    }

    /* JADX INFO: renamed from: G */
    public zpq0 m219706G(int i) {
        this.f204293s = true;
        this.f204294t = i;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public zpq0 m219707H(String str) {
        this.f204285k = true;
        this.f204286l = str;
        return this;
    }

    /* JADX INFO: renamed from: I */
    public boolean m219708I() {
        return this.f204281g;
    }

    /* JADX INFO: renamed from: J */
    public int m219709J() {
        return this.f204292r;
    }

    /* JADX INFO: renamed from: K */
    public String m219710K() {
        return this.f204288n;
    }

    /* JADX INFO: renamed from: L */
    public zpq0 m219711L(String str) {
        this.f204287m = true;
        this.f204288n = str;
        return this;
    }

    /* JADX INFO: renamed from: M */
    public boolean m219712M() {
        return this.f204283i;
    }

    /* JADX INFO: renamed from: N */
    public int m219713N() {
        return this.f204294t;
    }

    /* JADX INFO: renamed from: O */
    public String m219714O() {
        return this.f204296v;
    }

    /* JADX INFO: renamed from: P */
    public zpq0 m219715P(String str) {
        this.f204295u = true;
        this.f204296v = str;
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m219716Q() {
        return this.f204285k;
    }

    /* JADX INFO: renamed from: R */
    public boolean m219717R() {
        return this.f204287m;
    }

    /* JADX INFO: renamed from: S */
    public boolean m219718S() {
        return this.f204289o;
    }

    /* JADX INFO: renamed from: T */
    public boolean m219719T() {
        return this.f204291q;
    }

    /* JADX INFO: renamed from: U */
    public boolean m219720U() {
        return this.f204293s;
    }

    /* JADX INFO: renamed from: V */
    public boolean m219721V() {
        return this.f204295u;
    }

    /* JADX INFO: renamed from: W */
    public boolean m219722W() {
        return this.f204297w;
    }

    /* JADX INFO: renamed from: X */
    public boolean m219723X() {
        return this.f204299y;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: a */
    public int mo98326a() {
        if (this.f204274A < 0) {
            mo98329i();
        }
        return this.f204274A;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: e */
    public void mo98328e(C14729c c14729c) throws IOException {
        if (m219731q()) {
            c14729c.m85506t(1, m219738x());
        }
        if (m219737w()) {
            c14729c.m85496N(2, m219724j());
        }
        if (m219703D()) {
            c14729c.m85508v(3, m219725k());
        }
        if (m219708I()) {
            c14729c.m85508v(4, m219733s());
        }
        if (m219712M()) {
            c14729c.m85508v(5, m219740z());
        }
        if (m219716Q()) {
            c14729c.m85508v(6, m219705F());
        }
        if (m219717R()) {
            c14729c.m85508v(7, m219710K());
        }
        if (m219718S()) {
            c14729c.m85506t(8, m219704E());
        }
        if (m219719T()) {
            c14729c.m85506t(9, m219709J());
        }
        if (m219720U()) {
            c14729c.m85506t(10, m219713N());
        }
        if (m219721V()) {
            c14729c.m85508v(11, m219714O());
        }
        if (m219722W()) {
            c14729c.m85496N(12, m219732r());
        }
        if (m219723X()) {
            c14729c.m85496N(13, m219739y());
        }
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: i */
    public int mo98329i() {
        int iM85473c = m219731q() ? C14729c.m85473c(1, m219738x()) : 0;
        if (m219737w()) {
            iM85473c += C14729c.m85466I(2, m219724j());
        }
        if (m219703D()) {
            iM85473c += C14729c.m85475e(3, m219725k());
        }
        if (m219708I()) {
            iM85473c += C14729c.m85475e(4, m219733s());
        }
        if (m219712M()) {
            iM85473c += C14729c.m85475e(5, m219740z());
        }
        if (m219716Q()) {
            iM85473c += C14729c.m85475e(6, m219705F());
        }
        if (m219717R()) {
            iM85473c += C14729c.m85475e(7, m219710K());
        }
        if (m219718S()) {
            iM85473c += C14729c.m85473c(8, m219704E());
        }
        if (m219719T()) {
            iM85473c += C14729c.m85473c(9, m219709J());
        }
        if (m219720U()) {
            iM85473c += C14729c.m85473c(10, m219713N());
        }
        if (m219721V()) {
            iM85473c += C14729c.m85475e(11, m219714O());
        }
        if (m219722W()) {
            iM85473c += C14729c.m85466I(12, m219732r());
        }
        if (m219723X()) {
            iM85473c += C14729c.m85466I(13, m219739y());
        }
        this.f204274A = iM85473c;
        return iM85473c;
    }

    /* JADX INFO: renamed from: j */
    public long m219724j() {
        return this.f204278d;
    }

    /* JADX INFO: renamed from: k */
    public String m219725k() {
        return this.f204280f;
    }

    /* JADX INFO: renamed from: l */
    public zpq0 m219726l() {
        this.f204285k = false;
        this.f204286l = "";
        return this;
    }

    /* JADX INFO: renamed from: m */
    public zpq0 m219727m(int i) {
        this.f204275a = true;
        this.f204276b = i;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public zpq0 m219728n(long j) {
        this.f204277c = true;
        this.f204278d = j;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public zpq0 m219729o(String str) {
        this.f204279e = true;
        this.f204280f = str;
        return this;
    }

    @Override // p149l.yqq0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public zpq0 mo98327b(mlq0 mlq0Var) throws C14730d {
        while (true) {
            int iM155175b = mlq0Var.m155175b();
            switch (iM155175b) {
                case 0:
                    break;
                case 8:
                    m219727m(mlq0Var.m155186p());
                    break;
                case 16:
                    m219728n(mlq0Var.m155187q());
                    break;
                case 26:
                    m219729o(mlq0Var.m155178e());
                    break;
                case 34:
                    m219736v(mlq0Var.m155178e());
                    break;
                case 42:
                    m219702C(mlq0Var.m155178e());
                    break;
                case 50:
                    m219707H(mlq0Var.m155178e());
                    break;
                case 58:
                    m219711L(mlq0Var.m155178e());
                    break;
                case 64:
                    m219734t(mlq0Var.m155186p());
                    break;
                case 72:
                    m219700A(mlq0Var.m155186p());
                    break;
                case 80:
                    m219706G(mlq0Var.m155186p());
                    break;
                case 90:
                    m219715P(mlq0Var.m155178e());
                    break;
                case Opcodes.IADD /* 96 */:
                    m219735u(mlq0Var.m155187q());
                    break;
                case 104:
                    m219701B(mlq0Var.m155187q());
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
    public boolean m219731q() {
        return this.f204275a;
    }

    /* JADX INFO: renamed from: r */
    public long m219732r() {
        return this.f204298x;
    }

    /* JADX INFO: renamed from: s */
    public String m219733s() {
        return this.f204282h;
    }

    /* JADX INFO: renamed from: t */
    public zpq0 m219734t(int i) {
        this.f204289o = true;
        this.f204290p = i;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public zpq0 m219735u(long j) {
        this.f204297w = true;
        this.f204298x = j;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public zpq0 m219736v(String str) {
        this.f204281g = true;
        this.f204282h = str;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public boolean m219737w() {
        return this.f204277c;
    }

    /* JADX INFO: renamed from: x */
    public int m219738x() {
        return this.f204276b;
    }

    /* JADX INFO: renamed from: y */
    public long m219739y() {
        return this.f204300z;
    }

    /* JADX INFO: renamed from: z */
    public String m219740z() {
        return this.f204284j;
    }
}
