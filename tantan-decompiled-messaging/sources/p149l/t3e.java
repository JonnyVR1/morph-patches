package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.ProfileButton;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class t3e extends ch90 {
    public t3e(vi90 vi90Var) {
        super(vi90Var);
    }

    @Override // p149l.ch90
    /* JADX INFO: renamed from: a */
    public void mo106857a(ProfileButton profileButton) {
        super.mo106857a(profileButton);
        if (this.f80839a.m198504E()) {
            zvf0.m220396r("e_push_profile_dislike", "p_push_profile");
        }
        if (NullChecker.m81303a(this.f80839a.f181561a)) {
            Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(this.f80839a.f181561a.f56011id);
            if (xp5.m210466f(conversationM32856Xe) && !xp5.m210464d(conversationM32856Xe)) {
                co5.m107937i(this.f80839a.m198522W());
            }
        }
        zvf0.m220399u("e_dislikeButton", this.f80839a.m198522W(), vwb.m200311Y("moments_user_id", this.f80839a.f181561a.f56011id));
        this.f80839a.f181569i.mo111811a(SwipeDirection.LEFT);
    }
}
