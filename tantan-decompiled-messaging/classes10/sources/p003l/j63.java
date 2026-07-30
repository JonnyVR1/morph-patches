package p003l;

import android.net.NetworkInfo;
import android.util.Pair;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.data.BoostStatus;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.d30;
import l.e30;
import l.jo0;
import l.m250;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.w9j;
import l.x9j;
import l.xaj0;
import l.xma;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class j63 {

    /* JADX INFO: renamed from: a */
    public long f5251a;

    /* JADX INFO: renamed from: b */
    public boolean f5252b;

    /* JADX INFO: renamed from: c */
    public c4g0 f5253c;

    /* JADX INFO: renamed from: d */
    public c4g0 f5254d;

    /* JADX INFO: renamed from: e */
    public final a<Pair<Integer, xaj0<String, Integer, Long>>> f5255e;

    /* JADX INFO: renamed from: f */
    public final d30 f5256f;

    /* JADX INFO: renamed from: g */
    public final d30 f5257g;

    /* JADX INFO: renamed from: h */
    public boolean f5258h;

    /* JADX INFO: renamed from: l.j63$a */
    public static class C3353a {
        private static final j63 INSTANCE = new j63();
    }

    public j63() {
        this.f5251a = 0L;
        this.f5252b = false;
        this.f5255e = a.b();
        this.f5258h = true;
        this.f5256f = new d30() { // from class: l.a63
            public final void call() {
                this.f2733a.m7359k();
            }
        };
        this.f5257g = new d30() { // from class: l.b63
            public final void call() {
                this.f3332a.m7360l();
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m7349a(Optional optional) {
        if (optional.isPresent()) {
            return Boolean.TRUE;
        }
        if (ConnectivityReceiver.g()) {
            CoreModule.c.J0.V3();
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Optional m7354f(NetworkInfo networkInfo, Optional optional) {
        return optional;
    }

    /* JADX INFO: renamed from: j */
    public static j63 m7358j() {
        return C3353a.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m7359k() {
        mkd0.z(this.f5253c);
        this.f5253c = null;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m7360l() {
        mkd0.z(this.f5254d);
        this.f5254d = null;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m7361m(Throwable th) {
        this.f5256f.call();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m7362n(Boolean bool) {
        m7366r();
    }

    /* JADX INFO: renamed from: o */
    public c4g0 m7363o(m250<Pair<Integer, xaj0<String, Integer, Long>>> m250Var) {
        m7365q();
        return this.f5255e.subscribe(m250Var);
    }

    /* JADX INFO: renamed from: p */
    public final void m7364p(int i, xaj0<String, Integer, Long> xaj0Var) {
        if (i != 1) {
            this.f5256f.call();
            this.f5258h = true;
            if (i == 2) {
                CoreModule.c.J0.d4();
            }
        }
        this.f5255e.onNext(Pair.create(Integer.valueOf(i), xaj0Var));
        if (i == 2) {
            this.f5255e.onNext(Pair.create(-1, null));
        }
        if (i == 1 && CoreModule.c.J0.q0 && mqi0.o() - this.f5251a > 3000) {
            this.f5251a = mqi0.o();
            CoreModule.c.J0.s3();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m7365q() {
        m7369u();
    }

    /* JADX INFO: renamed from: r */
    public final void m7366r() {
        if (!CoreModule.c.J0.F3() && !CoreModule.c.J0.G3()) {
            m7364p(-1, null);
            return;
        }
        long jW3 = CoreModule.c.J0.w3() - qib0.H.guessedCurrentServerTime();
        if (jW3 <= 0) {
            m7364p(2, null);
            return;
        }
        if (CoreModule.o.d().Vd() && this.f5252b && !xma.C3()) {
            CoreModule.c.J0.V3();
        }
        if (CoreModule.o.d().Vd() && xma.C3()) {
            this.f5252b = xma.C3();
        }
        int iM5304e = aa3.m5304e(jW3);
        if (iM5304e >= 100) {
            m7364p(2, null);
            return;
        }
        String str = String.format(Locale.getDefault(), "%.1f", Float.valueOf(aa3.m5303d(iM5304e, jW3, this.f5258h)));
        this.f5258h = false;
        m7364p(1, xaj0.a(str, Integer.valueOf(iM5304e), Long.valueOf(jW3)));
        CoreModule.c.J0.Z3(true);
        m7368t(new d30() { // from class: l.g63
            public final void call() {
                this.f4584a.m7366r();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m7367s() {
        this.f5257g.call();
        m7364p(-1, null);
        CoreModule.c.J0.e0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: t */
    public final void m7368t(final d30 d30Var) {
        if (this.f5253c == null) {
            this.f5253c = c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.h63
                public final void call(Object obj) {
                    d30Var.call();
                }
            }, new e30() { // from class: l.i63
                public final void call(Object obj) {
                    this.f4998a.m7361m((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m7369u() {
        if (NullChecker.a(this.f5254d)) {
            return;
        }
        this.f5254d = c.combineLatest(ConnectivityReceiver.m(), CoreModule.c.J0.t3(), new x9j() { // from class: l.c63
            public final Object call(Object obj, Object obj2) {
                return j63.m7354f((NetworkInfo) obj, (Optional) obj2);
            }
        }).filter(new w9j() { // from class: l.d63
            public final Object call(Object obj) {
                return j63.m7349a((Optional) obj);
            }
        }).map(new w9j() { // from class: l.e63
            public final Object call(Object obj) {
                return Boolean.valueOf(((BoostStatus) ((Optional) obj).get()).active);
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.f63
            public final void call(Object obj) {
                this.f4395a.m7362n((Boolean) obj);
            }
        }));
    }
}
