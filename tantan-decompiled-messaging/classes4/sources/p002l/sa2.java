package p002l;

import android.view.View;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import l.e30;
import l.ffw;
import l.soj0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class sa2 extends yp1 {
    public sa2(bsm bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, i3c0.f12825i6, bLiveBottomButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public /* synthetic */ void m22261k4(soj0 soj0Var) {
        mo11811b4(false);
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        super.mo10610V3(view);
        m11812c4();
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get("lotteryGiftRedpacket");
    }

    /* JADX INFO: renamed from: t */
    public void m22262t() {
        super.t();
        duringCreated((c) m25548F2().BottomEvent.hideGiftPacket().g()).subscribe(ffw.d(new e30() { // from class: l.ra2
            public final void call(Object obj) {
                this.f18437a.m22261k4((soj0) obj);
            }
        }));
    }
}
