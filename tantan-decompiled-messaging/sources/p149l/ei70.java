package p149l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.internal.ImmutableList;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class ei70 extends AbstractC17238h7<fa5<da5>, ngm> {

    /* JADX INFO: renamed from: M */
    public static final Class<?> f91558M = ei70.class;

    /* JADX INFO: renamed from: A */
    public final nbe f91559A;

    /* JADX INFO: renamed from: B */
    public final ImmutableList<nbe> f91560B;

    /* JADX INFO: renamed from: C */
    public final pgy<cx3, da5> f91561C;

    /* JADX INFO: renamed from: D */
    public cx3 f91562D;

    /* JADX INFO: renamed from: E */
    public syg0<c5c<fa5<da5>>> f91563E;

    /* JADX INFO: renamed from: F */
    public boolean f91564F;

    /* JADX INFO: renamed from: G */
    public ImmutableList<nbe> f91565G;

    /* JADX INFO: renamed from: H */
    public fhm f91566H;

    /* JADX INFO: renamed from: I */
    public Set<guc0> f91567I;

    /* JADX INFO: renamed from: J */
    public ImageRequest f91568J;

    /* JADX INFO: renamed from: K */
    public ImageRequest[] f91569K;

    /* JADX INFO: renamed from: L */
    public ImageRequest f91570L;

    /* JADX INFO: renamed from: z */
    public final Resources f91571z;

    public ei70(Resources resources, ksd ksdVar, nbe nbeVar, Executor executor, pgy<cx3, da5> pgyVar, ImmutableList<nbe> immutableList) {
        super(ksdVar, executor, null, null);
        this.f91571z = resources;
        this.f91559A = new vmd(resources, nbeVar);
        this.f91560B = immutableList;
        this.f91561C = pgyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public static vsd0 m116623j0(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof vsd0) {
            return (vsd0) drawable;
        }
        if (drawable instanceof qbe) {
            return m116623j0(((qbe) drawable).mo173824i());
        }
        if (drawable instanceof zz0) {
            zz0 zz0Var = (zz0) drawable;
            int iM220986d = zz0Var.m220986d();
            for (int i = 0; i < iM220986d; i++) {
                vsd0 vsd0VarM116623j0 = m116623j0(zz0Var.m220984b(i));
                if (vsd0VarM116623j0 != null) {
                    return vsd0VarM116623j0;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: A0 */
    public void m116624A0(da5 da5Var, i8c i8cVar) {
        vsd0 vsd0VarM116623j0;
        i8cVar.m134970j(m129614u());
        ice hierarchy = getHierarchy();
        ftd0 ftd0VarM199858v = null;
        if (hierarchy != null && (vsd0VarM116623j0 = m116623j0(hierarchy.mo112055b())) != null) {
            ftd0VarM199858v = vsd0VarM116623j0.m199858v();
        }
        i8cVar.m134973m(ftd0VarM199858v);
        String strM116634l0 = m116634l0();
        if (strM116634l0 != null) {
            i8cVar.m134963b("cc", strM116634l0);
        }
        if (da5Var == null) {
            i8cVar.m134969i();
        } else {
            i8cVar.m134971k(da5Var.getWidth(), da5Var.getHeight());
            i8cVar.m134972l(da5Var.getSizeInBytes());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.AbstractC17238h7
    /* JADX INFO: renamed from: O */
    public void mo116627O(Drawable drawable) {
        if (drawable instanceof dce) {
            ((dce) drawable).mo98207a();
        }
    }

    @Override // p149l.AbstractC17238h7, p149l.hce
    /* JADX INFO: renamed from: c */
    public void mo116629c(ice iceVar) {
        super.mo116629c(iceVar);
        m116644t0(null);
    }

    /* JADX INFO: renamed from: h0 */
    public synchronized void m116630h0(guc0 guc0Var) {
        try {
            if (this.f91567I == null) {
                this.f91567I = new HashSet();
            }
            this.f91567I.add(guc0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.AbstractC17238h7
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public Drawable mo116633l(fa5<da5> fa5Var) {
        try {
            if (o6j.m162852d()) {
                o6j.m162850a("PipelineDraweeController#createDrawable");
            }
            rf80.m179118i(fa5.m120144Q(fa5Var));
            da5 da5VarM120155B = fa5Var.m120155B();
            m116644t0(da5VarM120155B);
            Drawable drawableM116643s0 = m116643s0(this.f91565G, da5VarM120155B);
            if (drawableM116643s0 != null) {
                if (o6j.m162852d()) {
                    o6j.m162851b();
                }
                return drawableM116643s0;
            }
            Drawable drawableM116643s1 = m116643s0(this.f91560B, da5VarM120155B);
            if (drawableM116643s1 != null) {
                if (o6j.m162852d()) {
                    o6j.m162851b();
                }
                return drawableM116643s1;
            }
            Drawable drawableMo146385b = this.f91559A.mo146385b(da5VarM120155B);
            if (drawableMo146385b != null) {
                if (o6j.m162852d()) {
                    o6j.m162851b();
                }
                return drawableMo146385b;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + da5VarM120155B);
        } catch (Throwable th) {
            if (o6j.m162852d()) {
                o6j.m162851b();
            }
            throw th;
        }
    }

    @Override // p149l.AbstractC17238h7
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public fa5<da5> mo116635m() {
        cx3 cx3Var;
        if (o6j.m162852d()) {
            o6j.m162850a("PipelineDraweeController#getCachedImage");
        }
        try {
            pgy<cx3, da5> pgyVar = this.f91561C;
            if (pgyVar != null && (cx3Var = this.f91562D) != null) {
                fa5<da5> fa5Var = pgyVar.get(cx3Var);
                if (fa5Var == null || fa5Var.m120155B().mo110565X().mo155503a()) {
                    return fa5Var;
                }
                fa5Var.close();
                return null;
            }
            return null;
        } finally {
            if (o6j.m162852d()) {
                o6j.m162851b();
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public String m116634l0() {
        Object objM129608n = m129608n();
        if (objM129608n == null) {
            return null;
        }
        return objM129608n.toString();
    }

    @Override // p149l.AbstractC17238h7
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public int mo116647w(fa5<da5> fa5Var) {
        if (fa5Var != null) {
            return fa5Var.m120156M();
        }
        return 0;
    }

    @Override // p149l.AbstractC17238h7
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public ngm mo116649x(fa5<da5> fa5Var) {
        rf80.m179118i(fa5.m120144Q(fa5Var));
        return fa5Var.m120155B().mo110564G();
    }

    /* JADX INFO: renamed from: o0 */
    public synchronized guc0 m116638o0() {
        Set<guc0> set = this.f91567I;
        if (set == null) {
            return null;
        }
        return new d0j(set);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m116639p0(syg0<c5c<fa5<da5>>> syg0Var) {
        this.f91563E = syg0Var;
        m116644t0(null);
    }

    /* JADX INFO: renamed from: q0 */
    public void m116640q0(syg0<c5c<fa5<da5>>> syg0Var, String str, cx3 cx3Var, Object obj, ImmutableList<nbe> immutableList) {
        if (o6j.m162852d()) {
            o6j.m162850a("PipelineDraweeController#initialize");
        }
        super.m129574C(str, obj);
        m116639p0(syg0Var);
        this.f91562D = cx3Var;
        m116652y0(immutableList);
        m116644t0(null);
        if (o6j.m162852d()) {
            o6j.m162851b();
        }
    }

    @Override // p149l.AbstractC17238h7
    /* JADX INFO: renamed from: r */
    public c5c<fa5<da5>> mo116641r() {
        if (o6j.m162852d()) {
            o6j.m162850a("PipelineDraweeController#getDataSource");
        }
        if (tsf.m190547m(2)) {
            tsf.m190549o(f91558M, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        c5c<fa5<da5>> c5cVar = this.f91563E.get();
        if (o6j.m162852d()) {
            o6j.m162851b();
        }
        return c5cVar;
    }

    /* JADX INFO: renamed from: r0 */
    public synchronized void m116642r0(dhm dhmVar, AbstractDraweeControllerBuilder<fi70, ImageRequest, fa5<da5>, ngm> abstractDraweeControllerBuilder) {
        try {
            fhm fhmVar = this.f91566H;
            if (fhmVar != null) {
                fhmVar.m121365f();
            }
            if (dhmVar != null) {
                if (this.f91566H == null) {
                    this.f91566H = new fhm(AwakeTimeSinceBootClock.get(), this);
                }
                this.f91566H.m121362c(dhmVar);
                this.f91566H.m121366g(true);
            }
            this.f91568J = abstractDraweeControllerBuilder.m8221n();
            this.f91569K = abstractDraweeControllerBuilder.m8220m();
            this.f91570L = abstractDraweeControllerBuilder.m8222o();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final Drawable m116643s0(ImmutableList<nbe> immutableList, da5 da5Var) {
        Drawable drawableMo146385b;
        if (immutableList == null) {
            return null;
        }
        for (nbe nbeVar : immutableList) {
            if (nbeVar.mo146384a(da5Var) && (drawableMo146385b = nbeVar.mo146385b(da5Var)) != null) {
                return drawableMo146385b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m116644t0(da5 da5Var) {
        if (this.f91564F) {
            if (m129611q() == null) {
                i8c i8cVar = new i8c();
                m129606j(new vgm(i8cVar));
                m129593Z(i8cVar);
            }
            if (m129611q() instanceof i8c) {
                m116624A0(da5Var, (i8c) m129611q());
            }
        }
    }

    @Override // p149l.AbstractC17238h7
    public String toString() {
        return t050.m186815b(this).m186817b("super", super.toString()).m186817b("dataSourceSupplier", this.f91563E).toString();
    }

    @Override // p149l.AbstractC17238h7
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public Map<String, Object> mo116625J(ngm ngmVar) {
        if (ngmVar == null) {
            return null;
        }
        return ngmVar.getExtras();
    }

    @Override // p149l.AbstractC17238h7
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public void mo116626L(String str, fa5<da5> fa5Var) {
        super.mo116626L(str, fa5Var);
        synchronized (this) {
        }
    }

    @Override // p149l.AbstractC17238h7
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public void mo116628Q(fa5<da5> fa5Var) {
        fa5.m120154v(fa5Var);
    }

    /* JADX INFO: renamed from: x0 */
    public synchronized void m116650x0(guc0 guc0Var) {
        Set<guc0> set = this.f91567I;
        if (set == null) {
            return;
        }
        set.remove(guc0Var);
    }

    @Override // p149l.AbstractC17238h7
    /* JADX INFO: renamed from: y */
    public Uri mo116651y() {
        return yl10.m215210a(this.f91568J, this.f91570L, this.f91569K, ImageRequest.f6546A);
    }

    /* JADX INFO: renamed from: y0 */
    public void m116652y0(ImmutableList<nbe> immutableList) {
        this.f91565G = immutableList;
    }

    /* JADX INFO: renamed from: z0 */
    public void m116653z0(boolean z) {
        this.f91564F = z;
    }
}
