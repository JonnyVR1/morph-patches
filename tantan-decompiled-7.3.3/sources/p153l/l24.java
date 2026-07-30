package p153l;

import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.InputCallButton;

/* JADX INFO: loaded from: classes4.dex */
public class l24 extends kf2<InputCallButton> {
    public l24(dum<? extends oo2> dumVar, BLiveBottomButton bLiveBottomButton) {
        super(dumVar, yec0.f199087g5, bLiveBottomButton);
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(View view) {
        super.mo96798V3(view);
        m213811F2().CallEvent.anchorCallAudience().m199277p();
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo96799X3() {
        return BLiveButtonType.get(BLiveButtonType.callButtonInput);
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: Z3 */
    public String mo119793Z3() {
        return jyb.m147479J(this.f126233l.icon) ? "" : this.f126233l.icon.get(0);
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m152564m4(h1e h1eVar) {
        m152566o4(false);
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m152565n4(LiveCallMessage liveCallMessage) {
        m152566o4(true);
    }

    /* JADX INFO: renamed from: o4 */
    public void m152566o4(boolean z) {
        ((InputCallButton) this.f126232k).m73340b(z);
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: p4, reason: merged with bridge method [inline-methods] */
    public void mo108591d4(InputCallButton inputCallButton) {
        super.mo108591d4(inputCallButton);
        inputCallButton.setLayoutParams(new LinearLayout.LayoutParams(qa00.m175859d(26.0f), qa00.m175859d(26.0f)));
        inputCallButton.setIcon(mo119793Z3());
    }

    /* JADX INFO: renamed from: q4 */
    public void m152568q4(boolean z) {
        ((InputCallButton) this.f126232k).m73341c(z);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().DialogCenterEvent.changeVisibility().m199272i(true)).filter(new qcj() { // from class: l.g24
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((h1e) obj).f107441a == LiveDialogEnum.CALl_AUDIENCE_APPLY_DIALOG);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.h24
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107521a.m152564m4((h1e) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98283f()).filter(new qcj() { // from class: l.i24
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((LiveCallMessage) obj).m73006is(2));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.j24
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118031a.m152565n4((LiveCallMessage) obj);
            }
        }));
        duringCreated(m213811F2().CallEvent.roomCall().m199272i(true)).subscribe(dhw.m115825d(new y20() { // from class: l.k24
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123571a.m152568q4(((Boolean) obj).booleanValue());
            }
        }));
    }
}
