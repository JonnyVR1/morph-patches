package p153l;

import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.match.C8618a;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.ProfileButton;
import com.p051p1.mobile.putong.data.OMSDialogPositon;

/* JADX INFO: loaded from: classes4.dex */
public class cq50 extends gp90 {
    public cq50(zq90 zq90Var) {
        super(zq90Var);
    }

    @Override // p153l.gp90
    /* JADX INFO: renamed from: a */
    public void mo106121a(ProfileButton profileButton) {
        super.mo106121a(profileButton);
        i4g0.m138520r("e_intl_instantmatch_btn", OMSDialogPositon.p_suggest_user_profile_info_view);
        C8618a.m48771w().m48793p(this.f105446a.m220974a(), this.f105446a.f205576a, "p_suggest_user_profile_info_view,e_intl_instantmatch_btn,click", new x20() { // from class: l.bq50
            @Override // p153l.x20
            public final void call() {
                this.f77856a.m111882f();
            }
        });
    }

    @Override // p153l.gp90
    /* JADX INFO: renamed from: d */
    public void mo111881d() {
        super.mo111881d();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m111882f() {
        if (d79.m114663V()) {
            if (this.f105446a.m220990r()) {
                this.f105446a.m220974a().setResult(SwipeDirection.REMOVE.getValue());
            }
            this.f105446a.m220974a().m68056e2();
        }
    }
}
