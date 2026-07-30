package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class rui0 extends cui0 {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(final sfh0.C20031a c20031a) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        String strM101829p5 = b240.m101829p5();
        if (TextUtils.isEmpty(strM101829p5)) {
            strM101829p5 = "p_home,superlike";
        }
        String str = strM101829p5;
        if (qj90.m176831c(userM116600p9, PurchaseType.TYPE_SUPERLIKE_PKG)) {
            final int iM105817d = bpe0.m105814f().m105817d(c20031a.f167704c.m140259d().f56859id);
            if (!spl0.m187374Z() || iM105817d <= 1) {
                C8927c.m54574F1(c20031a.f167703b.act(), str);
            } else {
                C8927c.m54577G1(c20031a.f167703b.act(), str, iM105817d, new a30() { // from class: l.qui0
                    @Override // p153l.a30
                    /* JADX INFO: renamed from: a */
                    public final void mo37058a(Object obj, Object obj2, Object obj3) {
                        c20031a.f167703b.m215670E1(iM105817d);
                    }
                });
            }
            c20031a.f167702a.m190786I2(c20031a.f167707f, "failExhaustSuperlike");
        } else {
            C8927c.m54595M1(c20031a.f167703b.act(), str, Privilege.vip_super_like, null, null, false, c20031a.f167704c.m140259d());
            c20031a.f167702a.m190786I2(c20031a.f167707f, "failLessVipSuperLike");
        }
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(sfh0.C20031a c20031a) {
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = CoreModule.f18264c.m32487o3().superLikeLimit;
        boolean z = c20031a.f167705d == SwipeDirection.UP;
        if (d79.m114685j0() && z && c20031a.f167702a.m190792O1(c20031a.f167704c.m140259d().f56859id)) {
            return false;
        }
        if (spl0.m187374Z()) {
            return z && (a5i0.m96178w0(counterSuperlikeAndUndoLimit.remainToday()) < bpe0.m105814f().m105817d(c20031a.f167704c.m140259d().f56859id) || a5i0.m96178w0(counterSuperlikeAndUndoLimit.remainToday()) == 0);
        }
        return z && a5i0.m96178w0(counterSuperlikeAndUndoLimit.remainToday()) == 0;
    }
}
