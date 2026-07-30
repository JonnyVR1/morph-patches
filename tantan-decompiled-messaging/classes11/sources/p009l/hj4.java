package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.eqh0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hj4 extends AbstractC0925h4 {
    public hj4(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        super(golVar, user, userInfo);
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: c */
    public boolean mo13954c() {
        return !this.f13856c.mo796O();
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: d */
    public String mo13955d() {
        return "same_interests";
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: h */
    public boolean mo13957h() {
        User userP9 = CoreModule.c.e0.p9();
        if (!NullChecker.a(userP9) || this.f13854a.isMe()) {
            xdl0.M(this.f13856c.mo854h0(), false);
            return false;
        }
        Profile profile = userP9.profile;
        User user = this.f13854a;
        int iM17719c = l7k0.m17719c(profile, user, user.profile.tags);
        this.f13856c.mo854h0().setText(String.valueOf(iM17719c));
        xdl0.M(this.f13856c.mo854h0(), iM17719c > 0);
        this.f13856c.mo854h0().setTypeface(eqh0.c(3), 1);
        return iM17719c > 0;
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: a */
    public void mo13953a() {
    }
}
