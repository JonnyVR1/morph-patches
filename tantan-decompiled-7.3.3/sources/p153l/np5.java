package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public final class np5 {
    /* JADX INFO: renamed from: a */
    public static boolean m164214a(CoreSuggested.UserInfo userInfo, User user) {
        if (user != null && NullChecker.m82486a(userInfo)) {
            qap.Companion companion = qap.INSTANCE;
            if ((companion.m175976n(userInfo, user) || companion.m175975m(userInfo)) && joa.m146386f4()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m164215b(Act act, CoreSuggested.UserInfo userInfo, User user, String str) {
        if (!m164214a(userInfo, user)) {
            return false;
        }
        if (!(act instanceof NewMainAct)) {
            CoreModule.m30933P().m143405a().mo34575qm(act, str, Privilege.premium_compliment, null);
            return true;
        }
        CoreModule.f18264c.f20405m0.m32034O5();
        CoreModule.f18264c.f20405m0.f20088I2.m137019l(pf60.m172085a(SwipeDirection.RIGHT, null));
        return true;
    }
}
