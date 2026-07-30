package p153l;

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
public class kq70 extends AbstractC16203c7<fb5<db5>, qim> {

    /* JADX INFO: renamed from: M */
    public static final Class<?> f128181M = kq70.class;

    /* JADX INFO: renamed from: A */
    public final rce f128182A;

    /* JADX INFO: renamed from: B */
    public final ImmutableList<rce> f128183B;

    /* JADX INFO: renamed from: C */
    public final mpy<by3, db5> f128184C;

    /* JADX INFO: renamed from: D */
    public by3 f128185D;

    /* JADX INFO: renamed from: E */
    public a7h0<i6c<fb5<db5>>> f128186E;

    /* JADX INFO: renamed from: F */
    public boolean f128187F;

    /* JADX INFO: renamed from: G */
    public ImmutableList<rce> f128188G;

    /* JADX INFO: renamed from: H */
    public ijm f128189H;

    /* JADX INFO: renamed from: I */
    public Set<j2d0> f128190I;

    /* JADX INFO: renamed from: J */
    public ImageRequest f128191J;

    /* JADX INFO: renamed from: K */
    public ImageRequest[] f128192K;

    /* JADX INFO: renamed from: L */
    public ImageRequest f128193L;

    /* JADX INFO: renamed from: z */
    public final Resources f128194z;

    public kq70(Resources resources, ytd ytdVar, rce rceVar, Executor executor, mpy<by3, db5> mpyVar, ImmutableList<rce> immutableList) {
        super(ytdVar, executor, null, null);
        this.f128194z = resources;
        this.f128182A = new aod(resources, rceVar);
        this.f128183B = immutableList;
        this.f128184C = mpyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public static x0e0 m150823j0(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof x0e0) {
            return (x0e0) drawable;
        }
        if (drawable instanceof uce) {
            return m150823j0(((uce) drawable).mo128371i());
        }
        if (drawable instanceof g01) {
            g01 g01Var = (g01) drawable;
            int iM128367d = g01Var.m128367d();
            for (int i = 0; i < iM128367d; i++) {
                x0e0 x0e0VarM150823j0 = m150823j0(g01Var.m128365b(i));
                if (x0e0VarM150823j0 != null) {
                    return x0e0VarM150823j0;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: A0 */
    public void m150824A0(db5 db5Var, o9c o9cVar) {
        x0e0 x0e0VarM150823j0;
        o9cVar.m166700j(m108254u());
        mde hierarchy = getHierarchy();
        h1e0 h1e0VarM208821v = null;
        if (hierarchy != null && (x0e0VarM150823j0 = m150823j0(hierarchy.mo157973b())) != null) {
            h1e0VarM208821v = x0e0VarM150823j0.m208821v();
        }
        o9cVar.m166703m(h1e0VarM208821v);
        String strM150828l0 = m150828l0();
        if (strM150828l0 != null) {
            o9cVar.m166693b("cc", strM150828l0);
        }
        if (db5Var == null) {
            o9cVar.m166699i();
        } else {
            o9cVar.m166701k(db5Var.getWidth(), db5Var.getHeight());
            o9cVar.m166702l(db5Var.getSizeInBytes());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.AbstractC16203c7
    /* JADX INFO: renamed from: O */
    public void mo108218O(Drawable drawable) {
        if (drawable instanceof hde) {
            ((hde) drawable).mo134586a();
        }
    }

    @Override // p153l.AbstractC16203c7, p153l.lde
    /* JADX INFO: renamed from: c */
    public void mo108234c(mde mdeVar) {
        super.mo108234c(mdeVar);
        m150836t0(null);
    }

    /* JADX INFO: renamed from: h0 */
    public synchronized void m150825h0(j2d0 j2d0Var) {
        try {
            if (this.f128190I == null) {
                this.f128190I = new HashSet();
            }
            this.f128190I.add(j2d0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.AbstractC16203c7
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public Drawable mo108245l(fb5<db5> fb5Var) {
        try {
            if (i9j.m139099d()) {
                i9j.m139097a("PipelineDraweeController#createDrawable");
            }
            wn80.m207184i(fb5.m124864Q(fb5Var));
            db5 db5VarM124875B = fb5Var.m124875B();
            m150836t0(db5VarM124875B);
            Drawable drawableM150835s0 = m150835s0(this.f128188G, db5VarM124875B);
            if (drawableM150835s0 != null) {
                if (i9j.m139099d()) {
                    i9j.m139098b();
                }
                return drawableM150835s0;
            }
            Drawable drawableM150835s1 = m150835s0(this.f128183B, db5VarM124875B);
            if (drawableM150835s1 != null) {
                if (i9j.m139099d()) {
                    i9j.m139098b();
                }
                return drawableM150835s1;
            }
            Drawable drawableMo99069b = this.f128182A.mo99069b(db5VarM124875B);
            if (drawableMo99069b != null) {
                if (i9j.m139099d()) {
                    i9j.m139098b();
                }
                return drawableMo99069b;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + db5VarM124875B);
        } catch (Throwable th) {
            if (i9j.m139099d()) {
                i9j.m139098b();
            }
            throw th;
        }
    }

    @Override // p153l.AbstractC16203c7
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public fb5<db5> mo108246m() {
        by3 by3Var;
        if (i9j.m139099d()) {
            i9j.m139097a("PipelineDraweeController#getCachedImage");
        }
        try {
            mpy<by3, db5> mpyVar = this.f128184C;
            if (mpyVar != null && (by3Var = this.f128185D) != null) {
                fb5<db5> fb5Var = mpyVar.get(by3Var);
                if (fb5Var == null || fb5Var.m124875B().mo97948Y().mo99002a()) {
                    return fb5Var;
                }
                fb5Var.close();
                return null;
            }
            return null;
        } finally {
            if (i9j.m139099d()) {
                i9j.m139098b();
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public String m150828l0() {
        Object objM108247n = m108247n();
        if (objM108247n == null) {
            return null;
        }
        return objM108247n.toString();
    }

    @Override // p153l.AbstractC16203c7
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public int mo108256w(fb5<db5> fb5Var) {
        if (fb5Var != null) {
            return fb5Var.m124876M();
        }
        return 0;
    }

    @Override // p153l.AbstractC16203c7
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public qim mo108257x(fb5<db5> fb5Var) {
        wn80.m207184i(fb5.m124864Q(fb5Var));
        return fb5Var.m124875B().mo97947G();
    }

    /* JADX INFO: renamed from: o0 */
    public synchronized j2d0 m150831o0() {
        Set<j2d0> set = this.f128190I;
        if (set == null) {
            return null;
        }
        return new y2j(set);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m150832p0(a7h0<i6c<fb5<db5>>> a7h0Var) {
        this.f128186E = a7h0Var;
        m150836t0(null);
    }

    /* JADX INFO: renamed from: q0 */
    public void m150833q0(a7h0<i6c<fb5<db5>>> a7h0Var, String str, by3 by3Var, Object obj, ImmutableList<rce> immutableList) {
        if (i9j.m139099d()) {
            i9j.m139097a("PipelineDraweeController#initialize");
        }
        super.m108206C(str, obj);
        m150832p0(a7h0Var);
        this.f128185D = by3Var;
        m150841y0(immutableList);
        m150836t0(null);
        if (i9j.m139099d()) {
            i9j.m139098b();
        }
    }

    @Override // p153l.AbstractC16203c7
    /* JADX INFO: renamed from: r */
    public i6c<fb5<db5>> mo108251r() {
        if (i9j.m139099d()) {
            i9j.m139097a("PipelineDraweeController#getDataSource");
        }
        if (huf.m137185m(2)) {
            huf.m137187o(f128181M, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        i6c<fb5<db5>> i6cVar = this.f128186E.get();
        if (i9j.m139099d()) {
            i9j.m139098b();
        }
        return i6cVar;
    }

    /* JADX INFO: renamed from: r0 */
    public synchronized void m150834r0(gjm gjmVar, AbstractDraweeControllerBuilder<lq70, ImageRequest, fb5<db5>, qim> abstractDraweeControllerBuilder) {
        try {
            ijm ijmVar = this.f128189H;
            if (ijmVar != null) {
                ijmVar.m140217f();
            }
            if (gjmVar != null) {
                if (this.f128189H == null) {
                    this.f128189H = new ijm(AwakeTimeSinceBootClock.get(), this);
                }
                this.f128189H.m140214c(gjmVar);
                this.f128189H.m140218g(true);
            }
            this.f128191J = abstractDraweeControllerBuilder.m8275n();
            this.f128192K = abstractDraweeControllerBuilder.m8274m();
            this.f128193L = abstractDraweeControllerBuilder.m8276o();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final Drawable m150835s0(ImmutableList<rce> immutableList, db5 db5Var) {
        Drawable drawableMo99069b;
        if (immutableList == null) {
            return null;
        }
        for (rce rceVar : immutableList) {
            if (rceVar.mo99068a(db5Var) && (drawableMo99069b = rceVar.mo99069b(db5Var)) != null) {
                return drawableMo99069b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m150836t0(db5 db5Var) {
        if (this.f128187F) {
            if (m108250q() == null) {
                o9c o9cVar = new o9c();
                m108243j(new yim(o9cVar));
                m108229Z(o9cVar);
            }
            if (m108250q() instanceof o9c) {
                m150824A0(db5Var, (o9c) m108250q());
            }
        }
    }

    @Override // p153l.AbstractC16203c7
    public String toString() {
        return i950.m139075b(this).m139077b("super", super.toString()).m139077b("dataSourceSupplier", this.f128186E).toString();
    }

    @Override // p153l.AbstractC16203c7
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public Map<String, Object> mo108213J(qim qimVar) {
        if (qimVar == null) {
            return null;
        }
        return qimVar.getExtras();
    }

    @Override // p153l.AbstractC16203c7
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public void mo108215L(String str, fb5<db5> fb5Var) {
        super.mo108215L(str, fb5Var);
        synchronized (this) {
        }
    }

    @Override // p153l.AbstractC16203c7
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public void mo108220Q(fb5<db5> fb5Var) {
        fb5.m124874v(fb5Var);
    }

    /* JADX INFO: renamed from: x0 */
    public synchronized void m150840x0(j2d0 j2d0Var) {
        Set<j2d0> set = this.f128190I;
        if (set == null) {
            return;
        }
        set.remove(j2d0Var);
    }

    @Override // p153l.AbstractC16203c7
    /* JADX INFO: renamed from: y */
    public Uri mo108258y() {
        return hu10.m137106a(this.f128191J, this.f128193L, this.f128192K, ImageRequest.f6583A);
    }

    /* JADX INFO: renamed from: y0 */
    public void m150841y0(ImmutableList<rce> immutableList) {
        this.f128188G = immutableList;
    }

    /* JADX INFO: renamed from: z0 */
    public void m150842z0(boolean z) {
        this.f128187F = z;
    }
}
