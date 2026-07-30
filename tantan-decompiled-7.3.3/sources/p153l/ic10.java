package p153l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.MultiCallBottomMenuView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ic10 extends kf2<MultiCallBottomMenuView> {
    public ic10(dum dumVar, BLiveBottomButton bLiveBottomButton) {
        super(dumVar, yec0.f199073f4, bLiveBottomButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public /* synthetic */ void m139420j4(List list) {
        m139421l4(list.size());
    }

    /* JADX INFO: renamed from: l4 */
    private void m139421l4(int i) {
        ((MultiCallBottomMenuView) this.f126232k).m73343b(i);
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(View view) {
        super.mo96798V3(view);
        jr10.m146661h();
        bf10.m103824b0(this, this.f196918e, -1, 4, true);
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo96799X3() {
        return BLiveButtonType.get(BLiveButtonType.multiCallButton);
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void mo108591d4(MultiCallBottomMenuView multiCallBottomMenuView) {
        super.mo108591d4(multiCallBottomMenuView);
        multiCallBottomMenuView.setLayoutParams(new LinearLayout.LayoutParams(kf2.f126229o, kf2.f126230p));
        if (TextUtils.isEmpty(mo119793Z3())) {
            multiCallBottomMenuView.setIcon(obc0.f146332f6);
        } else {
            multiCallBottomMenuView.setIcon(mo119793Z3());
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m139421l4(0);
        if (m213815L2()) {
            duringCreated(m213811F2().MultiCallEvent.applyData().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.hc10
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f108664a.m139420j4((List) obj);
                }
            }));
        }
    }
}
