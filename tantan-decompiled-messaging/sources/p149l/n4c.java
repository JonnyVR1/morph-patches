package p149l;

import android.opengl.EGLContext;
import android.os.Message;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes7.dex */
public class n4c extends ddc0 {

    /* JADX INFO: renamed from: H0 */
    private static EGLContext f137058H0;

    /* JADX INFO: renamed from: C */
    xsm f137059C;

    /* JADX INFO: renamed from: D */
    private Object f137060D;

    /* JADX INFO: renamed from: E */
    private Object f137061E;

    /* JADX INFO: renamed from: E0 */
    private mb5 f137062E0;

    /* JADX INFO: renamed from: F */
    private int f137063F;

    /* JADX INFO: renamed from: F0 */
    private final int f137064F0;

    /* JADX INFO: renamed from: G */
    private final int f137065G;

    /* JADX INFO: renamed from: G0 */
    private final int f137066G0;

    /* JADX INFO: renamed from: H */
    private final int f137067H;

    /* JADX INFO: renamed from: I */
    private final int f137068I;

    /* JADX INFO: renamed from: J */
    private final int f137069J;

    /* JADX INFO: renamed from: K */
    private final int f137070K;

    /* JADX INFO: renamed from: L */
    private final int f137071L;

    /* JADX INFO: renamed from: M */
    private tnr f137072M;

    /* JADX INFO: renamed from: N */
    private rmw f137073N;

    /* JADX INFO: renamed from: O */
    private qmw f137074O;

    /* JADX INFO: renamed from: P */
    private amw f137075P;

    /* JADX INFO: renamed from: Q */
    private int f137076Q;

    /* JADX INFO: renamed from: R */
    private boolean f137077R;

    /* JADX INFO: renamed from: S */
    private int f137078S;

    /* JADX INFO: renamed from: T */
    private Timer f137079T;

    /* JADX INFO: renamed from: U */
    private boolean f137080U;

    /* JADX INFO: renamed from: V */
    private int f137081V;

    /* JADX INFO: renamed from: W */
    onr f137082W;

    /* JADX INFO: renamed from: X */
    private long f137083X;

    /* JADX INFO: renamed from: Y */
    private long f137084Y;

    /* JADX INFO: renamed from: Z */
    private long f137085Z;

    /* JADX INFO: renamed from: k0 */
    private i5e0 f137086k0;

    /* JADX INFO: renamed from: p0 */
    private mb5 f137087p0;

    /* JADX INFO: renamed from: l.n4c$a */
    public class C18620a extends TimerTask {
        public C18620a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            n4c.this.m157812X0();
        }
    }

    public n4c(String str) {
        super(str);
        this.f137060D = new Object();
        this.f137061E = new Object();
        this.f137063F = 0;
        this.f137065G = 16;
        this.f137067H = 17;
        this.f137068I = 18;
        this.f137069J = 19;
        this.f137070K = 20;
        this.f137071L = 21;
        this.f137072M = null;
        this.f137076Q = 0;
        this.f137077R = false;
        this.f137078S = 40;
        this.f137079T = null;
        this.f137080U = false;
        this.f137081V = -1;
        this.f137082W = null;
        this.f137083X = 0L;
        this.f137084Y = 0L;
        this.f137085Z = 0L;
        this.f137086k0 = null;
        this.f137087p0 = null;
        this.f137062E0 = null;
        this.f137064F0 = 0;
        this.f137066G0 = 1;
    }

    /* JADX INFO: renamed from: P0 */
    public static n4c m157806P0(String str, EGLContext eGLContext) {
        f137058H0 = eGLContext;
        return new n4c(str);
    }

    /* JADX INFO: renamed from: Q0 */
    private void m157807Q0() {
        if (this.f137079T == null) {
            this.f137079T = new Timer();
        }
    }

    /* JADX INFO: renamed from: S0 */
    private void m157808S0() {
        int i = this.f137081V;
        if (i != -1) {
            qie.m174867h(i);
            this.f137081V = -1;
        }
        int iM174866d = qie.m174866d();
        this.f137081V = iM174866d;
        this.f137059C.m210803v(iM174866d);
    }

    /* JADX INFO: renamed from: T0 */
    private void m157809T0(Message message) {
        onr onrVar = this.f137082W;
        if (onrVar != null) {
            onrVar.mo165228a(message);
        }
    }

    /* JADX INFO: renamed from: U0 */
    private void m157810U0() {
        int i;
        if (this.f137080U) {
            m157807Q0();
        }
        if (this.f137083X == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f137083X = jCurrentTimeMillis;
            i = this.f137078S;
            this.f137084Y = jCurrentTimeMillis + ((long) i);
        } else {
            this.f137084Y += (long) this.f137078S;
            long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f137084Y;
            i = jCurrentTimeMillis2 >= 0 ? 0 : (int) (jCurrentTimeMillis2 * (-1));
        }
        m157813h1(i);
    }

    /* JADX INFO: renamed from: V0 */
    private void m157811V0(int i) {
        xsm xsmVar = this.f137059C;
        if (xsmVar != null) {
            xsmVar.m210799A(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public void m157812X0() {
        super.m111002I0();
    }

    /* JADX INFO: renamed from: h1 */
    private void m157813h1(int i) {
        Timer timer = this.f137079T;
        if (timer != null) {
            timer.schedule(new C18620a(), i);
        } else {
            super.m111002I0();
        }
    }

    /* JADX INFO: renamed from: p1 */
    private void m157814p1() {
        Timer timer = this.f137079T;
        if (timer != null) {
            timer.cancel();
            this.f137079T = null;
        }
    }

    @Override // p149l.ddc0
    /* JADX INFO: renamed from: G0 */
    public void mo111000G0(boolean z) {
        xsm xsmVar = this.f137059C;
        if (xsmVar != null) {
            xsmVar.m210805x(z);
        }
    }

    @Override // p149l.ddc0
    /* JADX INFO: renamed from: H0 */
    public void mo111001H0(int i) {
        xsm xsmVar = this.f137059C;
        if (xsmVar != null) {
            xsmVar.m210804w(i);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m157815L0(Object obj, int i, int i2) {
        mb5 mb5Var = new mb5();
        this.f137087p0 = mb5Var;
        mb5Var.mo110713z(i, i2);
        this.f137087p0.m153861R(this.f137072M);
        m115694A0(obj, this.f137087p0);
    }

    /* JADX INFO: renamed from: M0 */
    public void m157816M0(Object obj, int i, int i2) {
        mb5 mb5Var = new mb5();
        this.f137062E0 = mb5Var;
        mb5Var.mo110713z(i, i2);
        this.f137062E0.m153861R(this.f137072M);
        m115697D0(obj, this.f137062E0);
    }

    /* JADX INFO: renamed from: N0 */
    public void m157817N0(Object obj, boolean z) {
        i5e0 i5e0Var = new i5e0();
        this.f137086k0 = i5e0Var;
        i5e0Var.m149845Q(!z);
        this.f137086k0.m134472R(this.f137073N);
        this.f137086k0.m134473S(this.f137074O);
        m115698E0(obj, this.f137086k0);
    }

    /* JADX INFO: renamed from: O0 */
    public void m157818O0(boolean z) {
        this.f137086k0.m149845Q(!z);
    }

    /* JADX INFO: renamed from: R0 */
    public void m157819R0(Object obj) {
        Map<Object, us2> map;
        Object objMo115708j0;
        mb5 mb5Var = new mb5();
        this.f137087p0 = mb5Var;
        mb5Var.m153861R(this.f137072M);
        if (obj == null || this.f137087p0 == null || (map = this.f90509h) == null || this.f90510i == null) {
            return;
        }
        us2 us2Var = map.get(obj);
        if (us2Var != null) {
            xsm xsmVar = this.f137059C;
            if (xsmVar != null) {
                xsmVar.m214839r(us2Var);
            }
            us2Var.mo102038f();
        }
        qie qieVar = this.f90510i.get(obj);
        if (qieVar == null) {
            qieVar = new qie();
            if (obj instanceof n4c) {
                n4c n4cVar = (n4c) obj;
                objMo115708j0 = n4cVar.mo115708j0();
                n4cVar.m115721w0(qieVar);
            } else {
                objMo115708j0 = obj;
            }
            try {
                qie qieVar2 = this.f90512k;
                qieVar.m174870c(qieVar2 == null ? null : qieVar2.f154758c, objMo115708j0);
            } catch (Exception e) {
                MDLog.m7391e(MDLogTag.MOMENT_RENDER_TAG, "Create egl devices failed ! Add Target failed !");
                MDLog.printErrStackTrace(MDLogTag.MOMENT_RENDER_TAG, e);
                if (obj instanceof eci0) {
                    this.f90508g.remove(eci0.f90504x);
                }
                rnr rnrVar = this.f71529d;
                if (rnrVar != null) {
                    rnrVar.mo168079e(MDLogTag.MOMENT_RENDER_TAG, 1, "Create target Egl device has exception !");
                    return;
                }
                return;
            }
        }
        mb5 mb5Var2 = this.f137087p0;
        if (mb5Var2 != null) {
            mb5Var2.mo103527a(qieVar, this.f90512k);
        }
        xsm xsmVar2 = this.f137059C;
        if (xsmVar2 != null) {
            xsmVar2.m210801t(this.f137087p0);
        }
        this.f90509h.put(obj, this.f137087p0);
        this.f90510i.put(obj, qieVar);
    }

    /* JADX INFO: renamed from: W0 */
    public void m157820W0(Object[] objArr) {
        String str = (String) objArr[0];
        int iIntValue = ((Integer) objArr[1]).intValue();
        int iIntValue2 = ((Integer) objArr[2]).intValue();
        int iIntValue3 = ((Integer) objArr[3]).intValue();
        int iIntValue4 = ((Integer) objArr[4]).intValue();
        int iIntValue5 = ((Integer) objArr[5]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[6]).booleanValue();
        i5e0 i5e0Var = this.f137086k0;
        if (i5e0Var != null) {
            i5e0Var.m134474T(str, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, zBooleanValue);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m157821Y0(tnr tnrVar) {
        this.f137072M = tnrVar;
        mb5 mb5Var = this.f137087p0;
        if (mb5Var != null) {
            mb5Var.m153861R(tnrVar);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public void m157822Z0(Object obj) {
        i5e0 i5e0Var = this.f137086k0;
        if (i5e0Var == null || obj == null) {
            return;
        }
        if (obj instanceof qmw) {
            i5e0Var.m134473S((qmw) obj);
            return;
        }
        if (obj instanceof rmw) {
            i5e0Var.m134472R((rmw) obj);
            return;
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            if (iIntValue == 1) {
                this.f137086k0.m134473S(null);
            } else if (iIntValue == 0) {
                this.f137086k0.m134472R(null);
            }
        }
    }

    /* JADX INFO: renamed from: a1 */
    public boolean m157823a1() {
        xsm xsmVar = this.f137059C;
        if (xsmVar == null) {
            return false;
        }
        return xsmVar.m210802u();
    }

    /* JADX INFO: renamed from: b1 */
    public void m157824b1(Object obj) {
        m115715q0(20, obj);
    }

    /* JADX INFO: renamed from: c1 */
    public void m157825c1() {
        m115713o0(21);
    }

    /* JADX INFO: renamed from: d1 */
    public void m157826d1(int i) {
        m115714p0(22, i);
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: e */
    public void mo98693e(jdq0.C17755a c17755a) {
        xsm xsmVar = this.f137059C;
        if (xsmVar == null || c17755a == null) {
            return;
        }
        xsmVar.m210807z(c17755a.f117429a, c17755a.f117430b, c17755a.f117431c, c17755a.f117432d, c17755a.f117433e, c17755a.f117434f);
    }

    /* JADX INFO: renamed from: e1 */
    public void m157827e1(Message message) {
        m115715q0(16, message);
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: f */
    public void mo98694f() {
        if (this.f137059C == null) {
            xsm xsmVar = new xsm();
            this.f137059C = xsmVar;
            xsmVar.m210806y(this.f137076Q);
            this.f85586B = this.f137059C;
        }
    }

    @Override // p149l.eci0
    /* JADX INFO: renamed from: f0 */
    public void mo115705f0() {
        int i;
        amw amwVar = this.f137075P;
        if (amwVar == null || (i = this.f137081V) == -1) {
            return;
        }
        amwVar.mo97695a(i);
    }

    /* JADX INFO: renamed from: f1 */
    public void m157828f1(Object obj) {
        mo98702n(obj, eci0.f90504x);
    }

    @Override // p149l.eci0, p149l.at2
    /* JADX INFO: renamed from: g */
    public void mo98695g() {
        if (this.f90512k == null) {
            qie qieVar = new qie();
            this.f90512k = qieVar;
            qieVar.m174869b(f137058H0);
            this.f90512k.m174872f();
        }
    }

    @Override // p149l.eci0
    /* JADX INFO: renamed from: g0 */
    public void mo115706g0() {
        super.mo115706g0();
        if (this.f137077R) {
            m157810U0();
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m157829g1(Object obj) {
        mo98702n(obj, eci0.f90503A);
    }

    @Override // p149l.eci0, p149l.at2
    /* JADX INFO: renamed from: i */
    public void mo98697i() {
        super.mo98697i();
        this.f137085Z = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: i1 */
    public void m157830i1(onr onrVar) {
        this.f137082W = onrVar;
    }

    @Override // p149l.eci0, p149l.at2
    /* JADX INFO: renamed from: j */
    public void mo98698j() {
        super.mo98698j();
        if (this.f137077R) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f137085Z;
            this.f137083X += jCurrentTimeMillis;
            this.f137084Y += jCurrentTimeMillis;
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m157831j1(amw amwVar) {
        this.f137075P = amwVar;
    }

    /* JADX INFO: renamed from: k1 */
    public void m157832k1(int i) {
        this.f137076Q = i;
    }

    @Override // p149l.ddc0, p149l.at2
    /* JADX INFO: renamed from: l */
    public void mo98700l(Message message) {
        super.mo98700l(message);
        switch (message.what) {
            case 16:
                m157809T0((Message) message.obj);
                break;
            case 17:
                Object obj = message.obj;
                if (obj == null) {
                    return;
                } else {
                    m157820W0((Object[]) obj);
                }
                break;
            case 18:
                Object obj2 = message.obj;
                if (obj2 != null) {
                    m157821Y0((tnr) obj2);
                }
                break;
            case 19:
                Object obj3 = message.obj;
                if (obj3 != null) {
                    m157822Z0(obj3);
                }
                break;
            case 20:
                Object obj4 = message.obj;
                if (obj4 == null) {
                    return;
                } else {
                    m157819R0(obj4);
                }
                break;
            case 21:
                m157808S0();
                break;
            case 22:
                m157811V0(message.arg1);
                break;
        }
        snr snrVar = this.f90521t;
        if (snrVar != null) {
            snrVar.mo123489a(message);
        }
    }

    /* JADX INFO: renamed from: l1 */
    public void m157833l1(rmw rmwVar) {
        this.f137073N = rmwVar;
        i5e0 i5e0Var = this.f137086k0;
        if (i5e0Var != null) {
            i5e0Var.m134472R(rmwVar);
        }
    }

    @Override // p149l.eci0, p149l.at2
    /* JADX INFO: renamed from: m */
    public void mo98701m() {
        m157814p1();
        if (this.f90521t != null) {
            Message message = new Message();
            message.what = 265;
            this.f90521t.mo123489a(message);
        }
        super.mo98701m();
        int i = this.f137081V;
        if (i != -1) {
            qie.m174867h(i);
            this.f137081V = -1;
        }
        this.f137082W = null;
        this.f137087p0 = null;
        this.f137086k0 = null;
        this.f137072M = null;
        this.f137073N = null;
        f137058H0 = null;
    }

    /* JADX INFO: renamed from: m1 */
    public void m157834m1(qmw qmwVar) {
        this.f137074O = qmwVar;
        i5e0 i5e0Var = this.f137086k0;
        if (i5e0Var != null) {
            i5e0Var.m134473S(qmwVar);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void m157835n1(boolean z) {
        this.f137077R = z;
    }

    /* JADX INFO: renamed from: o1 */
    public void m157836o1(tnr tnrVar) {
        this.f137072M = tnrVar;
        m115715q0(18, tnrVar);
    }

    /* JADX INFO: renamed from: q1 */
    public void m157837q1(String str, int i, int i2, int i3, int i4, int i5, boolean z) {
        m115716r0(17, new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Boolean.valueOf(z)});
    }

    /* JADX INFO: renamed from: r1 */
    public void m157838r1(byte[] bArr, int i) {
        xsm xsmVar = this.f137059C;
        if (xsmVar == null || bArr == null) {
            return;
        }
        xsmVar.m210800C(bArr, i);
        if (!this.f137077R) {
            super.m111002I0();
        } else {
            if (this.f137080U) {
                return;
            }
            m157813h1(0);
            this.f137080U = true;
        }
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: u */
    public void mo98709u() {
        super.mo98709u();
        if (this.f137077R) {
            m157814p1();
        }
    }
}
