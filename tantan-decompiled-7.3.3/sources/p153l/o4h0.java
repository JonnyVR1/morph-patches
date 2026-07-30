package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.ProfileButton;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.data.MatchScData;

/* JADX INFO: loaded from: classes4.dex */
public class o4h0 extends gp90 {
    public o4h0(zq90 zq90Var) {
        super(zq90Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m166019h(DialogInterface dialogInterface) {
        this.f105446a.f205584i.mo113389a(SwipeDirection.RIGHT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m166020i() {
        if (o2c.m165709g()) {
            sxa0 sxa0Var = new sxa0(this.f105446a.m220974a(), "other");
            sxa0Var.m188474K(4, null);
            sxa0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.n4h0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f140231a.m166019h(dialogInterface);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m166021j() {
        this.f105446a.f205584i.mo113389a(SwipeDirection.LEFT);
    }

    @Override // p153l.gp90
    /* JADX INFO: renamed from: a */
    public void mo106121a(ProfileButton profileButton) {
        super.mo106121a(profileButton);
        if (this.f105446a.m220952E()) {
            i4g0.m138520r("e_push_profile_superlike", "p_push_profile");
        }
        if (CoreModule.f18264c.f20406m1.m35720k4(this.f105446a.f205576a.f56859id) && dby.m115177e(this.f105446a.m220974a(), this.f105446a.f205577b)) {
            return;
        }
        if (!this.f105446a.m220951D() || m166022k(this.f105446a.f205579d)) {
            m166023l();
            boolean zM220956I = this.f105446a.m220956I();
            zq90 zq90Var = this.f105446a;
            if (zM220956I) {
                zq90Var.f205584i.mo113389a(SwipeDirection.UP);
            } else {
                zq90Var.f205584i.mo113390b(SwipeDirection.UP);
            }
        }
    }

    @Override // p153l.gp90
    /* JADX INFO: renamed from: b */
    public void mo131239b(ProfileButton profileButton) {
        super.mo131239b(profileButton);
        if (spl0.m187374Z() && this.f105446a.m220987o()) {
            this.f105446a.f205584i.mo113391c(false);
        }
    }

    @Override // p153l.gp90
    /* JADX INFO: renamed from: c */
    public void mo131240c(ProfileButton profileButton) {
        super.mo131240c(profileButton);
        this.f105446a.f205584i.mo113391c(true);
    }

    /* JADX INFO: renamed from: k */
    public boolean m166022k(String str) {
        if (joa.m146358H3()) {
            return true;
        }
        if (o2c.m165707e()) {
            new sxa0(this.f105446a.m220974a(), TextUtils.equals(this.f105446a.f205577b, "p_picks_profile_card") ? "home_selected_users_card" : "selected_users_card").m188475L(3, new x20() { // from class: l.l4h0
                @Override // p153l.x20
                public final void call() {
                    this.f129983a.m166020i();
                }
            }, new x20() { // from class: l.m4h0
                @Override // p153l.x20
                public final void call() {
                    this.f134802a.m166021j();
                }
            });
            return false;
        }
        if (!o2c.m165709g()) {
            return o2c.m165708f();
        }
        new sxa0(this.f105446a.m220974a(), "other").m188474K(4, null);
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final void m166023l() {
        String str;
        boolean z = !rbb0.m180747t();
        String str2 = this.f105446a.f205577b;
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
                z = !joa.m146386f4();
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
        sfj0.m185596c(MatchScData.ModuleId.mid_e_superlikeButton, this.f105446a.m220970W(), sfj0.C20032a.m185615h("moments_user_id", this.f105446a.f205576a.f56859id), sfj0.C20032a.m185616i("is_privileged", z), sfj0.C20032a.m185615h("showfrom_superlike", str));
    }
}
