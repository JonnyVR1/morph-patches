package p009l;

import android.content.Context;
import com.p000p1.mobile.putong.core.newui.intlmeet.IntlMeetAct;
import com.p000p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.ui.vip.likers.LikersAct;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import l.g83;
import l.j760;
import l.lsi0;
import l.n3b0;
import l.qib0;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zl80;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class w8e0 {
    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX INFO: renamed from: a */
    public static Integer m24004a() {
        int i;
        User userP9 = CoreModule.c.e0.p9();
        if (!n3b0.q()) {
            return Integer.valueOf(x2c0.Zq);
        }
        if (!NullChecker.a(userP9.settings)) {
            i = -1;
        } else if (TEnum.equals(userP9.settings.getLookingFor(), "male")) {
            i = x2c0.hh;
        } else if (TEnum.equals(userP9.settings.getLookingFor(), "female")) {
            i = x2c0.gh;
        } else {
            i = -1;
        }
        if (i == -1) {
            i = TEnum.equals(userP9.gender, "female") ? x2c0.hh : x2c0.gh;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: b */
    public static Picture.ImageUri m24005b(CoreLikers.a aVar) {
        User user = (User) vwb.l0(aVar.d);
        if (user == null) {
            return null;
        }
        return user.fp().profileSmall();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m24006c() {
        return !vwb.J(zl80.g().e(ProductCategory.get("svip")));
    }

    /* JADX INFO: renamed from: d */
    public static void m24007d(Context context, boolean z, BusinessEntranceStyle businessEntranceStyle) {
        Counter counterO3 = CoreModule.c.o3();
        if (counterO3 == null) {
            if (Network.isConnected(CoreModule.b)) {
                lsi0.h(R.string.q4);
                return;
            } else {
                lsi0.n(R.string.p4);
                return;
            }
        }
        if (!CoreModule.c.u0.x5()) {
            m24008e(false);
        } else if (z) {
            m24008e(true);
        }
        Act actD = xdl0.D(context);
        if (businessEntranceStyle == BusinessEntranceStyle.INTL_MEET) {
            actD.startActivity(IntlMeetAct.m3385Y1(actD, "", "see"));
            return;
        }
        if (n3b0.q()) {
            CoreModule.c.u0.k0.put(Long.valueOf(qib0.H.guessedCurrentServerTime()));
            CoreModule.c.u0.Y6();
        }
        if (counterO3.likersLimit.remaining > 0) {
            actD.startActivity(LikersAct.V1(actD, businessEntranceStyle));
        } else if (actD instanceof Act) {
            if (CoreModule.c.p0.e3()) {
                CoreModule.P().a().pr(actD, "p_messages_view,e_see_banner,click", Privilege.see_who_likes_me);
            } else {
                CoreModule.P().a().l1(actD, "p_messages_view,e_see_banner,click");
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m24008e(boolean z) {
        Map mapA = g83.a();
        if (z) {
            mapA.putAll(u4e.m22746c("red_dot", "red_dot_normal", "see_tab_checkbutton", "message_list_page", "guide"));
        }
        zvf0.s("e_red_dot_message_see", "p_messages_view", mapA);
    }

    /* JADX INFO: renamed from: f */
    public static void m24009f() {
        zvf0.y("e_red_dot_message_see", "p_messages_view", g83.a());
    }

    /* JADX INFO: renamed from: g */
    public static void m24010g(boolean z, int i) {
        if (z) {
            zvf0.D("e_see_list_new_like", "p_messages_view", new j760[]{j760.a("new_likes_number", Integer.valueOf(i))});
        }
    }
}
