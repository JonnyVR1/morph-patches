package p153l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.BottomCallButton;

/* JADX INFO: loaded from: classes4.dex */
public class jq1 extends kf2<BottomCallButton> {
    public jq1(dum dumVar, BLiveBottomButton bLiveBottomButton) {
        super(dumVar, yec0.f199263u, bLiveBottomButton);
    }

    /* JADX INFO: renamed from: i4 */
    public static /* synthetic */ void m146533i4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public void m146535m4(int i) {
        ((BottomCallButton) this.f126232k).m73320b(i);
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(View view) {
        super.mo96798V3(view);
        if (((Boolean) m138856F3(new adx(800))).booleanValue()) {
            o1j0.m165634h(R$string.f48292p1);
        } else if (this.f196918e.f90824j.m209548L3(MotionType.multi_call)) {
            o1j0.m165634h(R$string.f47948Z7);
        } else {
            m213811F2().CallEvent.anchorCallManageDialog().m199277p();
        }
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo96799X3() {
        return BLiveButtonType.get(BLiveButtonType.callButton);
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: k4 */
    public final void m146536k4(BLiveBottomButton bLiveBottomButton) {
        Boolean bool = (Boolean) m138856F3(new ym3(800).m216672e(bLiveBottomButton.url));
        m146535m4(0);
        if (bool.booleanValue()) {
            duringCreated(LivingNormalApiProvider.m72456L3(m213810E2().m202191k())).map(new hq1()).subscribe(dhw.m115826e(new gq1(this), new y20() { // from class: l.iq1
                @Override // p153l.y20
                public final void call(Object obj) {
                    jq1.m146533i4((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: l4, reason: merged with bridge method [inline-methods] */
    public void mo108591d4(BottomCallButton bottomCallButton) {
        super.mo108591d4(bottomCallButton);
        bottomCallButton.setLayoutParams(new LinearLayout.LayoutParams(kf2.f126229o, kf2.f126230p));
        if (TextUtils.isEmpty(mo119793Z3())) {
            bottomCallButton.setIcon(obc0.f146320e6);
        } else {
            bottomCallButton.setIcon(mo119793Z3());
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m146536k4(this.f126233l);
        if (m213815L2()) {
            duringCreated(m213811F2().CallEvent.updateCallNum().m199272i(true)).subscribe(dhw.m115825d(new gq1(this)));
        }
    }
}
