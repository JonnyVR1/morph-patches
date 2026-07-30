package p002l;

import android.app.Activity;
import android.util.Pair;
import com.p1.mobile.android.app.Act;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import l.c4g0;
import l.e30;
import l.ffw;
import l.mkd0;
import l.vwb;
import l.ypv;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class l6t {

    /* JADX INFO: renamed from: b */
    public final nt10 f14693b;

    /* JADX INFO: renamed from: d */
    public c4g0 f14695d;

    /* JADX INFO: renamed from: f */
    public c4g0 f14697f;

    /* JADX INFO: renamed from: g */
    public c4g0 f14698g;

    /* JADX INFO: renamed from: h */
    public String f14699h;

    /* JADX INFO: renamed from: a */
    public List<xxl> f14692a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final a<Pair<Boolean, Boolean>> f14694c = a.b();

    /* JADX INFO: renamed from: e */
    public f6t f14696e = new f6t();

    public l6t(nt10 nt10Var) {
        this.f14693b = nt10Var;
        m17024f();
        m17025g();
        m17023e();
        m17032n();
    }

    /* JADX INFO: renamed from: d */
    public void m17022d() {
        this.f14694c.onCompleted();
        mkd0.z(this.f14695d);
        mkd0.z(this.f14697f);
        mkd0.z(this.f14698g);
        m17033o();
    }

    /* JADX INFO: renamed from: e */
    public final void m17023e() {
        this.f14695d = Act.foreground().subscribe(ffw.d(new e30() { // from class: l.g6t
            public final void call(Object obj) {
                this.f11289a.m17027i((Act.r) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public final void m17024f() {
        this.f14698g = Act.mediaCapture().subscribe(ffw.d(new e30() { // from class: l.j6t
            public final void call(Object obj) {
                this.f13612a.m17028j((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final void m17025g() {
        this.f14697f = Act.foreground().skip(this.f14693b instanceof dkf0 ? 1 : 0).subscribe(ffw.d(new e30() { // from class: l.i6t
            public final void call(Object obj) {
                this.f13083a.m17029k((Act.r) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public boolean m17026h() {
        return this.f14696e.m12966a();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m17027i(Act.r rVar) {
        a<Pair<Boolean, Boolean>> aVar = this.f14694c;
        if (rVar == null) {
            Boolean bool = Boolean.FALSE;
            aVar.onNext(new Pair(bool, bool));
            return;
        }
        Pair pair = (Pair) aVar.e();
        if (pair == null || !((Boolean) pair.second).booleanValue()) {
            this.f14694c.onNext(new Pair(Boolean.FALSE, Boolean.TRUE));
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m17028j(Boolean bool) {
        this.f14696e.m12968c(true);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m17029k(Act.r rVar) {
        if (rVar == null) {
            return;
        }
        WeakReference weakReference = rVar.a;
        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
        if ("voice".equals(this.f14699h) && (ypv.a.O(activity) || ypv.a.M(activity))) {
            this.f14696e.m12968c(false);
            return;
        }
        boolean zW = ypv.a.W(activity);
        f6t f6tVar = this.f14696e;
        if (zW) {
            f6tVar.m12968c(true);
        } else {
            f6tVar.m12968c(false);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m17030l() {
        this.f14692a.add(new myi(this.f14693b, this.f14694c, this.f14696e));
        this.f14692a.add(new zhx(this.f14693b, this.f14694c, this.f14696e));
        this.f14692a.add(new cb1(this.f14693b, this.f14694c, this.f14696e));
        this.f14692a.add(new mkx(this.f14693b, this.f14694c, this.f14696e));
        nt10 nt10Var = this.f14693b;
        if (nt10Var instanceof dkf0) {
            dkf0 dkf0Var = (dkf0) nt10Var;
            this.f14692a.add(new yef0(dkf0Var, this.f14694c, this.f14696e));
            this.f14692a.add(new y2b0(dkf0Var, this.f14694c, this.f14696e));
        }
        vwb.z(this.f14692a, new e30() { // from class: l.h6t
            public final void call(Object obj) {
                ((xxl) obj).mo10924f();
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m17031m(String str) {
        this.f14699h = str;
    }

    /* JADX INFO: renamed from: n */
    public final void m17032n() {
        m17030l();
    }

    /* JADX INFO: renamed from: o */
    public final void m17033o() {
        vwb.z(this.f14692a, new e30() { // from class: l.k6t
            public final void call(Object obj) {
                ((xxl) obj).mo10923b();
            }
        });
        this.f14692a.clear();
    }
}
