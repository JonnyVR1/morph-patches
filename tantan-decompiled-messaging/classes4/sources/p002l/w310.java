package p002l;

import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.InputCallButton;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.ffw;
import l.r610;
import l.t100;
import l.vwb;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class w310 extends df2<InputCallButton> {
    public w310(bsm<? extends ho2> bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, t6c0.f19851g5, bLiveBottomButton);
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        super.mo10610V3(view);
        BLiveMultiCall bLiveMultiCallB = r610.B(this);
        if (NullChecker.a(bLiveMultiCallB)) {
            m25548F2().MultiCallEvent.openCallingOperateDialog().j(bLiveMultiCallB);
        } else {
            m25548F2().MultiCallEvent.openApplyDlg().j(2);
        }
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get("multiCallButtonInput");
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: Z3 */
    public String mo11809Z3() {
        return vwb.J(this.f9197l.icon) ? "" : (String) this.f9197l.icon.get(0);
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public void mo11312d4(InputCallButton inputCallButton) {
        super.mo11312d4(inputCallButton);
        inputCallButton.setLayoutParams(new LinearLayout.LayoutParams(t100.d(26.0f), t100.d(26.0f)));
        inputCallButton.setIcon(mo11809Z3());
    }

    /* JADX INFO: renamed from: j4 */
    public void m24296j4(boolean z) {
        ((InputCallButton) this.f9196k).m5631c(r610.M(this) && z);
    }

    /* JADX INFO: renamed from: t */
    public void m24297t() {
        super.t();
        duringCreated((c) m25548F2().MultiCallEvent.showAudienceApplyIcon().i(true)).subscribe(ffw.d(new e30() { // from class: l.v310
            public final void call(Object obj) {
                this.f20938a.m24296j4(((Boolean) obj).booleanValue());
            }
        }));
    }
}
