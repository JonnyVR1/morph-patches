package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0101z0;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.a0;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.purchase.c;
import l.d30;
import l.e30;
import l.mkd0;
import l.n3b0;
import l.w9j;
import l.zvf0;
import p009l.ah60;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.z0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0101z0 extends AbstractC0035a {

    /* JADX INFO: renamed from: g */
    public boolean f925g = false;

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m1794r(C0062j.a aVar) {
        aVar.f873b.m1092A2().mo2818y();
        a0.j().e.put(Boolean.FALSE);
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(final C0062j.a aVar) {
        a0.j().e.put(Boolean.TRUE);
        c.C1(aVar.f873b.act(), "p_special_card,e_special_card_swiped_right,swipe", Privilege.see_who_likes_me, new d30() { // from class: l.adh0
            public final void call() {
                C0101z0.m1794r(aVar);
            }
        });
        ah60.m11408E().filter(new w9j() { // from class: l.bdh0
            public final Object call(Object obj) {
                return Boolean.valueOf(((PaymentResultWrapper) obj).purchaseType == PurchaseType.TYPE_GET_LIKERS);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.cdh0
            public final void call(Object obj) {
                this.f10544a.m1796t(aVar, (PaymentResultWrapper) obj);
            }
        }));
        zvf0.r("e_special_card_swiped_right", "p_suggest_users_home_view");
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m1796t(C0062j.a aVar, PaymentResultWrapper paymentResultWrapper) {
        if (aVar.f873b.act().m3888e6(TabName.Card)) {
            this.f925g = true;
            aVar.f873b.m1092A2().mo2797A(SwipeDirection.RIGHT);
        }
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        String strQ6 = CoreModule.c.m0.q6();
        String str = (String) a0.j().d.get();
        if (m1482k(aVar) && !n3b0.q() && str.equals(strQ6)) {
            a0.j().l();
        }
        boolean z = m1482k(aVar) && str.equals(strQ6) && n3b0.q() && !this.f925g;
        this.f925g = false;
        return z;
    }
}
