package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public final class jo5 {
    /* JADX INFO: renamed from: a */
    public static boolean m142415a(CoreSuggested.UserInfo userInfo, User user) {
        if (user != null && NullChecker.m81303a(userInfo)) {
            q8p.Companion companion = q8p.INSTANCE;
            if ((companion.m173439n(userInfo, user) || companion.m173438m(userInfo)) && xma.m210071e4()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m142416b(Act act, CoreSuggested.UserInfo userInfo, User user, String str) {
        if (!m142415a(userInfo, user)) {
            return false;
        }
        if (!(act instanceof NewMainAct)) {
            CoreModule.m29935P().m94651a().mo33572qm(act, str, Privilege.premium_compliment, null);
            return true;
        }
        CoreModule.f17545c.f19663m0.m31031O5();
        CoreModule.f17545c.f19663m0.f19346I2.m132487l(j760.m140076a(SwipeDirection.RIGHT, null));
        return true;
    }
}
