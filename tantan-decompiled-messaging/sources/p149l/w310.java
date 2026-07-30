package p149l;

import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.InputCallButton;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class w310 extends df2<InputCallButton> {
    public w310(bsm<? extends ho2> bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, t6c0.f168355g5, bLiveBottomButton);
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo103804V3(View view) {
        super.mo103804V3(view);
        BLiveMultiCall bLiveMultiCallM177967B = r610.m177967B(this);
        if (NullChecker.m81303a(bLiveMultiCallM177967B)) {
            m206028F2().MultiCallEvent.openCallingOperateDialog().mo172463j(bLiveMultiCallM177967B);
        } else {
            m206028F2().MultiCallEvent.openApplyDlg().mo172463j(2);
        }
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo103807X3() {
        return BLiveButtonType.get(BLiveButtonType.multiCallButtonInput);
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: Z3 */
    public String mo111417Z3() {
        return vwb.m200296J(this.f85888l.icon) ? "" : this.f85888l.icon.get(0);
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public void mo108215d4(InputCallButton inputCallButton) {
        super.mo108215d4(inputCallButton);
        inputCallButton.setLayoutParams(new LinearLayout.LayoutParams(t100.m186890d(26.0f), t100.m186890d(26.0f)));
        inputCallButton.setIcon(mo111417Z3());
    }

    /* JADX INFO: renamed from: j4 */
    public void m201249j4(boolean z) {
        ((InputCallButton) this.f85887k).m72158c(r610.m177978M(this) && z);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().MultiCallEvent.showAudienceApplyIcon().m172462i(true)).subscribe(ffw.m121193d(new e30() { // from class: l.v310
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179619a.m201249j4(((Boolean) obj).booleanValue());
            }
        }));
    }
}
