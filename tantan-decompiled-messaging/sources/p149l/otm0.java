package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class otm0 extends eom0<fcm0> {
    public otm0(bsm bsmVar, c8m c8mVar) {
        super(bsmVar, c8mVar);
    }

    @Override // p149l.eom0
    /* JADX INFO: renamed from: A4 */
    public void mo117393A4(Integer num) {
        rsm0.m180695c();
        m206028F2().VoiceApplyManagerEvent.show().mo172463j(new oem0(0, num.intValue()));
    }

    @Override // p149l.eom0, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m206028F2().BottomZoneEvent.refreshAllButton().m172467p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.eom0
    /* JADX INFO: renamed from: z4 */
    public void mo117418z4(BLiveVoiceCall bLiveVoiceCall, mqv<i54> mqvVar) {
        String str = ((fcm0) m206027E2()).m132146l0().f56011id;
        i54 i54Var = mqvVar.f135304a;
        if (NullChecker.m81303a(i54Var)) {
            u4n0.m191752k(this, str, i54Var.f111520a);
        }
    }
}
