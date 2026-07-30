package p149l;

import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.ProfileButton;
import com.p046p1.mobile.putong.data.OMSDialogPositon;

/* JADX INFO: loaded from: classes4.dex */
public class qt4 extends ch90 {
    public qt4(vi90 vi90Var) {
        super(vi90Var);
    }

    @Override // p149l.ch90
    /* JADX INFO: renamed from: a */
    public void mo106857a(ProfileButton profileButton) {
        super.mo106857a(profileButton);
        o6j0.m162861e("e_send_message", OMSDialogPositon.p_suggest_user_profile_info_view, j760.m140076a("is_reply", 0), j760.m140076a("is_match", 1), j760.m140076a("owner_id", this.f80839a.f181561a.f56011id));
        this.f80839a.m198526a().startActivity(MessagesAct.m48943i2(this.f80839a.m198526a(), this.f80839a.f181561a.f56011id, true, false));
    }
}
