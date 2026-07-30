package p002l;

import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.co5;
import l.j760;
import l.vwb;
import l.xp5;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class t3e extends ch90 {
    public t3e(vi90 vi90Var) {
        super(vi90Var);
    }

    @Override // p002l.ch90
    /* JADX INFO: renamed from: a */
    public void mo11038a(ProfileButton profileButton) {
        super.mo11038a(profileButton);
        if (this.f8668a.m23957E()) {
            zvf0.r("e_push_profile_dislike", "p_push_profile");
        }
        if (NullChecker.a(this.f8668a.f21137a)) {
            Conversation conversationXe = CoreModule.c.f0.Xe(((DbObject) this.f8668a.f21137a).id);
            if (xp5.f(conversationXe) && !xp5.d(conversationXe)) {
                co5.i(this.f8668a.m23975W());
            }
        }
        zvf0.u("e_dislikeButton", this.f8668a.m23975W(), new j760[]{vwb.Y("moments_user_id", ((DbObject) this.f8668a.f21137a).id)});
        this.f8668a.f21145i.mo11883a(SwipeDirection.LEFT);
    }
}
