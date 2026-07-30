package p153l;

import android.app.Activity;
import android.content.Context;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.newui.intlmeet.IntlMeetAct;
import com.p051p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class bhe0 {
    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX INFO: renamed from: a */
    public static Integer m104328a() {
        int i;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (!rbb0.m180744q()) {
            return Integer.valueOf(dbc0.f86420Nr);
        }
        if (!NullChecker.m82486a(userM116600p9.settings)) {
            i = -1;
        } else if (TEnum.equals(userM116600p9.settings.getLookingFor(), "male")) {
            i = dbc0.f86666Vh;
        } else if (TEnum.equals(userM116600p9.settings.getLookingFor(), "female")) {
            i = dbc0.f86634Uh;
        } else {
            i = -1;
        }
        if (i == -1) {
            i = TEnum.equals(userM116600p9.gender, "female") ? dbc0.f86666Vh : dbc0.f86634Uh;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: b */
    public static Picture.ImageUri m104329b(CoreLikers.C4870a c4870a) {
        User user = (User) jyb.m147519l0(c4870a.f20014d);
        if (user == null) {
            return null;
        }
        return user.m61308fp().profileSmall();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m104330c() {
        return !jyb.m147479J(du80.m118106g().m118112e(ProductCategory.get("svip")));
    }

    /* JADX INFO: renamed from: d */
    public static void m104331d(Context context, boolean z, BusinessEntranceStyle businessEntranceStyle) {
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        if (counterM32487o3 == null) {
            if (Network.isConnected(CoreModule.f18263b)) {
                o1j0.m165634h(R$string.f19636s4);
                return;
            } else {
                o1j0.m165640n(R$string.f19605r4);
                return;
            }
        }
        if (!CoreModule.f18264c.f20429u0.m31378B5()) {
            m104332e(false);
        } else if (z) {
            m104332e(true);
        }
        Activity activityM105506D = bnl0.m105506D(context);
        if (businessEntranceStyle == BusinessEntranceStyle.INTL_MEET) {
            activityM105506D.startActivity(IntlMeetAct.m40356Z1(activityM105506D, "", "see"));
            return;
        }
        if (rbb0.m180744q()) {
            CoreModule.f18264c.f20429u0.f19996l0.put(Long.valueOf(uqb0.f180376H.guessedCurrentServerTime()));
            CoreModule.f18264c.f20429u0.m31435c7();
        }
        if (counterM32487o3.likersLimit.remaining > 0) {
            activityM105506D.startActivity(LikersAct.m57726X1(activityM105506D, businessEntranceStyle));
        } else if (activityM105506D instanceof Act) {
            if (CoreModule.f18264c.f20414p0.m219060e3()) {
                CoreModule.m30933P().m143405a().mo34568pr((Act) activityM105506D, "p_messages_view,e_see_banner,click", Privilege.see_who_likes_me);
            } else {
                CoreModule.m30933P().m143405a().mo34537l1((Act) activityM105506D, "p_messages_view,e_see_banner,click");
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m104332e(boolean z) {
        Map<String, Object> mapM200281a = v83.m200281a();
        if (z) {
            mapM200281a.putAll(i6e.m138811c("red_dot", "red_dot_normal", "see_tab_checkbutton", "message_list_page", "guide"));
        }
        i4g0.m138521s("e_red_dot_message_see", OMSDialogPositon.p_messages_view, mapM200281a);
    }

    /* JADX INFO: renamed from: f */
    public static void m104333f() {
        i4g0.m138527y("e_red_dot_message_see", OMSDialogPositon.p_messages_view, v83.m200281a());
    }

    /* JADX INFO: renamed from: g */
    public static void m104334g(boolean z, int i) {
        if (z) {
            i4g0.m138495D("e_see_list_new_like", OMSDialogPositon.p_messages_view, pf60.m172085a("new_likes_number", Integer.valueOf(i)));
        }
    }
}
