package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.d30;
import l.g30;
import l.mb90;
import l.ogl0;
import l.swh0;
import l.u59;
import l.wge0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rli0 extends cli0 {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(final k7h0.C0984a c0984a) {
        User userP9 = CoreModule.c.e0.p9();
        String strM19239p5 = nt30.m19239p5();
        if (TextUtils.isEmpty(strM19239p5)) {
            strM19239p5 = "p_home,superlike";
        }
        String str = strM19239p5;
        if (mb90.c(userP9, PurchaseType.TYPE_SUPERLIKE_PKG)) {
            final int iD = wge0.f().d(((DbObject) c0984a.f15443c.m17130d()).id);
            if (!ogl0.Z() || iD <= 1) {
                c.F1(c0984a.f15442b.act(), str);
            } else {
                c.G1(c0984a.f15442b.act(), str, iD, new g30() { // from class: l.qli0
                    /* JADX INFO: renamed from: a */
                    public final void m21086a(Object obj, Object obj2, Object obj3) {
                        c0984a.f15442b.m16409E1(iD);
                    }
                });
            }
            c0984a.f15441a.m13114I2(c0984a.f15446f, "failExhaustSuperlike");
        } else {
            c.M1(c0984a.f15442b.act(), str, Privilege.vip_super_like, (d30) null, (d30) null, false, c0984a.f15443c.m17130d());
            c0984a.f15441a.m13114I2(c0984a.f15446f, "failLessVipSuperLike");
        }
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(k7h0.C0984a c0984a) {
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = CoreModule.c.o3().superLikeLimit;
        boolean z = c0984a.f15444d == SwipeDirection.UP;
        if (u59.f0() && z && c0984a.f15441a.m13120O1(((DbObject) c0984a.f15443c.m17130d()).id)) {
            return false;
        }
        if (ogl0.Z()) {
            return z && (swh0.w0(counterSuperlikeAndUndoLimit.remainToday()) < wge0.f().d(((DbObject) c0984a.f15443c.m17130d()).id) || swh0.w0(counterSuperlikeAndUndoLimit.remainToday()) == 0);
        }
        return z && swh0.w0(counterSuperlikeAndUndoLimit.remainToday()) == 0;
    }
}
