package p002l;

import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import l.d30;
import l.e30;
import l.ffw;
import l.jo0;
import l.lsi0;
import l.nnn0;
import l.sqq;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rqq extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public boolean f18656i;

    public rqq(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: O3 */
    public final void m22112O3(final sqq sqqVar) {
        Act act = this.f22037f;
        if (act == null || act.isFinishing()) {
            return;
        }
        if (this.f18656i) {
            lsi0.y(ypv.e.getString(R$string.f2931P6));
            return;
        }
        if (!((m25547E2() instanceof nnn0) && ((nnn0) m25547E2()).i3()) && m25552L2()) {
            lsi0.w(R$string.f3207c7);
        } else {
            this.f18656i = true;
            this.f22037f.duringCreated(LivingNormalApiProvider.m4920q5(sqqVar.b())).doOnUnsubscribe(new d30() { // from class: l.oqq
                public final void call() {
                    this.f16753a.m22113P3();
                }
            }).subscribe(ffw.e(new e30() { // from class: l.pqq
                public final void call(Object obj) {
                    this.f17619a.m22114R3(sqqVar, (User) obj);
                }
            }, new e30() { // from class: l.qqq
                public final void call(Object obj) {
                    lsi0.y(ypv.e.getString(R$string.f2762H9));
                }
            }));
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m22113P3() {
        this.f18656i = false;
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m22114R3(sqq sqqVar, User user) {
        ypv.a.A0(this.f22037f, user, sqqVar.b(), sqqVar.a(), true);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m22115S3(lqq lqqVar) {
        m22112O3(new sqq(lqqVar.f15006a, lqqVar.f15007b));
    }

    /* JADX INFO: renamed from: t */
    public void m22116t() {
        super.t();
        duringCreated((c) m25548F2().LiveBridgeImplEvent.jumpToProfile().g()).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.mqq
            public final void call(Object obj) {
                this.f15599a.m22112O3((sqq) obj);
            }
        }));
        duringCreated((c) m25548F2().JumpProfileEvent.jump().g()).subscribe(ffw.d(new e30() { // from class: l.nqq
            public final void call(Object obj) {
                this.f16165a.m22115S3((lqq) obj);
            }
        }));
    }
}
