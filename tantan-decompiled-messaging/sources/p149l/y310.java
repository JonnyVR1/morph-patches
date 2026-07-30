package p149l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.MultiCallBottomMenuView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class y310 extends df2<MultiCallBottomMenuView> {
    public y310(bsm bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, t6c0.f168341f4, bLiveBottomButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public /* synthetic */ void m212765j4(List list) {
        m212766l4(list.size());
    }

    /* JADX INFO: renamed from: l4 */
    private void m212766l4(int i) {
        ((MultiCallBottomMenuView) this.f85887k).m72160b(i);
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo103804V3(View view) {
        super.mo103804V3(view);
        zi10.m218897h();
        r610.m177995b0(this, this.f188512e, -1, 4, true);
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo103807X3() {
        return BLiveButtonType.get(BLiveButtonType.multiCallButton);
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void mo108215d4(MultiCallBottomMenuView multiCallBottomMenuView) {
        super.mo108215d4(multiCallBottomMenuView);
        multiCallBottomMenuView.setLayoutParams(new LinearLayout.LayoutParams(df2.f85884o, df2.f85885p));
        if (TextUtils.isEmpty(mo111417Z3())) {
            multiCallBottomMenuView.setIcon(i3c0.f111004f6);
        } else {
            multiCallBottomMenuView.setIcon(mo111417Z3());
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m212766l4(0);
        if (m206032L2()) {
            duringCreated(m206028F2().MultiCallEvent.applyData().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.x310
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f190859a.m212765j4((List) obj);
                }
            }));
        }
    }
}
