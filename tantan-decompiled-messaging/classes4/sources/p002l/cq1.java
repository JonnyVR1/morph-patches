package p002l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.BottomCallButton;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import l.bax;
import l.e30;
import l.ffw;
import l.lsi0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cq1 extends df2<BottomCallButton> {
    public cq1(bsm bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, t6c0.f20027u, bLiveBottomButton);
    }

    /* JADX INFO: renamed from: i4 */
    public static /* synthetic */ void m11309i4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public void m11311m4(int i) {
        ((BottomCallButton) this.f9196k).m5610b(i);
    }

    @Override // p002l.df2
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

    /* JADX WARN: Type inference failed for: r3v6, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: k4 */
    public final void m11313k4(BLiveBottomButton bLiveBottomButton) {
        Boolean bool = (Boolean) m14184F3(new yl3(800).m26783e(bLiveBottomButton.url));
        m11311m4(0);
        if (bool.booleanValue()) {
            duringCreated(LivingNormalApiProvider.m4639L3(m25547E2().m17235k())).map(new aq1()).subscribe(ffw.e(new zp1(this), new e30() { // from class: l.bq1
                public final void call(Object obj) {
                    cq1.m11309i4((Throwable) obj);
                }
            }));
        }
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: l4, reason: merged with bridge method [inline-methods] */
    public void mo11312d4(BottomCallButton bottomCallButton) {
        super.mo11312d4(bottomCallButton);
        bottomCallButton.setLayoutParams(new LinearLayout.LayoutParams(df2.f9193o, df2.f9194p));
        if (TextUtils.isEmpty(mo11809Z3())) {
            bottomCallButton.setIcon(i3c0.f12777e6);
        } else {
            bottomCallButton.setIcon(mo11809Z3());
        }
    }

    /* JADX INFO: renamed from: t */
    public void m11315t() {
        super.t();
        m11313k4(this.f9197l);
        if (m25552L2()) {
            duringCreated((c) m25548F2().CallEvent.updateCallNum().i(true)).subscribe(ffw.d(new zp1(this)));
        }
    }
}
