package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.ContainerLabelsType;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class hj4 extends AbstractC17222h4 {
    public hj4(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        super(golVar, user, userInfo);
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: c */
    public boolean mo116769c() {
        return !this.f105776c.mo36839O();
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: d */
    public String mo116770d() {
        return ContainerLabelsType.same_interests;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: h */
    public boolean mo116772h() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (!NullChecker.m81303a(userM169527p9) || this.f105774a.isMe()) {
            xdl0.m208344M(this.f105776c.mo36891h0(), false);
            return false;
        }
        Profile profile = userM169527p9.profile;
        User user = this.f105774a;
        int iM148808c = l7k0.m148808c(profile, user, user.profile.tags);
        this.f105776c.mo36891h0().setText(String.valueOf(iM148808c));
        xdl0.m208344M(this.f105776c.mo36891h0(), iM148808c > 0);
        this.f105776c.mo36891h0().setTypeface(eqh0.m117752c(3), 1);
        return iM148808c > 0;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: a */
    public void mo116768a() {
    }
}
