package p002l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.MultiCallBottomMenuView;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import java.util.List;
import l.e30;
import l.ffw;
import l.r610;
import l.zi10;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class y310 extends df2<MultiCallBottomMenuView> {
    public y310(bsm bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, t6c0.f19837f4, bLiveBottomButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public /* synthetic */ void m26338j4(List list) {
        m26339l4(list.size());
    }

    /* JADX INFO: renamed from: l4 */
    private void m26339l4(int i) {
        ((MultiCallBottomMenuView) this.f9196k).m5633b(i);
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        super.mo10610V3(view);
        zi10.h();
        r610.b0(this, this.f22036e, -1, 4, true);
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get("multiCallButton");
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void mo11312d4(MultiCallBottomMenuView multiCallBottomMenuView) {
        super.mo11312d4(multiCallBottomMenuView);
        multiCallBottomMenuView.setLayoutParams(new LinearLayout.LayoutParams(df2.f9193o, df2.f9194p));
        if (TextUtils.isEmpty(mo11809Z3())) {
            multiCallBottomMenuView.setIcon(i3c0.f12789f6);
        } else {
            multiCallBottomMenuView.setIcon(mo11809Z3());
        }
    }

    /* JADX INFO: renamed from: t */
    public void m26341t() {
        super.t();
        m26339l4(0);
        if (m25552L2()) {
            duringCreated((c) m25548F2().MultiCallEvent.applyData().g()).subscribe(ffw.h(new e30() { // from class: l.x310
                public final void call(Object obj) {
                    this.f22102a.m26338j4((List) obj);
                }
            }));
        }
    }
}
