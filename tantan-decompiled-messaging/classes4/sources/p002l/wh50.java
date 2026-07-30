package p002l;

import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.match.a;
import l.d30;
import l.u59;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wh50 extends ch90 {
    public wh50(vi90 vi90Var) {
        super(vi90Var);
    }

    @Override // p002l.ch90
    /* JADX INFO: renamed from: a */
    public void mo11038a(ProfileButton profileButton) {
        super.mo11038a(profileButton);
        zvf0.r("e_intl_instantmatch_btn", "p_suggest_user_profile_info_view");
        a.w().p(this.f8668a.m23979a(), this.f8668a.f21137a, "p_suggest_user_profile_info_view,e_intl_instantmatch_btn,click", new d30() { // from class: l.vh50
            public final void call() {
                this.f21125a.m24613f();
            }
        });
    }

    @Override // p002l.ch90
    /* JADX INFO: renamed from: d */
    public void mo11041d() {
        super.mo11041d();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m24613f() {
        if (u59.U()) {
            if (this.f8668a.m23995r()) {
                this.f8668a.m23979a().setResult(SwipeDirection.REMOVE.getValue());
            }
            this.f8668a.m23979a().finish();
        }
    }
}
