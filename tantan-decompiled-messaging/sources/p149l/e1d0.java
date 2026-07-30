package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.bean.UserRightType;
import com.p046p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p046p1.mobile.putong.live.external.page.rights.list.view.RightChatShadingView;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class e1d0 extends a1d0<RightChatShadingView> {
    public e1d0(BLiveRightItem bLiveRightItem, int i, String str, boolean z, g1d0 g1d0Var) {
        super(bLiveRightItem, i, str, z, g1d0Var);
        this.f67178j = UserRightType.CHAT_UNDER_SHADE;
        this.f72584a = i == 0;
    }

    @Override // p149l.a1d0
    /* JADX INFO: renamed from: O */
    public int mo94554O() {
        return t100.m186890d(10.0f);
    }

    @Override // p149l.a1d0
    /* JADX INFO: renamed from: P */
    public int mo94555P() {
        return t100.m186890d(10.0f);
    }

    @Override // p149l.a1d0
    /* JADX INFO: renamed from: R */
    public int mo94557R() {
        if (this.f72584a) {
            return t100.m186890d(12.0f);
        }
        return 0;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo70566u(RightChatShadingView rightChatShadingView) {
        super.mo70566u(rightChatShadingView);
        rightChatShadingView.m70576e(this, this.f67177i);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo70759v(RightChatShadingView rightChatShadingView, @NonNull List<Object> list) {
        super.mo70759v(rightChatShadingView, list);
        if (vwb.m200296J(list)) {
            mo70566u(rightChatShadingView);
            return;
        }
        int iIntValue = ((Integer) list.get(0)).intValue();
        if (iIntValue == 1) {
            rightChatShadingView.m70575d();
        } else if (iIntValue == 2) {
            rightChatShadingView.m70574c();
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162749f1;
    }
}
