package p002l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.RedDotButton;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import l.e30;
import l.ffw;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gb2 extends yp1 {

    /* JADX INFO: renamed from: s */
    public final sb2 f11331s;

    public gb2(bsm bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, i3c0.f12837j6, bLiveBottomButton);
        this.f11331s = (sb2) z2(new sb2(bsmVar));
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        super.mo10610V3(view);
        this.f11331s.m22347g4();
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get("settingButton");
    }

    /* JADX INFO: renamed from: j4 */
    public void m13701j4(boolean z) {
        ((RedDotButton) this.f9196k).mo5611g0(z);
    }

    /* JADX INFO: renamed from: t */
    public void m13702t() {
        super.t();
        duringCreated((c) m25548F2().BottomEvent.setSettingButtonRedDot().g()).subscribe(ffw.d(new e30() { // from class: l.fb2
            public final void call(Object obj) {
                this.f10219a.m13701j4(((Boolean) obj).booleanValue());
            }
        }));
    }
}
