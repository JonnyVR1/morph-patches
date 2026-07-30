package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7885e1;
import com.tantanapp.common.utils.NullChecker;
import p149l.a5m;
import p149l.d30;
import p149l.swh0;
import p149l.xma;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.e1 */
/* JADX INFO: loaded from: classes11.dex */
public class C7885e1 extends AbstractC7871a {
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m37605p(C7898j.a aVar) {
        aVar.f22094a.m161166U8(true);
        if (aVar.f22095b.m37341q2().isAdded()) {
            aVar.f22095b.m37125A2().mo38801A(SwipeDirection.UP);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m37606q(C7898j.a aVar) {
        aVar.f22094a.m161171V8(false);
        if (NullChecker.m81303a(aVar.f22095b.m37125A2().mo38809d()) && (aVar.f22095b.m37125A2().mo38809d() instanceof a5m)) {
            aVar.f22095b.m37125A2().mo38822y();
            aVar.f22094a.m161201c5();
        }
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(final C7898j.a aVar) {
        if (!aVar.f22094a.m161255n6()) {
            aVar.f22094a.m161171V8(true);
            swh0.m186180B1(aVar.f22095b.act(), PurchaseType.TYPE_GET_SEE_LETTER_INTL, new d30() { // from class: l.pdh0
                @Override // p149l.d30
                public final void call() {
                    C7885e1.m37605p(aVar);
                }
            }, new d30() { // from class: l.qdh0
                @Override // p149l.d30
                public final void call() {
                    C7885e1.m37606q(aVar);
                }
            });
        }
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        return aVar.f22097d == SwipeDirection.UP && aVar.f22094a.m161235j6(aVar.f22096c.m141746e().f19472id) && !aVar.f22094a.m161250m6() && !xma.m210041D3() && swh0.m186191G() && swh0.m186255p0().m186315i1();
    }
}
