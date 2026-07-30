package p153l;

import android.opengl.EGLContext;
import android.os.Message;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes7.dex */
public class v5c extends klc0 {

    /* JADX INFO: renamed from: H0 */
    private static EGLContext f182496H0;

    /* JADX INFO: renamed from: C */
    zum f182497C;

    /* JADX INFO: renamed from: D */
    private Object f182498D;

    /* JADX INFO: renamed from: E */
    private Object f182499E;

    /* JADX INFO: renamed from: E0 */
    private mc5 f182500E0;

    /* JADX INFO: renamed from: F */
    private int f182501F;

    /* JADX INFO: renamed from: F0 */
    private final int f182502F0;

    /* JADX INFO: renamed from: G */
    private final int f182503G;

    /* JADX INFO: renamed from: G0 */
    private final int f182504G0;

    /* JADX INFO: renamed from: H */
    private final int f182505H;

    /* JADX INFO: renamed from: I */
    private final int f182506I;

    /* JADX INFO: renamed from: J */
    private final int f182507J;

    /* JADX INFO: renamed from: K */
    private final int f182508K;

    /* JADX INFO: renamed from: L */
    private final int f182509L;

    /* JADX INFO: renamed from: M */
    private upr f182510M;

    /* JADX INFO: renamed from: N */
    private qpw f182511N;

    /* JADX INFO: renamed from: O */
    private ppw f182512O;

    /* JADX INFO: renamed from: P */
    private zow f182513P;

    /* JADX INFO: renamed from: Q */
    private int f182514Q;

    /* JADX INFO: renamed from: R */
    private boolean f182515R;

    /* JADX INFO: renamed from: S */
    private int f182516S;

    /* JADX INFO: renamed from: T */
    private Timer f182517T;

    /* JADX INFO: renamed from: U */
    private boolean f182518U;

    /* JADX INFO: renamed from: V */
    private int f182519V;

    /* JADX INFO: renamed from: W */
    ppr f182520W;

    /* JADX INFO: renamed from: X */
    private long f182521X;

    /* JADX INFO: renamed from: Y */
    private long f182522Y;

    /* JADX INFO: renamed from: Z */
    private long f182523Z;

    /* JADX INFO: renamed from: k0 */
    private mde0 f182524k0;

    /* JADX INFO: renamed from: p0 */
    private mc5 f182525p0;

    /* JADX INFO: renamed from: l.v5c$a */
    public class C20763a extends TimerTask {
        public C20763a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            v5c.this.m199808X0();
        }
    }

    public v5c(String str) {
        super(str);
        this.f182498D = new Object();
        this.f182499E = new Object();
        this.f182501F = 0;
        this.f182503G = 16;
        this.f182505H = 17;
        this.f182506I = 18;
        this.f182507J = 19;
        this.f182508K = 20;
        this.f182509L = 21;
        this.f182510M = null;
        this.f182514Q = 0;
        this.f182515R = false;
        this.f182516S = 40;
        this.f182517T = null;
        this.f182518U = false;
        this.f182519V = -1;
        this.f182520W = null;
        this.f182521X = 0L;
        this.f182522Y = 0L;
        this.f182523Z = 0L;
        this.f182524k0 = null;
        this.f182525p0 = null;
        this.f182500E0 = null;
        this.f182502F0 = 0;
        this.f182504G0 = 1;
    }

    /* JADX INFO: renamed from: P0 */
    public static v5c m199802P0(String str, EGLContext eGLContext) {
        f182496H0 = eGLContext;
        return new v5c(str);
    }

    /* JADX INFO: renamed from: Q0 */
    private void m199803Q0() {
        if (this.f182517T == null) {
            this.f182517T = new Timer();
        }
    }

    /* JADX INFO: renamed from: S0 */
    private void m199804S0() {
        int i = this.f182519V;
        if (i != -1) {
            uje.m196322h(i);
            this.f182519V = -1;
        }
        int iM196321d = uje.m196321d();
        this.f182519V = iM196321d;
        this.f182497C.m221671v(iM196321d);
    }

    /* JADX INFO: renamed from: T0 */
    private void m199805T0(Message message) {
        ppr pprVar = this.f182520W;
        if (pprVar != null) {
            pprVar.mo167017a(message);
        }
    }

    /* JADX INFO: renamed from: U0 */
    private void m199806U0() {
        int i;
        if (this.f182518U) {
            m199803Q0();
        }
        if (this.f182521X == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f182521X = jCurrentTimeMillis;
            i = this.f182516S;
            this.f182522Y = jCurrentTimeMillis + ((long) i);
        } else {
            this.f182522Y += (long) this.f182516S;
            long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f182522Y;
            i = jCurrentTimeMillis2 >= 0 ? 0 : (int) (jCurrentTimeMillis2 * (-1));
        }
        m199809h1(i);
    }

    /* JADX INFO: renamed from: V0 */
    private void m199807V0(int i) {
        zum zumVar = this.f182497C;
        if (zumVar != null) {
            zumVar.m221667A(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public void m199808X0() {
        super.m150363I0();
    }

    /* JADX INFO: renamed from: h1 */
    private void m199809h1(int i) {
        Timer timer = this.f182517T;
        if (timer != null) {
            timer.schedule(new C20763a(), i);
        } else {
            super.m150363I0();
        }
    }

    /* JADX INFO: renamed from: p1 */
    private void m199810p1() {
        Timer timer = this.f182517T;
        if (timer != null) {
            timer.cancel();
            this.f182517T = null;
        }
    }

    @Override // p153l.klc0
    /* JADX INFO: renamed from: G0 */
    public void mo150361G0(boolean z) {
        zum zumVar = this.f182497C;
        if (zumVar != null) {
            zumVar.m221673x(z);
        }
    }

    @Override // p153l.klc0
    /* JADX INFO: renamed from: H0 */
    public void mo150362H0(int i) {
        zum zumVar = this.f182497C;
        if (zumVar != null) {
            zumVar.m221672w(i);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m199811L0(Object obj, int i, int i2) {
        mc5 mc5Var = new mc5();
        this.f182525p0 = mc5Var;
        mc5Var.mo172261z(i, i2);
        this.f182525p0.m157911R(this.f182510M);
        m121181A0(obj, this.f182525p0);
    }

    /* JADX INFO: renamed from: M0 */
    public void m199812M0(Object obj, int i, int i2) {
        mc5 mc5Var = new mc5();
        this.f182500E0 = mc5Var;
        mc5Var.mo172261z(i, i2);
        this.f182500E0.m157911R(this.f182510M);
        m121184D0(obj, this.f182500E0);
    }

    /* JADX INFO: renamed from: N0 */
    public void m199813N0(Object obj, boolean z) {
        mde0 mde0Var = new mde0();
        this.f182524k0 = mde0Var;
        mde0Var.m155492Q(!z);
        this.f182524k0.m157974R(this.f182511N);
        this.f182524k0.m157975S(this.f182512O);
        m121185E0(obj, this.f182524k0);
    }

    /* JADX INFO: renamed from: O0 */
    public void m199814O0(boolean z) {
        this.f182524k0.m155492Q(!z);
    }

    /* JADX INFO: renamed from: R0 */
    public void m199815R0(Object obj) {
        Map<Object, kt2> map;
        Object objMo96763j0;
        mc5 mc5Var = new mc5();
        this.f182525p0 = mc5Var;
        mc5Var.m157911R(this.f182510M);
        if (obj == null || this.f182525p0 == null || (map = this.f94541h) == null || this.f94542i == null) {
            return;
        }
        kt2 kt2Var = map.get(obj);
        if (kt2Var != null) {
            zum zumVar = this.f182497C;
            if (zumVar != null) {
                zumVar.m104836r(kt2Var);
            }
            kt2Var.mo96080f();
        }
        uje ujeVar = this.f94542i.get(obj);
        if (ujeVar == null) {
            ujeVar = new uje();
            if (obj instanceof v5c) {
                v5c v5cVar = (v5c) obj;
                objMo96763j0 = v5cVar.mo96763j0();
                v5cVar.m121221w0(ujeVar);
            } else {
                objMo96763j0 = obj;
            }
            try {
                uje ujeVar2 = this.f94544k;
                ujeVar.m196325c(ujeVar2 == null ? null : ujeVar2.f179207c, objMo96763j0);
            } catch (Exception e) {
                MDLog.m7445e(MDLogTag.MOMENT_RENDER_TAG, "Create egl devices failed ! Add Target failed !");
                MDLog.printErrStackTrace(MDLogTag.MOMENT_RENDER_TAG, e);
                if (obj instanceof eli0) {
                    this.f94540g.remove(eli0.f94536x);
                }
                spr sprVar = this.f159378d;
                if (sprVar != null) {
                    sprVar.mo167015e(MDLogTag.MOMENT_RENDER_TAG, 1, "Create target Egl device has exception !");
                    return;
                }
                return;
            }
        }
        mc5 mc5Var2 = this.f182525p0;
        if (mc5Var2 != null) {
            mc5Var2.mo133080a(ujeVar, this.f94544k);
        }
        zum zumVar2 = this.f182497C;
        if (zumVar2 != null) {
            zumVar2.m221669t(this.f182525p0);
        }
        this.f94541h.put(obj, this.f182525p0);
        this.f94542i.put(obj, ujeVar);
    }

    /* JADX INFO: renamed from: W0 */
    public void m199816W0(Object[] objArr) {
        String str = (String) objArr[0];
        int iIntValue = ((Integer) objArr[1]).intValue();
        int iIntValue2 = ((Integer) objArr[2]).intValue();
        int iIntValue3 = ((Integer) objArr[3]).intValue();
        int iIntValue4 = ((Integer) objArr[4]).intValue();
        int iIntValue5 = ((Integer) objArr[5]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[6]).booleanValue();
        mde0 mde0Var = this.f182524k0;
        if (mde0Var != null) {
            mde0Var.m157976T(str, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, zBooleanValue);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m199817Y0(upr uprVar) {
        this.f182510M = uprVar;
        mc5 mc5Var = this.f182525p0;
        if (mc5Var != null) {
            mc5Var.m157911R(uprVar);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public void m199818Z0(Object obj) {
        mde0 mde0Var = this.f182524k0;
        if (mde0Var == null || obj == null) {
            return;
        }
        if (obj instanceof ppw) {
            mde0Var.m157975S((ppw) obj);
            return;
        }
        if (obj instanceof qpw) {
            mde0Var.m157974R((qpw) obj);
            return;
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            if (iIntValue == 1) {
                this.f182524k0.m157975S(null);
            } else if (iIntValue == 0) {
                this.f182524k0.m157974R(null);
            }
        }
    }

    /* JADX INFO: renamed from: a1 */
    public boolean m199819a1() {
        zum zumVar = this.f182497C;
        if (zumVar == null) {
            return false;
        }
        return zumVar.m221670u();
    }

    /* JADX INFO: renamed from: b1 */
    public void m199820b1(Object obj) {
        m121212q0(20, obj);
    }

    /* JADX INFO: renamed from: c1 */
    public void m199821c1() {
        m121210o0(21);
    }

    /* JADX INFO: renamed from: d1 */
    public void m199822d1(int i) {
        m121211p0(22, i);
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: e */
    public void mo177864e(omq0.C19167a c19167a) {
        zum zumVar = this.f182497C;
        if (zumVar == null || c19167a == null) {
            return;
        }
        zumVar.m221675z(c19167a.f147988a, c19167a.f147989b, c19167a.f147990c, c19167a.f147991d, c19167a.f147992e, c19167a.f147993f);
    }

    /* JADX INFO: renamed from: e1 */
    public void m199823e1(Message message) {
        m121212q0(16, message);
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: f */
    public void mo96761f() {
        if (this.f182497C == null) {
            zum zumVar = new zum();
            this.f182497C = zumVar;
            zumVar.m221674y(this.f182514Q);
            this.f127363B = this.f182497C;
        }
    }

    @Override // p153l.eli0
    /* JADX INFO: renamed from: f0 */
    public void mo121197f0() {
        int i;
        zow zowVar = this.f182513P;
        if (zowVar == null || (i = this.f182519V) == -1) {
            return;
        }
        zowVar.mo167020a(i);
    }

    /* JADX INFO: renamed from: f1 */
    public void m199824f1(Object obj) {
        mo121207n(obj, eli0.f94536x);
    }

    @Override // p153l.eli0, p153l.qt2
    /* JADX INFO: renamed from: g */
    public void mo121198g() {
        if (this.f94544k == null) {
            uje ujeVar = new uje();
            this.f94544k = ujeVar;
            ujeVar.m196324b(f182496H0);
            this.f94544k.m196327f();
        }
    }

    @Override // p153l.eli0
    /* JADX INFO: renamed from: g0 */
    public void mo121199g0() {
        super.mo121199g0();
        if (this.f182515R) {
            m199806U0();
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m199825g1(Object obj) {
        mo121207n(obj, eli0.f94535A);
    }

    @Override // p153l.eli0, p153l.qt2
    /* JADX INFO: renamed from: i */
    public void mo121201i() {
        super.mo121201i();
        this.f182523Z = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: i1 */
    public void m199826i1(ppr pprVar) {
        this.f182520W = pprVar;
    }

    @Override // p153l.eli0, p153l.qt2
    /* JADX INFO: renamed from: j */
    public void mo121202j() {
        super.mo121202j();
        if (this.f182515R) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f182523Z;
            this.f182521X += jCurrentTimeMillis;
            this.f182522Y += jCurrentTimeMillis;
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m199827j1(zow zowVar) {
        this.f182513P = zowVar;
    }

    /* JADX INFO: renamed from: k1 */
    public void m199828k1(int i) {
        this.f182514Q = i;
    }

    @Override // p153l.klc0, p153l.qt2
    /* JADX INFO: renamed from: l */
    public void mo96764l(Message message) {
        super.mo96764l(message);
        switch (message.what) {
            case 16:
                m199805T0((Message) message.obj);
                break;
            case 17:
                Object obj = message.obj;
                if (obj == null) {
                    return;
                } else {
                    m199816W0((Object[]) obj);
                }
                break;
            case 18:
                Object obj2 = message.obj;
                if (obj2 != null) {
                    m199817Y0((upr) obj2);
                }
                break;
            case 19:
                Object obj3 = message.obj;
                if (obj3 != null) {
                    m199818Z0(obj3);
                }
                break;
            case 20:
                Object obj4 = message.obj;
                if (obj4 == null) {
                    return;
                } else {
                    m199815R0(obj4);
                }
                break;
            case 21:
                m199804S0();
                break;
            case 22:
                m199807V0(message.arg1);
                break;
        }
        tpr tprVar = this.f94553t;
        if (tprVar != null) {
            tprVar.mo161502a(message);
        }
    }

    /* JADX INFO: renamed from: l1 */
    public void m199829l1(qpw qpwVar) {
        this.f182511N = qpwVar;
        mde0 mde0Var = this.f182524k0;
        if (mde0Var != null) {
            mde0Var.m157974R(qpwVar);
        }
    }

    @Override // p153l.eli0, p153l.qt2
    /* JADX INFO: renamed from: m */
    public void mo96765m() {
        m199810p1();
        if (this.f94553t != null) {
            Message message = new Message();
            message.what = 265;
            this.f94553t.mo161502a(message);
        }
        super.mo96765m();
        int i = this.f182519V;
        if (i != -1) {
            uje.m196322h(i);
            this.f182519V = -1;
        }
        this.f182520W = null;
        this.f182525p0 = null;
        this.f182524k0 = null;
        this.f182510M = null;
        this.f182511N = null;
        f182496H0 = null;
    }

    /* JADX INFO: renamed from: m1 */
    public void m199830m1(ppw ppwVar) {
        this.f182512O = ppwVar;
        mde0 mde0Var = this.f182524k0;
        if (mde0Var != null) {
            mde0Var.m157975S(ppwVar);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void m199831n1(boolean z) {
        this.f182515R = z;
    }

    /* JADX INFO: renamed from: o1 */
    public void m199832o1(upr uprVar) {
        this.f182510M = uprVar;
        m121212q0(18, uprVar);
    }

    /* JADX INFO: renamed from: q1 */
    public void m199833q1(String str, int i, int i2, int i3, int i4, int i5, boolean z) {
        m121213r0(17, new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Boolean.valueOf(z)});
    }

    /* JADX INFO: renamed from: r1 */
    public void m199834r1(byte[] bArr, int i) {
        zum zumVar = this.f182497C;
        if (zumVar == null || bArr == null) {
            return;
        }
        zumVar.m221668C(bArr, i);
        if (!this.f182515R) {
            super.m150363I0();
        } else {
            if (this.f182518U) {
                return;
            }
            m199809h1(0);
            this.f182518U = true;
        }
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: u */
    public void mo96767u() {
        super.mo96767u();
        if (this.f182515R) {
            m199810p1();
        }
    }
}
