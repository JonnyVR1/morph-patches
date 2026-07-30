package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.bean.UserRightType;
import com.p051p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p051p1.mobile.putong.live.external.page.rights.list.view.RightEnterRoomEffectView;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ead0 extends d9d0<RightEnterRoomEffectView> {
    public ead0(BLiveRightItem bLiveRightItem, int i, String str, boolean z, j9d0 j9d0Var) {
        super(bLiveRightItem, i, str, z, j9d0Var);
        this.f85765j = UserRightType.ENTER_ROOM_EFFECT;
        boolean z2 = true;
        this.f92628c = 1;
        if (i != 0 && i != 1) {
            z2 = false;
        }
        this.f92626a = z2;
    }

    /* JADX INFO: renamed from: V */
    private boolean m120037V() {
        return this.f85761f % 2 == 0;
    }

    /* JADX INFO: renamed from: W */
    private boolean m120038W() {
        return this.f85761f % 2 == 1;
    }

    @Override // p153l.d9d0
    /* JADX INFO: renamed from: O */
    public int mo103092O() {
        return qa00.m175859d(m120037V() ? 10.0f : 5.0f);
    }

    @Override // p153l.d9d0
    /* JADX INFO: renamed from: P */
    public int mo103093P() {
        return qa00.m175859d(m120038W() ? 10.0f : 5.0f);
    }

    @Override // p153l.d9d0
    /* JADX INFO: renamed from: R */
    public int mo103094R() {
        if (this.f92626a) {
            return qa00.m175859d(12.0f);
        }
        return 0;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo71749u(RightEnterRoomEffectView rightEnterRoomEffectView) {
        super.mo71749u(rightEnterRoomEffectView);
        rightEnterRoomEffectView.m71772e(this, this.f85764i);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void mo71942v(RightEnterRoomEffectView rightEnterRoomEffectView, @NonNull List<Object> list) {
        super.mo71942v(rightEnterRoomEffectView, list);
        if (jyb.m147479J(list)) {
            mo71749u(rightEnterRoomEffectView);
            return;
        }
        int iIntValue = ((Integer) list.get(0)).intValue();
        if (iIntValue == 1) {
            rightEnterRoomEffectView.m71771d();
        } else if (iIntValue == 2) {
            rightEnterRoomEffectView.m71770c();
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193871h1;
    }
}
