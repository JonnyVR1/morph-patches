package p009l;

import android.view.View;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.ui.vip.likers.LikersAct;
import com.p1.mobile.putong.data.User;
import l.bda0;
import l.eqh0;
import l.lsi0;
import l.o6j0;
import l.w0c0;
import v.VButton;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ada0 extends p3l {

    /* JADX INFO: renamed from: f */
    public VLinear f9411f;

    /* JADX INFO: renamed from: g */
    public VText f9412g;

    /* JADX INFO: renamed from: h */
    public VButton f9413h;

    /* JADX INFO: renamed from: i */
    public VText f9414i;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m11323F(View view) {
        o6j0.c("e_see_who_liked_me_banner", "p_suggest_user_profile_info_view", new o6j0.a[0]);
        if (CoreModule.c.o3() == null) {
            lsi0.n(R.string.p4);
        } else if (CoreModule.c.o3().likersLimit.remaining > 0) {
            m20098w().startActivity(LikersAct.X1(m20098w(), ""));
        } else {
            CoreModule.P().a().wr(m20098w(), "p_suggest_user_profile_info_view,e_see_who_liked_me_banner,click", Privilege.see_who_likes_me);
        }
    }

    @Override // p009l.p3l
    /* JADX INFO: renamed from: B */
    public void mo2124B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        long jLongValue = user.profile.receivedLikes.longValue();
        String str = jLongValue + "";
        if (CoreModule.c.E0.y3(user) && jLongValue > 99) {
            str = "99+";
        }
        this.f9412g.setText(i0g0.m16115N(App.e.getString(R.string.bl, str), App.e.getColor(w0c0.P1), eqh0.c(3)));
        this.f9413h.setText(R.string.kl);
        this.f9413h.setOnClickListener(new View.OnClickListener() { // from class: l.zca0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23560a.m11323F(view);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m11324E(View view) {
        bda0.a(this, view);
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: g */
    public void mo2127g(View view) {
        super.mo2127g(view);
        m11324E(view);
    }
}
