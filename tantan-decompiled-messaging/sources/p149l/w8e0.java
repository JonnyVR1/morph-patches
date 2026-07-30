package p149l;

import android.app.Activity;
import android.content.Context;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.newui.intlmeet.IntlMeetAct;
import com.p046p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class w8e0 {
    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX INFO: renamed from: a */
    public static Integer m202163a() {
        int i;
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (!n3b0.m157742q()) {
            return Integer.valueOf(x2c0.f189961Zq);
        }
        if (!NullChecker.m81303a(userM169527p9.settings)) {
            i = -1;
        } else if (TEnum.equals(userM169527p9.settings.getLookingFor(), "male")) {
            i = x2c0.f190206hh;
        } else if (TEnum.equals(userM169527p9.settings.getLookingFor(), "female")) {
            i = x2c0.f190174gh;
        } else {
            i = -1;
        }
        if (i == -1) {
            i = TEnum.equals(userM169527p9.gender, "female") ? x2c0.f190206hh : x2c0.f190174gh;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: b */
    public static Picture.ImageUri m202164b(CoreLikers.C4719a c4719a) {
        User user = (User) vwb.m200336l0(c4719a.f19272d);
        if (user == null) {
            return null;
        }
        return user.m60124fp().profileSmall();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m202165c() {
        return !vwb.m200296J(zl80.m219252g().m219258e(ProductCategory.get("svip")));
    }

    /* JADX INFO: renamed from: d */
    public static void m202166d(Context context, boolean z, BusinessEntranceStyle businessEntranceStyle) {
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        if (counterM31484o3 == null) {
            if (Network.isConnected(CoreModule.f17544b)) {
                lsi0.m151578h(R$string.f18843q4);
                return;
            } else {
                lsi0.m151584n(R$string.f18813p4);
                return;
            }
        }
        if (!CoreModule.f17545c.f19687u0.m30489x5()) {
            m202167e(false);
        } else if (z) {
            m202167e(true);
        }
        Activity activityM208326D = xdl0.m208326D(context);
        if (businessEntranceStyle == BusinessEntranceStyle.INTL_MEET) {
            activityM208326D.startActivity(IntlMeetAct.m39353Y1(activityM208326D, "", "see"));
            return;
        }
        if (n3b0.m157742q()) {
            CoreModule.f17545c.f19687u0.f19254k0.put(Long.valueOf(qib0.f154693H.guessedCurrentServerTime()));
            CoreModule.f17545c.f19687u0.m30425Y6();
        }
        if (counterM31484o3.likersLimit.remaining > 0) {
            activityM208326D.startActivity(LikersAct.m56543V1(activityM208326D, businessEntranceStyle));
        } else if (activityM208326D instanceof Act) {
            if (CoreModule.f17545c.f19672p0.m173357e3()) {
                CoreModule.m29935P().m94651a().mo33565pr((Act) activityM208326D, "p_messages_view,e_see_banner,click", Privilege.see_who_likes_me);
            } else {
                CoreModule.m29935P().m94651a().mo33534l1((Act) activityM208326D, "p_messages_view,e_see_banner,click");
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m202167e(boolean z) {
        Map<String, Object> mapM124738a = g83.m124738a();
        if (z) {
            mapM124738a.putAll(u4e.m191728c("red_dot", "red_dot_normal", "see_tab_checkbutton", "message_list_page", "guide"));
        }
        zvf0.m220397s("e_red_dot_message_see", OMSDialogPositon.p_messages_view, mapM124738a);
    }

    /* JADX INFO: renamed from: f */
    public static void m202168f() {
        zvf0.m220403y("e_red_dot_message_see", OMSDialogPositon.p_messages_view, g83.m124738a());
    }

    /* JADX INFO: renamed from: g */
    public static void m202169g(boolean z, int i) {
        if (z) {
            zvf0.m220371D("e_see_list_new_like", OMSDialogPositon.p_messages_view, j760.m140076a("new_likes_number", Integer.valueOf(i)));
        }
    }
}
