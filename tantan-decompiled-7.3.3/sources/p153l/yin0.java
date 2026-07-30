package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveBossCall;
import com.p051p1.mobile.putong.live.base.data.BLiveBossGiftRecord;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;

/* JADX INFO: loaded from: classes5.dex */
public class yin0 extends y8s<rwn0, jjn0> {
    public yin0(dum dumVar) {
        super(dumVar);
        mo52715C(new jjn0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m216335V3(vxj0 vxj0Var) {
        m216340Z3();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138863h3(m213811F2().VoiceGiftRecordEvent.show(), new y20() { // from class: l.win0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189375a.m216335V3((vxj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public final void m216336U3(BLiveBossCall bLiveBossCall) {
        ((jjn0) this.viewModel).m145079W(bLiveBossCall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public void m216337W3(String str) {
        ydn0.m215258k(this, ((rwn0) m213810E2()).m168526j0(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public void m216338X3() {
        duringCreated(VoiceRoomApiProvider.getBossCall(zrv.f205799a.m207631D0(), ((rwn0) m213810E2()).m202191k())).subscribe(dhw.m115829h(new y20() { // from class: l.xin0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194472a.m216336U3((BLiveBossCall) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public void m216339Y3(String str, int i, y20<BLiveBossGiftRecord> y20Var) {
        duringCreated(VoiceRoomApiProvider.getGiftRecord(((rwn0) m213810E2()).m202191k(), str, i, 20)).subscribe(dhw.m115829h(y20Var));
    }

    /* JADX INFO: renamed from: Z3 */
    public void m216340Z3() {
        ((jjn0) this.viewModel).m145081Y();
        m216338X3();
    }
}
