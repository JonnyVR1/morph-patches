package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4880a0;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8088z0;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import p153l.fp60;
import p153l.i4g0;
import p153l.psd0;
import p153l.qcj;
import p153l.rbb0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.z0 */
/* JADX INFO: loaded from: classes11.dex */
public class C8088z0 extends AbstractC8022a {

    /* JADX INFO: renamed from: g */
    public boolean f22889g = false;

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m38826r(C8049j.a aVar) {
        aVar.f22837b.m38128A2().mo39825y();
        C4880a0.m32390j().f20268e.put(Boolean.FALSE);
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(final C8049j.a aVar) {
        C4880a0.m32390j().f20268e.put(Boolean.TRUE);
        C8927c.m54565C1(aVar.f22837b.act(), "p_special_card,e_special_card_swiped_right,swipe", Privilege.see_who_likes_me, new x20() { // from class: l.ilh0
            @Override // p153l.x20
            public final void call() {
                C8088z0.m38826r(aVar);
            }
        });
        fp60.m126543E().filter(new qcj() { // from class: l.jlh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((PaymentResultWrapper) obj).purchaseType == PurchaseType.TYPE_GET_LIKERS);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.klh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127369a.m38828t(aVar, (PaymentResultWrapper) obj);
            }
        }));
        i4g0.m138520r("e_special_card_swiped_right", "p_suggest_users_home_view");
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m38828t(C8049j.a aVar, PaymentResultWrapper paymentResultWrapper) {
        if (aVar.f22837b.act().m40820i6(TabName.Card)) {
            this.f22889g = true;
            aVar.f22837b.m38128A2().mo39804A(SwipeDirection.RIGHT);
        }
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        String strM32140q6 = CoreModule.f18264c.f20405m0.m32140q6();
        String str = C4880a0.m32390j().f20267d.get();
        if (m38514k(aVar) && !rbb0.m180744q() && str.equals(strM32140q6)) {
            C4880a0.m32390j().m32397l();
        }
        boolean z = m38514k(aVar) && str.equals(strM32140q6) && rbb0.m180744q() && !this.f22889g;
        this.f22889g = false;
        return z;
    }
}
