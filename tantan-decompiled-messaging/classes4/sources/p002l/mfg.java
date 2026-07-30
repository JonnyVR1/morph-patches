package p002l;

import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import l.bwr;
import l.e30;
import l.ffw;
import l.lsi0;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mfg extends x6s<ho2, hfg> {
    public mfg(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        C(new hfg(bsmVar.f8332a, this));
    }

    /* JADX INFO: renamed from: V3 */
    public void m17845V3() {
        m25707N3(LivingNormalApiProvider.m4883m4(ypv.a.D0())).subscribe(ffw.e(new e30() { // from class: l.kfg
            public final void call(Object obj) {
                this.f14312a.m17846W3((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.lfg
            public final void call(Object obj) {
                this.f14840a.m17847X3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m17846W3(BLiveEnvelope bLiveEnvelope) {
        lsi0.w(R$string.f3577t4);
        m25548F2().FansInvitationEvent.invitationResult().j(Boolean.TRUE);
        ((hfg) ((bwr) this).viewModel).mo5216p();
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m17847X3(Throwable th) {
        lsi0.w(R$string.f3533r4);
        ((hfg) ((bwr) this).viewModel).mo5216p();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m17848Y3(String str) {
        if (((hfg) ((bwr) this).viewModel).isShowing()) {
            return;
        }
        ((hfg) ((bwr) this).viewModel).m5211E();
        ((hfg) ((bwr) this).viewModel).m14362L(str);
    }

    /* JADX INFO: renamed from: t */
    public void m17849t() {
        super.t();
        duringCreated((c) m25548F2().FansInvitationEvent.showInvitationDialog().g()).subscribe(ffw.d(new e30() { // from class: l.jfg
            public final void call(Object obj) {
                this.f13727a.m17848Y3((String) obj);
            }
        }));
    }
}
