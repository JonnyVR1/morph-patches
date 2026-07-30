package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4729a0;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7937z0;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import p149l.ah60;
import p149l.d30;
import p149l.e30;
import p149l.mkd0;
import p149l.n3b0;
import p149l.w9j;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.z0 */
/* JADX INFO: loaded from: classes11.dex */
public class C7937z0 extends AbstractC7871a {

    /* JADX INFO: renamed from: g */
    public boolean f22147g = false;

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m37823r(C7898j.a aVar) {
        aVar.f22095b.m37125A2().mo38822y();
        C4729a0.m31387j().f19526e.put(Boolean.FALSE);
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(final C7898j.a aVar) {
        C4729a0.m31387j().f19526e.put(Boolean.TRUE);
        C8764c.m53382C1(aVar.f22095b.act(), "p_special_card,e_special_card_swiped_right,swipe", Privilege.see_who_likes_me, new d30() { // from class: l.adh0
            @Override // p149l.d30
            public final void call() {
                C7937z0.m37823r(aVar);
            }
        });
        ah60.m96370E().filter(new w9j() { // from class: l.bdh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((PaymentResultWrapper) obj).purchaseType == PurchaseType.TYPE_GET_LIKERS);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.cdh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80368a.m37825t(aVar, (PaymentResultWrapper) obj);
            }
        }));
        zvf0.m220396r("e_special_card_swiped_right", "p_suggest_users_home_view");
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m37825t(C7898j.a aVar, PaymentResultWrapper paymentResultWrapper) {
        if (aVar.f22095b.act().m39812e6(TabName.Card)) {
            this.f22147g = true;
            aVar.f22095b.m37125A2().mo38801A(SwipeDirection.RIGHT);
        }
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        String strM31137q6 = CoreModule.f17545c.f19663m0.m31137q6();
        String str = C4729a0.m31387j().f19525d.get();
        if (m37511k(aVar) && !n3b0.m157742q() && str.equals(strM31137q6)) {
            C4729a0.m31387j().m31394l();
        }
        boolean z = m37511k(aVar) && str.equals(strM31137q6) && n3b0.m157742q() && !this.f22147g;
        this.f22147g = false;
        return z;
    }
}
