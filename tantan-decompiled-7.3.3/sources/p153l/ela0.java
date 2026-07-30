package p153l;

import android.view.View;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import p151v.VButton;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class ela0 extends f6l {

    /* JADX INFO: renamed from: f */
    public VLinear f94502f;

    /* JADX INFO: renamed from: g */
    public VText f94503g;

    /* JADX INFO: renamed from: h */
    public VButton f94504h;

    /* JADX INFO: renamed from: i */
    public VText f94505i;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m121143F(View view) {
        sfj0.m185596c("e_see_who_liked_me_banner", OMSDialogPositon.p_suggest_user_profile_info_view, new sfj0.C20032a[0]);
        if (CoreModule.f18264c.m32487o3() == null) {
            o1j0.m165640n(R$string.f19605r4);
        } else if (CoreModule.f18264c.m32487o3().likersLimit.remaining > 0) {
            m124283w().startActivity(LikersAct.m57727Y1(m124283w(), ""));
        } else {
            CoreModule.m30933P().m143405a().mo34625wr(m124283w(), "p_suggest_user_profile_info_view,e_see_who_liked_me_banner,click", Privilege.see_who_likes_me);
        }
    }

    @Override // p153l.f6l
    /* JADX INFO: renamed from: B */
    public void mo39153B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        long jLongValue = user.profile.receivedLikes.longValue();
        String str = jLongValue + "";
        if (CoreModule.f18264c.f20303E0.m141090y3(user) && jLongValue > 99) {
            str = "99+";
        }
        this.f94503g.setText(q8g0.m175782N(App.f16088e.getString(R$string.f19808xl, str), App.f16088e.getColor(c9c0.f80368Q1), lyh0.m156283c(3)));
        this.f94504h.setText(R$string.f18493Gl);
        this.f94504h.setOnClickListener(new View.OnClickListener() { // from class: l.dla0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89521a.m121143F(view);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m121144E(View view) {
        fla0.m126121a(this, view);
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: g */
    public void mo39156g(View view) {
        super.mo39156g(view);
        m121144E(view);
    }
}
