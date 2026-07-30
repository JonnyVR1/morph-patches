package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.ProfileButton;
import com.p051p1.mobile.putong.data.OMSDialogPositon;

/* JADX INFO: loaded from: classes4.dex */
public class rbl0 extends gp90 {
    public rbl0(zq90 zq90Var) {
        super(zq90Var);
    }

    @Override // p153l.gp90
    /* JADX INFO: renamed from: a */
    public void mo106121a(ProfileButton profileButton) {
        super.mo106121a(profileButton);
        if (uqb0.f180396b0.f170326c != null) {
            i4g0.m138523u("e_live_video_quickchat_room_enter", OMSDialogPositon.p_suggest_user_profile_info_view, jyb.m147494Y("anchorId", this.f105446a.f205576a.f56859id), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"));
            this.f105446a.f205584i.mo113392d(true);
            uqb0.f180396b0.f170326c.mo68472uq(this.f105446a.m220974a(), this.f105446a.f205576a.f56859id, "profile");
        }
    }

    @Override // p153l.gp90
    /* JADX INFO: renamed from: d */
    public void mo111881d() {
        super.mo111881d();
        i4g0.m138492A("e_live_video_quickchat_room_enter", OMSDialogPositon.p_suggest_user_profile_info_view, jyb.m147494Y("anchorId", this.f105446a.f205576a.f56859id), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"));
    }
}
