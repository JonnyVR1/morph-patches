package p153l;

import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.ProfileButton;
import com.p051p1.mobile.putong.data.OMSDialogPositon;

/* JADX INFO: loaded from: classes4.dex */
public class pu4 extends gp90 {
    public pu4(zq90 zq90Var) {
        super(zq90Var);
    }

    @Override // p153l.gp90
    /* JADX INFO: renamed from: a */
    public void mo106121a(ProfileButton profileButton) {
        super.mo106121a(profileButton);
        sfj0.m185598e("e_send_message", OMSDialogPositon.p_suggest_user_profile_info_view, pf60.m172085a("is_reply", 0), pf60.m172085a("is_match", 1), pf60.m172085a("owner_id", this.f105446a.f205576a.f56859id));
        this.f105446a.m220974a().startActivity(MessagesAct.m50126k2(this.f105446a.m220974a(), this.f105446a.f205576a.f56859id, true, false));
    }
}
