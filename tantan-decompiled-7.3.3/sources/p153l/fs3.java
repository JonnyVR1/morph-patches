package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.BottomItemView;

/* JADX INFO: loaded from: classes4.dex */
public class fs3 extends tz0 {
    public fs3(dum dumVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(dumVar, bLiveBottomButton, i, i2, str, obc0.f146106L8, str2);
    }

    @Override // p153l.kf2, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().CallEvent.updateCallNum().m199272i(true)).subscribe(dhw.m115829h(new es3(this)));
    }

    @Override // p153l.e80, p153l.kf2
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

    /* JADX WARN: Type inference failed for: r2v6, types: [l.oo2, l.vp20] */
    @Override // p153l.tz0, p153l.e80, p153l.kf2
    /* JADX INFO: renamed from: n4, reason: merged with bridge method [inline-methods] */
    public void mo108591d4(BottomItemView bottomItemView) {
        super.mo108591d4(bottomItemView);
        Boolean bool = (Boolean) m138856F3(new ym3(800).m216672e(m119795j4()));
        m127020p4(this.f92497v);
        if (bool.booleanValue()) {
            duringCreated(LivingNormalApiProvider.m72456L3(m213810E2().m202191k())).map(new hq1()).subscribe(dhw.m115829h(new es3(this)));
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final void m127020p4(int i) {
        this.f92497v = i;
        V v2 = this.f126232k;
        if (v2 != 0) {
            ((BottomItemView) v2).m73326d(i);
        }
        m213811F2().BottomEvent.refreshSettingButtonRedDot().m199277p();
    }
}
