package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDotButton;

/* JADX INFO: loaded from: classes4.dex */
public class gb2 extends yp1 {

    /* JADX INFO: renamed from: s */
    public final sb2 f101789s;

    public gb2(bsm bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, i3c0.f111052j6, bLiveBottomButton);
        this.f101789s = (sb2) m144512z2(new sb2(bsmVar));
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo103804V3(View view) {
        super.mo103804V3(view);
        this.f101789s.m183192g4();
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo103807X3() {
        return BLiveButtonType.get("settingButton");
    }

    /* JADX INFO: renamed from: j4 */
    public void m125114j4(boolean z) {
        ((RedDotButton) this.f85887k).mo72138g0(z);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().BottomEvent.setSettingButtonRedDot().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.fb2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96690a.m125114j4(((Boolean) obj).booleanValue());
            }
        }));
    }
}
