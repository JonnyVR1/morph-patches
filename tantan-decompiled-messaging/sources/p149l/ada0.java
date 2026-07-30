package p149l;

import android.view.View;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import p147v.VButton;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class ada0 extends p3l {

    /* JADX INFO: renamed from: f */
    public VLinear f68921f;

    /* JADX INFO: renamed from: g */
    public VText f68922g;

    /* JADX INFO: renamed from: h */
    public VButton f68923h;

    /* JADX INFO: renamed from: i */
    public VText f68924i;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m95863F(View view) {
        o6j0.m162859c("e_see_who_liked_me_banner", OMSDialogPositon.p_suggest_user_profile_info_view, new o6j0.C18854a[0]);
        if (CoreModule.f17545c.m31484o3() == null) {
            lsi0.m151584n(R$string.f18813p4);
        } else if (CoreModule.f17545c.m31484o3().likersLimit.remaining > 0) {
            m167252w().startActivity(LikersAct.m56544X1(m167252w(), ""));
        } else {
            CoreModule.m29935P().m94651a().mo33622wr(m167252w(), "p_suggest_user_profile_info_view,e_see_who_liked_me_banner,click", Privilege.see_who_likes_me);
        }
    }

    @Override // p149l.p3l
    /* JADX INFO: renamed from: B */
    public void mo38150B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        long jLongValue = user.profile.receivedLikes.longValue();
        String str = jLongValue + "";
        if (CoreModule.f17545c.f19561E0.m203802y3(user) && jLongValue > 99) {
            str = "99+";
        }
        this.f68922g.setText(i0g0.m133847N(App.f15369e.getString(R$string.f18399bl, str), App.f15369e.getColor(w0c0.f183796P1), eqh0.m117752c(3)));
        this.f68923h.setText(R$string.f18675kl);
        this.f68923h.setOnClickListener(new View.OnClickListener() { // from class: l.zca0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202523a.m95863F(view);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m95864E(View view) {
        bda0.m101142a(this, view);
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: g */
    public void mo38153g(View view) {
        super.mo38153g(view);
        m95864E(view);
    }
}
