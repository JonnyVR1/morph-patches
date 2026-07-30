package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveBossCall;
import com.p046p1.mobile.putong.live.base.data.BLiveBossGiftRecord;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;

/* JADX INFO: loaded from: classes5.dex */
public class u9n0 extends x6s<nnn0, fan0> {
    public u9n0(bsm bsmVar) {
        super(bsmVar);
        mo51532C(new fan0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m192571V3(soj0 soj0Var) {
        m192576Z3();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129304h3(m206028F2().VoiceGiftRecordEvent.show(), new e30() { // from class: l.s9n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163202a.m192571V3((soj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public final void m192572U3(BLiveBossCall bLiveBossCall) {
        ((fan0) this.viewModel).m120234W(bLiveBossCall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public void m192573W3(String str) {
        u4n0.m191752k(this, ((nnn0) m206027E2()).m132140j0(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public void m192574X3() {
        duringCreated(VoiceRoomApiProvider.getBossCall(ypv.f199493a.m199309D0(), ((nnn0) m206027E2()).m149814k())).subscribe(ffw.m121197h(new e30() { // from class: l.t9n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169041a.m192572U3((BLiveBossCall) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public void m192575Y3(String str, int i, e30<BLiveBossGiftRecord> e30Var) {
        duringCreated(VoiceRoomApiProvider.getGiftRecord(((nnn0) m206027E2()).m149814k(), str, i, 20)).subscribe(ffw.m121197h(e30Var));
    }

    /* JADX INFO: renamed from: Z3 */
    public void m192576Z3() {
        ((fan0) this.viewModel).m120236Y();
        m192574X3();
    }
}
