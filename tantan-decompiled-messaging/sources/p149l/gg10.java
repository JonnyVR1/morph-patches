package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveMultiPkAsset;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes5.dex */
public class gg10 extends zi2<ho2, ie10> {
    public gg10(bsm bsmVar) {
        super(bsmVar);
        m218910L3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m125941W3(soj0 soj0Var) {
        m125942S3();
        mo168244N3();
    }

    /* JADX INFO: renamed from: S3 */
    public final void m125942S3() {
        duringCreated(LivingNormalApiProvider.m71581t5(ypv.f199493a.m199309D0())).subscribe(ffw.m121197h(new e30() { // from class: l.fg10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97326a.m125944U3((BLiveMultiPkAsset) obj);
            }
        }));
    }

    @Override // p149l.zi2
    /* JADX INFO: renamed from: T3, reason: merged with bridge method [inline-methods] */
    public ie10 mo75679K3() {
        return new ie10();
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m125944U3(BLiveMultiPkAsset bLiveMultiPkAsset) {
        ((ie10) this.viewModel).m135652G(bLiveMultiPkAsset);
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m125945V3(BLiveMultiPkAsset bLiveMultiPkAsset) {
        m206028F2().MultiCallEvent.clickPkSettingChange().m172467p();
    }

    /* JADX INFO: renamed from: X3 */
    public void m125946X3(boolean z, int i) {
        duringCreated(LivingNormalApiProvider.m71232G7(ypv.f199493a.m199309D0(), !z, i)).subscribe(ffw.m121197h(new e30() { // from class: l.eg10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90881a.m125945V3((BLiveMultiPkAsset) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().MultiCallEvent.clickPkCreateSetting().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.dg10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85994a.m125941W3((soj0) obj);
            }
        }));
    }
}
