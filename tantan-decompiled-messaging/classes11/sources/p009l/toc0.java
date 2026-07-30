package p009l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.core.ui.profile.intlfriendpurpose.EditIntlFriendPurposeAct;
import com.p1.mobile.putong.data.User;
import java.util.List;
import l.e30;
import l.mkd0;
import l.o6j0;
import l.uoc0;
import l.vwb;
import l.xdl0;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class toc0 extends p3l {

    /* JADX INFO: renamed from: f */
    public VLinear f20789f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f20790g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f20791h;

    /* JADX INFO: renamed from: i */
    public VLinear f20792i;

    /* JADX INFO: renamed from: j */
    public VText_Medium f20793j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f20794k;

    /* JADX INFO: renamed from: l */
    public VImage f20795l;

    /* JADX INFO: renamed from: m */
    public VText_Medium f20796m;

    @Override // p009l.p3l
    /* JADX INFO: renamed from: B */
    public void mo2124B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        lfn.C1015a c1015aM17877a;
        List list = user.profile.extensions.basic.intlFriendPurposeV2;
        if (!vwb.J(list) && (c1015aM17877a = lfn.INSTANCE.m17877a((String) list.get(0))) != null) {
            this.f20795l.setImageResource(c1015aM17877a.getProfileIcon());
            this.f20796m.setText(c1015aM17877a.getName());
        }
        m20098w().duringCreated(CoreModule.c.e0.o9().distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.roc0
            public final void call(Object obj) {
                this.f19928a.m22593G((User) obj);
            }
        }));
        xdl0.E0(this.f20792i, new View.OnClickListener() { // from class: l.soc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20400a.m22594H(view);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public final void m22592F(View view) {
        uoc0.a(this, view);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m22593G(User user) {
        List list = user.profile.extensions.basic.intlFriendPurposeV2;
        VLinear vLinear = this.f20792i;
        boolean z = true;
        if (!vwb.J(list) && (list.size() != 1 || !TextUtils.isEmpty((CharSequence) list.get(0)))) {
            z = false;
        }
        xdl0.M(vLinear, z);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m22594H(View view) {
        o6j0.c("e_intl_add_mine_relation_goals_button", "p_suggest_user_profile_info_view", new o6j0.a[0]);
        m20098w().startActivity(EditIntlFriendPurposeAct.d2(m20098w(), "", true));
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: g */
    public void mo2127g(View view) {
        super.mo2127g(view);
        m22592F(view);
    }
}
