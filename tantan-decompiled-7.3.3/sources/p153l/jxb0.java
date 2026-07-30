package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchPushUser;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class jxb0 {

    /* JADX INFO: renamed from: a */
    public static pzb0 f123015a;

    /* JADX INFO: renamed from: b */
    public static x20 f123016b = new x20() { // from class: l.ixb0
        @Override // p153l.x20
        public final void call() {
            jxb0.f123015a = null;
        }
    };

    /* JADX INFO: renamed from: b */
    public static void m147335b() {
        if (NullChecker.m82486a(f123015a)) {
            f123015a.m174380Y();
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m147336c() {
        return NullChecker.m82486a(f123015a) && !f123015a.m174386e0();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m147337d() {
        return NullChecker.m82486a(f123015a) && f123015a.m174386e0();
    }

    /* JADX INFO: renamed from: e */
    public static void m147338e(Act act, boolean z, @Nullable OnlineMatchPushUser onlineMatchPushUser) {
        if (NullChecker.m82486a(f123015a)) {
            f123015a.m174380Y();
        }
        if (act == null || act.isFinishing() || act.isDestroyed()) {
            return;
        }
        pzb0 pzb0Var = new pzb0(act, z, onlineMatchPushUser, f123016b);
        f123015a = pzb0Var;
        if (z) {
            pzb0Var.m126746y(TantanException.Client.AccountService.GENERAL_BAD_REQUEST);
            f123015a.m146059r(3);
        }
        f123015a.m126745x(CorePopLevel.AUDIO_QUICK_NOTIFY_BROADCAST);
        llb0.m154703c().m154710i(f123015a);
    }
}
