package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.live.base.bean.UserRightType;
import com.p046p1.mobile.putong.live.external.page.rights.manage.view.UserRightItemView;

/* JADX INFO: loaded from: classes13.dex */
public class n8k0 extends d1q<UserRightItemView> {

    /* JADX INFO: renamed from: a */
    public Bundle f137658a;

    /* JADX INFO: renamed from: b */
    public UserRightType f137659b;

    public n8k0(Bundle bundle, UserRightType userRightType) {
        this.f137658a = bundle;
        this.f137659b = userRightType;
    }

    /* JADX INFO: renamed from: H */
    public Bundle m158502H() {
        return this.f137658a;
    }

    /* JADX INFO: renamed from: I */
    public UserRightType m158503I() {
        return this.f137659b;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo70566u(UserRightItemView userRightItemView) {
        super.mo70566u(userRightItemView);
        userRightItemView.m70658k0(this);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162773l1;
    }
}
