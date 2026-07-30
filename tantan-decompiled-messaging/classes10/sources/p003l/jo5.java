package p003l;

import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.j760;
import l.q8p;
import l.xma;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public final class jo5 {
    /* JADX INFO: renamed from: a */
    public static boolean m7436a(CoreSuggested.UserInfo userInfo, User user) {
        if (user != null && NullChecker.a(userInfo)) {
            q8p.a aVar = q8p.Companion;
            if ((aVar.n(userInfo, user) || aVar.m(userInfo)) && xma.e4()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m7437b(Act act, CoreSuggested.UserInfo userInfo, User user, String str) {
        if (!m7436a(userInfo, user)) {
            return false;
        }
        if (!(act instanceof NewMainAct)) {
            CoreModule.P().a().qm(act, str, Privilege.premium_compliment, (e30) null);
            return true;
        }
        CoreModule.c.m0.O5();
        CoreModule.c.m0.I2.onNext(j760.a(SwipeDirection.RIGHT, (Object) null));
        return true;
    }
}
