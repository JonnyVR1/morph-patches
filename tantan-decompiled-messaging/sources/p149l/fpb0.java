package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchPushUser;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class fpb0 {

    /* JADX INFO: renamed from: a */
    public static lrb0 f98682a;

    /* JADX INFO: renamed from: b */
    public static d30 f98683b = new d30() { // from class: l.epb0
        @Override // p149l.d30
        public final void call() {
            fpb0.f98682a = null;
        }
    };

    /* JADX INFO: renamed from: b */
    public static void m122585b() {
        if (NullChecker.m81303a(f98682a)) {
            f98682a.m151187Y();
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m122586c() {
        return NullChecker.m81303a(f98682a) && !f98682a.m151193e0();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m122587d() {
        return NullChecker.m81303a(f98682a) && f98682a.m151193e0();
    }

    /* JADX INFO: renamed from: e */
    public static void m122588e(Act act, boolean z, @Nullable OnlineMatchPushUser onlineMatchPushUser) {
        if (NullChecker.m81303a(f98682a)) {
            f98682a.m151187Y();
        }
        if (act == null || act.isFinishing() || act.isDestroyed()) {
            return;
        }
        lrb0 lrb0Var = new lrb0(act, z, onlineMatchPushUser, f98683b);
        f98682a = lrb0Var;
        if (z) {
            lrb0Var.m96809y(TantanException.Client.AccountService.GENERAL_BAD_REQUEST);
            f98682a.m120964r(3);
        }
        f98682a.m96808x(CorePopLevel.AUDIO_QUICK_NOTIFY_BROADCAST);
        hdb0.m130575c().m130582i(f98682a);
    }
}
