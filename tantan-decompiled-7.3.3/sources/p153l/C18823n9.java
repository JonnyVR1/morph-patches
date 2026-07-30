package p153l;

import android.net.NetworkInfo;
import android.util.Pair;
import com.google.common.base.Optional;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.AcceleratePairingStatus;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: renamed from: l.n9 */
/* JADX INFO: loaded from: classes6.dex */
public class C18823n9 {

    /* JADX INFO: renamed from: a */
    public kcg0 f140725a;

    /* JADX INFO: renamed from: b */
    public kcg0 f140726b;

    /* JADX INFO: renamed from: c */
    public final C22507a<Pair<Integer, bkj0<String, Integer, Long>>> f140727c;

    /* JADX INFO: renamed from: d */
    public final x20 f140728d;

    /* JADX INFO: renamed from: e */
    public final x20 f140729e;

    /* JADX INFO: renamed from: f */
    public boolean f140730f;

    /* JADX INFO: renamed from: l.n9$a */
    public static class a {
        private static final C18823n9 INSTANCE = new C18823n9();
    }

    public C18823n9() {
        this.f140727c = C22507a.m222758b();
        this.f140730f = true;
        this.f140728d = new x20() { // from class: l.e9
            @Override // p153l.x20
            public final void call() {
                this.f92580a.m161959k();
            }
        };
        this.f140729e = new x20() { // from class: l.f9
            @Override // p153l.x20
            public final void call() {
                this.f97793a.m161960l();
            }
        };
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Optional m161954f(NetworkInfo networkInfo, Optional optional) {
        return optional;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Boolean m161955g(Optional optional) {
        if (optional.isPresent()) {
            return Boolean.TRUE;
        }
        if (ConnectivityReceiver.m82467g()) {
            CoreModule.f18264c.f20377c2.m118410y3();
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: j */
    public static C18823n9 m161958j() {
        return a.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m161959k() {
        psd0.m173633z(this.f140725a);
        this.f140725a = null;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m161960l() {
        psd0.m173633z(this.f140726b);
        this.f140726b = null;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m161961m(Throwable th) {
        this.f140728d.call();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m161962n(Boolean bool) {
        m161966r();
    }

    /* JADX INFO: renamed from: o */
    public kcg0 m161963o(bb50<Pair<Integer, bkj0<String, Integer, Long>>> bb50Var) {
        m161965q();
        return this.f140727c.subscribe(bb50Var);
    }

    /* JADX INFO: renamed from: p */
    public final void m161964p(int i, bkj0<String, Integer, Long> bkj0Var) {
        if (i != 1) {
            this.f140728d.call();
            this.f140730f = true;
            if (i == 2) {
                CoreModule.f18264c.f20377c2.m118398H3();
            }
        }
        this.f140727c.m137019l(Pair.create(Integer.valueOf(i), bkj0Var));
        if (i == 2) {
            this.f140727c.m137019l(Pair.create(-1, null));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m161965q() {
        m161969u();
    }

    /* JADX INFO: renamed from: r */
    public final void m161966r() {
        if (!CoreModule.f18264c.f20377c2.m118408t3()) {
            m161964p(-1, null);
            return;
        }
        long jM118405q3 = CoreModule.f18264c.f20377c2.m118405q3() - uqb0.f180376H.guessedCurrentServerTime();
        if (jM118405q3 <= 0) {
            m161964p(2, null);
            return;
        }
        int iM124692c = C16929fa.m124692c(jM118405q3);
        if (iM124692c >= 100) {
            m161964p(2, null);
            return;
        }
        String str = String.format(Locale.getDefault(), "%.1f", Float.valueOf(C16929fa.m124691b(iM124692c, jM118405q3, this.f140730f)));
        this.f140730f = false;
        m161964p(1, bkj0.m104818a(str, Integer.valueOf(iM124692c), Long.valueOf(jM118405q3)));
        m161968t(new x20() { // from class: l.k9
            @Override // p153l.x20
            public final void call() {
                this.f124427a.m161966r();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m161967s() {
        this.f140729e.call();
        m161964p(-1, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m161968t(final x20 x20Var) {
        if (this.f140725a == null) {
            this.f140725a = C22421c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.l9
                @Override // p153l.y20
                public final void call(Object obj) {
                    x20Var.call();
                }
            }, new y20() { // from class: l.m9
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f135307a.m161961m((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m161969u() {
        if (this.f140726b == null) {
            this.f140726b = C22421c.combineLatest(ConnectivityReceiver.m82473m(), CoreModule.f18264c.f20377c2.m118403o3(), new rcj() { // from class: l.g9
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return C18823n9.m161954f((NetworkInfo) obj, (Optional) obj2);
                }
            }).filter(new qcj() { // from class: l.h9
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C18823n9.m161955g((Optional) obj);
                }
            }).map(new qcj() { // from class: l.i9
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((AcceleratePairingStatus) ((Optional) obj).get()).active);
                }
            }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.j9
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f118834a.m161962n((Boolean) obj);
                }
            }));
        }
    }
}
