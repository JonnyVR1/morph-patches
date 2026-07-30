package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.BottomItemView;

/* JADX INFO: loaded from: classes4.dex */
public class gr3 extends mz0 {
    public gr3(bsm bsmVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(bsmVar, bLiveBottomButton, i, i2, str, i3c0.f110778L8, str2);
    }

    @Override // p149l.df2, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().CallEvent.updateCallNum().m172462i(true)).subscribe(ffw.m121197h(new fr3(this)));
    }

    @Override // p149l.i80, p149l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo103804V3(View view) {
        super.mo103804V3(view);
        if (((Boolean) m129297F3(new bax(800))).booleanValue()) {
            lsi0.m151578h(R$string.f47444p1);
        } else if (this.f188512e.f77104j.m201577L3(MotionType.multi_call)) {
            lsi0.m151578h(R$string.f47100Z7);
        } else {
            m206028F2().CallEvent.anchorCallManageDialog().m172467p();
        }
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo103807X3() {
        return BLiveButtonType.get(BLiveButtonType.callButton);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [l.ho2, l.lh20] */
    @Override // p149l.mz0, p149l.i80, p149l.df2
    /* JADX INFO: renamed from: n4, reason: merged with bridge method [inline-methods] */
    public void mo108215d4(BottomItemView bottomItemView) {
        super.mo108215d4(bottomItemView);
        Boolean bool = (Boolean) m129297F3(new yl3(800).m215212e(m134931j4()));
        m127663p4(this.f111971v);
        if (bool.booleanValue()) {
            duringCreated(LivingNormalApiProvider.m71273L3(m206027E2().m149814k())).map(new aq1()).subscribe(ffw.m121197h(new fr3(this)));
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final void m127663p4(int i) {
        this.f111971v = i;
        V v2 = this.f85887k;
        if (v2 != 0) {
            ((BottomItemView) v2).m72143d(i);
        }
        m206028F2().BottomEvent.refreshSettingButtonRedDot().m172467p();
    }
}
