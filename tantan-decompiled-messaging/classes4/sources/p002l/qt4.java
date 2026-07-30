package p002l;

import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.tantanapp.common.data.DbObject;
import l.j760;
import l.o6j0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qt4 extends ch90 {
    public qt4(vi90 vi90Var) {
        super(vi90Var);
    }

    @Override // p002l.ch90
    /* JADX INFO: renamed from: a */
    public void mo11038a(ProfileButton profileButton) {
        super.mo11038a(profileButton);
        o6j0.e("e_send_message", "p_suggest_user_profile_info_view", new j760[]{j760.a("is_reply", 0), j760.a("is_match", 1), j760.a("owner_id", ((DbObject) this.f8668a.f21137a).id)});
        this.f8668a.m23979a().startActivity(MessagesAct.i2(this.f8668a.m23979a(), ((DbObject) this.f8668a.f21137a).id, true, false));
    }
}
