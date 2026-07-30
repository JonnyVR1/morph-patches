package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class rli0 extends cli0 {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(final k7h0.C17941a c17941a) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        String strM161035p5 = nt30.m161035p5();
        if (TextUtils.isEmpty(strM161035p5)) {
            strM161035p5 = "p_home,superlike";
        }
        String str = strM161035p5;
        if (mb90.m153867c(userM169527p9, PurchaseType.TYPE_SUPERLIKE_PKG)) {
            final int iM203037d = wge0.m203034f().m203037d(c17941a.f121582c.m141745d().f56011id);
            if (!ogl0.m164247Z() || iM203037d <= 1) {
                C8764c.m53391F1(c17941a.f121581b.act(), str);
            } else {
                C8764c.m53394G1(c17941a.f121581b.act(), str, iM203037d, new g30() { // from class: l.qli0
                    @Override // p149l.g30
                    /* JADX INFO: renamed from: a */
                    public final void mo36055a(Object obj, Object obj2, Object obj3) {
                        c17941a.f121581b.m135517E1(iM203037d);
                    }
                });
            }
            c17941a.f121580a.m110804I2(c17941a.f121585f, "failExhaustSuperlike");
        } else {
            C8764c.m53412M1(c17941a.f121581b.act(), str, Privilege.vip_super_like, null, null, false, c17941a.f121582c.m141745d());
            c17941a.f121580a.m110804I2(c17941a.f121585f, "failLessVipSuperLike");
        }
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(k7h0.C17941a c17941a) {
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = CoreModule.f17545c.m31484o3().superLikeLimit;
        boolean z = c17941a.f121583d == SwipeDirection.UP;
        if (u59.m191827f0() && z && c17941a.f121580a.m110810O1(c17941a.f121582c.m141745d().f56011id)) {
            return false;
        }
        if (ogl0.m164247Z()) {
            return z && (swh0.m186273w0(counterSuperlikeAndUndoLimit.remainToday()) < wge0.m203034f().m203037d(c17941a.f121582c.m141745d().f56011id) || swh0.m186273w0(counterSuperlikeAndUndoLimit.remainToday()) == 0);
        }
        return z && swh0.m186273w0(counterSuperlikeAndUndoLimit.remainToday()) == 0;
    }
}
