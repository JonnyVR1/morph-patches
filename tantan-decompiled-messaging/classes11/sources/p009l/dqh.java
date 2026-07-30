package p009l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.tantanapp.common.data.DbObject;
import l.d30;
import l.g30;
import l.mb90;
import l.ogl0;
import l.swh0;
import l.wge0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dqh extends pph {
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m13439h(PurchaseType purchaseType, Act act, String str) {
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(qph.C1150a c1150a) {
        if (mb90.c(CoreModule.c.e0.p9(), PurchaseType.TYPE_SUPERLIKE_PKG)) {
            int iD = wge0.f().d(((DbObject) c1150a.f19427c).id);
            if (!ogl0.Z() || iD <= 1) {
                c.F1(c1150a.f19425a, "p_home,superlike");
            } else {
                c.G1(c1150a.f19425a, "p_home,superlike", iD, new g30() { // from class: l.cqh
                    /* JADX INFO: renamed from: a */
                    public final void m12762a(Object obj, Object obj2, Object obj3) {
                        dqh.m13439h((PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                });
            }
            c1150a.f19431g.mo7345k2(c1150a.f19430f, "failExhaustSuperlike");
        } else {
            c.M1(c1150a.f19425a, "p_home,superlike", Privilege.vip_super_like, (d30) null, (d30) null, false, c1150a.f19427c);
            c1150a.f19431g.mo7345k2(c1150a.f19430f, "failLessVipSuperLike");
        }
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(qph.C1150a c1150a) {
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = CoreModule.c.o3().superLikeLimit;
        boolean z = c1150a.f19428d == SwipeDirection.UP;
        if (ogl0.Z()) {
            return z && (swh0.w0(counterSuperlikeAndUndoLimit.remainToday()) < wge0.f().d(((DbObject) c1150a.f19427c).id) || swh0.w0(counterSuperlikeAndUndoLimit.remainToday()) == 0);
        }
        return z && swh0.w0(counterSuperlikeAndUndoLimit.remainToday()) == 0;
    }
}
