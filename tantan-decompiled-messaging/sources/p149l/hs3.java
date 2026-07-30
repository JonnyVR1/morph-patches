package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;

/* JADX INFO: loaded from: classes4.dex */
public class hs3 extends mz0 {
    public hs3(bsm bsmVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(bsmVar, bLiveBottomButton, i, i2, str, i3c0.f111122p4, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m132767p4(soj0 soj0Var) {
        mo111419b4(false);
    }

    @Override // p149l.df2, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().BottomEvent.hideGiftPacket().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.gs3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104137a.m132767p4((soj0) obj);
            }
        }));
    }

    @Override // p149l.i80, p149l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo103804V3(View view) {
        super.mo103804V3(view);
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(2700).m206701e(this.f85888l.url).m206699c());
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo103807X3() {
        return BLiveButtonType.get(BLiveButtonType.lotteryGiftRedpacket);
    }
}
