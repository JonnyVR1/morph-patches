package p149l;

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

/* JADX INFO: renamed from: l.h7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17238h7<T, INFO> implements hce, ksd.InterfaceC18070a, qjj.InterfaceC19523a {

    /* JADX INFO: renamed from: w */
    public static final Map<String, Object> f106158w = ImmutableMap.m8148of("component_tag", "drawee");

    /* JADX INFO: renamed from: x */
    public static final Map<String, Object> f106159x = ImmutableMap.m8149of("origin", "memory_bitmap", "origin_sub", "shortcut");

    /* JADX INFO: renamed from: y */
    public static final Class<?> f106160y = AbstractC17238h7.class;

    /* JADX INFO: renamed from: b */
    public final ksd f106162b;

    /* JADX INFO: renamed from: c */
    public final Executor f106163c;

    /* JADX INFO: renamed from: d */
    public fyc0 f106164d;

    /* JADX INFO: renamed from: e */
    public qjj f106165e;

    /* JADX INFO: renamed from: f */
    public q26<INFO> f106166f;

    /* JADX INFO: renamed from: h */
    public wme0 f106168h;

    /* JADX INFO: renamed from: i */
    public Drawable f106169i;

    /* JADX INFO: renamed from: j */
    public String f106170j;

    /* JADX INFO: renamed from: k */
    public Object f106171k;

    /* JADX INFO: renamed from: l */
    public boolean f106172l;

    /* JADX INFO: renamed from: m */
    public boolean f106173m;

    /* JADX INFO: renamed from: n */
    public boolean f106174n;

    /* JADX INFO: renamed from: o */
    public boolean f106175o;

    /* JADX INFO: renamed from: p */
    public boolean f106176p;

    /* JADX INFO: renamed from: q */
    public String f106177q;

    /* JADX INFO: renamed from: r */
    public c5c<T> f106178r;

    /* JADX INFO: renamed from: s */
    public T f106179s;

    /* JADX INFO: renamed from: v */
    public Drawable f106182v;

    /* JADX INFO: renamed from: a */
    public final DraweeEventTracker f106161a = DraweeEventTracker.m8200a();

    /* JADX INFO: renamed from: g */
    public szi<INFO> f106167g = new szi<>();

    /* JADX INFO: renamed from: t */
    public boolean f106180t = true;

    /* JADX INFO: renamed from: u */
    public boolean f106181u = false;

    /* JADX INFO: renamed from: l.h7$a */
    public class a extends ti2<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f106183a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f106184b;

        public a(String str, boolean z) {
            this.f106183a = str;
            this.f106184b = z;
        }

        @Override // p149l.ti2, p149l.m5c
        /* JADX INFO: renamed from: a */
        public void mo129617a(c5c<T> c5cVar) {
            boolean zMo8182e = c5cVar.mo8182e();
            AbstractC17238h7.this.m129583N(this.f106183a, c5cVar, c5cVar.mo8180c(), zMo8182e);
        }

        @Override // p149l.ti2
        /* JADX INFO: renamed from: e */
        public void mo102384e(c5c<T> c5cVar) {
            AbstractC17238h7.this.m129581K(this.f106183a, c5cVar, c5cVar.mo8179b(), true);
        }

        @Override // p149l.ti2
        /* JADX INFO: renamed from: f */
        public void mo96183f(c5c<T> c5cVar) {
            boolean zMo8182e = c5cVar.mo8182e();
            boolean zMo8181d = c5cVar.mo8181d();
            float fMo8180c = c5cVar.mo8180c();
            T result = c5cVar.getResult();
            if (result != null) {
                AbstractC17238h7.this.m129582M(this.f106183a, c5cVar, result, fMo8180c, zMo8182e, this.f106184b, zMo8181d);
            } else if (zMo8182e) {
                AbstractC17238h7.this.m129581K(this.f106183a, c5cVar, new NullPointerException(), true);
            }
        }
    }

    /* JADX INFO: renamed from: l.h7$b */
    public static class b<INFO> extends tzi<INFO> {
        /* JADX INFO: renamed from: j */
        public static <INFO> b<INFO> m129618j(q26<? super INFO> q26Var, q26<? super INFO> q26Var2) {
            if (o6j.m162852d()) {
                o6j.m162850a("AbstractDraweeController#createInternal");
            }
            b<INFO> bVar = new b<>();
            bVar.m191192g(q26Var);
            bVar.m191192g(q26Var2);
            if (o6j.m162852d()) {
                o6j.m162851b();
            }
            return bVar;
        }
    }

    public AbstractC17238h7(ksd ksdVar, Executor executor, String str, Object obj) {
        this.f106162b = ksdVar;
        this.f106163c = executor;
        m129573B(str, obj);
    }

    /* JADX INFO: renamed from: A */
    public final wme0 m129572A() {
        wme0 wme0Var = this.f106168h;
        if (wme0Var != null) {
            return wme0Var;
        }
        j850.m140190a("mSettableDraweeHierarchy is null; Caller context: ", this.f106171k);
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final synchronized void m129573B(String str, Object obj) {
        ksd ksdVar;
        try {
            if (o6j.m162852d()) {
                o6j.m162850a("AbstractDraweeController#init");
            }
            this.f106161a.m8201b(DraweeEventTracker.Event.ON_INIT_CONTROLLER);
            if (!this.f106180t && (ksdVar = this.f106162b) != null) {
                ksdVar.mo147053a(this);
            }
            this.f106172l = false;
            this.f106174n = false;
            m129584P();
            this.f106176p = false;
            fyc0 fyc0Var = this.f106164d;
            if (fyc0Var != null) {
                fyc0Var.m123756a();
            }
            qjj qjjVar = this.f106165e;
            if (qjjVar != null) {
                qjjVar.m174996a();
                this.f106165e.m175000f(this);
            }
            q26<INFO> q26Var = this.f106166f;
            if (q26Var instanceof b) {
                ((b) q26Var).m191193h();
            } else {
                this.f106166f = null;
            }
            wme0 wme0Var = this.f106168h;
            if (wme0Var != null) {
                wme0Var.reset();
                this.f106168h.mo112056c(null);
                this.f106168h = null;
            }
            this.f106169i = null;
            if (tsf.m190547m(2)) {
                tsf.m190551q(f106160y, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f106170j, str);
            }
            this.f106170j = str;
            this.f106171k = obj;
            if (o6j.m162852d()) {
                o6j.m162851b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: C */
    public void m129574C(String str, Object obj) {
        m129573B(str, obj);
        this.f106180t = false;
        this.f106181u = false;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m129575D(String str, c5c<T> c5cVar) {
        if (c5cVar == null && this.f106178r == null) {
            return true;
        }
        return str.equals(this.f106170j) && c5cVar == this.f106178r && this.f106173m;
    }

    /* JADX INFO: renamed from: E */
    public boolean m129576E() {
        return this.f106181u;
    }

    /* JADX INFO: renamed from: F */
    public final void m129577F(String str, Throwable th) {
        if (tsf.m190547m(2)) {
            tsf.m190552r(f106160y, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f106170j, str, th);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m129578G(String str, T t) {
        if (tsf.m190547m(2)) {
            tsf.m190553s(f106160y, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f106170j, str, m129615v(t), Integer.valueOf(mo116647w(t)));
        }
    }

    /* JADX INFO: renamed from: H */
    public final p26.C19111a m129579H(Map<String, Object> map, Map<String, Object> map2, Uri uri) {
        String str;
        PointF pointFM112066m;
        wme0 wme0Var = this.f106168h;
        if (wme0Var instanceof djj) {
            djj djjVar = (djj) wme0Var;
            String strValueOf = String.valueOf(djjVar.m112067n());
            pointFM112066m = djjVar.m112066m();
            str = strValueOf;
        } else {
            str = null;
            pointFM112066m = null;
        }
        return w100.m200911a(f106158w, f106159x, map, null, m129612s(), str, pointFM112066m, map2, m129608n(), m129576E(), uri);
    }

    /* JADX INFO: renamed from: I */
    public final p26.C19111a m129580I(c5c<T> c5cVar, INFO info, Uri uri) {
        return m129579H(c5cVar == null ? null : c5cVar.getExtras(), mo116625J(info), uri);
    }

    /* JADX INFO: renamed from: J */
    public abstract Map<String, Object> mo116625J(INFO info);

    /* JADX INFO: renamed from: K */
    public final void m129581K(String str, c5c<T> c5cVar, Throwable th, boolean z) {
        Drawable drawable;
        if (o6j.m162852d()) {
            o6j.m162850a("AbstractDraweeController#onFailureInternal");
        }
        if (!m129575D(str, c5cVar)) {
            m129577F("ignore_old_datasource @ onFailure", th);
            c5cVar.close();
            if (o6j.m162852d()) {
                o6j.m162851b();
                return;
            }
            return;
        }
        this.f106161a.m8201b(z ? DraweeEventTracker.Event.ON_DATASOURCE_FAILURE : DraweeEventTracker.Event.ON_DATASOURCE_FAILURE_INT);
        if (z) {
            m129577F("final_failed @ onFailure", th);
            this.f106178r = null;
            this.f106175o = true;
            wme0 wme0Var = this.f106168h;
            if (wme0Var != null) {
                if (this.f106176p && (drawable = this.f106182v) != null) {
                    wme0Var.mo112059f(drawable, 1.0f, true);
                } else if (m129604f0()) {
                    wme0Var.mo112054a(th);
                } else {
                    wme0Var.mo112057d(th);
                }
            }
            m129586S(th, c5cVar);
        } else {
            m129577F("intermediate_failed @ onFailure", th);
            m129587T(th);
        }
        if (o6j.m162852d()) {
            o6j.m162851b();
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m129582M(String str, c5c<T> c5cVar, T t, float f, boolean z, boolean z2, boolean z3) {
        try {
            if (o6j.m162852d()) {
                o6j.m162850a("AbstractDraweeController#onNewResultInternal");
            }
            if (!m129575D(str, c5cVar)) {
                m129578G("ignore_old_datasource @ onNewResult", t);
                mo116628Q(t);
                c5cVar.close();
                if (o6j.m162852d()) {
                    o6j.m162851b();
                    return;
                }
                return;
            }
            this.f106161a.m8201b(z ? DraweeEventTracker.Event.ON_DATASOURCE_RESULT : DraweeEventTracker.Event.ON_DATASOURCE_RESULT_INT);
            try {
                Drawable drawableMo116633l = mo116633l(t);
                T t2 = this.f106179s;
                Drawable drawable = this.f106182v;
                this.f106179s = t;
                this.f106182v = drawableMo116633l;
                try {
                    if (z) {
                        m129578G("set_final_result @ onNewResult", t);
                        this.f106178r = null;
                        m129572A().mo112059f(drawableMo116633l, 1.0f, z2);
                        m129591X(str, t, c5cVar);
                    } else if (z3) {
                        m129578G("set_temporary_result @ onNewResult", t);
                        m129572A().mo112059f(drawableMo116633l, 1.0f, z2);
                        m129591X(str, t, c5cVar);
                    } else {
                        m129578G("set_intermediate_result @ onNewResult", t);
                        m129572A().mo112059f(drawableMo116633l, f, z2);
                        m129588U(str, t);
                    }
                    if (drawable != null && drawable != drawableMo116633l) {
                        mo116627O(drawable);
                    }
                    if (t2 != null && t2 != t) {
                        m129578G("release_previous_result @ onNewResult", t2);
                        mo116628Q(t2);
                    }
                    if (o6j.m162852d()) {
                        o6j.m162851b();
                    }
                } catch (Throwable th) {
                    if (drawable != null && drawable != drawableMo116633l) {
                        mo116627O(drawable);
                    }
                    if (t2 != null && t2 != t) {
                        m129578G("release_previous_result @ onNewResult", t2);
                        mo116628Q(t2);
                    }
                    throw th;
                }
            } catch (Exception e) {
                m129578G("drawable_failed @ onNewResult", t);
                mo116628Q(t);
                m129581K(str, c5cVar, e, z);
                if (o6j.m162852d()) {
                    o6j.m162851b();
                }
            }
        } catch (Throwable th2) {
            if (o6j.m162852d()) {
                o6j.m162851b();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m129583N(String str, c5c<T> c5cVar, float f, boolean z) {
        if (!m129575D(str, c5cVar)) {
            m129577F("ignore_old_datasource @ onProgress", null);
            c5cVar.close();
        } else {
            if (z) {
                return;
            }
            this.f106168h.mo112058e(f, false);
        }
    }

    /* JADX INFO: renamed from: O */
    public abstract void mo116627O(Drawable drawable);

    /* JADX INFO: renamed from: P */
    public final void m129584P() {
        Map<String, Object> extras;
        boolean z = this.f106173m;
        this.f106173m = false;
        this.f106175o = false;
        c5c<T> c5cVar = this.f106178r;
        Map<String, Object> map = null;
        if (c5cVar != null) {
            extras = c5cVar.getExtras();
            this.f106178r.close();
            this.f106178r = null;
        } else {
            extras = null;
        }
        Drawable drawable = this.f106182v;
        if (drawable != null) {
            mo116627O(drawable);
        }
        if (this.f106177q != null) {
            this.f106177q = null;
        }
        this.f106182v = null;
        T t = this.f106179s;
        if (t != null) {
            Map<String, Object> mapMo116625J = mo116625J(mo116649x(t));
            m129578G("release", this.f106179s);
            mo116628Q(this.f106179s);
            this.f106179s = null;
            map = mapMo116625J;
        }
        if (z) {
            m129589V(extras, map);
        }
    }

    /* JADX INFO: renamed from: Q */
    public abstract void mo116628Q(T t);

    /* JADX INFO: renamed from: R */
    public void m129585R(p26<INFO> p26Var) {
        this.f106167g.m186795m(p26Var);
    }

    /* JADX INFO: renamed from: S */
    public final void m129586S(Throwable th, c5c<T> c5cVar) {
        p26.C19111a c19111aM129580I = m129580I(c5cVar, null, null);
        m129609o().mo48281d(this.f106170j, th);
        m129610p().mo111858d(this.f106170j, th, c19111aM129580I);
    }

    /* JADX INFO: renamed from: T */
    public final void m129587T(Throwable th) {
        m129609o().mo116620f(this.f106170j, th);
        m129610p().mo111859e(this.f106170j);
    }

    /* JADX INFO: renamed from: U */
    public final void m129588U(String str, T t) {
        INFO infoMo116649x = mo116649x(t);
        m129609o().mo48280b(str, infoMo116649x);
        m129610p().mo111857b(str, infoMo116649x);
    }

    /* JADX INFO: renamed from: V */
    public final void m129589V(Map<String, Object> map, Map<String, Object> map2) {
        m129609o().mo102385a(this.f106170j);
        m129610p().mo111862j(this.f106170j, m129579H(map, map2, null));
    }

    /* JADX INFO: renamed from: W */
    public void m129590W(c5c<T> c5cVar, INFO info) {
        m129609o().mo116619c(this.f106170j, this.f106171k);
        m129610p().mo111861i(this.f106170j, this.f106171k, m129580I(c5cVar, info, mo116651y()));
    }

    /* JADX INFO: renamed from: X */
    public final void m129591X(String str, T t, c5c<T> c5cVar) {
        INFO infoMo116649x = mo116649x(t);
        m129609o().mo8234e(str, infoMo116649x, mo129603f());
        m129610p().mo111860h(str, infoMo116649x, m129580I(c5cVar, infoMo116649x, null));
    }

    /* JADX INFO: renamed from: Y */
    public void m129592Y(String str) {
        this.f106177q = str;
    }

    /* JADX INFO: renamed from: Z */
    public void m129593Z(Drawable drawable) {
        this.f106169i = drawable;
        wme0 wme0Var = this.f106168h;
        if (wme0Var != null) {
            wme0Var.mo112056c(drawable);
        }
    }

    @Override // p149l.qjj.InterfaceC19523a
    /* JADX INFO: renamed from: a */
    public boolean mo129594a() {
        if (tsf.m190547m(2)) {
            tsf.m190550p(f106160y, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f106170j);
        }
        if (!m129604f0()) {
            return false;
        }
        this.f106164d.m123757b();
        this.f106168h.reset();
        m129605g0();
        return true;
    }

    @Override // p149l.hce
    /* JADX INFO: renamed from: b */
    public boolean mo129596b(MotionEvent motionEvent) {
        if (tsf.m190547m(2)) {
            tsf.m190551q(f106160y, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f106170j, motionEvent);
        }
        qjj qjjVar = this.f106165e;
        if (qjjVar == null) {
            return false;
        }
        if (!qjjVar.m174997b() && !m129602e0()) {
            return false;
        }
        this.f106165e.m174998d(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    public void m129597b0(qjj qjjVar) {
        this.f106165e = qjjVar;
        if (qjjVar != null) {
            qjjVar.m175000f(this);
        }
    }

    @Override // p149l.hce
    /* JADX INFO: renamed from: c */
    public void mo116629c(ice iceVar) {
        if (tsf.m190547m(2)) {
            tsf.m190551q(f106160y, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f106170j, iceVar);
        }
        this.f106161a.m8201b(iceVar != null ? DraweeEventTracker.Event.ON_SET_HIERARCHY : DraweeEventTracker.Event.ON_CLEAR_HIERARCHY);
        if (this.f106173m) {
            this.f106162b.mo147053a(this);
            release();
        }
        wme0 wme0Var = this.f106168h;
        if (wme0Var != null) {
            wme0Var.mo112056c(null);
            this.f106168h = null;
        }
        if (iceVar != null) {
            rf80.m179111b(Boolean.valueOf(iceVar instanceof wme0));
            wme0 wme0Var2 = (wme0) iceVar;
            this.f106168h = wme0Var2;
            wme0Var2.mo112056c(this.f106169i);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m129598c0(boolean z) {
        this.f106181u = z;
    }

    @Override // p149l.hce
    /* JADX INFO: renamed from: d */
    public void mo129599d() {
        if (o6j.m162852d()) {
            o6j.m162850a("AbstractDraweeController#onAttach");
        }
        if (tsf.m190547m(2)) {
            tsf.m190551q(f106160y, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.f106170j, this.f106173m ? "request already submitted" : "request needs submit");
        }
        this.f106161a.m8201b(DraweeEventTracker.Event.ON_ATTACH_CONTROLLER);
        rf80.m179116g(this.f106168h);
        this.f106162b.mo147053a(this);
        this.f106172l = true;
        if (!this.f106173m) {
            m129605g0();
        }
        if (o6j.m162852d()) {
            o6j.m162851b();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m129600d0(boolean z) {
        this.f106176p = z;
    }

    @Override // p149l.hce
    /* JADX INFO: renamed from: e */
    public void mo129601e() {
        if (o6j.m162852d()) {
            o6j.m162850a("AbstractDraweeController#onDetach");
        }
        if (tsf.m190547m(2)) {
            tsf.m190550p(f106160y, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f106170j);
        }
        this.f106161a.m8201b(DraweeEventTracker.Event.ON_DETACH_CONTROLLER);
        this.f106172l = false;
        this.f106162b.mo147054d(this);
        if (o6j.m162852d()) {
            o6j.m162851b();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m129602e0() {
        return m129604f0();
    }

    @Override // p149l.hce
    /* JADX INFO: renamed from: f */
    public Animatable mo129603f() {
        Object obj = this.f106182v;
        if (obj instanceof Animatable) {
            return (Animatable) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m129604f0() {
        fyc0 fyc0Var;
        return this.f106175o && (fyc0Var = this.f106164d) != null && fyc0Var.m123760e();
    }

    /* JADX INFO: renamed from: g0 */
    public void m129605g0() {
        if (o6j.m162852d()) {
            o6j.m162850a("AbstractDraweeController#submitRequest");
        }
        T tMo116635m = mo116635m();
        if (tMo116635m != null) {
            if (o6j.m162852d()) {
                o6j.m162850a("AbstractDraweeController#submitRequest->cache");
            }
            this.f106178r = null;
            this.f106173m = true;
            this.f106175o = false;
            this.f106161a.m8201b(DraweeEventTracker.Event.ON_SUBMIT_CACHE_HIT);
            m129590W(this.f106178r, mo116649x(tMo116635m));
            mo116626L(this.f106170j, tMo116635m);
            m129582M(this.f106170j, this.f106178r, tMo116635m, 1.0f, true, true, true);
            if (o6j.m162852d()) {
                o6j.m162851b();
            }
            if (o6j.m162852d()) {
                o6j.m162851b();
                return;
            }
            return;
        }
        this.f106161a.m8201b(DraweeEventTracker.Event.ON_DATASOURCE_SUBMIT);
        this.f106168h.mo112058e(0.0f, true);
        this.f106173m = true;
        this.f106175o = false;
        c5c<T> c5cVarMo116641r = mo116641r();
        this.f106178r = c5cVarMo116641r;
        m129590W(c5cVarMo116641r, null);
        if (tsf.m190547m(2)) {
            tsf.m190551q(f106160y, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f106170j, Integer.valueOf(System.identityHashCode(this.f106178r)));
        }
        this.f106178r.mo8183f(new a(this.f106170j, this.f106178r.mo8178a()), this.f106163c);
        if (o6j.m162852d()) {
            o6j.m162851b();
        }
    }

    @Override // p149l.hce
    public ice getHierarchy() {
        return this.f106168h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public void m129606j(q26<? super INFO> q26Var) {
        rf80.m179116g(q26Var);
        q26<INFO> q26Var2 = this.f106166f;
        if (q26Var2 instanceof b) {
            ((b) q26Var2).m191192g(q26Var);
        } else if (q26Var2 != null) {
            this.f106166f = b.m129618j(q26Var2, q26Var);
        } else {
            this.f106166f = q26Var;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m129607k(p26<INFO> p26Var) {
        this.f106167g.m186794k(p26Var);
    }

    /* JADX INFO: renamed from: l */
    public abstract Drawable mo116633l(T t);

    /* JADX INFO: renamed from: m */
    public T mo116635m() {
        return null;
    }

    /* JADX INFO: renamed from: n */
    public Object m129608n() {
        return this.f106171k;
    }

    /* JADX INFO: renamed from: o */
    public q26<INFO> m129609o() {
        q26<INFO> q26Var = this.f106166f;
        return q26Var == null ? ei2.m116618g() : q26Var;
    }

    /* JADX INFO: renamed from: p */
    public p26<INFO> m129610p() {
        return this.f106167g;
    }

    /* JADX INFO: renamed from: q */
    public Drawable m129611q() {
        return this.f106169i;
    }

    /* JADX INFO: renamed from: r */
    public abstract c5c<T> mo116641r();

    @Override // p149l.ksd.InterfaceC18070a
    public void release() {
        this.f106161a.m8201b(DraweeEventTracker.Event.ON_RELEASE_CONTROLLER);
        fyc0 fyc0Var = this.f106164d;
        if (fyc0Var != null) {
            fyc0Var.m123758c();
        }
        qjj qjjVar = this.f106165e;
        if (qjjVar != null) {
            qjjVar.m174999e();
        }
        wme0 wme0Var = this.f106168h;
        if (wme0Var != null) {
            wme0Var.reset();
        }
        m129584P();
    }

    /* JADX INFO: renamed from: s */
    public final Rect m129612s() {
        wme0 wme0Var = this.f106168h;
        if (wme0Var == null) {
            return null;
        }
        return wme0Var.getBounds();
    }

    /* JADX INFO: renamed from: t */
    public qjj m129613t() {
        return this.f106165e;
    }

    public String toString() {
        return t050.m186815b(this).m186818c("isAttached", this.f106172l).m186818c("isRequestSubmitted", this.f106173m).m186818c("hasFetchFailed", this.f106175o).m186816a("fetchedImage", mo116647w(this.f106179s)).m186817b("events", this.f106161a.toString()).toString();
    }

    /* JADX INFO: renamed from: u */
    public String m129614u() {
        return this.f106170j;
    }

    /* JADX INFO: renamed from: v */
    public String m129615v(T t) {
        return t != null ? t.getClass().getSimpleName() : "<null>";
    }

    /* JADX INFO: renamed from: w */
    public int mo116647w(T t) {
        return System.identityHashCode(t);
    }

    /* JADX INFO: renamed from: x */
    public abstract INFO mo116649x(T t);

    /* JADX INFO: renamed from: y */
    public Uri mo116651y() {
        return null;
    }

    /* JADX INFO: renamed from: z */
    public fyc0 m129616z() {
        if (this.f106164d == null) {
            this.f106164d = new fyc0();
        }
        return this.f106164d;
    }

    /* JADX INFO: renamed from: a0 */
    public void m129595a0(s26 s26Var) {
    }

    /* JADX INFO: renamed from: L */
    public void mo116626L(String str, T t) {
    }
}
