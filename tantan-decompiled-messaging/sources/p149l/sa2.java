package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;

/* JADX INFO: loaded from: classes4.dex */
public class sa2 extends yp1 {
    public sa2(bsm bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, i3c0.f111040i6, bLiveBottomButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public /* synthetic */ void m182794k4(soj0 soj0Var) {
        mo111419b4(false);
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo103804V3(View view) {
        super.mo103804V3(view);
        m111420c4();
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo103807X3() {
        return BLiveButtonType.get(BLiveButtonType.lotteryGiftRedpacket);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().BottomEvent.hideGiftPacket().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ra2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158470a.m182794k4((soj0) obj);
            }
        }));
    }
}
