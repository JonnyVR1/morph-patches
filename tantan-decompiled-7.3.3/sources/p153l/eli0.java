package p153l;

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
public abstract class eli0 extends qt2 {

    /* JADX INFO: renamed from: A */
    public static int f94535A = 4;

    /* JADX INFO: renamed from: x */
    public static int f94536x = 1;

    /* JADX INFO: renamed from: y */
    public static int f94537y = 2;

    /* JADX INFO: renamed from: z */
    public static int f94538z = 3;

    /* JADX INFO: renamed from: f */
    private String f94539f;

    /* JADX INFO: renamed from: g */
    protected List<eli0> f94540g;

    /* JADX INFO: renamed from: h */
    protected Map<Object, kt2> f94541h;

    /* JADX INFO: renamed from: i */
    protected Map<Object, uje> f94542i;

    /* JADX INFO: renamed from: j */
    protected LinkedList<IProcessOutput> f94543j;

    /* JADX INFO: renamed from: k */
    protected uje f94544k;

    /* JADX INFO: renamed from: l */
    private uje f94545l;

    /* JADX INFO: renamed from: m */
    bkm f94546m;

    /* JADX INFO: renamed from: n */
    private IProcessOutput f94547n;

    /* JADX INFO: renamed from: o */
    private volatile boolean f94548o;

    /* JADX INFO: renamed from: p */
    private pmq0 f94549p;

    /* JADX INFO: renamed from: q */
    public rpr f94550q;

    /* JADX INFO: renamed from: r */
    public qpr f94551r;

    /* JADX INFO: renamed from: s */
    private long f94552s;

    /* JADX INFO: renamed from: t */
    protected tpr f94553t;

    /* JADX INFO: renamed from: u */
    public boolean f94554u;

    /* JADX INFO: renamed from: v */
    private spw f94555v;

    /* JADX INFO: renamed from: w */
    private ByteBuffer f94556w;

    /* JADX INFO: renamed from: l.eli0$a */
    public class C16793a implements pmq0.InterfaceC19404a {
        public C16793a() {
        }

        @Override // p153l.pmq0.InterfaceC19404a
        /* JADX INFO: renamed from: a */
        public void mo121226a(ByteBuffer byteBuffer, long j) {
            if (eli0.this.f94556w == null) {
                eli0.this.f94556w = ByteBuffer.allocate(byteBuffer.capacity());
            }
            eli0.this.f94556w.position(0);
            byteBuffer.position(0);
            byteBuffer.get(eli0.this.f94556w.array());
            eli0 eli0Var = eli0.this;
            eli0Var.f94551r.mo161501a(eli0Var.f94556w, eli0.this.f94556w.limit(), eli0.this.f94552s * 1000);
        }
    }

    public eli0(String str) {
        super(str);
        this.f94539f = "TargetRenderThread";
        this.f94540g = new ArrayList();
        this.f94541h = new HashMap();
        this.f94542i = new HashMap();
        this.f94543j = new LinkedList<>();
        this.f94548o = false;
        this.f94549p = null;
        this.f94550q = null;
        this.f94551r = null;
        this.f94552s = -1L;
        this.f94554u = false;
    }

    /* JADX INFO: renamed from: d0 */
    private void m121179d0() {
        pmq0 pmq0Var = this.f94549p;
        if (pmq0Var != null) {
            this.f94546m.m104836r(pmq0Var);
            this.f94549p.mo96080f();
        }
        pmq0 pmq0Var2 = new pmq0();
        this.f94549p = pmq0Var2;
        pmq0Var2.f153211D = new C16793a();
        bkm bkmVar = this.f94546m;
        if (bkmVar != null) {
            bkmVar.m104826h(this.f94549p);
        }
    }

    /* JADX INFO: renamed from: i0 */
    private void m121180i0() {
        this.f94548o = true;
    }

    /* JADX INFO: renamed from: A0 */
    public void m121181A0(Object obj, kt2 kt2Var) {
        m121182B0(obj, f94536x, kt2Var);
    }

    /* JADX INFO: renamed from: B0 */
    public void m121182B0(Object obj, int i, kt2 kt2Var) {
        m177857Q(new Object[]{obj, Integer.valueOf(i), kt2Var});
    }

    /* JADX INFO: renamed from: C0 */
    public void m121183C0(bkm bkmVar) {
        this.f94546m = bkmVar;
    }

    /* JADX INFO: renamed from: D0 */
    public void m121184D0(Object obj, kt2 kt2Var) {
        m121182B0(obj, f94535A, kt2Var);
    }

    /* JADX INFO: renamed from: E0 */
    public void m121185E0(Object obj, kt2 kt2Var) {
        m121182B0(obj, f94537y, kt2Var);
    }

    /* JADX INFO: renamed from: F0 */
    public void m121186F0(long j) {
        this.f94552s = j;
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: G */
    public void mo121187G() {
        m121180i0();
        super.mo121187G();
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: P */
    public void mo121188P() {
        m121180i0();
        Iterator<eli0> it = this.f94540g.iterator();
        while (it.hasNext()) {
            it.next().mo121188P();
        }
        super.mo121188P();
    }

    /* JADX INFO: renamed from: Z */
    public void m121189Z(Object obj) {
        m121192b0(obj, f94536x);
    }

    /* JADX INFO: renamed from: a0 */
    public void m121190a0(Object obj) {
        m121192b0(obj, f94537y);
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: b */
    public void mo121191b(kt2 kt2Var) {
        bkm bkmVar;
        super.mo121191b(kt2Var);
        if (kt2Var == null || (bkmVar = this.f94546m) == null) {
            return;
        }
        bkmVar.m104821a(kt2Var);
        MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "handle add filter to destory " + kt2Var.toString());
    }

    /* JADX INFO: renamed from: b0 */
    public void m121192b0(Object obj, int i) {
        m121194c0(obj, i, true);
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: c */
    public void mo121193c(Object obj, int i, boolean z) {
        Object objMo96763j0;
        MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "handleAddTarget !!!");
        if (i == f94538z) {
            m121179d0();
            return;
        }
        mo121209o(obj);
        uje ujeVar = new uje();
        boolean z2 = obj instanceof eli0;
        if (z2) {
            eli0 eli0Var = (eli0) obj;
            objMo96763j0 = eli0Var.mo96763j0();
            if (objMo96763j0 == null) {
                MDLog.m7445e(MDLogTag.MOMENT_RENDER_TAG, "Get TargetRenderThread input surface is null");
                spr sprVar = this.f159378d;
                if (sprVar != null) {
                    sprVar.mo167015e(this.f94539f, 1, "Get target input surfae is null !");
                    spw spwVar = this.f94555v;
                    if (spwVar != null) {
                        spwVar.onFail(7001, "Get target input surfae is null !");
                        return;
                    }
                    return;
                }
                return;
            }
            eli0Var.m121221w0(ujeVar);
            this.f94540g.add(eli0Var);
        } else {
            objMo96763j0 = obj;
        }
        try {
            int i2 = f94536x;
            uje ujeVar2 = this.f94544k;
            EGLContext eGLContext = null;
            if (i == i2) {
                ujeVar.m196325c(ujeVar2 != null ? ujeVar2.f179207c : null, objMo96763j0);
            } else {
                if (ujeVar2 != null) {
                    eGLContext = ujeVar2.f179207c;
                }
                ujeVar.m196326e(eGLContext, objMo96763j0);
            }
            this.f94542i.put(obj, ujeVar);
            if (z) {
                lqi0 lqi0Var = new lqi0();
                lqi0Var.mo133080a(ujeVar, this.f94544k);
                bkm bkmVar = this.f94546m;
                if (bkmVar != null) {
                    bkmVar.m104826h(lqi0Var);
                }
                this.f94541h.put(obj, lqi0Var);
            }
        } catch (Exception e) {
            MDLog.m7445e(MDLogTag.MOMENT_RENDER_TAG, "Create egl devices failed ! Add Target failed !");
            MDLog.printErrStackTrace(MDLogTag.MOMENT_RENDER_TAG, e);
            if (z2) {
                this.f94540g.remove(obj);
            }
            spr sprVar2 = this.f159378d;
            if (sprVar2 != null) {
                sprVar2.mo167015e(this.f94539f, 1, "Create target Egl device has exception !");
            }
            spw spwVar2 = this.f94555v;
            if (spwVar2 != null) {
                spwVar2.onFail(7001, "Create target Egl device has exception !" + e.toString());
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m121194c0(Object obj, int i, boolean z) {
        if (obj != null) {
            m177843A(new Object[]{obj, Integer.valueOf(i), Boolean.valueOf(z)});
        }
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: d */
    public void mo121195d() {
        MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "Handle clear all target !");
        super.mo121195d();
        for (uje ujeVar : this.f94542i.values()) {
            if (ujeVar != null) {
                ujeVar.m196328g();
            }
        }
        pmq0 pmq0Var = this.f94549p;
        if (pmq0Var != null) {
            this.f94546m.m104836r(pmq0Var);
            this.f94549p.mo96080f();
            this.f94549p = null;
        }
        this.f94542i.clear();
        for (kt2 kt2Var : this.f94541h.values()) {
            this.f94546m.m104836r(kt2Var);
            kt2Var.mo96080f();
        }
        this.f94541h.clear();
        Iterator<eli0> it = this.f94540g.iterator();
        while (it.hasNext()) {
            it.next().mo121187G();
        }
        this.f94540g.clear();
    }

    /* JADX INFO: renamed from: e0 */
    public void m121196e0() {
        m121192b0(this, f94538z);
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: g */
    public void mo121198g() {
        MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "handleInitDumyScreen !!!");
        if (this.f94544k == null) {
            uje ujeVar = new uje();
            this.f94544k = ujeVar;
            ujeVar.m196323a();
            this.f94544k.m196327f();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void mo121199g0() {
        rpr rprVar = this.f94550q;
        if (rprVar != null) {
            rprVar.mo161503a();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m121200h0() {
        Object objMo161504b;
        bkm bkmVar;
        rpr rprVar = this.f94550q;
        if (rprVar == null || (objMo161504b = rprVar.mo161504b()) == null || (bkmVar = this.f94546m) == null) {
            return;
        }
        bkmVar.m104837s((IProcessOutput) objMo161504b);
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: i */
    public void mo121201i() {
        tpr tprVar = this.f94553t;
        if (tprVar != null) {
            tprVar.onPause();
        }
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: j */
    public void mo121202j() {
        tpr tprVar = this.f94553t;
        if (tprVar != null) {
            tprVar.onResume();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public Object mo96763j0() {
        return null;
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: k */
    public void mo121203k() {
        if (this.f94543j.size() > 0) {
            this.f94547n = this.f94543j.pollFirst();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m121204k0(izc0 izc0Var) {
        crf0 crf0VarM142798a = izc0Var.m142798a();
        kt2 kt2Var = this.f94541h.get(izc0Var.m142799b());
        if (kt2Var != null) {
            MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "input render filterSize  = " + crf0VarM142798a.m112050b());
            kt2Var.mo172261z(crf0VarM142798a.m112050b(), crf0VarM142798a.m112049a());
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m121205l0(crf0 crf0Var) {
        pmq0 pmq0Var = this.f94549p;
        if (pmq0Var != null) {
            pmq0Var.mo172261z(crf0Var.m112050b(), crf0Var.m112049a());
        }
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: m */
    public void mo96765m() {
        MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "handleReleaseAll !!!");
        super.mo96765m();
        bkm bkmVar = this.f94546m;
        if (bkmVar != null) {
            bkmVar.mo104827i();
            this.f94546m = null;
        }
        for (uje ujeVar : this.f94542i.values()) {
            if (ujeVar != null) {
                ujeVar.m196328g();
            }
        }
        this.f94542i.clear();
        pmq0 pmq0Var = this.f94549p;
        if (pmq0Var != null) {
            pmq0Var.mo96080f();
            this.f94549p = null;
        }
        Iterator<kt2> it = this.f94541h.values().iterator();
        while (it.hasNext()) {
            it.next().mo96080f();
        }
        this.f94541h.clear();
        Iterator<eli0> it2 = this.f94540g.iterator();
        while (it2.hasNext()) {
            it2.next().mo121187G();
        }
        this.f94540g.clear();
        uje ujeVar2 = this.f94544k;
        if (ujeVar2 != null) {
            ujeVar2.m196328g();
            this.f94544k = null;
        }
        m177863a();
        m177861U();
    }

    /* JADX INFO: renamed from: m0 */
    public void m121206m0(int i) {
        m121210o0(i);
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: n */
    public void mo121207n(Object obj, int i) {
        kt2 kt2Var = this.f94541h.get(obj);
        if (kt2Var != null) {
            if (i == f94536x) {
                this.f94546m.m104836r(kt2Var);
            }
            if (i == f94535A) {
                this.f94546m.m104835q(kt2Var);
            }
            kt2Var.mo96080f();
            this.f94541h.remove(obj);
        }
        uje ujeVar = this.f94542i.get(obj);
        if (ujeVar != null) {
            ujeVar.m196328g();
            this.f94542i.remove(obj);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m121208n0(int i, Object obj) {
        m121212q0(i, obj);
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: o */
    public void mo121209o(Object obj) {
        MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "handleRemoveTarget");
        if (obj instanceof eli0) {
            this.f94540g.remove(obj);
        }
        kt2 kt2Var = this.f94541h.get(obj);
        if (kt2Var != null) {
            this.f94546m.m104836r(kt2Var);
            kt2Var.mo96080f();
            this.f94541h.remove(obj);
        }
        uje ujeVar = this.f94542i.get(obj);
        if (ujeVar != null) {
            ujeVar.m196328g();
            this.f94542i.remove(obj);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m121210o0(int i) {
        Message message = new Message();
        message.what = i;
        m177852K(message);
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: p */
    public void mo96766p() {
        m121200h0();
        try {
            if (this.f94544k != null && !this.f94548o) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = this.f94552s;
                if (j >= 0) {
                    jCurrentTimeMillis = j;
                }
                this.f94546m.m104834p(jCurrentTimeMillis);
                this.f94544k.m196327f();
                mo121197f0();
                this.f94546m.m104822c();
            }
        } catch (Exception e) {
            MDLog.m7445e(MDLogTag.MOMENT_RENDER_TAG, "Rending Target Error !!!" + e.toString());
            spw spwVar = this.f94555v;
            if (spwVar != null) {
                spwVar.onFail(ErrorCode.RENDER_TARGET_FAILED, "Rending Target Error !!!" + e.toString());
            }
        }
        mo121199g0();
    }

    /* JADX INFO: renamed from: p0 */
    public void m121211p0(int i, int i2) {
        Message message = new Message();
        message.what = i;
        message.arg1 = i2;
        m177852K(message);
    }

    /* JADX INFO: renamed from: q0 */
    public void m121212q0(int i, Object obj) {
        Message message = new Message();
        message.what = i;
        message.obj = obj;
        m177852K(message);
    }

    /* JADX INFO: renamed from: r0 */
    public void m121213r0(int i, Object obj) {
        Message message = new Message();
        message.what = i;
        message.obj = obj;
        m177852K(message);
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: s */
    public void mo121214s() {
        MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "handleStartRender !!!");
        this.f94548o = false;
        for (kt2 kt2Var : this.f94541h.values()) {
            bkm bkmVar = this.f94546m;
            if (bkmVar != null) {
                bkmVar.m104826h(kt2Var);
            }
        }
        pmq0 pmq0Var = this.f94549p;
        if (pmq0Var != null) {
            this.f94546m.m104826h(pmq0Var);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m121215s0() {
        m177850I();
    }

    /* JADX INFO: renamed from: t0 */
    public void m121216t0(spw spwVar) {
        this.f94555v = spwVar;
    }

    /* JADX INFO: renamed from: u0 */
    public void m121217u0(rpr rprVar) {
        this.f94550q = rprVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.qt2
    /* JADX INFO: renamed from: v */
    public void mo121218v(Object obj, int i, kt2 kt2Var) {
        Map<Object, kt2> map;
        Object objMo96763j0;
        MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "handle update end point filter !!!");
        if (obj == null || kt2Var == 0 || (map = this.f94541h) == null || this.f94542i == null) {
            return;
        }
        kt2 kt2Var2 = map.get(obj);
        if (kt2Var2 != null) {
            bkm bkmVar = this.f94546m;
            if (bkmVar != null) {
                bkmVar.m104836r(kt2Var2);
            }
            kt2Var2.mo96080f();
        }
        uje ujeVar = this.f94542i.get(obj);
        if (ujeVar == null) {
            ujeVar = new uje();
            boolean z = obj instanceof eli0;
            if (z) {
                eli0 eli0Var = (eli0) obj;
                objMo96763j0 = eli0Var.mo96763j0();
                eli0Var.m121221w0(ujeVar);
            } else {
                objMo96763j0 = obj;
            }
            try {
                EGLContext eGLContext = null;
                if (i == f94536x || i == f94535A) {
                    uje ujeVar2 = this.f94544k;
                    if (ujeVar2 != null) {
                        eGLContext = ujeVar2.f179207c;
                    }
                    ujeVar.m196325c(eGLContext, objMo96763j0);
                } else {
                    uje ujeVar3 = this.f94544k;
                    if (ujeVar3 != null) {
                        eGLContext = ujeVar3.f179207c;
                    }
                    ujeVar.m196326e(eGLContext, objMo96763j0);
                }
            } catch (Exception e) {
                MDLog.m7445e(MDLogTag.MOMENT_RENDER_TAG, "Create egl devices failed ! Add Target failed !");
                MDLog.printErrStackTrace(MDLogTag.MOMENT_RENDER_TAG, e);
                if (z) {
                    this.f94540g.remove(i);
                }
                spr sprVar = this.f159378d;
                if (sprVar != null) {
                    sprVar.mo167015e(this.f94539f, 1, "Create target Egl device has exception !");
                    return;
                }
                return;
            }
        }
        if (kt2Var instanceof gzc0) {
            ((gzc0) kt2Var).mo133080a(ujeVar, this.f94544k);
        }
        bkm bkmVar2 = this.f94546m;
        if (bkmVar2 != null) {
            if (i == f94536x) {
                bkmVar2.m104826h(kt2Var);
            }
            if (i == f94535A) {
                this.f94546m.m104825g(kt2Var);
            }
        }
        this.f94541h.put(obj, kt2Var);
        this.f94542i.put(obj, ujeVar);
    }

    /* JADX INFO: renamed from: v0 */
    public void m121219v0(qpr qprVar) {
        this.f94551r = qprVar;
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: w */
    public void mo121220w(Object obj) {
        super.mo121220w(obj);
        IProcessOutput iProcessOutput = (IProcessOutput) obj;
        Iterator<eli0> it = this.f94540g.iterator();
        while (it.hasNext()) {
            it.next().m177848F(iProcessOutput);
        }
        this.f94543j.addLast(iProcessOutput);
    }

    /* JADX INFO: renamed from: w0 */
    public void m121221w0(uje ujeVar) {
        this.f94545l = ujeVar;
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: x */
    public void mo121222x(kt2 kt2Var) {
        bkm bkmVar;
        super.mo121222x(kt2Var);
        if (kt2Var == null || (bkmVar = this.f94546m) == null) {
            return;
        }
        bkmVar.m104831m(kt2Var);
        MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "handle update filter !!!");
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: y */
    public void mo96769y(crf0 crf0Var) {
        super.mo96769y(crf0Var);
        MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "handle update image Render size" + crf0Var.toString());
        bkm bkmVar = this.f94546m;
        if (bkmVar != null) {
            bkmVar.mo104832n(crf0Var);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m121223y0(Object obj, crf0 crf0Var) {
        if (obj != null) {
            m177860T(new izc0(obj, crf0Var));
        } else {
            m177860T(crf0Var);
        }
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: z */
    public void mo121224z(Object obj) {
        MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "handleUpdateScreenRenderSize !!!");
        if (obj instanceof izc0) {
            m121204k0((izc0) obj);
        } else {
            m121205l0((crf0) obj);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m121225z0(tpr tprVar) {
        this.f94553t = tprVar;
    }

    /* JADX INFO: renamed from: f0 */
    public void mo121197f0() {
    }

    /* JADX INFO: renamed from: x0 */
    public void mo96768x0(int i) {
    }
}
