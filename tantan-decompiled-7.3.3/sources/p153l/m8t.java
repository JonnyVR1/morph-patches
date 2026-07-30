package p153l;

import android.app.Activity;
import android.util.Pair;
import com.p051p1.mobile.android.app.Act;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes5.dex */
public class m8t {

    /* JADX INFO: renamed from: b */
    public final v120 f135282b;

    /* JADX INFO: renamed from: d */
    public kcg0 f135284d;

    /* JADX INFO: renamed from: f */
    public kcg0 f135286f;

    /* JADX INFO: renamed from: g */
    public kcg0 f135287g;

    /* JADX INFO: renamed from: h */
    public String f135288h;

    /* JADX INFO: renamed from: a */
    public List<q0m> f135281a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final C22507a<Pair<Boolean, Boolean>> f135283c = C22507a.m222758b();

    /* JADX INFO: renamed from: e */
    public g8t f135285e = new g8t();

    public m8t(v120 v120Var) {
        this.f135282b = v120Var;
        m157504f();
        m157505g();
        m157503e();
        m157512n();
    }

    /* JADX INFO: renamed from: d */
    public void m157502d() {
        this.f135283c.onCompleted();
        psd0.m173633z(this.f135284d);
        psd0.m173633z(this.f135286f);
        psd0.m173633z(this.f135287g);
        m157513o();
    }

    /* JADX INFO: renamed from: e */
    public final void m157503e() {
        this.f135284d = Act.foreground().subscribe(dhw.m115825d(new y20() { // from class: l.h8t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108264a.m157507i((Act.C4450r) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public final void m157504f() {
        this.f135287g = Act.mediaCapture().subscribe(dhw.m115825d(new y20() { // from class: l.k8t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124415a.m157508j((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final void m157505g() {
        this.f135286f = Act.foreground().skip(this.f135282b instanceof msf0 ? 1 : 0).subscribe(dhw.m115825d(new y20() { // from class: l.j8t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118815a.m157509k((Act.C4450r) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public boolean m157506h() {
        return this.f135285e.m129460a();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m157507i(Act.C4450r c4450r) {
        C22507a<Pair<Boolean, Boolean>> c22507a = this.f135283c;
        if (c4450r == null) {
            Boolean bool = Boolean.FALSE;
            c22507a.m137019l(new Pair<>(bool, bool));
            return;
        }
        Pair<Boolean, Boolean> pairM222761e = c22507a.m222761e();
        if (pairM222761e == null || !((Boolean) pairM222761e.second).booleanValue()) {
            this.f135283c.m137019l(new Pair<>(Boolean.FALSE, Boolean.TRUE));
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m157508j(Boolean bool) {
        this.f135285e.m129462c(true);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m157509k(Act.C4450r c4450r) {
        if (c4450r == null) {
            return;
        }
        WeakReference<Activity> weakReference = c4450r.f16062a;
        Activity activity = weakReference != null ? weakReference.get() : null;
        if ("voice".equals(this.f135288h) && (zrv.f205799a.m207644O(activity) || zrv.f205799a.m207642M(activity))) {
            this.f135285e.m129462c(false);
            return;
        }
        boolean zM207652W = zrv.f205799a.m207652W(activity);
        g8t g8tVar = this.f135285e;
        if (zM207652W) {
            g8tVar.m129462c(true);
        } else {
            g8tVar.m129462c(false);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m157510l() {
        this.f135281a.add(new h1j(this.f135282b, this.f135283c, this.f135285e));
        this.f135281a.add(new wqx(this.f135282b, this.f135283c, this.f135285e));
        this.f135281a.add(new jb1(this.f135282b, this.f135283c, this.f135285e));
        this.f135281a.add(new jtx(this.f135282b, this.f135283c, this.f135285e));
        v120 v120Var = this.f135282b;
        if (v120Var instanceof msf0) {
            msf0 msf0Var = (msf0) v120Var;
            this.f135281a.add(new fnf0(msf0Var, this.f135283c, this.f135285e));
            this.f135281a.add(new cbb0(msf0Var, this.f135283c, this.f135285e));
        }
        jyb.m147537z(this.f135281a, new y20() { // from class: l.i8t
            @Override // p153l.y20
            public final void call(Object obj) {
                ((q0m) obj).mo108623f();
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m157511m(String str) {
        this.f135288h = str;
    }

    /* JADX INFO: renamed from: n */
    public final void m157512n() {
        m157510l();
    }

    /* JADX INFO: renamed from: o */
    public final void m157513o() {
        jyb.m147537z(this.f135281a, new y20() { // from class: l.l8t
            @Override // p153l.y20
            public final void call(Object obj) {
                ((q0m) obj).mo108622b();
            }
        });
        this.f135281a.clear();
    }
}
