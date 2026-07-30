package p002l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.BottomItemView;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import l.bax;
import l.ffw;
import l.lsi0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gr3 extends mz0 {
    public gr3(bsm bsmVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(bsmVar, bLiveBottomButton, i, i2, str, i3c0.f12563L8, str2);
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: T */
    public void mo10607T() {
        super.mo10607T();
        duringCreated((c) m25548F2().CallEvent.updateCallNum().i(true)).subscribe(ffw.h(new fr3(this)));
    }

    @Override // p002l.i80, p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        super.mo10610V3(view);
        if (((Boolean) m14184F3(new bax(800))).booleanValue()) {
            lsi0.h(R$string.f3486p1);
        } else if (this.f22036e.f8341j.m24319L3(MotionType.multi_call)) {
            lsi0.h(R$string.f3142Z7);
        } else {
            m25548F2().CallEvent.anchorCallManageDialog().p();
        }
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get("callButton");
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [l.ho2, l.lh20] */
    @Override // p002l.mz0, p002l.i80, p002l.df2
    /* JADX INFO: renamed from: n4, reason: merged with bridge method [inline-methods] */
    public void mo11312d4(BottomItemView bottomItemView) {
        super.mo11312d4(bottomItemView);
        Boolean bool = (Boolean) m14184F3(new yl3(800).m26783e(m15041j4()));
        m14021p4(this.f13098v);
        if (bool.booleanValue()) {
            duringCreated(LivingNormalApiProvider.m4639L3(m25547E2().m17235k())).map(new aq1()).subscribe(ffw.h(new fr3(this)));
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final void m14021p4(int i) {
        this.f13098v = i;
        V v = this.f9196k;
        if (v != 0) {
            ((BottomItemView) v).m5616d(i);
        }
        m25548F2().BottomEvent.refreshSettingButtonRedDot().p();
    }
}
