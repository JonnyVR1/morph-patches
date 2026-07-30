package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;

/* JADX INFO: loaded from: classes11.dex */
public class srh extends erh {
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m187614h(PurchaseType purchaseType, Act act, String str) {
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(frh.C17047a c17047a) {
        if (qj90.m176831c(CoreModule.f18264c.f20381e0.m116600p9(), PurchaseType.TYPE_SUPERLIKE_PKG)) {
            int iM105817d = bpe0.m105814f().m105817d(c17047a.f100422c.f56859id);
            if (!spl0.m187374Z() || iM105817d <= 1) {
                C8927c.m54574F1(c17047a.f100420a, "p_home,superlike");
            } else {
                C8927c.m54577G1(c17047a.f100420a, "p_home,superlike", iM105817d, new a30() { // from class: l.rrh
                    @Override // p153l.a30
                    /* JADX INFO: renamed from: a */
                    public final void mo37058a(Object obj, Object obj2, Object obj3) {
                        srh.m187614h((PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                });
            }
            c17047a.f100426g.mo44141k2(c17047a.f100425f, "failExhaustSuperlike");
        } else {
            C8927c.m54595M1(c17047a.f100420a, "p_home,superlike", Privilege.vip_super_like, null, null, false, c17047a.f100422c);
            c17047a.f100426g.mo44141k2(c17047a.f100425f, "failLessVipSuperLike");
        }
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(frh.C17047a c17047a) {
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = CoreModule.f18264c.m32487o3().superLikeLimit;
        boolean z = c17047a.f100423d == SwipeDirection.UP;
        if (spl0.m187374Z()) {
            return z && (a5i0.m96178w0(counterSuperlikeAndUndoLimit.remainToday()) < bpe0.m105814f().m105817d(c17047a.f100422c.f56859id) || a5i0.m96178w0(counterSuperlikeAndUndoLimit.remainToday()) == 0);
        }
        return z && a5i0.m96178w0(counterSuperlikeAndUndoLimit.remainToday()) == 0;
    }
}
