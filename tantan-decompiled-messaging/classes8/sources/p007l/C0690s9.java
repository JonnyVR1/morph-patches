package p007l;

import android.net.NetworkInfo;
import android.util.Pair;
import com.google.common.base.Optional;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.AcceleratePairingStatus;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.d30;
import l.e30;
import l.jo0;
import l.m250;
import l.qib0;
import l.w9j;
import l.x9j;
import l.xaj0;
import rx.c;

/* JADX INFO: renamed from: l.s9 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0690s9 {

    /* JADX INFO: renamed from: a */
    public c4g0 f4123a;

    /* JADX INFO: renamed from: b */
    public c4g0 f4124b;

    /* JADX INFO: renamed from: c */
    public final rx.subjects.a<Pair<Integer, xaj0<String, Integer, Long>>> f4125c;

    /* JADX INFO: renamed from: d */
    public final d30 f4126d;

    /* JADX INFO: renamed from: e */
    public final d30 f4127e;

    /* JADX INFO: renamed from: f */
    public boolean f4128f;

    /* JADX INFO: renamed from: l.s9$a */
    public static class a {
        private static final C0690s9 INSTANCE = new C0690s9();
    }

    public C0690s9() {
        this.f4125c = rx.subjects.a.b();
        this.f4128f = true;
        this.f4126d = new d30() { // from class: l.j9
            public final void call() {
                this.f2959a.m10638k();
            }
        };
        this.f4127e = new d30() { // from class: l.k9
            public final void call() {
                this.f3039a.m10639l();
            }
        };
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Optional m10633f(NetworkInfo networkInfo, Optional optional) {
        return optional;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Boolean m10634g(Optional optional) {
        if (optional.isPresent()) {
            return Boolean.TRUE;
        }
        if (ConnectivityReceiver.g()) {
            CoreModule.c.c2.y3();
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: j */
    public static C0690s9 m10637j() {
        return a.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m10638k() {
        mkd0.m9911z(this.f4123a);
        this.f4123a = null;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m10639l() {
        mkd0.m9911z(this.f4124b);
        this.f4124b = null;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m10640m(Throwable th) {
        this.f4126d.call();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m10641n(Boolean bool) {
        m10645r();
    }

    /* JADX INFO: renamed from: o */
    public c4g0 m10642o(m250<Pair<Integer, xaj0<String, Integer, Long>>> m250Var) {
        m10644q();
        return this.f4125c.subscribe(m250Var);
    }

    /* JADX INFO: renamed from: p */
    public final void m10643p(int i, xaj0<String, Integer, Long> xaj0Var) {
        if (i != 1) {
            this.f4126d.call();
            this.f4128f = true;
            if (i == 2) {
                CoreModule.c.c2.H3();
            }
        }
        this.f4125c.onNext(Pair.create(Integer.valueOf(i), xaj0Var));
        if (i == 2) {
            this.f4125c.onNext(Pair.create(-1, null));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m10644q() {
        m10648u();
    }

    /* JADX INFO: renamed from: r */
    public final void m10645r() {
        if (!CoreModule.c.c2.t3()) {
            m10643p(-1, null);
            return;
        }
        long jQ3 = CoreModule.c.c2.q3() - qib0.H.guessedCurrentServerTime();
        if (jQ3 <= 0) {
            m10643p(2, null);
            return;
        }
        int iM9575c = C0583ka.m9575c(jQ3);
        if (iM9575c >= 100) {
            m10643p(2, null);
            return;
        }
        String str = String.format(Locale.getDefault(), "%.1f", Float.valueOf(C0583ka.m9574b(iM9575c, jQ3, this.f4128f)));
        this.f4128f = false;
        m10643p(1, xaj0.a(str, Integer.valueOf(iM9575c), Long.valueOf(jQ3)));
        m10647t(new d30() { // from class: l.p9
            public final void call() {
                this.f3705a.m10645r();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m10646s() {
        this.f4127e.call();
        m10643p(-1, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m10647t(final d30 d30Var) {
        if (this.f4123a == null) {
            this.f4123a = c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.m9875H(new e30() { // from class: l.q9
                public final void call(Object obj) {
                    d30Var.call();
                }
            }, new e30() { // from class: l.r9
                public final void call(Object obj) {
                    this.f4060a.m10640m((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m10648u() {
        if (this.f4124b == null) {
            this.f4124b = c.combineLatest(ConnectivityReceiver.m(), CoreModule.c.c2.o3(), new x9j() { // from class: l.l9
                public final Object call(Object obj, Object obj2) {
                    return C0690s9.m10633f((NetworkInfo) obj, (Optional) obj2);
                }
            }).filter(new w9j() { // from class: l.m9
                public final Object call(Object obj) {
                    return C0690s9.m10634g((Optional) obj);
                }
            }).map(new w9j() { // from class: l.n9
                public final Object call(Object obj) {
                    return Boolean.valueOf(((AcceleratePairingStatus) ((Optional) obj).get()).active);
                }
            }).distinctUntilChanged().subscribe(mkd0.m9874G(new e30() { // from class: l.o9
                public final void call(Object obj) {
                    this.f3514a.m10641n((Boolean) obj);
                }
            }));
        }
    }
}
