package p002l;

import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.areaA.view.BottomInputView;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import java.util.List;
import l.bwr;
import l.e30;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bz0 extends ul2<cz0> {
    public bz0(bsm bsmVar, BottomInputView bottomInputView) {
        super(bsmVar);
        C(new cz0(bottomInputView));
        bottomInputView.setOnLayoutAction(new e30() { // from class: l.zy0
            public final void call(Object obj) {
                this.f23666a.m10688d4((Integer) obj);
            }
        });
    }

    @Override // p002l.qj2
    /* JADX INFO: renamed from: T3 */
    public ViewGroup mo10687T3() {
        return ((cz0) ((bwr) this).viewModel).f8994a;
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m10688d4(Integer num) {
        m25548F2().BottomEvent.setApplyLineVisibility().j(Boolean.valueOf(num.intValue() > 0));
    }

    /* JADX INFO: renamed from: e4 */
    public final void m10689e4(BLiveBottomButton bLiveBottomButton) {
        String string = bLiveBottomButton.localType.toString();
        string.getClass();
        if (string.equals("multiCallButtonInput")) {
            z2(new w310(this.f22036e, bLiveBottomButton));
        } else if (string.equals("callButtonInput")) {
            z2(new m14(this.f22036e, bLiveBottomButton));
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m10690f4(List<BLiveBottomButton> list) {
        ((cz0) ((bwr) this).viewModel).f8994a.removeAllViews();
        vwb.z(list, new e30() { // from class: l.az0
            public final void call(Object obj) {
                this.f7928a.m10689e4((BLiveBottomButton) obj);
            }
        });
    }
}
