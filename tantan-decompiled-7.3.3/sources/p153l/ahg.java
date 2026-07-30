package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes4.dex */
public class ahg extends y8s<oo2, vgg> {
    public ahg(dum<? extends oo2> dumVar) {
        super(dumVar);
        mo52715C(new vgg(dumVar.f90815a, this));
    }

    /* JADX INFO: renamed from: V3 */
    public void m97833V3() {
        m214779N3(LivingNormalApiProvider.m72700m4(zrv.f205799a.m207631D0())).subscribe(dhw.m115826e(new y20() { // from class: l.ygg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f199829a.m97834W3((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.zgg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204299a.m97835X3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m97834W3(BLiveEnvelope bLiveEnvelope) {
        o1j0.m165649w(R$string.f48383t4);
        m213811F2().FansInvitationEvent.invitationResult().mo199273j(Boolean.TRUE);
        ((vgg) this.viewModel).mo73021p();
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m97835X3(Throwable th) {
        o1j0.m165649w(R$string.f48339r4);
        ((vgg) this.viewModel).mo73021p();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m97836Y3(String str) {
        if (((vgg) this.viewModel).isShowing()) {
            return;
        }
        ((vgg) this.viewModel).m73017E();
        ((vgg) this.viewModel).m201229L(str);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().FansInvitationEvent.showInvitationDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.xgg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194188a.m97836Y3((String) obj);
            }
        }));
    }
}
