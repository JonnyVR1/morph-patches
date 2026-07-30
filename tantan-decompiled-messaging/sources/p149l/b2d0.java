package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.bean.UserRightType;
import com.p046p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p046p1.mobile.putong.live.external.page.rights.list.view.RightEnterRoomEffectView;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class b2d0 extends a1d0<RightEnterRoomEffectView> {
    public b2d0(BLiveRightItem bLiveRightItem, int i, String str, boolean z, g1d0 g1d0Var) {
        super(bLiveRightItem, i, str, z, g1d0Var);
        this.f67178j = UserRightType.ENTER_ROOM_EFFECT;
        boolean z2 = true;
        this.f72586c = 1;
        if (i != 0 && i != 1) {
            z2 = false;
        }
        this.f72584a = z2;
    }

    /* JADX INFO: renamed from: V */
    private boolean m99957V() {
        return this.f67174f % 2 == 0;
    }

    /* JADX INFO: renamed from: W */
    private boolean m99958W() {
        return this.f67174f % 2 == 1;
    }

    @Override // p149l.a1d0
    /* JADX INFO: renamed from: O */
    public int mo94554O() {
        return t100.m186890d(m99957V() ? 10.0f : 5.0f);
    }

    @Override // p149l.a1d0
    /* JADX INFO: renamed from: P */
    public int mo94555P() {
        return t100.m186890d(m99958W() ? 10.0f : 5.0f);
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
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo70566u(RightEnterRoomEffectView rightEnterRoomEffectView) {
        super.mo70566u(rightEnterRoomEffectView);
        rightEnterRoomEffectView.m70589e(this, this.f67177i);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void mo70759v(RightEnterRoomEffectView rightEnterRoomEffectView, @NonNull List<Object> list) {
        super.mo70759v(rightEnterRoomEffectView, list);
        if (vwb.m200296J(list)) {
            mo70566u(rightEnterRoomEffectView);
            return;
        }
        int iIntValue = ((Integer) list.get(0)).intValue();
        if (iIntValue == 1) {
            rightEnterRoomEffectView.m70588d();
        } else if (iIntValue == 2) {
            rightEnterRoomEffectView.m70587c();
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162757h1;
    }
}
