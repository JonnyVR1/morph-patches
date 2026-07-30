package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectAndPostStatusAct;
import com.p051p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class h3i {
    /* JADX INFO: renamed from: c */
    public static boolean m133485c(Act act) {
        return m133486d(act, "");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m133486d(final Act act, String str) {
        if (NullChecker.m82486a(FeedModule.f39704e.f138458H) && NullChecker.m82486a(FeedModule.f39704e.f138458H.m222761e()) && TEnum.equals(FeedModule.f39704e.f138458H.m222761e().status, "start")) {
            r1j0.m179420g("状态发布中...");
            return true;
        }
        if (mrb0.m159625C().isJailedOrRestrict()) {
            orb0.m168880I();
            return true;
        }
        if (!owi.m169565a()) {
            return false;
        }
        k3h.m148057P0(act, new x20() { // from class: l.f3i
            @Override // p153l.x20
            public final void call() {
                o1j0.m165649w(R$string.f39831U1);
            }
        }, false, new x20() { // from class: l.g3i
            @Override // p153l.x20
            public final void call() {
                h3i.m133487e(act);
            }
        }, l3h.f129875a);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static void m133487e(Act act) {
        if (m133485c(act)) {
            return;
        }
        if (cmg.m111169A()) {
            FeedSelectAndPostStatusAct.m66997u2(act);
        } else {
            FeedSelectStatusAct.m67001E2(act);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m133488f(Act act, String str) {
        if (m133485c(act)) {
            return;
        }
        if (cmg.m111169A()) {
            FeedSelectAndPostStatusAct.m66998v2(act, str);
        } else {
            FeedSelectStatusAct.m67002F2(act, str);
        }
    }
}
