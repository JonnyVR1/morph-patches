package p002l;

import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.ffw;
import l.gkh0;
import l.roj0;
import l.u0t;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mzf0 extends pat<pn40> {

    /* JADX INFO: renamed from: i */
    public boolean f15755i;

    /* JADX INFO: renamed from: j */
    public boolean f15756j;

    public mzf0(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m18319M3(roj0 roj0Var) {
        this.f15756j = true;
        m25548F2().LivePusherEvent.notifyPushStreamReady().p();
        gkh0.j(u0t.b, "notifyStreamReady success:");
        this.f15755i = false;
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m18320N3(Throwable th) {
        this.f15756j = true;
        m25548F2().LivePusherEvent.notifyPushStreamReady().p();
        gkh0.j(u0t.b, "notifyStreamReady fail");
        this.f15755i = false;
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ Boolean m18321O3(pzf0 pzf0Var) {
        return Boolean.valueOf(this.f15756j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public void m18322P3() {
        c cVarLifecycle_ = lifecycle_();
        if (this.f15755i) {
            return;
        }
        if (!NullChecker.a(cVarLifecycle_) || cVarLifecycle_.a) {
            this.f15755i = true;
            gkh0.j(u0t.b, "notifyStreamReady start");
            duringCreated(LivingNormalApiProvider.m4966v6(((pn40) m25547E2()).m17235k())).subscribe(ffw.e(new e30() { // from class: l.kzf0
                public final void call(Object obj) {
                    this.f14604a.m18319M3((roj0) obj);
                }
            }, new e30() { // from class: l.lzf0
                public final void call(Object obj) {
                    this.f15186a.m18320N3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: t */
    public void m18323t() {
        super.t();
        m14188d3(pzf0.class, new w9j() { // from class: l.jzf0
            public final Object call(Object obj) {
                return this.f14151a.m18321O3((pzf0) obj);
            }
        });
    }
}
