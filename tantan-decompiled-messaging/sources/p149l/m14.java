package p149l;

import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.InputCallButton;

/* JADX INFO: loaded from: classes4.dex */
public class m14 extends df2<InputCallButton> {
    public m14(bsm<? extends ho2> bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, t6c0.f168355g5, bLiveBottomButton);
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo103804V3(View view) {
        super.mo103804V3(view);
        m206028F2().CallEvent.anchorCallAudience().m172467p();
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo103807X3() {
        return BLiveButtonType.get(BLiveButtonType.callButtonInput);
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: Z3 */
    public String mo111417Z3() {
        return vwb.m200296J(this.f85888l.icon) ? "" : this.f85888l.icon.get(0);
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m152567m4(tzd tzdVar) {
        m152569o4(false);
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m152568n4(LiveCallMessage liveCallMessage) {
        m152569o4(true);
    }

    /* JADX INFO: renamed from: o4 */
    public void m152569o4(boolean z) {
        ((InputCallButton) this.f85887k).m72157b(z);
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: p4, reason: merged with bridge method [inline-methods] */
    public void mo108215d4(InputCallButton inputCallButton) {
        super.mo108215d4(inputCallButton);
        inputCallButton.setLayoutParams(new LinearLayout.LayoutParams(t100.m186890d(26.0f), t100.m186890d(26.0f)));
        inputCallButton.setIcon(mo111417Z3());
    }

    /* JADX INFO: renamed from: q4 */
    public void m152571q4(boolean z) {
        ((InputCallButton) this.f85887k).m72158c(z);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().DialogCenterEvent.changeVisibility().m172462i(true)).filter(new w9j() { // from class: l.h14
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((tzd) obj).f172729a == LiveDialogEnum.CALl_AUDIENCE_APPLY_DIALOG);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.i14
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110419a.m152567m4((tzd) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189101f()).filter(new w9j() { // from class: l.j14
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((LiveCallMessage) obj).m71823is(2));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.k14
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120537a.m152568n4((LiveCallMessage) obj);
            }
        }));
        duringCreated(m206028F2().CallEvent.roomCall().m172462i(true)).subscribe(ffw.m121193d(new e30() { // from class: l.l14
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125614a.m152571q4(((Boolean) obj).booleanValue());
            }
        }));
    }
}
