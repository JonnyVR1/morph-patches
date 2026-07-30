package p009l;

import android.text.TextUtils;
import android.view.View;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e51;
import l.g30;
import l.mb90;
import l.swh0;
import l.u59;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ojp extends udp {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f18126a = false;

    /* JADX INFO: renamed from: u */
    public static void m19905u(boolean z) {
        f18126a = z;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(final j7h0.C0970a c0970a) {
        User userP9 = CoreModule.c.e0.p9();
        String strM19239p5 = nt30.m19239p5();
        if (TextUtils.isEmpty(strM19239p5)) {
            strM19239p5 = "p_intl_tribe_swipe_view,e_superlikeButton,click";
        }
        String str = strM19239p5;
        if (mb90.c(userP9, PurchaseType.TYPE_SUPERLIKE_PKG) || u59.a0()) {
            c.G1(c0970a.f14968b.act(), str, 1, new g30() { // from class: l.kjp
                /* JADX INFO: renamed from: a */
                public final void m17546a(Object obj, Object obj2, Object obj3) {
                    this.f15738a.m19909p(c0970a, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            });
            c0970a.f14967a.m15835x2(c0970a.f14972f, "failExhaustSuperlike");
        } else {
            c.M1(c0970a.f14968b.act(), str, Privilege.vip_super_like, (d30) null, (d30) null, false, c0970a.f14969c.m17130d());
            c0970a.f14967a.m15835x2(c0970a.f14972f, "failLessVipSuperLike");
        }
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: n */
    public final void m19907n(final j7h0.C0970a c0970a) {
        if (NullChecker.a(c0970a.f14968b)) {
            e51.F(c0970a.f14968b.act(), new Runnable() { // from class: l.ljp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16199a.m19910q(c0970a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void m19910q(final j7h0.C0970a c0970a) {
        if (IntlCountryCodeController.v()) {
            m19912s(c0970a);
            return;
        }
        if (NullChecker.a(c0970a.f14968b)) {
            if (!c0970a.f14968b.m20403e0().isAdded()) {
                e51.H(c0970a.f14968b.act(), new Runnable() { // from class: l.mjp
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f16979a.m19911r(c0970a);
                    }
                }, 300L);
                return;
            }
            View cardView = (NullChecker.a(c0970a.f14969c) && NullChecker.a(c0970a.f14969c.m17127a())) ? c0970a.f14969c.m17127a().getCardView() : null;
            pip pipVar = c0970a.f14968b;
            VFrame vFrame = pipVar.f18696o;
            if (cardView == null || vFrame == null) {
                m19912s(c0970a);
            } else {
                new nbp(pipVar.act(), vFrame).m18835i(cardView, new Runnable() { // from class: l.njp
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f17545a.m19912s(c0970a);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m19909p(j7h0.C0970a c0970a, PurchaseType purchaseType, Act act, String str) {
        m19907n(c0970a);
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void m19911r(j7h0.C0970a c0970a) {
        if (NullChecker.a(c0970a.f14968b) && c0970a.f14968b.m20403e0().isAdded()) {
            m19910q(c0970a);
        } else {
            m19912s(c0970a);
        }
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(j7h0.C0970a c0970a) {
        if (f18126a) {
            f18126a = false;
            return false;
        }
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = CoreModule.c.o3().superLikeLimit;
        boolean z = c0970a.f14970d == SwipeDirection.UP;
        return !(u59.f0() && z && c0970a.f14967a.m15789C1(((DbObject) c0970a.f14969c.m17130d()).id)) && z && swh0.w0(counterSuperlikeAndUndoLimit.remainToday()) == 0;
    }

    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final void m19912s(j7h0.C0970a c0970a) {
        if (NullChecker.a(c0970a.f14968b) && c0970a.f14968b.m20403e0().isAdded()) {
            cjp.m12633r(true);
            m19905u(true);
            c0970a.f14968b.m20414m0().mo2797A(SwipeDirection.UP);
        }
    }
}
