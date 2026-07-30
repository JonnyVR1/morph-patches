package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.ContainerLabelsType;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.PicksHelper;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class ol4 extends AbstractC17222h4 {
    public ol4(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        super(golVar, user, userInfo);
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: c */
    public boolean mo116769c() {
        return false;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: d */
    public String mo116770d() {
        return ContainerLabelsType.daily_picks;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: h */
    public boolean mo116772h() {
        if (this.f105776c.mo36951z0() == null || this.f105776c.mo36865Z() == null || this.f105776c.mo36909m0() == null || this.f105776c.mo36933t0() == null || this.f105776c.mo36915o0() == null || this.f105776c.mo36951z0() == null) {
            return false;
        }
        if (this.f105776c.mo110063g() && !xdl0.m208349O0(this.f105776c.mo36951z0())) {
            PicksHelper.INSTANCE.m56740b().m56738q();
            if (!CoreModule.f17545c.f19658k1.m184471p3(this.f105774a.f56011id)) {
                CoreModule.f17545c.f19658k1.m184470J3(this.f105774a.f56011id);
                zvf0.m220368A("e_card_daily_picks", "p_suggest_users_home_view", vwb.m200311Y("other_user_id", this.f105774a.f56011id));
            }
        }
        xdl0.m208344M(this.f105776c.mo36865Z(), false);
        xdl0.m208344M(this.f105776c.mo36909m0(), false);
        xdl0.m208344M(this.f105776c.mo36933t0(), false);
        if (NullChecker.m81303a(this.f105776c.m127250o())) {
            xdl0.m208344M(this.f105776c.m127250o(), false);
        }
        if (NullChecker.m81303a(this.f105776c.m127251w())) {
            xdl0.m208344M(this.f105776c.m127251w(), false);
        }
        xdl0.m208344M(this.f105776c.mo36915o0(), false);
        xdl0.m208344M(this.f105776c.mo36951z0(), true);
        this.f105776c.mo36894i0();
        return true;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: a */
    public void mo116768a() {
    }
}
