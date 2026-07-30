package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.live.base.bean.UserRightType;
import com.p051p1.mobile.putong.live.external.page.rights.manage.view.UserRightItemView;

/* JADX INFO: loaded from: classes9.dex */
public class thk0 extends d3q<UserRightItemView> {

    /* JADX INFO: renamed from: a */
    public Bundle f174386a;

    /* JADX INFO: renamed from: b */
    public UserRightType f174387b;

    public thk0(Bundle bundle, UserRightType userRightType) {
        this.f174386a = bundle;
        this.f174387b = userRightType;
    }

    /* JADX INFO: renamed from: H */
    public Bundle m191262H() {
        return this.f174386a;
    }

    /* JADX INFO: renamed from: I */
    public UserRightType m191263I() {
        return this.f174387b;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71749u(UserRightItemView userRightItemView) {
        super.mo71749u(userRightItemView);
        userRightItemView.m71841k0(this);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193887l1;
    }
}
