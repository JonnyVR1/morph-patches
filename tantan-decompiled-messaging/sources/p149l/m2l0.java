package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.ProfileButton;
import com.p046p1.mobile.putong.data.OMSDialogPositon;

/* JADX INFO: loaded from: classes4.dex */
public class m2l0 extends ch90 {
    public m2l0(vi90 vi90Var) {
        super(vi90Var);
    }

    @Override // p149l.ch90
    /* JADX INFO: renamed from: a */
    public void mo106857a(ProfileButton profileButton) {
        super.mo106857a(profileButton);
        if (qib0.f154713b0.f139232c != null) {
            zvf0.m220399u("e_live_video_quickchat_room_enter", OMSDialogPositon.p_suggest_user_profile_info_view, vwb.m200311Y("anchorId", this.f80839a.f181561a.f56011id), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"));
            this.f80839a.f181569i.mo111814d(true);
            qib0.f154713b0.f139232c.mo67289uq(this.f80839a.m198526a(), this.f80839a.f181561a.f56011id, "profile");
        }
    }

    @Override // p149l.ch90
    /* JADX INFO: renamed from: d */
    public void mo106860d() {
        super.mo106860d();
        zvf0.m220368A("e_live_video_quickchat_room_enter", OMSDialogPositon.p_suggest_user_profile_info_view, vwb.m200311Y("anchorId", this.f80839a.f181561a.f56011id), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"));
    }
}
