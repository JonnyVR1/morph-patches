package p149l;

import android.app.Activity;
import android.util.Pair;
import com.p046p1.mobile.android.app.Act;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes4.dex */
public class l6t {

    /* JADX INFO: renamed from: b */
    public final nt10 f126661b;

    /* JADX INFO: renamed from: d */
    public c4g0 f126663d;

    /* JADX INFO: renamed from: f */
    public c4g0 f126665f;

    /* JADX INFO: renamed from: g */
    public c4g0 f126666g;

    /* JADX INFO: renamed from: h */
    public String f126667h;

    /* JADX INFO: renamed from: a */
    public List<xxl> f126660a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final C22392a<Pair<Boolean, Boolean>> f126662c = C22392a.m221512b();

    /* JADX INFO: renamed from: e */
    public f6t f126664e = new f6t();

    public l6t(nt10 nt10Var) {
        this.f126661b = nt10Var;
        m148762f();
        m148763g();
        m148761e();
        m148770n();
    }

    /* JADX INFO: renamed from: d */
    public void m148760d() {
        this.f126662c.onCompleted();
        mkd0.m154992z(this.f126663d);
        mkd0.m154992z(this.f126665f);
        mkd0.m154992z(this.f126666g);
        m148771o();
    }

    /* JADX INFO: renamed from: e */
    public final void m148761e() {
        this.f126663d = Act.foreground().subscribe(ffw.m121193d(new e30() { // from class: l.g6t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101304a.m148765i((Act.C4299r) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public final void m148762f() {
        this.f126666g = Act.mediaCapture().subscribe(ffw.m121193d(new e30() { // from class: l.j6t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116537a.m148766j((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final void m148763g() {
        this.f126665f = Act.foreground().skip(this.f126661b instanceof dkf0 ? 1 : 0).subscribe(ffw.m121193d(new e30() { // from class: l.i6t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111780a.m148767k((Act.C4299r) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public boolean m148764h() {
        return this.f126664e.m119636a();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m148765i(Act.C4299r c4299r) {
        C22392a<Pair<Boolean, Boolean>> c22392a = this.f126662c;
        if (c4299r == null) {
            Boolean bool = Boolean.FALSE;
            c22392a.m132487l(new Pair<>(bool, bool));
            return;
        }
        Pair<Boolean, Boolean> pairM221515e = c22392a.m221515e();
        if (pairM221515e == null || !((Boolean) pairM221515e.second).booleanValue()) {
            this.f126662c.m132487l(new Pair<>(Boolean.FALSE, Boolean.TRUE));
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m148766j(Boolean bool) {
        this.f126664e.m119638c(true);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m148767k(Act.C4299r c4299r) {
        if (c4299r == null) {
            return;
        }
        WeakReference<Activity> weakReference = c4299r.f15343a;
        Activity activity = weakReference != null ? weakReference.get() : null;
        if ("voice".equals(this.f126667h) && (ypv.f199493a.m199322O(activity) || ypv.f199493a.m199320M(activity))) {
            this.f126664e.m119638c(false);
            return;
        }
        boolean zM199330W = ypv.f199493a.m199330W(activity);
        f6t f6tVar = this.f126664e;
        if (zM199330W) {
            f6tVar.m119638c(true);
        } else {
            f6tVar.m119638c(false);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m148768l() {
        this.f126660a.add(new myi(this.f126661b, this.f126662c, this.f126664e));
        this.f126660a.add(new zhx(this.f126661b, this.f126662c, this.f126664e));
        this.f126660a.add(new cb1(this.f126661b, this.f126662c, this.f126664e));
        this.f126660a.add(new mkx(this.f126661b, this.f126662c, this.f126664e));
        nt10 nt10Var = this.f126661b;
        if (nt10Var instanceof dkf0) {
            dkf0 dkf0Var = (dkf0) nt10Var;
            this.f126660a.add(new yef0(dkf0Var, this.f126662c, this.f126664e));
            this.f126660a.add(new y2b0(dkf0Var, this.f126662c, this.f126664e));
        }
        vwb.m200354z(this.f126660a, new e30() { // from class: l.h6t
            @Override // p149l.e30
            public final void call(Object obj) {
                ((xxl) obj).mo105961f();
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m148769m(String str) {
        this.f126667h = str;
    }

    /* JADX INFO: renamed from: n */
    public final void m148770n() {
        m148768l();
    }

    /* JADX INFO: renamed from: o */
    public final void m148771o() {
        vwb.m200354z(this.f126660a, new e30() { // from class: l.k6t
            @Override // p149l.e30
            public final void call(Object obj) {
                ((xxl) obj).mo105960b();
            }
        });
        this.f126660a.clear();
    }
}
