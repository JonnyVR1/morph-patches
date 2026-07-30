package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.bean.UserRightType;
import com.p051p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p051p1.mobile.putong.live.external.page.rights.list.view.RightMedalItemView;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class xbd0 extends d9d0<RightMedalItemView> {
    public xbd0(BLiveRightItem bLiveRightItem, int i, String str, boolean z, j9d0 j9d0Var) {
        super(bLiveRightItem, i, str, z, j9d0Var);
        this.f85765j = UserRightType.USER_MEDAL_MANAGE;
        boolean z2 = true;
        this.f92628c = 1;
        if (i != 0 && i != 1) {
            z2 = false;
        }
        this.f92626a = z2;
    }

    /* JADX INFO: renamed from: V */
    private boolean m209943V() {
        return this.f85761f % 2 == 0;
    }

    /* JADX INFO: renamed from: W */
    private boolean m209944W() {
        return this.f85761f % 2 == 1;
    }

    @Override // p153l.d9d0
    /* JADX INFO: renamed from: O */
    public int mo103092O() {
        return qa00.m175859d(m209943V() ? 10.0f : 5.0f);
    }

    @Override // p153l.d9d0
    /* JADX INFO: renamed from: P */
    public int mo103093P() {
        return qa00.m175859d(m209944W() ? 10.0f : 5.0f);
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
    public void mo71749u(RightMedalItemView rightMedalItemView) {
        super.mo71749u(rightMedalItemView);
        rightMedalItemView.m71805e(this);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void mo71942v(RightMedalItemView rightMedalItemView, @NonNull List<Object> list) {
        super.mo71942v(rightMedalItemView, list);
        if (jyb.m147479J(list)) {
            mo71749u(rightMedalItemView);
            return;
        }
        int iIntValue = ((Integer) list.get(0)).intValue();
        if (iIntValue == 1) {
            rightMedalItemView.m71804d();
        } else if (iIntValue == 2) {
            rightMedalItemView.m71803c();
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193896o1;
    }
}
