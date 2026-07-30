package p002l;

import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import com.tantanapp.common.data.DbObject;
import l.j760;
import l.qib0;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class m2l0 extends ch90 {
    public m2l0(vi90 vi90Var) {
        super(vi90Var);
    }

    @Override // p002l.ch90
    /* JADX INFO: renamed from: a */
    public void mo11038a(ProfileButton profileButton) {
        super.mo11038a(profileButton);
        if (qib0.b0.c != null) {
            zvf0.u("e_live_video_quickchat_room_enter", "p_suggest_user_profile_info_view", new j760[]{vwb.Y("anchorId", ((DbObject) this.f8668a.f21137a).id), vwb.Y("index", "NA")});
            this.f8668a.f21145i.mo11886d(true);
            qib0.b0.c.uq(this.f8668a.m23979a(), ((DbObject) this.f8668a.f21137a).id, "profile");
        }
    }

    @Override // p002l.ch90
    /* JADX INFO: renamed from: d */
    public void mo11041d() {
        super.mo11041d();
        zvf0.A("e_live_video_quickchat_room_enter", "p_suggest_user_profile_info_view", new j760[]{vwb.Y("anchorId", ((DbObject) this.f8668a.f21137a).id), vwb.Y("index", "NA")});
    }
}
