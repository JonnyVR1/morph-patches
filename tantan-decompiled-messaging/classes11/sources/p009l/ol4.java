package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.ui.vip.picks.PicksHelper;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.vwb;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ol4 extends AbstractC0925h4 {
    public ol4(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        super(golVar, user, userInfo);
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: c */
    public boolean mo13954c() {
        return false;
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: d */
    public String mo13955d() {
        return "daily_picks";
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: h */
    public boolean mo13957h() {
        if (this.f13856c.mo918z0() == null || this.f13856c.mo826Z() == null || this.f13856c.mo873m0() == null || this.f13856c.mo899t0() == null || this.f13856c.mo880o0() == null || this.f13856c.mo918z0() == null) {
            return false;
        }
        if (this.f13856c.mo13009g() && !xdl0.O0(this.f13856c.mo918z0())) {
            PicksHelper.Companion.b().q();
            if (!CoreModule.c.k1.p3(((DbObject) this.f13854a).id)) {
                CoreModule.c.k1.J3(((DbObject) this.f13854a).id);
                zvf0.A("e_card_daily_picks", "p_suggest_users_home_view", new j760[]{vwb.Y("other_user_id", ((DbObject) this.f13854a).id)});
            }
        }
        xdl0.M(this.f13856c.mo826Z(), false);
        xdl0.M(this.f13856c.mo873m0(), false);
        xdl0.M(this.f13856c.mo899t0(), false);
        if (NullChecker.a(this.f13856c.m15117o())) {
            xdl0.M(this.f13856c.m15117o(), false);
        }
        if (NullChecker.a(this.f13856c.m15118w())) {
            xdl0.M(this.f13856c.m15118w(), false);
        }
        xdl0.M(this.f13856c.mo880o0(), false);
        xdl0.M(this.f13856c.mo918z0(), true);
        this.f13856c.mo857i0();
        return true;
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: a */
    public void mo13953a() {
    }
}
