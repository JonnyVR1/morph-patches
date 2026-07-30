package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.seepage.likers.FakeLikersAct;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class aa3 {

    /* JADX INFO: renamed from: a */
    public static float f68267a;

    /* JADX INFO: renamed from: b */
    public static int f68268b;

    /* JADX INFO: renamed from: a */
    public static float m95517a(int i, long j) {
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
    public static float m95518b() {
        return new Random().nextFloat() + 9.0f;
    }

    /* JADX INFO: renamed from: c */
    public static String m95519c(long j) {
        long j2 = j / Constants.ONE_MIN_IN_MILLIS;
        return String.format(Locale.getDefault(), "%02d:%02d", Long.valueOf(j2), Long.valueOf((j - TimeUnit.MINUTES.toMillis(j2)) / 1000));
    }

    /* JADX INFO: renamed from: d */
    public static float m95520d(int i, long j, boolean z) {
        if (z || f68268b % 4 == 0) {
            f68267a = m95517a(i, j);
            f68268b = 0;
        }
        f68268b++;
        return f68267a;
    }

    /* JADX INFO: renamed from: e */
    public static int m95521e(long j) {
        return (int) ((1.0d - ((j * 1.0d) / ((double) (CoreModule.f17545c.f19576J0.m139282v3() * 1000)))) * 100.0d);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m95522f() {
        if (TextUtils.isEmpty(j17.m139250u3()) || IntlCountryCodeController.m28115k()) {
            return false;
        }
        return CoreModule.m29935P().m94651a().mo33573qt();
    }

    /* JADX INFO: renamed from: g */
    public static String m95523g(Act act, boolean z) {
        if (z) {
            return "p_boost_end,boostagain";
        }
        if (CoreModule.m29935P().m94651a().mo33511he(act)) {
            return "p_suggest_users_home_view,e_boost_button,click";
        }
        if (act instanceof LikersAct) {
            return "p_navigation_see,boost";
        }
        if (CoreModule.m29935P().m94656g().mo35044Zn(act)) {
            return "p_wallet,e_wallet_boost_button,click";
        }
        boolean z2 = act instanceof FakeLikersAct;
        if (z2) {
            return "p_intl_plm,e_intl_plm_turbo_card,click";
        }
        if (z2) {
            return TextUtils.equals(((FakeLikersAct) act).m54957X1(), "p_popup_see,default") ? "p_popup_see,boost" : "p_navigation_see,boost";
        }
        return "";
    }
}
