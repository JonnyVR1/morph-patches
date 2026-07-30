package p003l;

import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.seepage.likers.FakeLikersAct;
import com.p1.mobile.putong.core.ui.vip.likers.LikersAct;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import l.j17;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public final class aa3 {

    /* JADX INFO: renamed from: a */
    public static float f2747a;

    /* JADX INFO: renamed from: b */
    public static int f2748b;

    /* JADX INFO: renamed from: a */
    public static float m5300a(int i, long j) {
        float fNextFloat;
        float f;
        if (i < 67) {
            fNextFloat = new Random().nextFloat();
            f = 8.0f;
        } else {
            fNextFloat = new Random().nextFloat();
            f = 9.0f;
        }
        return fNextFloat + f;
    }

    /* JADX INFO: renamed from: b */
    public static float m5301b() {
        return new Random().nextFloat() + 9.0f;
    }

    /* JADX INFO: renamed from: c */
    public static String m5302c(long j) {
        long j2 = j / 60000;
        return String.format(Locale.getDefault(), "%02d:%02d", Long.valueOf(j2), Long.valueOf((j - TimeUnit.MINUTES.toMillis(j2)) / 1000));
    }

    /* JADX INFO: renamed from: d */
    public static float m5303d(int i, long j, boolean z) {
        if (z || f2748b % 4 == 0) {
            f2747a = m5300a(i, j);
            f2748b = 0;
        }
        f2748b++;
        return f2747a;
    }

    /* JADX INFO: renamed from: e */
    public static int m5304e(long j) {
        return (int) ((1.0d - ((j * 1.0d) / ((double) (CoreModule.c.J0.v3() * 1000)))) * 100.0d);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m5305f() {
        if (TextUtils.isEmpty(j17.u3()) || IntlCountryCodeController.k()) {
            return false;
        }
        return CoreModule.P().a().qt();
    }

    /* JADX INFO: renamed from: g */
    public static String m5306g(Act act, boolean z) {
        if (z) {
            return "p_boost_end,boostagain";
        }
        if (CoreModule.P().a().he(act)) {
            return "p_suggest_users_home_view,e_boost_button,click";
        }
        if (act instanceof LikersAct) {
            return "p_navigation_see,boost";
        }
        if (CoreModule.P().g().Zn(act)) {
            return "p_wallet,e_wallet_boost_button,click";
        }
        boolean z2 = act instanceof FakeLikersAct;
        if (z2) {
            return "p_intl_plm,e_intl_plm_turbo_card,click";
        }
        if (z2) {
            return TextUtils.equals(((FakeLikersAct) act).X1(), "p_popup_see,default") ? "p_popup_see,boost" : "p_navigation_see,boost";
        }
        return "";
    }
}
