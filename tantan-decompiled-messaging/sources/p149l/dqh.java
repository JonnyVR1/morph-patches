package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;

/* JADX INFO: loaded from: classes11.dex */
public class dqh extends pph {
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m113065h(PurchaseType purchaseType, Act act, String str) {
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(qph.C19553a c19553a) {
        if (mb90.m153867c(CoreModule.f17545c.f19639e0.m169527p9(), PurchaseType.TYPE_SUPERLIKE_PKG)) {
            int iM203037d = wge0.m203034f().m203037d(c19553a.f155759c.f56011id);
            if (!ogl0.m164247Z() || iM203037d <= 1) {
                C8764c.m53391F1(c19553a.f155757a, "p_home,superlike");
            } else {
                C8764c.m53394G1(c19553a.f155757a, "p_home,superlike", iM203037d, new g30() { // from class: l.cqh
                    @Override // p149l.g30
                    /* JADX INFO: renamed from: a */
                    public final void mo36055a(Object obj, Object obj2, Object obj3) {
                        dqh.m113065h((PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                });
            }
            c19553a.f155763g.mo43130k2(c19553a.f155762f, "failExhaustSuperlike");
        } else {
            C8764c.m53412M1(c19553a.f155757a, "p_home,superlike", Privilege.vip_super_like, null, null, false, c19553a.f155759c);
            c19553a.f155763g.mo43130k2(c19553a.f155762f, "failLessVipSuperLike");
        }
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(qph.C19553a c19553a) {
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = CoreModule.f17545c.m31484o3().superLikeLimit;
        boolean z = c19553a.f155760d == SwipeDirection.UP;
        if (ogl0.m164247Z()) {
            return z && (swh0.m186273w0(counterSuperlikeAndUndoLimit.remainToday()) < wge0.m203034f().m203037d(c19553a.f155759c.f56011id) || swh0.m186273w0(counterSuperlikeAndUndoLimit.remainToday()) == 0);
        }
        return z && swh0.m186273w0(counterSuperlikeAndUndoLimit.remainToday()) == 0;
    }
}
