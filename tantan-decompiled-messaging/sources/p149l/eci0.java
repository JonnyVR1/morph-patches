package p149l;

import android.opengl.EGLContext;
import android.os.Message;
import com.core.glcore.util.ErrorCode;
import com.cosmos.mdlog.MDLog;
import com.immomo.components.interfaces.IProcessOutput;
import com.momo.mcamera.util.MDLogTag;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class eci0 extends at2 {

    /* JADX INFO: renamed from: A */
    public static int f90503A = 4;

    /* JADX INFO: renamed from: x */
    public static int f90504x = 1;

    /* JADX INFO: renamed from: y */
    public static int f90505y = 2;

    /* JADX INFO: renamed from: z */
    public static int f90506z = 3;

    /* JADX INFO: renamed from: f */
    private String f90507f;

    /* JADX INFO: renamed from: g */
    protected List<eci0> f90508g;

    /* JADX INFO: renamed from: h */
    protected Map<Object, us2> f90509h;

    /* JADX INFO: renamed from: i */
    protected Map<Object, qie> f90510i;

    /* JADX INFO: renamed from: j */
    protected LinkedList<IProcessOutput> f90511j;

    /* JADX INFO: renamed from: k */
    protected qie f90512k;

    /* JADX INFO: renamed from: l */
    private qie f90513l;

    /* JADX INFO: renamed from: m */
    yhm f90514m;

    /* JADX INFO: renamed from: n */
    private IProcessOutput f90515n;

    /* JADX INFO: renamed from: o */
    private volatile boolean f90516o;

    /* JADX INFO: renamed from: p */
    private kdq0 f90517p;

    /* JADX INFO: renamed from: q */
    public qnr f90518q;

    /* JADX INFO: renamed from: r */
    public pnr f90519r;

    /* JADX INFO: renamed from: s */
    private long f90520s;

    /* JADX INFO: renamed from: t */
    protected snr f90521t;

    /* JADX INFO: renamed from: u */
    public boolean f90522u;

    /* JADX INFO: renamed from: v */
    private tmw f90523v;

    /* JADX INFO: renamed from: w */
    private ByteBuffer f90524w;

    /* JADX INFO: renamed from: l.eci0$a */
    public class C16573a implements kdq0.InterfaceC17989a {
        public C16573a() {
        }

        @Override // p149l.kdq0.InterfaceC17989a
        /* JADX INFO: renamed from: a */
        public void mo115724a(ByteBuffer byteBuffer, long j) {
            if (eci0.this.f90524w == null) {
                eci0.this.f90524w = ByteBuffer.allocate(byteBuffer.capacity());
            }
            eci0.this.f90524w.position(0);
            byteBuffer.position(0);
            byteBuffer.get(eci0.this.f90524w.array());
            eci0 eci0Var = eci0.this;
            eci0Var.f90519r.mo123488a(eci0Var.f90524w, eci0.this.f90524w.limit(), eci0.this.f90520s * 1000);
        }
    }

    public eci0(String str) {
        super(str);
        this.f90507f = "TargetRenderThread";
        this.f90508g = new ArrayList();
        this.f90509h = new HashMap();
        this.f90510i = new HashMap();
        this.f90511j = new LinkedList<>();
        this.f90516o = false;
        this.f90517p = null;
        this.f90518q = null;
        this.f90519r = null;
        this.f90520s = -1L;
        this.f90522u = false;
    }

    /* JADX INFO: renamed from: d0 */
    private void m115692d0() {
        kdq0 kdq0Var = this.f90517p;
        if (kdq0Var != null) {
            this.f90514m.m214839r(kdq0Var);
            this.f90517p.mo102038f();
        }
        kdq0 kdq0Var2 = new kdq0();
        this.f90517p = kdq0Var2;
        kdq0Var2.f122601D = new C16573a();
        yhm yhmVar = this.f90514m;
        if (yhmVar != null) {
            yhmVar.m214832h(this.f90517p);
        }
    }

    /* JADX INFO: renamed from: i0 */
    private void m115693i0() {
        this.f90516o = true;
    }

    /* JADX INFO: renamed from: A0 */
    public void m115694A0(Object obj, us2 us2Var) {
        m115695B0(obj, f90504x, us2Var);
    }

    /* JADX INFO: renamed from: B0 */
    public void m115695B0(Object obj, int i, us2 us2Var) {
        m98683Q(new Object[]{obj, Integer.valueOf(i), us2Var});
    }

    /* JADX INFO: renamed from: C0 */
    public void m115696C0(yhm yhmVar) {
        this.f90514m = yhmVar;
    }

    /* JADX INFO: renamed from: D0 */
    public void m115697D0(Object obj, us2 us2Var) {
        m115695B0(obj, f90503A, us2Var);
    }

    /* JADX INFO: renamed from: E0 */
    public void m115698E0(Object obj, us2 us2Var) {
        m115695B0(obj, f90505y, us2Var);
    }

    /* JADX INFO: renamed from: F0 */
    public void m115699F0(long j) {
        this.f90520s = j;
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: G */
    public void mo98673G() {
        m115693i0();
        super.mo98673G();
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: P */
    public void mo98682P() {
        m115693i0();
        Iterator<eci0> it = this.f90508g.iterator();
        while (it.hasNext()) {
            it.next().mo98682P();
        }
        super.mo98682P();
    }

    /* JADX INFO: renamed from: Z */
    public void m115700Z(Object obj) {
        m115702b0(obj, f90504x);
    }

    /* JADX INFO: renamed from: a0 */
    public void m115701a0(Object obj) {
        m115702b0(obj, f90505y);
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: b */
    public void mo98690b(us2 us2Var) {
        yhm yhmVar;
        super.mo98690b(us2Var);
        if (us2Var == null || (yhmVar = this.f90514m) == null) {
            return;
        }
        yhmVar.m214828a(us2Var);
        MDLog.m7395i(MDLogTag.MOMENT_RENDER_TAG, "handle add filter to destory " + us2Var.toString());
    }

    /* JADX INFO: renamed from: b0 */
    public void m115702b0(Object obj, int i) {
        m115703c0(obj, i, true);
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: c */
    public void mo98691c(Object obj, int i, boolean z) {
        Object objMo115708j0;
        MDLog.m7395i(MDLogTag.MOMENT_RENDER_TAG, "handleAddTarget !!!");
        if (i == f90506z) {
            m115692d0();
            return;
        }
        mo98703o(obj);
        qie qieVar = new qie();
        boolean z2 = obj instanceof eci0;
        if (z2) {
            eci0 eci0Var = (eci0) obj;
            objMo115708j0 = eci0Var.mo115708j0();
            if (objMo115708j0 == null) {
                MDLog.m7391e(MDLogTag.MOMENT_RENDER_TAG, "Get TargetRenderThread input surface is null");
                rnr rnrVar = this.f71529d;
                if (rnrVar != null) {
                    rnrVar.mo168079e(this.f90507f, 1, "Get target input surfae is null !");
                    tmw tmwVar = this.f90523v;
                    if (tmwVar != null) {
                        tmwVar.onFail(7001, "Get target input surfae is null !");
                        return;
                    }
                    return;
                }
                return;
            }
            eci0Var.m115721w0(qieVar);
            this.f90508g.add(eci0Var);
        } else {
            objMo115708j0 = obj;
        }
        try {
            int i2 = f90504x;
            qie qieVar2 = this.f90512k;
            EGLContext eGLContext = null;
            if (i == i2) {
                qieVar.m174870c(qieVar2 != null ? qieVar2.f154758c : null, objMo115708j0);
            } else {
                if (qieVar2 != null) {
                    eGLContext = qieVar2.f154758c;
                }
                qieVar.m174871e(eGLContext, objMo115708j0);
            }
            this.f90510i.put(obj, qieVar);
            if (z) {
                lhi0 lhi0Var = new lhi0();
                lhi0Var.mo103527a(qieVar, this.f90512k);
                yhm yhmVar = this.f90514m;
                if (yhmVar != null) {
                    yhmVar.m214832h(lhi0Var);
                }
                this.f90509h.put(obj, lhi0Var);
            }
        } catch (Exception e) {
            MDLog.m7391e(MDLogTag.MOMENT_RENDER_TAG, "Create egl devices failed ! Add Target failed !");
            MDLog.printErrStackTrace(MDLogTag.MOMENT_RENDER_TAG, e);
            if (z2) {
                this.f90508g.remove(obj);
            }
            rnr rnrVar2 = this.f71529d;
            if (rnrVar2 != null) {
                rnrVar2.mo168079e(this.f90507f, 1, "Create target Egl device has exception !");
            }
            tmw tmwVar2 = this.f90523v;
            if (tmwVar2 != null) {
                tmwVar2.onFail(7001, "Create target Egl device has exception !" + e.toString());
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m115703c0(Object obj, int i, boolean z) {
        if (obj != null) {
            m98667A(new Object[]{obj, Integer.valueOf(i), Boolean.valueOf(z)});
        }
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: d */
    public void mo98692d() {
        MDLog.m7395i(MDLogTag.MOMENT_RENDER_TAG, "Handle clear all target !");
        super.mo98692d();
        for (qie qieVar : this.f90510i.values()) {
            if (qieVar != null) {
                qieVar.m174873g();
            }
        }
        kdq0 kdq0Var = this.f90517p;
        if (kdq0Var != null) {
            this.f90514m.m214839r(kdq0Var);
            this.f90517p.mo102038f();
            this.f90517p = null;
        }
        this.f90510i.clear();
        for (us2 us2Var : this.f90509h.values()) {
            this.f90514m.m214839r(us2Var);
            us2Var.mo102038f();
        }
        this.f90509h.clear();
        Iterator<eci0> it = this.f90508g.iterator();
        while (it.hasNext()) {
            it.next().mo98673G();
        }
        this.f90508g.clear();
    }

    /* JADX INFO: renamed from: e0 */
    public void m115704e0() {
        m115702b0(this, f90506z);
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: g */
    public void mo98695g() {
        MDLog.m7395i(MDLogTag.MOMENT_RENDER_TAG, "handleInitDumyScreen !!!");
        if (this.f90512k == null) {
            qie qieVar = new qie();
            this.f90512k = qieVar;
            qieVar.m174868a();
            this.f90512k.m174872f();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void mo115706g0() {
        qnr qnrVar = this.f90518q;
        if (qnrVar != null) {
            qnrVar.mo123490a();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m115707h0() {
        Object objMo123491b;
        yhm yhmVar;
        qnr qnrVar = this.f90518q;
        if (qnrVar == null || (objMo123491b = qnrVar.mo123491b()) == null || (yhmVar = this.f90514m) == null) {
            return;
        }
        yhmVar.m214840s((IProcessOutput) objMo123491b);
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: i */
    public void mo98697i() {
        snr snrVar = this.f90521t;
        if (snrVar != null) {
            snrVar.onPause();
        }
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: j */
    public void mo98698j() {
        snr snrVar = this.f90521t;
        if (snrVar != null) {
            snrVar.onResume();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public Object mo115708j0() {
        return null;
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: k */
    public void mo98699k() {
        if (this.f90511j.size() > 0) {
            this.f90515n = this.f90511j.pollFirst();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m115709k0(drc0 drc0Var) {
        tif0 tif0VarM113293a = drc0Var.m113293a();
        us2 us2Var = this.f90509h.get(drc0Var.m113294b());
        if (us2Var != null) {
            MDLog.m7395i(MDLogTag.MOMENT_RENDER_TAG, "input render filterSize  = " + tif0VarM113293a.m189184b());
            us2Var.mo110713z(tif0VarM113293a.m189184b(), tif0VarM113293a.m189183a());
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m115710l0(tif0 tif0Var) {
        kdq0 kdq0Var = this.f90517p;
        if (kdq0Var != null) {
            kdq0Var.mo110713z(tif0Var.m189184b(), tif0Var.m189183a());
        }
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: m */
    public void mo98701m() {
        MDLog.m7395i(MDLogTag.MOMENT_RENDER_TAG, "handleReleaseAll !!!");
        super.mo98701m();
        yhm yhmVar = this.f90514m;
        if (yhmVar != null) {
            yhmVar.mo177603i();
            this.f90514m = null;
        }
        for (qie qieVar : this.f90510i.values()) {
            if (qieVar != null) {
                qieVar.m174873g();
            }
        }
        this.f90510i.clear();
        kdq0 kdq0Var = this.f90517p;
        if (kdq0Var != null) {
            kdq0Var.mo102038f();
            this.f90517p = null;
        }
        Iterator<us2> it = this.f90509h.values().iterator();
        while (it.hasNext()) {
            it.next().mo102038f();
        }
        this.f90509h.clear();
        Iterator<eci0> it2 = this.f90508g.iterator();
        while (it2.hasNext()) {
            it2.next().mo98673G();
        }
        this.f90508g.clear();
        qie qieVar2 = this.f90512k;
        if (qieVar2 != null) {
            qieVar2.m174873g();
            this.f90512k = null;
        }
        m98689a();
        m98687U();
    }

    /* JADX INFO: renamed from: m0 */
    public void m115711m0(int i) {
        m115713o0(i);
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: n */
    public void mo98702n(Object obj, int i) {
        us2 us2Var = this.f90509h.get(obj);
        if (us2Var != null) {
            if (i == f90504x) {
                this.f90514m.m214839r(us2Var);
            }
            if (i == f90503A) {
                this.f90514m.m214838q(us2Var);
            }
            us2Var.mo102038f();
            this.f90509h.remove(obj);
        }
        qie qieVar = this.f90510i.get(obj);
        if (qieVar != null) {
            qieVar.m174873g();
            this.f90510i.remove(obj);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m115712n0(int i, Object obj) {
        m115715q0(i, obj);
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: o */
    public void mo98703o(Object obj) {
        MDLog.m7395i(MDLogTag.MOMENT_RENDER_TAG, "handleRemoveTarget");
        if (obj instanceof eci0) {
            this.f90508g.remove(obj);
        }
        us2 us2Var = this.f90509h.get(obj);
        if (us2Var != null) {
            this.f90514m.m214839r(us2Var);
            us2Var.mo102038f();
            this.f90509h.remove(obj);
        }
        qie qieVar = this.f90510i.get(obj);
        if (qieVar != null) {
            qieVar.m174873g();
            this.f90510i.remove(obj);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m115713o0(int i) {
        Message message = new Message();
        message.what = i;
        m98677K(message);
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: p */
    public void mo98704p() {
        m115707h0();
        try {
            if (this.f90512k != null && !this.f90516o) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = this.f90520s;
                if (j >= 0) {
                    jCurrentTimeMillis = j;
                }
                this.f90514m.m214837p(jCurrentTimeMillis);
                this.f90512k.m174872f();
                mo115705f0();
                this.f90514m.m214829c();
            }
        } catch (Exception e) {
            MDLog.m7391e(MDLogTag.MOMENT_RENDER_TAG, "Rending Target Error !!!" + e.toString());
            tmw tmwVar = this.f90523v;
            if (tmwVar != null) {
                tmwVar.onFail(ErrorCode.RENDER_TARGET_FAILED, "Rending Target Error !!!" + e.toString());
            }
        }
        mo115706g0();
    }

    /* JADX INFO: renamed from: p0 */
    public void m115714p0(int i, int i2) {
        Message message = new Message();
        message.what = i;
        message.arg1 = i2;
        m98677K(message);
    }

    /* JADX INFO: renamed from: q0 */
    public void m115715q0(int i, Object obj) {
        Message message = new Message();
        message.what = i;
        message.obj = obj;
        m98677K(message);
    }

    /* JADX INFO: renamed from: r0 */
    public void m115716r0(int i, Object obj) {
        Message message = new Message();
        message.what = i;
        message.obj = obj;
        m98677K(message);
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: s */
    public void mo98707s() {
        MDLog.m7395i(MDLogTag.MOMENT_RENDER_TAG, "handleStartRender !!!");
        this.f90516o = false;
        for (us2 us2Var : this.f90509h.values()) {
            yhm yhmVar = this.f90514m;
            if (yhmVar != null) {
                yhmVar.m214832h(us2Var);
            }
        }
        kdq0 kdq0Var = this.f90517p;
        if (kdq0Var != null) {
            this.f90514m.m214832h(kdq0Var);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m115717s0() {
        m98675I();
    }

    /* JADX INFO: renamed from: t0 */
    public void m115718t0(tmw tmwVar) {
        this.f90523v = tmwVar;
    }

    /* JADX INFO: renamed from: u0 */
    public void m115719u0(qnr qnrVar) {
        this.f90518q = qnrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.at2
    /* JADX INFO: renamed from: v */
    public void mo98710v(Object obj, int i, us2 us2Var) {
        Map<Object, us2> map;
        Object objMo115708j0;
        MDLog.m7395i(MDLogTag.MOMENT_RENDER_TAG, "handle update end point filter !!!");
        if (obj == null || us2Var == 0 || (map = this.f90509h) == null || this.f90510i == null) {
            return;
        }
        us2 us2Var2 = map.get(obj);
        if (us2Var2 != null) {
            yhm yhmVar = this.f90514m;
            if (yhmVar != null) {
                yhmVar.m214839r(us2Var2);
            }
            us2Var2.mo102038f();
        }
        qie qieVar = this.f90510i.get(obj);
        if (qieVar == null) {
            qieVar = new qie();
            boolean z = obj instanceof eci0;
            if (z) {
                eci0 eci0Var = (eci0) obj;
                objMo115708j0 = eci0Var.mo115708j0();
                eci0Var.m115721w0(qieVar);
            } else {
                objMo115708j0 = obj;
            }
            try {
                EGLContext eGLContext = null;
                if (i == f90504x || i == f90503A) {
                    qie qieVar2 = this.f90512k;
                    if (qieVar2 != null) {
                        eGLContext = qieVar2.f154758c;
                    }
                    qieVar.m174870c(eGLContext, objMo115708j0);
                } else {
                    qie qieVar3 = this.f90512k;
                    if (qieVar3 != null) {
                        eGLContext = qieVar3.f154758c;
                    }
                    qieVar.m174871e(eGLContext, objMo115708j0);
                }
            } catch (Exception e) {
                MDLog.m7391e(MDLogTag.MOMENT_RENDER_TAG, "Create egl devices failed ! Add Target failed !");
                MDLog.printErrStackTrace(MDLogTag.MOMENT_RENDER_TAG, e);
                if (z) {
                    this.f90508g.remove(i);
                }
                rnr rnrVar = this.f71529d;
                if (rnrVar != null) {
                    rnrVar.mo168079e(this.f90507f, 1, "Create target Egl device has exception !");
                    return;
                }
                return;
            }
        }
        if (us2Var instanceof brc0) {
            ((brc0) us2Var).mo103527a(qieVar, this.f90512k);
        }
        yhm yhmVar2 = this.f90514m;
        if (yhmVar2 != null) {
            if (i == f90504x) {
                yhmVar2.m214832h(us2Var);
            }
            if (i == f90503A) {
                this.f90514m.m214831g(us2Var);
            }
        }
        this.f90509h.put(obj, us2Var);
        this.f90510i.put(obj, qieVar);
    }

    /* JADX INFO: renamed from: v0 */
    public void m115720v0(pnr pnrVar) {
        this.f90519r = pnrVar;
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: w */
    public void mo98711w(Object obj) {
        super.mo98711w(obj);
        IProcessOutput iProcessOutput = (IProcessOutput) obj;
        Iterator<eci0> it = this.f90508g.iterator();
        while (it.hasNext()) {
            it.next().m98672F(iProcessOutput);
        }
        this.f90511j.addLast(iProcessOutput);
    }

    /* JADX INFO: renamed from: w0 */
    public void m115721w0(qie qieVar) {
        this.f90513l = qieVar;
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: x */
    public void mo98712x(us2 us2Var) {
        yhm yhmVar;
        super.mo98712x(us2Var);
        if (us2Var == null || (yhmVar = this.f90514m) == null) {
            return;
        }
        yhmVar.m214835m(us2Var);
        MDLog.m7395i(MDLogTag.MOMENT_RENDER_TAG, "handle update filter !!!");
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: y */
    public void mo98713y(tif0 tif0Var) {
        super.mo98713y(tif0Var);
        MDLog.m7395i(MDLogTag.MOMENT_RENDER_TAG, "handle update image Render size" + tif0Var.toString());
        yhm yhmVar = this.f90514m;
        if (yhmVar != null) {
            yhmVar.mo177605n(tif0Var);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m115722y0(Object obj, tif0 tif0Var) {
        if (obj != null) {
            m98686T(new drc0(obj, tif0Var));
        } else {
            m98686T(tif0Var);
        }
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: z */
    public void mo98714z(Object obj) {
        MDLog.m7395i(MDLogTag.MOMENT_RENDER_TAG, "handleUpdateScreenRenderSize !!!");
        if (obj instanceof drc0) {
            m115709k0((drc0) obj);
        } else {
            m115710l0((tif0) obj);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m115723z0(snr snrVar) {
        this.f90521t = snrVar;
    }

    /* JADX INFO: renamed from: f0 */
    public void mo115705f0() {
    }

    /* JADX INFO: renamed from: x0 */
    public void mo111004x0(int i) {
    }
}
