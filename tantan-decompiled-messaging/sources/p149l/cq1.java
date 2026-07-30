package p149l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.BottomCallButton;

/* JADX INFO: loaded from: classes4.dex */
public class cq1 extends df2<BottomCallButton> {
    public cq1(bsm bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, t6c0.f168531u, bLiveBottomButton);
    }

    /* JADX INFO: renamed from: i4 */
    public static /* synthetic */ void m108212i4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public void m108214m4(int i) {
        ((BottomCallButton) this.f85887k).m72137b(i);
    }

    @Override // p149l.df2
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

    /* JADX WARN: Type inference failed for: r3v6, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: k4 */
    public final void m108216k4(BLiveBottomButton bLiveBottomButton) {
        Boolean bool = (Boolean) m129297F3(new yl3(800).m215212e(bLiveBottomButton.url));
        m108214m4(0);
        if (bool.booleanValue()) {
            duringCreated(LivingNormalApiProvider.m71273L3(m206027E2().m149814k())).map(new aq1()).subscribe(ffw.m121194e(new zp1(this), new e30() { // from class: l.bq1
                @Override // p149l.e30
                public final void call(Object obj) {
                    cq1.m108212i4((Throwable) obj);
                }
            }));
        }
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: l4, reason: merged with bridge method [inline-methods] */
    public void mo108215d4(BottomCallButton bottomCallButton) {
        super.mo108215d4(bottomCallButton);
        bottomCallButton.setLayoutParams(new LinearLayout.LayoutParams(df2.f85884o, df2.f85885p));
        if (TextUtils.isEmpty(mo111417Z3())) {
            bottomCallButton.setIcon(i3c0.f110992e6);
        } else {
            bottomCallButton.setIcon(mo111417Z3());
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m108216k4(this.f85888l);
        if (m206032L2()) {
            duringCreated(m206028F2().CallEvent.updateCallNum().m172462i(true)).subscribe(ffw.m121193d(new zp1(this)));
        }
    }
}
