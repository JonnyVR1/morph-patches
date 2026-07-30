package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.ContainerLabelsType;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class gk4 extends AbstractC17382h4 {
    public gk4(rql rqlVar, User user, CoreSuggested.UserInfo userInfo) {
        super(rqlVar, user, userInfo);
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: c */
    public boolean mo116206c() {
        return !this.f107715c.mo37842O();
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: d */
    public String mo116207d() {
        return ContainerLabelsType.same_interests;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: h */
    public boolean mo116209h() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (!NullChecker.m82486a(userM116600p9) || this.f107713a.isMe()) {
            bnl0.m105524M(this.f107715c.mo37894h0(), false);
            return false;
        }
        Profile profile = userM116600p9.profile;
        User user = this.f107713a;
        int iM181450c = rgk0.m181450c(profile, user, user.profile.tags);
        this.f107715c.mo37894h0().setText(String.valueOf(iM181450c));
        bnl0.m105524M(this.f107715c.mo37894h0(), iM181450c > 0);
        this.f107715c.mo37894h0().setTypeface(lyh0.m156283c(3), 1);
        return iM181450c > 0;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: a */
    public void mo116205a() {
    }
}
