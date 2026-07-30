package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.ProfileButton;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class wcr extends ch90 {
    public wcr(vi90 vi90Var) {
        super(vi90Var);
    }

    @Override // p149l.ch90
    /* JADX INFO: renamed from: a */
    public void mo106857a(ProfileButton profileButton) {
        super.mo106857a(profileButton);
        vi90 vi90Var = this.f80839a;
        if (vi90Var.f181571k) {
            lsi0.m151580j(App.f15369e.getString(R$string.f18813p4));
            return;
        }
        if (vi90Var.m198504E()) {
            zvf0.m220396r("e_push_profile_like", "p_push_profile");
        }
        if (NullChecker.m81303a(this.f80839a.f181561a) && CoreModule.f17545c.f19664m1.m34717k4(this.f80839a.f181561a.f56011id) && g2y.m124195e(this.f80839a.m198526a(), this.f80839a.f181562b)) {
            return;
        }
        if (!this.f80839a.m198503D() || m202676k(this.f80839a.f181564d)) {
            zvf0.m220399u(MatchScData.ModuleId.mid_e_likeButton, this.f80839a.m198522W(), vwb.m200311Y("moments_user_id", this.f80839a.f181561a.f56011id));
            boolean zM198508I = this.f80839a.m198508I();
            vi90 vi90Var2 = this.f80839a;
            if (zM198508I) {
                vi90Var2.f181569i.mo111811a(SwipeDirection.RIGHT);
            } else {
                vi90Var2.f181569i.mo111812b(SwipeDirection.RIGHT);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m202673h(DialogInterface dialogInterface) {
        this.f80839a.f181569i.mo111811a(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m202674i() {
        if (b1c.m99818g()) {
            opa0 opa0Var = new opa0(this.f80839a.m198526a(), "other");
            opa0Var.m165327K(4, null);
            opa0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.vcr
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f180979a.m202673h(dialogInterface);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m202675j() {
        this.f80839a.f181569i.mo111811a(SwipeDirection.LEFT);
    }

    /* JADX INFO: renamed from: k */
    public boolean m202676k(String str) {
        if (xma.m210044G3()) {
            return true;
        }
        if (!b1c.m99816e()) {
            if (!b1c.m99818g()) {
                return b1c.m99817f();
            }
            new opa0(this.f80839a.m198526a(), "other").m165327K(4, null);
            return false;
        }
        opa0 opa0Var = new opa0(this.f80839a.m198526a(), TextUtils.equals(this.f80839a.f181562b, "p_picks_profile_card") ? "home_selected_users_card" : "selected_users_card");
        User userM169524oa = CoreModule.f17545c.f19639e0.m169524oa(str);
        if (NullChecker.m81303a(userM169524oa)) {
            opa0Var.m165326J(userM169524oa.isFemale() ? "female" : "male");
        }
        opa0Var.m165328L(3, new d30() { // from class: l.tcr
            @Override // p149l.d30
            public final void call() {
                this.f169471a.m202674i();
            }
        }, new d30() { // from class: l.ucr
            @Override // p149l.d30
            public final void call() {
                this.f175851a.m202675j();
            }
        });
        return false;
    }
}
