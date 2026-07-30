package p153l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListFragExpandedImpl;
import com.p051p1.mobile.putong.data.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes11.dex */
public class xq90 extends f6l {

    /* JADX INFO: renamed from: f */
    public VLinear f195790f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f195791g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f195792h;

    /* JADX INFO: renamed from: i */
    public VImage f195793i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f195794j;

    @Override // p153l.f6l
    /* JADX INFO: renamed from: B */
    public void mo39153B(final CoreSuggested.UserInfo userInfo, final User user, int i, int i2, int i3) {
        if (userInfo != null && user != null) {
            String strM131227a = gp5.m131227a("profile_content_compliment_bar");
            if (!TextUtils.isEmpty(strM131227a)) {
                gp5.m131232f(m124281A(userInfo), strM131227a);
            }
        }
        final boolean z = userInfo.renderFrom == CardInfoRenderFrom.PROFILE;
        final Function1 function1 = new Function1() { // from class: l.uq90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f180357a.m212723H(z, (User) obj);
            }
        };
        LinearLayout linearLayout = this.f195792h;
        if (linearLayout != null) {
            bnl0.m105509E0(linearLayout, new View.OnClickListener() { // from class: l.vq90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f185339a.m212724I(userInfo, user, function1, view);
                }
            });
        }
        VLinear vLinear = this.f195790f;
        if (vLinear != null) {
            bnl0.m105509E0(vLinear, new View.OnClickListener() { // from class: l.wq90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f190387a.m212725J(userInfo, user, function1, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m212722G(View view) {
        yq90.m217074a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Unit m212723H(boolean z, User user) {
        fp5.m126527i().invoke(user);
        if (z && (m124283w() instanceof ProfileAct)) {
            PutongFrag putongFragM51931D2 = ((ProfileAct) m124283w()).m51931D2();
            if (putongFragM51931D2 instanceof ProfileListFragExpandedImpl) {
                ((ProfileListFragExpandedImpl) putongFragM51931D2).m53596V4().m129190n1(SwipeDirection.REMOVE.getValue());
            } else {
                m124283w().m68056e2();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m212724I(CoreSuggested.UserInfo userInfo, User user, Function1 function1, View view) {
        m212726K(userInfo, user, function1);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m212725J(CoreSuggested.UserInfo userInfo, User user, Function1 function1, View view) {
        m212726K(userInfo, user, function1);
    }

    /* JADX INFO: renamed from: K */
    public final void m212726K(CoreSuggested.UserInfo userInfo, User user, Function1<User, Unit> function1) {
        if (np5.m164215b(m124283w(), userInfo, user, "profile_content_compliment_bar")) {
            return;
        }
        fp5.m126532n(m124283w(), user, "profile_content_compliment_bar", null, null, function1, userInfo.liveRoomInfo);
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: g */
    public void mo39156g(View view) {
        super.mo39156g(view);
        m212722G(view);
    }
}
