package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes4.dex */
public class rqq extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public boolean f160677i;

    public rqq(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public final void m180467O3(final sqq sqqVar) {
        Act act = this.f188513f;
        if (act == null || act.isFinishing()) {
            return;
        }
        if (this.f160677i) {
            lsi0.m151595y(ypv.f199497e.getString(R$string.f46889P6));
            return;
        }
        if (!((m206027E2() instanceof nnn0) && ((nnn0) m206027E2()).m160271i3()) && m206032L2()) {
            lsi0.m151593w(R$string.f47165c7);
        } else {
            this.f160677i = true;
            this.f188513f.duringCreated(LivingNormalApiProvider.m71554q5(sqqVar.m185609b())).doOnUnsubscribe(new d30() { // from class: l.oqq
                @Override // p149l.d30
                public final void call() {
                    this.f145177a.m180468P3();
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.pqq
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f150810a.m180469R3(sqqVar, (User) obj);
                }
            }, new e30() { // from class: l.qqq
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151595y(ypv.f199497e.getString(R$string.f46720H9));
                }
            }));
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m180468P3() {
        this.f160677i = false;
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m180469R3(sqq sqqVar, User user) {
        ypv.f199493a.m199303A0(this.f188513f, user, sqqVar.m185609b(), sqqVar.m185608a(), true);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m180470S3(lqq lqqVar) {
        m180467O3(new sqq(lqqVar.f129372a, lqqVar.f129373b));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().LiveBridgeImplEvent.jumpToProfile().m172460g()).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.mqq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135286a.m180467O3((sqq) obj);
            }
        }));
        duringCreated(m206028F2().JumpProfileEvent.jump().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.nqq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140094a.m180470S3((lqq) obj);
            }
        }));
    }
}
