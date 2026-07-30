package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CityCData;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class fk4 extends AbstractC17382h4 {
    public fk4(rql rqlVar, User user, CoreSuggested.UserInfo userInfo) {
        super(rqlVar, user, userInfo);
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: c */
    public boolean mo116206c() {
        return this.f107713a != null;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: f */
    public boolean getShouldShowNextLabel() {
        return false;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: h */
    public boolean mo116209h() {
        if (this.f107715c.m182642g0() == null) {
            return false;
        }
        CityCData cityCData = this.f107714b.cityCData;
        if (cityCData == null || TextUtils.isEmpty(cityCData.userId)) {
            bnl0.m105524M(this.f107715c.m182642g0(), false);
            return false;
        }
        bnl0.m105524M(this.f107715c.m182642g0(), true);
        return true;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: a */
    public void mo116205a() {
    }
}
