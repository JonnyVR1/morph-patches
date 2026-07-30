package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.ProfileButton;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;

/* JADX INFO: loaded from: classes4.dex */
public class uic0 extends ch90 {
    public uic0(vi90 vi90Var) {
        super(vi90Var);
    }

    @Override // p149l.ch90
    /* JADX INFO: renamed from: a */
    public void mo106857a(ProfileButton profileButton) {
        super.mo106857a(profileButton);
        zvf0.m220396r("e_getback_match", this.f80839a.m198522W());
        if (CoreModule.f17545c.f19555C0.m210102K3()) {
            CoreModule.f17545c.f19642f0.m32760Op(this.f80839a.f181561a.f56011id);
        } else {
            C8764c.m53476n1(this.f80839a.m198526a(), "p_unmatch,getback_match", Privilege.recover_unmatches);
        }
    }
}
