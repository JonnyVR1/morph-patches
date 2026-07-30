package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.ContainerLabelsType;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.PicksHelper;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class nm4 extends AbstractC17382h4 {
    public nm4(rql rqlVar, User user, CoreSuggested.UserInfo userInfo) {
        super(rqlVar, user, userInfo);
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: c */
    public boolean mo116206c() {
        return false;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: d */
    public String mo116207d() {
        return ContainerLabelsType.daily_picks;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: h */
    public boolean mo116209h() {
        if (this.f107715c.mo37954z0() == null || this.f107715c.mo37868Z() == null || this.f107715c.mo37912m0() == null || this.f107715c.mo37936t0() == null || this.f107715c.mo37918o0() == null || this.f107715c.mo37954z0() == null) {
            return false;
        }
        if (this.f107715c.mo182641g() && !bnl0.m105529O0(this.f107715c.mo37954z0())) {
            PicksHelper.INSTANCE.m57923b().m57921q();
            if (!CoreModule.f18264c.f20400k1.m121132p3(this.f107713a.f56859id)) {
                CoreModule.f18264c.f20400k1.m121131J3(this.f107713a.f56859id);
                i4g0.m138492A("e_card_daily_picks", "p_suggest_users_home_view", jyb.m147494Y("other_user_id", this.f107713a.f56859id));
            }
        }
        bnl0.m105524M(this.f107715c.mo37868Z(), false);
        bnl0.m105524M(this.f107715c.mo37912m0(), false);
        bnl0.m105524M(this.f107715c.mo37936t0(), false);
        if (NullChecker.m82486a(this.f107715c.m182643o())) {
            bnl0.m105524M(this.f107715c.m182643o(), false);
        }
        if (NullChecker.m82486a(this.f107715c.m182644w())) {
            bnl0.m105524M(this.f107715c.m182644w(), false);
        }
        bnl0.m105524M(this.f107715c.mo37918o0(), false);
        bnl0.m105524M(this.f107715c.mo37954z0(), true);
        this.f107715c.mo37897i0();
        return true;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: a */
    public void mo116205a() {
    }
}
