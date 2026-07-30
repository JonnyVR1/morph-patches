package p153l;

import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.areaA.view.BottomInputView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class iz0 extends cm2<jz0> {
    public iz0(dum dumVar, BottomInputView bottomInputView) {
        super(dumVar);
        mo52715C(new jz0(bottomInputView));
        bottomInputView.setOnLayoutAction(new y20() { // from class: l.gz0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107134a.m142752d4((Integer) obj);
            }
        });
    }

    @Override // p153l.yj2
    /* JADX INFO: renamed from: T3 */
    public ViewGroup mo130467T3() {
        return ((jz0) this.viewModel).f123217a;
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m142752d4(Integer num) {
        m213811F2().BottomEvent.setApplyLineVisibility().mo199273j(Boolean.valueOf(num.intValue() > 0));
    }

    /* JADX INFO: renamed from: e4 */
    public final void m142753e4(BLiveBottomButton bLiveBottomButton) {
        String string = bLiveBottomButton.localType.toString();
        string.getClass();
        if (string.equals(BLiveButtonType.multiCallButtonInput)) {
            m153103z2(new gc10(this.f196918e, bLiveBottomButton));
        } else if (string.equals(BLiveButtonType.callButtonInput)) {
            m153103z2(new l24(this.f196918e, bLiveBottomButton));
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m142754f4(List<BLiveBottomButton> list) {
        ((jz0) this.viewModel).f123217a.removeAllViews();
        jyb.m147537z(list, new y20() { // from class: l.hz0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112183a.m142753e4((BLiveBottomButton) obj);
            }
        });
    }
}
