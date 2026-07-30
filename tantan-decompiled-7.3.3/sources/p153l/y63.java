package p153l;

import android.net.NetworkInfo;
import android.util.Pair;
import com.google.common.base.Optional;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.BoostStatus;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class y63 {

    /* JADX INFO: renamed from: a */
    public long f197619a;

    /* JADX INFO: renamed from: b */
    public boolean f197620b;

    /* JADX INFO: renamed from: c */
    public kcg0 f197621c;

    /* JADX INFO: renamed from: d */
    public kcg0 f197622d;

    /* JADX INFO: renamed from: e */
    public final C22507a<Pair<Integer, bkj0<String, Integer, Long>>> f197623e;

    /* JADX INFO: renamed from: f */
    public final x20 f197624f;

    /* JADX INFO: renamed from: g */
    public final x20 f197625g;

    /* JADX INFO: renamed from: h */
    public boolean f197626h;

    /* JADX INFO: renamed from: l.y63$a */
    public static class C21525a {
        private static final y63 INSTANCE = new y63();
    }

    public y63() {
        this.f197619a = 0L;
        this.f197620b = false;
        this.f197623e = C22507a.m222758b();
        this.f197626h = true;
        this.f197624f = new x20() { // from class: l.p63
            @Override // p153l.x20
            public final void call() {
                this.f150732a.m214367k();
            }
        };
        this.f197625g = new x20() { // from class: l.q63
            @Override // p153l.x20
            public final void call() {
                this.f155779a.m214368l();
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m214357a(Optional optional) {
        if (optional.isPresent()) {
            return Boolean.TRUE;
        }
        if (ConnectivityReceiver.m82467g()) {
            CoreModule.f18264c.f20318J0.m156781V3();
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Optional m214362f(NetworkInfo networkInfo, Optional optional) {
        return optional;
    }

    /* JADX INFO: renamed from: j */
    public static y63 m214366j() {
        return C21525a.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m214367k() {
        psd0.m173633z(this.f197621c);
        this.f197621c = null;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m214368l() {
        psd0.m173633z(this.f197622d);
        this.f197622d = null;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m214369m(Throwable th) {
        this.f197624f.call();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m214370n(Boolean bool) {
        m214375s();
    }

    /* JADX INFO: renamed from: o */
    public C22507a<Pair<Integer, bkj0<String, Integer, Long>>> m214371o() {
        m214374r();
        return this.f197623e;
    }

    /* JADX INFO: renamed from: p */
    public kcg0 m214372p(bb50<Pair<Integer, bkj0<String, Integer, Long>>> bb50Var) {
        m214374r();
        return this.f197623e.subscribe(bb50Var);
    }

    /* JADX INFO: renamed from: q */
    public final void m214373q(int i, bkj0<String, Integer, Long> bkj0Var) {
        if (i != 1) {
            this.f197624f.call();
            this.f197626h = true;
            if (i == 2) {
                CoreModule.f18264c.f20318J0.m156789d4();
            }
        }
        this.f197623e.m137019l(Pair.create(Integer.valueOf(i), bkj0Var));
        if (i == 2) {
            this.f197623e.m137019l(Pair.create(-1, null));
        }
        if (i == 1 && CoreModule.f18264c.f20318J0.f134527q0 && pzi0.m174454o() - this.f197619a > 3000) {
            this.f197619a = pzi0.m174454o();
            CoreModule.f18264c.f20318J0.m156792s3();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m214374r() {
        m214378v();
    }

    /* JADX INFO: renamed from: s */
    public final void m214375s() {
        if (!CoreModule.f18264c.f20318J0.m156766F3() && !CoreModule.f18264c.f20318J0.m156767G3()) {
            m214373q(-1, null);
            return;
        }
        long jM156795w3 = CoreModule.f18264c.f20318J0.m156795w3() - uqb0.f180376H.guessedCurrentServerTime();
        if (jM156795w3 <= 0) {
            m214373q(2, null);
            return;
        }
        if (CoreModule.f18276o.m132214d().mo34769Vd() && this.f197620b && !joa.m146354D3()) {
            CoreModule.f18264c.f20318J0.m156781V3();
        }
        if (CoreModule.f18276o.m132214d().mo34769Vd() && joa.m146354D3()) {
            this.f197620b = joa.m146354D3();
        }
        int iM171411e = pa3.m171411e(jM156795w3);
        if (iM171411e >= 100) {
            m214373q(2, null);
            return;
        }
        String str = String.format(Locale.getDefault(), "%.1f", Float.valueOf(pa3.m171410d(iM171411e, jM156795w3, this.f197626h)));
        this.f197626h = false;
        m214373q(1, bkj0.m104818a(str, Integer.valueOf(iM171411e), Long.valueOf(jM156795w3)));
        CoreModule.f18264c.f20318J0.m156785Z3(true);
        m214377u(new x20() { // from class: l.v63
            @Override // p153l.x20
            public final void call() {
                this.f182600a.m214375s();
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public void m214376t() {
        this.f197625g.call();
        m214373q(-1, null);
        CoreModule.f18264c.f20318J0.f134515e0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: u */
    public final void m214377u(final x20 x20Var) {
        if (this.f197621c == null) {
            this.f197621c = C22421c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.w63
                @Override // p153l.y20
                public final void call(Object obj) {
                    x20Var.call();
                }
            }, new y20() { // from class: l.x63
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f192554a.m214369m((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m214378v() {
        if (NullChecker.m82486a(this.f197622d)) {
            return;
        }
        this.f197622d = C22421c.combineLatest(ConnectivityReceiver.m82473m(), CoreModule.f18264c.f20318J0.m156793t3(), new rcj() { // from class: l.r63
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return y63.m214362f((NetworkInfo) obj, (Optional) obj2);
            }
        }).filter(new qcj() { // from class: l.s63
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return y63.m214357a((Optional) obj);
            }
        }).map(new qcj() { // from class: l.t63
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BoostStatus) ((Optional) obj).get()).active);
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.u63
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177704a.m214370n((Boolean) obj);
            }
        }));
    }
}
