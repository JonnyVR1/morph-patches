package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes4.dex */
public class ssq extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public boolean f170503i;

    public ssq(dum dumVar) {
        super(dumVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public final void m187790O3(final tsq tsqVar) {
        Act act = this.f196919f;
        if (act == null || act.isFinishing()) {
            return;
        }
        if (this.f170503i) {
            o1j0.m165651y(zrv.f205803e.getString(R$string.f47737P6));
            return;
        }
        if (!((m213810E2() instanceof rwn0) && ((rwn0) m213810E2()).m183434i3()) && m213815L2()) {
            o1j0.m165649w(R$string.f48013c7);
        } else {
            this.f170503i = true;
            this.f196919f.duringCreated(LivingNormalApiProvider.m72737q5(tsqVar.m192621b())).doOnUnsubscribe(new x20() { // from class: l.psq
                @Override // p153l.x20
                public final void call() {
                    this.f153960a.m187791P3();
                }
            }).subscribe(dhw.m115826e(new y20() { // from class: l.qsq
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f159346a.m187792R3(tsqVar, (User) obj);
                }
            }, new y20() { // from class: l.rsq
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165651y(zrv.f205803e.getString(R$string.f47568H9));
                }
            }));
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m187791P3() {
        this.f170503i = false;
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m187792R3(tsq tsqVar, User user) {
        zrv.f205799a.m207625A0(this.f196919f, user, tsqVar.m192621b(), tsqVar.m192620a(), true);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m187793S3(msq msqVar) {
        m187790O3(new tsq(msqVar.f138511a, msqVar.f138512b));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().LiveBridgeImplEvent.jumpToProfile().m199270g()).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.nsq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143528a.m187790O3((tsq) obj);
            }
        }));
        duringCreated(m213811F2().JumpProfileEvent.jump().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.osq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148889a.m187793S3((msq) obj);
            }
        }));
    }
}
