package p149l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListFragExpandedImpl;
import com.p046p1.mobile.putong.data.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes11.dex */
public class ti90 extends p3l {

    /* JADX INFO: renamed from: f */
    public VLinear f170540f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f170541g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f170542h;

    /* JADX INFO: renamed from: i */
    public VImage f170543i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f170544j;

    @Override // p149l.p3l
    /* JADX INFO: renamed from: B */
    public void mo38150B(final CoreSuggested.UserInfo userInfo, final User user, int i, int i2, int i3) {
        if (userInfo != null && user != null) {
            String strM107929a = co5.m107929a("profile_content_compliment_bar");
            if (!TextUtils.isEmpty(strM107929a)) {
                co5.m107934f(m167250A(userInfo), strM107929a);
            }
        }
        final boolean z = userInfo.renderFrom == CardInfoRenderFrom.PROFILE;
        final Function1 function1 = new Function1() { // from class: l.qi90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f154674a.m189164H(z, (User) obj);
            }
        };
        LinearLayout linearLayout = this.f170542h;
        if (linearLayout != null) {
            xdl0.m208329E0(linearLayout, new View.OnClickListener() { // from class: l.ri90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f159524a.m189165I(userInfo, user, function1, view);
                }
            });
        }
        VLinear vLinear = this.f170540f;
        if (vLinear != null) {
            xdl0.m208329E0(vLinear, new View.OnClickListener() { // from class: l.si90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f164693a.m189166J(userInfo, user, function1, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m189163G(View view) {
        ui90.m193867a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Unit m189164H(boolean z, User user) {
        bo5.m102898i().invoke(user);
        if (z && (m167252w() instanceof ProfileAct)) {
            PutongFrag putongFragM50748C2 = ((ProfileAct) m167252w()).m50748C2();
            if (putongFragM50748C2 instanceof ProfileListFragExpandedImpl) {
                ((ProfileListFragExpandedImpl) putongFragM50748C2).m52413V4().m109227n1(SwipeDirection.REMOVE.getValue());
            } else {
                m167252w().m66873d2();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m189165I(CoreSuggested.UserInfo userInfo, User user, Function1 function1, View view) {
        m189167K(userInfo, user, function1);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m189166J(CoreSuggested.UserInfo userInfo, User user, Function1 function1, View view) {
        m189167K(userInfo, user, function1);
    }

    /* JADX INFO: renamed from: K */
    public final void m189167K(CoreSuggested.UserInfo userInfo, User user, Function1<User, Unit> function1) {
        if (jo5.m142416b(m167252w(), userInfo, user, "profile_content_compliment_bar")) {
            return;
        }
        bo5.m102903n(m167252w(), user, "profile_content_compliment_bar", null, null, function1, userInfo.liveRoomInfo);
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: g */
    public void mo38153g(View view) {
        super.mo38153g(view);
        m189163G(view);
    }
}
