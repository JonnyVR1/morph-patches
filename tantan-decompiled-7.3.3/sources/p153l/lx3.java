package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;

/* JADX INFO: loaded from: classes4.dex */
public class lx3 extends tz0 {
    public lx3(dum dumVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(dumVar, bLiveBottomButton, i, i2, str, 0, str2);
    }

    @Override // p153l.e80, p153l.kf2
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(View view) {
        super.mo96798V3(view);
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(this.f126234m).m103154e(m119795j4()).m103152c());
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo96799X3() {
        return BLiveButtonType.get("unknown_");
    }
}
