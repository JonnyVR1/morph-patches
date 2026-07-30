package p006l;

import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchPushUser;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.hdb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class fpb0 {

    /* JADX INFO: renamed from: a */
    public static lrb0 f12835a;

    /* JADX INFO: renamed from: b */
    public static d30 f12836b = new d30() { // from class: l.epb0
        public final void call() {
            fpb0.f12835a = null;
        }
    };

    /* JADX INFO: renamed from: b */
    public static void m15432b() {
        if (NullChecker.a(f12835a)) {
            f12835a.m18982Y();
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m15433c() {
        return NullChecker.a(f12835a) && !f12835a.m18988e0();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m15434d() {
        return NullChecker.a(f12835a) && f12835a.m18988e0();
    }

    /* JADX INFO: renamed from: e */
    public static void m15435e(Act act, boolean z, @Nullable OnlineMatchPushUser onlineMatchPushUser) {
        if (NullChecker.a(f12835a)) {
            f12835a.m18982Y();
        }
        if (act == null || act.isFinishing() || act.isDestroyed()) {
            return;
        }
        lrb0 lrb0Var = new lrb0(act, z, onlineMatchPushUser, f12836b);
        f12835a = lrb0Var;
        if (z) {
            lrb0Var.y(TantanException.Client.AccountService.GENERAL_BAD_REQUEST);
            f12835a.r(3);
        }
        f12835a.x(CorePopLevel.AUDIO_QUICK_NOTIFY_BROADCAST);
        hdb0.c().i(f12835a);
    }
}
