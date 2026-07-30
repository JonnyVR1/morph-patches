package p149l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.profile.intlfriendpurpose.EditIntlFriendPurposeAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes11.dex */
public class toc0 extends p3l {

    /* JADX INFO: renamed from: f */
    public VLinear f171339f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f171340g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f171341h;

    /* JADX INFO: renamed from: i */
    public VLinear f171342i;

    /* JADX INFO: renamed from: j */
    public VText_Medium f171343j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f171344k;

    /* JADX INFO: renamed from: l */
    public VImage f171345l;

    /* JADX INFO: renamed from: m */
    public VText_Medium f171346m;

    @Override // p149l.p3l
    /* JADX INFO: renamed from: B */
    public void mo38150B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        lfn.C18216a c18216aM149726a;
        List<String> list = user.profile.extensions.basic.intlFriendPurposeV2;
        if (!vwb.m200296J(list) && (c18216aM149726a = lfn.INSTANCE.m149726a(list.get(0))) != null) {
            this.f171345l.setImageResource(c18216aM149726a.getProfileIcon());
            this.f171346m.setText(c18216aM149726a.getName());
        }
        m167252w().duringCreated(CoreModule.f17545c.f19639e0.m169523o9().distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.roc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160376a.m189869G((User) obj);
            }
        }));
        xdl0.m208329E0(this.f171342i, new View.OnClickListener() { // from class: l.soc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165671a.m189870H(view);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public final void m189868F(View view) {
        uoc0.m194548a(this, view);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m189869G(User user) {
        List<String> list = user.profile.extensions.basic.intlFriendPurposeV2;
        VLinear vLinear = this.f171342i;
        boolean z = true;
        if (!vwb.m200296J(list) && (list.size() != 1 || !TextUtils.isEmpty(list.get(0)))) {
            z = false;
        }
        xdl0.m208344M(vLinear, z);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m189870H(View view) {
        o6j0.m162859c("e_intl_add_mine_relation_goals_button", OMSDialogPositon.p_suggest_user_profile_info_view, new o6j0.C18854a[0]);
        m167252w().startActivity(EditIntlFriendPurposeAct.m51447d2(m167252w(), "", true));
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: g */
    public void mo38153g(View view) {
        super.mo38153g(view);
        m189868F(view);
    }
}
