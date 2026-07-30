package p153l;

import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.InputCallButton;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class gc10 extends kf2<InputCallButton> {
    public gc10(dum<? extends oo2> dumVar, BLiveBottomButton bLiveBottomButton) {
        super(dumVar, yec0.f199087g5, bLiveBottomButton);
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(View view) {
        super.mo96798V3(view);
        BLiveMultiCall bLiveMultiCallM103796B = bf10.m103796B(this);
        if (NullChecker.m82486a(bLiveMultiCallM103796B)) {
            m213811F2().MultiCallEvent.openCallingOperateDialog().mo199273j(bLiveMultiCallM103796B);
        } else {
            m213811F2().MultiCallEvent.openApplyDlg().mo199273j(2);
        }
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo96799X3() {
        return BLiveButtonType.get(BLiveButtonType.multiCallButtonInput);
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: Z3 */
    public String mo119793Z3() {
        return jyb.m147479J(this.f126233l.icon) ? "" : this.f126233l.icon.get(0);
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public void mo108591d4(InputCallButton inputCallButton) {
        super.mo108591d4(inputCallButton);
        inputCallButton.setLayoutParams(new LinearLayout.LayoutParams(qa00.m175859d(26.0f), qa00.m175859d(26.0f)));
        inputCallButton.setIcon(mo119793Z3());
    }

    /* JADX INFO: renamed from: j4 */
    public void m129821j4(boolean z) {
        ((InputCallButton) this.f126232k).m73341c(bf10.m103807M(this) && z);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().MultiCallEvent.showAudienceApplyIcon().m199272i(true)).subscribe(dhw.m115825d(new y20() { // from class: l.fc10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98174a.m129821j4(((Boolean) obj).booleanValue());
            }
        }));
    }
}
