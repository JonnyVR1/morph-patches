package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.ProfileButton;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class xer extends gp90 {
    public xer(zq90 zq90Var) {
        super(zq90Var);
    }

    @Override // p153l.gp90
    /* JADX INFO: renamed from: a */
    public void mo106121a(ProfileButton profileButton) {
        super.mo106121a(profileButton);
        zq90 zq90Var = this.f105446a;
        if (zq90Var.f205586k) {
            o1j0.m165636j(App.f16088e.getString(R$string.f19605r4));
            return;
        }
        if (zq90Var.m220952E()) {
            i4g0.m138520r("e_push_profile_like", "p_push_profile");
        }
        if (NullChecker.m82486a(this.f105446a.f205576a) && CoreModule.f18264c.f20406m1.m35720k4(this.f105446a.f205576a.f56859id) && dby.m115177e(this.f105446a.m220974a(), this.f105446a.f205577b)) {
            return;
        }
        if (!this.f105446a.m220951D() || m210732k(this.f105446a.f205579d)) {
            i4g0.m138523u(MatchScData.ModuleId.mid_e_likeButton, this.f105446a.m220970W(), jyb.m147494Y("moments_user_id", this.f105446a.f205576a.f56859id));
            boolean zM220956I = this.f105446a.m220956I();
            zq90 zq90Var2 = this.f105446a;
            if (zM220956I) {
                zq90Var2.f205584i.mo113389a(SwipeDirection.RIGHT);
            } else {
                zq90Var2.f205584i.mo113390b(SwipeDirection.RIGHT);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m210729h(DialogInterface dialogInterface) {
        this.f105446a.f205584i.mo113389a(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m210730i() {
        if (o2c.m165709g()) {
            sxa0 sxa0Var = new sxa0(this.f105446a.m220974a(), "other");
            sxa0Var.m188474K(4, null);
            sxa0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.wer
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f188720a.m210729h(dialogInterface);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m210731j() {
        this.f105446a.f205584i.mo113389a(SwipeDirection.LEFT);
    }

    /* JADX INFO: renamed from: k */
    public boolean m210732k(String str) {
        if (joa.m146358H3()) {
            return true;
        }
        if (!o2c.m165707e()) {
            if (!o2c.m165709g()) {
                return o2c.m165708f();
            }
            new sxa0(this.f105446a.m220974a(), "other").m188474K(4, null);
            return false;
        }
        sxa0 sxa0Var = new sxa0(this.f105446a.m220974a(), TextUtils.equals(this.f105446a.f205577b, "p_picks_profile_card") ? "home_selected_users_card" : "selected_users_card");
        User userM116597oa = CoreModule.f18264c.f20381e0.m116597oa(str);
        if (NullChecker.m82486a(userM116597oa)) {
            sxa0Var.m188473J(userM116597oa.isFemale() ? "female" : "male");
        }
        sxa0Var.m188475L(3, new x20() { // from class: l.uer
            @Override // p153l.x20
            public final void call() {
                this.f178687a.m210730i();
            }
        }, new x20() { // from class: l.ver
            @Override // p153l.x20
            public final void call() {
                this.f183841a.m210731j();
            }
        });
        return false;
    }
}
