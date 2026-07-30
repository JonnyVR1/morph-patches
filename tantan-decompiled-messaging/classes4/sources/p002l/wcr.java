package p002l;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.b1c;
import l.d30;
import l.g2y;
import l.j760;
import l.lsi0;
import l.opa0;
import l.vwb;
import l.xma;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wcr extends ch90 {
    public wcr(vi90 vi90Var) {
        super(vi90Var);
    }

    @Override // p002l.ch90
    /* JADX INFO: renamed from: a */
    public void mo11038a(ProfileButton profileButton) {
        super.mo11038a(profileButton);
        vi90 vi90Var = this.f8668a;
        if (vi90Var.f21147k) {
            lsi0.j(App.e.getString(R.string.p4));
            return;
        }
        if (vi90Var.m23957E()) {
            zvf0.r("e_push_profile_like", "p_push_profile");
        }
        if (NullChecker.a(this.f8668a.f21137a) && CoreModule.c.m1.k4(((DbObject) this.f8668a.f21137a).id) && g2y.e(this.f8668a.m23979a(), this.f8668a.f21138b)) {
            return;
        }
        if (!this.f8668a.m23956D() || m24509k(this.f8668a.f21140d)) {
            zvf0.u("e_likeButton", this.f8668a.m23975W(), new j760[]{vwb.Y("moments_user_id", ((DbObject) this.f8668a.f21137a).id)});
            boolean zM23961I = this.f8668a.m23961I();
            vi90 vi90Var2 = this.f8668a;
            if (zM23961I) {
                vi90Var2.f21145i.mo11883a(SwipeDirection.RIGHT);
            } else {
                vi90Var2.f21145i.mo11884b(SwipeDirection.RIGHT);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m24506h(DialogInterface dialogInterface) {
        this.f8668a.f21145i.mo11883a(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m24507i() {
        if (b1c.g()) {
            opa0 opa0Var = new opa0(this.f8668a.m23979a(), LiveMessage.LiveMessageType.OTHER);
            opa0Var.K(4, (d30) null);
            opa0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.vcr
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f21072a.m24506h(dialogInterface);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m24508j() {
        this.f8668a.f21145i.mo11883a(SwipeDirection.LEFT);
    }

    /* JADX INFO: renamed from: k */
    public boolean m24509k(String str) {
        if (xma.G3()) {
            return true;
        }
        if (!b1c.e()) {
            if (!b1c.g()) {
                return b1c.f();
            }
            new opa0(this.f8668a.m23979a(), LiveMessage.LiveMessageType.OTHER).K(4, (d30) null);
            return false;
        }
        opa0 opa0Var = new opa0(this.f8668a.m23979a(), TextUtils.equals(this.f8668a.f21138b, "p_picks_profile_card") ? "home_selected_users_card" : "selected_users_card");
        User userOa = CoreModule.c.e0.oa(str);
        if (NullChecker.a(userOa)) {
            opa0Var.J(userOa.isFemale() ? "female" : "male");
        }
        opa0Var.L(3, new d30() { // from class: l.tcr
            public final void call() {
                this.f20184a.m24507i();
            }
        }, new d30() { // from class: l.ucr
            public final void call() {
                this.f20587a.m24508j();
            }
        });
        return false;
    }
}
