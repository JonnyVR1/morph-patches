package p002l;

import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import com.p1.mobile.putong.core.ui.greet.d;
import com.tantanapp.common.data.DbObject;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class d45 extends ch90 {
    public d45(vi90 vi90Var) {
        super(vi90Var);
    }

    @Override // p002l.ch90
    /* JADX INFO: renamed from: a */
    public void mo11038a(ProfileButton profileButton) {
        super.mo11038a(profileButton);
        zvf0.r("e_user_info_greet_to_city_cover", this.f8668a.m23975W());
        d.e(this.f8668a.m23979a(), ((DbObject) this.f8668a.f21137a).id);
    }
}
