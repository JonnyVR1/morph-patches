package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class s2n0 extends ixm0<jlm0> {
    public s2n0(dum dumVar, sam samVar) {
        super(dumVar, samVar);
    }

    @Override // p153l.ixm0
    /* JADX INFO: renamed from: A4 */
    public void mo95834A4(Integer num) {
        v1n0.m199025c();
        m213811F2().VoiceApplyManagerEvent.show().mo199273j(new snm0(0, num.intValue()));
    }

    @Override // p153l.ixm0, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m213811F2().BottomZoneEvent.refreshAllButton().m199277p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ixm0
    /* JADX INFO: renamed from: z4 */
    public void mo95840z4(BLiveVoiceCall bLiveVoiceCall, nsv<h64> nsvVar) {
        String str = ((jlm0) m213810E2()).m168532l0().f56859id;
        h64 h64Var = nsvVar.f143542a;
        if (NullChecker.m82486a(h64Var)) {
            ydn0.m215258k(this, str, h64Var.f107997a);
        }
    }
}
