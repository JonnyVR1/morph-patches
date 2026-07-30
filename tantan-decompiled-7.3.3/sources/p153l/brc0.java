package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.ProfileButton;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;

/* JADX INFO: loaded from: classes4.dex */
public class brc0 extends gp90 {
    public brc0(zq90 zq90Var) {
        super(zq90Var);
    }

    @Override // p153l.gp90
    /* JADX INFO: renamed from: a */
    public void mo106121a(ProfileButton profileButton) {
        super.mo106121a(profileButton);
        i4g0.m138520r("e_getback_match", this.f105446a.m220970W());
        if (CoreModule.f18264c.f20297C0.m146415L3()) {
            CoreModule.f18264c.f20384f0.m33763Op(this.f105446a.f205576a.f56859id);
        } else {
            C8927c.m54659n1(this.f105446a.m220974a(), "p_unmatch,getback_match", Privilege.recover_unmatches);
        }
    }
}
