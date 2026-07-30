package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.ProfileButton;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class h5e extends gp90 {
    public h5e(zq90 zq90Var) {
        super(zq90Var);
    }

    @Override // p153l.gp90
    /* JADX INFO: renamed from: a */
    public void mo106121a(ProfileButton profileButton) {
        super.mo106121a(profileButton);
        if (this.f105446a.m220952E()) {
            i4g0.m138520r("e_push_profile_dislike", "p_push_profile");
        }
        if (NullChecker.m82486a(this.f105446a.f205576a)) {
            Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(this.f105446a.f205576a.f56859id);
            if (br5.m106035f(conversationM33859Xe) && !br5.m106033d(conversationM33859Xe)) {
                gp5.m131235i(this.f105446a.m220970W());
            }
        }
        i4g0.m138523u("e_dislikeButton", this.f105446a.m220970W(), jyb.m147494Y("moments_user_id", this.f105446a.f205576a.f56859id));
        this.f105446a.f205584i.mo113389a(SwipeDirection.LEFT);
    }
}
