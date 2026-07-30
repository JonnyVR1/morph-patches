package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveMultiPkAsset;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;

/* JADX INFO: loaded from: classes5.dex */
public class qo10 extends hj2<oo2, sm10> {
    public qo10(dum dumVar) {
        super(dumVar);
        m135319L3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m177275W3(vxj0 vxj0Var) {
        m177276S3();
        mo135321N3();
    }

    /* JADX INFO: renamed from: S3 */
    public final void m177276S3() {
        duringCreated(LivingNormalApiProvider.m72764t5(zrv.f205799a.m207631D0())).subscribe(dhw.m115829h(new y20() { // from class: l.po10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153354a.m177278U3((BLiveMultiPkAsset) obj);
            }
        }));
    }

    @Override // p153l.hj2
    /* JADX INFO: renamed from: T3, reason: merged with bridge method [inline-methods] */
    public sm10 mo76862K3() {
        return new sm10();
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m177278U3(BLiveMultiPkAsset bLiveMultiPkAsset) {
        ((sm10) this.viewModel).m186731G(bLiveMultiPkAsset);
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m177279V3(BLiveMultiPkAsset bLiveMultiPkAsset) {
        m213811F2().MultiCallEvent.clickPkSettingChange().m199277p();
    }

    /* JADX INFO: renamed from: X3 */
    public void m177280X3(boolean z, int i) {
        duringCreated(LivingNormalApiProvider.m72415G7(zrv.f205799a.m207631D0(), !z, i)).subscribe(dhw.m115829h(new y20() { // from class: l.oo10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148252a.m177279V3((BLiveMultiPkAsset) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().MultiCallEvent.clickPkCreateSetting().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.no10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142903a.m177275W3((vxj0) obj);
            }
        }));
    }
}
