package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.ProfileButton;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.data.MatchScData;

/* JADX INFO: loaded from: classes4.dex */
public class gwg0 extends ch90 {
    public gwg0(vi90 vi90Var) {
        super(vi90Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m128409h(DialogInterface dialogInterface) {
        this.f80839a.f181569i.mo111811a(SwipeDirection.RIGHT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m128410i() {
        if (b1c.m99818g()) {
            opa0 opa0Var = new opa0(this.f80839a.m198526a(), "other");
            opa0Var.m165327K(4, null);
            opa0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fwg0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f99654a.m128409h(dialogInterface);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m128411j() {
        this.f80839a.f181569i.mo111811a(SwipeDirection.LEFT);
    }

    @Override // p149l.ch90
    /* JADX INFO: renamed from: a */
    public void mo106857a(ProfileButton profileButton) {
        super.mo106857a(profileButton);
        if (this.f80839a.m198504E()) {
            zvf0.m220396r("e_push_profile_superlike", "p_push_profile");
        }
        if (CoreModule.f17545c.f19664m1.m34717k4(this.f80839a.f181561a.f56011id) && g2y.m124195e(this.f80839a.m198526a(), this.f80839a.f181562b)) {
            return;
        }
        if (!this.f80839a.m198503D() || m128412k(this.f80839a.f181564d)) {
            m128413l();
            boolean zM198508I = this.f80839a.m198508I();
            vi90 vi90Var = this.f80839a;
            if (zM198508I) {
                vi90Var.f181569i.mo111811a(SwipeDirection.UP);
            } else {
                vi90Var.f181569i.mo111812b(SwipeDirection.UP);
            }
        }
    }

    @Override // p149l.ch90
    /* JADX INFO: renamed from: b */
    public void mo106858b(ProfileButton profileButton) {
        super.mo106858b(profileButton);
        if (ogl0.m164247Z() && this.f80839a.m198539o()) {
            this.f80839a.f181569i.mo111813c(false);
        }
    }

    @Override // p149l.ch90
    /* JADX INFO: renamed from: c */
    public void mo106859c(ProfileButton profileButton) {
        super.mo106859c(profileButton);
        this.f80839a.f181569i.mo111813c(true);
    }

    /* JADX INFO: renamed from: k */
    public boolean m128412k(String str) {
        if (xma.m210044G3()) {
            return true;
        }
        if (b1c.m99816e()) {
            new opa0(this.f80839a.m198526a(), TextUtils.equals(this.f80839a.f181562b, "p_picks_profile_card") ? "home_selected_users_card" : "selected_users_card").m165328L(3, new d30() { // from class: l.dwg0
                @Override // p149l.d30
                public final void call() {
                    this.f88178a.m128410i();
                }
            }, new d30() { // from class: l.ewg0
                @Override // p149l.d30
                public final void call() {
                    this.f93497a.m128411j();
                }
            });
            return false;
        }
        if (!b1c.m99818g()) {
            return b1c.m99817f();
        }
        new opa0(this.f80839a.m198526a(), "other").m165327K(4, null);
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final void m128413l() {
        String str;
        boolean z = !n3b0.m157745t();
        String str2 = this.f80839a.f181562b;
        str2.getClass();
        switch (str2) {
            case "home_moment_theme_card":
            case "home_card":
                str = "profile";
                break;
            case "photo_album_feed_from_nearby_falls_feed":
                str = "nearby";
                break;
            case "from_meet_picks_card":
            case "from_meet_picks_feed":
            case "from_new_meet_picks_feed":
            case "from_meet_profile":
            case "from_meet_feed":
                str = "meet";
                break;
            case "liked_users":
                z = !xma.m210071e4();
                str = "ilike";
                break;
            case "photo_album_feed_from_like":
                str = "like";
                break;
            case "photo_album_feed_from_emotion":
                str = Emotion.TYPE;
                break;
            default:
                str = "other";
                break;
        }
        o6j0.m162859c(MatchScData.ModuleId.mid_e_superlikeButton, this.f80839a.m198522W(), o6j0.C18854a.m162878h("moments_user_id", this.f80839a.f181561a.f56011id), o6j0.C18854a.m162879i("is_privileged", z), o6j0.C18854a.m162878h("showfrom_superlike", str));
    }
}
