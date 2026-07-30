package p149l;

import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.areaA.view.BottomInputView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class bz0 extends ul2<cz0> {
    public bz0(bsm bsmVar, BottomInputView bottomInputView) {
        super(bsmVar);
        mo51532C(new cz0(bottomInputView));
        bottomInputView.setOnLayoutAction(new e30() { // from class: l.zy0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205594a.m104533d4((Integer) obj);
            }
        });
    }

    @Override // p149l.qj2
    /* JADX INFO: renamed from: T3 */
    public ViewGroup mo104532T3() {
        return ((cz0) this.viewModel).f83052a;
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m104533d4(Integer num) {
        m206028F2().BottomEvent.setApplyLineVisibility().mo172463j(Boolean.valueOf(num.intValue() > 0));
    }

    /* JADX INFO: renamed from: e4 */
    public final void m104534e4(BLiveBottomButton bLiveBottomButton) {
        String string = bLiveBottomButton.localType.toString();
        string.getClass();
        if (string.equals(BLiveButtonType.multiCallButtonInput)) {
            m144512z2(new w310(this.f188512e, bLiveBottomButton));
        } else if (string.equals(BLiveButtonType.callButtonInput)) {
            m144512z2(new m14(this.f188512e, bLiveBottomButton));
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m104535f4(List<BLiveBottomButton> list) {
        ((cz0) this.viewModel).f83052a.removeAllViews();
        vwb.m200354z(list, new e30() { // from class: l.az0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72325a.m104534e4((BLiveBottomButton) obj);
            }
        });
    }
}
