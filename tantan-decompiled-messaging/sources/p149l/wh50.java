package p149l;

import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.match.C8455a;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.ProfileButton;
import com.p046p1.mobile.putong.data.OMSDialogPositon;

/* JADX INFO: loaded from: classes4.dex */
public class wh50 extends ch90 {
    public wh50(vi90 vi90Var) {
        super(vi90Var);
    }

    @Override // p149l.ch90
    /* JADX INFO: renamed from: a */
    public void mo106857a(ProfileButton profileButton) {
        super.mo106857a(profileButton);
        zvf0.m220396r("e_intl_instantmatch_btn", OMSDialogPositon.p_suggest_user_profile_info_view);
        C8455a.m47588w().m47610p(this.f80839a.m198526a(), this.f80839a.f181561a, "p_suggest_user_profile_info_view,e_intl_instantmatch_btn,click", new d30() { // from class: l.vh50
            @Override // p149l.d30
            public final void call() {
                this.f181471a.m203111f();
            }
        });
    }

    @Override // p149l.ch90
    /* JADX INFO: renamed from: d */
    public void mo106860d() {
        super.mo106860d();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m203111f() {
        if (u59.m191812U()) {
            if (this.f80839a.m198542r()) {
                this.f80839a.m198526a().setResult(SwipeDirection.REMOVE.getValue());
            }
            this.f80839a.m198526a().m66873d2();
        }
    }
}
