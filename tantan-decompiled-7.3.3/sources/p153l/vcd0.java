package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.bean.UserRightType;
import com.p051p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p051p1.mobile.putong.live.external.page.rights.list.view.RightProfileCardView;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class vcd0 extends d9d0<RightProfileCardView> {
    public vcd0(BLiveRightItem bLiveRightItem, int i, String str, boolean z, j9d0 j9d0Var) {
        super(bLiveRightItem, i, str, z, j9d0Var);
        this.f85765j = UserRightType.PROFILE_CARD_MANAGE;
        this.f92626a = i == 0;
    }

    @Override // p153l.d9d0
    /* JADX INFO: renamed from: O */
    public int mo103092O() {
        return qa00.m175859d(10.0f);
    }

    @Override // p153l.d9d0
    /* JADX INFO: renamed from: P */
    public int mo103093P() {
        return qa00.m175859d(10.0f);
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
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo71749u(RightProfileCardView rightProfileCardView) {
        super.mo71749u(rightProfileCardView);
        rightProfileCardView.m71829e(this, this.f85764i);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo71942v(RightProfileCardView rightProfileCardView, @NonNull List<Object> list) {
        super.mo71942v(rightProfileCardView, list);
        if (jyb.m147479J(list)) {
            mo71749u(rightProfileCardView);
            return;
        }
        int iIntValue = ((Integer) list.get(0)).intValue();
        if (iIntValue == 1) {
            rightProfileCardView.m71828d();
        } else if (iIntValue == 2) {
            rightProfileCardView.m71827c();
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193908s1;
    }
}
