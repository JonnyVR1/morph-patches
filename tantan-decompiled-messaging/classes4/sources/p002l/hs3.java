package p002l;

import android.view.View;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import l.e30;
import l.ffw;
import l.soj0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hs3 extends mz0 {
    public hs3(bsm bsmVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(bsmVar, bLiveBottomButton, i, i2, str, i3c0.f12907p4, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m14802p4(soj0 soj0Var) {
        mo11811b4(false);
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: T */
    public void mo10607T() {
        super.mo10607T();
        duringCreated((c) m25548F2().BottomEvent.hideGiftPacket().g()).subscribe(ffw.d(new e30() { // from class: l.gs3
            public final void call(Object obj) {
                this.f11604a.m14802p4((soj0) obj);
            }
        }));
    }

    @Override // p002l.i80, p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        super.mo10610V3(view);
        m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(2700).m25610e(this.f9197l.url).m25608c());
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get("lotteryGiftRedpacket");
    }
}
