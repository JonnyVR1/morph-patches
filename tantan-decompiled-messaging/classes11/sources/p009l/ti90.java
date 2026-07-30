package p009l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragExpandedImpl;
import com.p1.mobile.putong.data.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.bo5;
import l.co5;
import l.d30;
import l.jo5;
import l.ui90;
import l.xdl0;
import v.VImage;
import v.VLinear;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ti90 extends p3l {

    /* JADX INFO: renamed from: f */
    public VLinear f20716f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f20717g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f20718h;

    /* JADX INFO: renamed from: i */
    public VImage f20719i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f20720j;

    @Override // p009l.p3l
    /* JADX INFO: renamed from: B */
    public void mo2124B(final CoreSuggested.UserInfo userInfo, final User user, int i, int i2, int i3) {
        if (userInfo != null && user != null) {
            String strA = co5.a("profile_content_compliment_bar");
            if (!TextUtils.isEmpty(strA)) {
                co5.f(m20096A(userInfo), strA);
            }
        }
        final boolean z = userInfo.renderFrom == CardInfoRenderFrom.PROFILE;
        final Function1 function1 = new Function1() { // from class: l.qi90
            public final Object invoke(Object obj) {
                return this.f19290a.m22539H(z, (User) obj);
            }
        };
        LinearLayout linearLayout = this.f20718h;
        if (linearLayout != null) {
            xdl0.E0(linearLayout, new View.OnClickListener() { // from class: l.ri90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f19848a.m22540I(userInfo, user, function1, view);
                }
            });
        }
        VLinear vLinear = this.f20716f;
        if (vLinear != null) {
            xdl0.E0(vLinear, new View.OnClickListener() { // from class: l.si90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20277a.m22541J(userInfo, user, function1, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m22538G(View view) {
        ui90.a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Unit m22539H(boolean z, User user) {
        bo5.i().invoke(user);
        if (z && (m20098w() instanceof ProfileAct)) {
            ProfileListFragExpandedImpl profileListFragExpandedImplC2 = m20098w().C2();
            if (profileListFragExpandedImplC2 instanceof ProfileListFragExpandedImpl) {
                profileListFragExpandedImplC2.V4().n1(SwipeDirection.REMOVE.getValue());
            } else {
                m20098w().finish();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m22540I(CoreSuggested.UserInfo userInfo, User user, Function1 function1, View view) {
        m22542K(userInfo, user, function1);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m22541J(CoreSuggested.UserInfo userInfo, User user, Function1 function1, View view) {
        m22542K(userInfo, user, function1);
    }

    /* JADX INFO: renamed from: K */
    public final void m22542K(CoreSuggested.UserInfo userInfo, User user, Function1<User, Unit> function1) {
        if (jo5.b(m20098w(), userInfo, user, "profile_content_compliment_bar")) {
            return;
        }
        bo5.n(m20098w(), user, "profile_content_compliment_bar", (Integer) null, (d30) null, function1, userInfo.liveRoomInfo);
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: g */
    public void mo2127g(View view) {
        super.mo2127g(view);
        m22538G(view);
    }
}
