package p002l;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.data.DbObject;
import l.b1c;
import l.d30;
import l.g2y;
import l.o6j0;
import l.ogl0;
import l.opa0;
import l.xma;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gwg0 extends ch90 {
    public gwg0(vi90 vi90Var) {
        super(vi90Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m14054h(DialogInterface dialogInterface) {
        this.f8668a.f21145i.mo11883a(SwipeDirection.RIGHT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m14055i() {
        if (b1c.g()) {
            opa0 opa0Var = new opa0(this.f8668a.m23979a(), LiveMessage.LiveMessageType.OTHER);
            opa0Var.K(4, (d30) null);
            opa0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fwg0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f10661a.m14054h(dialogInterface);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m14056j() {
        this.f8668a.f21145i.mo11883a(SwipeDirection.LEFT);
    }

    @Override // p002l.ch90
    /* JADX INFO: renamed from: a */
    public void mo11038a(ProfileButton profileButton) {
        super.mo11038a(profileButton);
        if (this.f8668a.m23957E()) {
            zvf0.r("e_push_profile_superlike", "p_push_profile");
        }
        if (CoreModule.c.m1.k4(((DbObject) this.f8668a.f21137a).id) && g2y.e(this.f8668a.m23979a(), this.f8668a.f21138b)) {
            return;
        }
        if (!this.f8668a.m23956D() || m14057k(this.f8668a.f21140d)) {
            m14058l();
            boolean zM23961I = this.f8668a.m23961I();
            vi90 vi90Var = this.f8668a;
            if (zM23961I) {
                vi90Var.f21145i.mo11883a(SwipeDirection.UP);
            } else {
                vi90Var.f21145i.mo11884b(SwipeDirection.UP);
            }
        }
    }

    @Override // p002l.ch90
    /* JADX INFO: renamed from: b */
    public void mo11039b(ProfileButton profileButton) {
        super.mo11039b(profileButton);
        if (ogl0.Z() && this.f8668a.m23992o()) {
            this.f8668a.f21145i.mo11885c(false);
        }
    }

    @Override // p002l.ch90
    /* JADX INFO: renamed from: c */
    public void mo11040c(ProfileButton profileButton) {
        super.mo11040c(profileButton);
        this.f8668a.f21145i.mo11885c(true);
    }

    /* JADX INFO: renamed from: k */
    public boolean m14057k(String str) {
        if (xma.G3()) {
            return true;
        }
        if (b1c.e()) {
            new opa0(this.f8668a.m23979a(), TextUtils.equals(this.f8668a.f21138b, "p_picks_profile_card") ? "home_selected_users_card" : "selected_users_card").L(3, new d30() { // from class: l.dwg0
                public final void call() {
                    this.f9461a.m14055i();
                }
            }, new d30() { // from class: l.ewg0
                public final void call() {
                    this.f10020a.m14056j();
                }
            });
            return false;
        }
        if (!b1c.g()) {
            return b1c.f();
        }
        new opa0(this.f8668a.m23979a(), LiveMessage.LiveMessageType.OTHER).K(4, (d30) null);
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final void m14058l() {
        String str;
        boolean z = !n3b0.m18489t();
        String str2 = this.f8668a.f21138b;
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
                z = !xma.e4();
                str = "ilike";
                break;
            case "photo_album_feed_from_like":
                str = "like";
                break;
            case "photo_album_feed_from_emotion":
                str = "emotion";
                break;
            default:
                str = LiveMessage.LiveMessageType.OTHER;
                break;
        }
        o6j0.c("e_superlikeButton", this.f8668a.m23975W(), new o6j0.a[]{o6j0.a.h("moments_user_id", ((DbObject) this.f8668a.f21137a).id), o6j0.a.i("is_privileged", z), o6j0.a.h("showfrom_superlike", str)});
    }
}
