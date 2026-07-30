package p149l;

import android.net.NetworkInfo;
import android.util.Pair;
import com.google.common.base.Optional;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.BoostStatus;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes10.dex */
public class j63 {

    /* JADX INFO: renamed from: a */
    public long f116377a;

    /* JADX INFO: renamed from: b */
    public boolean f116378b;

    /* JADX INFO: renamed from: c */
    public c4g0 f116379c;

    /* JADX INFO: renamed from: d */
    public c4g0 f116380d;

    /* JADX INFO: renamed from: e */
    public final C22392a<Pair<Integer, xaj0<String, Integer, Long>>> f116381e;

    /* JADX INFO: renamed from: f */
    public final d30 f116382f;

    /* JADX INFO: renamed from: g */
    public final d30 f116383g;

    /* JADX INFO: renamed from: h */
    public boolean f116384h;

    /* JADX INFO: renamed from: l.j63$a */
    public static class C17692a {
        private static final j63 INSTANCE = new j63();
    }

    public j63() {
        this.f116377a = 0L;
        this.f116378b = false;
        this.f116381e = C22392a.m221512b();
        this.f116384h = true;
        this.f116382f = new d30() { // from class: l.a63
            @Override // p149l.d30
            public final void call() {
                this.f67737a.m139891k();
            }
        };
        this.f116383g = new d30() { // from class: l.b63
            @Override // p149l.d30
            public final void call() {
                this.f73740a.m139892l();
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m139881a(Optional optional) {
        if (optional.isPresent()) {
            return Boolean.TRUE;
        }
        if (ConnectivityReceiver.m81284g()) {
            CoreModule.f17545c.f19576J0.m139269V3();
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Optional m139886f(NetworkInfo networkInfo, Optional optional) {
        return optional;
    }

    /* JADX INFO: renamed from: j */
    public static j63 m139890j() {
        return C17692a.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m139891k() {
        mkd0.m154992z(this.f116379c);
        this.f116379c = null;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m139892l() {
        mkd0.m154992z(this.f116380d);
        this.f116380d = null;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m139893m(Throwable th) {
        this.f116382f.call();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m139894n(Boolean bool) {
        m139898r();
    }

    /* JADX INFO: renamed from: o */
    public c4g0 m139895o(m250<Pair<Integer, xaj0<String, Integer, Long>>> m250Var) {
        m139897q();
        return this.f116381e.subscribe(m250Var);
    }

    /* JADX INFO: renamed from: p */
    public final void m139896p(int i, xaj0<String, Integer, Long> xaj0Var) {
        if (i != 1) {
            this.f116382f.call();
            this.f116384h = true;
            if (i == 2) {
                CoreModule.f17545c.f19576J0.m139277d4();
            }
        }
        this.f116381e.m132487l(Pair.create(Integer.valueOf(i), xaj0Var));
        if (i == 2) {
            this.f116381e.m132487l(Pair.create(-1, null));
        }
        if (i == 1 && CoreModule.f17545c.f19576J0.f115765q0 && mqi0.m155944o() - this.f116377a > 3000) {
            this.f116377a = mqi0.m155944o();
            CoreModule.f17545c.f19576J0.m139280s3();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m139897q() {
        m139901u();
    }

    /* JADX INFO: renamed from: r */
    public final void m139898r() {
        if (!CoreModule.f17545c.f19576J0.m139254F3() && !CoreModule.f17545c.f19576J0.m139255G3()) {
            m139896p(-1, null);
            return;
        }
        long jM139283w3 = CoreModule.f17545c.f19576J0.m139283w3() - qib0.f154693H.guessedCurrentServerTime();
        if (jM139283w3 <= 0) {
            m139896p(2, null);
            return;
        }
        if (CoreModule.f17557o.m195057d().mo33766Vd() && this.f116378b && !xma.m210040C3()) {
            CoreModule.f17545c.f19576J0.m139269V3();
        }
        if (CoreModule.f17557o.m195057d().mo33766Vd() && xma.m210040C3()) {
            this.f116378b = xma.m210040C3();
        }
        int iM95521e = aa3.m95521e(jM139283w3);
        if (iM95521e >= 100) {
            m139896p(2, null);
            return;
        }
        String str = String.format(Locale.getDefault(), "%.1f", Float.valueOf(aa3.m95520d(iM95521e, jM139283w3, this.f116384h)));
        this.f116384h = false;
        m139896p(1, xaj0.m207578a(str, Integer.valueOf(iM95521e), Long.valueOf(jM139283w3)));
        CoreModule.f17545c.f19576J0.m139273Z3(true);
        m139900t(new d30() { // from class: l.g63
            @Override // p149l.d30
            public final void call() {
                this.f101222a.m139898r();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m139899s() {
        this.f116383g.call();
        m139896p(-1, null);
        CoreModule.f17545c.f19576J0.f115753e0.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: t */
    public final void m139900t(final d30 d30Var) {
        if (this.f116379c == null) {
            this.f116379c = C22306c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.h63
                @Override // p149l.e30
                public final void call(Object obj) {
                    d30Var.call();
                }
            }, new e30() { // from class: l.i63
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f111673a.m139893m((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m139901u() {
        if (NullChecker.m81303a(this.f116380d)) {
            return;
        }
        this.f116380d = C22306c.combineLatest(ConnectivityReceiver.m81290m(), CoreModule.f17545c.f19576J0.m139281t3(), new x9j() { // from class: l.c63
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return j63.m139886f((NetworkInfo) obj, (Optional) obj2);
            }
        }).filter(new w9j() { // from class: l.d63
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return j63.m139881a((Optional) obj);
            }
        }).map(new w9j() { // from class: l.e63
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BoostStatus) ((Optional) obj).get()).active);
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.f63
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f95229a.m139894n((Boolean) obj);
            }
        }));
    }
}
