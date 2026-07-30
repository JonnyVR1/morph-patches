package p002l;

import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.InputCallButton;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import l.e30;
import l.ffw;
import l.t100;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class m14 extends df2<InputCallButton> {
    public m14(bsm<? extends ho2> bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, t6c0.f19851g5, bLiveBottomButton);
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        super.mo10610V3(view);
        m25548F2().CallEvent.anchorCallAudience().p();
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get("callButtonInput");
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: Z3 */
    public String mo11809Z3() {
        return vwb.J(this.f9197l.icon) ? "" : (String) this.f9197l.icon.get(0);
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m17659m4(tzd tzdVar) {
        m17661o4(false);
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m17660n4(LiveCallMessage liveCallMessage) {
        m17661o4(true);
    }

    /* JADX INFO: renamed from: o4 */
    public void m17661o4(boolean z) {
        ((InputCallButton) this.f9196k).m5630b(z);
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: p4, reason: merged with bridge method [inline-methods] */
    public void mo11312d4(InputCallButton inputCallButton) {
        super.mo11312d4(inputCallButton);
        inputCallButton.setLayoutParams(new LinearLayout.LayoutParams(t100.d(26.0f), t100.d(26.0f)));
        inputCallButton.setIcon(mo11809Z3());
    }

    /* JADX INFO: renamed from: q4 */
    public void m17663q4(boolean z) {
        ((InputCallButton) this.f9196k).m5631c(z);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m17664t() {
        super.t();
        duringCreated((c) m25548F2().DialogCenterEvent.changeVisibility().i(true)).filter(new w9j() { // from class: l.h14
            public final Object call(Object obj) {
                return Boolean.valueOf(((tzd) obj).f20436a == LiveDialogEnum.CALl_AUDIENCE_APPLY_DIALOG);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.i14
            public final void call(Object obj) {
                this.f12390a.m17659m4((tzd) obj);
            }
        }));
        duringCreated(m25547E2().m14596q1().f()).filter(new w9j() { // from class: l.j14
            public final Object call(Object obj) {
                return Boolean.valueOf(((LiveCallMessage) obj).m5199is(2));
            }
        }).subscribe(ffw.d(new e30() { // from class: l.k14
            public final void call(Object obj) {
                this.f14164a.m17660n4((LiveCallMessage) obj);
            }
        }));
        duringCreated((c) m25548F2().CallEvent.roomCall().i(true)).subscribe(ffw.d(new e30() { // from class: l.l14
            public final void call(Object obj) {
                this.f14640a.m17663q4(((Boolean) obj).booleanValue());
            }
        }));
    }
}
