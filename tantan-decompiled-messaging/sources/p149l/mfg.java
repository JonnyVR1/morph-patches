package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes4.dex */
public class mfg extends x6s<ho2, hfg> {
    public mfg(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        mo51532C(new hfg(bsmVar.f77095a, this));
    }

    /* JADX INFO: renamed from: V3 */
    public void m154385V3() {
        m207199N3(LivingNormalApiProvider.m71517m4(ypv.f199493a.m199309D0())).subscribe(ffw.m121194e(new e30() { // from class: l.kfg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122941a.m154386W3((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.lfg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127871a.m154387X3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m154386W3(BLiveEnvelope bLiveEnvelope) {
        lsi0.m151593w(R$string.f47535t4);
        m206028F2().FansInvitationEvent.invitationResult().mo172463j(Boolean.TRUE);
        ((hfg) this.viewModel).mo71838p();
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m154387X3(Throwable th) {
        lsi0.m151593w(R$string.f47491r4);
        ((hfg) this.viewModel).mo71838p();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m154388Y3(String str) {
        if (((hfg) this.viewModel).isShowing()) {
            return;
        }
        ((hfg) this.viewModel).m71834E();
        ((hfg) this.viewModel).m130760L(str);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().FansInvitationEvent.showInvitationDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.jfg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117656a.m154388Y3((String) obj);
            }
        }));
    }
}
