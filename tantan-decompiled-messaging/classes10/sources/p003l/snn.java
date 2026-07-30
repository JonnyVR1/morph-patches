package p003l;

import android.os.Bundle;
import android.util.Pair;
import com.p000p1.mobile.putong.core.data.GameStage;
import com.p000p1.mobile.putong.core.data.HideAndSeekInfoEnv;
import com.p000p1.mobile.putong.core.data.HideAndSeekPushEnv;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.c0;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.d30;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.mqi0;
import l.pvl;
import l.vwb;
import l.w9j;
import l.x9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class snn extends jq2<gon> implements c0.c {

    /* JADX INFO: renamed from: a */
    public boolean f7408a;

    /* JADX INFO: renamed from: b */
    public u9o f7409b;

    /* JADX INFO: renamed from: c */
    public final String f7410c;

    /* JADX INFO: renamed from: d */
    public Location f7411d;

    /* JADX INFO: renamed from: e */
    public boolean f7412e;

    /* JADX INFO: renamed from: f */
    public boolean f7413f;

    /* JADX INFO: renamed from: g */
    public long f7414g;

    /* JADX INFO: renamed from: h */
    public long f7415h;

    /* JADX INFO: renamed from: i */
    public int f7416i;

    public snn(mcr mcrVar, Act act) {
        super(mcrVar);
        this.f7410c = "hide_and_seek_timer";
        this.f7414g = 1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m9434I0(Bundle bundle) {
        act().setConvertActivityFromTranslucentEnable(false);
        ((gon) ((jq2) this).viewModel).m6798r();
        ((gon) ((jq2) this).viewModel).m6790i(new C3428a());
        m9465x0();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ Boolean m9438h0(Pair pair) {
        return (Boolean) pair.first;
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m9452C0(HideAndSeekPushEnv hideAndSeekPushEnv) {
        if (NullChecker.a(hideAndSeekPushEnv.data) && TEnum.equals(hideAndSeekPushEnv.data.gameStage, GameStage.end)) {
            m9467z0();
        } else {
            ((gon) ((jq2) this).viewModel).m6792j(hideAndSeekPushEnv.data);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m9453D0() {
        this.f7412e = true;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m9454E0() {
        this.f7413f = true;
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m9455F0() {
        this.f7414g = 2L;
        m9461O0(Long.valueOf(this.f7415h));
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m9456G0() {
        this.f7414g = 3L;
        m9461O0(Long.valueOf(this.f7415h));
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m9457H0(HideAndSeekInfoEnv hideAndSeekInfoEnv) {
        ((gon) ((jq2) this).viewModel).m6804z(hideAndSeekInfoEnv.data);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m9458J0() {
        ((gon) ((jq2) this).viewModel).m6802x();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m9459L0(Pair pair) {
        Location location = (Location) pair.second;
        this.f7411d = location;
        ((gon) ((jq2) this).viewModel).m6793k(location);
    }

    /* JADX INFO: renamed from: N0 */
    public void m9460N0() {
        if (this.f7409b != null) {
            return;
        }
        this.f7409b = new u9o();
        duringCreated(mkd0.r(((gon) ((jq2) this).viewModel).m6797p().E3().map(new w9j() { // from class: l.enn
            public final Object call(Object obj) {
                return Boolean.TRUE;
            }
        }), this.f7409b.m9702i(), new x9j() { // from class: l.fnn
            public final Object call(Object obj, Object obj2) {
                return new Pair((Boolean) obj, (Location) obj2);
            }
        })).filter(new w9j() { // from class: l.gnn
            public final Object call(Object obj) {
                return snn.m9438h0((Pair) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.hnn
            public final void call(Object obj) {
                this.f4933a.m9459L0((Pair) obj);
            }
        }, new e30() { // from class: l.inn
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }));
        this.f7409b.m9704k();
    }

    /* JADX INFO: renamed from: O0 */
    public void m9461O0(Long l2) {
        if (l2.longValue() < mqi0.o()) {
            return;
        }
        this.f7415h = l2.longValue();
        m9460N0();
        CoreModule.c.t1.u("hide_and_seek_timer");
        c0.a aVar = new c0.a();
        aVar.g("hide_and_seek_timer").a(true).h(1L).f(l2.longValue()).d(this);
        CoreModule.c.t1.r(aVar);
    }

    /* JADX INFO: renamed from: a0 */
    public void m9462a0() {
        creates(new e30() { // from class: l.dnn
            public final void call(Object obj) {
                this.f4196a.m9434I0((Bundle) obj);
            }
        }, new d30() { // from class: l.jnn
            public final void call() {
                this.f5350a.m9458J0();
            }
        });
    }

    public void destroy() {
        u9o u9oVar = this.f7409b;
        if (u9oVar != null) {
            u9oVar.m9707n();
        }
        CoreModule.c.t1.u("hide_and_seek_timer");
    }

    /* JADX INFO: renamed from: u */
    public void m9463u(String str, long j, long j2, long j3, long j4) {
        u9o u9oVar;
        if (j3 - mqi0.o() <= 500) {
            m9467z0();
            return;
        }
        Location location = this.f7411d;
        if (location != null) {
            this.f7416i = 0;
            duringCreated(CoreModule.c.d2.n3(Double.toString(location.x()), Double.toString(this.f7411d.u()))).subscribe(mkd0.H(new e30() { // from class: l.knn
                public final void call(Object obj) {
                    this.f5681a.m9452C0((HideAndSeekPushEnv) obj);
                }
            }, new e30() { // from class: l.lnn
                public final void call(Object obj) {
                    ((Throwable) obj).getMessage();
                }
            }));
            return;
        }
        int i = this.f7416i + 1;
        this.f7416i = i;
        if (i <= 5 || (u9oVar = this.f7409b) == null) {
            return;
        }
        u9oVar.m9706m();
    }

    /* JADX INFO: renamed from: u0 */
    public List<j760<String, d30>> m9464u0() {
        return vwb.f0(new j760[]{vwb.Y("玩家随机移动", new d30() { // from class: l.mnn
            public final void call() {
                this.f6366a.m9453D0();
            }
        }), vwb.Y("地理偏移修正", new d30() { // from class: l.nnn
            public final void call() {
                this.f6537a.m9454E0();
            }
        }), vwb.Y("刷新时间2s", new d30() { // from class: l.onn
            public final void call() {
                this.f6694a.m9455F0();
            }
        }), vwb.Y("刷新时间3s", new d30() { // from class: l.pnn
            public final void call() {
                this.f6894a.m9456G0();
            }
        })});
    }

    /* JADX INFO: renamed from: x0 */
    public final void m9465x0() {
        duringCreated(CoreModule.c.d2.m3()).subscribe(mkd0.H(new e30() { // from class: l.qnn
            public final void call(Object obj) {
                this.f7052a.m9457H0((HideAndSeekInfoEnv) obj);
            }
        }, new e30() { // from class: l.rnn
            public final void call(Object obj) {
                ((Throwable) obj).getMessage();
            }
        }));
    }

    /* JADX INFO: renamed from: y0 */
    public Location m9466y0() {
        return this.f7411d;
    }

    /* JADX INFO: renamed from: z0 */
    public void m9467z0() {
        m9465x0();
        CoreModule.c.t1.u("hide_and_seek_timer");
        u9o u9oVar = this.f7409b;
        if (u9oVar != null) {
            u9oVar.m9707n();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m9451A0() {
    }

    /* JADX INFO: renamed from: l.snn$a */
    public class C3428a implements pvl.a {
        public C3428a() {
        }

        /* JADX INFO: renamed from: a */
        public void m9468a() {
            ((gon) ((jq2) snn.this).viewModel).m6786A();
        }

        /* JADX INFO: renamed from: b */
        public void m9469b(boolean z) {
            snn snnVar = snn.this;
            snnVar.f7408a = true;
            ((gon) ((jq2) snnVar).viewModel).m6786A();
        }

        /* JADX INFO: renamed from: d */
        public void m9471d(double d, double d2, float f, boolean z) {
            snn.this.f7408a = false;
        }

        /* JADX INFO: renamed from: c */
        public void m9470c(pvl.b bVar) {
        }
    }
}
