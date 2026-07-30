package p153l;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.drawee.components.DraweeEventTracker;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.c7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16203c7<T, INFO> implements lde, ytd.InterfaceC21682a, jmj.InterfaceC17978a {

    /* JADX INFO: renamed from: w */
    public static final Map<String, Object> f80020w = ImmutableMap.m8202of("component_tag", "drawee");

    /* JADX INFO: renamed from: x */
    public static final Map<String, Object> f80021x = ImmutableMap.m8203of("origin", "memory_bitmap", "origin_sub", "shortcut");

    /* JADX INFO: renamed from: y */
    public static final Class<?> f80022y = AbstractC16203c7.class;

    /* JADX INFO: renamed from: b */
    public final ytd f80024b;

    /* JADX INFO: renamed from: c */
    public final Executor f80025c;

    /* JADX INFO: renamed from: d */
    public i6d0 f80026d;

    /* JADX INFO: renamed from: e */
    public jmj f80027e;

    /* JADX INFO: renamed from: f */
    public v36<INFO> f80028f;

    /* JADX INFO: renamed from: h */
    public dve0 f80030h;

    /* JADX INFO: renamed from: i */
    public Drawable f80031i;

    /* JADX INFO: renamed from: j */
    public String f80032j;

    /* JADX INFO: renamed from: k */
    public Object f80033k;

    /* JADX INFO: renamed from: l */
    public boolean f80034l;

    /* JADX INFO: renamed from: m */
    public boolean f80035m;

    /* JADX INFO: renamed from: n */
    public boolean f80036n;

    /* JADX INFO: renamed from: o */
    public boolean f80037o;

    /* JADX INFO: renamed from: p */
    public boolean f80038p;

    /* JADX INFO: renamed from: q */
    public String f80039q;

    /* JADX INFO: renamed from: r */
    public i6c<T> f80040r;

    /* JADX INFO: renamed from: s */
    public T f80041s;

    /* JADX INFO: renamed from: v */
    public Drawable f80044v;

    /* JADX INFO: renamed from: a */
    public final DraweeEventTracker f80023a = DraweeEventTracker.m8254a();

    /* JADX INFO: renamed from: g */
    public n2j<INFO> f80029g = new n2j<>();

    /* JADX INFO: renamed from: t */
    public boolean f80042t = true;

    /* JADX INFO: renamed from: u */
    public boolean f80043u = false;

    /* JADX INFO: renamed from: l.c7$a */
    public class a extends aj2<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f80045a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f80046b;

        public a(String str, boolean z) {
            this.f80045a = str;
            this.f80046b = z;
        }

        @Override // p153l.aj2, p153l.s6c
        /* JADX INFO: renamed from: a */
        public void mo98342a(i6c<T> i6cVar) {
            boolean zMo8236e = i6cVar.mo8236e();
            AbstractC16203c7.this.m108217N(this.f80045a, i6cVar, i6cVar.mo8234c(), zMo8236e);
        }

        @Override // p153l.aj2
        /* JADX INFO: renamed from: e */
        public void mo98346e(i6c<T> i6cVar) {
            AbstractC16203c7.this.m108214K(this.f80045a, i6cVar, i6cVar.mo8233b(), true);
        }

        @Override // p153l.aj2
        /* JADX INFO: renamed from: f */
        public void mo98347f(i6c<T> i6cVar) {
            boolean zMo8236e = i6cVar.mo8236e();
            boolean zMo8235d = i6cVar.mo8235d();
            float fMo8234c = i6cVar.mo8234c();
            T result = i6cVar.getResult();
            if (result != null) {
                AbstractC16203c7.this.m108216M(this.f80045a, i6cVar, result, fMo8234c, zMo8236e, this.f80046b, zMo8235d);
            } else if (zMo8236e) {
                AbstractC16203c7.this.m108214K(this.f80045a, i6cVar, new NullPointerException(), true);
            }
        }
    }

    /* JADX INFO: renamed from: l.c7$b */
    public static class b<INFO> extends o2j<INFO> {
        /* JADX INFO: renamed from: j */
        public static <INFO> b<INFO> m108260j(v36<? super INFO> v36Var, v36<? super INFO> v36Var2) {
            if (i9j.m139099d()) {
                i9j.m139097a("AbstractDraweeController#createInternal");
            }
            b<INFO> bVar = new b<>();
            bVar.m165725g(v36Var);
            bVar.m165725g(v36Var2);
            if (i9j.m139099d()) {
                i9j.m139098b();
            }
            return bVar;
        }
    }

    public AbstractC16203c7(ytd ytdVar, Executor executor, String str, Object obj) {
        this.f80024b = ytdVar;
        this.f80025c = executor;
        m108205B(str, obj);
    }

    /* JADX INFO: renamed from: A */
    public final dve0 m108204A() {
        dve0 dve0Var = this.f80030h;
        if (dve0Var != null) {
            return dve0Var;
        }
        qg50.m176437a("mSettableDraweeHierarchy is null; Caller context: ", this.f80033k);
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final synchronized void m108205B(String str, Object obj) {
        ytd ytdVar;
        try {
            if (i9j.m139099d()) {
                i9j.m139097a("AbstractDraweeController#init");
            }
            this.f80023a.m8255b(DraweeEventTracker.Event.ON_INIT_CONTROLLER);
            if (!this.f80042t && (ytdVar = this.f80024b) != null) {
                ytdVar.mo217303a(this);
            }
            this.f80034l = false;
            this.f80036n = false;
            m108219P();
            this.f80038p = false;
            i6d0 i6d0Var = this.f80026d;
            if (i6d0Var != null) {
                i6d0Var.m138804a();
            }
            jmj jmjVar = this.f80027e;
            if (jmjVar != null) {
                jmjVar.m146160a();
                this.f80027e.m146164f(this);
            }
            v36<INFO> v36Var = this.f80028f;
            if (v36Var instanceof b) {
                ((b) v36Var).m165726h();
            } else {
                this.f80028f = null;
            }
            dve0 dve0Var = this.f80030h;
            if (dve0Var != null) {
                dve0Var.reset();
                this.f80030h.mo118277c(null);
                this.f80030h = null;
            }
            this.f80031i = null;
            if (huf.m137185m(2)) {
                huf.m137189q(f80022y, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f80032j, str);
            }
            this.f80032j = str;
            this.f80033k = obj;
            if (i9j.m139099d()) {
                i9j.m139098b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: C */
    public void m108206C(String str, Object obj) {
        m108205B(str, obj);
        this.f80042t = false;
        this.f80043u = false;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m108207D(String str, i6c<T> i6cVar) {
        if (i6cVar == null && this.f80040r == null) {
            return true;
        }
        return str.equals(this.f80032j) && i6cVar == this.f80040r && this.f80035m;
    }

    /* JADX INFO: renamed from: E */
    public boolean m108208E() {
        return this.f80043u;
    }

    /* JADX INFO: renamed from: F */
    public final void m108209F(String str, Throwable th) {
        if (huf.m137185m(2)) {
            huf.m137190r(f80022y, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f80032j, str, th);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m108210G(String str, T t) {
        if (huf.m137185m(2)) {
            huf.m137191s(f80022y, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f80032j, str, m108255v(t), Integer.valueOf(mo108256w(t)));
        }
    }

    /* JADX INFO: renamed from: H */
    public final u36.C20477a m108211H(Map<String, Object> map, Map<String, Object> map2, Uri uri) {
        String str;
        PointF pointFM207052m;
        dve0 dve0Var = this.f80030h;
        if (dve0Var instanceof wlj) {
            wlj wljVar = (wlj) dve0Var;
            String strValueOf = String.valueOf(wljVar.m207053n());
            pointFM207052m = wljVar.m207052m();
            str = strValueOf;
        } else {
            str = null;
            pointFM207052m = null;
        }
        return ta00.m189768a(f80020w, f80021x, map, null, m108252s(), str, pointFM207052m, map2, m108247n(), m108208E(), uri);
    }

    /* JADX INFO: renamed from: I */
    public final u36.C20477a m108212I(i6c<T> i6cVar, INFO info, Uri uri) {
        return m108211H(i6cVar == null ? null : i6cVar.getExtras(), mo108213J(info), uri);
    }

    /* JADX INFO: renamed from: J */
    public abstract Map<String, Object> mo108213J(INFO info);

    /* JADX INFO: renamed from: K */
    public final void m108214K(String str, i6c<T> i6cVar, Throwable th, boolean z) {
        Drawable drawable;
        if (i9j.m139099d()) {
            i9j.m139097a("AbstractDraweeController#onFailureInternal");
        }
        if (!m108207D(str, i6cVar)) {
            m108209F("ignore_old_datasource @ onFailure", th);
            i6cVar.close();
            if (i9j.m139099d()) {
                i9j.m139098b();
                return;
            }
            return;
        }
        this.f80023a.m8255b(z ? DraweeEventTracker.Event.ON_DATASOURCE_FAILURE : DraweeEventTracker.Event.ON_DATASOURCE_FAILURE_INT);
        if (z) {
            m108209F("final_failed @ onFailure", th);
            this.f80040r = null;
            this.f80037o = true;
            dve0 dve0Var = this.f80030h;
            if (dve0Var != null) {
                if (this.f80038p && (drawable = this.f80044v) != null) {
                    dve0Var.mo118280f(drawable, 1.0f, true);
                } else if (m108241f0()) {
                    dve0Var.mo118276a(th);
                } else {
                    dve0Var.mo118278d(th);
                }
            }
            m108222S(th, i6cVar);
        } else {
            m108209F("intermediate_failed @ onFailure", th);
            m108223T(th);
        }
        if (i9j.m139099d()) {
            i9j.m139098b();
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m108216M(String str, i6c<T> i6cVar, T t, float f, boolean z, boolean z2, boolean z3) {
        try {
            if (i9j.m139099d()) {
                i9j.m139097a("AbstractDraweeController#onNewResultInternal");
            }
            if (!m108207D(str, i6cVar)) {
                m108210G("ignore_old_datasource @ onNewResult", t);
                mo108220Q(t);
                i6cVar.close();
                if (i9j.m139099d()) {
                    i9j.m139098b();
                    return;
                }
                return;
            }
            this.f80023a.m8255b(z ? DraweeEventTracker.Event.ON_DATASOURCE_RESULT : DraweeEventTracker.Event.ON_DATASOURCE_RESULT_INT);
            try {
                Drawable drawableMo108245l = mo108245l(t);
                T t2 = this.f80041s;
                Drawable drawable = this.f80044v;
                this.f80041s = t;
                this.f80044v = drawableMo108245l;
                try {
                    if (z) {
                        m108210G("set_final_result @ onNewResult", t);
                        this.f80040r = null;
                        m108204A().mo118280f(drawableMo108245l, 1.0f, z2);
                        m108227X(str, t, i6cVar);
                    } else if (z3) {
                        m108210G("set_temporary_result @ onNewResult", t);
                        m108204A().mo118280f(drawableMo108245l, 1.0f, z2);
                        m108227X(str, t, i6cVar);
                    } else {
                        m108210G("set_intermediate_result @ onNewResult", t);
                        m108204A().mo118280f(drawableMo108245l, f, z2);
                        m108224U(str, t);
                    }
                    if (drawable != null && drawable != drawableMo108245l) {
                        mo108218O(drawable);
                    }
                    if (t2 != null && t2 != t) {
                        m108210G("release_previous_result @ onNewResult", t2);
                        mo108220Q(t2);
                    }
                    if (i9j.m139099d()) {
                        i9j.m139098b();
                    }
                } catch (Throwable th) {
                    if (drawable != null && drawable != drawableMo108245l) {
                        mo108218O(drawable);
                    }
                    if (t2 != null && t2 != t) {
                        m108210G("release_previous_result @ onNewResult", t2);
                        mo108220Q(t2);
                    }
                    throw th;
                }
            } catch (Exception e) {
                m108210G("drawable_failed @ onNewResult", t);
                mo108220Q(t);
                m108214K(str, i6cVar, e, z);
                if (i9j.m139099d()) {
                    i9j.m139098b();
                }
            }
        } catch (Throwable th2) {
            if (i9j.m139099d()) {
                i9j.m139098b();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m108217N(String str, i6c<T> i6cVar, float f, boolean z) {
        if (!m108207D(str, i6cVar)) {
            m108209F("ignore_old_datasource @ onProgress", null);
            i6cVar.close();
        } else {
            if (z) {
                return;
            }
            this.f80030h.mo118279e(f, false);
        }
    }

    /* JADX INFO: renamed from: O */
    public abstract void mo108218O(Drawable drawable);

    /* JADX INFO: renamed from: P */
    public final void m108219P() {
        Map<String, Object> extras;
        boolean z = this.f80035m;
        this.f80035m = false;
        this.f80037o = false;
        i6c<T> i6cVar = this.f80040r;
        Map<String, Object> map = null;
        if (i6cVar != null) {
            extras = i6cVar.getExtras();
            this.f80040r.close();
            this.f80040r = null;
        } else {
            extras = null;
        }
        Drawable drawable = this.f80044v;
        if (drawable != null) {
            mo108218O(drawable);
        }
        if (this.f80039q != null) {
            this.f80039q = null;
        }
        this.f80044v = null;
        T t = this.f80041s;
        if (t != null) {
            Map<String, Object> mapMo108213J = mo108213J(mo108257x(t));
            m108210G("release", this.f80041s);
            mo108220Q(this.f80041s);
            this.f80041s = null;
            map = mapMo108213J;
        }
        if (z) {
            m108225V(extras, map);
        }
    }

    /* JADX INFO: renamed from: Q */
    public abstract void mo108220Q(T t);

    /* JADX INFO: renamed from: R */
    public void m108221R(u36<INFO> u36Var) {
        this.f80029g.m161235m(u36Var);
    }

    /* JADX INFO: renamed from: S */
    public final void m108222S(Throwable th, i6c<T> i6cVar) {
        u36.C20477a c20477aM108212I = m108212I(i6cVar, null, null);
        m108248o().mo49464d(this.f80032j, th);
        m108249p().mo149843d(this.f80032j, th, c20477aM108212I);
    }

    /* JADX INFO: renamed from: T */
    public final void m108223T(Throwable th) {
        m108248o().mo98802f(this.f80032j, th);
        m108249p().mo149844e(this.f80032j);
    }

    /* JADX INFO: renamed from: U */
    public final void m108224U(String str, T t) {
        INFO infoMo108257x = mo108257x(t);
        m108248o().mo49463b(str, infoMo108257x);
        m108249p().mo149842b(str, infoMo108257x);
    }

    /* JADX INFO: renamed from: V */
    public final void m108225V(Map<String, Object> map, Map<String, Object> map2) {
        m108248o().mo98800a(this.f80032j);
        m108249p().mo149847j(this.f80032j, m108211H(map, map2, null));
    }

    /* JADX INFO: renamed from: W */
    public void m108226W(i6c<T> i6cVar, INFO info) {
        m108248o().mo98801c(this.f80032j, this.f80033k);
        m108249p().mo149846i(this.f80032j, this.f80033k, m108212I(i6cVar, info, mo108258y()));
    }

    /* JADX INFO: renamed from: X */
    public final void m108227X(String str, T t, i6c<T> i6cVar) {
        INFO infoMo108257x = mo108257x(t);
        m108248o().mo8288e(str, infoMo108257x, mo108240f());
        m108249p().mo149845h(str, infoMo108257x, m108212I(i6cVar, infoMo108257x, null));
    }

    /* JADX INFO: renamed from: Y */
    public void m108228Y(String str) {
        this.f80039q = str;
    }

    /* JADX INFO: renamed from: Z */
    public void m108229Z(Drawable drawable) {
        this.f80031i = drawable;
        dve0 dve0Var = this.f80030h;
        if (dve0Var != null) {
            dve0Var.mo118277c(drawable);
        }
    }

    @Override // p153l.jmj.InterfaceC17978a
    /* JADX INFO: renamed from: a */
    public boolean mo108230a() {
        if (huf.m137185m(2)) {
            huf.m137188p(f80022y, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f80032j);
        }
        if (!m108241f0()) {
            return false;
        }
        this.f80026d.m138805b();
        this.f80030h.reset();
        m108242g0();
        return true;
    }

    @Override // p153l.lde
    /* JADX INFO: renamed from: b */
    public boolean mo108232b(MotionEvent motionEvent) {
        if (huf.m137185m(2)) {
            huf.m137189q(f80022y, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f80032j, motionEvent);
        }
        jmj jmjVar = this.f80027e;
        if (jmjVar == null) {
            return false;
        }
        if (!jmjVar.m146161b() && !m108239e0()) {
            return false;
        }
        this.f80027e.m146162d(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    public void m108233b0(jmj jmjVar) {
        this.f80027e = jmjVar;
        if (jmjVar != null) {
            jmjVar.m146164f(this);
        }
    }

    @Override // p153l.lde
    /* JADX INFO: renamed from: c */
    public void mo108234c(mde mdeVar) {
        if (huf.m137185m(2)) {
            huf.m137189q(f80022y, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f80032j, mdeVar);
        }
        this.f80023a.m8255b(mdeVar != null ? DraweeEventTracker.Event.ON_SET_HIERARCHY : DraweeEventTracker.Event.ON_CLEAR_HIERARCHY);
        if (this.f80035m) {
            this.f80024b.mo217303a(this);
            release();
        }
        dve0 dve0Var = this.f80030h;
        if (dve0Var != null) {
            dve0Var.mo118277c(null);
            this.f80030h = null;
        }
        if (mdeVar != null) {
            wn80.m207177b(Boolean.valueOf(mdeVar instanceof dve0));
            dve0 dve0Var2 = (dve0) mdeVar;
            this.f80030h = dve0Var2;
            dve0Var2.mo118277c(this.f80031i);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m108235c0(boolean z) {
        this.f80043u = z;
    }

    @Override // p153l.lde
    /* JADX INFO: renamed from: d */
    public void mo108236d() {
        if (i9j.m139099d()) {
            i9j.m139097a("AbstractDraweeController#onAttach");
        }
        if (huf.m137185m(2)) {
            huf.m137189q(f80022y, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.f80032j, this.f80035m ? "request already submitted" : "request needs submit");
        }
        this.f80023a.m8255b(DraweeEventTracker.Event.ON_ATTACH_CONTROLLER);
        wn80.m207182g(this.f80030h);
        this.f80024b.mo217303a(this);
        this.f80034l = true;
        if (!this.f80035m) {
            m108242g0();
        }
        if (i9j.m139099d()) {
            i9j.m139098b();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m108237d0(boolean z) {
        this.f80038p = z;
    }

    @Override // p153l.lde
    /* JADX INFO: renamed from: e */
    public void mo108238e() {
        if (i9j.m139099d()) {
            i9j.m139097a("AbstractDraweeController#onDetach");
        }
        if (huf.m137185m(2)) {
            huf.m137188p(f80022y, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f80032j);
        }
        this.f80023a.m8255b(DraweeEventTracker.Event.ON_DETACH_CONTROLLER);
        this.f80034l = false;
        this.f80024b.mo217304d(this);
        if (i9j.m139099d()) {
            i9j.m139098b();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m108239e0() {
        return m108241f0();
    }

    @Override // p153l.lde
    /* JADX INFO: renamed from: f */
    public Animatable mo108240f() {
        Object obj = this.f80044v;
        if (obj instanceof Animatable) {
            return (Animatable) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m108241f0() {
        i6d0 i6d0Var;
        return this.f80037o && (i6d0Var = this.f80026d) != null && i6d0Var.m138808e();
    }

    /* JADX INFO: renamed from: g0 */
    public void m108242g0() {
        if (i9j.m139099d()) {
            i9j.m139097a("AbstractDraweeController#submitRequest");
        }
        T tMo108246m = mo108246m();
        if (tMo108246m != null) {
            if (i9j.m139099d()) {
                i9j.m139097a("AbstractDraweeController#submitRequest->cache");
            }
            this.f80040r = null;
            this.f80035m = true;
            this.f80037o = false;
            this.f80023a.m8255b(DraweeEventTracker.Event.ON_SUBMIT_CACHE_HIT);
            m108226W(this.f80040r, mo108257x(tMo108246m));
            mo108215L(this.f80032j, tMo108246m);
            m108216M(this.f80032j, this.f80040r, tMo108246m, 1.0f, true, true, true);
            if (i9j.m139099d()) {
                i9j.m139098b();
            }
            if (i9j.m139099d()) {
                i9j.m139098b();
                return;
            }
            return;
        }
        this.f80023a.m8255b(DraweeEventTracker.Event.ON_DATASOURCE_SUBMIT);
        this.f80030h.mo118279e(0.0f, true);
        this.f80035m = true;
        this.f80037o = false;
        i6c<T> i6cVarMo108251r = mo108251r();
        this.f80040r = i6cVarMo108251r;
        m108226W(i6cVarMo108251r, null);
        if (huf.m137185m(2)) {
            huf.m137189q(f80022y, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f80032j, Integer.valueOf(System.identityHashCode(this.f80040r)));
        }
        this.f80040r.mo8237f(new a(this.f80032j, this.f80040r.mo8232a()), this.f80025c);
        if (i9j.m139099d()) {
            i9j.m139098b();
        }
    }

    @Override // p153l.lde
    public mde getHierarchy() {
        return this.f80030h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public void m108243j(v36<? super INFO> v36Var) {
        wn80.m207182g(v36Var);
        v36<INFO> v36Var2 = this.f80028f;
        if (v36Var2 instanceof b) {
            ((b) v36Var2).m165725g(v36Var);
        } else if (v36Var2 != null) {
            this.f80028f = b.m108260j(v36Var2, v36Var);
        } else {
            this.f80028f = v36Var;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m108244k(u36<INFO> u36Var) {
        this.f80029g.m161234k(u36Var);
    }

    /* JADX INFO: renamed from: l */
    public abstract Drawable mo108245l(T t);

    /* JADX INFO: renamed from: m */
    public T mo108246m() {
        return null;
    }

    /* JADX INFO: renamed from: n */
    public Object m108247n() {
        return this.f80033k;
    }

    /* JADX INFO: renamed from: o */
    public v36<INFO> m108248o() {
        v36<INFO> v36Var = this.f80028f;
        return v36Var == null ? li2.m154273g() : v36Var;
    }

    /* JADX INFO: renamed from: p */
    public u36<INFO> m108249p() {
        return this.f80029g;
    }

    /* JADX INFO: renamed from: q */
    public Drawable m108250q() {
        return this.f80031i;
    }

    /* JADX INFO: renamed from: r */
    public abstract i6c<T> mo108251r();

    @Override // p153l.ytd.InterfaceC21682a
    public void release() {
        this.f80023a.m8255b(DraweeEventTracker.Event.ON_RELEASE_CONTROLLER);
        i6d0 i6d0Var = this.f80026d;
        if (i6d0Var != null) {
            i6d0Var.m138806c();
        }
        jmj jmjVar = this.f80027e;
        if (jmjVar != null) {
            jmjVar.m146163e();
        }
        dve0 dve0Var = this.f80030h;
        if (dve0Var != null) {
            dve0Var.reset();
        }
        m108219P();
    }

    /* JADX INFO: renamed from: s */
    public final Rect m108252s() {
        dve0 dve0Var = this.f80030h;
        if (dve0Var == null) {
            return null;
        }
        return dve0Var.getBounds();
    }

    /* JADX INFO: renamed from: t */
    public jmj m108253t() {
        return this.f80027e;
    }

    public String toString() {
        return i950.m139075b(this).m139078c("isAttached", this.f80034l).m139078c("isRequestSubmitted", this.f80035m).m139078c("hasFetchFailed", this.f80037o).m139076a("fetchedImage", mo108256w(this.f80041s)).m139077b("events", this.f80023a.toString()).toString();
    }

    /* JADX INFO: renamed from: u */
    public String m108254u() {
        return this.f80032j;
    }

    /* JADX INFO: renamed from: v */
    public String m108255v(T t) {
        return t != null ? t.getClass().getSimpleName() : "<null>";
    }

    /* JADX INFO: renamed from: w */
    public int mo108256w(T t) {
        return System.identityHashCode(t);
    }

    /* JADX INFO: renamed from: x */
    public abstract INFO mo108257x(T t);

    /* JADX INFO: renamed from: y */
    public Uri mo108258y() {
        return null;
    }

    /* JADX INFO: renamed from: z */
    public i6d0 m108259z() {
        if (this.f80026d == null) {
            this.f80026d = new i6d0();
        }
        return this.f80026d;
    }

    /* JADX INFO: renamed from: a0 */
    public void m108231a0(x36 x36Var) {
    }

    /* JADX INFO: renamed from: L */
    public void mo108215L(String str, T t) {
    }
}
