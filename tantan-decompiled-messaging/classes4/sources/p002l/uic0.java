package p002l;

import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0189c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.tantanapp.common.data.DbObject;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class uic0 extends ch90 {
    public uic0(vi90 vi90Var) {
        super(vi90Var);
    }

    @Override // p002l.ch90
    /* JADX INFO: renamed from: a */
    public void mo11038a(ProfileButton profileButton) {
        super.mo11038a(profileButton);
        zvf0.r("e_getback_match", this.f8668a.m23975W());
        if (CoreModule.c.C0.K3()) {
            CoreModule.c.f0.Op(((DbObject) this.f8668a.f21137a).id);
        } else {
            C0189c.m4042n1(this.f8668a.m23979a(), "p_unmatch,getback_match", Privilege.recover_unmatches);
        }
    }
}
