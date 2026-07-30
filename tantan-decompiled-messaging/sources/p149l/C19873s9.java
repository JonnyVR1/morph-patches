package p149l;

import android.net.NetworkInfo;
import android.util.Pair;
import com.google.common.base.Optional;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.AcceleratePairingStatus;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: renamed from: l.s9 */
/* JADX INFO: loaded from: classes8.dex */
public class C19873s9 {

    /* JADX INFO: renamed from: a */
    public c4g0 f163122a;

    /* JADX INFO: renamed from: b */
    public c4g0 f163123b;

    /* JADX INFO: renamed from: c */
    public final C22392a<Pair<Integer, xaj0<String, Integer, Long>>> f163124c;

    /* JADX INFO: renamed from: d */
    public final d30 f163125d;

    /* JADX INFO: renamed from: e */
    public final d30 f163126e;

    /* JADX INFO: renamed from: f */
    public boolean f163127f;

    /* JADX INFO: renamed from: l.s9$a */
    public static class a {
        private static final C19873s9 INSTANCE = new C19873s9();
    }

    public C19873s9() {
        this.f163124c = C22392a.m221512b();
        this.f163127f = true;
        this.f163125d = new d30() { // from class: l.j9
            @Override // p149l.d30
            public final void call() {
                this.f116830a.m182676k();
            }
        };
        this.f163126e = new d30() { // from class: l.k9
            @Override // p149l.d30
            public final void call() {
                this.f121889a.m182677l();
            }
        };
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Optional m182671f(NetworkInfo networkInfo, Optional optional) {
        return optional;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Boolean m182672g(Optional optional) {
        if (optional.isPresent()) {
            return Boolean.TRUE;
        }
        if (ConnectivityReceiver.m81284g()) {
            CoreModule.f17545c.f19635c2.m99150y3();
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: j */
    public static C19873s9 m182675j() {
        return a.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m182676k() {
        mkd0.m154992z(this.f163122a);
        this.f163122a = null;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m182677l() {
        mkd0.m154992z(this.f163123b);
        this.f163123b = null;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m182678m(Throwable th) {
        this.f163125d.call();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m182679n(Boolean bool) {
        m182683r();
    }

    /* JADX INFO: renamed from: o */
    public c4g0 m182680o(m250<Pair<Integer, xaj0<String, Integer, Long>>> m250Var) {
        m182682q();
        return this.f163124c.subscribe(m250Var);
    }

    /* JADX INFO: renamed from: p */
    public final void m182681p(int i, xaj0<String, Integer, Long> xaj0Var) {
        if (i != 1) {
            this.f163125d.call();
            this.f163127f = true;
            if (i == 2) {
                CoreModule.f17545c.f19635c2.m99138H3();
            }
        }
        this.f163124c.m132487l(Pair.create(Integer.valueOf(i), xaj0Var));
        if (i == 2) {
            this.f163124c.m132487l(Pair.create(-1, null));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m182682q() {
        m182686u();
    }

    /* JADX INFO: renamed from: r */
    public final void m182683r() {
        if (!CoreModule.f17545c.f19635c2.m99148t3()) {
            m182681p(-1, null);
            return;
        }
        long jM99145q3 = CoreModule.f17545c.f19635c2.m99145q3() - qib0.f154693H.guessedCurrentServerTime();
        if (jM99145q3 <= 0) {
            m182681p(2, null);
            return;
        }
        int iM145129c = C17963ka.m145129c(jM99145q3);
        if (iM145129c >= 100) {
            m182681p(2, null);
            return;
        }
        String str = String.format(Locale.getDefault(), "%.1f", Float.valueOf(C17963ka.m145128b(iM145129c, jM99145q3, this.f163127f)));
        this.f163127f = false;
        m182681p(1, xaj0.m207578a(str, Integer.valueOf(iM145129c), Long.valueOf(jM99145q3)));
        m182685t(new d30() { // from class: l.p9
            @Override // p149l.d30
            public final void call() {
                this.f147654a.m182683r();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m182684s() {
        this.f163126e.call();
        m182681p(-1, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m182685t(final d30 d30Var) {
        if (this.f163122a == null) {
            this.f163122a = C22306c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.q9
                @Override // p149l.e30
                public final void call(Object obj) {
                    d30Var.call();
                }
            }, new e30() { // from class: l.r9
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f158267a.m182678m((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m182686u() {
        if (this.f163123b == null) {
            this.f163123b = C22306c.combineLatest(ConnectivityReceiver.m81290m(), CoreModule.f17545c.f19635c2.m99143o3(), new x9j() { // from class: l.l9
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return C19873s9.m182671f((NetworkInfo) obj, (Optional) obj2);
                }
            }).filter(new w9j() { // from class: l.m9
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C19873s9.m182672g((Optional) obj);
                }
            }).map(new w9j() { // from class: l.n9
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((AcceleratePairingStatus) ((Optional) obj).get()).active);
                }
            }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.o9
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f142687a.m182679n((Boolean) obj);
                }
            }));
        }
    }
}
