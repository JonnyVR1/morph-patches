package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CityCData;
import com.p1.mobile.putong.data.User;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class gj4 extends AbstractC0925h4 {
    public gj4(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        super(golVar, user, userInfo);
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: c */
    public boolean mo13954c() {
        return this.f13854a != null;
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: f */
    public boolean mo15079f() {
        return false;
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: h */
    public boolean mo13957h() {
        if (this.f13856c.m15116g0() == null) {
            return false;
        }
        CityCData cityCData = this.f13855b.cityCData;
        if (cityCData == null || TextUtils.isEmpty(cityCData.userId)) {
            xdl0.M(this.f13856c.m15116g0(), false);
            return false;
        }
        xdl0.M(this.f13856c.m15116g0(), true);
        return true;
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: a */
    public void mo13953a() {
    }
}
