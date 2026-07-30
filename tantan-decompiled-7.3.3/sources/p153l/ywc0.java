package p153l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.profile.intlfriendpurpose.EditIntlFriendPurposeAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes11.dex */
public class ywc0 extends f6l {

    /* JADX INFO: renamed from: f */
    public VLinear f201810f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f201811g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f201812h;

    /* JADX INFO: renamed from: i */
    public VLinear f201813i;

    /* JADX INFO: renamed from: j */
    public VText_Medium f201814j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f201815k;

    /* JADX INFO: renamed from: l */
    public VImage f201816l;

    /* JADX INFO: renamed from: m */
    public VText_Medium f201817m;

    @Override // p153l.f6l
    /* JADX INFO: renamed from: B */
    public void mo39153B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        lhn.C18395a c18395aM154230a;
        List<String> list = user.profile.extensions.basic.intlFriendPurposeV2;
        if (!jyb.m147479J(list) && (c18395aM154230a = lhn.INSTANCE.m154230a(list.get(0))) != null) {
            this.f201816l.setImageResource(c18395aM154230a.getProfileIcon());
            this.f201817m.setText(c18395aM154230a.getName());
        }
        m124283w().duringCreated(CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.wwc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191261a.m217592G((User) obj);
            }
        }));
        bnl0.m105509E0(this.f201813i, new View.OnClickListener() { // from class: l.xwc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196489a.m217593H(view);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public final void m217591F(View view) {
        zwc0.m221861a(this, view);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m217592G(User user) {
        List<String> list = user.profile.extensions.basic.intlFriendPurposeV2;
        VLinear vLinear = this.f201813i;
        boolean z = true;
        if (!jyb.m147479J(list) && (list.size() != 1 || !TextUtils.isEmpty(list.get(0)))) {
            z = false;
        }
        bnl0.m105524M(vLinear, z);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m217593H(View view) {
        sfj0.m185596c("e_intl_add_mine_relation_goals_button", OMSDialogPositon.p_suggest_user_profile_info_view, new sfj0.C20032a[0]);
        m124283w().startActivity(EditIntlFriendPurposeAct.m52630e2(m124283w(), "", true));
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: g */
    public void mo39156g(View view) {
        super.mo39156g(view);
        m217591F(view);
    }
}
