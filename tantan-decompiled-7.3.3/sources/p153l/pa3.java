package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.FakeLikersAct;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class pa3 {

    /* JADX INFO: renamed from: a */
    public static float f151239a;

    /* JADX INFO: renamed from: b */
    public static int f151240b;

    /* JADX INFO: renamed from: a */
    public static float m171407a(int i, long j) {
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
    public static float m171408b() {
        return new Random().nextFloat() + 9.0f;
    }

    /* JADX INFO: renamed from: c */
    public static String m171409c(long j) {
        long j2 = j / Constants.ONE_MIN_IN_MILLIS;
        return String.format(Locale.getDefault(), "%02d:%02d", Long.valueOf(j2), Long.valueOf((j - TimeUnit.MINUTES.toMillis(j2)) / 1000));
    }

    /* JADX INFO: renamed from: d */
    public static float m171410d(int i, long j, boolean z) {
        if (z || f151240b % 4 == 0) {
            f151239a = m171407a(i, j);
            f151240b = 0;
        }
        f151240b++;
        return f151239a;
    }

    /* JADX INFO: renamed from: e */
    public static int m171411e(long j) {
        return (int) ((1.0d - ((j * 1.0d) / ((double) (CoreModule.f18264c.f20318J0.m156794v3() * 1000)))) * 100.0d);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m171412f() {
        if (TextUtils.isEmpty(m27.m156762u3()) || IntlCountryCodeController.m29114k()) {
            return false;
        }
        return CoreModule.m30933P().m143405a().mo34576qt();
    }

    /* JADX INFO: renamed from: g */
    public static String m171413g(Act act, boolean z) {
        if (z) {
            return "p_boost_end,boostagain";
        }
        if (CoreModule.m30933P().m143405a().mo34514he(act)) {
            return "p_suggest_users_home_view,e_boost_button,click";
        }
        if (act instanceof LikersAct) {
            return "p_navigation_see,boost";
        }
        if (CoreModule.m30933P().m143410g().mo36047Zn(act)) {
            return "p_wallet,e_wallet_boost_button,click";
        }
        boolean z2 = act instanceof FakeLikersAct;
        if (z2) {
            return "p_intl_plm,e_intl_plm_turbo_card,click";
        }
        if (z2) {
            return TextUtils.equals(((FakeLikersAct) act).m56140Y1(), "p_popup_see,default") ? "p_popup_see,boost" : "p_navigation_see,boost";
        }
        return "";
    }
}
